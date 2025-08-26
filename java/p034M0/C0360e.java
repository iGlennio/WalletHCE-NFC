package p034M0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.slf4j.ILoggerFactory;
import p010D1.AbstractC0104l;
import p026J1.C0239g;
import p026J1.C0242j;
import p027K.C0322u;
import p029K1.AbstractC0333b;
import p041O1.InterfaceC0397a;
import p047Q1.C0454a;
import p055U0.C0500n;
import p055U0.InterfaceC0501o;
import p075d1.AbstractC0756h;
import p075d1.AbstractC0759k;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1191a;
import p123v1.EnumC1288r;
import p126w1.AbstractC1302b;

/* renamed from: M0.e */
/* loaded from: classes.dex */
public class C0360e implements ILoggerFactory, InterfaceC0501o {

    /* renamed from: b */
    public static C0360e f911b;

    /* renamed from: c */
    public static C0360e f912c;

    /* renamed from: a */
    public final /* synthetic */ int f913a;

    public /* synthetic */ C0360e(int i2) {
        this.f913a = i2;
    }

    /* renamed from: b */
    public static final String m1005b(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f4440e;
        int length = bArr.length;
        int i7 = 0;
        while (i7 < length) {
            int i8 = (i7 + length) / 2;
            while (i8 > i6 && bArr[i8] != ((byte) 10)) {
                i8 += i6;
            }
            int i9 = i8 + 1;
            int i10 = 1;
            while (true) {
                i3 = i9 + i10;
                if (bArr[i3] == ((byte) 10)) {
                    break;
                }
                i10++;
            }
            int i11 = i3 - i9;
            int i12 = i2;
            boolean z3 = false;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (z3) {
                    i4 = 46;
                    z2 = false;
                } else {
                    byte b = bArr2[i12][i13];
                    byte[] bArr4 = AbstractC1302b.f5337a;
                    int i15 = b & 255;
                    z2 = z3;
                    i4 = i15;
                }
                byte b2 = bArr[i9 + i14];
                byte[] bArr5 = AbstractC1302b.f5337a;
                i5 = i4 - (b2 & 255);
                if (i5 != 0) {
                    break;
                }
                i14++;
                i13++;
                if (i14 == i11) {
                    break;
                }
                if (bArr2[i12].length != i13) {
                    z3 = z2;
                } else {
                    if (i12 == bArr2.length - 1) {
                        break;
                    }
                    i12++;
                    z3 = true;
                    i13 = -1;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i16 = i11 - i14;
                    int length2 = bArr2[i12].length - i13;
                    int length3 = bArr2.length;
                    for (int i17 = i12 + 1; i17 < length3; i17++) {
                        length2 += bArr2[i17].length;
                    }
                    if (length2 >= i16) {
                        if (length2 <= i16) {
                            Charset charset = StandardCharsets.UTF_8;
                            AbstractC1136c.m2636d(charset, "UTF_8");
                            return new String(bArr, i9, i11, charset);
                        }
                    }
                }
                i7 = i3 + 1;
                i6 = -1;
            }
            length = i8;
            i6 = -1;
        }
        return null;
    }

    /* renamed from: c */
    public static ArrayList m1006c(List list) {
        AbstractC1136c.m2637e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC1288r) obj) != EnumC1288r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0759k.m2057X(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC1288r) it.next()).f5267a);
        }
        return arrayList2;
    }

    /* renamed from: d */
    public static String m1007d(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    /* renamed from: e */
    public static byte[] m1008e(List list) {
        AbstractC1136c.m2637e(list, "protocols");
        C0239g c0239g = new C0239g();
        Iterator it = m1006c(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c0239g.m685z(str.length());
            c0239g.m660D(str);
        }
        return c0239g.m671l(c0239g.f715b);
    }

    /* renamed from: f */
    public static C0242j m1009f(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (AbstractC0333b.m956a(str.charAt(i3 + 1)) + (AbstractC0333b.m956a(str.charAt(i3)) << 4));
        }
        return new C0242j(bArr);
    }

    /* renamed from: g */
    public static C0242j m1010g(String str) {
        AbstractC1136c.m2637e(str, "$this$encodeUtf8");
        byte[] bytes = str.getBytes(AbstractC1191a.f4563a);
        AbstractC1136c.m2636d(bytes, "(this as java.lang.String).getBytes(charset)");
        C0242j c0242j = new C0242j(bytes);
        c0242j.f718b = str;
        return c0242j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1011j(p060X.C0534b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034M0.C0360e.m1011j(X.b, android.text.Editable, int, int, boolean):boolean");
    }

    /* renamed from: k */
    public static boolean m1012k() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: m */
    public static C0242j m1013m(byte[] bArr) {
        C0242j c0242j = C0242j.f716d;
        int length = bArr.length;
        AbstractC0104l.m401f(bArr.length, 0, length);
        return new C0242j(AbstractC0756h.m2051q0(bArr, length));
    }

    @Override // org.slf4j.ILoggerFactory
    /* renamed from: a */
    public InterfaceC0397a mo1014a(String str) {
        return C0454a.f1241a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p055U0.InterfaceC0501o m1015h(p065Z0.C0551a r10) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034M0.C0360e.m1015h(Z0.a):U0.o");
    }

    /* renamed from: i */
    public Signature[] mo1016i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* renamed from: l */
    public boolean mo1017l(CharSequence charSequence) {
        return false;
    }

    @Override // p055U0.InterfaceC0501o
    /* renamed from: n */
    public Object mo178n() {
        switch (this.f913a) {
            case 11:
                return new TreeSet();
            case 12:
                return new LinkedHashSet();
            case 13:
                return new ArrayDeque();
            case 14:
                return new ArrayList();
            case 15:
                return new ConcurrentSkipListMap();
            case 16:
                return new ConcurrentHashMap();
            case 17:
                return new TreeMap();
            case 18:
                return new LinkedHashMap();
            default:
                return new C0500n(true);
        }
    }

    public String toString() {
        switch (this.f913a) {
            case 20:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0360e(int i2, Object obj) {
        this.f913a = i2;
    }

    public C0360e(View view) {
        this.f913a = 6;
        if (Build.VERSION.SDK_INT >= 30) {
            new C0322u(5, view);
        } else {
            new C0360e(5, view);
        }
    }
}
