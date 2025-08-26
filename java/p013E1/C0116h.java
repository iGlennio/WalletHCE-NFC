package p013E1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p010D1.C0097e;
import p010D1.C0106n;
import p034M0.C0360e;
import p095l1.AbstractC1136c;

/* renamed from: E1.h */
/* loaded from: classes.dex */
public final class C0116h implements InterfaceC0122n {

    /* renamed from: a */
    public static final C0115g f334a = new C0115g();

    @Override // p013E1.InterfaceC0122n
    /* renamed from: a */
    public final boolean mo439a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: b */
    public final String mo440b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: c */
    public final boolean mo441c() {
        boolean z2 = C0097e.f303d;
        return C0097e.f303d;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: d */
    public final void mo442d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
        if (mo439a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC1136c.m2636d(parameters, "sslParameters");
            C0106n c0106n = C0106n.f319a;
            Object[] array = C0360e.m1006c(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
