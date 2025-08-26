package p088j;

import android.os.Parcel;
import android.os.Parcelable;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: j.d1 */
/* loaded from: classes.dex */
public final class C0986d1 extends AbstractC0465b {
    public static final Parcelable.Creator<C0986d1> CREATOR = new C0134b(8);

    /* renamed from: c */
    public boolean f3905c;

    public C0986d1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3905c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3905c + "}";
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.f3905c));
    }
}
