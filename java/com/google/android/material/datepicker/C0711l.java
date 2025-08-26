package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l;
import com.google.android.material.internal.CheckableImageButton;
import com.nfupay.s145.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p003B0.ViewOnTouchListenerC0029a;
import p005C.AbstractC0038a;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p027K.AbstractC0280Y;
import p027K.C0321t0;
import p027K.C0323u0;
import p027K.C0327w0;
import p034M0.C0360e;
import p034M0.C0362g;
import p043P0.ViewOnClickListenerC0407a;
import p047Q1.AbstractC0458e;
import p108q0.AbstractC1183a;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final class C0711l<S> extends DialogInterfaceOnCancelListenerC0638l {

    /* renamed from: A0 */
    public CharSequence f2660A0;

    /* renamed from: B0 */
    public CharSequence f2661B0;

    /* renamed from: e0 */
    public final LinkedHashSet f2662e0;

    /* renamed from: f0 */
    public final LinkedHashSet f2663f0;

    /* renamed from: g0 */
    public int f2664g0;

    /* renamed from: h0 */
    public AbstractC0718s f2665h0;

    /* renamed from: i0 */
    public C0701b f2666i0;

    /* renamed from: j0 */
    public C0709j f2667j0;

    /* renamed from: k0 */
    public int f2668k0;

    /* renamed from: l0 */
    public CharSequence f2669l0;

    /* renamed from: m0 */
    public boolean f2670m0;

    /* renamed from: n0 */
    public int f2671n0;

    /* renamed from: o0 */
    public int f2672o0;

    /* renamed from: p0 */
    public CharSequence f2673p0;

    /* renamed from: q0 */
    public int f2674q0;

    /* renamed from: r0 */
    public CharSequence f2675r0;

    /* renamed from: s0 */
    public int f2676s0;

    /* renamed from: t0 */
    public CharSequence f2677t0;

    /* renamed from: u0 */
    public int f2678u0;

    /* renamed from: v0 */
    public CharSequence f2679v0;

    /* renamed from: w0 */
    public TextView f2680w0;

    /* renamed from: x0 */
    public CheckableImageButton f2681x0;

    /* renamed from: y0 */
    public C0362g f2682y0;

    /* renamed from: z0 */
    public boolean f2683z0;

    public C0711l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2662e0 = new LinkedHashSet();
        this.f2663f0 = new LinkedHashSet();
    }

    /* renamed from: C */
    public static int m1951C(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar m1963b = AbstractC0721v.m1963b();
        m1963b.set(5, 1);
        Calendar m1962a = AbstractC0721v.m1962a(m1963b);
        m1962a.get(2);
        m1962a.get(1);
        int maximum = m1962a.getMaximum(7);
        m1962a.getActualMaximum(5);
        m1962a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: D */
    public static boolean m1952D(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0096d.m339b0(context, R.attr.materialCalendarStyle, C0709j.class.getCanonicalName()).data, new int[]{i2});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l
    /* renamed from: A */
    public final Dialog mo1652A() {
        Context m1671w = m1671w();
        m1671w();
        int i2 = this.f2664g0;
        if (i2 == 0) {
            m1953B();
            throw null;
        }
        Dialog dialog = new Dialog(m1671w, i2);
        Context context = dialog.getContext();
        this.f2670m0 = m1952D(context, android.R.attr.windowFullscreen);
        this.f2682y0 = new C0362g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1183a.f4533l, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f2682y0.m1025h(context);
        this.f2682y0.m1027j(ColorStateList.valueOf(color));
        C0362g c0362g = this.f2682y0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        c0362g.m1026i(AbstractC0261E.m748i(decorView));
        return dialog;
    }

    /* renamed from: B */
    public final void m1953B() {
        if (this.f2224f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l, androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: m */
    public final void mo1655m(Bundle bundle) {
        super.mo1655m(bundle);
        if (bundle == null) {
            bundle = this.f2224f;
        }
        this.f2664g0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2666i0 = (C0701b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2668k0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2669l0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2671n0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2672o0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2673p0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f2674q0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2675r0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f2676s0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2677t0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f2678u0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2679v0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f2669l0;
        if (charSequence == null) {
            charSequence = m1671w().getResources().getText(this.f2668k0);
        }
        this.f2660A0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f2661B0 = charSequence;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: n */
    public final View mo1670n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f2670m0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f2670m0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m1951C(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m1951C(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        textView.setAccessibilityLiveRegion(1);
        this.f2681x0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2680w0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f2681x0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2681x0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0104l.m415w(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0104l.m415w(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2681x0.setChecked(this.f2671n0 != 0);
        AbstractC0272P.m823m(this.f2681x0, null);
        CheckableImageButton checkableImageButton2 = this.f2681x0;
        this.f2681x0.setContentDescription(this.f2671n0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f2681x0.setOnClickListener(new ViewOnClickListenerC0407a(3, this));
        m1953B();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2662e0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2663f0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f2207E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l, androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: r */
    public final void mo1659r(Bundle bundle) {
        super.mo1659r(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2664g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0701b c0701b = this.f2666i0;
        C0700a c0700a = new C0700a();
        int i2 = C0700a.f2621b;
        int i3 = C0700a.f2621b;
        long j2 = c0701b.f2623a.f2691f;
        long j3 = c0701b.f2624b.f2691f;
        c0700a.f2622a = Long.valueOf(c0701b.f2626d.f2691f);
        C0709j c0709j = this.f2667j0;
        C0713n c0713n = c0709j == null ? null : c0709j.f2648U;
        if (c0713n != null) {
            c0700a.f2622a = Long.valueOf(c0713n.f2691f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0701b.f2625c);
        C0713n m1955b = C0713n.m1955b(j2);
        C0713n m1955b2 = C0713n.m1955b(j3);
        C0703d c0703d = (C0703d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = c0700a.f2622a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0701b(m1955b, m1955b2, c0703d, l2 == null ? null : C0713n.m1955b(l2.longValue()), c0701b.f2627e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f2668k0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2669l0);
        bundle.putInt("INPUT_MODE_KEY", this.f2671n0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2672o0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2673p0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2674q0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2675r0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2676s0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2677t0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2678u0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2679v0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l, androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: s */
    public final void mo1660s() {
        C0321t0 c0321t0;
        C0321t0 c0321t02;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.mo1660s();
        Dialog dialog = this.f2186a0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f2670m0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2682y0);
            if (!this.f2683z0) {
                View findViewById = m1672x().findViewById(R.id.fullscreen_header);
                ColorStateList m1168A = AbstractC0458e.m1168A(findViewById.getBackground());
                Integer valueOf = m1168A != null ? Integer.valueOf(m1168A.getDefaultColor()) : null;
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int m1207y = AbstractC0458e.m1207y(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(m1207y);
                }
                if (i2 >= 30) {
                    AbstractC0280Y.m845a(window, false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                window.getContext();
                int m112d = i2 < 27 ? AbstractC0038a.m112d(AbstractC0458e.m1207y(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(m112d);
                boolean z4 = AbstractC0458e.m1171E(0) || AbstractC0458e.m1171E(valueOf.intValue());
                C0360e c0360e = new C0360e(window.getDecorView());
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    insetsController2 = window.getInsetsController();
                    C0327w0 c0327w0 = new C0327w0(insetsController2, c0360e);
                    c0327w0.f862i = window;
                    c0321t0 = c0327w0;
                } else {
                    c0321t0 = i3 >= 26 ? new C0323u0(window, c0360e) : new C0321t0(window, c0360e);
                }
                c0321t0.mo943W(z4);
                boolean m1171E = AbstractC0458e.m1171E(m1207y);
                if (AbstractC0458e.m1171E(m112d) || (m112d == 0 && m1171E)) {
                    z2 = true;
                }
                C0360e c0360e2 = new C0360e(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    insetsController = window.getInsetsController();
                    C0327w0 c0327w02 = new C0327w0(insetsController, c0360e2);
                    c0327w02.f862i = window;
                    c0321t02 = c0327w02;
                } else {
                    c0321t02 = i4 >= 26 ? new C0323u0(window, c0360e2) : new C0321t0(window, c0360e2);
                }
                c0321t02.mo945V(z2);
                C0710k c0710k = new C0710k(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                AbstractC0261E.m760u(findViewById, c0710k);
                this.f2683z0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1671w().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2682y0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView2 = window.getDecorView();
            Dialog dialog2 = this.f2186a0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView2.setOnTouchListener(new ViewOnTouchListenerC0029a(dialog2, rect));
        }
        m1671w();
        int i5 = this.f2664g0;
        if (i5 == 0) {
            m1953B();
            throw null;
        }
        m1953B();
        C0701b c0701b = this.f2666i0;
        C0709j c0709j = new C0709j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i5);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0701b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0701b.f2626d);
        c0709j.m1674z(bundle);
        this.f2667j0 = c0709j;
        AbstractC0718s abstractC0718s = c0709j;
        if (this.f2671n0 == 1) {
            m1953B();
            C0701b c0701b2 = this.f2666i0;
            AbstractC0718s c0712m = new C0712m();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i5);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0701b2);
            c0712m.m1674z(bundle2);
            abstractC0718s = c0712m;
        }
        this.f2665h0 = abstractC0718s;
        this.f2680w0.setText((this.f2671n0 == 1 && m1671w().getResources().getConfiguration().orientation == 2) ? this.f2661B0 : this.f2660A0);
        m1953B();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l, androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: t */
    public final void mo1661t() {
        this.f2665h0.f2705R.clear();
        super.mo1661t();
    }
}
