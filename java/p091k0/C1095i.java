package p091k0;

import android.graphics.Paint;
import p001A1.C0010i;

/* renamed from: k0.i */
/* loaded from: classes.dex */
public final class C1095i extends AbstractC1098l {

    /* renamed from: d */
    public C0010i f4246d;

    /* renamed from: e */
    public float f4247e;

    /* renamed from: f */
    public C0010i f4248f;

    /* renamed from: g */
    public float f4249g;

    /* renamed from: h */
    public float f4250h;

    /* renamed from: i */
    public float f4251i;

    /* renamed from: j */
    public float f4252j;

    /* renamed from: k */
    public float f4253k;

    /* renamed from: l */
    public Paint.Cap f4254l;

    /* renamed from: m */
    public Paint.Join f4255m;

    /* renamed from: n */
    public float f4256n;

    @Override // p091k0.AbstractC1097k
    /* renamed from: a */
    public final boolean mo2614a() {
        return this.f4248f.m28d() || this.f4246d.m28d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // p091k0.AbstractC1097k
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2615b(int[] r7) {
        /*
            r6 = this;
            A1.i r0 = r6.f4248f
            boolean r1 = r0.m28d()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f20d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f18b
            if (r1 == r4) goto L1e
            r0.f18b = r1
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            A1.i r1 = r6.f4246d
            boolean r4 = r1.m28d()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f20d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f18b
            if (r7 == r4) goto L3a
            r1.f18b = r7
            r2 = r3
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p091k0.C1095i.mo2615b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f4250h;
    }

    public int getFillColor() {
        return this.f4248f.f18b;
    }

    public float getStrokeAlpha() {
        return this.f4249g;
    }

    public int getStrokeColor() {
        return this.f4246d.f18b;
    }

    public float getStrokeWidth() {
        return this.f4247e;
    }

    public float getTrimPathEnd() {
        return this.f4252j;
    }

    public float getTrimPathOffset() {
        return this.f4253k;
    }

    public float getTrimPathStart() {
        return this.f4251i;
    }

    public void setFillAlpha(float f) {
        this.f4250h = f;
    }

    public void setFillColor(int i2) {
        this.f4248f.f18b = i2;
    }

    public void setStrokeAlpha(float f) {
        this.f4249g = f;
    }

    public void setStrokeColor(int i2) {
        this.f4246d.f18b = i2;
    }

    public void setStrokeWidth(float f) {
        this.f4247e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f4252j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f4253k = f;
    }

    public void setTrimPathStart(float f) {
        this.f4251i = f;
    }
}
