package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p094l0.AbstractC1131a;
import p094l0.C1132b;
import p094l0.InterfaceC1133c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1131a abstractC1131a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1133c interfaceC1133c = remoteActionCompat.f1881a;
        boolean z2 = true;
        if (abstractC1131a.mo2627e(1)) {
            interfaceC1133c = abstractC1131a.m2629g();
        }
        remoteActionCompat.f1881a = (IconCompat) interfaceC1133c;
        CharSequence charSequence = remoteActionCompat.f1882b;
        if (abstractC1131a.mo2627e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1132b) abstractC1131a).f4328e);
        }
        remoteActionCompat.f1882b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1883c;
        if (abstractC1131a.mo2627e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1132b) abstractC1131a).f4328e);
        }
        remoteActionCompat.f1883c = charSequence2;
        remoteActionCompat.f1884d = (PendingIntent) abstractC1131a.m2628f(remoteActionCompat.f1884d, 4);
        boolean z3 = remoteActionCompat.f1885e;
        if (abstractC1131a.mo2627e(5)) {
            z3 = ((C1132b) abstractC1131a).f4328e.readInt() != 0;
        }
        remoteActionCompat.f1885e = z3;
        boolean z4 = remoteActionCompat.f1886f;
        if (!abstractC1131a.mo2627e(6)) {
            z2 = z4;
        } else if (((C1132b) abstractC1131a).f4328e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f1886f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1131a abstractC1131a) {
        abstractC1131a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1881a;
        abstractC1131a.mo2630h(1);
        abstractC1131a.m2631i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1882b;
        abstractC1131a.mo2630h(2);
        Parcel parcel = ((C1132b) abstractC1131a).f4328e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1883c;
        abstractC1131a.mo2630h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1884d;
        abstractC1131a.mo2630h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1885e;
        abstractC1131a.mo2630h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1886f;
        abstractC1131a.mo2630h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
