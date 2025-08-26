package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p045Q.C0444k;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C0701b implements Parcelable {
    public static final Parcelable.Creator<C0701b> CREATOR = new C0444k(6);

    /* renamed from: a */
    public final C0713n f2623a;

    /* renamed from: b */
    public final C0713n f2624b;

    /* renamed from: c */
    public final C0703d f2625c;

    /* renamed from: d */
    public final C0713n f2626d;

    /* renamed from: e */
    public final int f2627e;

    /* renamed from: f */
    public final int f2628f;

    /* renamed from: g */
    public final int f2629g;

    public C0701b(C0713n c0713n, C0713n c0713n2, C0703d c0703d, C0713n c0713n3, int i2) {
        Objects.requireNonNull(c0713n, "start cannot be null");
        Objects.requireNonNull(c0713n2, "end cannot be null");
        Objects.requireNonNull(c0703d, "validator cannot be null");
        this.f2623a = c0713n;
        this.f2624b = c0713n2;
        this.f2626d = c0713n3;
        this.f2627e = i2;
        this.f2625c = c0703d;
        if (c0713n3 != null && c0713n.f2686a.compareTo(c0713n3.f2686a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0713n3 != null && c0713n3.f2686a.compareTo(c0713n2.f2686a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i2 < 0 || i2 > AbstractC0721v.m1964c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f2629g = c0713n.m1957d(c0713n2) + 1;
        this.f2628f = (c0713n2.f2688c - c0713n.f2688c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0701b)) {
            return false;
        }
        C0701b c0701b = (C0701b) obj;
        return this.f2623a.equals(c0701b.f2623a) && this.f2624b.equals(c0701b.f2624b) && Objects.equals(this.f2626d, c0701b.f2626d) && this.f2627e == c0701b.f2627e && this.f2625c.equals(c0701b.f2625c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2623a, this.f2624b, this.f2626d, Integer.valueOf(this.f2627e), this.f2625c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2623a, 0);
        parcel.writeParcelable(this.f2624b, 0);
        parcel.writeParcelable(this.f2626d, 0);
        parcel.writeParcelable(this.f2625c, 0);
        parcel.writeInt(this.f2627e);
    }
}
