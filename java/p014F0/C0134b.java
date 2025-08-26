package p014F0;

import android.os.Parcel;
import android.os.Parcelable;
import p019H0.C0201g;
import p037N0.C0388e;
import p043P0.C0406E;
import p050S.AbstractC0465b;
import p056V.C0511e;
import p079f0.C0821Q;
import p088j.C0986d1;
import p088j.C1028r1;
import p122v0.C1270a;
import p125w0.C1297b;
import p127x.C1308f;

/* renamed from: F0.b */
/* loaded from: classes.dex */
public final class C0134b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    public final /* synthetic */ int f361a;

    public /* synthetic */ C0134b(int i2) {
        this.f361a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f361a) {
            case 0:
                return new C0135c(parcel, classLoader);
            case 1:
                return new C0154v(parcel, classLoader);
            case 2:
                return new C0201g(parcel, classLoader);
            case 3:
                return new C0388e(parcel, classLoader);
            case 4:
                return new C0406E(parcel, classLoader);
            case 5:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0465b.f1272b;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new C0511e(parcel, classLoader);
            case 7:
                return new C0821Q(parcel, classLoader);
            case 8:
                return new C0986d1(parcel, classLoader);
            case 9:
                return new C1028r1(parcel, classLoader);
            case 10:
                return new C1270a(parcel, classLoader);
            case 11:
                return new C1297b(parcel, classLoader);
            default:
                return new C1308f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f361a) {
            case 0:
                return new C0135c[i2];
            case 1:
                return new C0154v[i2];
            case 2:
                return new C0201g[i2];
            case 3:
                return new C0388e[i2];
            case 4:
                return new C0406E[i2];
            case 5:
                return new AbstractC0465b[i2];
            case 6:
                return new C0511e[i2];
            case 7:
                return new C0821Q[i2];
            case 8:
                return new C0986d1[i2];
            case 9:
                return new C1028r1[i2];
            case 10:
                return new C1270a[i2];
            case 11:
                return new C1297b[i2];
            default:
                return new C1308f[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f361a) {
            case 0:
                return new C0135c(parcel, null);
            case 1:
                return new C0154v(parcel, null);
            case 2:
                return new C0201g(parcel, null);
            case 3:
                return new C0388e(parcel, null);
            case 4:
                return new C0406E(parcel, null);
            case 5:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0465b.f1272b;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                return new C0511e(parcel, null);
            case 7:
                return new C0821Q(parcel, null);
            case 8:
                return new C0986d1(parcel, null);
            case 9:
                return new C1028r1(parcel, null);
            case 10:
                return new C1270a(parcel, null);
            case 11:
                return new C1297b(parcel, null);
            default:
                return new C1308f(parcel, null);
        }
    }
}
