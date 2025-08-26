package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C0651y;
import com.nfupay.s145.R;
import java.util.Locale;
import p079f0.AbstractC0827X;
import p079f0.AbstractC0862z;

/* renamed from: com.google.android.material.datepicker.x */
/* loaded from: classes.dex */
public final class C0723x extends AbstractC0862z {

    /* renamed from: c */
    public final C0709j f2708c;

    public C0723x(C0709j c0709j) {
        this.f2708c = c0709j;
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: a */
    public final int mo474a() {
        return this.f2708c.f2647T.f2628f;
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: d */
    public final void mo477d(AbstractC0827X abstractC0827X, int i2) {
        C0709j c0709j = this.f2708c;
        int i3 = c0709j.f2647T.f2623a.f2688c + i2;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i3));
        TextView textView = ((C0722w) abstractC0827X).f2707t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC0721v.m1963b().get(1) == i3 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i3)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i3)));
        C0702c c0702c = c0709j.f2650W;
        if (AbstractC0721v.m1963b().get(1) == i3) {
            C0651y c0651y = c0702c.f2631b;
        } else {
            C0651y c0651y2 = c0702c.f2630a;
        }
        throw null;
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: e */
    public final AbstractC0827X mo478e(ViewGroup viewGroup, int i2) {
        return new C0722w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
