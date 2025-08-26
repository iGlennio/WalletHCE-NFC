package p010D1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p013E1.C0109a;
import p013E1.C0110b;
import p013E1.C0114f;
import p013E1.C0116h;
import p013E1.C0119k;
import p013E1.C0121m;
import p013E1.InterfaceC0122n;
import p020H1.C0202a;
import p034M0.C0360e;
import p075d1.AbstractC0756h;
import p095l1.AbstractC1136c;

/* renamed from: D1.a */
/* loaded from: classes.dex */
public final class C0093a extends C0106n {

    /* renamed from: d */
    public static final boolean f283d;

    /* renamed from: c */
    public final ArrayList f284c;

    static {
        f283d = C0360e.m1012k() && Build.VERSION.SDK_INT >= 29;
    }

    public C0093a() {
        ArrayList m2053s0 = AbstractC0756h.m2053s0(new InterfaceC0122n[]{(!C0360e.m1012k() || Build.VERSION.SDK_INT < 29) ? null : new C0109a(), new C0121m(C0114f.f328f), new C0121m(C0119k.f338a), new C0121m(C0116h.f334a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = m2053s0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC0122n) next).mo441c()) {
                arrayList.add(next);
            }
        }
        this.f284c = arrayList;
    }

    @Override // p010D1.C0106n
    /* renamed from: b */
    public final AbstractC0096d mo314b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C0110b c0110b = x509TrustManagerExtensions != null ? new C0110b(x509TrustManager, x509TrustManagerExtensions) : null;
        return c0110b != null ? c0110b : new C0202a(mo319c(x509TrustManager));
    }

    @Override // p010D1.C0106n
    /* renamed from: d */
    public final void mo315d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        AbstractC1136c.m2637e(list, "protocols");
        Iterator it = this.f284c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((InterfaceC0122n) obj).mo439a(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC0122n interfaceC0122n = (InterfaceC0122n) obj;
        if (interfaceC0122n != null) {
            interfaceC0122n.mo442d(sSLSocket, str, list);
        }
    }

    @Override // p010D1.C0106n
    /* renamed from: f */
    public final String mo316f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f284c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC0122n) obj).mo439a(sSLSocket)) {
                break;
            }
        }
        InterfaceC0122n interfaceC0122n = (InterfaceC0122n) obj;
        if (interfaceC0122n != null) {
            return interfaceC0122n.mo440b(sSLSocket);
        }
        return null;
    }

    @Override // p010D1.C0106n
    /* renamed from: h */
    public final boolean mo317h(String str) {
        AbstractC1136c.m2637e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
