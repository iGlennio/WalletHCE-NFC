package p131y0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p045Q.C0444k;

/* renamed from: y0.b */
/* loaded from: classes.dex */
public final class C1319b extends View.BaseSavedState {
    public static final Parcelable.Creator<C1319b> CREATOR = new C0444k(15);

    /* renamed from: a */
    public int f5379a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i2 = this.f5379a;
        sb.append(i2 != 1 ? i2 != 2 ? "unchecked" : "indeterminate" : "checked");
        sb.append("}");
        return sb.toString();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Integer.valueOf(this.f5379a));
    }
}
