package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nfupay.s145.R;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
public final class C0714o extends BaseAdapter {

    /* renamed from: d */
    public static final int f2693d = AbstractC0721v.m1964c(null).getMaximum(4);

    /* renamed from: e */
    public static final int f2694e = (AbstractC0721v.m1964c(null).getMaximum(7) + AbstractC0721v.m1964c(null).getMaximum(5)) - 1;

    /* renamed from: a */
    public final C0713n f2695a;

    /* renamed from: b */
    public C0702c f2696b;

    /* renamed from: c */
    public final C0701b f2697c;

    public C0714o(C0713n c0713n, C0701b c0701b) {
        this.f2695a = c0713n;
        this.f2697c = c0701b;
        throw null;
    }

    /* renamed from: a */
    public final int m1958a() {
        int i2 = this.f2697c.f2627e;
        C0713n c0713n = this.f2695a;
        Calendar calendar = c0713n.f2686a;
        int i3 = calendar.get(7);
        if (i2 <= 0) {
            i2 = calendar.getFirstDayOfWeek();
        }
        int i4 = i3 - i2;
        return i4 < 0 ? i4 + c0713n.f2689d : i4;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i2) {
        if (i2 < m1958a() || i2 > m1960c()) {
            return null;
        }
        int m1958a = (i2 - m1958a()) + 1;
        Calendar m1962a = AbstractC0721v.m1962a(this.f2695a.f2686a);
        m1962a.set(5, m1958a);
        return Long.valueOf(m1962a.getTimeInMillis());
    }

    /* renamed from: c */
    public final int m1960c() {
        return (m1958a() + this.f2695a.f2690e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f2694e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.f2695a.f2689d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f2696b == null) {
            this.f2696b = new C0702c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int m1958a = i2 - m1958a();
        if (m1958a >= 0) {
            C0713n c0713n = this.f2695a;
            if (m1958a < c0713n.f2690e) {
                textView.setTag(c0713n);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(m1958a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i2) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                AbstractC0721v.m1963b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i2) == null) {
            textView.getContext();
            AbstractC0721v.m1963b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
