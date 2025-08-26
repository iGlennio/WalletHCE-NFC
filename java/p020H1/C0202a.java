package p020H1;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p010D1.AbstractC0096d;
import p095l1.AbstractC1136c;

/* renamed from: H1.a */
/* loaded from: classes.dex */
public final class C0202a extends AbstractC0096d {

    /* renamed from: n */
    public final InterfaceC0205d f576n;

    public C0202a(InterfaceC0205d interfaceC0205d) {
        AbstractC1136c.m2637e(interfaceC0205d, "trustRootIndex");
        this.f576n = interfaceC0205d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0202a) && AbstractC1136c.m2633a(((C0202a) obj).f576n, this.f576n);
    }

    public final int hashCode() {
        return this.f576n.hashCode();
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: l */
    public final List mo374l(List list, String str) {
        AbstractC1136c.m2637e(list, "chain");
        AbstractC1136c.m2637e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        AbstractC1136c.m2636d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z2 = false;
        for (int i2 = 0; i2 < 9; i2++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate mo318a = this.f576n.mo318a(x509Certificate);
            if (mo318a == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC1136c.m2636d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (AbstractC1136c.m2633a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z2) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(mo318a)) {
                arrayList.add(mo318a);
            }
            if (AbstractC1136c.m2633a(mo318a.getIssuerDN(), mo318a.getSubjectDN())) {
                try {
                    mo318a.verify(mo318a.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z2 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
