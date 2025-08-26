package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p079f0.C0824U;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public final class C0706g extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ int f2640E;

    /* renamed from: F */
    public final /* synthetic */ C0709j f2641F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0706g(C0709j c0709j, int i2, int i3) {
        super(i2);
        this.f2641F = c0709j;
        this.f2640E = i3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: A0 */
    public final void mo1753A0(C0824U c0824u, int[] iArr) {
        int i2 = this.f2640E;
        C0709j c0709j = this.f2641F;
        if (i2 == 0) {
            iArr[0] = c0709j.f2652Y.getWidth();
            iArr[1] = c0709j.f2652Y.getWidth();
        } else {
            iArr[0] = c0709j.f2652Y.getHeight();
            iArr[1] = c0709j.f2652Y.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p079f0.AbstractC0812H
    /* renamed from: x0 */
    public final void mo1794x0(RecyclerView recyclerView, int i2) {
        C0719t c0719t = new C0719t(recyclerView.getContext());
        c0719t.f3468a = i2;
        m2196y0(c0719t);
    }
}
