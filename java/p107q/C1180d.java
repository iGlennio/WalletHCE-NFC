package p107q;

import java.util.Arrays;
import p002B.C0019i;
import p014F0.C0129F;

/* renamed from: q.d */
/* loaded from: classes.dex */
public final class C1180d extends C1178b {

    /* renamed from: f */
    public C1182f[] f4500f;

    /* renamed from: g */
    public C1182f[] f4501g;

    /* renamed from: h */
    public int f4502h;

    /* renamed from: i */
    public C0019i f4503i;

    @Override // p107q.C1178b
    /* renamed from: d */
    public final C1182f mo2712d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f4502h; i3++) {
            C1182f[] c1182fArr = this.f4500f;
            C1182f c1182f = c1182fArr[i3];
            if (!zArr[c1182f.f4506b]) {
                C0019i c0019i = this.f4503i;
                c0019i.f47b = c1182f;
                int i4 = 8;
                if (i2 == -1) {
                    while (i4 >= 0) {
                        float f = ((C1182f) c0019i.f47b).f4512h[i4];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i2 = i3;
                                break;
                            }
                            i4--;
                        }
                    }
                } else {
                    C1182f c1182f2 = c1182fArr[i2];
                    while (true) {
                        if (i4 >= 0) {
                            float f2 = c1182f2.f4512h[i4];
                            float f3 = ((C1182f) c0019i.f47b).f4512h[i4];
                            if (f3 == f2) {
                                i4--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f4500f[i2];
    }

    @Override // p107q.C1178b
    /* renamed from: e */
    public final boolean mo2713e() {
        return this.f4502h == 0;
    }

    @Override // p107q.C1178b
    /* renamed from: i */
    public final void mo2717i(C1179c c1179c, C1178b c1178b, boolean z2) {
        C1182f c1182f = c1178b.f4478a;
        if (c1182f == null) {
            return;
        }
        C1177a c1177a = c1178b.f4481d;
        int m2704d = c1177a.m2704d();
        for (int i2 = 0; i2 < m2704d; i2++) {
            C1182f m2705e = c1177a.m2705e(i2);
            float m2706f = c1177a.m2706f(i2);
            C0019i c0019i = this.f4503i;
            c0019i.f47b = m2705e;
            boolean z3 = m2705e.f4505a;
            float[] fArr = c1182f.f4512h;
            if (z3) {
                boolean z4 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr2 = ((C1182f) c0019i.f47b).f4512h;
                    float f = (fArr[i3] * m2706f) + fArr2[i3];
                    fArr2[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C1182f) c0019i.f47b).f4512h[i3] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((C1180d) c0019i.f48c).m2739k((C1182f) c0019i.f47b);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = fArr[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * m2706f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C1182f) c0019i.f47b).f4512h[i4] = f3;
                    } else {
                        ((C1182f) c0019i.f47b).f4512h[i4] = 0.0f;
                    }
                }
                m2738j(m2705e);
            }
            this.f4479b = (c1178b.f4479b * m2706f) + this.f4479b;
        }
        m2739k(c1182f);
    }

    /* renamed from: j */
    public final void m2738j(C1182f c1182f) {
        int i2;
        int i3 = this.f4502h + 1;
        C1182f[] c1182fArr = this.f4500f;
        if (i3 > c1182fArr.length) {
            C1182f[] c1182fArr2 = (C1182f[]) Arrays.copyOf(c1182fArr, c1182fArr.length * 2);
            this.f4500f = c1182fArr2;
            this.f4501g = (C1182f[]) Arrays.copyOf(c1182fArr2, c1182fArr2.length * 2);
        }
        C1182f[] c1182fArr3 = this.f4500f;
        int i4 = this.f4502h;
        c1182fArr3[i4] = c1182f;
        int i5 = i4 + 1;
        this.f4502h = i5;
        if (i5 > 1 && c1182fArr3[i4].f4506b > c1182f.f4506b) {
            int i6 = 0;
            while (true) {
                i2 = this.f4502h;
                if (i6 >= i2) {
                    break;
                }
                this.f4501g[i6] = this.f4500f[i6];
                i6++;
            }
            Arrays.sort(this.f4501g, 0, i2, new C0129F(3));
            for (int i7 = 0; i7 < this.f4502h; i7++) {
                this.f4500f[i7] = this.f4501g[i7];
            }
        }
        c1182f.f4505a = true;
        c1182f.m2742a(this);
    }

    /* renamed from: k */
    public final void m2739k(C1182f c1182f) {
        int i2 = 0;
        while (i2 < this.f4502h) {
            if (this.f4500f[i2] == c1182f) {
                while (true) {
                    int i3 = this.f4502h;
                    if (i2 >= i3 - 1) {
                        this.f4502h = i3 - 1;
                        c1182f.f4505a = false;
                        return;
                    } else {
                        C1182f[] c1182fArr = this.f4500f;
                        int i4 = i2 + 1;
                        c1182fArr[i2] = c1182fArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // p107q.C1178b
    public final String toString() {
        String str = " goal -> (" + this.f4479b + ") : ";
        for (int i2 = 0; i2 < this.f4502h; i2++) {
            C1182f c1182f = this.f4500f[i2];
            C0019i c0019i = this.f4503i;
            c0019i.f47b = c1182f;
            str = str + c0019i + " ";
        }
        return str;
    }
}
