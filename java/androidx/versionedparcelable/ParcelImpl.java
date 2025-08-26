package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p045Q.C0444k;
import p094l0.C1132b;
import p094l0.InterfaceC1133c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0444k(14);

    /* renamed from: a */
    public final InterfaceC1133c f2463a;

    public ParcelImpl(Parcel parcel) {
        this.f2463a = new C1132b(parcel).m2629g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new C1132b(parcel).m2631i(this.f2463a);
    }
}
