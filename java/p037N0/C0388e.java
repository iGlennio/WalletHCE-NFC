package p037N0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: N0.e */
/* loaded from: classes.dex */
public final class C0388e extends AbstractC0465b {
    public static final Parcelable.Creator<C0388e> CREATOR = new C0134b(3);

    /* renamed from: c */
    public final int f1036c;

    public C0388e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1036c = parcel.readInt();
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1036c);
    }

    public C0388e(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f1036c = sideSheetBehavior.f2769h;
    }
}
