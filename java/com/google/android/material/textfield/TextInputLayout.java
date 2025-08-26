package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p000A.AbstractC0001b;
import p005C.AbstractC0038a;
import p005C.C0046i;
import p008D.AbstractC0087a;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p014F0.AbstractC0128E;
import p014F0.AbstractC0137e;
import p014F0.C0136d;
import p014F0.RunnableC0130G;
import p017G0.C0176h;
import p021I.AbstractC0215j;
import p021I.C0207b;
import p021I.C0214i;
import p025J0.C0228a;
import p025J0.C0231d;
import p027K.AbstractC0263G;
import p027K.AbstractC0272P;
import p027K.C0294g;
import p034M0.C0356a;
import p034M0.C0360e;
import p034M0.C0361f;
import p034M0.C0362g;
import p034M0.C0364i;
import p034M0.C0365j;
import p034M0.C0366k;
import p034M0.InterfaceC0358c;
import p043P0.C0403B;
import p043P0.C0404C;
import p043P0.C0406E;
import p043P0.C0413g;
import p043P0.C0414h;
import p043P0.C0417k;
import p043P0.C0419m;
import p043P0.C0422p;
import p043P0.C0425s;
import p043P0.C0426t;
import p043P0.C0429w;
import p043P0.C0431y;
import p043P0.C0432z;
import p043P0.InterfaceC0405D;
import p043P0.RunnableC0402A;
import p047Q1.AbstractC0458e;
import p049R0.AbstractC0463a;
import p088j.AbstractC1027r0;
import p088j.C0991f0;
import p088j.C1035u;
import p089j0.AbstractC1075q;
import p089j0.C1066h;
import p108q0.AbstractC1183a;
import p111r0.AbstractC1188a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0 */
    public static final int[][] f2791C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A */
    public ColorStateList f2792A;

    /* renamed from: A0 */
    public boolean f2793A0;

    /* renamed from: B */
    public ColorStateList f2794B;

    /* renamed from: B0 */
    public boolean f2795B0;

    /* renamed from: C */
    public boolean f2796C;

    /* renamed from: D */
    public CharSequence f2797D;

    /* renamed from: E */
    public boolean f2798E;

    /* renamed from: F */
    public C0362g f2799F;

    /* renamed from: G */
    public C0362g f2800G;

    /* renamed from: H */
    public StateListDrawable f2801H;

    /* renamed from: I */
    public boolean f2802I;

    /* renamed from: J */
    public C0362g f2803J;

    /* renamed from: K */
    public C0362g f2804K;

    /* renamed from: L */
    public C0366k f2805L;

    /* renamed from: M */
    public boolean f2806M;

    /* renamed from: N */
    public final int f2807N;

    /* renamed from: O */
    public int f2808O;

    /* renamed from: P */
    public int f2809P;

    /* renamed from: Q */
    public int f2810Q;

    /* renamed from: R */
    public int f2811R;

    /* renamed from: S */
    public int f2812S;

    /* renamed from: T */
    public int f2813T;

    /* renamed from: U */
    public int f2814U;

    /* renamed from: V */
    public final Rect f2815V;

    /* renamed from: W */
    public final Rect f2816W;

    /* renamed from: a */
    public final FrameLayout f2817a;

    /* renamed from: a0 */
    public final RectF f2818a0;

    /* renamed from: b */
    public final C0431y f2819b;

    /* renamed from: b0 */
    public Typeface f2820b0;

    /* renamed from: c */
    public final C0422p f2821c;

    /* renamed from: c0 */
    public ColorDrawable f2822c0;

    /* renamed from: d */
    public EditText f2823d;

    /* renamed from: d0 */
    public int f2824d0;

    /* renamed from: e */
    public CharSequence f2825e;

    /* renamed from: e0 */
    public final LinkedHashSet f2826e0;

    /* renamed from: f */
    public int f2827f;

    /* renamed from: f0 */
    public ColorDrawable f2828f0;

    /* renamed from: g */
    public int f2829g;

    /* renamed from: g0 */
    public int f2830g0;

    /* renamed from: h */
    public int f2831h;

    /* renamed from: h0 */
    public Drawable f2832h0;

    /* renamed from: i */
    public int f2833i;

    /* renamed from: i0 */
    public ColorStateList f2834i0;

    /* renamed from: j */
    public final C0426t f2835j;

    /* renamed from: j0 */
    public ColorStateList f2836j0;

    /* renamed from: k */
    public boolean f2837k;

    /* renamed from: k0 */
    public int f2838k0;

    /* renamed from: l */
    public int f2839l;

    /* renamed from: l0 */
    public int f2840l0;

    /* renamed from: m */
    public boolean f2841m;

    /* renamed from: m0 */
    public int f2842m0;

    /* renamed from: n */
    public InterfaceC0405D f2843n;

    /* renamed from: n0 */
    public ColorStateList f2844n0;

    /* renamed from: o */
    public C0991f0 f2845o;

    /* renamed from: o0 */
    public int f2846o0;

    /* renamed from: p */
    public int f2847p;

    /* renamed from: p0 */
    public int f2848p0;

    /* renamed from: q */
    public int f2849q;

    /* renamed from: q0 */
    public int f2850q0;

    /* renamed from: r */
    public CharSequence f2851r;

    /* renamed from: r0 */
    public int f2852r0;

    /* renamed from: s */
    public boolean f2853s;

    /* renamed from: s0 */
    public int f2854s0;

    /* renamed from: t */
    public C0991f0 f2855t;

    /* renamed from: t0 */
    public int f2856t0;

    /* renamed from: u */
    public ColorStateList f2857u;

    /* renamed from: u0 */
    public boolean f2858u0;

    /* renamed from: v */
    public int f2859v;

    /* renamed from: v0 */
    public final C0136d f2860v0;

    /* renamed from: w */
    public C1066h f2861w;

    /* renamed from: w0 */
    public boolean f2862w0;

    /* renamed from: x */
    public C1066h f2863x;

    /* renamed from: x0 */
    public boolean f2864x0;

    /* renamed from: y */
    public ColorStateList f2865y;

    /* renamed from: y0 */
    public ValueAnimator f2866y0;

    /* renamed from: z */
    public ColorStateList f2867z;

    /* renamed from: z0 */
    public boolean f2868z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0463a.m1220a(context, attributeSet, com.nfupay.s145.R.attr.textInputStyle, com.nfupay.s145.R.style.Widget_Design_TextInputLayout), attributeSet, com.nfupay.s145.R.attr.textInputStyle);
        this.f2827f = -1;
        this.f2829g = -1;
        this.f2831h = -1;
        this.f2833i = -1;
        this.f2835j = new C0426t(this);
        this.f2843n = new C0294g(2);
        this.f2815V = new Rect();
        this.f2816W = new Rect();
        this.f2818a0 = new RectF();
        this.f2826e0 = new LinkedHashSet();
        C0136d c0136d = new C0136d(this);
        this.f2860v0 = c0136d;
        this.f2795B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2817a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC1188a.f4552a;
        c0136d.f379Q = linearInterpolator;
        c0136d.m467h(false);
        c0136d.f378P = linearInterpolator;
        c0136d.m467h(false);
        if (c0136d.f401g != 8388659) {
            c0136d.f401g = 8388659;
            c0136d.m467h(false);
        }
        int[] iArr = AbstractC1183a.f4520D;
        AbstractC0128E.m451a(context2, attributeSet, com.nfupay.s145.R.attr.textInputStyle, com.nfupay.s145.R.style.Widget_Design_TextInputLayout);
        AbstractC0128E.m452b(context2, attributeSet, iArr, com.nfupay.s145.R.attr.textInputStyle, com.nfupay.s145.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.nfupay.s145.R.attr.textInputStyle, com.nfupay.s145.R.style.Widget_Design_TextInputLayout);
        C0176h c0176h = new C0176h(context2, obtainStyledAttributes);
        C0431y c0431y = new C0431y(this, c0176h);
        this.f2819b = c0431y;
        this.f2796C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f2864x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2862w0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f2805L = C0366k.m1034b(context2, attributeSet, com.nfupay.s145.R.attr.textInputStyle, com.nfupay.s145.R.style.Widget_Design_TextInputLayout).m1032a();
        this.f2807N = context2.getResources().getDimensionPixelOffset(com.nfupay.s145.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2809P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2811R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.nfupay.s145.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2812S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.nfupay.s145.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2810Q = this.f2811R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        C0365j m1037e = this.f2805L.m1037e();
        if (dimension >= 0.0f) {
            m1037e.f958e = new C0356a(dimension);
        }
        if (dimension2 >= 0.0f) {
            m1037e.f959f = new C0356a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            m1037e.f960g = new C0356a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            m1037e.f961h = new C0356a(dimension4);
        }
        this.f2805L = m1037e.m1032a();
        ColorStateList m412s = AbstractC0104l.m412s(context2, c0176h, 7);
        if (m412s != null) {
            int defaultColor = m412s.getDefaultColor();
            this.f2846o0 = defaultColor;
            this.f2814U = defaultColor;
            if (m412s.isStateful()) {
                this.f2848p0 = m412s.getColorForState(new int[]{-16842910}, -1);
                this.f2850q0 = m412s.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2852r0 = m412s.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2850q0 = this.f2846o0;
                ColorStateList m355v = AbstractC0096d.m355v(context2, com.nfupay.s145.R.color.mtrl_filled_background_color);
                this.f2848p0 = m355v.getColorForState(new int[]{-16842910}, -1);
                this.f2852r0 = m355v.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2814U = 0;
            this.f2846o0 = 0;
            this.f2848p0 = 0;
            this.f2850q0 = 0;
            this.f2852r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList m541p = c0176h.m541p(1);
            this.f2836j0 = m541p;
            this.f2834i0 = m541p;
        }
        ColorStateList m412s2 = AbstractC0104l.m412s(context2, c0176h, 14);
        this.f2842m0 = obtainStyledAttributes.getColor(14, 0);
        this.f2838k0 = AbstractC0001b.m3a(context2, com.nfupay.s145.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2854s0 = AbstractC0001b.m3a(context2, com.nfupay.s145.R.color.mtrl_textinput_disabled_color);
        this.f2840l0 = AbstractC0001b.m3a(context2, com.nfupay.s145.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (m412s2 != null) {
            setBoxStrokeColorStateList(m412s2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0104l.m412s(context2, c0176h, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f2792A = c0176h.m541p(24);
        this.f2794B = c0176h.m541p(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i2 = obtainStyledAttributes.getInt(34, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z4 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f2849q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2847p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.f2847p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2849q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0176h.m541p(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0176h.m541p(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0176h.m541p(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0176h.m541p(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0176h.m541p(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0176h.m541p(58));
        }
        C0422p c0422p = new C0422p(this, c0176h);
        this.f2821c = c0422p;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0176h.m523E();
        setImportantForAccessibility(2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 >= 26) {
            AbstractC0263G.m782m(this, 1);
        }
        frameLayout.addView(c0431y);
        frameLayout.addView(c0422p);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f2823d;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC0458e.m1172F(editText)) {
            return this.f2799F;
        }
        int m1208z = AbstractC0458e.m1208z(this.f2823d, com.nfupay.s145.R.attr.colorControlHighlight);
        int i2 = this.f2808O;
        int[][] iArr = f2791C0;
        if (i2 != 2) {
            if (i2 != 1) {
                return null;
            }
            C0362g c0362g = this.f2799F;
            int i3 = this.f2814U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0458e.m1174H(m1208z, i3, 0.1f), i3}), c0362g, c0362g);
        }
        Context context = getContext();
        C0362g c0362g2 = this.f2799F;
        TypedValue m339b0 = AbstractC0096d.m339b0(context, com.nfupay.s145.R.attr.colorSurface, "TextInputLayout");
        int i4 = m339b0.resourceId;
        int m3a = i4 != 0 ? AbstractC0001b.m3a(context, i4) : m339b0.data;
        C0362g c0362g3 = new C0362g(c0362g2.f931a.f914a);
        int m1174H = AbstractC0458e.m1174H(m1208z, m3a, 0.1f);
        c0362g3.m1027j(new ColorStateList(iArr, new int[]{m1174H, 0}));
        c0362g3.setTint(m3a);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m1174H, m3a});
        C0362g c0362g4 = new C0362g(c0362g2.f931a.f914a);
        c0362g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0362g3, c0362g4), c0362g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2801H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2801H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2801H.addState(new int[0], m1984f(false));
        }
        return this.f2801H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2800G == null) {
            this.f2800G = m1984f(true);
        }
        return this.f2800G;
    }

    /* renamed from: k */
    public static void m1978k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m1978k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2823d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f2823d = editText;
        int i2 = this.f2827f;
        if (i2 != -1) {
            setMinEms(i2);
        } else {
            setMinWidth(this.f2831h);
        }
        int i3 = this.f2829g;
        if (i3 != -1) {
            setMaxEms(i3);
        } else {
            setMaxWidth(this.f2833i);
        }
        this.f2802I = false;
        m1987i();
        setTextInputAccessibilityDelegate(new C0404C(this));
        Typeface typeface = this.f2823d.getTypeface();
        C0136d c0136d = this.f2860v0;
        c0136d.m472m(typeface);
        float textSize = this.f2823d.getTextSize();
        if (c0136d.f402h != textSize) {
            c0136d.f402h = textSize;
            c0136d.m467h(false);
        }
        int i4 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f2823d.getLetterSpacing();
        if (c0136d.f385W != letterSpacing) {
            c0136d.f385W = letterSpacing;
            c0136d.m467h(false);
        }
        int gravity = this.f2823d.getGravity();
        int i5 = (gravity & (-113)) | 48;
        if (c0136d.f401g != i5) {
            c0136d.f401g = i5;
            c0136d.m467h(false);
        }
        if (c0136d.f399f != gravity) {
            c0136d.f399f = gravity;
            c0136d.m467h(false);
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        this.f2856t0 = editText.getMinimumHeight();
        this.f2823d.addTextChangedListener(new C0432z(this, editText));
        if (this.f2834i0 == null) {
            this.f2834i0 = this.f2823d.getHintTextColors();
        }
        if (this.f2796C) {
            if (TextUtils.isEmpty(this.f2797D)) {
                CharSequence hint = this.f2823d.getHint();
                this.f2825e = hint;
                setHint(hint);
                this.f2823d.setHint((CharSequence) null);
            }
            this.f2798E = true;
        }
        if (i4 >= 29) {
            m1993p();
        }
        if (this.f2845o != null) {
            m1991n(this.f2823d.getText());
        }
        m1995r();
        this.f2835j.m1107b();
        this.f2819b.bringToFront();
        C0422p c0422p = this.f2821c;
        c0422p.bringToFront();
        Iterator it = this.f2826e0.iterator();
        while (it.hasNext()) {
            ((C0419m) it.next()).m1085a(this);
        }
        c0422p.m1101m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m1998u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2797D)) {
            return;
        }
        this.f2797D = charSequence;
        C0136d c0136d = this.f2860v0;
        if (charSequence == null || !TextUtils.equals(c0136d.f363A, charSequence)) {
            c0136d.f363A = charSequence;
            c0136d.f364B = null;
            Bitmap bitmap = c0136d.f367E;
            if (bitmap != null) {
                bitmap.recycle();
                c0136d.f367E = null;
            }
            c0136d.m467h(false);
        }
        if (this.f2858u0) {
            return;
        }
        m1988j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2853s == z2) {
            return;
        }
        if (z2) {
            C0991f0 c0991f0 = this.f2855t;
            if (c0991f0 != null) {
                this.f2817a.addView(c0991f0);
                this.f2855t.setVisibility(0);
            }
        } else {
            C0991f0 c0991f02 = this.f2855t;
            if (c0991f02 != null) {
                c0991f02.setVisibility(8);
            }
            this.f2855t = null;
        }
        this.f2853s = z2;
    }

    /* renamed from: a */
    public final void m1979a(float f) {
        int i2 = 0;
        C0136d c0136d = this.f2860v0;
        if (c0136d.f391b == f) {
            return;
        }
        if (this.f2866y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2866y0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0458e.m1180T(getContext(), com.nfupay.s145.R.attr.motionEasingEmphasizedInterpolator, AbstractC1188a.f4553b));
            this.f2866y0.setDuration(AbstractC0458e.m1179S(getContext(), com.nfupay.s145.R.attr.motionDurationMedium4, 167));
            this.f2866y0.addUpdateListener(new C0403B(i2, this));
        }
        this.f2866y0.setFloatValues(c0136d.f391b, f);
        this.f2866y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2817a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m1997t();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public final void m1980b() {
        int i2;
        int i3;
        C0362g c0362g = this.f2799F;
        if (c0362g == null) {
            return;
        }
        C0366k c0366k = c0362g.f931a.f914a;
        C0366k c0366k2 = this.f2805L;
        if (c0366k != c0366k2) {
            c0362g.setShapeAppearanceModel(c0366k2);
        }
        if (this.f2808O == 2 && (i2 = this.f2810Q) > -1 && (i3 = this.f2813T) != 0) {
            C0362g c0362g2 = this.f2799F;
            c0362g2.f931a.f923j = i2;
            c0362g2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i3);
            C0361f c0361f = c0362g2.f931a;
            if (c0361f.f917d != valueOf) {
                c0361f.f917d = valueOf;
                c0362g2.onStateChange(c0362g2.getState());
            }
        }
        int i4 = this.f2814U;
        if (this.f2808O == 1) {
            i4 = AbstractC0038a.m110b(this.f2814U, AbstractC0458e.m1207y(getContext(), com.nfupay.s145.R.attr.colorSurface, 0));
        }
        this.f2814U = i4;
        this.f2799F.m1027j(ColorStateList.valueOf(i4));
        C0362g c0362g3 = this.f2803J;
        if (c0362g3 != null && this.f2804K != null) {
            if (this.f2810Q > -1 && this.f2813T != 0) {
                c0362g3.m1027j(this.f2823d.isFocused() ? ColorStateList.valueOf(this.f2838k0) : ColorStateList.valueOf(this.f2813T));
                this.f2804K.m1027j(ColorStateList.valueOf(this.f2813T));
            }
            invalidate();
        }
        m1996s();
    }

    /* renamed from: c */
    public final int m1981c() {
        float m464d;
        if (!this.f2796C) {
            return 0;
        }
        int i2 = this.f2808O;
        C0136d c0136d = this.f2860v0;
        if (i2 == 0) {
            m464d = c0136d.m464d();
        } else {
            if (i2 != 2) {
                return 0;
            }
            m464d = c0136d.m464d() / 2.0f;
        }
        return (int) m464d;
    }

    /* renamed from: d */
    public final C1066h m1982d() {
        C1066h c1066h = new C1066h();
        c1066h.f4189c = AbstractC0458e.m1179S(getContext(), com.nfupay.s145.R.attr.motionDurationShort2, 87);
        c1066h.f4190d = AbstractC0458e.m1180T(getContext(), com.nfupay.s145.R.attr.motionEasingLinearInterpolator, AbstractC1188a.f4552a);
        return c1066h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f2823d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f2825e != null) {
            boolean z2 = this.f2798E;
            this.f2798E = false;
            CharSequence hint = editText.getHint();
            this.f2823d.setHint(this.f2825e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f2823d.setHint(hint);
                this.f2798E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.f2817a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure newChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(newChild, i2);
            if (childAt == this.f2823d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2793A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2793A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0362g c0362g;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.f2796C;
        C0136d c0136d = this.f2860v0;
        if (z2) {
            c0136d.getClass();
            int save = canvas2.save();
            if (c0136d.f364B != null) {
                RectF rectF = c0136d.f397e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0136d.f376N;
                    textPaint.setTextSize(c0136d.f369G);
                    float f = c0136d.f410p;
                    float f2 = c0136d.f411q;
                    float f3 = c0136d.f368F;
                    if (f3 != 1.0f) {
                        canvas2.scale(f3, f3, f, f2);
                    }
                    if (c0136d.f396d0 <= 1 || c0136d.f365C) {
                        canvas2.translate(f, f2);
                        c0136d.f387Y.draw(canvas2);
                    } else {
                        float lineStart = c0136d.f410p - c0136d.f387Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c0136d.f392b0 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f5 = c0136d.f370H;
                            float f6 = c0136d.f371I;
                            float f7 = c0136d.f372J;
                            int i3 = c0136d.f373K;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC0038a.m112d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        c0136d.f387Y.draw(canvas2);
                        textPaint.setAlpha((int) (c0136d.f390a0 * f4));
                        if (i2 >= 31) {
                            float f8 = c0136d.f370H;
                            float f9 = c0136d.f371I;
                            float f10 = c0136d.f372J;
                            int i4 = c0136d.f373K;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC0038a.m112d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c0136d.f387Y.getLineBaseline(0);
                        CharSequence charSequence = c0136d.f394c0;
                        float f11 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c0136d.f370H, c0136d.f371I, c0136d.f372J, c0136d.f373K);
                        }
                        String trim = c0136d.f394c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(c0136d.f387Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f2804K == null || (c0362g = this.f2803J) == null) {
            return;
        }
        c0362g.draw(canvas2);
        if (this.f2823d.isFocused()) {
            Rect bounds = this.f2804K.getBounds();
            Rect bounds2 = this.f2803J.getBounds();
            float f12 = c0136d.f391b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC1188a.m2749c(centerX, bounds2.left, f12);
            bounds.right = AbstractC1188a.m2749c(centerX, bounds2.right, f12);
            this.f2804K.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f2868z0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f2868z0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            F0.d r3 = r4.f2860v0
            if (r3 == 0) goto L2f
            r3.f374L = r1
            android.content.res.ColorStateList r1 = r3.f405k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f404j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m467h(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f2823d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = p027K.AbstractC0272P.f768a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.m1998u(r0, r2)
        L47:
            r4.m1995r()
            r4.m2001x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f2868z0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* renamed from: e */
    public final boolean m1983e() {
        return this.f2796C && !TextUtils.isEmpty(this.f2797D) && (this.f2799F instanceof C0414h);
    }

    /* renamed from: f */
    public final C0362g m1984f(boolean z2) {
        int i2 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.nfupay.s145.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f2823d;
        float popupElevation = editText instanceof C0429w ? ((C0429w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.nfupay.s145.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.nfupay.s145.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0364i c0364i = new C0364i();
        C0364i c0364i2 = new C0364i();
        C0364i c0364i3 = new C0364i();
        C0364i c0364i4 = new C0364i();
        C0360e c0360e = new C0360e(i2);
        C0360e c0360e2 = new C0360e(i2);
        C0360e c0360e3 = new C0360e(i2);
        C0360e c0360e4 = new C0360e(i2);
        C0356a c0356a = new C0356a(f);
        C0356a c0356a2 = new C0356a(f);
        C0356a c0356a3 = new C0356a(dimensionPixelOffset);
        C0356a c0356a4 = new C0356a(dimensionPixelOffset);
        C0366k c0366k = new C0366k();
        c0366k.f966a = c0364i;
        c0366k.f967b = c0364i2;
        c0366k.f968c = c0364i3;
        c0366k.f969d = c0364i4;
        c0366k.f970e = c0356a;
        c0366k.f971f = c0356a2;
        c0366k.f972g = c0356a4;
        c0366k.f973h = c0356a3;
        c0366k.f974i = c0360e;
        c0366k.f975j = c0360e2;
        c0366k.f976k = c0360e3;
        c0366k.f977l = c0360e4;
        EditText editText2 = this.f2823d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0429w ? ((C0429w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0362g.f930w;
            TypedValue m339b0 = AbstractC0096d.m339b0(context, com.nfupay.s145.R.attr.colorSurface, C0362g.class.getSimpleName());
            int i3 = m339b0.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i3 != 0 ? AbstractC0001b.m3a(context, i3) : m339b0.data);
        }
        C0362g c0362g = new C0362g();
        c0362g.m1025h(context);
        c0362g.m1027j(dropDownBackgroundTintList);
        c0362g.m1026i(popupElevation);
        c0362g.setShapeAppearanceModel(c0366k);
        C0361f c0361f = c0362g.f931a;
        if (c0361f.f920g == null) {
            c0361f.f920g = new Rect();
        }
        c0362g.f931a.f920g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0362g.invalidateSelf();
        return c0362g;
    }

    /* renamed from: g */
    public final int m1985g(int i2, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f2823d.getCompoundPaddingLeft() : this.f2821c.m1091c() : this.f2819b.m1119a()) + i2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2823d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m1981c() + getPaddingTop() + editText.getBaseline();
    }

    public C0362g getBoxBackground() {
        int i2 = this.f2808O;
        if (i2 == 1 || i2 == 2) {
            return this.f2799F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2814U;
    }

    public int getBoxBackgroundMode() {
        return this.f2808O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2809P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean m455e = AbstractC0128E.m455e(this);
        RectF rectF = this.f2818a0;
        return m455e ? this.f2805L.f973h.mo1004a(rectF) : this.f2805L.f972g.mo1004a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean m455e = AbstractC0128E.m455e(this);
        RectF rectF = this.f2818a0;
        return m455e ? this.f2805L.f972g.mo1004a(rectF) : this.f2805L.f973h.mo1004a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean m455e = AbstractC0128E.m455e(this);
        RectF rectF = this.f2818a0;
        return m455e ? this.f2805L.f970e.mo1004a(rectF) : this.f2805L.f971f.mo1004a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean m455e = AbstractC0128E.m455e(this);
        RectF rectF = this.f2818a0;
        return m455e ? this.f2805L.f971f.mo1004a(rectF) : this.f2805L.f970e.mo1004a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2842m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2844n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2811R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2812S;
    }

    public int getCounterMaxLength() {
        return this.f2839l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0991f0 c0991f0;
        if (this.f2837k && this.f2841m && (c0991f0 = this.f2845o) != null) {
            return c0991f0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2867z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2865y;
    }

    public ColorStateList getCursorColor() {
        return this.f2792A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2794B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2834i0;
    }

    public EditText getEditText() {
        return this.f2823d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2821c.f1120g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2821c.f1120g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2821c.f1126m;
    }

    public int getEndIconMode() {
        return this.f2821c.f1122i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2821c.f1127n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2821c.f1120g;
    }

    public CharSequence getError() {
        C0426t c0426t = this.f2835j;
        if (c0426t.f1164q) {
            return c0426t.f1163p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2835j.f1167t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2835j.f1166s;
    }

    public int getErrorCurrentTextColors() {
        C0991f0 c0991f0 = this.f2835j.f1165r;
        if (c0991f0 != null) {
            return c0991f0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2821c.f1116c.getDrawable();
    }

    public CharSequence getHelperText() {
        C0426t c0426t = this.f2835j;
        if (c0426t.f1171x) {
            return c0426t.f1170w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0991f0 c0991f0 = this.f2835j.f1172y;
        if (c0991f0 != null) {
            return c0991f0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2796C) {
            return this.f2797D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2860v0.m464d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0136d c0136d = this.f2860v0;
        return c0136d.m465e(c0136d.f405k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2836j0;
    }

    public InterfaceC0405D getLengthCounter() {
        return this.f2843n;
    }

    public int getMaxEms() {
        return this.f2829g;
    }

    public int getMaxWidth() {
        return this.f2833i;
    }

    public int getMinEms() {
        return this.f2827f;
    }

    public int getMinWidth() {
        return this.f2831h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2821c.f1120g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2821c.f1120g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2853s) {
            return this.f2851r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2859v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2857u;
    }

    public CharSequence getPrefixText() {
        return this.f2819b.f1192c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2819b.f1191b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2819b.f1191b;
    }

    public C0366k getShapeAppearanceModel() {
        return this.f2805L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2819b.f1193d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2819b.f1193d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2819b.f1196g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2819b.f1197h;
    }

    public CharSequence getSuffixText() {
        return this.f2821c.f1129p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2821c.f1130q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2821c.f1130q;
    }

    public Typeface getTypeface() {
        return this.f2820b0;
    }

    /* renamed from: h */
    public final int m1986h(int i2, boolean z2) {
        return i2 - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f2823d.getCompoundPaddingRight() : this.f2819b.m1119a() : this.f2821c.m1091c());
    }

    /* renamed from: i */
    public final void m1987i() {
        int i2 = this.f2808O;
        if (i2 == 0) {
            this.f2799F = null;
            this.f2803J = null;
            this.f2804K = null;
        } else if (i2 == 1) {
            this.f2799F = new C0362g(this.f2805L);
            this.f2803J = new C0362g();
            this.f2804K = new C0362g();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.f2808O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2796C || (this.f2799F instanceof C0414h)) {
                this.f2799F = new C0362g(this.f2805L);
            } else {
                C0366k c0366k = this.f2805L;
                int i3 = C0414h.f1088y;
                if (c0366k == null) {
                    c0366k = new C0366k();
                }
                C0413g c0413g = new C0413g(c0366k, new RectF());
                C0414h c0414h = new C0414h(c0413g);
                c0414h.f1089x = c0413g;
                this.f2799F = c0414h;
            }
            this.f2803J = null;
            this.f2804K = null;
        }
        m1996s();
        m2001x();
        if (this.f2808O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2809P = getResources().getDimensionPixelSize(com.nfupay.s145.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0104l.m390E(getContext())) {
                this.f2809P = getResources().getDimensionPixelSize(com.nfupay.s145.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2823d != null && this.f2808O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2823d;
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.nfupay.s145.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f2823d.getPaddingEnd(), getResources().getDimensionPixelSize(com.nfupay.s145.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0104l.m390E(getContext())) {
                EditText editText2 = this.f2823d;
                WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.nfupay.s145.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f2823d.getPaddingEnd(), getResources().getDimensionPixelSize(com.nfupay.s145.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2808O != 0) {
            m1997t();
        }
        EditText editText3 = this.f2823d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.f2808O;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* renamed from: j */
    public final void m1988j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i2;
        float f5;
        int i3;
        if (m1983e()) {
            int width = this.f2823d.getWidth();
            int gravity = this.f2823d.getGravity();
            C0136d c0136d = this.f2860v0;
            boolean m462b = c0136d.m462b(c0136d.f363A);
            c0136d.f365C = m462b;
            Rect rect = c0136d.f395d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (m462b) {
                        i3 = rect.left;
                        f3 = i3;
                    } else {
                        f = rect.right;
                        f2 = c0136d.f388Z;
                    }
                } else if (m462b) {
                    f = rect.right;
                    f2 = c0136d.f388Z;
                } else {
                    i3 = rect.left;
                    f3 = i3;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.f2818a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c0136d.f388Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0136d.f365C) {
                        f5 = c0136d.f388Z;
                        f4 = f5 + max;
                    } else {
                        i2 = rect.right;
                        f4 = i2;
                    }
                } else if (c0136d.f365C) {
                    i2 = rect.right;
                    f4 = i2;
                } else {
                    f5 = c0136d.f388Z;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c0136d.m464d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f2807N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2810Q);
                C0414h c0414h = (C0414h) this.f2799F;
                c0414h.getClass();
                c0414h.m1076n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c0136d.f388Z / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.f2818a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (c0136d.f388Z / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c0136d.m464d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* renamed from: l */
    public final void m1989l(C0991f0 c0991f0, int i2) {
        try {
            c0991f0.setTextAppearance(i2);
            if (c0991f0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0991f0.setTextAppearance(com.nfupay.s145.R.style.TextAppearance_AppCompat_Caption);
        c0991f0.setTextColor(AbstractC0001b.m3a(getContext(), com.nfupay.s145.R.color.design_error));
    }

    /* renamed from: m */
    public final boolean m1990m() {
        C0426t c0426t = this.f2835j;
        return (c0426t.f1162o != 1 || c0426t.f1165r == null || TextUtils.isEmpty(c0426t.f1163p)) ? false : true;
    }

    /* renamed from: n */
    public final void m1991n(Editable editable) {
        ((C0294g) this.f2843n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2841m;
        int i2 = this.f2839l;
        String str = null;
        if (i2 == -1) {
            this.f2845o.setText(String.valueOf(length));
            this.f2845o.setContentDescription(null);
            this.f2841m = false;
        } else {
            this.f2841m = length > i2;
            Context context = getContext();
            this.f2845o.setContentDescription(context.getString(this.f2841m ? com.nfupay.s145.R.string.character_counter_overflowed_content_description : com.nfupay.s145.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2839l)));
            if (z2 != this.f2841m) {
                m1992o();
            }
            String str2 = C0207b.f584b;
            C0207b c0207b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0207b.f587e : C0207b.f586d;
            C0991f0 c0991f0 = this.f2845o;
            String string = getContext().getString(com.nfupay.s145.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2839l));
            if (string == null) {
                c0207b.getClass();
            } else {
                c0207b.getClass();
                C0214i c0214i = AbstractC0215j.f596a;
                str = c0207b.m583c(string).toString();
            }
            c0991f0.setText(str);
        }
        if (this.f2823d == null || z2 == this.f2841m) {
            return;
        }
        m1998u(false, false);
        m2001x();
        m1995r();
    }

    /* renamed from: o */
    public final void m1992o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0991f0 c0991f0 = this.f2845o;
        if (c0991f0 != null) {
            m1989l(c0991f0, this.f2841m ? this.f2847p : this.f2849q);
            if (!this.f2841m && (colorStateList2 = this.f2865y) != null) {
                this.f2845o.setTextColor(colorStateList2);
            }
            if (!this.f2841m || (colorStateList = this.f2867z) == null) {
                return;
            }
            this.f2845o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2860v0.m466g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        C0422p c0422p = this.f2821c;
        c0422p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2795B0 = false;
        if (this.f2823d != null && this.f2823d.getMeasuredHeight() < (max = Math.max(c0422p.getMeasuredHeight(), this.f2819b.getMeasuredHeight()))) {
            this.f2823d.setMinimumHeight(max);
            z2 = true;
        }
        boolean m1994q = m1994q();
        if (z2 || m1994q) {
            this.f2823d.post(new RunnableC0130G(5, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f2823d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC0137e.f421a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2815V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC0137e.f421a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC0137e.m473a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC0137e.f422b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C0362g c0362g = this.f2803J;
            if (c0362g != null) {
                int i6 = rect.bottom;
                c0362g.setBounds(rect.left, i6 - this.f2811R, rect.right, i6);
            }
            C0362g c0362g2 = this.f2804K;
            if (c0362g2 != null) {
                int i7 = rect.bottom;
                c0362g2.setBounds(rect.left, i7 - this.f2812S, rect.right, i7);
            }
            if (this.f2796C) {
                float textSize = this.f2823d.getTextSize();
                C0136d c0136d = this.f2860v0;
                if (c0136d.f402h != textSize) {
                    c0136d.f402h = textSize;
                    c0136d.m467h(false);
                }
                int gravity = this.f2823d.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c0136d.f401g != i8) {
                    c0136d.f401g = i8;
                    c0136d.m467h(false);
                }
                if (c0136d.f399f != gravity) {
                    c0136d.f399f = gravity;
                    c0136d.m467h(false);
                }
                if (this.f2823d == null) {
                    throw new IllegalStateException();
                }
                boolean m455e = AbstractC0128E.m455e(this);
                int i9 = rect.bottom;
                Rect rect2 = this.f2816W;
                rect2.bottom = i9;
                int i10 = this.f2808O;
                if (i10 == 1) {
                    rect2.left = m1985g(rect.left, m455e);
                    rect2.top = rect.top + this.f2809P;
                    rect2.right = m1986h(rect.right, m455e);
                } else if (i10 != 2) {
                    rect2.left = m1985g(rect.left, m455e);
                    rect2.top = getPaddingTop();
                    rect2.right = m1986h(rect.right, m455e);
                } else {
                    rect2.left = this.f2823d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m1981c();
                    rect2.right = rect.right - this.f2823d.getPaddingRight();
                }
                int i11 = rect2.left;
                int i12 = rect2.top;
                int i13 = rect2.right;
                int i14 = rect2.bottom;
                Rect rect3 = c0136d.f395d;
                if (rect3.left != i11 || rect3.top != i12 || rect3.right != i13 || rect3.bottom != i14) {
                    rect3.set(i11, i12, i13, i14);
                    c0136d.f375M = true;
                }
                if (this.f2823d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0136d.f377O;
                textPaint.setTextSize(c0136d.f402h);
                textPaint.setTypeface(c0136d.f415u);
                textPaint.setLetterSpacing(c0136d.f385W);
                float f = -textPaint.ascent();
                rect2.left = this.f2823d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2808O != 1 || this.f2823d.getMinLines() > 1) ? rect.top + this.f2823d.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f2823d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2808O != 1 || this.f2823d.getMinLines() > 1) ? rect.bottom - this.f2823d.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                Rect rect4 = c0136d.f393c;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    c0136d.f375M = true;
                }
                c0136d.m467h(false);
                if (!m1983e() || this.f2858u0) {
                    return;
                }
                m1988j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        EditText editText;
        super.onMeasure(i2, i3);
        boolean z2 = this.f2795B0;
        C0422p c0422p = this.f2821c;
        if (!z2) {
            c0422p.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2795B0 = true;
        }
        if (this.f2855t != null && (editText = this.f2823d) != null) {
            this.f2855t.setGravity(editText.getGravity());
            this.f2855t.setPadding(this.f2823d.getCompoundPaddingLeft(), this.f2823d.getCompoundPaddingTop(), this.f2823d.getCompoundPaddingRight(), this.f2823d.getCompoundPaddingBottom());
        }
        c0422p.m1101m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0406E)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0406E c0406e = (C0406E) parcelable;
        super.onRestoreInstanceState(c0406e.f1273a);
        setError(c0406e.f1067c);
        if (c0406e.f1068d) {
            post(new RunnableC0402A(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = i2 == 1;
        if (z2 != this.f2806M) {
            InterfaceC0358c interfaceC0358c = this.f2805L.f970e;
            RectF rectF = this.f2818a0;
            float mo1004a = interfaceC0358c.mo1004a(rectF);
            float mo1004a2 = this.f2805L.f971f.mo1004a(rectF);
            float mo1004a3 = this.f2805L.f973h.mo1004a(rectF);
            float mo1004a4 = this.f2805L.f972g.mo1004a(rectF);
            C0366k c0366k = this.f2805L;
            AbstractC0104l abstractC0104l = c0366k.f966a;
            AbstractC0104l abstractC0104l2 = c0366k.f967b;
            AbstractC0104l abstractC0104l3 = c0366k.f969d;
            AbstractC0104l abstractC0104l4 = c0366k.f968c;
            C0360e c0360e = new C0360e(0);
            C0360e c0360e2 = new C0360e(0);
            C0360e c0360e3 = new C0360e(0);
            C0360e c0360e4 = new C0360e(0);
            C0365j.m1031b(abstractC0104l2);
            C0365j.m1031b(abstractC0104l);
            C0365j.m1031b(abstractC0104l4);
            C0365j.m1031b(abstractC0104l3);
            C0356a c0356a = new C0356a(mo1004a2);
            C0356a c0356a2 = new C0356a(mo1004a);
            C0356a c0356a3 = new C0356a(mo1004a4);
            C0356a c0356a4 = new C0356a(mo1004a3);
            C0366k c0366k2 = new C0366k();
            c0366k2.f966a = abstractC0104l2;
            c0366k2.f967b = abstractC0104l;
            c0366k2.f968c = abstractC0104l3;
            c0366k2.f969d = abstractC0104l4;
            c0366k2.f970e = c0356a;
            c0366k2.f971f = c0356a2;
            c0366k2.f972g = c0356a4;
            c0366k2.f973h = c0356a3;
            c0366k2.f974i = c0360e;
            c0366k2.f975j = c0360e2;
            c0366k2.f976k = c0360e3;
            c0366k2.f977l = c0360e4;
            this.f2806M = z2;
            setShapeAppearanceModel(c0366k2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0406E c0406e = new C0406E(super.onSaveInstanceState());
        if (m1990m()) {
            c0406e.f1067c = getError();
        }
        C0422p c0422p = this.f2821c;
        c0406e.f1068d = c0422p.f1122i != 0 && c0422p.f1120g.f2729d;
        return c0406e;
    }

    /* renamed from: p */
    public final void m1993p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2792A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue m337Z = AbstractC0096d.m337Z(context, com.nfupay.s145.R.attr.colorControlActivated);
            if (m337Z != null) {
                int i2 = m337Z.resourceId;
                if (i2 != 0) {
                    colorStateList2 = AbstractC0096d.m355v(context, i2);
                } else {
                    int i3 = m337Z.data;
                    if (i3 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i3);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f2823d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f2823d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m1990m() || (this.f2845o != null && this.f2841m)) && (colorStateList = this.f2794B) != null) {
                colorStateList2 = colorStateList;
            }
            AbstractC0087a.m305h(mutate, colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1994q() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m1994q():boolean");
    }

    /* renamed from: r */
    public final void m1995r() {
        Drawable background;
        C0991f0 c0991f0;
        EditText editText = this.f2823d;
        if (editText == null || this.f2808O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1027r0.f4033a;
        Drawable mutate = background.mutate();
        if (m1990m()) {
            mutate.setColorFilter(C1035u.m2528c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2841m && (c0991f0 = this.f2845o) != null) {
            mutate.setColorFilter(C1035u.m2528c(c0991f0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f2823d.refreshDrawableState();
        }
    }

    /* renamed from: s */
    public final void m1996s() {
        EditText editText = this.f2823d;
        if (editText == null || this.f2799F == null) {
            return;
        }
        if ((this.f2802I || editText.getBackground() == null) && this.f2808O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f2823d;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            editText2.setBackground(editTextBoxBackground);
            this.f2802I = true;
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.f2814U != i2) {
            this.f2814U = i2;
            this.f2846o0 = i2;
            this.f2850q0 = i2;
            this.f2852r0 = i2;
            m1980b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(AbstractC0001b.m3a(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2846o0 = defaultColor;
        this.f2814U = defaultColor;
        this.f2848p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2850q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2852r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m1980b();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.f2808O) {
            return;
        }
        this.f2808O = i2;
        if (this.f2823d != null) {
            m1987i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f2809P = i2;
    }

    public void setBoxCornerFamily(int i2) {
        C0365j m1037e = this.f2805L.m1037e();
        InterfaceC0358c interfaceC0358c = this.f2805L.f970e;
        AbstractC0104l m1198p = AbstractC0458e.m1198p(i2);
        m1037e.f954a = m1198p;
        C0365j.m1031b(m1198p);
        m1037e.f958e = interfaceC0358c;
        InterfaceC0358c interfaceC0358c2 = this.f2805L.f971f;
        AbstractC0104l m1198p2 = AbstractC0458e.m1198p(i2);
        m1037e.f955b = m1198p2;
        C0365j.m1031b(m1198p2);
        m1037e.f959f = interfaceC0358c2;
        InterfaceC0358c interfaceC0358c3 = this.f2805L.f973h;
        AbstractC0104l m1198p3 = AbstractC0458e.m1198p(i2);
        m1037e.f957d = m1198p3;
        C0365j.m1031b(m1198p3);
        m1037e.f961h = interfaceC0358c3;
        InterfaceC0358c interfaceC0358c4 = this.f2805L.f972g;
        AbstractC0104l m1198p4 = AbstractC0458e.m1198p(i2);
        m1037e.f956c = m1198p4;
        C0365j.m1031b(m1198p4);
        m1037e.f960g = interfaceC0358c4;
        this.f2805L = m1037e.m1032a();
        m1980b();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f2842m0 != i2) {
            this.f2842m0 = i2;
            m2001x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2838k0 = colorStateList.getDefaultColor();
            this.f2854s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2840l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2842m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2842m0 != colorStateList.getDefaultColor()) {
            this.f2842m0 = colorStateList.getDefaultColor();
        }
        m2001x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2844n0 != colorStateList) {
            this.f2844n0 = colorStateList;
            m2001x();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.f2811R = i2;
        m2001x();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.f2812S = i2;
        m2001x();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2837k != z2) {
            C0426t c0426t = this.f2835j;
            if (z2) {
                C0991f0 c0991f0 = new C0991f0(getContext(), null);
                this.f2845o = c0991f0;
                c0991f0.setId(com.nfupay.s145.R.id.textinput_counter);
                Typeface typeface = this.f2820b0;
                if (typeface != null) {
                    this.f2845o.setTypeface(typeface);
                }
                this.f2845o.setMaxLines(1);
                c0426t.m1106a(this.f2845o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2845o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.nfupay.s145.R.dimen.mtrl_textinput_counter_margin_start));
                m1992o();
                if (this.f2845o != null) {
                    EditText editText = this.f2823d;
                    m1991n(editText != null ? editText.getText() : null);
                }
            } else {
                c0426t.m1112g(this.f2845o, 2);
                this.f2845o = null;
            }
            this.f2837k = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f2839l != i2) {
            if (i2 > 0) {
                this.f2839l = i2;
            } else {
                this.f2839l = -1;
            }
            if (!this.f2837k || this.f2845o == null) {
                return;
            }
            EditText editText = this.f2823d;
            m1991n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f2847p != i2) {
            this.f2847p = i2;
            m1992o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2867z != colorStateList) {
            this.f2867z = colorStateList;
            m1992o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f2849q != i2) {
            this.f2849q = i2;
            m1992o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2865y != colorStateList) {
            this.f2865y = colorStateList;
            m1992o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2792A != colorStateList) {
            this.f2792A = colorStateList;
            m1993p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2794B != colorStateList) {
            this.f2794B = colorStateList;
            if (m1990m() || (this.f2845o != null && this.f2841m)) {
                m1993p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2834i0 = colorStateList;
        this.f2836j0 = colorStateList;
        if (this.f2823d != null) {
            m1998u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m1978k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2821c.f1120g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2821c.f1120g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        C0422p c0422p = this.f2821c;
        CharSequence text = i2 != 0 ? c0422p.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = c0422p.f1120g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        C0422p c0422p = this.f2821c;
        Drawable m415w = i2 != 0 ? AbstractC0104l.m415w(c0422p.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = c0422p.f1120g;
        checkableImageButton.setImageDrawable(m415w);
        if (m415w != null) {
            ColorStateList colorStateList = c0422p.f1124k;
            PorterDuff.Mode mode = c0422p.f1125l;
            TextInputLayout textInputLayout = c0422p.f1114a;
            AbstractC0096d.m343e(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0096d.m336Y(textInputLayout, checkableImageButton, c0422p.f1124k);
        }
    }

    public void setEndIconMinSize(int i2) {
        C0422p c0422p = this.f2821c;
        if (i2 < 0) {
            c0422p.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != c0422p.f1126m) {
            c0422p.f1126m = i2;
            CheckableImageButton checkableImageButton = c0422p.f1120g;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = c0422p.f1116c;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.f2821c.m1095g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0422p c0422p = this.f2821c;
        View.OnLongClickListener onLongClickListener = c0422p.f1128o;
        CheckableImageButton checkableImageButton = c0422p.f1120g;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0096d.m340c0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0422p c0422p = this.f2821c;
        c0422p.f1128o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0422p.f1120g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0096d.m340c0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0422p c0422p = this.f2821c;
        c0422p.f1127n = scaleType;
        c0422p.f1120g.setScaleType(scaleType);
        c0422p.f1116c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0422p c0422p = this.f2821c;
        if (c0422p.f1124k != colorStateList) {
            c0422p.f1124k = colorStateList;
            AbstractC0096d.m343e(c0422p.f1114a, c0422p.f1120g, colorStateList, c0422p.f1125l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0422p c0422p = this.f2821c;
        if (c0422p.f1125l != mode) {
            c0422p.f1125l = mode;
            AbstractC0096d.m343e(c0422p.f1114a, c0422p.f1120g, c0422p.f1124k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2821c.m1096h(z2);
    }

    public void setError(CharSequence charSequence) {
        C0426t c0426t = this.f2835j;
        if (!c0426t.f1164q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0426t.m1111f();
            return;
        }
        c0426t.m1108c();
        c0426t.f1163p = charSequence;
        c0426t.f1165r.setText(charSequence);
        int i2 = c0426t.f1161n;
        if (i2 != 1) {
            c0426t.f1162o = 1;
        }
        c0426t.m1114i(i2, c0426t.f1162o, c0426t.m1113h(c0426t.f1165r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        C0426t c0426t = this.f2835j;
        c0426t.f1167t = i2;
        C0991f0 c0991f0 = c0426t.f1165r;
        if (c0991f0 != null) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            c0991f0.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0426t c0426t = this.f2835j;
        c0426t.f1166s = charSequence;
        C0991f0 c0991f0 = c0426t.f1165r;
        if (c0991f0 != null) {
            c0991f0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        C0426t c0426t = this.f2835j;
        if (c0426t.f1164q == z2) {
            return;
        }
        c0426t.m1108c();
        TextInputLayout textInputLayout = c0426t.f1155h;
        if (z2) {
            C0991f0 c0991f0 = new C0991f0(c0426t.f1154g, null);
            c0426t.f1165r = c0991f0;
            c0991f0.setId(com.nfupay.s145.R.id.textinput_error);
            c0426t.f1165r.setTextAlignment(5);
            Typeface typeface = c0426t.f1147B;
            if (typeface != null) {
                c0426t.f1165r.setTypeface(typeface);
            }
            int i2 = c0426t.f1168u;
            c0426t.f1168u = i2;
            C0991f0 c0991f02 = c0426t.f1165r;
            if (c0991f02 != null) {
                textInputLayout.m1989l(c0991f02, i2);
            }
            ColorStateList colorStateList = c0426t.f1169v;
            c0426t.f1169v = colorStateList;
            C0991f0 c0991f03 = c0426t.f1165r;
            if (c0991f03 != null && colorStateList != null) {
                c0991f03.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0426t.f1166s;
            c0426t.f1166s = charSequence;
            C0991f0 c0991f04 = c0426t.f1165r;
            if (c0991f04 != null) {
                c0991f04.setContentDescription(charSequence);
            }
            int i3 = c0426t.f1167t;
            c0426t.f1167t = i3;
            C0991f0 c0991f05 = c0426t.f1165r;
            if (c0991f05 != null) {
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                c0991f05.setAccessibilityLiveRegion(i3);
            }
            c0426t.f1165r.setVisibility(4);
            c0426t.m1106a(c0426t.f1165r, 0);
        } else {
            c0426t.m1111f();
            c0426t.m1112g(c0426t.f1165r, 0);
            c0426t.f1165r = null;
            textInputLayout.m1995r();
            textInputLayout.m2001x();
        }
        c0426t.f1164q = z2;
    }

    public void setErrorIconDrawable(int i2) {
        C0422p c0422p = this.f2821c;
        c0422p.m1097i(i2 != 0 ? AbstractC0104l.m415w(c0422p.getContext(), i2) : null);
        AbstractC0096d.m336Y(c0422p.f1114a, c0422p.f1116c, c0422p.f1117d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0422p c0422p = this.f2821c;
        CheckableImageButton checkableImageButton = c0422p.f1116c;
        View.OnLongClickListener onLongClickListener = c0422p.f1119f;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0096d.m340c0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0422p c0422p = this.f2821c;
        c0422p.f1119f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0422p.f1116c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0096d.m340c0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0422p c0422p = this.f2821c;
        if (c0422p.f1117d != colorStateList) {
            c0422p.f1117d = colorStateList;
            AbstractC0096d.m343e(c0422p.f1114a, c0422p.f1116c, colorStateList, c0422p.f1118e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0422p c0422p = this.f2821c;
        if (c0422p.f1118e != mode) {
            c0422p.f1118e = mode;
            AbstractC0096d.m343e(c0422p.f1114a, c0422p.f1116c, c0422p.f1117d, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        C0426t c0426t = this.f2835j;
        c0426t.f1168u = i2;
        C0991f0 c0991f0 = c0426t.f1165r;
        if (c0991f0 != null) {
            c0426t.f1155h.m1989l(c0991f0, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0426t c0426t = this.f2835j;
        c0426t.f1169v = colorStateList;
        C0991f0 c0991f0 = c0426t.f1165r;
        if (c0991f0 == null || colorStateList == null) {
            return;
        }
        c0991f0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2862w0 != z2) {
            this.f2862w0 = z2;
            m1998u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        C0426t c0426t = this.f2835j;
        if (isEmpty) {
            if (c0426t.f1171x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0426t.f1171x) {
            setHelperTextEnabled(true);
        }
        c0426t.m1108c();
        c0426t.f1170w = charSequence;
        c0426t.f1172y.setText(charSequence);
        int i2 = c0426t.f1161n;
        if (i2 != 2) {
            c0426t.f1162o = 2;
        }
        c0426t.m1114i(i2, c0426t.f1162o, c0426t.m1113h(c0426t.f1172y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0426t c0426t = this.f2835j;
        c0426t.f1146A = colorStateList;
        C0991f0 c0991f0 = c0426t.f1172y;
        if (c0991f0 == null || colorStateList == null) {
            return;
        }
        c0991f0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        C0426t c0426t = this.f2835j;
        if (c0426t.f1171x == z2) {
            return;
        }
        c0426t.m1108c();
        if (z2) {
            C0991f0 c0991f0 = new C0991f0(c0426t.f1154g, null);
            c0426t.f1172y = c0991f0;
            c0991f0.setId(com.nfupay.s145.R.id.textinput_helper_text);
            c0426t.f1172y.setTextAlignment(5);
            Typeface typeface = c0426t.f1147B;
            if (typeface != null) {
                c0426t.f1172y.setTypeface(typeface);
            }
            c0426t.f1172y.setVisibility(4);
            c0426t.f1172y.setAccessibilityLiveRegion(1);
            int i2 = c0426t.f1173z;
            c0426t.f1173z = i2;
            C0991f0 c0991f02 = c0426t.f1172y;
            if (c0991f02 != null) {
                c0991f02.setTextAppearance(i2);
            }
            ColorStateList colorStateList = c0426t.f1146A;
            c0426t.f1146A = colorStateList;
            C0991f0 c0991f03 = c0426t.f1172y;
            if (c0991f03 != null && colorStateList != null) {
                c0991f03.setTextColor(colorStateList);
            }
            c0426t.m1106a(c0426t.f1172y, 1);
            c0426t.f1172y.setAccessibilityDelegate(new C0425s(c0426t));
        } else {
            c0426t.m1108c();
            int i3 = c0426t.f1161n;
            if (i3 == 2) {
                c0426t.f1162o = 0;
            }
            c0426t.m1114i(i3, c0426t.f1162o, c0426t.m1113h(c0426t.f1172y, ""));
            c0426t.m1112g(c0426t.f1172y, 1);
            c0426t.f1172y = null;
            TextInputLayout textInputLayout = c0426t.f1155h;
            textInputLayout.m1995r();
            textInputLayout.m2001x();
        }
        c0426t.f1171x = z2;
    }

    public void setHelperTextTextAppearance(int i2) {
        C0426t c0426t = this.f2835j;
        c0426t.f1173z = i2;
        C0991f0 c0991f0 = c0426t.f1172y;
        if (c0991f0 != null) {
            c0991f0.setTextAppearance(i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2796C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2864x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2796C) {
            this.f2796C = z2;
            if (z2) {
                CharSequence hint = this.f2823d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2797D)) {
                        setHint(hint);
                    }
                    this.f2823d.setHint((CharSequence) null);
                }
                this.f2798E = true;
            } else {
                this.f2798E = false;
                if (!TextUtils.isEmpty(this.f2797D) && TextUtils.isEmpty(this.f2823d.getHint())) {
                    this.f2823d.setHint(this.f2797D);
                }
                setHintInternal(null);
            }
            if (this.f2823d != null) {
                m1997t();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        C0136d c0136d = this.f2860v0;
        TextInputLayout textInputLayout = c0136d.f389a;
        C0231d c0231d = new C0231d(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = c0231d.f689j;
        if (colorStateList != null) {
            c0136d.f405k = colorStateList;
        }
        float f = c0231d.f690k;
        if (f != 0.0f) {
            c0136d.f403i = f;
        }
        ColorStateList colorStateList2 = c0231d.f680a;
        if (colorStateList2 != null) {
            c0136d.f383U = colorStateList2;
        }
        c0136d.f381S = c0231d.f684e;
        c0136d.f382T = c0231d.f685f;
        c0136d.f380R = c0231d.f686g;
        c0136d.f384V = c0231d.f688i;
        C0228a c0228a = c0136d.f419y;
        if (c0228a != null) {
            c0228a.f673j = true;
        }
        C0046i c0046i = new C0046i(1, c0136d);
        c0231d.m633a();
        c0136d.f419y = new C0228a(c0046i, c0231d.f693n);
        c0231d.m635c(textInputLayout.getContext(), c0136d.f419y);
        c0136d.m467h(false);
        this.f2836j0 = c0136d.f405k;
        if (this.f2823d != null) {
            m1998u(false, false);
            m1997t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2836j0 != colorStateList) {
            if (this.f2834i0 == null) {
                C0136d c0136d = this.f2860v0;
                if (c0136d.f405k != colorStateList) {
                    c0136d.f405k = colorStateList;
                    c0136d.m467h(false);
                }
            }
            this.f2836j0 = colorStateList;
            if (this.f2823d != null) {
                m1998u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0405D interfaceC0405D) {
        this.f2843n = interfaceC0405D;
    }

    public void setMaxEms(int i2) {
        this.f2829g = i2;
        EditText editText = this.f2823d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public void setMaxWidth(int i2) {
        this.f2833i = i2;
        EditText editText = this.f2823d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f2827f = i2;
        EditText editText = this.f2823d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public void setMinWidth(int i2) {
        this.f2831h = i2;
        EditText editText = this.f2823d;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        C0422p c0422p = this.f2821c;
        c0422p.f1120g.setContentDescription(i2 != 0 ? c0422p.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        C0422p c0422p = this.f2821c;
        c0422p.f1120g.setImageDrawable(i2 != 0 ? AbstractC0104l.m415w(c0422p.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        C0422p c0422p = this.f2821c;
        if (z2 && c0422p.f1122i != 1) {
            c0422p.m1095g(1);
        } else if (z2) {
            c0422p.getClass();
        } else {
            c0422p.m1095g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0422p c0422p = this.f2821c;
        c0422p.f1124k = colorStateList;
        AbstractC0096d.m343e(c0422p.f1114a, c0422p.f1120g, colorStateList, c0422p.f1125l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0422p c0422p = this.f2821c;
        c0422p.f1125l = mode;
        AbstractC0096d.m343e(c0422p.f1114a, c0422p.f1120g, c0422p.f1124k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2855t == null) {
            C0991f0 c0991f0 = new C0991f0(getContext(), null);
            this.f2855t = c0991f0;
            c0991f0.setId(com.nfupay.s145.R.id.textinput_placeholder);
            this.f2855t.setImportantForAccessibility(2);
            C1066h m1982d = m1982d();
            this.f2861w = m1982d;
            m1982d.f4188b = 67L;
            this.f2863x = m1982d();
            setPlaceholderTextAppearance(this.f2859v);
            setPlaceholderTextColor(this.f2857u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2853s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2851r = charSequence;
        }
        EditText editText = this.f2823d;
        m1999v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f2859v = i2;
        C0991f0 c0991f0 = this.f2855t;
        if (c0991f0 != null) {
            c0991f0.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2857u != colorStateList) {
            this.f2857u = colorStateList;
            C0991f0 c0991f0 = this.f2855t;
            if (c0991f0 == null || colorStateList == null) {
                return;
            }
            c0991f0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0431y c0431y = this.f2819b;
        c0431y.getClass();
        c0431y.f1192c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0431y.f1191b.setText(charSequence);
        c0431y.m1123e();
    }

    public void setPrefixTextAppearance(int i2) {
        this.f2819b.f1191b.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2819b.f1191b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C0366k c0366k) {
        C0362g c0362g = this.f2799F;
        if (c0362g == null || c0362g.f931a.f914a == c0366k) {
            return;
        }
        this.f2805L = c0366k;
        m1980b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2819b.f1193d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2819b.f1193d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? AbstractC0104l.m415w(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        C0431y c0431y = this.f2819b;
        if (i2 < 0) {
            c0431y.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != c0431y.f1196g) {
            c0431y.f1196g = i2;
            CheckableImageButton checkableImageButton = c0431y.f1193d;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0431y c0431y = this.f2819b;
        View.OnLongClickListener onLongClickListener = c0431y.f1198i;
        CheckableImageButton checkableImageButton = c0431y.f1193d;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0096d.m340c0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0431y c0431y = this.f2819b;
        c0431y.f1198i = onLongClickListener;
        CheckableImageButton checkableImageButton = c0431y.f1193d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0096d.m340c0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0431y c0431y = this.f2819b;
        c0431y.f1197h = scaleType;
        c0431y.f1193d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0431y c0431y = this.f2819b;
        if (c0431y.f1194e != colorStateList) {
            c0431y.f1194e = colorStateList;
            AbstractC0096d.m343e(c0431y.f1190a, c0431y.f1193d, colorStateList, c0431y.f1195f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0431y c0431y = this.f2819b;
        if (c0431y.f1195f != mode) {
            c0431y.f1195f = mode;
            AbstractC0096d.m343e(c0431y.f1190a, c0431y.f1193d, c0431y.f1194e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2819b.m1121c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0422p c0422p = this.f2821c;
        c0422p.getClass();
        c0422p.f1129p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0422p.f1130q.setText(charSequence);
        c0422p.m1102n();
    }

    public void setSuffixTextAppearance(int i2) {
        this.f2821c.f1130q.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2821c.f1130q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0404C c0404c) {
        EditText editText = this.f2823d;
        if (editText != null) {
            AbstractC0272P.m823m(editText, c0404c);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2820b0) {
            this.f2820b0 = typeface;
            this.f2860v0.m472m(typeface);
            C0426t c0426t = this.f2835j;
            if (typeface != c0426t.f1147B) {
                c0426t.f1147B = typeface;
                C0991f0 c0991f0 = c0426t.f1165r;
                if (c0991f0 != null) {
                    c0991f0.setTypeface(typeface);
                }
                C0991f0 c0991f02 = c0426t.f1172y;
                if (c0991f02 != null) {
                    c0991f02.setTypeface(typeface);
                }
            }
            C0991f0 c0991f03 = this.f2845o;
            if (c0991f03 != null) {
                c0991f03.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m1997t() {
        if (this.f2808O != 1) {
            FrameLayout frameLayout = this.f2817a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int m1981c = m1981c();
            if (m1981c != layoutParams.topMargin) {
                layoutParams.topMargin = m1981c;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: u */
    public final void m1998u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C0991f0 c0991f0;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2823d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2823d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2834i0;
        C0136d c0136d = this.f2860v0;
        if (colorStateList2 != null) {
            c0136d.m468i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2834i0;
            c0136d.m468i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2854s0) : this.f2854s0));
        } else if (m1990m()) {
            C0991f0 c0991f02 = this.f2835j.f1165r;
            c0136d.m468i(c0991f02 != null ? c0991f02.getTextColors() : null);
        } else if (this.f2841m && (c0991f0 = this.f2845o) != null) {
            c0136d.m468i(c0991f0.getTextColors());
        } else if (z5 && (colorStateList = this.f2836j0) != null && c0136d.f405k != colorStateList) {
            c0136d.f405k = colorStateList;
            c0136d.m467h(false);
        }
        C0422p c0422p = this.f2821c;
        C0431y c0431y = this.f2819b;
        if (z4 || !this.f2862w0 || (isEnabled() && z5)) {
            if (z3 || this.f2858u0) {
                ValueAnimator valueAnimator = this.f2866y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2866y0.cancel();
                }
                if (z2 && this.f2864x0) {
                    m1979a(1.0f);
                } else {
                    c0136d.m470k(1.0f);
                }
                this.f2858u0 = false;
                if (m1983e()) {
                    m1988j();
                }
                EditText editText3 = this.f2823d;
                m1999v(editText3 != null ? editText3.getText() : null);
                c0431y.f1199j = false;
                c0431y.m1123e();
                c0422p.f1131r = false;
                c0422p.m1102n();
                return;
            }
            return;
        }
        if (z3 || !this.f2858u0) {
            ValueAnimator valueAnimator2 = this.f2866y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2866y0.cancel();
            }
            if (z2 && this.f2864x0) {
                m1979a(0.0f);
            } else {
                c0136d.m470k(0.0f);
            }
            if (m1983e() && !((C0414h) this.f2799F).f1089x.f1087q.isEmpty() && m1983e()) {
                ((C0414h) this.f2799F).m1076n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2858u0 = true;
            C0991f0 c0991f03 = this.f2855t;
            if (c0991f03 != null && this.f2853s) {
                c0991f03.setText((CharSequence) null);
                AbstractC1075q.m2600a(this.f2817a, this.f2863x);
                this.f2855t.setVisibility(4);
            }
            c0431y.f1199j = true;
            c0431y.m1123e();
            c0422p.f1131r = true;
            c0422p.m1102n();
        }
    }

    /* renamed from: v */
    public final void m1999v(Editable editable) {
        ((C0294g) this.f2843n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2817a;
        if (length != 0 || this.f2858u0) {
            C0991f0 c0991f0 = this.f2855t;
            if (c0991f0 == null || !this.f2853s) {
                return;
            }
            c0991f0.setText((CharSequence) null);
            AbstractC1075q.m2600a(frameLayout, this.f2863x);
            this.f2855t.setVisibility(4);
            return;
        }
        if (this.f2855t == null || !this.f2853s || TextUtils.isEmpty(this.f2851r)) {
            return;
        }
        this.f2855t.setText(this.f2851r);
        AbstractC1075q.m2600a(frameLayout, this.f2861w);
        this.f2855t.setVisibility(0);
        this.f2855t.bringToFront();
        announceForAccessibility(this.f2851r);
    }

    /* renamed from: w */
    public final void m2000w(boolean z2, boolean z3) {
        int defaultColor = this.f2844n0.getDefaultColor();
        int colorForState = this.f2844n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2844n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2813T = colorForState2;
        } else if (z3) {
            this.f2813T = colorForState;
        } else {
            this.f2813T = defaultColor;
        }
    }

    /* renamed from: x */
    public final void m2001x() {
        C0991f0 c0991f0;
        EditText editText;
        EditText editText2;
        if (this.f2799F == null || this.f2808O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f2823d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f2823d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2813T = this.f2854s0;
        } else if (m1990m()) {
            if (this.f2844n0 != null) {
                m2000w(z3, z2);
            } else {
                this.f2813T = getErrorCurrentTextColors();
            }
        } else if (!this.f2841m || (c0991f0 = this.f2845o) == null) {
            if (z3) {
                this.f2813T = this.f2842m0;
            } else if (z2) {
                this.f2813T = this.f2840l0;
            } else {
                this.f2813T = this.f2838k0;
            }
        } else if (this.f2844n0 != null) {
            m2000w(z3, z2);
        } else {
            this.f2813T = c0991f0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m1993p();
        }
        C0422p c0422p = this.f2821c;
        c0422p.m1100l();
        CheckableImageButton checkableImageButton = c0422p.f1116c;
        ColorStateList colorStateList = c0422p.f1117d;
        TextInputLayout textInputLayout = c0422p.f1114a;
        AbstractC0096d.m336Y(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0422p.f1124k;
        CheckableImageButton checkableImageButton2 = c0422p.f1120g;
        AbstractC0096d.m336Y(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0422p.m1090b() instanceof C0417k) {
            if (!textInputLayout.m1990m() || checkableImageButton2.getDrawable() == null) {
                AbstractC0096d.m343e(textInputLayout, checkableImageButton2, c0422p.f1124k, c0422p.f1125l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                AbstractC0087a.m304g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        C0431y c0431y = this.f2819b;
        AbstractC0096d.m336Y(c0431y.f1190a, c0431y.f1193d, c0431y.f1194e);
        if (this.f2808O == 2) {
            int i2 = this.f2810Q;
            if (z3 && isEnabled()) {
                this.f2810Q = this.f2812S;
            } else {
                this.f2810Q = this.f2811R;
            }
            if (this.f2810Q != i2 && m1983e() && !this.f2858u0) {
                if (m1983e()) {
                    ((C0414h) this.f2799F).m1076n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m1988j();
            }
        }
        if (this.f2808O == 1) {
            if (!isEnabled()) {
                this.f2814U = this.f2848p0;
            } else if (z2 && !z3) {
                this.f2814U = this.f2852r0;
            } else if (z3) {
                this.f2814U = this.f2850q0;
            } else {
                this.f2814U = this.f2846o0;
            }
        }
        m1980b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2819b.m1120b(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2821c.f1120g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2821c.f1120g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2821c.m1097i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2821c.f1120g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0422p c0422p = this.f2821c;
        CheckableImageButton checkableImageButton = c0422p.f1120g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0422p.f1124k;
            PorterDuff.Mode mode = c0422p.f1125l;
            TextInputLayout textInputLayout = c0422p.f1114a;
            AbstractC0096d.m343e(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0096d.m336Y(textInputLayout, checkableImageButton, c0422p.f1124k);
        }
    }
}
