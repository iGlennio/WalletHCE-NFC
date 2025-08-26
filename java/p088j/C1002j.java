package p088j;

import android.os.Parcel;
import android.os.Parcelable;
import p045Q.C0444k;

/* renamed from: j.j */
/* loaded from: classes.dex */
public final class C1002j implements Parcelable {
    public static final Parcelable.Creator<C1002j> CREATOR = new C0444k(12);

    /* renamed from: a */
    public int f3956a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3956a);
    }
}
