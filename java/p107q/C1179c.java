package p107q;

import java.util.Arrays;
import p002B.C0019i;
import p017G0.C0176h;
import p024J.C0226a;
import p113s.C1202c;

/* renamed from: q.c */
/* loaded from: classes.dex */
public final class C1179c {

    /* renamed from: p */
    public static boolean f4483p = false;

    /* renamed from: q */
    public static int f4484q = 1000;

    /* renamed from: c */
    public final C1180d f4487c;

    /* renamed from: f */
    public C1178b[] f4490f;

    /* renamed from: l */
    public final C0176h f4496l;

    /* renamed from: o */
    public C1178b f4499o;

    /* renamed from: a */
    public boolean f4485a = false;

    /* renamed from: b */
    public int f4486b = 0;

    /* renamed from: d */
    public int f4488d = 32;

    /* renamed from: e */
    public int f4489e = 32;

    /* renamed from: g */
    public boolean f4491g = false;

    /* renamed from: h */
    public boolean[] f4492h = new boolean[32];

    /* renamed from: i */
    public int f4493i = 1;

    /* renamed from: j */
    public int f4494j = 0;

    /* renamed from: k */
    public int f4495k = 32;

    /* renamed from: m */
    public C1182f[] f4497m = new C1182f[f4484q];

    /* renamed from: n */
    public int f4498n = 0;

    public C1179c() {
        this.f4490f = null;
        this.f4490f = new C1178b[32];
        m2736s();
        C0176h c0176h = new C0176h(7);
        c0176h.f515b = new C0226a();
        c0176h.f516c = new C0226a();
        c0176h.f517d = new C1182f[32];
        this.f4496l = c0176h;
        C1180d c1180d = new C1180d(c0176h);
        c1180d.f4500f = new C1182f[128];
        c1180d.f4501g = new C1182f[128];
        c1180d.f4502h = 0;
        c1180d.f4503i = new C0019i(19, c1180d);
        this.f4487c = c1180d;
        this.f4499o = new C1178b(c0176h);
    }

    /* renamed from: n */
    public static int m2718n(Object obj) {
        C1182f c1182f = ((C1202c) obj).f4600i;
        if (c1182f != null) {
            return (int) (c1182f.f4509e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* renamed from: a */
    public final C1182f m2719a(int i2) {
        C0226a c0226a = (C0226a) this.f4496l.f516c;
        int i3 = c0226a.f669b;
        C1182f c1182f = null;
        if (i3 > 0) {
            int i4 = i3 - 1;
            ?? r3 = c0226a.f668a;
            ?? r4 = r3[i4];
            r3[i4] = 0;
            c0226a.f669b = i4;
            c1182f = r4;
        }
        C1182f c1182f2 = c1182f;
        if (c1182f2 == null) {
            c1182f2 = new C1182f(i2);
            c1182f2.f4516l = i2;
        } else {
            c1182f2.m2744c();
            c1182f2.f4516l = i2;
        }
        int i5 = this.f4498n;
        int i6 = f4484q;
        if (i5 >= i6) {
            int i7 = i6 * 2;
            f4484q = i7;
            this.f4497m = (C1182f[]) Arrays.copyOf(this.f4497m, i7);
        }
        C1182f[] c1182fArr = this.f4497m;
        int i8 = this.f4498n;
        this.f4498n = i8 + 1;
        c1182fArr[i8] = c1182f2;
        return c1182f2;
    }

    /* renamed from: b */
    public final void m2720b(C1182f c1182f, C1182f c1182f2, int i2, float f, C1182f c1182f3, C1182f c1182f4, int i3, int i4) {
        C1178b m2730l = m2730l();
        if (c1182f2 == c1182f3) {
            m2730l.f4481d.m2707g(c1182f, 1.0f);
            m2730l.f4481d.m2707g(c1182f4, 1.0f);
            m2730l.f4481d.m2707g(c1182f2, -2.0f);
        } else if (f == 0.5f) {
            m2730l.f4481d.m2707g(c1182f, 1.0f);
            m2730l.f4481d.m2707g(c1182f2, -1.0f);
            m2730l.f4481d.m2707g(c1182f3, -1.0f);
            m2730l.f4481d.m2707g(c1182f4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                m2730l.f4479b = (-i2) + i3;
            }
        } else if (f <= 0.0f) {
            m2730l.f4481d.m2707g(c1182f, -1.0f);
            m2730l.f4481d.m2707g(c1182f2, 1.0f);
            m2730l.f4479b = i2;
        } else if (f >= 1.0f) {
            m2730l.f4481d.m2707g(c1182f4, -1.0f);
            m2730l.f4481d.m2707g(c1182f3, 1.0f);
            m2730l.f4479b = -i3;
        } else {
            float f2 = 1.0f - f;
            m2730l.f4481d.m2707g(c1182f, f2 * 1.0f);
            m2730l.f4481d.m2707g(c1182f2, f2 * (-1.0f));
            m2730l.f4481d.m2707g(c1182f3, (-1.0f) * f);
            m2730l.f4481d.m2707g(c1182f4, 1.0f * f);
            if (i2 > 0 || i3 > 0) {
                m2730l.f4479b = (i3 * f) + ((-i2) * f2);
            }
        }
        if (i4 != 8) {
            m2730l.m2709a(this, i4);
        }
        m2721c(m2730l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d3, code lost:
    
        if (r4.f4515k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e0, code lost:
    
        if (r4.f4515k <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f5, code lost:
    
        if (r4.f4515k <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0102, code lost:
    
        if (r4.f4515k <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2721c(p107q.C1178b r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p107q.C1179c.m2721c(q.b):void");
    }

    /* renamed from: d */
    public final void m2722d(C1182f c1182f, int i2) {
        int i3 = c1182f.f4507c;
        if (i3 == -1) {
            c1182f.m2745d(this, i2);
            for (int i4 = 0; i4 < this.f4486b + 1; i4++) {
                C1182f c1182f2 = ((C1182f[]) this.f4496l.f517d)[i4];
            }
            return;
        }
        if (i3 == -1) {
            C1178b m2730l = m2730l();
            m2730l.f4478a = c1182f;
            float f = i2;
            c1182f.f4509e = f;
            m2730l.f4479b = f;
            m2730l.f4482e = true;
            m2721c(m2730l);
            return;
        }
        C1178b c1178b = this.f4490f[i3];
        if (c1178b.f4482e) {
            c1178b.f4479b = i2;
            return;
        }
        if (c1178b.f4481d.m2704d() == 0) {
            c1178b.f4482e = true;
            c1178b.f4479b = i2;
            return;
        }
        C1178b m2730l2 = m2730l();
        if (i2 < 0) {
            m2730l2.f4479b = i2 * (-1);
            m2730l2.f4481d.m2707g(c1182f, 1.0f);
        } else {
            m2730l2.f4479b = i2;
            m2730l2.f4481d.m2707g(c1182f, -1.0f);
        }
        m2721c(m2730l2);
    }

    /* renamed from: e */
    public final void m2723e(C1182f c1182f, C1182f c1182f2, int i2, int i3) {
        if (i3 == 8 && c1182f2.f4510f && c1182f.f4507c == -1) {
            c1182f.m2745d(this, c1182f2.f4509e + i2);
            return;
        }
        C1178b m2730l = m2730l();
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            m2730l.f4479b = i2;
        }
        if (z2) {
            m2730l.f4481d.m2707g(c1182f, 1.0f);
            m2730l.f4481d.m2707g(c1182f2, -1.0f);
        } else {
            m2730l.f4481d.m2707g(c1182f, -1.0f);
            m2730l.f4481d.m2707g(c1182f2, 1.0f);
        }
        if (i3 != 8) {
            m2730l.m2709a(this, i3);
        }
        m2721c(m2730l);
    }

    /* renamed from: f */
    public final void m2724f(C1182f c1182f, C1182f c1182f2, int i2, int i3) {
        C1178b m2730l = m2730l();
        C1182f m2731m = m2731m();
        m2731m.f4508d = 0;
        m2730l.m2710b(c1182f, c1182f2, m2731m, i2);
        if (i3 != 8) {
            m2730l.f4481d.m2707g(m2728j(i3), (int) (m2730l.f4481d.m2703c(m2731m) * (-1.0f)));
        }
        m2721c(m2730l);
    }

    /* renamed from: g */
    public final void m2725g(C1182f c1182f, C1182f c1182f2, int i2, int i3) {
        C1178b m2730l = m2730l();
        C1182f m2731m = m2731m();
        m2731m.f4508d = 0;
        m2730l.m2711c(c1182f, c1182f2, m2731m, i2);
        if (i3 != 8) {
            m2730l.f4481d.m2707g(m2728j(i3), (int) (m2730l.f4481d.m2703c(m2731m) * (-1.0f)));
        }
        m2721c(m2730l);
    }

    /* renamed from: h */
    public final void m2726h(C1178b c1178b) {
        int i2;
        if (c1178b.f4482e) {
            c1178b.f4478a.m2745d(this, c1178b.f4479b);
        } else {
            C1178b[] c1178bArr = this.f4490f;
            int i3 = this.f4494j;
            c1178bArr[i3] = c1178b;
            C1182f c1182f = c1178b.f4478a;
            c1182f.f4507c = i3;
            this.f4494j = i3 + 1;
            c1182f.m2746e(this, c1178b);
        }
        if (this.f4485a) {
            int i4 = 0;
            while (i4 < this.f4494j) {
                if (this.f4490f[i4] == null) {
                    System.out.println("WTF");
                }
                C1178b c1178b2 = this.f4490f[i4];
                if (c1178b2 != null && c1178b2.f4482e) {
                    c1178b2.f4478a.m2745d(this, c1178b2.f4479b);
                    ((C0226a) this.f4496l.f515b).m631b(c1178b2);
                    this.f4490f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f4494j;
                        if (i5 >= i2) {
                            break;
                        }
                        C1178b[] c1178bArr2 = this.f4490f;
                        int i7 = i5 - 1;
                        C1178b c1178b3 = c1178bArr2[i5];
                        c1178bArr2[i7] = c1178b3;
                        C1182f c1182f2 = c1178b3.f4478a;
                        if (c1182f2.f4507c == i5) {
                            c1182f2.f4507c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f4490f[i6] = null;
                    }
                    this.f4494j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f4485a = false;
        }
    }

    /* renamed from: i */
    public final void m2727i() {
        for (int i2 = 0; i2 < this.f4494j; i2++) {
            C1178b c1178b = this.f4490f[i2];
            c1178b.f4478a.f4509e = c1178b.f4479b;
        }
    }

    /* renamed from: j */
    public final C1182f m2728j(int i2) {
        if (this.f4493i + 1 >= this.f4489e) {
            m2732o();
        }
        C1182f m2719a = m2719a(4);
        int i3 = this.f4486b + 1;
        this.f4486b = i3;
        this.f4493i++;
        m2719a.f4506b = i3;
        m2719a.f4508d = i2;
        ((C1182f[]) this.f4496l.f517d)[i3] = m2719a;
        C1180d c1180d = this.f4487c;
        c1180d.f4503i.f47b = m2719a;
        float[] fArr = m2719a.f4512h;
        Arrays.fill(fArr, 0.0f);
        fArr[m2719a.f4508d] = 1.0f;
        c1180d.m2738j(m2719a);
        return m2719a;
    }

    /* renamed from: k */
    public final C1182f m2729k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f4493i + 1 >= this.f4489e) {
            m2732o();
        }
        if (!(obj instanceof C1202c)) {
            return null;
        }
        C1202c c1202c = (C1202c) obj;
        C1182f c1182f = c1202c.f4600i;
        if (c1182f == null) {
            c1202c.m2791k();
            c1182f = c1202c.f4600i;
        }
        int i2 = c1182f.f4506b;
        C0176h c0176h = this.f4496l;
        if (i2 != -1 && i2 <= this.f4486b && ((C1182f[]) c0176h.f517d)[i2] != null) {
            return c1182f;
        }
        if (i2 != -1) {
            c1182f.m2744c();
        }
        int i3 = this.f4486b + 1;
        this.f4486b = i3;
        this.f4493i++;
        c1182f.f4506b = i3;
        c1182f.f4516l = 1;
        ((C1182f[]) c0176h.f517d)[i3] = c1182f;
        return c1182f;
    }

    /* renamed from: l */
    public final C1178b m2730l() {
        Object obj;
        C0176h c0176h = this.f4496l;
        C0226a c0226a = (C0226a) c0176h.f515b;
        int i2 = c0226a.f669b;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = c0226a.f668a;
            obj = objArr[i3];
            objArr[i3] = null;
            c0226a.f669b = i3;
        } else {
            obj = null;
        }
        C1178b c1178b = (C1178b) obj;
        if (c1178b == null) {
            return new C1178b(c0176h);
        }
        c1178b.f4478a = null;
        c1178b.f4481d.m2702b();
        c1178b.f4479b = 0.0f;
        c1178b.f4482e = false;
        return c1178b;
    }

    /* renamed from: m */
    public final C1182f m2731m() {
        if (this.f4493i + 1 >= this.f4489e) {
            m2732o();
        }
        C1182f m2719a = m2719a(3);
        int i2 = this.f4486b + 1;
        this.f4486b = i2;
        this.f4493i++;
        m2719a.f4506b = i2;
        ((C1182f[]) this.f4496l.f517d)[i2] = m2719a;
        return m2719a;
    }

    /* renamed from: o */
    public final void m2732o() {
        int i2 = this.f4488d * 2;
        this.f4488d = i2;
        this.f4490f = (C1178b[]) Arrays.copyOf(this.f4490f, i2);
        C0176h c0176h = this.f4496l;
        c0176h.f517d = (C1182f[]) Arrays.copyOf((C1182f[]) c0176h.f517d, this.f4488d);
        int i3 = this.f4488d;
        this.f4492h = new boolean[i3];
        this.f4489e = i3;
        this.f4495k = i3;
    }

    /* renamed from: p */
    public final void m2733p() {
        C1180d c1180d = this.f4487c;
        if (c1180d.mo2713e()) {
            m2727i();
            return;
        }
        if (!this.f4491g) {
            m2734q(c1180d);
            return;
        }
        for (int i2 = 0; i2 < this.f4494j; i2++) {
            if (!this.f4490f[i2].f4482e) {
                m2734q(c1180d);
                return;
            }
        }
        m2727i();
    }

    /* renamed from: q */
    public final void m2734q(C1180d c1180d) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f4494j) {
                break;
            }
            C1178b c1178b = this.f4490f[i2];
            int i3 = 1;
            if (c1178b.f4478a.f4516l != 1) {
                float f = 0.0f;
                if (c1178b.f4479b < 0.0f) {
                    boolean z2 = false;
                    int i4 = 0;
                    while (!z2) {
                        i4 += i3;
                        float f2 = Float.MAX_VALUE;
                        int i5 = -1;
                        int i6 = -1;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < this.f4494j) {
                            C1178b c1178b2 = this.f4490f[i7];
                            if (c1178b2.f4478a.f4516l != i3 && !c1178b2.f4482e && c1178b2.f4479b < f) {
                                int m2704d = c1178b2.f4481d.m2704d();
                                int i9 = 0;
                                while (i9 < m2704d) {
                                    C1182f m2705e = c1178b2.f4481d.m2705e(i9);
                                    float m2703c = c1178b2.f4481d.m2703c(m2705e);
                                    if (m2703c > f) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f3 = m2705e.f4511g[i10] / m2703c;
                                            if ((f3 < f2 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i6 = m2705e.f4506b;
                                                i5 = i7;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i9++;
                                    f = 0.0f;
                                }
                            }
                            i7++;
                            f = 0.0f;
                            i3 = 1;
                        }
                        if (i5 != -1) {
                            C1178b c1178b3 = this.f4490f[i5];
                            c1178b3.f4478a.f4507c = -1;
                            c1178b3.m2715g(((C1182f[]) this.f4496l.f517d)[i6]);
                            C1182f c1182f = c1178b3.f4478a;
                            c1182f.f4507c = i5;
                            c1182f.m2746e(this, c1178b3);
                        } else {
                            z2 = true;
                        }
                        if (i4 > this.f4493i / 2) {
                            z2 = true;
                        }
                        f = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        m2735r(c1180d);
        m2727i();
    }

    /* renamed from: r */
    public final void m2735r(C1178b c1178b) {
        boolean z2;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f4493i; i3++) {
            this.f4492h[i3] = false;
        }
        boolean z3 = false;
        int i4 = 0;
        while (!z3) {
            int i5 = 1;
            i4++;
            if (i4 >= this.f4493i * 2) {
                return;
            }
            C1182f c1182f = c1178b.f4478a;
            if (c1182f != null) {
                this.f4492h[c1182f.f4506b] = true;
            }
            C1182f mo2712d = c1178b.mo2712d(this.f4492h);
            if (mo2712d != null) {
                boolean[] zArr = this.f4492h;
                int i6 = mo2712d.f4506b;
                if (zArr[i6]) {
                    return;
                } else {
                    zArr[i6] = true;
                }
            }
            if (mo2712d != null) {
                float f = Float.MAX_VALUE;
                int i7 = i2;
                int i8 = -1;
                while (i7 < this.f4494j) {
                    C1178b c1178b2 = this.f4490f[i7];
                    if (c1178b2.f4478a.f4516l != i5 && !c1178b2.f4482e) {
                        C1177a c1177a = c1178b2.f4481d;
                        int i9 = c1177a.f4475h;
                        if (i9 != -1) {
                            for (int i10 = 0; i9 != -1 && i10 < c1177a.f4468a; i10++) {
                                if (c1177a.f4472e[i9] == mo2712d.f4506b) {
                                    z2 = true;
                                    break;
                                }
                                i9 = c1177a.f4473f[i9];
                            }
                        }
                        z2 = false;
                        if (z2) {
                            float m2703c = c1178b2.f4481d.m2703c(mo2712d);
                            if (m2703c < 0.0f) {
                                float f2 = (-c1178b2.f4479b) / m2703c;
                                if (f2 < f) {
                                    f = f2;
                                    i8 = i7;
                                }
                            }
                        }
                    }
                    i7++;
                    i5 = 1;
                }
                if (i8 > -1) {
                    C1178b c1178b3 = this.f4490f[i8];
                    c1178b3.f4478a.f4507c = -1;
                    c1178b3.m2715g(mo2712d);
                    C1182f c1182f2 = c1178b3.f4478a;
                    c1182f2.f4507c = i8;
                    c1182f2.m2746e(this, c1178b3);
                }
            } else {
                z3 = true;
            }
            i2 = 0;
        }
    }

    /* renamed from: s */
    public final void m2736s() {
        for (int i2 = 0; i2 < this.f4494j; i2++) {
            C1178b c1178b = this.f4490f[i2];
            if (c1178b != null) {
                ((C0226a) this.f4496l.f515b).m631b(c1178b);
            }
            this.f4490f[i2] = null;
        }
    }

    /* renamed from: t */
    public final void m2737t() {
        C0176h c0176h;
        int i2 = 0;
        while (true) {
            c0176h = this.f4496l;
            C1182f[] c1182fArr = (C1182f[]) c0176h.f517d;
            if (i2 >= c1182fArr.length) {
                break;
            }
            C1182f c1182f = c1182fArr[i2];
            if (c1182f != null) {
                c1182f.m2744c();
            }
            i2++;
        }
        C0226a c0226a = (C0226a) c0176h.f516c;
        C1182f[] c1182fArr2 = this.f4497m;
        int i3 = this.f4498n;
        c0226a.getClass();
        if (i3 > c1182fArr2.length) {
            i3 = c1182fArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            C1182f c1182f2 = c1182fArr2[i4];
            int i5 = c0226a.f669b;
            Object[] objArr = c0226a.f668a;
            if (i5 < objArr.length) {
                objArr[i5] = c1182f2;
                c0226a.f669b = i5 + 1;
            }
        }
        this.f4498n = 0;
        Arrays.fill((C1182f[]) c0176h.f517d, (Object) null);
        this.f4486b = 0;
        C1180d c1180d = this.f4487c;
        c1180d.f4502h = 0;
        c1180d.f4479b = 0.0f;
        this.f4493i = 1;
        for (int i6 = 0; i6 < this.f4494j; i6++) {
            C1178b c1178b = this.f4490f[i6];
        }
        m2736s();
        this.f4494j = 0;
        this.f4499o = new C1178b(c0176h);
    }
}
