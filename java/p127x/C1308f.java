package p127x;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: x.f */
/* loaded from: classes.dex */
public final class C1308f extends AbstractC0465b {
    public static final Parcelable.Creator<C1308f> CREATOR = new C0134b(12);

    /* renamed from: c */
    public SparseArray f5361c;

    public C1308f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f5361c = new SparseArray(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f5361c.append(iArr[i2], readParcelableArray[i2]);
        }
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        SparseArray sparseArray = this.f5361c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = this.f5361c.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f5361c.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}
