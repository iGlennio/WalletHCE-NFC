package p027K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
import p005C.C0046i;
import p025J0.AbstractC0232e;

/* renamed from: K.L */
/* loaded from: classes.dex */
public abstract class AbstractC0268L {
    /* renamed from: a */
    public static String[] m807a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* renamed from: b */
    public static C0292f m808b(View view, C0292f c0292f) {
        ContentInfo mo182r = c0292f.f805a.mo182r();
        Objects.requireNonNull(mo182r);
        ContentInfo m646g = AbstractC0232e.m646g(mo182r);
        ContentInfo performReceiveContent = view.performReceiveContent(m646g);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == m646g ? c0292f : new C0292f(new C0046i(performReceiveContent));
    }

    /* renamed from: c */
    public static void m809c(View view, String[] strArr, InterfaceC0316r interfaceC0316r) {
        if (interfaceC0316r == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0269M(interfaceC0316r));
        }
    }
}
