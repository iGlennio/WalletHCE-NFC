package p122v0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p014F0.C0134b;
import p050S.AbstractC0465b;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public final class C1270a extends AbstractC0465b {
    public static final Parcelable.Creator<C1270a> CREATOR = new C0134b(10);

    /* renamed from: c */
    public final int f5103c;

    /* renamed from: d */
    public final int f5104d;

    /* renamed from: e */
    public final boolean f5105e;

    /* renamed from: f */
    public final boolean f5106f;

    /* renamed from: g */
    public final boolean f5107g;

    public C1270a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5103c = parcel.readInt();
        this.f5104d = parcel.readInt();
        this.f5105e = parcel.readInt() == 1;
        this.f5106f = parcel.readInt() == 1;
        this.f5107g = parcel.readInt() == 1;
    }

    @Override // p050S.AbstractC0465b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f5103c);
        parcel.writeInt(this.f5104d);
        parcel.writeInt(this.f5105e ? 1 : 0);
        parcel.writeInt(this.f5106f ? 1 : 0);
        parcel.writeInt(this.f5107g ? 1 : 0);
    }

    public C1270a(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f5103c = bottomSheetBehavior.f2523L;
        this.f5104d = bottomSheetBehavior.f2546e;
        this.f5105e = bottomSheetBehavior.f2540b;
        this.f5106f = bottomSheetBehavior.f2520I;
        this.f5107g = bottomSheetBehavior.f2521J;
    }
}
