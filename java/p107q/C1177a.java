package p107q;

import java.util.Arrays;
import p005C.AbstractC0044g;
import p017G0.C0176h;

/* renamed from: q.a */
/* loaded from: classes.dex */
public final class C1177a {

    /* renamed from: b */
    public final C1178b f4469b;

    /* renamed from: c */
    public final C0176h f4470c;

    /* renamed from: a */
    public int f4468a = 0;

    /* renamed from: d */
    public int f4471d = 8;

    /* renamed from: e */
    public int[] f4472e = new int[8];

    /* renamed from: f */
    public int[] f4473f = new int[8];

    /* renamed from: g */
    public float[] f4474g = new float[8];

    /* renamed from: h */
    public int f4475h = -1;

    /* renamed from: i */
    public int f4476i = -1;

    /* renamed from: j */
    public boolean f4477j = false;

    public C1177a(C1178b c1178b, C0176h c0176h) {
        this.f4469b = c1178b;
        this.f4470c = c0176h;
    }

    /* renamed from: a */
    public final void m2701a(C1182f c1182f, float f, boolean z2) {
        if (f <= -0.001f || f >= 0.001f) {
            int i2 = this.f4475h;
            C1178b c1178b = this.f4469b;
            if (i2 == -1) {
                this.f4475h = 0;
                this.f4474g[0] = f;
                this.f4472e[0] = c1182f.f4506b;
                this.f4473f[0] = -1;
                c1182f.f4515k++;
                c1182f.m2742a(c1178b);
                this.f4468a++;
                if (this.f4477j) {
                    return;
                }
                int i3 = this.f4476i + 1;
                this.f4476i = i3;
                int[] iArr = this.f4472e;
                if (i3 >= iArr.length) {
                    this.f4477j = true;
                    this.f4476i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f4468a; i5++) {
                int i6 = this.f4472e[i2];
                int i7 = c1182f.f4506b;
                if (i6 == i7) {
                    float[] fArr = this.f4474g;
                    float f2 = fArr[i2] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i2] = f2;
                    if (f2 == 0.0f) {
                        if (i2 == this.f4475h) {
                            this.f4475h = this.f4473f[i2];
                        } else {
                            int[] iArr2 = this.f4473f;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            c1182f.m2743b(c1178b);
                        }
                        if (this.f4477j) {
                            this.f4476i = i2;
                        }
                        c1182f.f4515k--;
                        this.f4468a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f4473f[i2];
            }
            int i8 = this.f4476i;
            int i9 = i8 + 1;
            if (this.f4477j) {
                int[] iArr3 = this.f4472e;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.f4472e;
            if (i8 >= iArr4.length && this.f4468a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.f4472e;
                    if (i10 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i10] == -1) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
            }
            int[] iArr6 = this.f4472e;
            if (i8 >= iArr6.length) {
                i8 = iArr6.length;
                int i11 = this.f4471d * 2;
                this.f4471d = i11;
                this.f4477j = false;
                this.f4476i = i8 - 1;
                this.f4474g = Arrays.copyOf(this.f4474g, i11);
                this.f4472e = Arrays.copyOf(this.f4472e, this.f4471d);
                this.f4473f = Arrays.copyOf(this.f4473f, this.f4471d);
            }
            this.f4472e[i8] = c1182f.f4506b;
            this.f4474g[i8] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f4473f;
                iArr7[i8] = iArr7[i4];
                iArr7[i4] = i8;
            } else {
                this.f4473f[i8] = this.f4475h;
                this.f4475h = i8;
            }
            c1182f.f4515k++;
            c1182f.m2742a(c1178b);
            this.f4468a++;
            if (!this.f4477j) {
                this.f4476i++;
            }
            int i12 = this.f4476i;
            int[] iArr8 = this.f4472e;
            if (i12 >= iArr8.length) {
                this.f4477j = true;
                this.f4476i = iArr8.length - 1;
            }
        }
    }

    /* renamed from: b */
    public final void m2702b() {
        int i2 = this.f4475h;
        for (int i3 = 0; i2 != -1 && i3 < this.f4468a; i3++) {
            C1182f c1182f = ((C1182f[]) this.f4470c.f517d)[this.f4472e[i2]];
            if (c1182f != null) {
                c1182f.m2743b(this.f4469b);
            }
            i2 = this.f4473f[i2];
        }
        this.f4475h = -1;
        this.f4476i = -1;
        this.f4477j = false;
        this.f4468a = 0;
    }

    /* renamed from: c */
    public final float m2703c(C1182f c1182f) {
        int i2 = this.f4475h;
        for (int i3 = 0; i2 != -1 && i3 < this.f4468a; i3++) {
            if (this.f4472e[i2] == c1182f.f4506b) {
                return this.f4474g[i2];
            }
            i2 = this.f4473f[i2];
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final int m2704d() {
        return this.f4468a;
    }

    /* renamed from: e */
    public final C1182f m2705e(int i2) {
        int i3 = this.f4475h;
        for (int i4 = 0; i3 != -1 && i4 < this.f4468a; i4++) {
            if (i4 == i2) {
                return ((C1182f[]) this.f4470c.f517d)[this.f4472e[i3]];
            }
            i3 = this.f4473f[i3];
        }
        return null;
    }

    /* renamed from: f */
    public final float m2706f(int i2) {
        int i3 = this.f4475h;
        for (int i4 = 0; i3 != -1 && i4 < this.f4468a; i4++) {
            if (i4 == i2) {
                return this.f4474g[i3];
            }
            i3 = this.f4473f[i3];
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final void m2707g(C1182f c1182f, float f) {
        if (f == 0.0f) {
            m2708h(c1182f, true);
            return;
        }
        int i2 = this.f4475h;
        C1178b c1178b = this.f4469b;
        if (i2 == -1) {
            this.f4475h = 0;
            this.f4474g[0] = f;
            this.f4472e[0] = c1182f.f4506b;
            this.f4473f[0] = -1;
            c1182f.f4515k++;
            c1182f.m2742a(c1178b);
            this.f4468a++;
            if (this.f4477j) {
                return;
            }
            int i3 = this.f4476i + 1;
            this.f4476i = i3;
            int[] iArr = this.f4472e;
            if (i3 >= iArr.length) {
                this.f4477j = true;
                this.f4476i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f4468a; i5++) {
            int i6 = this.f4472e[i2];
            int i7 = c1182f.f4506b;
            if (i6 == i7) {
                this.f4474g[i2] = f;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f4473f[i2];
        }
        int i8 = this.f4476i;
        int i9 = i8 + 1;
        if (this.f4477j) {
            int[] iArr2 = this.f4472e;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.f4472e;
        if (i8 >= iArr3.length && this.f4468a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.f4472e;
                if (i10 >= iArr4.length) {
                    break;
                }
                if (iArr4[i10] == -1) {
                    i8 = i10;
                    break;
                }
                i10++;
            }
        }
        int[] iArr5 = this.f4472e;
        if (i8 >= iArr5.length) {
            i8 = iArr5.length;
            int i11 = this.f4471d * 2;
            this.f4471d = i11;
            this.f4477j = false;
            this.f4476i = i8 - 1;
            this.f4474g = Arrays.copyOf(this.f4474g, i11);
            this.f4472e = Arrays.copyOf(this.f4472e, this.f4471d);
            this.f4473f = Arrays.copyOf(this.f4473f, this.f4471d);
        }
        this.f4472e[i8] = c1182f.f4506b;
        this.f4474g[i8] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f4473f;
            iArr6[i8] = iArr6[i4];
            iArr6[i4] = i8;
        } else {
            this.f4473f[i8] = this.f4475h;
            this.f4475h = i8;
        }
        c1182f.f4515k++;
        c1182f.m2742a(c1178b);
        int i12 = this.f4468a + 1;
        this.f4468a = i12;
        if (!this.f4477j) {
            this.f4476i++;
        }
        int[] iArr7 = this.f4472e;
        if (i12 >= iArr7.length) {
            this.f4477j = true;
        }
        if (this.f4476i >= iArr7.length) {
            this.f4477j = true;
            this.f4476i = iArr7.length - 1;
        }
    }

    /* renamed from: h */
    public final float m2708h(C1182f c1182f, boolean z2) {
        int i2 = this.f4475h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f4468a) {
            if (this.f4472e[i2] == c1182f.f4506b) {
                if (i2 == this.f4475h) {
                    this.f4475h = this.f4473f[i2];
                } else {
                    int[] iArr = this.f4473f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    c1182f.m2743b(this.f4469b);
                }
                c1182f.f4515k--;
                this.f4468a--;
                this.f4472e[i2] = -1;
                if (this.f4477j) {
                    this.f4476i = i2;
                }
                return this.f4474g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f4473f[i2];
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.f4475h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f4468a; i3++) {
            str = (AbstractC0044g.m154f(str, " -> ") + this.f4474g[i2] + " : ") + ((C1182f[]) this.f4470c.f517d)[this.f4472e[i2]];
            i2 = this.f4473f[i2];
        }
        return str;
    }
}
