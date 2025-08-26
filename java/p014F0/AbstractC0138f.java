package p014F0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p088j.AbstractC0929C0;
import p108q0.AbstractC1183a;

/* renamed from: F0.f */
/* loaded from: classes.dex */
public abstract class AbstractC0138f extends AbstractC0929C0 {

    /* renamed from: p */
    public Drawable f423p;

    /* renamed from: q */
    public final Rect f424q;

    /* renamed from: r */
    public final Rect f425r;

    /* renamed from: s */
    public int f426s;

    /* renamed from: t */
    public final boolean f427t;

    /* renamed from: u */
    public boolean f428u;

    public AbstractC0138f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f424q = new Rect();
        this.f425r = new Rect();
        this.f426s = 119;
        this.f427t = true;
        this.f428u = false;
        int[] iArr = AbstractC1183a.f4529h;
        AbstractC0128E.m451a(context, attributeSet, 0, 0);
        AbstractC0128E.m452b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f426s = obtainStyledAttributes.getInt(1, this.f426s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f427t = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f423p;
        if (drawable != null) {
            if (this.f428u) {
                this.f428u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f427t;
                Rect rect = this.f424q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i2 = this.f426s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f425r;
                Gravity.apply(i2, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f423p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f423p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f423p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f423p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f426s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f423p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p088j.AbstractC0929C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.f428u = z2 | this.f428u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f428u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f423p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f423p);
            }
            this.f423p = drawable;
            this.f428u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f426s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.f426s != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f426s = i2;
            if (i2 == 119 && this.f423p != null) {
                this.f423p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f423p;
    }
}
