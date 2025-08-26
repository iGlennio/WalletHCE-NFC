package p091k0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import p001A1.C0010i;
import p005C.C0045h;
import p101o.C1152b;

/* renamed from: k0.m */
/* loaded from: classes.dex */
public final class C1099m {

    /* renamed from: p */
    public static final Matrix f4271p = new Matrix();

    /* renamed from: a */
    public final Path f4272a;

    /* renamed from: b */
    public final Path f4273b;

    /* renamed from: c */
    public final Matrix f4274c;

    /* renamed from: d */
    public Paint f4275d;

    /* renamed from: e */
    public Paint f4276e;

    /* renamed from: f */
    public PathMeasure f4277f;

    /* renamed from: g */
    public final C1096j f4278g;

    /* renamed from: h */
    public float f4279h;

    /* renamed from: i */
    public float f4280i;

    /* renamed from: j */
    public float f4281j;

    /* renamed from: k */
    public float f4282k;

    /* renamed from: l */
    public int f4283l;

    /* renamed from: m */
    public String f4284m;

    /* renamed from: n */
    public Boolean f4285n;

    /* renamed from: o */
    public final C1152b f4286o;

    public C1099m() {
        this.f4274c = new Matrix();
        this.f4279h = 0.0f;
        this.f4280i = 0.0f;
        this.f4281j = 0.0f;
        this.f4282k = 0.0f;
        this.f4283l = 255;
        this.f4284m = null;
        this.f4285n = null;
        this.f4286o = new C1152b();
        this.f4278g = new C1096j();
        this.f4272a = new Path();
        this.f4273b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m2617a(C1096j c1096j, Matrix matrix, Canvas canvas, int i2, int i3) {
        char c2;
        float f;
        float f2;
        int i4;
        C1096j c1096j2 = c1096j;
        char c3 = 1;
        c1096j2.f4257a.set(matrix);
        Matrix matrix2 = c1096j2.f4257a;
        matrix2.preConcat(c1096j2.f4266j);
        canvas.save();
        char c4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c1096j2.f4258b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC1097k abstractC1097k = (AbstractC1097k) arrayList.get(i5);
            if (abstractC1097k instanceof C1096j) {
                m2617a((C1096j) abstractC1097k, matrix2, canvas, i2, i3);
            } else if (abstractC1097k instanceof AbstractC1098l) {
                AbstractC1098l abstractC1098l = (AbstractC1098l) abstractC1097k;
                float f3 = i2 / this.f4281j;
                float f4 = i3 / this.f4282k;
                float min = Math.min(f3, f4);
                Matrix matrix3 = this.f4274c;
                matrix3.set(matrix2);
                matrix3.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c4], fArr[c3]);
                boolean z2 = c3;
                boolean z3 = c4;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z3 ? 1 : 0] * fArr[3]) - (fArr[z2 ? 1 : 0] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f4272a;
                    abstractC1098l.getClass();
                    path.reset();
                    C0045h[] c0045hArr = abstractC1098l.f4268a;
                    if (c0045hArr != null) {
                        C0045h.m164b(c0045hArr, path);
                    }
                    Path path2 = this.f4273b;
                    path2.reset();
                    if (abstractC1098l instanceof C1094h) {
                        path2.setFillType(abstractC1098l.f4270c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        C1095i c1095i = (C1095i) abstractC1098l;
                        float f6 = c1095i.f4251i;
                        if (f6 != 0.0f || c1095i.f4252j != 1.0f) {
                            float f7 = c1095i.f4253k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c1095i.f4252j + f7) % 1.0f;
                            if (this.f4277f == null) {
                                this.f4277f = new PathMeasure();
                            }
                            this.f4277f.setPath(path, z3);
                            float length = this.f4277f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            if (f10 > f11) {
                                this.f4277f.getSegment(f10, length, path, z2);
                                f = 0.0f;
                                this.f4277f.getSegment(0.0f, f11, path, z2);
                            } else {
                                f = 0.0f;
                                this.f4277f.getSegment(f10, f11, path, z2);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix3);
                        C0010i c0010i = c1095i.f4248f;
                        if ((((Shader) c0010i.f19c) == null && c0010i.f18b == 0) ? false : true) {
                            if (this.f4276e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.f4276e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.f4276e;
                            Shader shader = (Shader) c0010i.f19c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c1095i.f4250h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = c0010i.f18b;
                                float f12 = c1095i.f4250h;
                                PorterDuff.Mode mode = C1102p.f4300j;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c1095i.f4270c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f2 = 255.0f;
                            i4 = 16777215;
                        }
                        C0010i c0010i2 = c1095i.f4246d;
                        if (((Shader) c0010i2.f19c) != null || c0010i2.f18b != 0) {
                            if (this.f4275d == null) {
                                Paint paint3 = new Paint(1);
                                this.f4275d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f4275d;
                            Paint.Join join = c1095i.f4255m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c1095i.f4254l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c1095i.f4256n);
                            Shader shader2 = (Shader) c0010i2.f19c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c1095i.f4249g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = c0010i2.f18b;
                                float f13 = c1095i.f4249g;
                                PorterDuff.Mode mode2 = C1102p.f4300j;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c1095i.f4247e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c2 = 1;
                i5++;
                c1096j2 = c1096j;
                c3 = c2;
                c4 = 0;
            }
            c2 = c3;
            i5++;
            c1096j2 = c1096j;
            c3 = c2;
            c4 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f4283l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f4283l = i2;
    }

    public C1099m(C1099m c1099m) {
        this.f4274c = new Matrix();
        this.f4279h = 0.0f;
        this.f4280i = 0.0f;
        this.f4281j = 0.0f;
        this.f4282k = 0.0f;
        this.f4283l = 255;
        this.f4284m = null;
        this.f4285n = null;
        C1152b c1152b = new C1152b();
        this.f4286o = c1152b;
        this.f4278g = new C1096j(c1099m.f4278g, c1152b);
        this.f4272a = new Path(c1099m.f4272a);
        this.f4273b = new Path(c1099m.f4273b);
        this.f4279h = c1099m.f4279h;
        this.f4280i = c1099m.f4280i;
        this.f4281j = c1099m.f4281j;
        this.f4282k = c1099m.f4282k;
        this.f4283l = c1099m.f4283l;
        this.f4284m = c1099m.f4284m;
        String str = c1099m.f4284m;
        if (str != null) {
            c1152b.put(str, this);
        }
        this.f4285n = c1099m.f4285n;
    }
}
