package p013E1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p010D1.C0100h;

/* renamed from: E1.j */
/* loaded from: classes.dex */
public final class C0118j implements InterfaceC0120l {
    @Override // p013E1.InterfaceC0120l
    /* renamed from: a */
    public final boolean mo443a(SSLSocket sSLSocket) {
        return C0100h.f306d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p013E1.InterfaceC0120l
    /* renamed from: b */
    public final InterfaceC0122n mo444b(SSLSocket sSLSocket) {
        return new C0119k();
    }
}
