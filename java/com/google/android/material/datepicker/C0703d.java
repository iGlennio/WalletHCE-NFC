package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p045Q.C0444k;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final class C0703d implements Parcelable {
    public static final Parcelable.Creator<C0703d> CREATOR = new C0444k(7);

    /* renamed from: a */
    public final long f2632a;

    public C0703d(long j2) {
        this.f2632a = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0703d) && this.f2632a == ((C0703d) obj).f2632a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2632a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f2632a);
    }
}
