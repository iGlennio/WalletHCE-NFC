package p043P0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.nfupay.s145.R;
import java.util.List;
import java.util.Locale;
import p010D1.AbstractC0104l;
import p014F0.AbstractC0128E;
import p034M0.C0362g;
import p049R0.AbstractC0463a;
import p088j.C0943J0;
import p088j.C1017o;
import p108q0.AbstractC1183a;

/* renamed from: P0.w */
/* loaded from: classes.dex */
public final class C0429w extends C1017o {

    /* renamed from: e */
    public final C0943J0 f1179e;

    /* renamed from: f */
    public final AccessibilityManager f1180f;

    /* renamed from: g */
    public final Rect f1181g;

    /* renamed from: h */
    public final int f1182h;

    /* renamed from: i */
    public final float f1183i;

    /* renamed from: j */
    public ColorStateList f1184j;

    /* renamed from: k */
    public int f1185k;

    /* renamed from: l */
    public ColorStateList f1186l;

    public C0429w(Context context, AttributeSet attributeSet) {
        super(AbstractC0463a.m1220a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f1181g = new Rect();
        Context context2 = getContext();
        TypedArray m456f = AbstractC0128E.m456f(context2, attributeSet, AbstractC1183a.f4530i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (m456f.hasValue(0) && m456f.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1182h = m456f.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f1183i = m456f.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (m456f.hasValue(2)) {
            this.f1184j = ColorStateList.valueOf(m456f.getColor(2, 0));
        }
        this.f1185k = m456f.getColor(4, 0);
        this.f1186l = AbstractC0104l.m413t(context2, m456f, 5);
        this.f1180f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0943J0 c0943j0 = new C0943J0(context2, null, R.attr.listPopupWindowStyle);
        this.f1179e = c0943j0;
        c0943j0.f3822y = true;
        c0943j0.f3823z.setFocusable(true);
        c0943j0.f3812o = this;
        c0943j0.f3823z.setInputMethodMode(2);
        c0943j0.mo2401o(getAdapter());
        c0943j0.f3813p = new C0427u(0, this);
        if (m456f.hasValue(6)) {
            setSimpleItems(m456f.getResourceId(6, 0));
        }
        m456f.recycle();
    }

    /* renamed from: a */
    public static void m1116a(C0429w c0429w, Object obj) {
        c0429w.setText(c0429w.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout m1117b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m1118c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f1180f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m1118c()) {
            this.f1179e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f1184j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m1117b = m1117b();
        return (m1117b == null || !m1117b.f2798E) ? super.getHint() : m1117b.getHint();
    }

    public float getPopupElevation() {
        return this.f1183i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1185k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1186l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m1117b = m1117b();
        if (m1117b != null && m1117b.f2798E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1179e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m1117b = m1117b();
            int i4 = 0;
            if (adapter != null && m1117b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0943J0 c0943j0 = this.f1179e;
                int min = Math.min(adapter.getCount(), Math.max(0, !c0943j0.f3823z.isShowing() ? -1 : c0943j0.f3800c.getSelectedItemPosition()) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, m1117b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable background = c0943j0.f3823z.getBackground();
                if (background != null) {
                    Rect rect = this.f1181g;
                    background.getPadding(rect);
                    i5 += rect.left + rect.right;
                }
                i4 = m1117b.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (m1118c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f1179e.mo2401o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0943J0 c0943j0 = this.f1179e;
        if (c0943j0 != null) {
            c0943j0.m2398k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i2) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f1184j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0362g) {
            ((C0362g) dropDownBackground).m1027j(this.f1184j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f1179e.f3814q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i2) {
        super.setRawInputType(i2);
        TextInputLayout m1117b = m1117b();
        if (m1117b != null) {
            m1117b.m1996s();
        }
    }

    public void setSimpleItemSelectedColor(int i2) {
        this.f1185k = i2;
        if (getAdapter() instanceof C0428v) {
            ((C0428v) getAdapter()).m1115a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1186l = colorStateList;
        if (getAdapter() instanceof C0428v) {
            ((C0428v) getAdapter()).m1115a();
        }
    }

    public void setSimpleItems(int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m1118c()) {
            this.f1179e.mo2310i();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C0428v(this, getContext(), this.f1182h, strArr));
    }
}
