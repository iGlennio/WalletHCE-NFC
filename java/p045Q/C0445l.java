package p045Q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: Q.l */
/* loaded from: classes.dex */
public final class C0445l extends View.BaseSavedState {
    public static final Parcelable.Creator<C0445l> CREATOR = new C0444k(0);

    /* renamed from: a */
    public int f1234a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1234a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f1234a);
    }
}
