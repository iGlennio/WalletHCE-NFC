package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p008D.AbstractC0087a;
import p014F0.AbstractC0128E;
import p014F0.C0129F;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p034M0.C0362g;
import p047Q1.AbstractC0458e;
import p049R0.AbstractC0463a;
import p086i.MenuC0907l;
import p108q0.AbstractC1183a;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: W */
    public static final ImageView.ScaleType[] f2491W = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: R */
    public Integer f2492R;

    /* renamed from: S */
    public boolean f2493S;

    /* renamed from: T */
    public boolean f2494T;

    /* renamed from: U */
    public ImageView.ScaleType f2495U;

    /* renamed from: V */
    public Boolean f2496V;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0463a.m1220a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray m456f = AbstractC0128E.m456f(context2, attributeSet, AbstractC1183a.f4540s, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (m456f.hasValue(2)) {
            setNavigationIconTint(m456f.getColor(2, -1));
        }
        this.f2493S = m456f.getBoolean(4, false);
        this.f2494T = m456f.getBoolean(3, false);
        int i2 = m456f.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2491W;
            if (i2 < scaleTypeArr.length) {
                this.f2495U = scaleTypeArr[i2];
            }
        }
        if (m456f.hasValue(0)) {
            this.f2496V = Boolean.valueOf(m456f.getBoolean(0, false));
        }
        m456f.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0458e.m1168A(background);
        if (valueOf != null) {
            C0362g c0362g = new C0362g();
            c0362g.m1027j(valueOf);
            c0362g.m1025h(context2);
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            c0362g.m1026i(AbstractC0261E.m748i(this));
            setBackground(c0362g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f2495U;
    }

    public Integer getNavigationIconTint() {
        return this.f2492R;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: m */
    public final void mo1433m(int i2) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuC0907l;
        if (z2) {
            ((MenuC0907l) menu).m2350w();
        }
        super.mo1433m(i2);
        if (z2) {
            ((MenuC0907l) menu).m2349v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0362g) {
            AbstractC0458e.m1183a0(this, (C0362g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        ImageView imageView2 = null;
        if (this.f2493S || this.f2494T) {
            ArrayList m454d = AbstractC0128E.m454d(this, getTitle());
            boolean isEmpty = m454d.isEmpty();
            C0129F c0129f = AbstractC0128E.f351c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(m454d, c0129f);
            ArrayList m454d2 = AbstractC0128E.m454d(this, getSubtitle());
            TextView textView2 = m454d2.isEmpty() ? null : (TextView) Collections.max(m454d2, c0129f);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f2493S && textView != null) {
                    m1900v(textView, pair);
                }
                if (this.f2494T && textView2 != null) {
                    m1900v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i6 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i6++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f2496V;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f2495U;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0362g) {
            ((C0362g) background).m1026i(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f2496V;
        if (bool == null || bool.booleanValue() != z2) {
            this.f2496V = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f2495U != scaleType) {
            this.f2495U = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f2492R != null) {
            drawable = drawable.mutate();
            AbstractC0087a.m304g(drawable, this.f2492R.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.f2492R = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f2494T != z2) {
            this.f2494T = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f2493S != z2) {
            this.f2493S = z2;
            requestLayout();
        }
    }

    /* renamed from: v */
    public final void m1900v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i2 += max;
            i3 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i3, textView.getBottom());
    }
}
