package p019H0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: H0.g */
/* loaded from: classes.dex */
public final class C0201g extends AbstractC0465b {
    public static final Parcelable.Creator<C0201g> CREATOR = new C0134b(2);

    /* renamed from: c */
    public Bundle f575c;

    public C0201g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f575c = parcel.readBundle(classLoader);
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeBundle(this.f575c);
    }
}
