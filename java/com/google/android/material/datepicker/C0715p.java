package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
public final class C0715p implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f2698a;

    /* renamed from: b */
    public final /* synthetic */ C0717r f2699b;

    public C0715p(C0717r c0717r, MaterialCalendarGridView materialCalendarGridView) {
        this.f2699b = c0717r;
        this.f2698a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f2698a;
        C0714o m1945a = materialCalendarGridView.m1945a();
        if (i2 < m1945a.m1958a() || i2 > m1945a.m1960c()) {
            return;
        }
        if (materialCalendarGridView.m1945a().getItem(i2).longValue() >= ((C0709j) this.f2699b.f2703d.f116b).f2647T.f2625c.f2632a) {
            throw null;
        }
    }
}
