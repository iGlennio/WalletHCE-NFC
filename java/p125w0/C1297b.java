package p125w0;

import android.os.Parcel;
import android.os.Parcelable;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public final class C1297b extends AbstractC0465b {
    public static final Parcelable.Creator<C1297b> CREATOR = new C0134b(11);

    /* renamed from: c */
    public boolean f5308c;

    public C1297b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1297b.class.getClassLoader();
        }
        this.f5308c = parcel.readInt() == 1;
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f5308c ? 1 : 0);
    }
}
