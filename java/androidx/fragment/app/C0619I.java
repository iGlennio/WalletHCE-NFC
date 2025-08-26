package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p045Q.C0444k;

/* renamed from: androidx.fragment.app.I */
/* loaded from: classes.dex */
public final class C0619I implements Parcelable {
    public static final Parcelable.Creator<C0619I> CREATOR = new C0444k(5);

    /* renamed from: a */
    public final String f2081a;

    /* renamed from: b */
    public final String f2082b;

    /* renamed from: c */
    public final boolean f2083c;

    /* renamed from: d */
    public final int f2084d;

    /* renamed from: e */
    public final int f2085e;

    /* renamed from: f */
    public final String f2086f;

    /* renamed from: g */
    public final boolean f2087g;

    /* renamed from: h */
    public final boolean f2088h;

    /* renamed from: i */
    public final boolean f2089i;

    /* renamed from: j */
    public final Bundle f2090j;

    /* renamed from: k */
    public final boolean f2091k;

    /* renamed from: l */
    public final int f2092l;

    /* renamed from: m */
    public Bundle f2093m;

    public C0619I(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        this.f2081a = abstractComponentCallbacksC0641o.getClass().getName();
        this.f2082b = abstractComponentCallbacksC0641o.f2223e;
        this.f2083c = abstractComponentCallbacksC0641o.f2231m;
        this.f2084d = abstractComponentCallbacksC0641o.f2240v;
        this.f2085e = abstractComponentCallbacksC0641o.f2241w;
        this.f2086f = abstractComponentCallbacksC0641o.f2242x;
        this.f2087g = abstractComponentCallbacksC0641o.f2203A;
        this.f2088h = abstractComponentCallbacksC0641o.f2230l;
        this.f2089i = abstractComponentCallbacksC0641o.f2244z;
        this.f2090j = abstractComponentCallbacksC0641o.f2224f;
        this.f2091k = abstractComponentCallbacksC0641o.f2243y;
        this.f2092l = abstractComponentCallbacksC0641o.f2213K.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2081a);
        sb.append(" (");
        sb.append(this.f2082b);
        sb.append(")}:");
        if (this.f2083c) {
            sb.append(" fromLayout");
        }
        int i2 = this.f2085e;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f2086f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f2087g) {
            sb.append(" retainInstance");
        }
        if (this.f2088h) {
            sb.append(" removing");
        }
        if (this.f2089i) {
            sb.append(" detached");
        }
        if (this.f2091k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2081a);
        parcel.writeString(this.f2082b);
        parcel.writeInt(this.f2083c ? 1 : 0);
        parcel.writeInt(this.f2084d);
        parcel.writeInt(this.f2085e);
        parcel.writeString(this.f2086f);
        parcel.writeInt(this.f2087g ? 1 : 0);
        parcel.writeInt(this.f2088h ? 1 : 0);
        parcel.writeInt(this.f2089i ? 1 : 0);
        parcel.writeBundle(this.f2090j);
        parcel.writeInt(this.f2091k ? 1 : 0);
        parcel.writeBundle(this.f2093m);
        parcel.writeInt(this.f2092l);
    }

    public C0619I(Parcel parcel) {
        this.f2081a = parcel.readString();
        this.f2082b = parcel.readString();
        this.f2083c = parcel.readInt() != 0;
        this.f2084d = parcel.readInt();
        this.f2085e = parcel.readInt();
        this.f2086f = parcel.readString();
        this.f2087g = parcel.readInt() != 0;
        this.f2088h = parcel.readInt() != 0;
        this.f2089i = parcel.readInt() != 0;
        this.f2090j = parcel.readBundle();
        this.f2091k = parcel.readInt() != 0;
        this.f2093m = parcel.readBundle();
        this.f2092l = parcel.readInt();
    }
}
