package p050S;

import android.os.Parcel;
import android.os.Parcelable;
import p014F0.C0134b;

/* renamed from: S.b */
/* loaded from: classes.dex */
public abstract class AbstractC0465b implements Parcelable {

    /* renamed from: a */
    public final Parcelable f1273a;

    /* renamed from: b */
    public static final C0464a f1272b = new C0464a();
    public static final Parcelable.Creator<AbstractC0465b> CREATOR = new C0134b(5);

    public AbstractC0465b() {
        this.f1273a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f1273a, i2);
    }

    public AbstractC0465b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1273a = parcelable == f1272b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0465b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1273a = readParcelable == null ? f1272b : readParcelable;
    }
}
