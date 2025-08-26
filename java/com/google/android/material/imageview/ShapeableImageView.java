package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.nfupay.s145.R;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p012E0.C0108a;
import p034M0.AbstractC0367l;
import p034M0.C0362g;
import p034M0.C0366k;
import p034M0.C0368m;
import p034M0.InterfaceC0377v;
import p049R0.AbstractC0463a;
import p088j.C1050z;
import p108q0.AbstractC1183a;

/* loaded from: classes.dex */
public class ShapeableImageView extends C1050z implements InterfaceC0377v {

    /* renamed from: d */
    public final C0368m f2709d;

    /* renamed from: e */
    public final RectF f2710e;

    /* renamed from: f */
    public final RectF f2711f;

    /* renamed from: g */
    public final Paint f2712g;

    /* renamed from: h */
    public final Paint f2713h;

    /* renamed from: i */
    public final Path f2714i;

    /* renamed from: j */
    public ColorStateList f2715j;

    /* renamed from: k */
    public C0362g f2716k;

    /* renamed from: l */
    public C0366k f2717l;

    /* renamed from: m */
    public float f2718m;

    /* renamed from: n */
    public final Path f2719n;

    /* renamed from: o */
    public final int f2720o;

    /* renamed from: p */
    public final int f2721p;

    /* renamed from: q */
    public final int f2722q;

    /* renamed from: r */
    public final int f2723r;

    /* renamed from: s */
    public final int f2724s;

    /* renamed from: t */
    public final int f2725t;

    /* renamed from: u */
    public boolean f2726u;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(AbstractC0463a.m1220a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f2709d = AbstractC0367l.f978a;
        this.f2714i = new Path();
        this.f2726u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f2713h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f2710e = new RectF();
        this.f2711f = new RectF();
        this.f2719n = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1183a.f4546y, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.f2715j = AbstractC0104l.m413t(context2, obtainStyledAttributes, 9);
        this.f2718m = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2720o = dimensionPixelSize;
        this.f2721p = dimensionPixelSize;
        this.f2722q = dimensionPixelSize;
        this.f2723r = dimensionPixelSize;
        this.f2720o = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f2721p = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f2722q = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f2723r = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f2724s = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f2725t = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f2712g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f2717l = C0366k.m1034b(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).m1032a();
        setOutlineProvider(new C0108a(this));
    }

    /* renamed from: c */
    public final boolean m1966c() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: d */
    public final void m1967d(int i2, int i3) {
        RectF rectF = this.f2710e;
        rectF.set(getPaddingLeft(), getPaddingTop(), i2 - getPaddingRight(), i3 - getPaddingBottom());
        C0366k c0366k = this.f2717l;
        Path path = this.f2714i;
        this.f2709d.m1038a(c0366k, 1.0f, rectF, null, path);
        Path path2 = this.f2719n;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f2711f;
        rectF2.set(0.0f, 0.0f, i2, i3);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f2723r;
    }

    public final int getContentPaddingEnd() {
        int i2 = this.f2725t;
        return i2 != Integer.MIN_VALUE ? i2 : m1966c() ? this.f2720o : this.f2722q;
    }

    public int getContentPaddingLeft() {
        int i2;
        int i3;
        if (this.f2724s != Integer.MIN_VALUE || this.f2725t != Integer.MIN_VALUE) {
            if (m1966c() && (i3 = this.f2725t) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!m1966c() && (i2 = this.f2724s) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f2720o;
    }

    public int getContentPaddingRight() {
        int i2;
        int i3;
        if (this.f2724s != Integer.MIN_VALUE || this.f2725t != Integer.MIN_VALUE) {
            if (m1966c() && (i3 = this.f2724s) != Integer.MIN_VALUE) {
                return i3;
            }
            if (!m1966c() && (i2 = this.f2725t) != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f2722q;
    }

    public final int getContentPaddingStart() {
        int i2 = this.f2724s;
        return i2 != Integer.MIN_VALUE ? i2 : m1966c() ? this.f2722q : this.f2720o;
    }

    public int getContentPaddingTop() {
        return this.f2721p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C0366k getShapeAppearanceModel() {
        return this.f2717l;
    }

    public ColorStateList getStrokeColor() {
        return this.f2715j;
    }

    public float getStrokeWidth() {
        return this.f2718m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f2719n, this.f2713h);
        if (this.f2715j == null) {
            return;
        }
        Paint paint = this.f2712g;
        paint.setStrokeWidth(this.f2718m);
        int colorForState = this.f2715j.getColorForState(getDrawableState(), this.f2715j.getDefaultColor());
        if (this.f2718m <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f2714i, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.f2726u && isLayoutDirectionResolved()) {
            this.f2726u = true;
            if (!isPaddingRelative() && this.f2724s == Integer.MIN_VALUE && this.f2725t == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        m1967d(i2, i3);
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(getContentPaddingLeft() + i2, getContentPaddingTop() + i3, getContentPaddingRight() + i4, getContentPaddingBottom() + i5);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(getContentPaddingStart() + i2, getContentPaddingTop() + i3, getContentPaddingEnd() + i4, getContentPaddingBottom() + i5);
    }

    @Override // p034M0.InterfaceC0377v
    public void setShapeAppearanceModel(C0366k c0366k) {
        this.f2717l = c0366k;
        C0362g c0362g = this.f2716k;
        if (c0362g != null) {
            c0362g.setShapeAppearanceModel(c0366k);
        }
        m1967d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f2715j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i2) {
        setStrokeColor(AbstractC0096d.m355v(getContext(), i2));
    }

    public void setStrokeWidth(float f) {
        if (this.f2718m != f) {
            this.f2718m = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i2) {
        setStrokeWidth(getResources().getDimensionPixelSize(i2));
    }
}
