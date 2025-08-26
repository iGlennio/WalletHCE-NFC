package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p045Q.C0444k;

/* renamed from: androidx.fragment.app.F */
/* loaded from: classes.dex */
public final class C0616F implements Parcelable {
    public static final Parcelable.Creator<C0616F> CREATOR = new C0444k(4);

    /* renamed from: a */
    public ArrayList f2062a;

    /* renamed from: b */
    public ArrayList f2063b;

    /* renamed from: c */
    public C0628b[] f2064c;

    /* renamed from: d */
    public int f2065d;

    /* renamed from: e */
    public String f2066e;

    /* renamed from: f */
    public ArrayList f2067f;

    /* renamed from: g */
    public ArrayList f2068g;

    /* renamed from: h */
    public ArrayList f2069h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f2062a);
        parcel.writeStringList(this.f2063b);
        parcel.writeTypedArray(this.f2064c, i2);
        parcel.writeInt(this.f2065d);
        parcel.writeString(this.f2066e);
        parcel.writeStringList(this.f2067f);
        parcel.writeTypedList(this.f2068g);
        parcel.writeTypedList(this.f2069h);
    }
}
