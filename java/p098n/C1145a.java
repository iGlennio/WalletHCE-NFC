package p098n;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: n.a */
/* loaded from: classes.dex */
public final class C1145a extends Drawable {

    /* renamed from: a */
    public float f4344a;

    /* renamed from: b */
    public final Paint f4345b;

    /* renamed from: c */
    public final RectF f4346c;

    /* renamed from: d */
    public final Rect f4347d;

    /* renamed from: e */
    public float f4348e;

    /* renamed from: h */
    public ColorStateList f4351h;

    /* renamed from: i */
    public PorterDuffColorFilter f4352i;

    /* renamed from: j */
    public ColorStateList f4353j;

    /* renamed from: f */
    public boolean f4349f = false;

    /* renamed from: g */
    public boolean f4350g = true;

    /* renamed from: k */
    public PorterDuff.Mode f4354k = PorterDuff.Mode.SRC_IN;

    public C1145a(ColorStateList colorStateList, float f) {
        this.f4344a = f;
        Paint paint = new Paint(5);
        this.f4345b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f4351h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f4351h.getDefaultColor()));
        this.f4346c = new RectF();
        this.f4347d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m2645a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void m2646b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f4346c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f4347d;
        rect2.set(rect);
        if (this.f4349f) {
            rect2.inset((int) Math.ceil(AbstractC1146b.m2647a(this.f4348e, this.f4344a, this.f4350g)), (int) Math.ceil(AbstractC1146b.m2648b(this.f4348e, this.f4344a, this.f4350g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.f4345b;
        if (this.f4352i == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.f4352i);
            z2 = true;
        }
        RectF rectF = this.f4346c;
        float f = this.f4344a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f4347d, this.f4344a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f4353j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f4351h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2646b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f4351h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f4345b;
        boolean z2 = colorForState != paint.getColor();
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f4353j;
        if (colorStateList2 == null || (mode = this.f4354k) == null) {
            return z2;
        }
        this.f4352i = m2645a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f4345b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4345b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f4353j = colorStateList;
        this.f4352i = m2645a(colorStateList, this.f4354k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f4354k = mode;
        this.f4352i = m2645a(this.f4353j, mode);
        invalidateSelf();
    }
}
