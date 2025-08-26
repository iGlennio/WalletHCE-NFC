package p123v1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p026J1.C0239g;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1199i;
import p126w1.AbstractC1302b;

/* renamed from: v1.b */
/* loaded from: classes.dex */
public final class C1272b {

    /* renamed from: a */
    public static final C1272b f5118a = new C1272b();

    /* renamed from: b */
    public static final C1272b f5119b = new C1272b();

    /* renamed from: c */
    public static final C1272b f5120c = new C1272b();

    /* renamed from: a */
    public static final C1277g m2953a(C1272b c1272b, String str) {
        C1277g c1277g = new C1277g(str);
        C1277g.f5139c.put(str, c1277g);
        return c1277g;
    }

    /* renamed from: b */
    public static String m2954b(String str, int i2, int i3, String str2, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z2 = (i4 & 8) == 0;
        boolean z3 = (i4 & 16) == 0;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = (i4 & 64) == 0;
        AbstractC1136c.m2637e(str, "$this$canonicalize");
        int i6 = i5;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 32;
            int i8 = 128;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z5) || AbstractC1199i.m2764p0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z2 || (z3 && !m2956e(str, i6, length)))) || (codePointAt == 43 && z4)))) {
                C0239g c0239g = new C0239g();
                c0239g.m661E(str, i5, i6);
                C0239g c0239g2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z2 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z4) {
                            c0239g.m660D(z2 ? "+" : "%2B");
                        } else if (codePointAt2 < i7 || codePointAt2 == 127 || ((codePointAt2 >= i8 && !z5) || AbstractC1199i.m2764p0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z2 || (z3 && !m2956e(str, i6, length)))))) {
                            if (c0239g2 == null) {
                                c0239g2 = new C0239g();
                            }
                            c0239g2.m662F(codePointAt2);
                            while (!c0239g2.m666g()) {
                                byte m670k = c0239g2.m670k();
                                c0239g.m685z(37);
                                char[] cArr = C1283m.f5190j;
                                c0239g.m685z(cArr[((m670k & 255) >> 4) & 15]);
                                c0239g.m685z(cArr[m670k & 15]);
                            }
                        } else {
                            c0239g.m662F(codePointAt2);
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 32;
                    i8 = 128;
                }
                return c0239g.m677r();
            }
            i6 += Character.charCount(codePointAt);
        }
        String substring = str.substring(i5, length);
        AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static int m2955c(String str) {
        AbstractC1136c.m2637e(str, "scheme");
        int hashCode = str.hashCode();
        return hashCode != 3213448 ? (hashCode == 99617003 && str.equals("https")) ? 443 : -1 : str.equals("http") ? 80 : -1;
    }

    /* renamed from: e */
    public static boolean m2956e(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && AbstractC1302b.m3009r(str.charAt(i2 + 1)) != -1 && AbstractC1302b.m3009r(str.charAt(i4)) != -1;
    }

    /* renamed from: f */
    public static String m2957f(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z2 = (i4 & 4) == 0;
        AbstractC1136c.m2637e(str, "$this$percentDecode");
        int i6 = i2;
        while (i6 < i3) {
            char charAt = str.charAt(i6);
            if (charAt == '%' || (charAt == '+' && z2)) {
                C0239g c0239g = new C0239g();
                c0239g.m661E(str, i2, i6);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z2) {
                            c0239g.m685z(32);
                            i6++;
                        }
                        c0239g.m662F(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        int m3009r = AbstractC1302b.m3009r(str.charAt(i6 + 1));
                        int m3009r2 = AbstractC1302b.m3009r(str.charAt(i5));
                        if (m3009r != -1 && m3009r2 != -1) {
                            c0239g.m685z((m3009r << 4) + m3009r2);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        c0239g.m662F(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return c0239g.m677r();
            }
            i6++;
        }
        String substring = str.substring(i2, i3);
        AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: g */
    public static ArrayList m2958g(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int m2769u0 = AbstractC1199i.m2769u0(str, '&', i2, 4);
            if (m2769u0 == -1) {
                m2769u0 = str.length();
            }
            int m2769u02 = AbstractC1199i.m2769u0(str, '=', i2, 4);
            if (m2769u02 == -1 || m2769u02 > m2769u0) {
                String substring = str.substring(i2, m2769u0);
                AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i2, m2769u02);
                AbstractC1136c.m2636d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring2);
                String substring3 = str.substring(m2769u02 + 1, m2769u0);
                AbstractC1136c.m2636d(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring3);
            }
            i2 = m2769u0 + 1;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized C1277g m2959d(String str) {
        C1277g c1277g;
        String str2;
        try {
            AbstractC1136c.m2637e(str, "javaName");
            LinkedHashMap linkedHashMap = C1277g.f5139c;
            c1277g = (C1277g) linkedHashMap.get(str);
            if (c1277g == null) {
                if (AbstractC1199i.m2760F0(str, "TLS_", false)) {
                    String substring = str.substring(4);
                    AbstractC1136c.m2636d(substring, "(this as java.lang.String).substring(startIndex)");
                    str2 = "SSL_".concat(substring);
                } else if (AbstractC1199i.m2760F0(str, "SSL_", false)) {
                    String substring2 = str.substring(4);
                    AbstractC1136c.m2636d(substring2, "(this as java.lang.String).substring(startIndex)");
                    str2 = "TLS_".concat(substring2);
                } else {
                    str2 = str;
                }
                c1277g = (C1277g) linkedHashMap.get(str2);
                if (c1277g == null) {
                    c1277g = new C1277g(str);
                }
                linkedHashMap.put(str, c1277g);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1277g;
    }
}
