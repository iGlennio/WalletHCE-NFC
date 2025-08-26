package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import p005C.C0046i;
import p014F0.C0133a;
import p014F0.ViewOnClickListenerC0141i;
import p018H.RunnableC0182b;
import p027K.AbstractC0272P;
import p045Q.C0441h;
import p079f0.C0829Z;
import p079f0.C0860x;

/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public final class C0709j<S> extends AbstractC0718s {

    /* renamed from: S */
    public int f2646S;

    /* renamed from: T */
    public C0701b f2647T;

    /* renamed from: U */
    public C0713n f2648U;

    /* renamed from: V */
    public int f2649V;

    /* renamed from: W */
    public C0702c f2650W;

    /* renamed from: X */
    public RecyclerView f2651X;

    /* renamed from: Y */
    public RecyclerView f2652Y;

    /* renamed from: Z */
    public View f2653Z;

    /* renamed from: a0 */
    public View f2654a0;

    /* renamed from: b0 */
    public View f2655b0;

    /* renamed from: c0 */
    public View f2656c0;

    /* renamed from: A */
    public final void m1949A(C0713n c0713n) {
        C0717r c0717r = (C0717r) this.f2652Y.getAdapter();
        int m1957d = c0717r.f2702c.f2623a.m1957d(c0713n);
        int m1957d2 = m1957d - c0717r.f2702c.f2623a.m1957d(this.f2648U);
        boolean z2 = Math.abs(m1957d2) > 3;
        boolean z3 = m1957d2 > 0;
        this.f2648U = c0713n;
        if (z2 && z3) {
            this.f2652Y.m1825Z(m1957d - 3);
            this.f2652Y.post(new RunnableC0182b(this, m1957d, 2));
        } else if (!z2) {
            this.f2652Y.post(new RunnableC0182b(this, m1957d, 2));
        } else {
            this.f2652Y.m1825Z(m1957d + 3);
            this.f2652Y.post(new RunnableC0182b(this, m1957d, 2));
        }
    }

    /* renamed from: B */
    public final void m1950B(int i2) {
        this.f2649V = i2;
        if (i2 == 2) {
            this.f2651X.getLayoutManager().mo1791n0(this.f2648U.f2688c - ((C0723x) this.f2651X.getAdapter()).f2708c.f2647T.f2623a.f2688c);
            this.f2655b0.setVisibility(0);
            this.f2656c0.setVisibility(8);
            this.f2653Z.setVisibility(8);
            this.f2654a0.setVisibility(8);
            return;
        }
        if (i2 == 1) {
            this.f2655b0.setVisibility(8);
            this.f2656c0.setVisibility(0);
            this.f2653Z.setVisibility(0);
            this.f2654a0.setVisibility(0);
            m1949A(this.f2648U);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: m */
    public final void mo1655m(Bundle bundle) {
        super.mo1655m(bundle);
        if (bundle == null) {
            bundle = this.f2224f;
        }
        this.f2646S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2647T = (C0701b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2648U = (C0713n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: n */
    public final View mo1670n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        int i3;
        C0860x c0860x;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1666h(), this.f2646S);
        this.f2650W = new C0702c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0713n c0713n = this.f2647T.f2623a;
        if (C0711l.m1952D(contextThemeWrapper, R.attr.windowFullscreen)) {
            i2 = com.nfupay.s145.R.layout.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = com.nfupay.s145.R.layout.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = m1671w().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.nfupay.s145.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.nfupay.s145.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.nfupay.s145.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.nfupay.s145.R.dimen.mtrl_calendar_days_of_week_height);
        int i4 = C0714o.f2693d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.nfupay.s145.R.dimen.mtrl_calendar_month_vertical_padding) * (i4 - 1)) + (resources.getDimensionPixelSize(com.nfupay.s145.R.dimen.mtrl_calendar_day_height) * i4) + resources.getDimensionPixelOffset(com.nfupay.s145.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.nfupay.s145.R.id.mtrl_calendar_days_of_week);
        AbstractC0272P.m823m(gridView, new C0441h(2));
        int i5 = this.f2647T.f2627e;
        gridView.setAdapter((ListAdapter) (i5 > 0 ? new C0704e(i5) : new C0704e()));
        gridView.setNumColumns(c0713n.f2689d);
        gridView.setEnabled(false);
        this.f2652Y = (RecyclerView) inflate.findViewById(com.nfupay.s145.R.id.mtrl_calendar_months);
        this.f2652Y.setLayoutManager(new C0706g(this, i3, i3));
        this.f2652Y.setTag("MONTHS_VIEW_GROUP_TAG");
        C0717r c0717r = new C0717r(contextThemeWrapper, this.f2647T, new C0046i(21, this));
        this.f2652Y.setAdapter(c0717r);
        int integer = contextThemeWrapper.getResources().getInteger(com.nfupay.s145.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(com.nfupay.s145.R.id.mtrl_calendar_year_selector_frame);
        this.f2651X = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f2651X.setLayoutManager(new GridLayoutManager(integer));
            this.f2651X.setAdapter(new C0723x(this));
            this.f2651X.m1831g(new C0707h(this));
        }
        if (inflate.findViewById(com.nfupay.s145.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.nfupay.s145.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC0272P.m823m(materialButton, new C0133a(2, this));
            View findViewById = inflate.findViewById(com.nfupay.s145.R.id.month_navigation_previous);
            this.f2653Z = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.nfupay.s145.R.id.month_navigation_next);
            this.f2654a0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2655b0 = inflate.findViewById(com.nfupay.s145.R.id.mtrl_calendar_year_selector_frame);
            this.f2656c0 = inflate.findViewById(com.nfupay.s145.R.id.mtrl_calendar_day_selector_frame);
            m1950B(1);
            materialButton.setText(this.f2648U.m1956c());
            this.f2652Y.m1832h(new C0708i(this, c0717r, materialButton));
            int i6 = 1;
            materialButton.setOnClickListener(new ViewOnClickListenerC0141i(i6, this));
            this.f2654a0.setOnClickListener(new ViewOnClickListenerC0705f(this, c0717r, i6));
            this.f2653Z.setOnClickListener(new ViewOnClickListenerC0705f(this, c0717r, 0));
        }
        if (!C0711l.m1952D(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0860x = new C0860x()).f3487a) != (recyclerView = this.f2652Y)) {
            C0829Z c0829z = c0860x.f3488b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f2405e0;
                if (arrayList != null) {
                    arrayList.remove(c0829z);
                }
                c0860x.f3487a.setOnFlingListener(null);
            }
            c0860x.f3487a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0860x.f3487a.m1832h(c0829z);
                c0860x.f3487a.setOnFlingListener(c0860x);
                new Scroller(c0860x.f3487a.getContext(), new DecelerateInterpolator());
                c0860x.m2276f();
            }
        }
        this.f2652Y.m1825Z(c0717r.f2702c.f2623a.m1957d(this.f2648U));
        AbstractC0272P.m823m(this.f2652Y, new C0441h(3));
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: r */
    public final void mo1659r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2646S);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2647T);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2648U);
    }
}
