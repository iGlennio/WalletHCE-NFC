package p043P0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: P0.E */
/* loaded from: classes.dex */
public final class C0406E extends AbstractC0465b {
    public static final Parcelable.Creator<C0406E> CREATOR = new C0134b(4);

    /* renamed from: c */
    public CharSequence f1067c;

    /* renamed from: d */
    public boolean f1068d;

    public C0406E(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1067c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1068d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1067c) + "}";
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.f1067c, parcel, i2);
        parcel.writeInt(this.f1068d ? 1 : 0);
    }
}
