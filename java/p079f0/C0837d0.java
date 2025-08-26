package p079f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p045Q.C0444k;

/* renamed from: f0.d0 */
/* loaded from: classes.dex */
public final class C0837d0 implements Parcelable {
    public static final Parcelable.Creator<C0837d0> CREATOR = new C0444k(11);

    /* renamed from: a */
    public int f3331a;

    /* renamed from: b */
    public int f3332b;

    /* renamed from: c */
    public int f3333c;

    /* renamed from: d */
    public int[] f3334d;

    /* renamed from: e */
    public int f3335e;

    /* renamed from: f */
    public int[] f3336f;

    /* renamed from: g */
    public ArrayList f3337g;

    /* renamed from: h */
    public boolean f3338h;

    /* renamed from: i */
    public boolean f3339i;

    /* renamed from: j */
    public boolean f3340j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3331a);
        parcel.writeInt(this.f3332b);
        parcel.writeInt(this.f3333c);
        if (this.f3333c > 0) {
            parcel.writeIntArray(this.f3334d);
        }
        parcel.writeInt(this.f3335e);
        if (this.f3335e > 0) {
            parcel.writeIntArray(this.f3336f);
        }
        parcel.writeInt(this.f3338h ? 1 : 0);
        parcel.writeInt(this.f3339i ? 1 : 0);
        parcel.writeInt(this.f3340j ? 1 : 0);
        parcel.writeList(this.f3337g);
    }
}
