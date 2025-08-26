package p112r1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p002B.C0019i;
import p010D1.AbstractC0104l;
import p047Q1.AbstractC0458e;
import p075d1.AbstractC0759k;
import p075d1.C0749a;
import p095l1.AbstractC1136c;
import p103o1.C1165b;
import p103o1.C1166c;
import p109q1.C1186c;

/* renamed from: r1.i */
/* loaded from: classes.dex */
public abstract class AbstractC1199i extends AbstractC1198h {
    /* renamed from: A0 */
    public static final boolean m2755A0(String str, int i2, CharSequence charSequence, int i3, int i4, boolean z2) {
        AbstractC1136c.m2637e(str, "<this>");
        AbstractC1136c.m2637e(charSequence, "other");
        if (i3 >= 0 && i2 >= 0 && i2 <= str.length() - i4 && i3 <= charSequence.length() - i4) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (AbstractC0458e.m1203u(str.charAt(i2 + i5), charSequence.charAt(i3 + i5), z2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public static String m2756B0(String str, String str2) {
        if (!m2760F0(str, str2, false)) {
            return str;
        }
        String substring = str.substring(str2.length());
        AbstractC1136c.m2636d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: C0 */
    public static String m2757C0(String str, String str2, String str3) {
        AbstractC1136c.m2637e(str, "<this>");
        int m2768t0 = m2768t0(str, str2, 0, false);
        if (m2768t0 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, m2768t0);
            sb.append(str3);
            i3 = m2768t0 + length;
            if (m2768t0 >= str.length()) {
                break;
            }
            m2768t0 = m2768t0(str, str2, m2768t0 + i2, false);
        } while (m2768t0 > 0);
        sb.append((CharSequence) str, i3, str.length());
        String sb2 = sb.toString();
        AbstractC1136c.m2636d(sb2, "stringBuilder.append(this, i, length).toString()");
        return sb2;
    }

    /* renamed from: D0 */
    public static List m2758D0(String str, char[] cArr) {
        AbstractC1136c.m2637e(str, "<this>");
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int m2768t0 = m2768t0(str, valueOf, 0, false);
            if (m2768t0 == -1) {
                return AbstractC0104l.m391F(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i2 = 0;
            do {
                arrayList.add(str.subSequence(i2, m2768t0).toString());
                i2 = valueOf.length() + m2768t0;
                m2768t0 = m2768t0(str, valueOf, i2, false);
            } while (m2768t0 != -1);
            arrayList.add(str.subSequence(i2, str.length()).toString());
            return arrayList;
        }
        C1186c c1186c = new C1186c(new C0019i(str, new C0749a(1, cArr)));
        ArrayList arrayList2 = new ArrayList(AbstractC0759k.m2057X(c1186c));
        Iterator it = c1186c.iterator();
        while (true) {
            C1192b c1192b = (C1192b) it;
            if (!c1192b.hasNext()) {
                return arrayList2;
            }
            C1166c c1166c = (C1166c) c1192b.next();
            AbstractC1136c.m2637e(c1166c, "range");
            arrayList2.add(str.subSequence(c1166c.f4432a, c1166c.f4433b + 1).toString());
        }
    }

    /* renamed from: E0 */
    public static boolean m2759E0(String str, String str2, int i2, boolean z2) {
        AbstractC1136c.m2637e(str, "<this>");
        return !z2 ? str.startsWith(str2, i2) : m2774z0(i2, 0, str2.length(), str, str2, z2);
    }

    /* renamed from: F0 */
    public static boolean m2760F0(String str, String str2, boolean z2) {
        AbstractC1136c.m2637e(str, "<this>");
        AbstractC1136c.m2637e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : m2774z0(0, 0, str2.length(), str, str2, z2);
    }

    /* renamed from: G0 */
    public static String m2761G0(String str) {
        AbstractC1136c.m2637e(str, "<this>");
        AbstractC1136c.m2637e(str, "missingDelimiterValue");
        int m2773y0 = m2773y0(str, '.', 0, 6);
        if (m2773y0 == -1) {
            return str;
        }
        String substring = str.substring(m2773y0 + 1, str.length());
        AbstractC1136c.m2636d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: H0 */
    public static Integer m2762H0(String str) {
        boolean z2;
        int i2;
        int i3;
        AbstractC0458e.m1193k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (AbstractC1136c.m2638f(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z2 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z2 = false;
            }
        } else {
            z2 = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / 10))) || (i3 = i4 * 10) < i5 + digit) {
                return null;
            }
            i4 = i3 - digit;
            i2++;
        }
        return z2 ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    /* renamed from: I0 */
    public static CharSequence m2763I0(String str) {
        AbstractC1136c.m2637e(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            char charAt = str.charAt(!z2 ? i2 : length);
            boolean z3 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }

    /* renamed from: p0 */
    public static boolean m2764p0(CharSequence charSequence, char c2) {
        AbstractC1136c.m2637e(charSequence, "<this>");
        return m2769u0(charSequence, c2, 0, 2) >= 0;
    }

    /* renamed from: q0 */
    public static boolean m2765q0(CharSequence charSequence, String str) {
        AbstractC1136c.m2637e(charSequence, "<this>");
        return m2770v0(charSequence, str, 0, 2) >= 0;
    }

    /* renamed from: r0 */
    public static boolean m2766r0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    /* renamed from: s0 */
    public static final int m2767s0(CharSequence charSequence) {
        AbstractC1136c.m2637e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: t0 */
    public static final int m2768t0(CharSequence charSequence, String str, int i2, boolean z2) {
        AbstractC1136c.m2637e(charSequence, "<this>");
        AbstractC1136c.m2637e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C1166c c1166c = new C1166c(i2, length, 1);
        boolean z3 = charSequence instanceof String;
        int i3 = c1166c.f4433b;
        if (!z3) {
            boolean z4 = z2;
            if (i2 > i3) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z5 = z4;
                z4 = z5;
                if (m2755A0(str, 0, charSequence2, i2, str.length(), z5)) {
                    return i2;
                }
                if (i2 == i3) {
                    return -1;
                }
                i2++;
                charSequence = charSequence2;
            }
        } else {
            if (i2 > i3) {
                return -1;
            }
            int i4 = i2;
            while (true) {
                String str2 = str;
                boolean z6 = z2;
                if (m2774z0(0, i4, str.length(), str2, (String) charSequence, z6)) {
                    return i4;
                }
                if (i4 == i3) {
                    return -1;
                }
                i4++;
                str = str2;
                z2 = z6;
            }
        }
    }

    /* renamed from: u0 */
    public static int m2769u0(CharSequence charSequence, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        AbstractC1136c.m2637e(charSequence, "<this>");
        return !(charSequence instanceof String) ? m2771w0(charSequence, new char[]{c2}, i2, false) : ((String) charSequence).indexOf(c2, i2);
    }

    /* renamed from: v0 */
    public static /* synthetic */ int m2770v0(CharSequence charSequence, String str, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m2768t0(charSequence, str, i2, false);
    }

    /* renamed from: w0 */
    public static final int m2771w0(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        int i3;
        AbstractC1136c.m2637e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i2);
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = new C1166c(i2, m2767s0(charSequence), 1).f4433b;
        boolean z3 = i2 <= i4;
        if (!z3) {
            i2 = i4;
        }
        while (z3) {
            if (i2 != i4) {
                i3 = i2 + 1;
            } else {
                if (!z3) {
                    throw new NoSuchElementException();
                }
                i3 = i2;
                z3 = false;
            }
            char charAt = charSequence.charAt(i2);
            for (char c2 : cArr) {
                if (AbstractC0458e.m1203u(c2, charAt, z2)) {
                    return i2;
                }
            }
            i2 = i3;
        }
        return -1;
    }

    /* renamed from: x0 */
    public static final boolean m2772x0(String str) {
        AbstractC1136c.m2637e(str, "<this>");
        if (str.length() != 0) {
            Iterable c1166c = new C1166c(0, str.length() - 1, 1);
            if (!(c1166c instanceof Collection) || !((Collection) c1166c).isEmpty()) {
                Iterator it = c1166c.iterator();
                while (((C1165b) it).f4437c) {
                    char charAt = str.charAt(((C1165b) it).m2689a());
                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: y0 */
    public static int m2773y0(String str, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = m2767s0(str);
        }
        AbstractC1136c.m2637e(str, "<this>");
        return str.lastIndexOf(c2, i2);
    }

    /* renamed from: z0 */
    public static final boolean m2774z0(int i2, int i3, int i4, String str, String str2, boolean z2) {
        AbstractC1136c.m2637e(str, "<this>");
        AbstractC1136c.m2637e(str2, "other");
        return !z2 ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z2, i2, str2, i3, i4);
    }
}
