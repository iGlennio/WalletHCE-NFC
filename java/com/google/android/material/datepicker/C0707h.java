package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p079f0.AbstractC0809E;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C0707h extends AbstractC0809E {

    /* renamed from: a */
    public final /* synthetic */ C0709j f2642a;

    public C0707h(C0709j c0709j) {
        this.f2642a = c0709j;
        AbstractC0721v.m1964c(null);
        AbstractC0721v.m1964c(null);
    }

    @Override // p079f0.AbstractC0809E
    /* renamed from: a */
    public final void mo1946a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C0723x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f2642a.getClass();
            throw null;
        }
    }
}
