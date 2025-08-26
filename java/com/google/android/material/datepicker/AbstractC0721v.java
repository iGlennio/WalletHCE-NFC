package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.v */
/* loaded from: classes.dex */
public abstract class AbstractC0721v {

    /* renamed from: a */
    public static final AtomicReference f2706a = new AtomicReference();

    /* renamed from: a */
    public static Calendar m1962a(Calendar calendar) {
        Calendar m1964c = m1964c(calendar);
        Calendar m1964c2 = m1964c(null);
        m1964c2.set(m1964c.get(1), m1964c.get(2), m1964c.get(5));
        return m1964c2;
    }

    /* renamed from: b */
    public static Calendar m1963b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: c */
    public static Calendar m1964c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
