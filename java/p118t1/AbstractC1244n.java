package p118t1;

import android.text.TextUtils;
import java.util.concurrent.ArrayBlockingQueue;
import nfc.share.nfcshare.MainActivity;
import nfc.share.nfcshare.model.CardInfo;
import nfc.share.nfcshare.service.EmulationService;
import p017G0.C0176h;
import p043P0.RunnableC0402A;
import p051S0.C0469d;

/* renamed from: t1.n */
/* loaded from: classes.dex */
public abstract class AbstractC1244n {

    /* renamed from: b */
    public static C0176h f4848b;

    /* renamed from: d */
    public static MainActivity f4850d;

    /* renamed from: e */
    public static String f4851e;

    /* renamed from: f */
    public static EmulationService f4852f;

    /* renamed from: g */
    public static String f4853g;

    /* renamed from: h */
    public static CardInfo f4854h;

    /* renamed from: a */
    public static final C0469d f4847a = new C0469d();

    /* renamed from: c */
    public static final ArrayBlockingQueue f4849c = new ArrayBlockingQueue(100);

    /* renamed from: a */
    public static void m2911a(String... strArr) {
        for (String str : strArr) {
            MainActivity mainActivity = f4850d;
            if (mainActivity != null) {
                mainActivity.runOnUiThread(new RunnableC0402A(14, str));
            }
        }
    }

    /* renamed from: b */
    public static byte[] m2912b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i2 = 0;
        if (str != null) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = str.charAt(i3);
                if (!Character.isWhitespace((int) charAt) && !Character.isSpaceChar((int) charAt) && charAt != 65279 && charAt != 8234 && charAt != 0 && charAt != 12644 && charAt != 10240 && charAt != 6158) {
                    sb.append(charAt);
                }
            }
            str2 = sb.toString();
        } else if (str != null) {
            str2 = str.toString();
        }
        int length2 = str2.length();
        if ((length2 & 1) != 0) {
            str2 = "0" + ((Object) str2);
            length2 = str2.length();
        }
        byte[] bArr = new byte[length2 >> 1];
        int i4 = 0;
        while (i2 < length2) {
            int i5 = i2 + 1;
            int m2914d = (m2914d(str2.charAt(i2), i2) << 4) | m2914d(str2.charAt(i5), i5);
            i2 += 2;
            bArr[i4] = (byte) (m2914d & 255);
            i4++;
        }
        return bArr;
    }

    /* renamed from: c */
    public static String m2913c(byte[] bArr) {
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[bArr.length << 1];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            cArr[i2] = charArray[(b & 240) >>> 4];
            i2 += 2;
            cArr[i3] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: d */
    public static int m2914d(char c2, int i2) {
        int digit = Character.digit(c2, 16);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalStateException("Illegal hexadecimal character {" + c2 + "} at index {" + i2 + "}");
    }
}
