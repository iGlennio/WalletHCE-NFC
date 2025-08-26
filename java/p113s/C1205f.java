package p113s;

/* renamed from: s.f */
/* loaded from: classes.dex */
public final class C1205f {

    /* renamed from: a */
    public int f4691a;

    /* renamed from: d */
    public C1202c f4694d;

    /* renamed from: e */
    public C1202c f4695e;

    /* renamed from: f */
    public C1202c f4696f;

    /* renamed from: g */
    public C1202c f4697g;

    /* renamed from: h */
    public int f4698h;

    /* renamed from: i */
    public int f4699i;

    /* renamed from: j */
    public int f4700j;

    /* renamed from: k */
    public int f4701k;

    /* renamed from: q */
    public int f4707q;

    /* renamed from: r */
    public final /* synthetic */ C1206g f4708r;

    /* renamed from: b */
    public C1203d f4692b = null;

    /* renamed from: c */
    public int f4693c = 0;

    /* renamed from: l */
    public int f4702l = 0;

    /* renamed from: m */
    public int f4703m = 0;

    /* renamed from: n */
    public int f4704n = 0;

    /* renamed from: o */
    public int f4705o = 0;

    /* renamed from: p */
    public int f4706p = 0;

    public C1205f(C1206g c1206g, int i2, C1202c c1202c, C1202c c1202c2, C1202c c1202c3, C1202c c1202c4, int i3) {
        this.f4708r = c1206g;
        this.f4691a = i2;
        this.f4694d = c1202c;
        this.f4695e = c1202c2;
        this.f4696f = c1202c3;
        this.f4697g = c1202c4;
        this.f4698h = c1206g.f4741w0;
        this.f4699i = c1206g.f4737s0;
        this.f4700j = c1206g.f4742x0;
        this.f4701k = c1206g.f4738t0;
        this.f4707q = i3;
    }

    /* renamed from: a */
    public final void m2838a(C1203d c1203d) {
        int i2 = this.f4691a;
        C1206g c1206g = this.f4708r;
        if (i2 == 0) {
            int m2846U = c1206g.m2846U(c1203d, this.f4707q);
            if (c1203d.f4658p0[0] == 3) {
                this.f4706p++;
                m2846U = 0;
            }
            this.f4702l = m2846U + (c1203d.f4640g0 != 8 ? c1206g.f4724P0 : 0) + this.f4702l;
            int m2845T = c1206g.m2845T(c1203d, this.f4707q);
            if (this.f4692b == null || this.f4693c < m2845T) {
                this.f4692b = c1203d;
                this.f4693c = m2845T;
                this.f4703m = m2845T;
            }
        } else {
            int m2846U2 = c1206g.m2846U(c1203d, this.f4707q);
            int m2845T2 = c1206g.m2845T(c1203d, this.f4707q);
            if (c1203d.f4658p0[1] == 3) {
                this.f4706p++;
                m2845T2 = 0;
            }
            this.f4703m = m2845T2 + (c1203d.f4640g0 != 8 ? c1206g.f4725Q0 : 0) + this.f4703m;
            if (this.f4692b == null || this.f4693c < m2846U2) {
                this.f4692b = c1203d;
                this.f4693c = m2846U2;
                this.f4702l = m2846U2;
            }
        }
        this.f4705o++;
    }

    /* renamed from: b */
    public final void m2839b(int i2, boolean z2, boolean z3) {
        C1206g c1206g;
        int i3;
        int i4;
        C1203d c1203d;
        boolean z4;
        char c2;
        float f;
        float f2;
        int i5;
        float f3;
        float f4;
        int i6;
        int i7 = this.f4705o;
        int i8 = 0;
        while (true) {
            c1206g = this.f4708r;
            if (i8 >= i7 || (i6 = this.f4704n + i8) >= c1206g.f4736b1) {
                break;
            }
            C1203d c1203d2 = c1206g.f4735a1[i6];
            if (c1203d2 != null) {
                c1203d2.m2798D();
            }
            i8++;
        }
        if (i7 == 0 || this.f4692b == null) {
            return;
        }
        boolean z5 = z3 && i2 == 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = this.f4704n + (z2 ? (i7 - 1) - i11 : i11);
            if (i12 >= c1206g.f4736b1) {
                break;
            }
            C1203d c1203d3 = c1206g.f4735a1[i12];
            if (c1203d3 != null && c1203d3.f4640g0 == 0) {
                if (i9 == -1) {
                    i9 = i11;
                }
                i10 = i11;
            }
        }
        if (this.f4691a != 0) {
            boolean z6 = z5;
            C1203d c1203d4 = this.f4692b;
            c1203d4.f4644i0 = c1206g.f4712D0;
            int i13 = this.f4698h;
            if (i2 > 0) {
                i13 += c1206g.f4724P0;
            }
            C1202c c1202c = c1203d4.f4609I;
            C1202c c1202c2 = c1203d4.f4611K;
            if (z2) {
                c1202c2.m2781a(this.f4696f, i13);
                if (z3) {
                    c1202c.m2781a(this.f4694d, this.f4700j);
                }
                if (i2 > 0) {
                    this.f4696f.f4595d.f4609I.m2781a(c1202c2, 0);
                }
            } else {
                c1202c.m2781a(this.f4694d, i13);
                if (z3) {
                    c1202c2.m2781a(this.f4696f, this.f4700j);
                }
                if (i2 > 0) {
                    this.f4694d.f4595d.f4611K.m2781a(c1202c, 0);
                }
            }
            C1203d c1203d5 = null;
            for (int i14 = 0; i14 < i7; i14++) {
                int i15 = this.f4704n + i14;
                if (i15 >= c1206g.f4736b1) {
                    return;
                }
                C1203d c1203d6 = c1206g.f4735a1[i15];
                if (c1203d6 != null) {
                    C1202c c1202c3 = c1203d6.f4610J;
                    if (i14 == 0) {
                        c1203d6.m2813f(c1202c3, this.f4695e, this.f4699i);
                        int i16 = c1206g.f4713E0;
                        float f5 = c1206g.f4719K0;
                        if (this.f4704n == 0) {
                            i4 = c1206g.f4715G0;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = c1206g.f4721M0;
                                i16 = i4;
                                c1203d6.f4646j0 = i16;
                                c1203d6.f4636e0 = f5;
                            }
                        } else {
                            i3 = -1;
                        }
                        if (z3 && (i4 = c1206g.f4717I0) != i3) {
                            f5 = c1206g.f4723O0;
                            i16 = i4;
                        }
                        c1203d6.f4646j0 = i16;
                        c1203d6.f4636e0 = f5;
                    }
                    if (i14 == i7 - 1) {
                        c1203d6.m2813f(c1203d6.f4612L, this.f4697g, this.f4701k);
                    }
                    if (c1203d5 != null) {
                        int i17 = c1206g.f4725Q0;
                        C1202c c1202c4 = c1203d5.f4612L;
                        c1202c3.m2781a(c1202c4, i17);
                        if (i14 == i9) {
                            int i18 = this.f4699i;
                            if (c1202c3.m2788h()) {
                                c1202c3.f4599h = i18;
                            }
                        }
                        c1202c4.m2781a(c1202c3, 0);
                        if (i14 == i10 + 1) {
                            int i19 = this.f4701k;
                            if (c1202c4.m2788h()) {
                                c1202c4.f4599h = i19;
                            }
                        }
                    }
                    if (c1203d6 != c1203d4) {
                        C1202c c1202c5 = c1203d6.f4611K;
                        C1202c c1202c6 = c1203d6.f4609I;
                        if (z2) {
                            int i20 = c1206g.f4726R0;
                            if (i20 == 0) {
                                c1202c5.m2781a(c1202c2, 0);
                            } else if (i20 == 1) {
                                c1202c6.m2781a(c1202c, 0);
                            } else if (i20 == 2) {
                                c1202c6.m2781a(c1202c, 0);
                                c1202c5.m2781a(c1202c2, 0);
                            }
                        } else {
                            int i21 = c1206g.f4726R0;
                            if (i21 == 0) {
                                c1202c6.m2781a(c1202c, 0);
                            } else if (i21 == 1) {
                                c1202c5.m2781a(c1202c2, 0);
                            } else if (i21 == 2) {
                                if (z6) {
                                    c1202c6.m2781a(this.f4694d, this.f4698h);
                                    c1202c5.m2781a(this.f4696f, this.f4700j);
                                } else {
                                    c1202c6.m2781a(c1202c, 0);
                                    c1202c5.m2781a(c1202c2, 0);
                                }
                            }
                            c1203d5 = c1203d6;
                        }
                    }
                    c1203d5 = c1203d6;
                }
            }
            return;
        }
        C1203d c1203d7 = this.f4692b;
        c1203d7.f4646j0 = c1206g.f4713E0;
        int i22 = this.f4699i;
        if (i2 > 0) {
            i22 += c1206g.f4725Q0;
        }
        C1202c c1202c7 = this.f4695e;
        C1202c c1202c8 = c1203d7.f4610J;
        c1202c8.m2781a(c1202c7, i22);
        C1202c c1202c9 = c1203d7.f4612L;
        if (z3) {
            c1202c9.m2781a(this.f4697g, this.f4701k);
        }
        if (i2 > 0) {
            this.f4695e.f4595d.f4612L.m2781a(c1202c8, 0);
        }
        if (c1206g.f4727S0 == 3 && !c1203d7.f4605E) {
            for (int i23 = 0; i23 < i7; i23++) {
                int i24 = this.f4704n + (z2 ? (i7 - 1) - i23 : i23);
                if (i24 >= c1206g.f4736b1) {
                    break;
                }
                c1203d = c1206g.f4735a1[i24];
                if (c1203d.f4605E) {
                    break;
                }
            }
        }
        c1203d = c1203d7;
        int i25 = 0;
        C1203d c1203d8 = null;
        while (i25 < i7) {
            int i26 = z2 ? (i7 - 1) - i25 : i25;
            int i27 = this.f4704n + i26;
            if (i27 >= c1206g.f4736b1) {
                return;
            }
            C1203d c1203d9 = c1206g.f4735a1[i27];
            if (c1203d9 == null) {
                z4 = z5;
                c2 = 3;
            } else {
                C1202c c1202c10 = c1203d9.f4609I;
                if (i25 == 0) {
                    c1203d9.m2813f(c1202c10, this.f4694d, this.f4698h);
                }
                if (i26 == 0) {
                    int i28 = c1206g.f4712D0;
                    if (z2) {
                        f = 1.0f;
                        f2 = 1.0f - c1206g.f4718J0;
                    } else {
                        f = 1.0f;
                        f2 = c1206g.f4718J0;
                    }
                    if (this.f4704n == 0) {
                        i5 = c1206g.f4714F0;
                        z4 = z5;
                        if (i5 != -1) {
                            if (z2) {
                                f4 = c1206g.f4720L0;
                                f2 = f - f4;
                                c1203d9.f4644i0 = i5;
                                c1203d9.f4634d0 = f2;
                            } else {
                                f3 = c1206g.f4720L0;
                                f2 = f3;
                                c1203d9.f4644i0 = i5;
                                c1203d9.f4634d0 = f2;
                            }
                        }
                    } else {
                        z4 = z5;
                    }
                    if (!z3 || (i5 = c1206g.f4716H0) == -1) {
                        i5 = i28;
                        c1203d9.f4644i0 = i5;
                        c1203d9.f4634d0 = f2;
                    } else if (z2) {
                        f4 = c1206g.f4722N0;
                        f2 = f - f4;
                        c1203d9.f4644i0 = i5;
                        c1203d9.f4634d0 = f2;
                    } else {
                        f3 = c1206g.f4722N0;
                        f2 = f3;
                        c1203d9.f4644i0 = i5;
                        c1203d9.f4634d0 = f2;
                    }
                } else {
                    z4 = z5;
                }
                if (i25 == i7 - 1) {
                    c1203d9.m2813f(c1203d9.f4611K, this.f4696f, this.f4700j);
                }
                if (c1203d8 != null) {
                    int i29 = c1206g.f4724P0;
                    C1202c c1202c11 = c1203d8.f4611K;
                    c1202c10.m2781a(c1202c11, i29);
                    if (i25 == i9) {
                        int i30 = this.f4698h;
                        if (c1202c10.m2788h()) {
                            c1202c10.f4599h = i30;
                        }
                    }
                    c1202c11.m2781a(c1202c10, 0);
                    if (i25 == i10 + 1) {
                        int i31 = this.f4700j;
                        if (c1202c11.m2788h()) {
                            c1202c11.f4599h = i31;
                        }
                    }
                }
                if (c1203d9 != c1203d7) {
                    int i32 = c1206g.f4727S0;
                    c2 = 3;
                    if (i32 == 3 && c1203d.f4605E && c1203d9 != c1203d && c1203d9.f4605E) {
                        c1203d9.f4613M.m2781a(c1203d.f4613M, 0);
                    } else {
                        C1202c c1202c12 = c1203d9.f4610J;
                        if (i32 != 0) {
                            C1202c c1202c13 = c1203d9.f4612L;
                            if (i32 == 1) {
                                c1202c13.m2781a(c1202c9, 0);
                            } else if (z4) {
                                c1202c12.m2781a(this.f4695e, this.f4699i);
                                c1202c13.m2781a(this.f4697g, this.f4701k);
                            } else {
                                c1202c12.m2781a(c1202c8, 0);
                                c1202c13.m2781a(c1202c9, 0);
                            }
                        } else {
                            c1202c12.m2781a(c1202c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c1203d8 = c1203d9;
            }
            i25++;
            z5 = z4;
        }
    }

    /* renamed from: c */
    public final int m2840c() {
        return this.f4691a == 1 ? this.f4703m - this.f4708r.f4725Q0 : this.f4703m;
    }

    /* renamed from: d */
    public final int m2841d() {
        return this.f4691a == 0 ? this.f4702l - this.f4708r.f4724P0 : this.f4702l;
    }

    /* renamed from: e */
    public final void m2842e(int i2) {
        C1206g c1206g;
        int i3;
        int i4 = this.f4706p;
        if (i4 == 0) {
            return;
        }
        int i5 = this.f4705o;
        int i6 = i2 / i4;
        int i7 = 0;
        while (true) {
            c1206g = this.f4708r;
            if (i7 >= i5 || (i3 = this.f4704n + i7) >= c1206g.f4736b1) {
                break;
            }
            C1203d c1203d = c1206g.f4735a1[i3];
            if (this.f4691a == 0) {
                if (c1203d != null) {
                    int[] iArr = c1203d.f4658p0;
                    if (iArr[0] == 3 && c1203d.f4660r == 0) {
                        c1206g.m2847V(1, i6, iArr[1], c1203d.m2818k(), c1203d);
                    }
                }
            } else if (c1203d != null) {
                int[] iArr2 = c1203d.f4658p0;
                if (iArr2[1] == 3 && c1203d.f4661s == 0) {
                    int i8 = iArr2[0];
                    int i9 = i6;
                    c1206g.m2847V(i8, c1203d.m2822q(), 1, i9, c1203d);
                    i6 = i9;
                }
            }
            i7++;
        }
        this.f4702l = 0;
        this.f4703m = 0;
        this.f4692b = null;
        this.f4693c = 0;
        int i10 = this.f4705o;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f4704n + i11;
            if (i12 >= c1206g.f4736b1) {
                return;
            }
            C1203d c1203d2 = c1206g.f4735a1[i12];
            if (this.f4691a == 0) {
                int m2822q = c1203d2.m2822q();
                int i13 = c1206g.f4724P0;
                if (c1203d2.f4640g0 == 8) {
                    i13 = 0;
                }
                this.f4702l = m2822q + i13 + this.f4702l;
                int m2845T = c1206g.m2845T(c1203d2, this.f4707q);
                if (this.f4692b == null || this.f4693c < m2845T) {
                    this.f4692b = c1203d2;
                    this.f4693c = m2845T;
                    this.f4703m = m2845T;
                }
            } else {
                int m2846U = c1206g.m2846U(c1203d2, this.f4707q);
                int m2845T2 = c1206g.m2845T(c1203d2, this.f4707q);
                int i14 = c1206g.f4725Q0;
                if (c1203d2.f4640g0 == 8) {
                    i14 = 0;
                }
                this.f4703m = m2845T2 + i14 + this.f4703m;
                if (this.f4692b == null || this.f4693c < m2846U) {
                    this.f4692b = c1203d2;
                    this.f4693c = m2846U;
                    this.f4702l = m2846U;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m2843f(int i2, C1202c c1202c, C1202c c1202c2, C1202c c1202c3, C1202c c1202c4, int i3, int i4, int i5, int i6, int i7) {
        this.f4691a = i2;
        this.f4694d = c1202c;
        this.f4695e = c1202c2;
        this.f4696f = c1202c3;
        this.f4697g = c1202c4;
        this.f4698h = i3;
        this.f4699i = i4;
        this.f4700j = i5;
        this.f4701k = i6;
        this.f4707q = i7;
    }
}
