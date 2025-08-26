package p010D1;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p095l1.AbstractC1136c;

/* renamed from: D1.e */
/* loaded from: classes.dex */
public final class C0097e extends C0106n {

    /* renamed from: d */
    public static final boolean f303d;

    /* renamed from: c */
    public final Provider f304c = new BouncyCastleJsseProvider();

    static {
        boolean z2 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC0096d.class.getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f303d = z2;
    }

    @Override // p010D1.C0106n
    /* renamed from: d */
    public final void mo315d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
    }

    @Override // p010D1.C0106n
    /* renamed from: f */
    public final String mo316f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p010D1.C0106n
    /* renamed from: k */
    public final SSLContext mo383k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f304c);
        AbstractC1136c.m2636d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p010D1.C0106n
    /* renamed from: m */
    public final X509TrustManager mo384m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC1136c.m2634b(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String arrays = Arrays.toString(trustManagers);
            AbstractC1136c.m2636d(arrays, "java.util.Arrays.toString(this)");
            throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }
}
