package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p094l0.AbstractC1131a;
import p094l0.C1132b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1131a abstractC1131a) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1888a;
        if (abstractC1131a.mo2627e(1)) {
            i2 = ((C1132b) abstractC1131a).f4328e.readInt();
        }
        iconCompat.f1888a = i2;
        byte[] bArr = iconCompat.f1890c;
        if (abstractC1131a.mo2627e(2)) {
            Parcel parcel = ((C1132b) abstractC1131a).f4328e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1890c = bArr;
        iconCompat.f1891d = abstractC1131a.m2628f(iconCompat.f1891d, 3);
        int i3 = iconCompat.f1892e;
        if (abstractC1131a.mo2627e(4)) {
            i3 = ((C1132b) abstractC1131a).f4328e.readInt();
        }
        iconCompat.f1892e = i3;
        int i4 = iconCompat.f1893f;
        if (abstractC1131a.mo2627e(5)) {
            i4 = ((C1132b) abstractC1131a).f4328e.readInt();
        }
        iconCompat.f1893f = i4;
        iconCompat.f1894g = (ColorStateList) abstractC1131a.m2628f(iconCompat.f1894g, 6);
        String str = iconCompat.f1896i;
        if (abstractC1131a.mo2627e(7)) {
            str = ((C1132b) abstractC1131a).f4328e.readString();
        }
        iconCompat.f1896i = str;
        String str2 = iconCompat.f1897j;
        if (abstractC1131a.mo2627e(8)) {
            str2 = ((C1132b) abstractC1131a).f4328e.readString();
        }
        iconCompat.f1897j = str2;
        iconCompat.f1895h = PorterDuff.Mode.valueOf(iconCompat.f1896i);
        switch (iconCompat.f1888a) {
            case -1:
                Parcelable parcelable = iconCompat.f1891d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1889b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1891d;
                if (parcelable2 != null) {
                    iconCompat.f1889b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1890c;
                iconCompat.f1889b = bArr3;
                iconCompat.f1888a = 3;
                iconCompat.f1892e = 0;
                iconCompat.f1893f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1890c, Charset.forName("UTF-16"));
                iconCompat.f1889b = str3;
                if (iconCompat.f1888a == 2 && iconCompat.f1897j == null) {
                    iconCompat.f1897j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1889b = iconCompat.f1890c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1131a abstractC1131a) {
        abstractC1131a.getClass();
        iconCompat.f1896i = iconCompat.f1895h.name();
        switch (iconCompat.f1888a) {
            case -1:
                iconCompat.f1891d = (Parcelable) iconCompat.f1889b;
                break;
            case 1:
            case 5:
                iconCompat.f1891d = (Parcelable) iconCompat.f1889b;
                break;
            case 2:
                iconCompat.f1890c = ((String) iconCompat.f1889b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1890c = (byte[]) iconCompat.f1889b;
                break;
            case 4:
            case 6:
                iconCompat.f1890c = iconCompat.f1889b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1888a;
        if (-1 != i2) {
            abstractC1131a.mo2630h(1);
            ((C1132b) abstractC1131a).f4328e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1890c;
        if (bArr != null) {
            abstractC1131a.mo2630h(2);
            int length = bArr.length;
            Parcel parcel = ((C1132b) abstractC1131a).f4328e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1891d;
        if (parcelable != null) {
            abstractC1131a.mo2630h(3);
            ((C1132b) abstractC1131a).f4328e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1892e;
        if (i3 != 0) {
            abstractC1131a.mo2630h(4);
            ((C1132b) abstractC1131a).f4328e.writeInt(i3);
        }
        int i4 = iconCompat.f1893f;
        if (i4 != 0) {
            abstractC1131a.mo2630h(5);
            ((C1132b) abstractC1131a).f4328e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1894g;
        if (colorStateList != null) {
            abstractC1131a.mo2630h(6);
            ((C1132b) abstractC1131a).f4328e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1896i;
        if (str != null) {
            abstractC1131a.mo2630h(7);
            ((C1132b) abstractC1131a).f4328e.writeString(str);
        }
        String str2 = iconCompat.f1897j;
        if (str2 != null) {
            abstractC1131a.mo2630h(8);
            ((C1132b) abstractC1131a).f4328e.writeString(str2);
        }
    }
}
