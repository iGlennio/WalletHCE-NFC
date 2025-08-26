package p013E1;

import javax.net.ssl.SSLSocket;
import p112r1.AbstractC1199i;

/* renamed from: E1.e */
/* loaded from: classes.dex */
public final class C0113e implements InterfaceC0120l {
    @Override // p013E1.InterfaceC0120l
    /* renamed from: a */
    public final boolean mo443a(SSLSocket sSLSocket) {
        return AbstractC1199i.m2760F0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p013E1.InterfaceC0120l
    /* renamed from: b */
    public final InterfaceC0122n mo444b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C0114f(cls2);
    }
}
