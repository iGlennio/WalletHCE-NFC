package p055U0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
import p014F0.C0129F;

/* renamed from: U0.n */
/* loaded from: classes.dex */
public final class C0500n extends AbstractMap implements Serializable {

    /* renamed from: i */
    public static final C0129F f1370i = new C0129F(1);

    /* renamed from: a */
    public final Comparator f1371a;

    /* renamed from: b */
    public final boolean f1372b;

    /* renamed from: c */
    public C0499m f1373c;

    /* renamed from: d */
    public int f1374d;

    /* renamed from: e */
    public int f1375e;

    /* renamed from: f */
    public final C0499m f1376f;

    /* renamed from: g */
    public C0498l f1377g;

    /* renamed from: h */
    public C0498l f1378h;

    public C0500n(boolean z2) {
        C0129F c0129f = f1370i;
        this.f1374d = 0;
        this.f1375e = 0;
        this.f1371a = c0129f;
        this.f1372b = z2;
        this.f1376f = new C0499m(z2);
    }

    /* renamed from: a */
    public final C0499m m1273a(Object obj, boolean z2) {
        int i2;
        C0499m c0499m;
        C0499m c0499m2 = this.f1373c;
        C0129F c0129f = f1370i;
        Comparator comparator = this.f1371a;
        if (c0499m2 != null) {
            Comparable comparable = comparator == c0129f ? (Comparable) obj : null;
            while (true) {
                Object obj2 = c0499m2.f1366f;
                i2 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i2 == 0) {
                    return c0499m2;
                }
                C0499m c0499m3 = i2 < 0 ? c0499m2.f1362b : c0499m2.f1363c;
                if (c0499m3 == null) {
                    break;
                }
                c0499m2 = c0499m3;
            }
        } else {
            i2 = 0;
        }
        C0499m c0499m4 = c0499m2;
        if (!z2) {
            return null;
        }
        C0499m c0499m5 = this.f1376f;
        if (c0499m4 != null) {
            c0499m = new C0499m(this.f1372b, c0499m4, obj, c0499m5, c0499m5.f1365e);
            if (i2 < 0) {
                c0499m4.f1362b = c0499m;
            } else {
                c0499m4.f1363c = c0499m;
            }
            m1274b(c0499m4, true);
        } else {
            if (comparator == c0129f && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c0499m = new C0499m(this.f1372b, c0499m4, obj, c0499m5, c0499m5.f1365e);
            this.f1373c = c0499m;
        }
        this.f1374d++;
        this.f1375e++;
        return c0499m;
    }

    /* renamed from: b */
    public final void m1274b(C0499m c0499m, boolean z2) {
        while (c0499m != null) {
            C0499m c0499m2 = c0499m.f1362b;
            C0499m c0499m3 = c0499m.f1363c;
            int i2 = c0499m2 != null ? c0499m2.f1369i : 0;
            int i3 = c0499m3 != null ? c0499m3.f1369i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C0499m c0499m4 = c0499m3.f1362b;
                C0499m c0499m5 = c0499m3.f1363c;
                int i5 = (c0499m4 != null ? c0499m4.f1369i : 0) - (c0499m5 != null ? c0499m5.f1369i : 0);
                if (i5 == -1 || (i5 == 0 && !z2)) {
                    m1277e(c0499m);
                } else {
                    m1278f(c0499m3);
                    m1277e(c0499m);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 2) {
                C0499m c0499m6 = c0499m2.f1362b;
                C0499m c0499m7 = c0499m2.f1363c;
                int i6 = (c0499m6 != null ? c0499m6.f1369i : 0) - (c0499m7 != null ? c0499m7.f1369i : 0);
                if (i6 == 1 || (i6 == 0 && !z2)) {
                    m1278f(c0499m);
                } else {
                    m1277e(c0499m2);
                    m1278f(c0499m);
                }
                if (z2) {
                    return;
                }
            } else if (i4 == 0) {
                c0499m.f1369i = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                c0499m.f1369i = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            c0499m = c0499m.f1361a;
        }
    }

    /* renamed from: c */
    public final void m1275c(C0499m c0499m, boolean z2) {
        C0499m c0499m2;
        C0499m c0499m3;
        int i2;
        if (z2) {
            C0499m c0499m4 = c0499m.f1365e;
            c0499m4.f1364d = c0499m.f1364d;
            c0499m.f1364d.f1365e = c0499m4;
        }
        C0499m c0499m5 = c0499m.f1362b;
        C0499m c0499m6 = c0499m.f1363c;
        C0499m c0499m7 = c0499m.f1361a;
        int i3 = 0;
        if (c0499m5 == null || c0499m6 == null) {
            if (c0499m5 != null) {
                m1276d(c0499m, c0499m5);
                c0499m.f1362b = null;
            } else if (c0499m6 != null) {
                m1276d(c0499m, c0499m6);
                c0499m.f1363c = null;
            } else {
                m1276d(c0499m, null);
            }
            m1274b(c0499m7, false);
            this.f1374d--;
            this.f1375e++;
            return;
        }
        if (c0499m5.f1369i > c0499m6.f1369i) {
            C0499m c0499m8 = c0499m5.f1363c;
            while (true) {
                C0499m c0499m9 = c0499m8;
                c0499m3 = c0499m5;
                c0499m5 = c0499m9;
                if (c0499m5 == null) {
                    break;
                } else {
                    c0499m8 = c0499m5.f1363c;
                }
            }
        } else {
            C0499m c0499m10 = c0499m6.f1362b;
            while (true) {
                c0499m2 = c0499m6;
                c0499m6 = c0499m10;
                if (c0499m6 == null) {
                    break;
                } else {
                    c0499m10 = c0499m6.f1362b;
                }
            }
            c0499m3 = c0499m2;
        }
        m1275c(c0499m3, false);
        C0499m c0499m11 = c0499m.f1362b;
        if (c0499m11 != null) {
            i2 = c0499m11.f1369i;
            c0499m3.f1362b = c0499m11;
            c0499m11.f1361a = c0499m3;
            c0499m.f1362b = null;
        } else {
            i2 = 0;
        }
        C0499m c0499m12 = c0499m.f1363c;
        if (c0499m12 != null) {
            i3 = c0499m12.f1369i;
            c0499m3.f1363c = c0499m12;
            c0499m12.f1361a = c0499m3;
            c0499m.f1363c = null;
        }
        c0499m3.f1369i = Math.max(i2, i3) + 1;
        m1276d(c0499m, c0499m3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f1373c = null;
        this.f1374d = 0;
        this.f1375e++;
        C0499m c0499m = this.f1376f;
        c0499m.f1365e = c0499m;
        c0499m.f1364d = c0499m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C0499m c0499m = null;
        if (obj != null) {
            try {
                c0499m = m1273a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return c0499m != null;
    }

    /* renamed from: d */
    public final void m1276d(C0499m c0499m, C0499m c0499m2) {
        C0499m c0499m3 = c0499m.f1361a;
        c0499m.f1361a = null;
        if (c0499m2 != null) {
            c0499m2.f1361a = c0499m3;
        }
        if (c0499m3 == null) {
            this.f1373c = c0499m2;
        } else if (c0499m3.f1362b == c0499m) {
            c0499m3.f1362b = c0499m2;
        } else {
            c0499m3.f1363c = c0499m2;
        }
    }

    /* renamed from: e */
    public final void m1277e(C0499m c0499m) {
        C0499m c0499m2 = c0499m.f1362b;
        C0499m c0499m3 = c0499m.f1363c;
        C0499m c0499m4 = c0499m3.f1362b;
        C0499m c0499m5 = c0499m3.f1363c;
        c0499m.f1363c = c0499m4;
        if (c0499m4 != null) {
            c0499m4.f1361a = c0499m;
        }
        m1276d(c0499m, c0499m3);
        c0499m3.f1362b = c0499m;
        c0499m.f1361a = c0499m3;
        int max = Math.max(c0499m2 != null ? c0499m2.f1369i : 0, c0499m4 != null ? c0499m4.f1369i : 0) + 1;
        c0499m.f1369i = max;
        c0499m3.f1369i = Math.max(max, c0499m5 != null ? c0499m5.f1369i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0498l c0498l = this.f1377g;
        if (c0498l != null) {
            return c0498l;
        }
        C0498l c0498l2 = new C0498l(this, 0);
        this.f1377g = c0498l2;
        return c0498l2;
    }

    /* renamed from: f */
    public final void m1278f(C0499m c0499m) {
        C0499m c0499m2 = c0499m.f1362b;
        C0499m c0499m3 = c0499m.f1363c;
        C0499m c0499m4 = c0499m2.f1362b;
        C0499m c0499m5 = c0499m2.f1363c;
        c0499m.f1362b = c0499m5;
        if (c0499m5 != null) {
            c0499m5.f1361a = c0499m;
        }
        m1276d(c0499m, c0499m2);
        c0499m2.f1363c = c0499m;
        c0499m.f1361a = c0499m2;
        int max = Math.max(c0499m3 != null ? c0499m3.f1369i : 0, c0499m5 != null ? c0499m5.f1369i : 0) + 1;
        c0499m.f1369i = max;
        c0499m2.f1369i = Math.max(max, c0499m4 != null ? c0499m4.f1369i : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            U0.m r3 = r2.m1273a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.f1368h
            return r3
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p055U0.C0500n.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0498l c0498l = this.f1378h;
        if (c0498l != null) {
            return c0498l;
        }
        C0498l c0498l2 = new C0498l(this, 1);
        this.f1378h = c0498l2;
        return c0498l2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f1372b) {
            throw new NullPointerException("value == null");
        }
        C0499m m1273a = m1273a(obj, true);
        Object obj3 = m1273a.f1368h;
        m1273a.f1368h = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            U0.m r3 = r2.m1273a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.m1275c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.f1368h
            return r3
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p055U0.C0500n.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f1374d;
    }
}
