package p013E1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p095l1.AbstractC1136c;

/* renamed from: E1.m */
/* loaded from: classes.dex */
public final class C0121m implements InterfaceC0122n {

    /* renamed from: a */
    public InterfaceC0122n f339a;

    /* renamed from: b */
    public final InterfaceC0120l f340b;

    public C0121m(InterfaceC0120l interfaceC0120l) {
        this.f340b = interfaceC0120l;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: a */
    public final boolean mo439a(SSLSocket sSLSocket) {
        return this.f340b.mo443a(sSLSocket);
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: b */
    public final String mo440b(SSLSocket sSLSocket) {
        InterfaceC0122n m446e = m446e(sSLSocket);
        if (m446e != null) {
            return m446e.mo440b(sSLSocket);
        }
        return null;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: c */
    public final boolean mo441c() {
        return true;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: d */
    public final void mo442d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
        InterfaceC0122n m446e = m446e(sSLSocket);
        if (m446e != null) {
            m446e.mo442d(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public final synchronized InterfaceC0122n m446e(SSLSocket sSLSocket) {
        try {
            if (this.f339a == null && this.f340b.mo443a(sSLSocket)) {
                this.f339a = this.f340b.mo444b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f339a;
    }
}
