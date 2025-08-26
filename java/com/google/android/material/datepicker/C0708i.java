package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p079f0.AbstractC0812H;
import p079f0.AbstractC0815K;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public final class C0708i extends AbstractC0815K {

    /* renamed from: a */
    public final /* synthetic */ C0717r f2643a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f2644b;

    /* renamed from: c */
    public final /* synthetic */ C0709j f2645c;

    public C0708i(C0709j c0709j, C0717r c0717r, MaterialButton materialButton) {
        this.f2645c = c0709j;
        this.f2643a = c0717r;
        this.f2644b = materialButton;
    }

    @Override // p079f0.AbstractC0815K
    /* renamed from: a */
    public final void mo1947a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.f2644b.getText());
        }
    }

    @Override // p079f0.AbstractC0815K
    /* renamed from: b */
    public final void mo1948b(RecyclerView recyclerView, int i2, int i3) {
        int m1762K0;
        C0709j c0709j = this.f2645c;
        if (i2 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0709j.f2652Y.getLayoutManager();
            View m1765M0 = linearLayoutManager.m1765M0(0, linearLayoutManager.m2194v(), false);
            m1762K0 = m1765M0 == null ? -1 : AbstractC0812H.m2166H(m1765M0);
        } else {
            m1762K0 = ((LinearLayoutManager) c0709j.f2652Y.getLayoutManager()).m1762K0();
        }
        C0701b c0701b = this.f2643a.f2702c;
        Calendar m1962a = AbstractC0721v.m1962a(c0701b.f2623a.f2686a);
        m1962a.add(2, m1762K0);
        c0709j.f2648U = new C0713n(m1962a);
        Calendar m1962a2 = AbstractC0721v.m1962a(c0701b.f2623a.f2686a);
        m1962a2.add(2, m1762K0);
        m1962a2.set(5, 1);
        Calendar m1962a3 = AbstractC0721v.m1962a(m1962a2);
        m1962a3.get(2);
        m1962a3.get(1);
        m1962a3.getMaximum(7);
        m1962a3.getActualMaximum(5);
        m1962a3.getTimeInMillis();
        long timeInMillis = m1962a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = AbstractC0721v.f2706a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f2644b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
