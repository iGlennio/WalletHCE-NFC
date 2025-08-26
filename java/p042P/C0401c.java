package p042P;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p005C.C0046i;
import p027K.AbstractC0272P;
import p027K.C0288d;
import p027K.InterfaceC0286c;
import p088j.C1041w;

/* renamed from: P.c */
/* loaded from: classes.dex */
public final class C0401c extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C0400b f1061a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401c(InputConnection inputConnection, C0400b c0400b) {
        super(inputConnection, false);
        this.f1061a = c0400b;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0286c interfaceC0286c;
        C0046i c0046i = inputContentInfo == null ? null : new C0046i(8, new C0046i(7, inputContentInfo));
        C0400b c0400b = this.f1061a;
        if ((i2 & 1) != 0) {
            try {
                ((InputContentInfo) ((C0046i) c0046i.f116b).f116b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((C0046i) c0046i.f116b).f116b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((C0046i) c0046i.f116b).f116b).getDescription();
        C0046i c0046i2 = (C0046i) c0046i.f116b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) c0046i2.f116b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0286c = new C0046i(clipData, 2);
        } else {
            C0288d c0288d = new C0288d();
            c0288d.f795b = clipData;
            c0288d.f796c = 2;
            interfaceC0286c = c0288d;
        }
        interfaceC0286c.mo167c(((InputContentInfo) c0046i2.f116b).getLinkUri());
        interfaceC0286c.mo166b(bundle2);
        if (AbstractC0272P.m819i((C1041w) c0400b.f1060a, interfaceC0286c.mo174j()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
