package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import p079f0.AbstractC0812H;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0705f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f2637a;

    /* renamed from: b */
    public final /* synthetic */ C0717r f2638b;

    /* renamed from: c */
    public final /* synthetic */ C0709j f2639c;

    public /* synthetic */ ViewOnClickListenerC0705f(C0709j c0709j, C0717r c0717r, int i2) {
        this.f2637a = i2;
        this.f2639c = c0709j;
        this.f2638b = c0717r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2637a) {
            case 0:
                C0709j c0709j = this.f2639c;
                int m1762K0 = ((LinearLayoutManager) c0709j.f2652Y.getLayoutManager()).m1762K0() - 1;
                if (m1762K0 >= 0) {
                    Calendar m1962a = AbstractC0721v.m1962a(this.f2638b.f2702c.f2623a.f2686a);
                    m1962a.add(2, m1762K0);
                    c0709j.m1949A(new C0713n(m1962a));
                    break;
                }
                break;
            default:
                C0709j c0709j2 = this.f2639c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0709j2.f2652Y.getLayoutManager();
                View m1765M0 = linearLayoutManager.m1765M0(0, linearLayoutManager.m2194v(), false);
                int m2166H = (m1765M0 == null ? -1 : AbstractC0812H.m2166H(m1765M0)) + 1;
                if (m2166H < c0709j2.f2652Y.getAdapter().mo474a()) {
                    Calendar m1962a2 = AbstractC0721v.m1962a(this.f2638b.f2702c.f2623a.f2686a);
                    m1962a2.add(2, m2166H);
                    c0709j2.m1949A(new C0713n(m1962a2));
                    break;
                }
                break;
        }
    }
}
