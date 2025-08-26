package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.nfupay.s145.R;
import java.util.Calendar;
import p005C.C0046i;
import p079f0.AbstractC0827X;
import p079f0.AbstractC0862z;
import p079f0.C0813I;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
public final class C0717r extends AbstractC0862z {

    /* renamed from: c */
    public final C0701b f2702c;

    /* renamed from: d */
    public final C0046i f2703d;

    /* renamed from: e */
    public final int f2704e;

    public C0717r(ContextThemeWrapper contextThemeWrapper, C0701b c0701b, C0046i c0046i) {
        C0713n c0713n = c0701b.f2623a;
        C0713n c0713n2 = c0701b.f2626d;
        if (c0713n.f2686a.compareTo(c0713n2.f2686a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0713n2.f2686a.compareTo(c0701b.f2624b.f2686a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f2704e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C0714o.f2693d) + (C0711l.m1952D(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f2702c = c0701b;
        this.f2703d = c0046i;
        if (this.f3492a.m2152a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3493b = true;
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: a */
    public final int mo474a() {
        return this.f2702c.f2629g;
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: b */
    public final long mo475b(int i2) {
        Calendar m1962a = AbstractC0721v.m1962a(this.f2702c.f2623a.f2686a);
        m1962a.add(2, i2);
        m1962a.set(5, 1);
        Calendar m1962a2 = AbstractC0721v.m1962a(m1962a);
        m1962a2.get(2);
        m1962a2.get(1);
        m1962a2.getMaximum(7);
        m1962a2.getActualMaximum(5);
        m1962a2.getTimeInMillis();
        return m1962a2.getTimeInMillis();
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: d */
    public final void mo477d(AbstractC0827X abstractC0827X, int i2) {
        C0716q c0716q = (C0716q) abstractC0827X;
        C0701b c0701b = this.f2702c;
        Calendar m1962a = AbstractC0721v.m1962a(c0701b.f2623a.f2686a);
        m1962a.add(2, i2);
        C0713n c0713n = new C0713n(m1962a);
        c0716q.f2700t.setText(c0713n.m1956c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0716q.f2701u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m1945a() == null || !c0713n.equals(materialCalendarGridView.m1945a().f2695a)) {
            new C0714o(c0713n, c0701b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m1945a().getClass();
        throw null;
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: e */
    public final AbstractC0827X mo478e(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0711l.m1952D(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0716q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0813I(-1, this.f2704e));
        return new C0716q(linearLayout, true);
    }
}
