package p020H1;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p095l1.AbstractC1136c;

/* renamed from: H1.b */
/* loaded from: classes.dex */
public final class C0203b implements InterfaceC0205d {

    /* renamed from: a */
    public final LinkedHashMap f577a;

    public C0203b(X509Certificate... x509CertificateArr) {
        AbstractC1136c.m2637e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            AbstractC1136c.m2636d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f577a = linkedHashMap;
    }

    @Override // p020H1.InterfaceC0205d
    /* renamed from: a */
    public final X509Certificate mo318a(X509Certificate x509Certificate) {
        Set set = (Set) this.f577a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C0203b) && AbstractC1136c.m2633a(((C0203b) obj).f577a, this.f577a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f577a.hashCode();
    }
}
