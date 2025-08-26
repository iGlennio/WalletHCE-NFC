package p079f0;

import android.os.Parcel;
import android.os.Parcelable;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: f0.Q */
/* loaded from: classes.dex */
public final class C0821Q extends AbstractC0465b {
    public static final Parcelable.Creator<C0821Q> CREATOR = new C0134b(7);

    /* renamed from: c */
    public Parcelable f3250c;

    public C0821Q(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3250c = parcel.readParcelable(classLoader == null ? AbstractC0812H.class.getClassLoader() : classLoader);
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f3250c, 0);
    }
}
