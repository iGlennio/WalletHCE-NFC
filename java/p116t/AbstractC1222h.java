package p116t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p113s.AbstractC1208i;
import p113s.C1202c;
import p113s.C1203d;
import p113s.C1204e;
import p113s.C1207h;
import p121v.C1256f;

/* renamed from: t.h */
/* loaded from: classes.dex */
public abstract class AbstractC1222h {

    /* renamed from: a */
    public static final C1216b f4800a = new C1216b();

    /* renamed from: a */
    public static boolean m2877a(C1203d c1203d) {
        int[] iArr = c1203d.f4658p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        C1203d c1203d2 = c1203d.f4620T;
        C1204e c1204e = c1203d2 != null ? (C1204e) c1203d2 : null;
        if (c1204e != null) {
            int i4 = c1204e.f4658p0[0];
        }
        if (c1204e != null) {
            int i5 = c1204e.f4658p0[1];
        }
        boolean z2 = i2 == 1 || c1203d.mo2775A() || i2 == 2 || (i2 == 3 && c1203d.f4660r == 0 && c1203d.f4623W == 0.0f && c1203d.m2825t(0)) || (i2 == 3 && c1203d.f4660r == 1 && c1203d.m2826u(0, c1203d.m2822q()));
        boolean z3 = i3 == 1 || c1203d.mo2776B() || i3 == 2 || (i3 == 3 && c1203d.f4661s == 0 && c1203d.f4623W == 0.0f && c1203d.m2825t(1)) || (i3 == 3 && c1203d.f4661s == 1 && c1203d.m2826u(1, c1203d.m2818k()));
        return (c1203d.f4623W > 0.0f && (z2 || z3)) || (z2 && z3);
    }

    /* renamed from: b */
    public static C1228n m2878b(C1203d c1203d, int i2, ArrayList arrayList, C1228n c1228n) {
        int i3;
        int i4 = i2 == 0 ? c1203d.f4654n0 : c1203d.f4656o0;
        if (i4 != -1 && (c1228n == null || i4 != c1228n.f4808b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C1228n c1228n2 = (C1228n) arrayList.get(i5);
                if (c1228n2.f4808b == i4) {
                    if (c1228n != null) {
                        c1228n.m2895c(i2, c1228n2);
                        arrayList.remove(c1228n);
                    }
                    c1228n = c1228n2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return c1228n;
        }
        if (c1228n == null) {
            if (c1203d instanceof AbstractC1208i) {
                AbstractC1208i abstractC1208i = (AbstractC1208i) c1203d;
                int i6 = 0;
                while (true) {
                    if (i6 >= abstractC1208i.f4752r0) {
                        i3 = -1;
                        break;
                    }
                    C1203d c1203d2 = abstractC1208i.f4751q0[i6];
                    if ((i2 == 0 && (i3 = c1203d2.f4654n0) != -1) || (i2 == 1 && (i3 = c1203d2.f4656o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        C1228n c1228n3 = (C1228n) arrayList.get(i7);
                        if (c1228n3.f4808b == i3) {
                            c1228n = c1228n3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (c1228n == null) {
                c1228n = new C1228n();
                c1228n.f4807a = new ArrayList();
                c1228n.f4810d = null;
                c1228n.f4811e = -1;
                int i8 = C1228n.f4806f;
                C1228n.f4806f = i8 + 1;
                c1228n.f4808b = i8;
                c1228n.f4809c = i2;
            }
            arrayList.add(c1228n);
        }
        ArrayList arrayList2 = c1228n.f4807a;
        if (arrayList2.contains(c1203d)) {
            return c1228n;
        }
        arrayList2.add(c1203d);
        if (c1203d instanceof C1207h) {
            C1207h c1207h = (C1207h) c1203d;
            c1207h.f4748t0.m2783c(c1207h.f4749u0 == 0 ? 1 : 0, arrayList, c1228n);
        }
        int i9 = c1228n.f4808b;
        if (i2 == 0) {
            c1203d.f4654n0 = i9;
            c1203d.f4609I.m2783c(i2, arrayList, c1228n);
            c1203d.f4611K.m2783c(i2, arrayList, c1228n);
        } else {
            c1203d.f4656o0 = i9;
            c1203d.f4610J.m2783c(i2, arrayList, c1228n);
            c1203d.f4613M.m2783c(i2, arrayList, c1228n);
            c1203d.f4612L.m2783c(i2, arrayList, c1228n);
        }
        c1203d.f4616P.m2783c(i2, arrayList, c1228n);
        return c1228n;
    }

    /* renamed from: c */
    public static void m2879c(int i2, C1203d c1203d, C1256f c1256f, boolean z2) {
        C1202c c1202c;
        C1202c c1202c2;
        char c2;
        C1202c c1202c3;
        C1202c c1202c4;
        if (c1203d.f4651m) {
            return;
        }
        if (!(c1203d instanceof C1204e) && c1203d.m2831z() && m2877a(c1203d)) {
            C1204e.m2832V(c1203d, c1256f, new C1216b());
        }
        C1202c mo2816i = c1203d.mo2816i(2);
        C1202c mo2816i2 = c1203d.mo2816i(4);
        int m2784d = mo2816i.m2784d();
        int m2784d2 = mo2816i2.m2784d();
        HashSet hashSet = mo2816i.f4592a;
        if (hashSet != null && mo2816i.f4594c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1202c c1202c5 = (C1202c) it.next();
                C1203d c1203d2 = c1202c5.f4595d;
                int i3 = i2 + 1;
                boolean m2877a = m2877a(c1203d2);
                if (c1203d2.m2831z() && m2877a) {
                    c2 = 0;
                    C1204e.m2832V(c1203d2, c1256f, new C1216b());
                } else {
                    c2 = 0;
                }
                C1202c c1202c6 = c1203d2.f4609I;
                C1202c c1202c7 = c1203d2.f4611K;
                char c3 = ((c1202c5 == c1202c6 && (c1202c4 = c1202c7.f4597f) != null && c1202c4.f4594c) || (c1202c5 == c1202c7 && (c1202c3 = c1202c6.f4597f) != null && c1202c3.f4594c)) ? (char) 1 : c2;
                int i4 = c1203d2.f4658p0[c2];
                if (i4 != 3 || m2877a) {
                    if (!c1203d2.m2831z()) {
                        if (c1202c5 == c1202c6 && c1202c7.f4597f == null) {
                            int m2785e = c1202c6.m2785e() + m2784d;
                            c1203d2.m2802J(m2785e, c1203d2.m2822q() + m2785e);
                            m2879c(i3, c1203d2, c1256f, z2);
                        } else if (c1202c5 == c1202c7 && c1202c6.f4597f == null) {
                            int m2785e2 = m2784d - c1202c7.m2785e();
                            c1203d2.m2802J(m2785e2 - c1203d2.m2822q(), m2785e2);
                            m2879c(i3, c1203d2, c1256f, z2);
                        } else if (c3 != 0 && !c1203d2.m2829x()) {
                            m2880d(i3, c1203d2, c1256f, z2);
                        }
                    }
                } else if (i4 == 3 && c1203d2.f4664v >= 0 && c1203d2.f4663u >= 0 && (c1203d2.f4640g0 == 8 || (c1203d2.f4660r == 0 && c1203d2.f4623W == 0.0f))) {
                    if (!c1203d2.m2829x() && !c1203d2.f4606F && c3 != 0 && !c1203d2.m2829x()) {
                        m2881e(i3, c1203d, c1256f, c1203d2, z2);
                    }
                }
            }
        }
        if (c1203d instanceof C1207h) {
            return;
        }
        HashSet hashSet2 = mo2816i2.f4592a;
        if (hashSet2 != null && mo2816i2.f4594c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1202c c1202c8 = (C1202c) it2.next();
                C1203d c1203d3 = c1202c8.f4595d;
                int i5 = i2 + 1;
                boolean m2877a2 = m2877a(c1203d3);
                if (c1203d3.m2831z() && m2877a2) {
                    C1204e.m2832V(c1203d3, c1256f, new C1216b());
                }
                C1202c c1202c9 = c1203d3.f4609I;
                C1202c c1202c10 = c1203d3.f4611K;
                boolean z3 = (c1202c8 == c1202c9 && (c1202c2 = c1202c10.f4597f) != null && c1202c2.f4594c) || (c1202c8 == c1202c10 && (c1202c = c1202c9.f4597f) != null && c1202c.f4594c);
                int i6 = c1203d3.f4658p0[0];
                if (i6 != 3 || m2877a2) {
                    if (!c1203d3.m2831z()) {
                        if (c1202c8 == c1202c9 && c1202c10.f4597f == null) {
                            int m2785e3 = c1202c9.m2785e() + m2784d2;
                            c1203d3.m2802J(m2785e3, c1203d3.m2822q() + m2785e3);
                            m2879c(i5, c1203d3, c1256f, z2);
                        } else if (c1202c8 == c1202c10 && c1202c9.f4597f == null) {
                            int m2785e4 = m2784d2 - c1202c10.m2785e();
                            c1203d3.m2802J(m2785e4 - c1203d3.m2822q(), m2785e4);
                            m2879c(i5, c1203d3, c1256f, z2);
                        } else if (z3 && !c1203d3.m2829x()) {
                            m2880d(i5, c1203d3, c1256f, z2);
                        }
                    }
                } else if (i6 == 3 && c1203d3.f4664v >= 0 && c1203d3.f4663u >= 0) {
                    if (c1203d3.f4640g0 == 8 || (c1203d3.f4660r == 0 && c1203d3.f4623W == 0.0f)) {
                        if (!c1203d3.m2829x() && !c1203d3.f4606F && z3 && !c1203d3.m2829x()) {
                            m2881e(i5, c1203d, c1256f, c1203d3, z2);
                        }
                    }
                }
            }
        }
        c1203d.f4651m = true;
    }

    /* renamed from: d */
    public static void m2880d(int i2, C1203d c1203d, C1256f c1256f, boolean z2) {
        float f = c1203d.f4634d0;
        C1202c c1202c = c1203d.f4609I;
        int m2784d = c1202c.f4597f.m2784d();
        C1202c c1202c2 = c1203d.f4611K;
        int m2784d2 = c1202c2.f4597f.m2784d();
        int m2785e = c1202c.m2785e() + m2784d;
        int m2785e2 = m2784d2 - c1202c2.m2785e();
        if (m2784d == m2784d2) {
            f = 0.5f;
        } else {
            m2784d = m2785e;
            m2784d2 = m2785e2;
        }
        int m2822q = c1203d.m2822q();
        int i3 = (m2784d2 - m2784d) - m2822q;
        if (m2784d > m2784d2) {
            i3 = (m2784d - m2784d2) - m2822q;
        }
        int i4 = ((int) (i3 > 0 ? (f * i3) + 0.5f : f * i3)) + m2784d;
        int i5 = i4 + m2822q;
        if (m2784d > m2784d2) {
            i5 = i4 - m2822q;
        }
        c1203d.m2802J(i4, i5);
        m2879c(i2 + 1, c1203d, c1256f, z2);
    }

    /* renamed from: e */
    public static void m2881e(int i2, C1203d c1203d, C1256f c1256f, C1203d c1203d2, boolean z2) {
        float f = c1203d2.f4634d0;
        C1202c c1202c = c1203d2.f4609I;
        int m2785e = c1202c.m2785e() + c1202c.f4597f.m2784d();
        C1202c c1202c2 = c1203d2.f4611K;
        int m2784d = c1202c2.f4597f.m2784d() - c1202c2.m2785e();
        if (m2784d >= m2785e) {
            int m2822q = c1203d2.m2822q();
            if (c1203d2.f4640g0 != 8) {
                int i3 = c1203d2.f4660r;
                if (i3 == 2) {
                    m2822q = (int) (c1203d2.f4634d0 * 0.5f * (c1203d instanceof C1204e ? c1203d.m2822q() : c1203d.f4620T.m2822q()));
                } else if (i3 == 0) {
                    m2822q = m2784d - m2785e;
                }
                m2822q = Math.max(c1203d2.f4663u, m2822q);
                int i4 = c1203d2.f4664v;
                if (i4 > 0) {
                    m2822q = Math.min(i4, m2822q);
                }
            }
            int i5 = m2785e + ((int) ((f * ((m2784d - m2785e) - m2822q)) + 0.5f));
            c1203d2.m2802J(i5, m2822q + i5);
            m2879c(i2 + 1, c1203d2, c1256f, z2);
        }
    }

    /* renamed from: f */
    public static void m2882f(int i2, C1203d c1203d, C1256f c1256f) {
        float f = c1203d.f4636e0;
        C1202c c1202c = c1203d.f4610J;
        int m2784d = c1202c.f4597f.m2784d();
        C1202c c1202c2 = c1203d.f4612L;
        int m2784d2 = c1202c2.f4597f.m2784d();
        int m2785e = c1202c.m2785e() + m2784d;
        int m2785e2 = m2784d2 - c1202c2.m2785e();
        if (m2784d == m2784d2) {
            f = 0.5f;
        } else {
            m2784d = m2785e;
            m2784d2 = m2785e2;
        }
        int m2818k = c1203d.m2818k();
        int i3 = (m2784d2 - m2784d) - m2818k;
        if (m2784d > m2784d2) {
            i3 = (m2784d - m2784d2) - m2818k;
        }
        int i4 = (int) (i3 > 0 ? (f * i3) + 0.5f : f * i3);
        int i5 = m2784d + i4;
        int i6 = i5 + m2818k;
        if (m2784d > m2784d2) {
            i5 = m2784d - i4;
            i6 = i5 - m2818k;
        }
        c1203d.m2803K(i5, i6);
        m2885i(i2 + 1, c1203d, c1256f);
    }

    /* renamed from: g */
    public static void m2883g(int i2, C1203d c1203d, C1256f c1256f, C1203d c1203d2) {
        float f = c1203d2.f4636e0;
        C1202c c1202c = c1203d2.f4610J;
        int m2785e = c1202c.m2785e() + c1202c.f4597f.m2784d();
        C1202c c1202c2 = c1203d2.f4612L;
        int m2784d = c1202c2.f4597f.m2784d() - c1202c2.m2785e();
        if (m2784d >= m2785e) {
            int m2818k = c1203d2.m2818k();
            if (c1203d2.f4640g0 != 8) {
                int i3 = c1203d2.f4661s;
                if (i3 == 2) {
                    m2818k = (int) (f * 0.5f * (c1203d instanceof C1204e ? c1203d.m2818k() : c1203d.f4620T.m2818k()));
                } else if (i3 == 0) {
                    m2818k = m2784d - m2785e;
                }
                m2818k = Math.max(c1203d2.f4666x, m2818k);
                int i4 = c1203d2.f4667y;
                if (i4 > 0) {
                    m2818k = Math.min(i4, m2818k);
                }
            }
            int i5 = m2785e + ((int) ((f * ((m2784d - m2785e) - m2818k)) + 0.5f));
            c1203d2.m2803K(i5, m2818k + i5);
            m2885i(i2 + 1, c1203d2, c1256f);
        }
    }

    /* renamed from: h */
    public static boolean m2884h(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    /* renamed from: i */
    public static void m2885i(int i2, C1203d c1203d, C1256f c1256f) {
        boolean z2;
        C1202c c1202c;
        C1202c c1202c2;
        C1202c c1202c3;
        C1202c c1202c4;
        if (c1203d.f4653n) {
            return;
        }
        if (!(c1203d instanceof C1204e) && c1203d.m2831z() && m2877a(c1203d)) {
            C1204e.m2832V(c1203d, c1256f, new C1216b());
        }
        C1202c mo2816i = c1203d.mo2816i(3);
        C1202c mo2816i2 = c1203d.mo2816i(5);
        int m2784d = mo2816i.m2784d();
        int m2784d2 = mo2816i2.m2784d();
        HashSet hashSet = mo2816i.f4592a;
        if (hashSet != null && mo2816i.f4594c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1202c c1202c5 = (C1202c) it.next();
                C1203d c1203d2 = c1202c5.f4595d;
                int i3 = i2 + 1;
                boolean m2877a = m2877a(c1203d2);
                if (c1203d2.m2831z() && m2877a) {
                    C1204e.m2832V(c1203d2, c1256f, new C1216b());
                }
                C1202c c1202c6 = c1203d2.f4610J;
                C1202c c1202c7 = c1203d2.f4612L;
                boolean z3 = (c1202c5 == c1202c6 && (c1202c4 = c1202c7.f4597f) != null && c1202c4.f4594c) || (c1202c5 == c1202c7 && (c1202c3 = c1202c6.f4597f) != null && c1202c3.f4594c);
                int i4 = c1203d2.f4658p0[1];
                if (i4 != 3 || m2877a) {
                    if (!c1203d2.m2831z()) {
                        if (c1202c5 == c1202c6 && c1202c7.f4597f == null) {
                            int m2785e = c1202c6.m2785e() + m2784d;
                            c1203d2.m2803K(m2785e, c1203d2.m2818k() + m2785e);
                            m2885i(i3, c1203d2, c1256f);
                        } else if (c1202c5 == c1202c7 && c1202c6.f4597f == null) {
                            int m2785e2 = m2784d - c1202c7.m2785e();
                            c1203d2.m2803K(m2785e2 - c1203d2.m2818k(), m2785e2);
                            m2885i(i3, c1203d2, c1256f);
                        } else if (z3 && !c1203d2.m2830y()) {
                            m2882f(i3, c1203d2, c1256f);
                        }
                    }
                } else if (i4 == 3 && c1203d2.f4667y >= 0 && c1203d2.f4666x >= 0 && (c1203d2.f4640g0 == 8 || (c1203d2.f4661s == 0 && c1203d2.f4623W == 0.0f))) {
                    if (!c1203d2.m2830y() && !c1203d2.f4606F && z3 && !c1203d2.m2830y()) {
                        m2883g(i3, c1203d, c1256f, c1203d2);
                    }
                }
            }
        }
        boolean z4 = true;
        z4 = true;
        z4 = true;
        if (c1203d instanceof C1207h) {
            return;
        }
        HashSet hashSet2 = mo2816i2.f4592a;
        if (hashSet2 != null && mo2816i2.f4594c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C1202c c1202c8 = (C1202c) it2.next();
                C1203d c1203d3 = c1202c8.f4595d;
                int i5 = i2 + 1;
                boolean m2877a2 = m2877a(c1203d3);
                if (c1203d3.m2831z() && m2877a2) {
                    C1204e.m2832V(c1203d3, c1256f, new C1216b());
                }
                C1202c c1202c9 = c1203d3.f4610J;
                C1202c c1202c10 = c1203d3.f4612L;
                boolean z5 = (c1202c8 == c1202c9 && (c1202c2 = c1202c10.f4597f) != null && c1202c2.f4594c) || (c1202c8 == c1202c10 && (c1202c = c1202c9.f4597f) != null && c1202c.f4594c);
                int i6 = c1203d3.f4658p0[1];
                if (i6 != 3 || m2877a2) {
                    if (!c1203d3.m2831z()) {
                        if (c1202c8 == c1202c9 && c1202c10.f4597f == null) {
                            int m2785e3 = c1202c9.m2785e() + m2784d2;
                            c1203d3.m2803K(m2785e3, c1203d3.m2818k() + m2785e3);
                            m2885i(i5, c1203d3, c1256f);
                        } else if (c1202c8 == c1202c10 && c1202c9.f4597f == null) {
                            int m2785e4 = m2784d2 - c1202c10.m2785e();
                            c1203d3.m2803K(m2785e4 - c1203d3.m2818k(), m2785e4);
                            m2885i(i5, c1203d3, c1256f);
                        } else if (z5 && !c1203d3.m2830y()) {
                            m2882f(i5, c1203d3, c1256f);
                        }
                    }
                } else if (i6 == 3 && c1203d3.f4667y >= 0 && c1203d3.f4666x >= 0 && (c1203d3.f4640g0 == 8 || (c1203d3.f4661s == 0 && c1203d3.f4623W == 0.0f))) {
                    if (!c1203d3.m2830y() && !c1203d3.f4606F && z5 && !c1203d3.m2830y()) {
                        m2883g(i5, c1203d, c1256f, c1203d3);
                    }
                }
            }
        }
        C1202c mo2816i3 = c1203d.mo2816i(6);
        if (mo2816i3.f4592a != null && mo2816i3.f4594c) {
            int m2784d3 = mo2816i3.m2784d();
            Iterator it3 = mo2816i3.f4592a.iterator();
            while (it3.hasNext()) {
                C1202c c1202c11 = (C1202c) it3.next();
                C1203d c1203d4 = c1202c11.f4595d;
                int i7 = i2 + 1;
                boolean m2877a3 = m2877a(c1203d4);
                if (c1203d4.m2831z() && m2877a3) {
                    C1204e.m2832V(c1203d4, c1256f, new C1216b());
                }
                if (c1203d4.f4658p0[z4 ? 1 : 0] != 3 || m2877a3) {
                    if (!c1203d4.m2831z()) {
                        C1202c c1202c12 = c1203d4.f4613M;
                        if (c1202c11 == c1202c12) {
                            int m2785e5 = c1202c11.m2785e() + m2784d3;
                            if (c1203d4.f4605E) {
                                int i8 = m2785e5 - c1203d4.f4628a0;
                                int i9 = c1203d4.f4622V + i8;
                                c1203d4.f4626Z = i8;
                                c1203d4.f4610J.m2792l(i8);
                                c1203d4.f4612L.m2792l(i9);
                                c1202c12.m2792l(m2785e5);
                                z2 = z4 ? 1 : 0;
                                c1203d4.f4649l = z2;
                            } else {
                                z2 = z4 ? 1 : 0;
                            }
                            m2885i(i7, c1203d4, c1256f);
                            z4 = z2;
                        }
                    }
                }
                z2 = z4 ? 1 : 0;
                z4 = z2;
            }
        }
        c1203d.f4653n = z4;
    }
}
