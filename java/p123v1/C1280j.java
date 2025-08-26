package p123v1;

import androidx.lifecycle.C0659G;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import p072c1.C0698b;
import p075d1.AbstractC0759k;
import p092k1.InterfaceC1103a;
import p095l1.AbstractC1136c;

/* renamed from: v1.j */
/* loaded from: classes.dex */
public final class C1280j {

    /* renamed from: a */
    public final C0698b f5177a;

    /* renamed from: b */
    public final EnumC1294x f5178b;

    /* renamed from: c */
    public final C1277g f5179c;

    /* renamed from: d */
    public final List f5180d;

    public C1280j(EnumC1294x enumC1294x, C1277g c1277g, List list, InterfaceC1103a interfaceC1103a) {
        this.f5178b = enumC1294x;
        this.f5179c = c1277g;
        this.f5180d = list;
        this.f5177a = new C0698b(new C0659G(interfaceC1103a));
    }

    /* renamed from: a */
    public final List m2963a() {
        return (List) this.f5177a.m1884a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1280j)) {
            return false;
        }
        C1280j c1280j = (C1280j) obj;
        return c1280j.f5178b == this.f5178b && AbstractC1136c.m2633a(c1280j.f5179c, this.f5179c) && AbstractC1136c.m2633a(c1280j.m2963a(), m2963a()) && AbstractC1136c.m2633a(c1280j.f5180d, this.f5180d);
    }

    public final int hashCode() {
        return this.f5180d.hashCode() + ((m2963a().hashCode() + ((this.f5179c.hashCode() + ((this.f5178b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> m2963a = m2963a();
        ArrayList arrayList = new ArrayList(AbstractC0759k.m2057X(m2963a));
        for (Certificate certificate : m2963a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC1136c.m2636d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f5178b);
        sb.append(" cipherSuite=");
        sb.append(this.f5179c);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f5180d;
        ArrayList arrayList2 = new ArrayList(AbstractC0759k.m2057X(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC1136c.m2636d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
