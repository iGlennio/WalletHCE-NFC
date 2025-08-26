package p027K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import p005C.C0046i;
import p025J0.AbstractC0232e;
import p045Q.C0451r;

/* renamed from: K.M */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC0269M implements OnReceiveContentListener {

    /* renamed from: a */
    public final InterfaceC0316r f763a;

    public OnReceiveContentListenerC0269M(InterfaceC0316r interfaceC0316r) {
        this.f763a = interfaceC0316r;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0292f c0292f = new C0292f(new C0046i(contentInfo));
        C0292f m1161a = ((C0451r) this.f763a).m1161a(view, c0292f);
        if (m1161a == null) {
            return null;
        }
        if (m1161a == c0292f) {
            return contentInfo;
        }
        ContentInfo mo182r = m1161a.f805a.mo182r();
        Objects.requireNonNull(mo182r);
        return AbstractC0232e.m646g(mo182r);
    }
}
