package p113s;

import p005C.AbstractC0044g;
import p107q.C1178b;
import p107q.C1179c;
import p107q.C1182f;

/* renamed from: s.a */
/* loaded from: classes.dex */
public final class C1200a extends AbstractC1208i {

    /* renamed from: s0 */
    public int f4571s0;

    /* renamed from: t0 */
    public boolean f4572t0;

    /* renamed from: u0 */
    public int f4573u0;

    /* renamed from: v0 */
    public boolean f4574v0;

    @Override // p113s.C1203d
    /* renamed from: A */
    public final boolean mo2775A() {
        return this.f4574v0;
    }

    @Override // p113s.C1203d
    /* renamed from: B */
    public final boolean mo2776B() {
        return this.f4574v0;
    }

    /* renamed from: T */
    public final boolean m2777T() {
        int i2;
        int i3;
        int i4;
        boolean z2 = true;
        int i5 = 0;
        while (true) {
            i2 = this.f4752r0;
            if (i5 >= i2) {
                break;
            }
            C1203d c1203d = this.f4751q0[i5];
            if ((this.f4572t0 || c1203d.mo2780c()) && ((((i3 = this.f4571s0) == 0 || i3 == 1) && !c1203d.mo2775A()) || (((i4 = this.f4571s0) == 2 || i4 == 3) && !c1203d.mo2776B()))) {
                z2 = false;
            }
            i5++;
        }
        if (!z2 || i2 <= 0) {
            return false;
        }
        int i6 = 0;
        boolean z3 = false;
        for (int i7 = 0; i7 < this.f4752r0; i7++) {
            C1203d c1203d2 = this.f4751q0[i7];
            if (this.f4572t0 || c1203d2.mo2780c()) {
                if (!z3) {
                    int i8 = this.f4571s0;
                    if (i8 == 0) {
                        i6 = c1203d2.mo2816i(2).m2784d();
                    } else if (i8 == 1) {
                        i6 = c1203d2.mo2816i(4).m2784d();
                    } else if (i8 == 2) {
                        i6 = c1203d2.mo2816i(3).m2784d();
                    } else if (i8 == 3) {
                        i6 = c1203d2.mo2816i(5).m2784d();
                    }
                    z3 = true;
                }
                int i9 = this.f4571s0;
                if (i9 == 0) {
                    i6 = Math.min(i6, c1203d2.mo2816i(2).m2784d());
                } else if (i9 == 1) {
                    i6 = Math.max(i6, c1203d2.mo2816i(4).m2784d());
                } else if (i9 == 2) {
                    i6 = Math.min(i6, c1203d2.mo2816i(3).m2784d());
                } else if (i9 == 3) {
                    i6 = Math.max(i6, c1203d2.mo2816i(5).m2784d());
                }
            }
        }
        int i10 = i6 + this.f4573u0;
        int i11 = this.f4571s0;
        if (i11 == 0 || i11 == 1) {
            m2802J(i10, i10);
        } else {
            m2803K(i10, i10);
        }
        this.f4574v0 = true;
        return true;
    }

    /* renamed from: U */
    public final int m2778U() {
        int i2 = this.f4571s0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // p113s.C1203d
    /* renamed from: b */
    public final void mo2779b(C1179c c1179c, boolean z2) {
        boolean z3;
        int i2;
        int i3;
        C1202c[] c1202cArr = this.f4617Q;
        C1202c c1202c = this.f4609I;
        c1202cArr[0] = c1202c;
        C1202c c1202c2 = this.f4610J;
        int i4 = 2;
        c1202cArr[2] = c1202c2;
        C1202c c1202c3 = this.f4611K;
        c1202cArr[1] = c1202c3;
        C1202c c1202c4 = this.f4612L;
        c1202cArr[3] = c1202c4;
        for (C1202c c1202c5 : c1202cArr) {
            c1202c5.f4600i = c1179c.m2729k(c1202c5);
        }
        int i5 = this.f4571s0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C1202c c1202c6 = c1202cArr[i5];
        if (!this.f4574v0) {
            m2777T();
        }
        if (this.f4574v0) {
            this.f4574v0 = false;
            int i6 = this.f4571s0;
            if (i6 == 0 || i6 == 1) {
                c1179c.m2722d(c1202c.f4600i, this.f4625Y);
                c1179c.m2722d(c1202c3.f4600i, this.f4625Y);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    c1179c.m2722d(c1202c2.f4600i, this.f4626Z);
                    c1179c.m2722d(c1202c4.f4600i, this.f4626Z);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.f4752r0; i7++) {
            C1203d c1203d = this.f4751q0[i7];
            if ((this.f4572t0 || c1203d.mo2780c()) && ((((i3 = this.f4571s0) == 0 || i3 == 1) && c1203d.f4658p0[0] == 3 && c1203d.f4609I.f4597f != null && c1203d.f4611K.f4597f != null) || ((i3 == 2 || i3 == 3) && c1203d.f4658p0[1] == 3 && c1203d.f4610J.f4597f != null && c1203d.f4612L.f4597f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c1202c.m2787g() || c1202c3.m2787g();
        boolean z5 = c1202c2.m2787g() || c1202c4.m2787g();
        int i8 = (z3 || !(((i2 = this.f4571s0) == 0 && z4) || ((i2 == 2 && z5) || ((i2 == 1 && z4) || (i2 == 3 && z5))))) ? 4 : 5;
        int i9 = 0;
        while (i9 < this.f4752r0) {
            C1203d c1203d2 = this.f4751q0[i9];
            if (this.f4572t0 || c1203d2.mo2780c()) {
                C1182f m2729k = c1179c.m2729k(c1203d2.f4617Q[this.f4571s0]);
                int i10 = this.f4571s0;
                C1202c c1202c7 = c1203d2.f4617Q[i10];
                c1202c7.f4600i = m2729k;
                C1202c c1202c8 = c1202c7.f4597f;
                int i11 = (c1202c8 == null || c1202c8.f4595d != this) ? 0 : c1202c7.f4598g;
                if (i10 == 0 || i10 == i4) {
                    C1182f c1182f = c1202c6.f4600i;
                    int i12 = this.f4573u0 - i11;
                    C1178b m2730l = c1179c.m2730l();
                    C1182f m2731m = c1179c.m2731m();
                    m2731m.f4508d = 0;
                    m2730l.m2711c(c1182f, m2729k, m2731m, i12);
                    c1179c.m2721c(m2730l);
                } else {
                    C1182f c1182f2 = c1202c6.f4600i;
                    int i13 = this.f4573u0 + i11;
                    C1178b m2730l2 = c1179c.m2730l();
                    C1182f m2731m2 = c1179c.m2731m();
                    m2731m2.f4508d = 0;
                    m2730l2.m2710b(c1182f2, m2729k, m2731m2, i13);
                    c1179c.m2721c(m2730l2);
                }
                c1179c.m2723e(c1202c6.f4600i, m2729k, this.f4573u0 + i11, i8);
            }
            i9++;
            i4 = 2;
        }
        int i14 = this.f4571s0;
        if (i14 == 0) {
            c1179c.m2723e(c1202c3.f4600i, c1202c.f4600i, 0, 8);
            c1179c.m2723e(c1202c.f4600i, this.f4620T.f4611K.f4600i, 0, 4);
            c1179c.m2723e(c1202c.f4600i, this.f4620T.f4609I.f4600i, 0, 0);
            return;
        }
        if (i14 == 1) {
            c1179c.m2723e(c1202c.f4600i, c1202c3.f4600i, 0, 8);
            c1179c.m2723e(c1202c.f4600i, this.f4620T.f4609I.f4600i, 0, 4);
            c1179c.m2723e(c1202c.f4600i, this.f4620T.f4611K.f4600i, 0, 0);
        } else if (i14 == 2) {
            c1179c.m2723e(c1202c4.f4600i, c1202c2.f4600i, 0, 8);
            c1179c.m2723e(c1202c2.f4600i, this.f4620T.f4612L.f4600i, 0, 4);
            c1179c.m2723e(c1202c2.f4600i, this.f4620T.f4610J.f4600i, 0, 0);
        } else if (i14 == 3) {
            c1179c.m2723e(c1202c2.f4600i, c1202c4.f4600i, 0, 8);
            c1179c.m2723e(c1202c2.f4600i, this.f4620T.f4610J.f4600i, 0, 4);
            c1179c.m2723e(c1202c2.f4600i, this.f4620T.f4612L.f4600i, 0, 0);
        }
    }

    @Override // p113s.C1203d
    /* renamed from: c */
    public final boolean mo2780c() {
        return true;
    }

    @Override // p113s.C1203d
    public final String toString() {
        String str = "[Barrier] " + this.f4642h0 + " {";
        for (int i2 = 0; i2 < this.f4752r0; i2++) {
            C1203d c1203d = this.f4751q0[i2];
            if (i2 > 0) {
                str = AbstractC0044g.m154f(str, ", ");
            }
            str = str + c1203d.f4642h0;
        }
        return AbstractC0044g.m154f(str, "}");
    }
}
