package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nfupay.s145.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class C0704e extends BaseAdapter {

    /* renamed from: d */
    public static final int f2633d;

    /* renamed from: a */
    public final Calendar f2634a;

    /* renamed from: b */
    public final int f2635b;

    /* renamed from: c */
    public final int f2636c;

    static {
        f2633d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C0704e() {
        Calendar m1964c = AbstractC0721v.m1964c(null);
        this.f2634a = m1964c;
        this.f2635b = m1964c.getMaximum(7);
        this.f2636c = m1964c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2635b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        int i3 = this.f2635b;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f2636c;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i3 = i2 + this.f2636c;
        int i4 = this.f2635b;
        if (i3 > i4) {
            i3 -= i4;
        }
        Calendar calendar = this.f2634a;
        calendar.set(7, i3);
        textView.setText(calendar.getDisplayName(7, f2633d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0704e(int i2) {
        Calendar m1964c = AbstractC0721v.m1964c(null);
        this.f2634a = m1964c;
        this.f2635b = m1964c.getMaximum(7);
        this.f2636c = i2;
    }
}
