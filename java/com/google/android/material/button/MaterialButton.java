package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p005C.AbstractC0044g;
import p008D.AbstractC0087a;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p014F0.AbstractC0128E;
import p027K.AbstractC0272P;
import p028K0.AbstractC0331a;
import p034M0.C0356a;
import p034M0.C0365j;
import p034M0.C0366k;
import p034M0.InterfaceC0377v;
import p047Q1.AbstractC0458e;
import p049R0.AbstractC0463a;
import p088j.C0985d0;
import p088j.C1023q;
import p108q0.AbstractC1183a;
import p125w0.C1297b;
import p125w0.C1298c;
import p125w0.InterfaceC1296a;

/* loaded from: classes.dex */
public class MaterialButton extends C1023q implements Checkable, InterfaceC0377v {

    /* renamed from: r */
    public static final int[] f2569r = {R.attr.state_checkable};

    /* renamed from: s */
    public static final int[] f2570s = {R.attr.state_checked};

    /* renamed from: d */
    public final C1298c f2571d;

    /* renamed from: e */
    public final LinkedHashSet f2572e;

    /* renamed from: f */
    public InterfaceC1296a f2573f;

    /* renamed from: g */
    public PorterDuff.Mode f2574g;

    /* renamed from: h */
    public ColorStateList f2575h;

    /* renamed from: i */
    public Drawable f2576i;

    /* renamed from: j */
    public String f2577j;

    /* renamed from: k */
    public int f2578k;

    /* renamed from: l */
    public int f2579l;

    /* renamed from: m */
    public int f2580m;

    /* renamed from: n */
    public int f2581n;

    /* renamed from: o */
    public boolean f2582o;

    /* renamed from: p */
    public boolean f2583p;

    /* renamed from: q */
    public int f2584q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0463a.m1220a(context, attributeSet, com.nfupay.s145.R.attr.materialButtonStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Button), attributeSet, com.nfupay.s145.R.attr.materialButtonStyle);
        this.f2572e = new LinkedHashSet();
        this.f2582o = false;
        this.f2583p = false;
        Context context2 = getContext();
        TypedArray m456f = AbstractC0128E.m456f(context2, attributeSet, AbstractC1183a.f4531j, com.nfupay.s145.R.attr.materialButtonStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f2581n = m456f.getDimensionPixelSize(12, 0);
        int i2 = m456f.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2574g = AbstractC0128E.m457g(i2, mode);
        this.f2575h = AbstractC0104l.m413t(getContext(), m456f, 14);
        this.f2576i = AbstractC0104l.m416x(getContext(), m456f, 10);
        this.f2584q = m456f.getInteger(11, 1);
        this.f2578k = m456f.getDimensionPixelSize(13, 0);
        C1298c c1298c = new C1298c(this, C0366k.m1034b(context2, attributeSet, com.nfupay.s145.R.attr.materialButtonStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Button).m1032a());
        this.f2571d = c1298c;
        c1298c.f5311c = m456f.getDimensionPixelOffset(1, 0);
        c1298c.f5312d = m456f.getDimensionPixelOffset(2, 0);
        c1298c.f5313e = m456f.getDimensionPixelOffset(3, 0);
        c1298c.f5314f = m456f.getDimensionPixelOffset(4, 0);
        if (m456f.hasValue(8)) {
            int dimensionPixelSize = m456f.getDimensionPixelSize(8, -1);
            c1298c.f5315g = dimensionPixelSize;
            float f = dimensionPixelSize;
            C0365j m1037e = c1298c.f5310b.m1037e();
            m1037e.f958e = new C0356a(f);
            m1037e.f959f = new C0356a(f);
            m1037e.f960g = new C0356a(f);
            m1037e.f961h = new C0356a(f);
            c1298c.m2987c(m1037e.m1032a());
            c1298c.f5324p = true;
        }
        c1298c.f5316h = m456f.getDimensionPixelSize(20, 0);
        c1298c.f5317i = AbstractC0128E.m457g(m456f.getInt(7, -1), mode);
        c1298c.f5318j = AbstractC0104l.m413t(getContext(), m456f, 6);
        c1298c.f5319k = AbstractC0104l.m413t(getContext(), m456f, 19);
        c1298c.f5320l = AbstractC0104l.m413t(getContext(), m456f, 16);
        c1298c.f5325q = m456f.getBoolean(5, false);
        c1298c.f5328t = m456f.getDimensionPixelSize(9, 0);
        c1298c.f5326r = m456f.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (m456f.hasValue(0)) {
            c1298c.f5323o = true;
            setSupportBackgroundTintList(c1298c.f5318j);
            setSupportBackgroundTintMode(c1298c.f5317i);
        } else {
            c1298c.m2989e();
        }
        setPaddingRelative(paddingStart + c1298c.f5311c, paddingTop + c1298c.f5313e, paddingEnd + c1298c.f5312d, paddingBottom + c1298c.f5314f);
        m456f.recycle();
        setCompoundDrawablePadding(this.f2581n);
        m1925c(this.f2576i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            f = Math.max(f, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(f);
    }

    /* renamed from: a */
    public final boolean m1923a() {
        C1298c c1298c = this.f2571d;
        return (c1298c == null || c1298c.f5323o) ? false : true;
    }

    /* renamed from: b */
    public final void m1924b() {
        int i2 = this.f2584q;
        boolean z2 = true;
        if (i2 != 1 && i2 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f2576i, null, null, null);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative(null, null, this.f2576i, null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative(null, this.f2576i, null, null);
        }
    }

    /* renamed from: c */
    public final void m1925c(boolean z2) {
        Drawable drawable = this.f2576i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2576i = mutate;
            AbstractC0087a.m305h(mutate, this.f2575h);
            PorterDuff.Mode mode = this.f2574g;
            if (mode != null) {
                AbstractC0087a.m306i(this.f2576i, mode);
            }
            int i2 = this.f2578k;
            if (i2 == 0) {
                i2 = this.f2576i.getIntrinsicWidth();
            }
            int i3 = this.f2578k;
            if (i3 == 0) {
                i3 = this.f2576i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2576i;
            int i4 = this.f2579l;
            int i5 = this.f2580m;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
            this.f2576i.setVisible(true, z2);
        }
        if (z2) {
            m1924b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i6 = this.f2584q;
        if (((i6 == 1 || i6 == 2) && drawable3 != this.f2576i) || (((i6 == 3 || i6 == 4) && drawable5 != this.f2576i) || ((i6 == 16 || i6 == 32) && drawable4 != this.f2576i))) {
            m1924b();
        }
    }

    /* renamed from: d */
    public final void m1926d(int i2, int i3) {
        if (this.f2576i == null || getLayout() == null) {
            return;
        }
        int i4 = this.f2584q;
        if (!(i4 == 1 || i4 == 2) && i4 != 3 && i4 != 4) {
            if (i4 == 16 || i4 == 32) {
                this.f2579l = 0;
                if (i4 == 16) {
                    this.f2580m = 0;
                    m1925c(false);
                    return;
                }
                int i5 = this.f2578k;
                if (i5 == 0) {
                    i5 = this.f2576i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - i5) - this.f2581n) - getPaddingBottom()) / 2);
                if (this.f2580m != max) {
                    this.f2580m = max;
                    m1925c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2580m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i6 = this.f2584q;
        if (i6 == 1 || i6 == 3 || ((i6 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i6 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2579l = 0;
            m1925c(false);
            return;
        }
        int i7 = this.f2578k;
        if (i7 == 0) {
            i7 = this.f2576i.getIntrinsicWidth();
        }
        int textLayoutWidth = i2 - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i7) - this.f2581n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f2584q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2579l != paddingEnd) {
            this.f2579l = paddingEnd;
            m1925c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f2577j)) {
            return this.f2577j;
        }
        C1298c c1298c = this.f2571d;
        return ((c1298c == null || !c1298c.f5325q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m1923a()) {
            return this.f2571d.f5315g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2576i;
    }

    public int getIconGravity() {
        return this.f2584q;
    }

    public int getIconPadding() {
        return this.f2581n;
    }

    public int getIconSize() {
        return this.f2578k;
    }

    public ColorStateList getIconTint() {
        return this.f2575h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2574g;
    }

    public int getInsetBottom() {
        return this.f2571d.f5314f;
    }

    public int getInsetTop() {
        return this.f2571d.f5313e;
    }

    public ColorStateList getRippleColor() {
        if (m1923a()) {
            return this.f2571d.f5320l;
        }
        return null;
    }

    public C0366k getShapeAppearanceModel() {
        if (m1923a()) {
            return this.f2571d.f5310b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m1923a()) {
            return this.f2571d.f5319k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m1923a()) {
            return this.f2571d.f5316h;
        }
        return 0;
    }

    @Override // p088j.C1023q
    public ColorStateList getSupportBackgroundTintList() {
        return m1923a() ? this.f2571d.f5318j : super.getSupportBackgroundTintList();
    }

    @Override // p088j.C1023q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m1923a() ? this.f2571d.f5317i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2582o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m1923a()) {
            AbstractC0458e.m1183a0(this, this.f2571d.m2986b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        C1298c c1298c = this.f2571d;
        if (c1298c != null && c1298c.f5325q) {
            View.mergeDrawableStates(onCreateDrawableState, f2569r);
        }
        if (this.f2582o) {
            View.mergeDrawableStates(onCreateDrawableState, f2570s);
        }
        return onCreateDrawableState;
    }

    @Override // p088j.C1023q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2582o);
    }

    @Override // p088j.C1023q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C1298c c1298c = this.f2571d;
        accessibilityNodeInfo.setCheckable(c1298c != null && c1298c.f5325q);
        accessibilityNodeInfo.setChecked(this.f2582o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p088j.C1023q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        m1926d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1297b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1297b c1297b = (C1297b) parcelable;
        super.onRestoreInstanceState(c1297b.f1273a);
        setChecked(c1297b.f5308c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1297b c1297b = new C1297b(super.onSaveInstanceState());
        c1297b.f5308c = this.f2582o;
        return c1297b;
    }

    @Override // p088j.C1023q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        m1926d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2571d.f5326r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2576i != null) {
            if (this.f2576i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f2577j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!m1923a()) {
            super.setBackgroundColor(i2);
            return;
        }
        C1298c c1298c = this.f2571d;
        if (c1298c.m2986b(false) != null) {
            c1298c.m2986b(false).setTint(i2);
        }
    }

    @Override // p088j.C1023q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m1923a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C1298c c1298c = this.f2571d;
        c1298c.f5323o = true;
        ColorStateList colorStateList = c1298c.f5318j;
        MaterialButton materialButton = c1298c.f5309a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c1298c.f5317i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p088j.C1023q, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? AbstractC0104l.m415w(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (m1923a()) {
            this.f2571d.f5325q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        C1298c c1298c = this.f2571d;
        if (c1298c == null || !c1298c.f5325q || !isEnabled() || this.f2582o == z2) {
            return;
        }
        this.f2582o = z2;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z3 = this.f2582o;
            if (!materialButtonToggleGroup.f2591f) {
                materialButtonToggleGroup.m1928b(getId(), z3);
            }
        }
        if (this.f2583p) {
            return;
        }
        this.f2583p = true;
        Iterator it = this.f2572e.iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        this.f2583p = false;
    }

    public void setCornerRadius(int i2) {
        if (m1923a()) {
            C1298c c1298c = this.f2571d;
            if (c1298c.f5324p && c1298c.f5315g == i2) {
                return;
            }
            c1298c.f5315g = i2;
            c1298c.f5324p = true;
            float f = i2;
            C0365j m1037e = c1298c.f5310b.m1037e();
            m1037e.f958e = new C0356a(f);
            m1037e.f959f = new C0356a(f);
            m1037e.f960g = new C0356a(f);
            m1037e.f961h = new C0356a(f);
            c1298c.m2987c(m1037e.m1032a());
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (m1923a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m1923a()) {
            this.f2571d.m2986b(false).m1026i(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2576i != drawable) {
            this.f2576i = drawable;
            m1925c(true);
            m1926d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f2584q != i2) {
            this.f2584q = i2;
            m1926d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f2581n != i2) {
            this.f2581n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? AbstractC0104l.m415w(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2578k != i2) {
            this.f2578k = i2;
            m1925c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2575h != colorStateList) {
            this.f2575h = colorStateList;
            m1925c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2574g != mode) {
            this.f2574g = mode;
            m1925c(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(AbstractC0096d.m355v(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        C1298c c1298c = this.f2571d;
        c1298c.m2988d(c1298c.f5313e, i2);
    }

    public void setInsetTop(int i2) {
        C1298c c1298c = this.f2571d;
        c1298c.m2988d(i2, c1298c.f5314f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1296a interfaceC1296a) {
        this.f2573f = interfaceC1296a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC1296a interfaceC1296a = this.f2573f;
        if (interfaceC1296a != null) {
            ((MaterialButtonToggleGroup) ((C0985d0) interfaceC1296a).f3904b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m1923a()) {
            C1298c c1298c = this.f2571d;
            if (c1298c.f5320l != colorStateList) {
                c1298c.f5320l = colorStateList;
                MaterialButton materialButton = c1298c.f5309a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC0331a.m952a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (m1923a()) {
            setRippleColor(AbstractC0096d.m355v(getContext(), i2));
        }
    }

    @Override // p034M0.InterfaceC0377v
    public void setShapeAppearanceModel(C0366k c0366k) {
        if (!m1923a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2571d.m2987c(c0366k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (m1923a()) {
            C1298c c1298c = this.f2571d;
            c1298c.f5322n = z2;
            c1298c.m2990f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m1923a()) {
            C1298c c1298c = this.f2571d;
            if (c1298c.f5319k != colorStateList) {
                c1298c.f5319k = colorStateList;
                c1298c.m2990f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (m1923a()) {
            setStrokeColor(AbstractC0096d.m355v(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (m1923a()) {
            C1298c c1298c = this.f2571d;
            if (c1298c.f5316h != i2) {
                c1298c.f5316h = i2;
                c1298c.m2990f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (m1923a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // p088j.C1023q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m1923a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1298c c1298c = this.f2571d;
        if (c1298c.f5318j != colorStateList) {
            c1298c.f5318j = colorStateList;
            if (c1298c.m2986b(false) != null) {
                AbstractC0087a.m305h(c1298c.m2986b(false), c1298c.f5318j);
            }
        }
    }

    @Override // p088j.C1023q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m1923a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1298c c1298c = this.f2571d;
        if (c1298c.f5317i != mode) {
            c1298c.f5317i = mode;
            if (c1298c.m2986b(false) == null || c1298c.f5317i == null) {
                return;
            }
            AbstractC0087a.m306i(c1298c.m2986b(false), c1298c.f5317i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        m1926d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f2571d.f5326r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2582o);
    }
}
