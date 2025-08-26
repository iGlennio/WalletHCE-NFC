package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import p045Q.C0444k;

/* renamed from: androidx.fragment.app.B */
/* loaded from: classes.dex */
public final class C0612B implements Parcelable {
    public static final Parcelable.Creator<C0612B> CREATOR = new C0444k(3);

    /* renamed from: a */
    public String f2025a;

    /* renamed from: b */
    public int f2026b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2025a);
        parcel.writeInt(this.f2026b);
    }
}
