package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public final class C0712m<S> extends AbstractC0718s {

    /* renamed from: S */
    public int f2684S;

    /* renamed from: T */
    public C0701b f2685T;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: m */
    public final void mo1655m(Bundle bundle) {
        super.mo1655m(bundle);
        if (bundle == null) {
            bundle = this.f2224f;
        }
        this.f2684S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2685T = (C0701b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: n */
    public final View mo1670n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m1666h(), this.f2684S));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0641o
    /* renamed from: r */
    public final void mo1659r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2684S);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2685T);
    }
}
