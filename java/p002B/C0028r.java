package p002B;

/* renamed from: B.r */
/* loaded from: classes.dex */
public final class C0028r {

    /* renamed from: k */
    public static final C0028r f63k;

    /* renamed from: a */
    public final float f64a;

    /* renamed from: b */
    public final float f65b;

    /* renamed from: c */
    public final float f66c;

    /* renamed from: d */
    public final float f67d;

    /* renamed from: e */
    public final float f68e;

    /* renamed from: f */
    public final float f69f;

    /* renamed from: g */
    public final float[] f70g;

    /* renamed from: h */
    public final float f71h;

    /* renamed from: i */
    public final float f72i;

    /* renamed from: j */
    public final float f73j;

    static {
        float[] fArr = AbstractC0012b.f29c;
        float m41l = (float) ((AbstractC0012b.m41l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC0012b.f27a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-m41l) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float f10 = 1.0f / ((5.0f * m41l) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float cbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(m41l * 5.0d))) + (f11 * m41l);
        float m41l2 = AbstractC0012b.m41l() / fArr[1];
        double d3 = m41l2;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f13 = fArr6[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr6[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr6[2];
        float[] fArr7 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        f63k = new C0028r(m41l2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f9, 1.0f, new float[]{(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C0028r(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f69f = f;
        this.f64a = f2;
        this.f65b = f3;
        this.f66c = f4;
        this.f67d = f5;
        this.f68e = f6;
        this.f70g = fArr;
        this.f71h = f7;
        this.f72i = f8;
        this.f73j = f9;
    }
}
