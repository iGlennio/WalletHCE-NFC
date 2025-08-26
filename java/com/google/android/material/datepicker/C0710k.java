package com.google.android.material.datepicker;

import android.view.View;
import p027K.C0319s0;
import p027K.InterfaceC0314q;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C0710k implements InterfaceC0314q {

    /* renamed from: a */
    public final View f2657a;

    /* renamed from: b */
    public int f2658b;

    /* renamed from: c */
    public int f2659c;

    public C0710k(View view) {
        this.f2657a = view;
    }

    @Override // p027K.InterfaceC0314q
    /* renamed from: d */
    public C0319s0 mo63d(View view, C0319s0 c0319s0) {
        int i2 = c0319s0.f855a.mo900f(7).f108b;
        View view2 = this.f2657a;
        int i3 = this.f2658b;
        if (i3 >= 0) {
            view2.getLayoutParams().height = i3 + i2;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f2659c + i2, view2.getPaddingRight(), view2.getPaddingBottom());
        return c0319s0;
    }

    public C0710k(View view, int i2, int i3) {
        this.f2658b = i2;
        this.f2657a = view;
        this.f2659c = i3;
    }
}
