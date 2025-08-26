package p113s;

import java.util.ArrayList;
import p107q.C1179c;
import p116t.C1216b;
import p121v.C1256f;

/* renamed from: s.g */
/* loaded from: classes.dex */
public final class C1206g extends AbstractC1208i {

    /* renamed from: A0 */
    public int f4709A0;

    /* renamed from: B0 */
    public C1216b f4710B0;

    /* renamed from: C0 */
    public C1256f f4711C0;

    /* renamed from: D0 */
    public int f4712D0;

    /* renamed from: E0 */
    public int f4713E0;

    /* renamed from: F0 */
    public int f4714F0;

    /* renamed from: G0 */
    public int f4715G0;

    /* renamed from: H0 */
    public int f4716H0;

    /* renamed from: I0 */
    public int f4717I0;

    /* renamed from: J0 */
    public float f4718J0;

    /* renamed from: K0 */
    public float f4719K0;

    /* renamed from: L0 */
    public float f4720L0;

    /* renamed from: M0 */
    public float f4721M0;

    /* renamed from: N0 */
    public float f4722N0;

    /* renamed from: O0 */
    public float f4723O0;

    /* renamed from: P0 */
    public int f4724P0;

    /* renamed from: Q0 */
    public int f4725Q0;

    /* renamed from: R0 */
    public int f4726R0;

    /* renamed from: S0 */
    public int f4727S0;

    /* renamed from: T0 */
    public int f4728T0;

    /* renamed from: U0 */
    public int f4729U0;

    /* renamed from: V0 */
    public int f4730V0;

    /* renamed from: W0 */
    public ArrayList f4731W0;

    /* renamed from: X0 */
    public C1203d[] f4732X0;

    /* renamed from: Y0 */
    public C1203d[] f4733Y0;

    /* renamed from: Z0 */
    public int[] f4734Z0;

    /* renamed from: a1 */
    public C1203d[] f4735a1;

    /* renamed from: b1 */
    public int f4736b1;

    /* renamed from: s0 */
    public int f4737s0;

    /* renamed from: t0 */
    public int f4738t0;

    /* renamed from: u0 */
    public int f4739u0;

    /* renamed from: v0 */
    public int f4740v0;

    /* renamed from: w0 */
    public int f4741w0;

    /* renamed from: x0 */
    public int f4742x0;

    /* renamed from: y0 */
    public boolean f4743y0;

    /* renamed from: z0 */
    public int f4744z0;

    @Override // p113s.AbstractC1208i
    /* renamed from: S */
    public final void mo2844S() {
        for (int i2 = 0; i2 < this.f4752r0; i2++) {
            C1203d c1203d = this.f4751q0[i2];
            if (c1203d != null) {
                c1203d.f4606F = true;
            }
        }
    }

    /* renamed from: T */
    public final int m2845T(C1203d c1203d, int i2) {
        C1203d c1203d2;
        if (c1203d != null) {
            int[] iArr = c1203d.f4658p0;
            if (iArr[1] == 3) {
                int i3 = c1203d.f4661s;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (c1203d.f4668z * i2);
                        if (i4 != c1203d.m2818k()) {
                            c1203d.f4639g = true;
                            m2847V(iArr[0], c1203d.m2822q(), 1, i4, c1203d);
                        }
                        return i4;
                    }
                    c1203d2 = c1203d;
                    if (i3 == 1) {
                        return c1203d2.m2818k();
                    }
                    if (i3 == 3) {
                        return (int) ((c1203d2.m2822q() * c1203d2.f4623W) + 0.5f);
                    }
                }
            } else {
                c1203d2 = c1203d;
            }
            return c1203d2.m2818k();
        }
        return 0;
    }

    /* renamed from: U */
    public final int m2846U(C1203d c1203d, int i2) {
        C1203d c1203d2;
        if (c1203d != null) {
            int[] iArr = c1203d.f4658p0;
            if (iArr[0] == 3) {
                int i3 = c1203d.f4660r;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int i4 = (int) (c1203d.f4665w * i2);
                        if (i4 != c1203d.m2822q()) {
                            c1203d.f4639g = true;
                            m2847V(1, i4, iArr[1], c1203d.m2818k(), c1203d);
                        }
                        return i4;
                    }
                    c1203d2 = c1203d;
                    if (i3 == 1) {
                        return c1203d2.m2822q();
                    }
                    if (i3 == 3) {
                        return (int) ((c1203d2.m2818k() * c1203d2.f4623W) + 0.5f);
                    }
                }
            } else {
                c1203d2 = c1203d;
            }
            return c1203d2.m2822q();
        }
        return 0;
    }

    /* renamed from: V */
    public final void m2847V(int i2, int i3, int i4, int i5, C1203d c1203d) {
        C1256f c1256f;
        C1203d c1203d2;
        while (true) {
            c1256f = this.f4711C0;
            if (c1256f != null || (c1203d2 = this.f4620T) == null) {
                break;
            } else {
                this.f4711C0 = ((C1204e) c1203d2).f4685u0;
            }
        }
        C1216b c1216b = this.f4710B0;
        c1216b.f4767a = i2;
        c1216b.f4768b = i4;
        c1216b.f4769c = i3;
        c1216b.f4770d = i5;
        c1256f.m2934b(c1203d, c1216b);
        c1203d.m2807O(c1216b.f4771e);
        c1203d.m2804L(c1216b.f4772f);
        c1203d.f4605E = c1216b.f4774h;
        c1203d.m2801I(c1216b.f4773g);
    }

    @Override // p113s.C1203d
    /* renamed from: b */
    public final void mo2779b(C1179c c1179c, boolean z2) {
        C1203d c1203d;
        float f;
        int i2;
        super.mo2779b(c1179c, z2);
        C1203d c1203d2 = this.f4620T;
        boolean z3 = c1203d2 != null && ((C1204e) c1203d2).f4686v0;
        int i3 = this.f4728T0;
        ArrayList arrayList = this.f4731W0;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    ((C1205f) arrayList.get(i4)).m2839b(i4, z3, i4 == size + (-1));
                    i4++;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        ((C1205f) arrayList.get(i5)).m2839b(i5, z3, i5 == size2 + (-1));
                        i5++;
                    }
                }
            } else if (this.f4734Z0 != null && this.f4733Y0 != null && this.f4732X0 != null) {
                for (int i6 = 0; i6 < this.f4736b1; i6++) {
                    this.f4735a1[i6].m2798D();
                }
                int[] iArr = this.f4734Z0;
                int i7 = iArr[0];
                int i8 = iArr[1];
                float f2 = this.f4718J0;
                C1203d c1203d3 = null;
                int i9 = 0;
                while (i9 < i7) {
                    if (z3) {
                        i2 = (i7 - i9) - 1;
                        f = 1.0f - this.f4718J0;
                    } else {
                        f = f2;
                        i2 = i9;
                    }
                    C1203d c1203d4 = this.f4733Y0[i2];
                    if (c1203d4 != null && c1203d4.f4640g0 != 8) {
                        C1202c c1202c = c1203d4.f4609I;
                        if (i9 == 0) {
                            c1203d4.m2813f(c1202c, this.f4609I, this.f4741w0);
                            c1203d4.f4644i0 = this.f4712D0;
                            c1203d4.f4634d0 = f;
                        }
                        if (i9 == i7 - 1) {
                            c1203d4.m2813f(c1203d4.f4611K, this.f4611K, this.f4742x0);
                        }
                        if (i9 > 0 && c1203d3 != null) {
                            int i10 = this.f4724P0;
                            C1202c c1202c2 = c1203d3.f4611K;
                            c1203d4.m2813f(c1202c, c1202c2, i10);
                            c1203d3.m2813f(c1202c2, c1202c, 0);
                        }
                        c1203d3 = c1203d4;
                    }
                    i9++;
                    f2 = f;
                }
                for (int i11 = 0; i11 < i8; i11++) {
                    C1203d c1203d5 = this.f4732X0[i11];
                    if (c1203d5 != null && c1203d5.f4640g0 != 8) {
                        C1202c c1202c3 = c1203d5.f4610J;
                        if (i11 == 0) {
                            c1203d5.m2813f(c1202c3, this.f4610J, this.f4737s0);
                            c1203d5.f4646j0 = this.f4713E0;
                            c1203d5.f4636e0 = this.f4719K0;
                        }
                        if (i11 == i8 - 1) {
                            c1203d5.m2813f(c1203d5.f4612L, this.f4612L, this.f4738t0);
                        }
                        if (i11 > 0 && c1203d3 != null) {
                            int i12 = this.f4725Q0;
                            C1202c c1202c4 = c1203d3.f4612L;
                            c1203d5.m2813f(c1202c3, c1202c4, i12);
                            c1203d3.m2813f(c1202c4, c1202c3, 0);
                        }
                        c1203d3 = c1203d5;
                    }
                }
                for (int i13 = 0; i13 < i7; i13++) {
                    for (int i14 = 0; i14 < i8; i14++) {
                        int i15 = (i14 * i7) + i13;
                        if (this.f4730V0 == 1) {
                            i15 = (i13 * i8) + i14;
                        }
                        C1203d[] c1203dArr = this.f4735a1;
                        if (i15 < c1203dArr.length && (c1203d = c1203dArr[i15]) != null && c1203d.f4640g0 != 8) {
                            C1203d c1203d6 = this.f4733Y0[i13];
                            C1203d c1203d7 = this.f4732X0[i14];
                            if (c1203d != c1203d6) {
                                c1203d.m2813f(c1203d.f4609I, c1203d6.f4609I, 0);
                                c1203d.m2813f(c1203d.f4611K, c1203d6.f4611K, 0);
                            }
                            if (c1203d != c1203d7) {
                                c1203d.m2813f(c1203d.f4610J, c1203d7.f4610J, 0);
                                c1203d.m2813f(c1203d.f4612L, c1203d7.f4612L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1205f) arrayList.get(0)).m2839b(0, z3, true);
        }
        this.f4743y0 = false;
    }
}
