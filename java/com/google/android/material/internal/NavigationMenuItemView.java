package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p002B.AbstractC0020j;
import p002B.AbstractC0027q;
import p008D.AbstractC0087a;
import p010D1.AbstractC0096d;
import p014F0.AbstractC0138f;
import p014F0.C0133a;
import p027K.AbstractC0272P;
import p086i.C0909n;
import p086i.InterfaceC0921z;
import p088j.C0927B0;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0138f implements InterfaceC0921z {

    /* renamed from: G */
    public static final int[] f2732G = {R.attr.state_checked};

    /* renamed from: A */
    public FrameLayout f2733A;

    /* renamed from: B */
    public C0909n f2734B;

    /* renamed from: C */
    public ColorStateList f2735C;

    /* renamed from: D */
    public boolean f2736D;

    /* renamed from: E */
    public Drawable f2737E;

    /* renamed from: F */
    public final C0133a f2738F;

    /* renamed from: v */
    public int f2739v;

    /* renamed from: w */
    public boolean f2740w;

    /* renamed from: x */
    public boolean f2741x;

    /* renamed from: y */
    public boolean f2742y;

    /* renamed from: z */
    public final CheckedTextView f2743z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2742y = true;
        C0133a c0133a = new C0133a(1, this);
        this.f2738F = c0133a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.nfupay.s145.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.nfupay.s145.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.nfupay.s145.R.id.design_menu_item_text);
        this.f2743z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0272P.m823m(checkedTextView, c0133a);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2733A == null) {
                this.f2733A = (FrameLayout) ((ViewStub) findViewById(com.nfupay.s145.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2733A.removeAllViews();
            this.f2733A.addView(view);
        }
    }

    @Override // p086i.InterfaceC0921z
    /* renamed from: e */
    public final void mo1377e(C0909n c0909n) {
        StateListDrawable stateListDrawable;
        this.f2734B = c0909n;
        int i2 = c0909n.f3693a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(c0909n.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.nfupay.s145.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2732G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0909n.isCheckable());
        setChecked(c0909n.isChecked());
        setEnabled(c0909n.isEnabled());
        setTitle(c0909n.f3697e);
        setIcon(c0909n.getIcon());
        setActionView(c0909n.getActionView());
        setContentDescription(c0909n.f3709q);
        AbstractC0096d.m344e0(this, c0909n.f3710r);
        C0909n c0909n2 = this.f2734B;
        CharSequence charSequence = c0909n2.f3697e;
        CheckedTextView checkedTextView = this.f2743z;
        if (charSequence == null && c0909n2.getIcon() == null && this.f2734B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2733A;
            if (frameLayout != null) {
                C0927B0 c0927b0 = (C0927B0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0927b0).width = -1;
                this.f2733A.setLayoutParams(c0927b0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2733A;
        if (frameLayout2 != null) {
            C0927B0 c0927b02 = (C0927B0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0927b02).width = -2;
            this.f2733A.setLayoutParams(c0927b02);
        }
    }

    @Override // p086i.InterfaceC0921z
    public C0909n getItemData() {
        return this.f2734B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        C0909n c0909n = this.f2734B;
        if (c0909n != null && c0909n.isCheckable() && this.f2734B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2732G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2741x != z2) {
            this.f2741x = z2;
            this.f2738F.mo851h(this.f2743z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2743z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f2742y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2736D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                AbstractC0087a.m305h(drawable, this.f2735C);
            }
            int i2 = this.f2739v;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f2740w) {
            if (this.f2737E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0027q.f60a;
                Drawable m84a = AbstractC0020j.m84a(resources, com.nfupay.s145.R.drawable.navigation_empty_icon, theme);
                this.f2737E = m84a;
                if (m84a != null) {
                    int i3 = this.f2739v;
                    m84a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f2737E;
        }
        this.f2743z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f2743z.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f2739v = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2735C = colorStateList;
        this.f2736D = colorStateList != null;
        C0909n c0909n = this.f2734B;
        if (c0909n != null) {
            setIcon(c0909n.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f2743z.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2740w = z2;
    }

    public void setTextAppearance(int i2) {
        this.f2743z.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2743z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2743z.setText(charSequence);
    }
}
