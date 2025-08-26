package p091k0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p101o.C1152b;

/* renamed from: k0.j */
/* loaded from: classes.dex */
public final class C1096j extends AbstractC1097k {

    /* renamed from: a */
    public final Matrix f4257a;

    /* renamed from: b */
    public final ArrayList f4258b;

    /* renamed from: c */
    public float f4259c;

    /* renamed from: d */
    public float f4260d;

    /* renamed from: e */
    public float f4261e;

    /* renamed from: f */
    public float f4262f;

    /* renamed from: g */
    public float f4263g;

    /* renamed from: h */
    public float f4264h;

    /* renamed from: i */
    public float f4265i;

    /* renamed from: j */
    public final Matrix f4266j;

    /* renamed from: k */
    public String f4267k;

    public C1096j() {
        this.f4257a = new Matrix();
        this.f4258b = new ArrayList();
        this.f4259c = 0.0f;
        this.f4260d = 0.0f;
        this.f4261e = 0.0f;
        this.f4262f = 1.0f;
        this.f4263g = 1.0f;
        this.f4264h = 0.0f;
        this.f4265i = 0.0f;
        this.f4266j = new Matrix();
        this.f4267k = null;
    }

    @Override // p091k0.AbstractC1097k
    /* renamed from: a */
    public final boolean mo2614a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4258b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((AbstractC1097k) arrayList.get(i2)).mo2614a()) {
                return true;
            }
            i2++;
        }
    }

    @Override // p091k0.AbstractC1097k
    /* renamed from: b */
    public final boolean mo2615b(int[] iArr) {
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f4258b;
            if (i2 >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC1097k) arrayList.get(i2)).mo2615b(iArr);
            i2++;
        }
    }

    /* renamed from: c */
    public final void m2616c() {
        Matrix matrix = this.f4266j;
        matrix.reset();
        matrix.postTranslate(-this.f4260d, -this.f4261e);
        matrix.postScale(this.f4262f, this.f4263g);
        matrix.postRotate(this.f4259c, 0.0f, 0.0f);
        matrix.postTranslate(this.f4264h + this.f4260d, this.f4265i + this.f4261e);
    }

    public String getGroupName() {
        return this.f4267k;
    }

    public Matrix getLocalMatrix() {
        return this.f4266j;
    }

    public float getPivotX() {
        return this.f4260d;
    }

    public float getPivotY() {
        return this.f4261e;
    }

    public float getRotation() {
        return this.f4259c;
    }

    public float getScaleX() {
        return this.f4262f;
    }

    public float getScaleY() {
        return this.f4263g;
    }

    public float getTranslateX() {
        return this.f4264h;
    }

    public float getTranslateY() {
        return this.f4265i;
    }

    public void setPivotX(float f) {
        if (f != this.f4260d) {
            this.f4260d = f;
            m2616c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f4261e) {
            this.f4261e = f;
            m2616c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f4259c) {
            this.f4259c = f;
            m2616c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f4262f) {
            this.f4262f = f;
            m2616c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f4263g) {
            this.f4263g = f;
            m2616c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f4264h) {
            this.f4264h = f;
            m2616c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f4265i) {
            this.f4265i = f;
            m2616c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1096j(C1096j c1096j, C1152b c1152b) {
        C1094h c1094h;
        this.f4257a = new Matrix();
        this.f4258b = new ArrayList();
        this.f4259c = 0.0f;
        this.f4260d = 0.0f;
        this.f4261e = 0.0f;
        this.f4262f = 1.0f;
        this.f4263g = 1.0f;
        this.f4264h = 0.0f;
        this.f4265i = 0.0f;
        Matrix matrix = new Matrix();
        this.f4266j = matrix;
        this.f4267k = null;
        this.f4259c = c1096j.f4259c;
        this.f4260d = c1096j.f4260d;
        this.f4261e = c1096j.f4261e;
        this.f4262f = c1096j.f4262f;
        this.f4263g = c1096j.f4263g;
        this.f4264h = c1096j.f4264h;
        this.f4265i = c1096j.f4265i;
        String str = c1096j.f4267k;
        this.f4267k = str;
        if (str != null) {
            c1152b.put(str, this);
        }
        matrix.set(c1096j.f4266j);
        ArrayList arrayList = c1096j.f4258b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof C1096j) {
                this.f4258b.add(new C1096j((C1096j) obj, c1152b));
            } else {
                if (obj instanceof C1095i) {
                    C1095i c1095i = (C1095i) obj;
                    C1095i c1095i2 = new C1095i(c1095i);
                    c1095i2.f4247e = 0.0f;
                    c1095i2.f4249g = 1.0f;
                    c1095i2.f4250h = 1.0f;
                    c1095i2.f4251i = 0.0f;
                    c1095i2.f4252j = 1.0f;
                    c1095i2.f4253k = 0.0f;
                    c1095i2.f4254l = Paint.Cap.BUTT;
                    c1095i2.f4255m = Paint.Join.MITER;
                    c1095i2.f4256n = 4.0f;
                    c1095i2.f4246d = c1095i.f4246d;
                    c1095i2.f4247e = c1095i.f4247e;
                    c1095i2.f4249g = c1095i.f4249g;
                    c1095i2.f4248f = c1095i.f4248f;
                    c1095i2.f4270c = c1095i.f4270c;
                    c1095i2.f4250h = c1095i.f4250h;
                    c1095i2.f4251i = c1095i.f4251i;
                    c1095i2.f4252j = c1095i.f4252j;
                    c1095i2.f4253k = c1095i.f4253k;
                    c1095i2.f4254l = c1095i.f4254l;
                    c1095i2.f4255m = c1095i.f4255m;
                    c1095i2.f4256n = c1095i.f4256n;
                    c1094h = c1095i2;
                } else if (obj instanceof C1094h) {
                    c1094h = new C1094h((C1094h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f4258b.add(c1094h);
                Object obj2 = c1094h.f4269b;
                if (obj2 != null) {
                    c1152b.put(obj2, c1094h);
                }
            }
        }
    }
}
