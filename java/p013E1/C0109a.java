package p013E1;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p010D1.C0106n;
import p034M0.C0360e;
import p095l1.AbstractC1136c;

/* renamed from: E1.a */
/* loaded from: classes.dex */
public final class C0109a implements InterfaceC0122n {
    @Override // p013E1.InterfaceC0122n
    /* renamed from: a */
    public final boolean mo439a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: b */
    public final String mo440b(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: c */
    public final boolean mo441c() {
        C0106n c0106n = C0106n.f319a;
        return C0360e.m1012k() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: d */
    public final void mo442d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            AbstractC1136c.m2636d(sSLParameters, "sslParameters");
            C0106n c0106n = C0106n.f319a;
            Object[] array = C0360e.m1006c(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }
}
