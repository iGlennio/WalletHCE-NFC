package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.fragment.app.C0651y;
import p002B.C0019i;
import p096m.AbstractC1142a;
import p098n.C1145a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f */
    public static final int[] f1830f = {R.attr.colorBackground};

    /* renamed from: g */
    public static final C0651y f1831g = new C0651y(10);

    /* renamed from: a */
    public boolean f1832a;

    /* renamed from: b */
    public boolean f1833b;

    /* renamed from: c */
    public final Rect f1834c;

    /* renamed from: d */
    public final Rect f1835d;

    /* renamed from: e */
    public final C0019i f1836e;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.nfupay.s145.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1834c = rect;
        this.f1835d = new Rect();
        C0019i c0019i = new C0019i(18, this);
        this.f1836e = c0019i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1142a.f4341a, com.nfupay.s145.R.attr.cardViewStyle, com.nfupay.s145.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1830f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.nfupay.s145.R.color.cardview_light_background) : getResources().getColor(com.nfupay.s145.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1832a = obtainStyledAttributes.getBoolean(7, false);
        this.f1833b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C0651y c0651y = f1831g;
        C1145a c1145a = new C1145a(valueOf, dimension);
        c0019i.f47b = c1145a;
        setBackgroundDrawable(c1145a);
        setClipToOutline(true);
        setElevation(dimension2);
        c0651y.m1686j(c0019i, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1145a) ((Drawable) this.f1836e.f47b)).f4351h;
    }

    public float getCardElevation() {
        return ((CardView) this.f1836e.f48c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1834c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1834c.left;
    }

    public int getContentPaddingRight() {
        return this.f1834c.right;
    }

    public int getContentPaddingTop() {
        return this.f1834c.top;
    }

    public float getMaxCardElevation() {
        return ((C1145a) ((Drawable) this.f1836e.f47b)).f4348e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1833b;
    }

    public float getRadius() {
        return ((C1145a) ((Drawable) this.f1836e.f47b)).f4344a;
    }

    public boolean getUseCompatPadding() {
        return this.f1832a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        ColorStateList valueOf = ColorStateList.valueOf(i2);
        C1145a c1145a = (C1145a) ((Drawable) this.f1836e.f47b);
        if (valueOf == null) {
            c1145a.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c1145a.f4351h = valueOf;
        c1145a.f4345b.setColor(valueOf.getColorForState(c1145a.getState(), c1145a.f4351h.getDefaultColor()));
        c1145a.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.f1836e.f48c).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f1831g.m1686j(this.f1836e, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f1833b) {
            this.f1833b = z2;
            C0651y c0651y = f1831g;
            C0019i c0019i = this.f1836e;
            c0651y.m1686j(c0019i, ((C1145a) ((Drawable) c0019i.f47b)).f4348e);
        }
    }

    public void setRadius(float f) {
        C1145a c1145a = (C1145a) ((Drawable) this.f1836e.f47b);
        if (f == c1145a.f4344a) {
            return;
        }
        c1145a.f4344a = f;
        c1145a.m2646b(null);
        c1145a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f1832a != z2) {
            this.f1832a = z2;
            C0651y c0651y = f1831g;
            C0019i c0019i = this.f1836e;
            c0651y.m1686j(c0019i, ((C1145a) ((Drawable) c0019i.f47b)).f4348e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1145a c1145a = (C1145a) ((Drawable) this.f1836e.f47b);
        if (colorStateList == null) {
            c1145a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c1145a.f4351h = colorStateList;
        c1145a.f4345b.setColor(colorStateList.getColorForState(c1145a.getState(), c1145a.f4351h.getDefaultColor()));
        c1145a.invalidateSelf();
    }
}
