package p043P0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p034M0.C0362g;

/* renamed from: P0.h */
/* loaded from: classes.dex */
public final class C0414h extends C0362g {

    /* renamed from: y */
    public static final /* synthetic */ int f1088y = 0;

    /* renamed from: x */
    public C0413g f1089x;

    @Override // p034M0.C0362g
    /* renamed from: e */
    public final void mo1022e(Canvas canvas) {
        if (this.f1089x.f1087q.isEmpty()) {
            super.mo1022e(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f1089x.f1087q);
        } else {
            canvas.clipRect(this.f1089x.f1087q, Region.Op.DIFFERENCE);
        }
        super.mo1022e(canvas);
        canvas.restore();
    }

    @Override // p034M0.C0362g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1089x = new C0413g(this.f1089x);
        return this;
    }

    /* renamed from: n */
    public final void m1076n(float f, float f2, float f3, float f4) {
        RectF rectF = this.f1089x.f1087q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
