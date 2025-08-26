package p043P0;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nfupay.s145.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p005C.AbstractC0044g;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p014F0.AbstractC0128E;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p030L.AccessibilityManagerTouchExplorationStateChangeListenerC0335b;
import p042P.C0400b;
import p088j.C0991f0;

/* renamed from: P0.p */
/* loaded from: classes.dex */
public final class C0422p extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f1114a;

    /* renamed from: b */
    public final FrameLayout f1115b;

    /* renamed from: c */
    public final CheckableImageButton f1116c;

    /* renamed from: d */
    public ColorStateList f1117d;

    /* renamed from: e */
    public PorterDuff.Mode f1118e;

    /* renamed from: f */
    public View.OnLongClickListener f1119f;

    /* renamed from: g */
    public final CheckableImageButton f1120g;

    /* renamed from: h */
    public final C0421o f1121h;

    /* renamed from: i */
    public int f1122i;

    /* renamed from: j */
    public final LinkedHashSet f1123j;

    /* renamed from: k */
    public ColorStateList f1124k;

    /* renamed from: l */
    public PorterDuff.Mode f1125l;

    /* renamed from: m */
    public int f1126m;

    /* renamed from: n */
    public ImageView.ScaleType f1127n;

    /* renamed from: o */
    public View.OnLongClickListener f1128o;

    /* renamed from: p */
    public CharSequence f1129p;

    /* renamed from: q */
    public final C0991f0 f1130q;

    /* renamed from: r */
    public boolean f1131r;

    /* renamed from: s */
    public EditText f1132s;

    /* renamed from: t */
    public final AccessibilityManager f1133t;

    /* renamed from: u */
    public C0400b f1134u;

    /* renamed from: v */
    public final C0418l f1135v;

    public C0422p(TextInputLayout textInputLayout, C0176h c0176h) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i2 = 0;
        this.f1122i = 0;
        this.f1123j = new LinkedHashSet();
        this.f1135v = new C0418l(this);
        C0419m c0419m = new C0419m(this);
        this.f1133t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1114a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1115b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m1089a = m1089a(this, from, R.id.text_input_error_icon);
        this.f1116c = m1089a;
        CheckableImageButton m1089a2 = m1089a(frameLayout, from, R.id.text_input_end_icon);
        this.f1120g = m1089a2;
        this.f1121h = new C0421o(this, c0176h);
        C0991f0 c0991f0 = new C0991f0(getContext(), null);
        this.f1130q = c0991f0;
        TypedArray typedArray = (TypedArray) c0176h.f516c;
        if (typedArray.hasValue(38)) {
            this.f1117d = AbstractC0104l.m412s(getContext(), c0176h, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f1118e = AbstractC0128E.m457g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m1097i(c0176h.m542q(37));
        }
        m1089a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        m1089a.setImportantForAccessibility(2);
        m1089a.setClickable(false);
        m1089a.setPressable(false);
        m1089a.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f1124k = AbstractC0104l.m412s(getContext(), c0176h, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1125l = AbstractC0128E.m457g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            m1095g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && m1089a2.getContentDescription() != (text = typedArray.getText(27))) {
                m1089a2.setContentDescription(text);
            }
            m1089a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f1124k = AbstractC0104l.m412s(getContext(), c0176h, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f1125l = AbstractC0128E.m457g(typedArray.getInt(55, -1), null);
            }
            m1095g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (m1089a2.getContentDescription() != text2) {
                m1089a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1126m) {
            this.f1126m = dimensionPixelSize;
            m1089a2.setMinimumWidth(dimensionPixelSize);
            m1089a2.setMinimumHeight(dimensionPixelSize);
            m1089a.setMinimumWidth(dimensionPixelSize);
            m1089a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType m353m = AbstractC0096d.m353m(typedArray.getInt(31, -1));
            this.f1127n = m353m;
            m1089a2.setScaleType(m353m);
            m1089a.setScaleType(m353m);
        }
        c0991f0.setVisibility(8);
        c0991f0.setId(R.id.textinput_suffix_text);
        c0991f0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0991f0.setAccessibilityLiveRegion(1);
        c0991f0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0991f0.setTextColor(c0176h.m541p(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f1129p = TextUtils.isEmpty(text3) ? null : text3;
        c0991f0.setText(text3);
        m1102n();
        frameLayout.addView(m1089a2);
        addView(c0991f0);
        addView(frameLayout);
        addView(m1089a);
        textInputLayout.f2826e0.add(c0419m);
        if (textInputLayout.f2823d != null) {
            c0419m.m1085a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0420n(i2, this));
    }

    /* renamed from: a */
    public final CheckableImageButton m1089a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        if (AbstractC0104l.m390E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public final AbstractC0423q m1090b() {
        AbstractC0423q c0412f;
        int i2 = this.f1122i;
        C0421o c0421o = this.f1121h;
        SparseArray sparseArray = c0421o.f1110a;
        AbstractC0423q abstractC0423q = (AbstractC0423q) sparseArray.get(i2);
        if (abstractC0423q != null) {
            return abstractC0423q;
        }
        C0422p c0422p = c0421o.f1111b;
        if (i2 == -1) {
            c0412f = new C0412f(c0422p, 0);
        } else if (i2 == 0) {
            c0412f = new C0412f(c0422p, 1);
        } else if (i2 == 1) {
            c0412f = new C0430x(c0422p, c0421o.f1113d);
        } else if (i2 == 2) {
            c0412f = new C0411e(c0422p);
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(AbstractC0044g.m153e("Invalid end icon mode: ", i2));
            }
            c0412f = new C0417k(c0422p);
        }
        sparseArray.append(i2, c0412f);
        return c0412f;
    }

    /* renamed from: c */
    public final int m1091c() {
        int marginStart;
        if (m1092d() || m1093e()) {
            CheckableImageButton checkableImageButton = this.f1120g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        return this.f1130q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* renamed from: d */
    public final boolean m1092d() {
        return this.f1115b.getVisibility() == 0 && this.f1120g.getVisibility() == 0;
    }

    /* renamed from: e */
    public final boolean m1093e() {
        return this.f1116c.getVisibility() == 0;
    }

    /* renamed from: f */
    public final void m1094f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        AbstractC0423q m1090b = m1090b();
        boolean mo1104k = m1090b.mo1104k();
        CheckableImageButton checkableImageButton = this.f1120g;
        boolean z5 = true;
        if (!mo1104k || (z4 = checkableImageButton.f2729d) == m1090b.mo1080l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(m1090b instanceof C0417k) || (isActivated = checkableImageButton.isActivated()) == m1090b.mo1079j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            AbstractC0096d.m336Y(this.f1114a, checkableImageButton, this.f1124k);
        }
    }

    /* renamed from: g */
    public final void m1095g(int i2) {
        if (this.f1122i == i2) {
            return;
        }
        AbstractC0423q m1090b = m1090b();
        C0400b c0400b = this.f1134u;
        AccessibilityManager accessibilityManager = this.f1133t;
        if (c0400b != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0335b(c0400b));
        }
        this.f1134u = null;
        m1090b.mo1073s();
        this.f1122i = i2;
        Iterator it = this.f1123j.iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        m1096h(i2 != 0);
        AbstractC0423q m1090b2 = m1090b();
        int i3 = this.f1121h.f1112c;
        if (i3 == 0) {
            i3 = m1090b2.mo1066d();
        }
        Drawable m415w = i3 != 0 ? AbstractC0104l.m415w(getContext(), i3) : null;
        CheckableImageButton checkableImageButton = this.f1120g;
        checkableImageButton.setImageDrawable(m415w);
        TextInputLayout textInputLayout = this.f1114a;
        if (m415w != null) {
            AbstractC0096d.m343e(textInputLayout, checkableImageButton, this.f1124k, this.f1125l);
            AbstractC0096d.m336Y(textInputLayout, checkableImageButton, this.f1124k);
        }
        int mo1065c = m1090b2.mo1065c();
        CharSequence text = mo1065c != 0 ? getResources().getText(mo1065c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(m1090b2.mo1104k());
        if (!m1090b2.mo1078i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
        m1090b2.mo1072r();
        C0400b mo1077h = m1090b2.mo1077h();
        this.f1134u = mo1077h;
        if (mo1077h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0335b(this.f1134u));
            }
        }
        View.OnClickListener mo1068f = m1090b2.mo1068f();
        View.OnLongClickListener onLongClickListener = this.f1128o;
        checkableImageButton.setOnClickListener(mo1068f);
        AbstractC0096d.m340c0(checkableImageButton, onLongClickListener);
        EditText editText = this.f1132s;
        if (editText != null) {
            m1090b2.mo1070m(editText);
            m1098j(m1090b2);
        }
        AbstractC0096d.m343e(textInputLayout, checkableImageButton, this.f1124k, this.f1125l);
        m1094f(true);
    }

    /* renamed from: h */
    public final void m1096h(boolean z2) {
        if (m1092d() != z2) {
            this.f1120g.setVisibility(z2 ? 0 : 8);
            m1099k();
            m1101m();
            this.f1114a.m1994q();
        }
    }

    /* renamed from: i */
    public final void m1097i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1116c;
        checkableImageButton.setImageDrawable(drawable);
        m1100l();
        AbstractC0096d.m343e(this.f1114a, checkableImageButton, this.f1117d, this.f1118e);
    }

    /* renamed from: j */
    public final void m1098j(AbstractC0423q abstractC0423q) {
        if (this.f1132s == null) {
            return;
        }
        if (abstractC0423q.mo1067e() != null) {
            this.f1132s.setOnFocusChangeListener(abstractC0423q.mo1067e());
        }
        if (abstractC0423q.mo1069g() != null) {
            this.f1120g.setOnFocusChangeListener(abstractC0423q.mo1069g());
        }
    }

    /* renamed from: k */
    public final void m1099k() {
        this.f1115b.setVisibility((this.f1120g.getVisibility() != 0 || m1093e()) ? 8 : 0);
        setVisibility((m1092d() || m1093e() || !((this.f1129p == null || this.f1131r) ? 8 : false)) ? 0 : 8);
    }

    /* renamed from: l */
    public final void m1100l() {
        CheckableImageButton checkableImageButton = this.f1116c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1114a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2835j.f1164q && textInputLayout.m1990m()) ? 0 : 8);
        m1099k();
        m1101m();
        if (this.f1122i != 0) {
            return;
        }
        textInputLayout.m1994q();
    }

    /* renamed from: m */
    public final void m1101m() {
        int i2;
        TextInputLayout textInputLayout = this.f1114a;
        if (textInputLayout.f2823d == null) {
            return;
        }
        if (m1092d() || m1093e()) {
            i2 = 0;
        } else {
            EditText editText = textInputLayout.f2823d;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            i2 = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2823d.getPaddingTop();
        int paddingBottom = textInputLayout.f2823d.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
        this.f1130q.setPaddingRelative(dimensionPixelSize, paddingTop, i2, paddingBottom);
    }

    /* renamed from: n */
    public final void m1102n() {
        C0991f0 c0991f0 = this.f1130q;
        int visibility = c0991f0.getVisibility();
        int i2 = (this.f1129p == null || this.f1131r) ? 8 : 0;
        if (visibility != i2) {
            m1090b().mo1071p(i2 == 0);
        }
        m1099k();
        c0991f0.setVisibility(i2);
        this.f1114a.m1994q();
    }
}
