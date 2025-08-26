package p113s;

import java.util.ArrayList;
import p107q.AbstractC1181e;
import p107q.C1178b;
import p107q.C1179c;
import p107q.C1182f;

/* renamed from: s.h */
/* loaded from: classes.dex */
public final class C1207h extends C1203d {

    /* renamed from: q0 */
    public float f4745q0 = -1.0f;

    /* renamed from: r0 */
    public int f4746r0 = -1;

    /* renamed from: s0 */
    public int f4747s0 = -1;

    /* renamed from: t0 */
    public C1202c f4748t0 = this.f4610J;

    /* renamed from: u0 */
    public int f4749u0 = 0;

    /* renamed from: v0 */
    public boolean f4750v0;

    public C1207h() {
        this.f4618R.clear();
        this.f4618R.add(this.f4748t0);
        int length = this.f4617Q.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f4617Q[i2] = this.f4748t0;
        }
    }

    @Override // p113s.C1203d
    /* renamed from: A */
    public final boolean mo2775A() {
        return this.f4750v0;
    }

    @Override // p113s.C1203d
    /* renamed from: B */
    public final boolean mo2776B() {
        return this.f4750v0;
    }

    @Override // p113s.C1203d
    /* renamed from: Q */
    public final void mo2809Q(C1179c c1179c, boolean z2) {
        if (this.f4620T == null) {
            return;
        }
        C1202c c1202c = this.f4748t0;
        c1179c.getClass();
        int m2718n = C1179c.m2718n(c1202c);
        if (this.f4749u0 == 1) {
            this.f4625Y = m2718n;
            this.f4626Z = 0;
            m2804L(this.f4620T.m2818k());
            m2807O(0);
            return;
        }
        this.f4625Y = 0;
        this.f4626Z = m2718n;
        m2807O(this.f4620T.m2822q());
        m2804L(0);
    }

    /* renamed from: R */
    public final void m2848R(int i2) {
        this.f4748t0.m2792l(i2);
        this.f4750v0 = true;
    }

    /* renamed from: S */
    public final void m2849S(int i2) {
        if (this.f4749u0 == i2) {
            return;
        }
        this.f4749u0 = i2;
        ArrayList arrayList = this.f4618R;
        arrayList.clear();
        if (this.f4749u0 == 1) {
            this.f4748t0 = this.f4609I;
        } else {
            this.f4748t0 = this.f4610J;
        }
        arrayList.add(this.f4748t0);
        C1202c[] c1202cArr = this.f4617Q;
        int length = c1202cArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            c1202cArr[i3] = this.f4748t0;
        }
    }

    @Override // p113s.C1203d
    /* renamed from: b */
    public final void mo2779b(C1179c c1179c, boolean z2) {
        C1204e c1204e = (C1204e) this.f4620T;
        if (c1204e == null) {
            return;
        }
        Object mo2816i = c1204e.mo2816i(2);
        Object mo2816i2 = c1204e.mo2816i(4);
        C1203d c1203d = this.f4620T;
        boolean z3 = c1203d != null && c1203d.f4658p0[0] == 2;
        if (this.f4749u0 == 0) {
            mo2816i = c1204e.mo2816i(3);
            mo2816i2 = c1204e.mo2816i(5);
            C1203d c1203d2 = this.f4620T;
            z3 = c1203d2 != null && c1203d2.f4658p0[1] == 2;
        }
        if (this.f4750v0) {
            C1202c c1202c = this.f4748t0;
            if (c1202c.f4594c) {
                C1182f m2729k = c1179c.m2729k(c1202c);
                c1179c.m2722d(m2729k, this.f4748t0.m2784d());
                if (this.f4746r0 != -1) {
                    if (z3) {
                        c1179c.m2724f(c1179c.m2729k(mo2816i2), m2729k, 0, 5);
                    }
                } else if (this.f4747s0 != -1 && z3) {
                    C1182f m2729k2 = c1179c.m2729k(mo2816i2);
                    c1179c.m2724f(m2729k, c1179c.m2729k(mo2816i), 0, 5);
                    c1179c.m2724f(m2729k2, m2729k, 0, 5);
                }
                this.f4750v0 = false;
                return;
            }
        }
        if (this.f4746r0 != -1) {
            C1182f m2729k3 = c1179c.m2729k(this.f4748t0);
            c1179c.m2723e(m2729k3, c1179c.m2729k(mo2816i), this.f4746r0, 8);
            if (z3) {
                c1179c.m2724f(c1179c.m2729k(mo2816i2), m2729k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f4747s0 != -1) {
            C1182f m2729k4 = c1179c.m2729k(this.f4748t0);
            C1182f m2729k5 = c1179c.m2729k(mo2816i2);
            c1179c.m2723e(m2729k4, m2729k5, -this.f4747s0, 8);
            if (z3) {
                c1179c.m2724f(m2729k4, c1179c.m2729k(mo2816i), 0, 5);
                c1179c.m2724f(m2729k5, m2729k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f4745q0 != -1.0f) {
            C1182f m2729k6 = c1179c.m2729k(this.f4748t0);
            C1182f m2729k7 = c1179c.m2729k(mo2816i2);
            float f = this.f4745q0;
            C1178b m2730l = c1179c.m2730l();
            m2730l.f4481d.m2707g(m2729k6, -1.0f);
            m2730l.f4481d.m2707g(m2729k7, f);
            c1179c.m2721c(m2730l);
        }
    }

    @Override // p113s.C1203d
    /* renamed from: c */
    public final boolean mo2780c() {
        return true;
    }

    @Override // p113s.C1203d
    /* renamed from: i */
    public final C1202c mo2816i(int i2) {
        int m2740a = AbstractC1181e.m2740a(i2);
        if (m2740a != 1) {
            if (m2740a != 2) {
                if (m2740a != 3) {
                    if (m2740a != 4) {
                        return null;
                    }
                }
            }
            if (this.f4749u0 == 0) {
                return this.f4748t0;
            }
            return null;
        }
        if (this.f4749u0 == 1) {
            return this.f4748t0;
        }
        return null;
    }
}
