package p007C1;

import p026J1.C0242j;
import p034M0.C0360e;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1199i;
import p126w1.AbstractC1302b;

/* renamed from: C1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0066f {

    /* renamed from: a */
    public static final C0242j f171a;

    /* renamed from: b */
    public static final String[] f172b;

    /* renamed from: c */
    public static final String[] f173c;

    /* renamed from: d */
    public static final String[] f174d;

    static {
        C0242j c0242j = C0242j.f716d;
        f171a = C0360e.m1010g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f172b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f173c = new String[64];
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            AbstractC1136c.m2636d(binaryString, "Integer.toBinaryString(it)");
            String replace = AbstractC1302b.m3000i("%8s", binaryString).replace(' ', '0');
            AbstractC1136c.m2636d(replace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i2] = replace;
        }
        f174d = strArr;
        String[] strArr2 = f173c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = strArr2[i3] + ((Object) "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f173c;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + "|" + strArr3[i5];
            strArr3[i7 | 8] = strArr3[i6] + "|" + strArr3[i5] + "|PADDED";
        }
        int length = f173c.length;
        for (int i8 = 0; i8 < length; i8++) {
            String[] strArr4 = f173c;
            if (strArr4[i8] == null) {
                strArr4[i8] = f174d[i8];
            }
        }
    }

    /* renamed from: a */
    public static String m255a(boolean z2, int i2, int i3, int i4, int i5) {
        String str;
        String str2;
        String[] strArr = f172b;
        String m3000i = i4 < strArr.length ? strArr[i4] : AbstractC1302b.m3000i("0x%02x", Integer.valueOf(i4));
        if (i5 == 0) {
            str = "";
        } else {
            String[] strArr2 = f174d;
            if (i4 != 2 && i4 != 3) {
                if (i4 == 4 || i4 == 6) {
                    str = i5 == 1 ? "ACK" : strArr2[i5];
                } else if (i4 != 7 && i4 != 8) {
                    String[] strArr3 = f173c;
                    if (i5 < strArr3.length) {
                        str2 = strArr3[i5];
                        AbstractC1136c.m2634b(str2);
                    } else {
                        str2 = strArr2[i5];
                    }
                    str = (i4 != 5 || (i5 & 4) == 0) ? (i4 != 0 || (i5 & 32) == 0) ? str2 : AbstractC1199i.m2757C0(str2, "PRIORITY", "COMPRESSED") : AbstractC1199i.m2757C0(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i5];
        }
        return AbstractC1302b.m3000i("%s 0x%08x %5d %-13s %s", z2 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), m3000i, str);
    }
}
