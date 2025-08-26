package p014F0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* renamed from: F0.x */
/* loaded from: classes.dex */
public abstract class AbstractC0156x extends FrameLayout {

    /* renamed from: a */
    public Drawable f473a;

    /* renamed from: b */
    public Rect f474b;

    /* renamed from: c */
    public Rect f475c;

    /* renamed from: d */
    public boolean f476d;

    /* renamed from: e */
    public boolean f477e;

    /* renamed from: f */
    public boolean f478f;

    /* renamed from: g */
    public boolean f479g;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f474b == null || this.f473a == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z2 = this.f476d;
        Rect rect = this.f475c;
        if (z2) {
            rect.set(0, 0, width, this.f474b.top);
            this.f473a.setBounds(rect);
            this.f473a.draw(canvas);
        }
        if (this.f477e) {
            rect.set(0, height - this.f474b.bottom, width, height);
            this.f473a.setBounds(rect);
            this.f473a.draw(canvas);
        }
        if (this.f478f) {
            Rect rect2 = this.f474b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f473a.setBounds(rect);
            this.f473a.draw(canvas);
        }
        if (this.f479g) {
            Rect rect3 = this.f474b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f473a.setBounds(rect);
            this.f473a.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f473a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f473a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z2) {
        this.f477e = z2;
    }

    public void setDrawLeftInsetForeground(boolean z2) {
        this.f478f = z2;
    }

    public void setDrawRightInsetForeground(boolean z2) {
        this.f479g = z2;
    }

    public void setDrawTopInsetForeground(boolean z2) {
        this.f476d = z2;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f473a = drawable;
    }
}
