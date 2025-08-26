package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p045Q.C0444k;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0628b implements Parcelable {
    public static final Parcelable.Creator<C0628b> CREATOR = new C0444k(2);

    /* renamed from: a */
    public final int[] f2141a;

    /* renamed from: b */
    public final ArrayList f2142b;

    /* renamed from: c */
    public final int[] f2143c;

    /* renamed from: d */
    public final int[] f2144d;

    /* renamed from: e */
    public final int f2145e;

    /* renamed from: f */
    public final String f2146f;

    /* renamed from: g */
    public final int f2147g;

    /* renamed from: h */
    public final int f2148h;

    /* renamed from: i */
    public final CharSequence f2149i;

    /* renamed from: j */
    public final int f2150j;

    /* renamed from: k */
    public final CharSequence f2151k;

    /* renamed from: l */
    public final ArrayList f2152l;

    /* renamed from: m */
    public final ArrayList f2153m;

    /* renamed from: n */
    public final boolean f2154n;

    public C0628b(C0627a c0627a) {
        int size = c0627a.f2123a.size();
        this.f2141a = new int[size * 5];
        if (!c0627a.f2129g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2142b = new ArrayList(size);
        this.f2143c = new int[size];
        this.f2144d = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C0621K c0621k = (C0621K) c0627a.f2123a.get(i3);
            int i4 = i2 + 1;
            this.f2141a[i2] = c0621k.f2099a;
            ArrayList arrayList = this.f2142b;
            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0621k.f2100b;
            arrayList.add(abstractComponentCallbacksC0641o != null ? abstractComponentCallbacksC0641o.f2223e : null);
            int[] iArr = this.f2141a;
            iArr[i4] = c0621k.f2101c;
            iArr[i2 + 2] = c0621k.f2102d;
            int i5 = i2 + 4;
            iArr[i2 + 3] = c0621k.f2103e;
            i2 += 5;
            iArr[i5] = c0621k.f2104f;
            this.f2143c[i3] = c0621k.f2105g.ordinal();
            this.f2144d[i3] = c0621k.f2106h.ordinal();
        }
        this.f2145e = c0627a.f2128f;
        this.f2146f = c0627a.f2130h;
        this.f2147g = c0627a.f2140r;
        this.f2148h = c0627a.f2131i;
        this.f2149i = c0627a.f2132j;
        this.f2150j = c0627a.f2133k;
        this.f2151k = c0627a.f2134l;
        this.f2152l = c0627a.f2135m;
        this.f2153m = c0627a.f2136n;
        this.f2154n = c0627a.f2137o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f2141a);
        parcel.writeStringList(this.f2142b);
        parcel.writeIntArray(this.f2143c);
        parcel.writeIntArray(this.f2144d);
        parcel.writeInt(this.f2145e);
        parcel.writeString(this.f2146f);
        parcel.writeInt(this.f2147g);
        parcel.writeInt(this.f2148h);
        TextUtils.writeToParcel(this.f2149i, parcel, 0);
        parcel.writeInt(this.f2150j);
        TextUtils.writeToParcel(this.f2151k, parcel, 0);
        parcel.writeStringList(this.f2152l);
        parcel.writeStringList(this.f2153m);
        parcel.writeInt(this.f2154n ? 1 : 0);
    }

    public C0628b(Parcel parcel) {
        this.f2141a = parcel.createIntArray();
        this.f2142b = parcel.createStringArrayList();
        this.f2143c = parcel.createIntArray();
        this.f2144d = parcel.createIntArray();
        this.f2145e = parcel.readInt();
        this.f2146f = parcel.readString();
        this.f2147g = parcel.readInt();
        this.f2148h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2149i = (CharSequence) creator.createFromParcel(parcel);
        this.f2150j = parcel.readInt();
        this.f2151k = (CharSequence) creator.createFromParcel(parcel);
        this.f2152l = parcel.createStringArrayList();
        this.f2153m = parcel.createStringArrayList();
        this.f2154n = parcel.readInt() != 0;
    }
}
