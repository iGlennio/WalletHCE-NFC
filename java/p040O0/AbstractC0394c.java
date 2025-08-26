package p040O0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p008D.AbstractC0087a;
import p010D1.AbstractC0104l;
import p014F0.AbstractC0128E;
import p027K.AbstractC0259C;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p034M0.C0362g;
import p034M0.C0366k;
import p047Q1.AbstractC0458e;
import p049R0.AbstractC0463a;
import p108q0.AbstractC1183a;

/* renamed from: O0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0394c extends FrameLayout {

    /* renamed from: i */
    public static final ViewOnTouchListenerC0393b f1043i = new ViewOnTouchListenerC0393b();

    /* renamed from: a */
    public final C0366k f1044a;

    /* renamed from: b */
    public int f1045b;

    /* renamed from: c */
    public final float f1046c;

    /* renamed from: d */
    public final float f1047d;

    /* renamed from: e */
    public final int f1048e;

    /* renamed from: f */
    public final int f1049f;

    /* renamed from: g */
    public ColorStateList f1050g;

    /* renamed from: h */
    public PorterDuff.Mode f1051h;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0394c(Context context, AttributeSet attributeSet) {
        super(AbstractC0463a.m1220a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1183a.f4517A);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            AbstractC0261E.m758s(this, dimensionPixelSize);
        }
        this.f1045b = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f1044a = C0366k.m1034b(context2, attributeSet, 0, 0).m1032a();
        }
        this.f1046c = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0104l.m413t(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0128E.m457g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1047d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f1048e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1049f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f1043i);
        setFocusable(true);
        if (getBackground() == null) {
            int m1174H = AbstractC0458e.m1174H(AbstractC0458e.m1208z(this, R.attr.colorSurface), AbstractC0458e.m1208z(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C0366k c0366k = this.f1044a;
            if (c0366k != null) {
                int i2 = AbstractC0395d.f1052a;
                C0362g c0362g = new C0362g(c0366k);
                c0362g.m1027j(ColorStateList.valueOf(m1174H));
                gradientDrawable = c0362g;
            } else {
                Resources resources = getResources();
                int i3 = AbstractC0395d.f1052a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(m1174H);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f1050g;
            if (colorStateList != null) {
                AbstractC0087a.m305h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f1047d;
    }

    public int getAnimationMode() {
        return this.f1045b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1046c;
    }

    public int getMaxInlineActionWidth() {
        return this.f1049f;
    }

    public int getMaxWidth() {
        return this.f1048e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        AbstractC0259C.m739c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f1048e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f1045b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1050g != null) {
            drawable = drawable.mutate();
            AbstractC0087a.m305h(drawable, this.f1050g);
            AbstractC0087a.m306i(drawable, this.f1051h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1050g = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC0087a.m305h(mutate, colorStateList);
            AbstractC0087a.m306i(mutate, this.f1051h);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1051h = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC0087a.m306i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f1043i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC0395d abstractC0395d) {
    }
}
