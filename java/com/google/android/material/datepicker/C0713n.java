package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p045Q.C0444k;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public final class C0713n implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0713n> CREATOR = new C0444k(8);

    /* renamed from: a */
    public final Calendar f2686a;

    /* renamed from: b */
    public final int f2687b;

    /* renamed from: c */
    public final int f2688c;

    /* renamed from: d */
    public final int f2689d;

    /* renamed from: e */
    public final int f2690e;

    /* renamed from: f */
    public final long f2691f;

    /* renamed from: g */
    public String f2692g;

    public C0713n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m1962a = AbstractC0721v.m1962a(calendar);
        this.f2686a = m1962a;
        this.f2687b = m1962a.get(2);
        this.f2688c = m1962a.get(1);
        this.f2689d = m1962a.getMaximum(7);
        this.f2690e = m1962a.getActualMaximum(5);
        this.f2691f = m1962a.getTimeInMillis();
    }

    /* renamed from: a */
    public static C0713n m1954a(int i2, int i3) {
        Calendar m1964c = AbstractC0721v.m1964c(null);
        m1964c.set(1, i2);
        m1964c.set(2, i3);
        return new C0713n(m1964c);
    }

    /* renamed from: b */
    public static C0713n m1955b(long j2) {
        Calendar m1964c = AbstractC0721v.m1964c(null);
        m1964c.setTimeInMillis(j2);
        return new C0713n(m1964c);
    }

    /* renamed from: c */
    public final String m1956c() {
        if (this.f2692g == null) {
            long timeInMillis = this.f2686a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC0721v.f2706a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f2692g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f2692g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2686a.compareTo(((C0713n) obj).f2686a);
    }

    /* renamed from: d */
    public final int m1957d(C0713n c0713n) {
        if (!(this.f2686a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0713n.f2687b - this.f2687b) + ((c0713n.f2688c - this.f2688c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0713n)) {
            return false;
        }
        C0713n c0713n = (C0713n) obj;
        return this.f2687b == c0713n.f2687b && this.f2688c == c0713n.f2688c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2687b), Integer.valueOf(this.f2688c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2688c);
        parcel.writeInt(this.f2687b);
    }
}
