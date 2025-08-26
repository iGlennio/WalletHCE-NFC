package p088j;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p045Q.C0444k;

/* renamed from: j.Q */
/* loaded from: classes.dex */
public final class C0956Q extends View.BaseSavedState {
    public static final Parcelable.Creator<C0956Q> CREATOR = new C0444k(13);

    /* renamed from: a */
    public boolean f3843a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f3843a ? (byte) 1 : (byte) 0);
    }
}
