package p013E1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p010D1.AbstractC0096d;
import p095l1.AbstractC1136c;

/* renamed from: E1.b */
/* loaded from: classes.dex */
public final class C0110b extends AbstractC0096d {

    /* renamed from: n */
    public final X509TrustManager f323n;

    /* renamed from: o */
    public final X509TrustManagerExtensions f324o;

    public C0110b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f323n = x509TrustManager;
        this.f324o = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0110b) && ((C0110b) obj).f323n == this.f323n;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f323n);
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: l */
    public final List mo374l(List list, String str) {
        AbstractC1136c.m2637e(list, "chain");
        AbstractC1136c.m2637e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        try {
            List<X509Certificate> checkServerTrusted = this.f324o.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            AbstractC1136c.m2636d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
