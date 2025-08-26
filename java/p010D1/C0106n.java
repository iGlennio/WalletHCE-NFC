package p010D1;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p020H1.C0202a;
import p020H1.C0203b;
import p020H1.InterfaceC0205d;
import p095l1.AbstractC1136c;

/* renamed from: D1.n */
/* loaded from: classes.dex */
public class C0106n {

    /* renamed from: a */
    public static volatile C0106n f319a;

    /* renamed from: b */
    public static final Logger f320b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r0 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r0 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        if (r0 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010d, code lost:
    
        if (java.lang.Integer.parseInt(r2) >= 9) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    static {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p010D1.C0106n.<clinit>():void");
    }

    /* renamed from: i */
    public static void m436i(String str, int i2, Throwable th) {
        AbstractC1136c.m2637e(str, "message");
        f320b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: b */
    public AbstractC0096d mo314b(X509TrustManager x509TrustManager) {
        return new C0202a(mo319c(x509TrustManager));
    }

    /* renamed from: c */
    public InterfaceC0205d mo319c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC1136c.m2636d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C0203b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: d */
    public void mo315d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
    }

    /* renamed from: e */
    public void mo320e(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        AbstractC1136c.m2637e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i2);
    }

    /* renamed from: f */
    public String mo316f(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: g */
    public Object mo321g() {
        if (f320b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo317h(String str) {
        AbstractC1136c.m2637e(str, "hostname");
        return true;
    }

    /* renamed from: j */
    public void mo322j(Object obj, String str) {
        AbstractC1136c.m2637e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m436i(str, 5, (Throwable) obj);
    }

    /* renamed from: k */
    public SSLContext mo383k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC1136c.m2636d(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: l */
    public SSLSocketFactory mo386l(X509TrustManager x509TrustManager) {
        try {
            SSLContext mo383k = mo383k();
            mo383k.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = mo383k.getSocketFactory();
            AbstractC1136c.m2636d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    /* renamed from: m */
    public X509TrustManager mo384m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public void mo387a(SSLSocket sSLSocket) {
    }
}
