package p014F0;

import android.os.Parcel;
import android.os.Parcelable;
import p050S.AbstractC0465b;

/* renamed from: F0.c */
/* loaded from: classes.dex */
public final class C0135c extends AbstractC0465b {
    public static final Parcelable.Creator<C0135c> CREATOR = new C0134b(0);

    /* renamed from: c */
    public boolean f362c;

    public C0135c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f362c = parcel.readInt() == 1;
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f362c ? 1 : 0);
    }
}
