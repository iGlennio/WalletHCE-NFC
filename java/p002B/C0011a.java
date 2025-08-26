package p002B;

import android.graphics.Color;
import p005C.AbstractC0038a;

/* renamed from: B.a */
/* loaded from: classes.dex */
public final class C0011a {

    /* renamed from: a */
    public final float f21a;

    /* renamed from: b */
    public final float f22b;

    /* renamed from: c */
    public final float f23c;

    /* renamed from: d */
    public final float f24d;

    /* renamed from: e */
    public final float f25e;

    /* renamed from: f */
    public final float f26f;

    public C0011a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f21a = f;
        this.f22b = f2;
        this.f23c = f3;
        this.f24d = f4;
        this.f25e = f5;
        this.f26f = f6;
    }

    /* renamed from: a */
    public static C0011a m30a(int i2) {
        C0028r c0028r = C0028r.f63k;
        float m36e = AbstractC0012b.m36e(Color.red(i2));
        float m36e2 = AbstractC0012b.m36e(Color.green(i2));
        float m36e3 = AbstractC0012b.m36e(Color.blue(i2));
        float[][] fArr = AbstractC0012b.f30d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * m36e3) + (fArr2[1] * m36e2) + (fArr2[0] * m36e);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * m36e3) + (fArr3[1] * m36e2) + (fArr3[0] * m36e);
        float[] fArr4 = fArr[2];
        float f3 = (m36e3 * fArr4[2]) + (m36e2 * fArr4[1]) + (m36e * fArr4[0]);
        float[][] fArr5 = AbstractC0012b.f27a;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = c0028r.f70g;
        float f7 = fArr9[0] * f4;
        float f8 = fArr9[1] * f5;
        float f9 = fArr9[2] * f6;
        float abs = Math.abs(f7);
        float f10 = c0028r.f71h;
        float pow = (float) Math.pow((abs * f10) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f8) * f10) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f9) * f10) / 100.0d, 0.42d);
        float signum = ((Math.signum(f7) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = signum3;
        float f11 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d2)) / 11.0f;
        float f12 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = ((21.0f * signum3) + ((signum * 20.0f) + f13)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = atan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float f18 = f15 * c0028r.f65b;
        float f19 = c0028r.f64a;
        float f20 = c0028r.f67d;
        float pow4 = ((float) Math.pow(f18 / f19, c0028r.f73j * f20)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f21 = f19 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0028r.f69f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f16) < 20.14d ? f16 + 360.0f : f16) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0028r.f68e) * c0028r.f66c) * ((float) Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f22 = c0028r.f72i * pow5;
        Math.sqrt((r3 * f20) / f21);
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f17;
        return new C0011a(f16, pow5, pow4, f23, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* renamed from: b */
    public static C0011a m31b(float f, float f2, float f3) {
        C0028r c0028r = C0028r.f63k;
        float f4 = c0028r.f67d;
        Math.sqrt(f / 100.0d);
        float f5 = c0028r.f64a + 4.0f;
        float f6 = c0028r.f72i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * c0028r.f67d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C0011a(f3, f2, f, f7, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: c */
    public final int m32c(C0028r c0028r) {
        float f;
        float f2 = this.f22b;
        double d2 = f2;
        float f3 = this.f23c;
        if (d2 != 0.0d) {
            double d3 = f3;
            if (d3 != 0.0d) {
                f = f2 / ((float) Math.sqrt(d3 / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c0028r.f69f), 0.73d), 1.1111111111111112d);
                double d4 = (this.f21a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d4) + 3.8d)) * 0.25f;
                float pow2 = c0028r.f64a * ((float) Math.pow(f3 / 100.0d, (1.0d / c0028r.f67d) / c0028r.f73j));
                float f4 = cos * 3846.1538f * c0028r.f68e * c0028r.f66c;
                float f5 = pow2 / c0028r.f65b;
                float sin = (float) Math.sin(d4);
                float cos2 = (float) Math.cos(d4);
                float f6 = (((0.305f + f5) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f4 * 23.0f)));
                float f7 = cos2 * f6;
                float f8 = f6 * sin;
                float f9 = f5 * 460.0f;
                float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
                float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
                float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10)));
                float signum = Math.signum(f10);
                float f13 = 100.0f / c0028r.f71h;
                float pow3 = signum * f13 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f11) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
                float signum3 = Math.signum(f12) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float[] fArr = c0028r.f70g;
                float f14 = pow3 / fArr[0];
                float f15 = signum2 / fArr[1];
                float f16 = signum3 / fArr[2];
                float[][] fArr2 = AbstractC0012b.f28b;
                float[] fArr3 = fArr2[0];
                float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
                float[] fArr4 = fArr2[1];
                float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
                float[] fArr5 = fArr2[2];
                return AbstractC0038a.m109a(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c0028r.f69f), 0.73d), 1.1111111111111112d);
        double d42 = (this.f21a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d42) + 3.8d)) * 0.25f;
        float pow22 = c0028r.f64a * ((float) Math.pow(f3 / 100.0d, (1.0d / c0028r.f67d) / c0028r.f73j));
        float f42 = cos3 * 3846.1538f * c0028r.f68e * c0028r.f66c;
        float f52 = pow22 / c0028r.f65b;
        float sin2 = (float) Math.sin(d42);
        float cos22 = (float) Math.cos(d42);
        float f62 = (((0.305f + f52) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f42 * 23.0f)));
        float f72 = cos22 * f62;
        float f82 = f62 * sin2;
        float f92 = f52 * 460.0f;
        float f102 = ((288.0f * f82) + ((451.0f * f72) + f92)) / 1403.0f;
        float f112 = ((f92 - (891.0f * f72)) - (261.0f * f82)) / 1403.0f;
        float f122 = ((f92 - (f72 * 220.0f)) - (f82 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102)));
        float signum4 = Math.signum(f102);
        float f132 = 100.0f / c0028r.f71h;
        float pow32 = signum4 * f132 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f112) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d));
        float signum32 = Math.signum(f122) * f132 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float[] fArr6 = c0028r.f70g;
        float f142 = pow32 / fArr6[0];
        float f152 = signum22 / fArr6[1];
        float f162 = signum32 / fArr6[2];
        float[][] fArr22 = AbstractC0012b.f28b;
        float[] fArr32 = fArr22[0];
        float f172 = (fArr32[2] * f162) + (fArr32[1] * f152) + (fArr32[0] * f142);
        float[] fArr42 = fArr22[1];
        float f182 = (fArr42[2] * f162) + (fArr42[1] * f152) + (fArr42[0] * f142);
        float[] fArr52 = fArr22[2];
        return AbstractC0038a.m109a(f172, f182, (f162 * fArr52[2]) + (f152 * fArr52[1]) + (f142 * fArr52[0]));
    }
}
