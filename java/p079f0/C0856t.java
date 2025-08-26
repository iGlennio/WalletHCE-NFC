package p079f0;

import android.os.Parcel;
import android.os.Parcelable;
import p045Q.C0444k;

/* renamed from: f0.t */
/* loaded from: classes.dex */
public final class C0856t implements Parcelable {
    public static final Parcelable.Creator<C0856t> CREATOR = new C0444k(9);

    /* renamed from: a */
    public int f3465a;

    /* renamed from: b */
    public int f3466b;

    /* renamed from: c */
    public boolean f3467c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3465a);
        parcel.writeInt(this.f3466b);
        parcel.writeInt(this.f3467c ? 1 : 0);
    }
}
