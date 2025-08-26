package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p045Q.C0444k;

/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C0579a implements Parcelable {
    public static final Parcelable.Creator<C0579a> CREATOR = new C0444k(1);

    /* renamed from: a */
    public final int f1612a;

    /* renamed from: b */
    public final Intent f1613b;

    public C0579a(int i2, Intent intent) {
        this.f1612a = i2;
        this.f1613b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f1612a;
        sb.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1613b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1612a);
        Intent intent = this.f1613b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }

    public C0579a(Parcel parcel) {
        this.f1612a = parcel.readInt();
        this.f1613b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
