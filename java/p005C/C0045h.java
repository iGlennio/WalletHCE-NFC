package p005C;

import android.graphics.Path;
import android.util.Log;
import p047Q1.AbstractC0458e;

/* renamed from: C.h */
/* loaded from: classes.dex */
public final class C0045h {

    /* renamed from: a */
    public char f112a;

    /* renamed from: b */
    public final float[] f113b;

    public C0045h(char c2, float[] fArr) {
        this.f112a = c2;
        this.f113b = fArr;
    }

    /* renamed from: a */
    public static void m163a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2, boolean z3) {
        double d2;
        double d3;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = f;
        double d5 = f2;
        double d6 = f5;
        double d7 = ((d5 * sin) + (d4 * cos)) / d6;
        double d8 = f6;
        double d9 = ((d5 * cos) + ((-f) * sin)) / d8;
        double d10 = f4;
        double d11 = ((d10 * sin) + (f3 * cos)) / d6;
        double d12 = ((d10 * cos) + ((-f3) * sin)) / d8;
        double d13 = d7 - d11;
        double d14 = d9 - d12;
        double d15 = (d7 + d11) / 2.0d;
        double d16 = (d9 + d12) / 2.0d;
        double d17 = (d14 * d14) + (d13 * d13);
        if (d17 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d18 = (1.0d / d17) - 0.25d;
        if (d18 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d17);
            float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
            m163a(path, f, f2, f3, f4, f5 * sqrt, sqrt * f6, f7, z2, z3);
            return;
        }
        double sqrt2 = Math.sqrt(d18);
        double d19 = sqrt2 * d13;
        double d20 = sqrt2 * d14;
        if (z2 == z3) {
            d2 = d15 - d20;
            d3 = d16 + d19;
        } else {
            d2 = d15 + d20;
            d3 = d16 - d19;
        }
        double atan2 = Math.atan2(d9 - d3, d7 - d2);
        double atan22 = Math.atan2(d12 - d3, d11 - d2) - atan2;
        if (z3 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d21 = d2 * d6;
        double d22 = d3 * d8;
        double d23 = (d21 * cos) - (d22 * sin);
        double d24 = (d22 * cos) + (d21 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d25 = -d6;
        double d26 = d25 * cos2;
        double d27 = d8 * sin2;
        double d28 = (d26 * sin3) - (d27 * cos3);
        double d29 = d25 * sin2;
        double d30 = d8 * cos2;
        double d31 = atan22 / ceil;
        double d32 = (cos3 * d30) + (sin3 * d29);
        double d33 = d4;
        double d34 = d5;
        int i2 = 0;
        double d35 = atan2;
        while (i2 < ceil) {
            double d36 = d35 + d31;
            double sin4 = Math.sin(d36);
            double cos4 = Math.cos(d36);
            int i3 = ceil;
            double d37 = (((d6 * cos2) * cos4) + d23) - (d27 * sin4);
            double d38 = (d30 * sin4) + (d6 * sin2 * cos4) + d24;
            double d39 = (d26 * sin4) - (d27 * cos4);
            double d40 = (cos4 * d30) + (sin4 * d29);
            double d41 = d36 - d35;
            double tan = Math.tan(d41 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d41)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d28 * sqrt3) + d33), (float) ((d32 * sqrt3) + d34), (float) (d37 - (sqrt3 * d39)), (float) (d38 - (sqrt3 * d40)), (float) d37, (float) d38);
            i2++;
            d34 = d38;
            cos2 = cos2;
            d29 = d29;
            d35 = d36;
            d32 = d40;
            d33 = d37;
            ceil = i3;
            d28 = d39;
            d31 = d31;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m164b(C0045h[] c0045hArr, Path path) {
        int i2;
        int i3;
        C0045h c0045h;
        int i4;
        char c2;
        float f;
        float f2;
        float f3;
        float f4;
        C0045h c0045h2;
        boolean z2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = c0045hArr.length;
        char c3 = 'm';
        int i5 = 0;
        char c4 = 'm';
        int i6 = 0;
        while (i6 < length) {
            C0045h c0045h3 = c0045hArr[i6];
            char c5 = c0045h3.f112a;
            float f13 = fArr[i5];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i2 = 2;
                    break;
            }
            float f19 = f14;
            float f20 = f17;
            float f21 = f18;
            float f22 = f13;
            int i7 = i5;
            while (true) {
                float[] fArr2 = c0045h3.f113b;
                if (i7 < fArr2.length) {
                    int i8 = i5;
                    if (c5 == 'A') {
                        i3 = i7;
                        c0045h = c0045h3;
                        float f23 = f22;
                        float f24 = f19;
                        i4 = i6;
                        c2 = c5;
                        int i9 = i3 + 5;
                        int i10 = i3 + 6;
                        m163a(path, f23, f24, fArr2[i9], fArr2[i10], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f ? 1 : i8, fArr2[i3 + 4] != 0.0f ? 1 : i8);
                        f15 = fArr2[i9];
                        f = fArr2[i10];
                        f16 = f;
                        f2 = f15;
                    } else if (c5 == 'C') {
                        i3 = i7;
                        i4 = i6;
                        c0045h = c0045h3;
                        c2 = c5;
                        int i11 = i3 + 2;
                        int i12 = i3 + 3;
                        int i13 = i3 + 4;
                        int i14 = i3 + 5;
                        path2.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        float f25 = fArr2[i13];
                        float f26 = fArr2[i14];
                        f15 = fArr2[i11];
                        f16 = fArr2[i12];
                        f = f26;
                        f2 = f25;
                    } else if (c5 != 'H') {
                        if (c5 == 'Q') {
                            i3 = i7;
                            i4 = i6;
                            c0045h = c0045h3;
                            c2 = c5;
                            int i15 = i3 + 1;
                            int i16 = i3 + 2;
                            int i17 = i3 + 3;
                            path2.quadTo(fArr2[i3], fArr2[i15], fArr2[i16], fArr2[i17]);
                            f3 = fArr2[i3];
                            float f27 = fArr2[i15];
                            f4 = fArr2[i16];
                            f16 = f27;
                            f = fArr2[i17];
                        } else if (c5 == 'V') {
                            i3 = i7;
                            i4 = i6;
                            c0045h = c0045h3;
                            f2 = f22;
                            c2 = c5;
                            path2.lineTo(f2, fArr2[i3]);
                            f = fArr2[i3];
                        } else if (c5 != 'a') {
                            if (c5 == 'c') {
                                i3 = i7;
                                int i18 = i3 + 2;
                                int i19 = i3 + 3;
                                int i20 = i3 + 4;
                                int i21 = i3 + 5;
                                path2.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i18], fArr2[i19], fArr2[i20], fArr2[i21]);
                                float f28 = fArr2[i18] + f22;
                                float f29 = f19 + fArr2[i19];
                                f22 += fArr2[i20];
                                f19 += fArr2[i21];
                                f15 = f28;
                                f16 = f29;
                            } else if (c5 != 'h') {
                                if (c5 != 'q') {
                                    if (c5 != 'v') {
                                        if (c5 == 'L') {
                                            i3 = i7;
                                            int i22 = i3 + 1;
                                            path2.lineTo(fArr2[i3], fArr2[i22]);
                                            f2 = fArr2[i3];
                                            f = fArr2[i22];
                                        } else if (c5 == 'M') {
                                            i3 = i7;
                                            f2 = fArr2[i3];
                                            f = fArr2[i3 + 1];
                                            if (i3 > 0) {
                                                path2.lineTo(f2, f);
                                            } else {
                                                path2.moveTo(f2, f);
                                                f20 = f2;
                                                f21 = f;
                                            }
                                        } else if (c5 == 'S') {
                                            i3 = i7;
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f22 = (f22 * 2.0f) - f15;
                                                f19 = (f19 * 2.0f) - f16;
                                            }
                                            float f30 = f22;
                                            float f31 = f19;
                                            int i23 = i3 + 1;
                                            int i24 = i3 + 2;
                                            int i25 = i3 + 3;
                                            path2.cubicTo(f30, f31, fArr2[i3], fArr2[i23], fArr2[i24], fArr2[i25]);
                                            f3 = fArr2[i3];
                                            float f32 = fArr2[i23];
                                            f4 = fArr2[i24];
                                            f16 = f32;
                                            f = fArr2[i25];
                                            i4 = i6;
                                            c0045h = c0045h3;
                                            c2 = c5;
                                        } else if (c5 == 'T') {
                                            i3 = i7;
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f22 = (f22 * 2.0f) - f15;
                                                f19 = (f19 * 2.0f) - f16;
                                            }
                                            float f33 = f19;
                                            float f34 = fArr2[i3];
                                            int i26 = i3 + 1;
                                            path2.quadTo(f22, f33, f34, fArr2[i26]);
                                            f16 = f33;
                                            f2 = fArr2[i3];
                                            f = fArr2[i26];
                                            i4 = i6;
                                            c0045h = c0045h3;
                                            f15 = f22;
                                            c2 = c5;
                                        } else if (c5 == 'l') {
                                            i3 = i7;
                                            int i27 = i3 + 1;
                                            path2.rLineTo(fArr2[i3], fArr2[i27]);
                                            f22 += fArr2[i3];
                                            f8 = fArr2[i27];
                                        } else if (c5 == c3) {
                                            i3 = i7;
                                            float f35 = fArr2[i3];
                                            f22 += f35;
                                            float f36 = fArr2[i3 + 1];
                                            f19 += f36;
                                            if (i3 > 0) {
                                                path2.rLineTo(f35, f36);
                                            } else {
                                                path2.rMoveTo(f35, f36);
                                                c0045h = c0045h3;
                                                f2 = f22;
                                                f20 = f2;
                                                f = f19;
                                                f21 = f;
                                                i4 = i6;
                                                c2 = c5;
                                            }
                                        } else if (c5 == 's') {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f9 = f19 - f16;
                                                f10 = f22 - f15;
                                            } else {
                                                f10 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i28 = i7 + 1;
                                            int i29 = i7 + 2;
                                            int i30 = i7 + 3;
                                            i3 = i7;
                                            path2.rCubicTo(f10, f9, fArr2[i7], fArr2[i28], fArr2[i29], fArr2[i30]);
                                            f5 = fArr2[i3] + f22;
                                            f6 = f19 + fArr2[i28];
                                            f22 += fArr2[i29];
                                            f7 = fArr2[i30];
                                        } else if (c5 != 't') {
                                            i3 = i7;
                                        } else {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f11 = f22 - f15;
                                                f12 = f19 - f16;
                                            } else {
                                                f12 = 0.0f;
                                                f11 = 0.0f;
                                            }
                                            int i31 = i7 + 1;
                                            path2.rQuadTo(f11, f12, fArr2[i7], fArr2[i31]);
                                            float f37 = f11 + f22;
                                            float f38 = f19 + f12;
                                            float f39 = f22 + fArr2[i7];
                                            f19 += fArr2[i31];
                                            f16 = f38;
                                            i3 = i7;
                                            c0045h = c0045h3;
                                            f2 = f39;
                                            f15 = f37;
                                            f = f19;
                                            i4 = i6;
                                            c2 = c5;
                                        }
                                        i4 = i6;
                                        c0045h = c0045h3;
                                        c2 = c5;
                                    } else {
                                        i3 = i7;
                                        path2.rLineTo(0.0f, fArr2[i3]);
                                        f8 = fArr2[i3];
                                    }
                                    f19 += f8;
                                } else {
                                    i3 = i7;
                                    int i32 = i3 + 1;
                                    int i33 = i3 + 2;
                                    int i34 = i3 + 3;
                                    path2.rQuadTo(fArr2[i3], fArr2[i32], fArr2[i33], fArr2[i34]);
                                    f5 = fArr2[i3] + f22;
                                    f6 = f19 + fArr2[i32];
                                    f22 += fArr2[i33];
                                    f7 = fArr2[i34];
                                }
                                f19 += f7;
                                f15 = f5;
                                f16 = f6;
                            } else {
                                i3 = i7;
                                path2.rLineTo(fArr2[i3], 0.0f);
                                f22 += fArr2[i3];
                            }
                            c0045h = c0045h3;
                            f2 = f22;
                            f = f19;
                            i4 = i6;
                            c2 = c5;
                        } else {
                            i3 = i7;
                            int i35 = i3 + 5;
                            float f40 = fArr2[i35] + f22;
                            int i36 = i3 + 6;
                            float f41 = fArr2[i36] + f19;
                            float f42 = fArr2[i3];
                            float f43 = fArr2[i3 + 1];
                            float f44 = fArr2[i3 + 2];
                            if (fArr2[i3 + 3] != 0.0f) {
                                c0045h2 = c0045h3;
                                z2 = 1;
                            } else {
                                c0045h2 = c0045h3;
                                z2 = i8;
                            }
                            c0045h = c0045h2;
                            float f45 = f22;
                            c2 = c5;
                            float f46 = f19;
                            i4 = i6;
                            m163a(path, f45, f46, f40, f41, f42, f43, f44, z2, fArr2[i3 + 4] != 0.0f ? 1 : i8);
                            f2 = f45 + fArr2[i35];
                            f = f46 + fArr2[i36];
                            f15 = f2;
                            f16 = f;
                        }
                        f15 = f3;
                        f2 = f4;
                    } else {
                        i3 = i7;
                        c0045h = c0045h3;
                        c2 = c5;
                        f = f19;
                        i4 = i6;
                        path2.lineTo(fArr2[i3], f);
                        f2 = fArr2[i3];
                    }
                    c5 = c2;
                    c0045h3 = c0045h;
                    i6 = i4;
                    i5 = i8;
                    c3 = 'm';
                    f22 = f2;
                    f19 = f;
                    c4 = c5;
                    i7 = i3 + i2;
                    path2 = path;
                }
            }
            int i37 = i5;
            fArr[i37] = f22;
            fArr[1] = f19;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f20;
            fArr[5] = f21;
            c4 = c0045h3.f112a;
            i6++;
            path2 = path;
            i5 = i37;
            c3 = 'm';
        }
    }

    public C0045h(C0045h c0045h) {
        this.f112a = c0045h.f112a;
        float[] fArr = c0045h.f113b;
        this.f113b = AbstractC0458e.m1197o(fArr, fArr.length);
    }
}
