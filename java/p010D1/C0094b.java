package p010D1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p020H1.InterfaceC0205d;
import p095l1.AbstractC1136c;

/* renamed from: D1.b */
/* loaded from: classes.dex */
public final class C0094b implements InterfaceC0205d {

    /* renamed from: a */
    public final X509TrustManager f285a;

    /* renamed from: b */
    public final Method f286b;

    public C0094b(X509TrustManager x509TrustManager, Method method) {
        this.f285a = x509TrustManager;
        this.f286b = method;
    }

    @Override // p020H1.InterfaceC0205d
    /* renamed from: a */
    public final X509Certificate mo318a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f286b.invoke(this.f285a, x509Certificate);
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e2) {
            throw new AssertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0094b)) {
            return false;
        }
        C0094b c0094b = (C0094b) obj;
        return AbstractC1136c.m2633a(this.f285a, c0094b.f285a) && AbstractC1136c.m2633a(this.f286b, c0094b.f286b);
    }

    public final int hashCode() {
        X509TrustManager x509TrustManager = this.f285a;
        int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
        Method method = this.f286b;
        return hashCode + (method != null ? method.hashCode() : 0);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f285a + ", findByIssuerAndSignatureMethod=" + this.f286b + ")";
    }
}
