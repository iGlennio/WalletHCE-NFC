package p079f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p045Q.C0444k;

/* renamed from: f0.c0 */
/* loaded from: classes.dex */
public final class C0835c0 implements Parcelable {
    public static final Parcelable.Creator<C0835c0> CREATOR = new C0444k(10);

    /* renamed from: a */
    public int f3321a;

    /* renamed from: b */
    public int f3322b;

    /* renamed from: c */
    public int[] f3323c;

    /* renamed from: d */
    public boolean f3324d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3321a + ", mGapDir=" + this.f3322b + ", mHasUnwantedGapAfter=" + this.f3324d + ", mGapPerSpan=" + Arrays.toString(this.f3323c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3321a);
        parcel.writeInt(this.f3322b);
        parcel.writeInt(this.f3324d ? 1 : 0);
        int[] iArr = this.f3323c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3323c);
        }
    }
}
