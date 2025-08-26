package p088j;

import android.os.Parcel;
import android.os.Parcelable;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: j.r1 */
/* loaded from: classes.dex */
public final class C1028r1 extends AbstractC0465b {
    public static final Parcelable.Creator<C1028r1> CREATOR = new C0134b(9);

    /* renamed from: c */
    public int f4035c;

    /* renamed from: d */
    public boolean f4036d;

    public C1028r1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4035c = parcel.readInt();
        this.f4036d = parcel.readInt() != 0;
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f4035c);
        parcel.writeInt(this.f4036d ? 1 : 0);
    }
}
