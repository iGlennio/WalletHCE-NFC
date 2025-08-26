package p056V;

import android.os.Parcel;
import android.os.Parcelable;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: V.e */
/* loaded from: classes.dex */
public final class C0511e extends AbstractC0465b {
    public static final Parcelable.Creator<C0511e> CREATOR = new C0134b(6);

    /* renamed from: c */
    public int f1392c;

    /* renamed from: d */
    public int f1393d;

    /* renamed from: e */
    public int f1394e;

    /* renamed from: f */
    public int f1395f;

    /* renamed from: g */
    public int f1396g;

    public C0511e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1392c = 0;
        this.f1392c = parcel.readInt();
        this.f1393d = parcel.readInt();
        this.f1394e = parcel.readInt();
        this.f1395f = parcel.readInt();
        this.f1396g = parcel.readInt();
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1392c);
        parcel.writeInt(this.f1393d);
        parcel.writeInt(this.f1394e);
        parcel.writeInt(this.f1395f);
        parcel.writeInt(this.f1396g);
    }
}
