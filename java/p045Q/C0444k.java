package p045Q;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.C0579a;
import androidx.fragment.app.C0612B;
import androidx.fragment.app.C0616F;
import androidx.fragment.app.C0619I;
import androidx.fragment.app.C0628b;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.C0701b;
import com.google.android.material.datepicker.C0703d;
import com.google.android.material.datepicker.C0713n;
import java.util.ArrayList;
import p079f0.C0835c0;
import p079f0.C0837d0;
import p079f0.C0856t;
import p088j.C0956Q;
import p088j.C1002j;
import p131y0.C1319b;

/* renamed from: Q.k */
/* loaded from: classes.dex */
public final class C0444k implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f1233a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1233a) {
            case 0:
                C0445l c0445l = new C0445l(parcel);
                c0445l.f1234a = parcel.readInt();
                return c0445l;
            case 1:
                return new C0579a(parcel);
            case 2:
                return new C0628b(parcel);
            case 3:
                C0612B c0612b = new C0612B();
                c0612b.f2025a = parcel.readString();
                c0612b.f2026b = parcel.readInt();
                return c0612b;
            case 4:
                C0616F c0616f = new C0616F();
                c0616f.f2066e = null;
                c0616f.f2067f = new ArrayList();
                c0616f.f2068g = new ArrayList();
                c0616f.f2062a = parcel.createTypedArrayList(C0619I.CREATOR);
                c0616f.f2063b = parcel.createStringArrayList();
                c0616f.f2064c = (C0628b[]) parcel.createTypedArray(C0628b.CREATOR);
                c0616f.f2065d = parcel.readInt();
                c0616f.f2066e = parcel.readString();
                c0616f.f2067f = parcel.createStringArrayList();
                c0616f.f2068g = parcel.createTypedArrayList(Bundle.CREATOR);
                c0616f.f2069h = parcel.createTypedArrayList(C0612B.CREATOR);
                return c0616f;
            case 5:
                return new C0619I(parcel);
            case 6:
                return new C0701b((C0713n) parcel.readParcelable(C0713n.class.getClassLoader()), (C0713n) parcel.readParcelable(C0713n.class.getClassLoader()), (C0703d) parcel.readParcelable(C0703d.class.getClassLoader()), (C0713n) parcel.readParcelable(C0713n.class.getClassLoader()), parcel.readInt());
            case 7:
                return new C0703d(parcel.readLong());
            case 8:
                return C0713n.m1954a(parcel.readInt(), parcel.readInt());
            case 9:
                C0856t c0856t = new C0856t();
                c0856t.f3465a = parcel.readInt();
                c0856t.f3466b = parcel.readInt();
                c0856t.f3467c = parcel.readInt() == 1;
                return c0856t;
            case 10:
                C0835c0 c0835c0 = new C0835c0();
                c0835c0.f3321a = parcel.readInt();
                c0835c0.f3322b = parcel.readInt();
                c0835c0.f3324d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    c0835c0.f3323c = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0835c0;
            case 11:
                C0837d0 c0837d0 = new C0837d0();
                c0837d0.f3331a = parcel.readInt();
                c0837d0.f3332b = parcel.readInt();
                int readInt2 = parcel.readInt();
                c0837d0.f3333c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    c0837d0.f3334d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                c0837d0.f3335e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    c0837d0.f3336f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0837d0.f3338h = parcel.readInt() == 1;
                c0837d0.f3339i = parcel.readInt() == 1;
                c0837d0.f3340j = parcel.readInt() == 1;
                c0837d0.f3337g = parcel.readArrayList(C0835c0.class.getClassLoader());
                return c0837d0;
            case 12:
                C1002j c1002j = new C1002j();
                c1002j.f3956a = parcel.readInt();
                return c1002j;
            case 13:
                C0956Q c0956q = new C0956Q(parcel);
                c0956q.f3843a = parcel.readByte() != 0;
                return c0956q;
            case 14:
                return new ParcelImpl(parcel);
            default:
                C1319b c1319b = new C1319b(parcel);
                c1319b.f5379a = ((Integer) parcel.readValue(C1319b.class.getClassLoader())).intValue();
                return c1319b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f1233a) {
            case 0:
                return new C0445l[i2];
            case 1:
                return new C0579a[i2];
            case 2:
                return new C0628b[i2];
            case 3:
                return new C0612B[i2];
            case 4:
                return new C0616F[i2];
            case 5:
                return new C0619I[i2];
            case 6:
                return new C0701b[i2];
            case 7:
                return new C0703d[i2];
            case 8:
                return new C0713n[i2];
            case 9:
                return new C0856t[i2];
            case 10:
                return new C0835c0[i2];
            case 11:
                return new C0837d0[i2];
            case 12:
                return new C1002j[i2];
            case 13:
                return new C0956Q[i2];
            case 14:
                return new ParcelImpl[i2];
            default:
                return new C1319b[i2];
        }
    }
}
