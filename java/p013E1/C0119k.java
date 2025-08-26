package p013E1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p010D1.C0100h;
import p010D1.C0106n;
import p034M0.C0360e;
import p095l1.AbstractC1136c;

/* renamed from: E1.k */
/* loaded from: classes.dex */
public final class C0119k implements InterfaceC0122n {

    /* renamed from: a */
    public static final C0118j f338a = new C0118j();

    @Override // p013E1.InterfaceC0122n
    /* renamed from: a */
    public final boolean mo439a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: b */
    public final String mo440b(SSLSocket sSLSocket) {
        if (mo439a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: c */
    public final boolean mo441c() {
        boolean z2 = C0100h.f306d;
        return C0100h.f306d;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: d */
    public final void mo442d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
        if (mo439a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C0106n c0106n = C0106n.f319a;
            Object[] array = C0360e.m1006c(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
