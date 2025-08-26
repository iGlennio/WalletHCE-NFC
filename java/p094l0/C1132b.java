package p094l0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p101o.C1152b;

/* renamed from: l0.b */
/* loaded from: classes.dex */
public final class C1132b extends AbstractC1131a {

    /* renamed from: d */
    public final SparseIntArray f4327d;

    /* renamed from: e */
    public final Parcel f4328e;

    /* renamed from: f */
    public final int f4329f;

    /* renamed from: g */
    public final int f4330g;

    /* renamed from: h */
    public final String f4331h;

    /* renamed from: i */
    public int f4332i;

    /* renamed from: j */
    public int f4333j;

    /* renamed from: k */
    public int f4334k;

    public C1132b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1152b(), new C1152b(), new C1152b());
    }

    @Override // p094l0.AbstractC1131a
    /* renamed from: a */
    public final C1132b mo2623a() {
        Parcel parcel = this.f4328e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f4333j;
        if (i2 == this.f4329f) {
            i2 = this.f4330g;
        }
        return new C1132b(parcel, dataPosition, i2, this.f4331h + "  ", this.f4324a, this.f4325b, this.f4326c);
    }

    @Override // p094l0.AbstractC1131a
    /* renamed from: e */
    public final boolean mo2627e(int i2) {
        while (this.f4333j < this.f4330g) {
            int i3 = this.f4334k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f4333j;
            Parcel parcel = this.f4328e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f4334k = parcel.readInt();
            this.f4333j += readInt;
        }
        return this.f4334k == i2;
    }

    @Override // p094l0.AbstractC1131a
    /* renamed from: h */
    public final void mo2630h(int i2) {
        int i3 = this.f4332i;
        SparseIntArray sparseIntArray = this.f4327d;
        Parcel parcel = this.f4328e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f4332i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public C1132b(Parcel parcel, int i2, int i3, String str, C1152b c1152b, C1152b c1152b2, C1152b c1152b3) {
        super(c1152b, c1152b2, c1152b3);
        this.f4327d = new SparseIntArray();
        this.f4332i = -1;
        this.f4334k = -1;
        this.f4328e = parcel;
        this.f4329f = i2;
        this.f4330g = i3;
        this.f4333j = i2;
        this.f4331h = str;
    }
}
