package p010D1;

import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import p075d1.AbstractC0759k;
import p095l1.AbstractC1136c;
import p123v1.EnumC1288r;

/* renamed from: D1.h */
/* loaded from: classes.dex */
public final class C0100h extends C0106n {

    /* renamed from: d */
    public static final boolean f306d;

    /* renamed from: c */
    public final Provider f307c;

    static {
        boolean z2 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC0098f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC0098f.m385a()) {
                    z2 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f306d = z2;
    }

    public C0100h() {
        Provider newProvider = Conscrypt.newProvider();
        AbstractC1136c.m2636d(newProvider, "Conscrypt.newProvider()");
        this.f307c = newProvider;
    }

    @Override // p010D1.C0106n
    /* renamed from: d */
    public final void mo315d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((EnumC1288r) obj) != EnumC1288r.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC0759k.m2057X(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC1288r) it.next()).f5267a);
            }
            Object[] array = arrayList2.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    @Override // p010D1.C0106n
    /* renamed from: f */
    public final String mo316f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p010D1.C0106n
    /* renamed from: k */
    public final SSLContext mo383k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f307c);
        AbstractC1136c.m2636d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p010D1.C0106n
    /* renamed from: l */
    public final SSLSocketFactory mo386l(X509TrustManager x509TrustManager) {
        SSLContext mo383k = mo383k();
        mo383k.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = mo383k.getSocketFactory();
        AbstractC1136c.m2636d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p010D1.C0106n
    /* renamed from: m */
    public final X509TrustManager mo384m() {
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
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, C0099g.f305a);
        return x509TrustManager;
    }
}
