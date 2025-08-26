package p123v1;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p005C.AbstractC0044g;
import p010D1.AbstractC0104l;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;

/* renamed from: v1.a */
/* loaded from: classes.dex */
public final class C1271a {

    /* renamed from: a */
    public final C1283m f5108a;

    /* renamed from: b */
    public final List f5109b;

    /* renamed from: c */
    public final List f5110c;

    /* renamed from: d */
    public final C1272b f5111d;

    /* renamed from: e */
    public final SocketFactory f5112e;

    /* renamed from: f */
    public final SSLSocketFactory f5113f;

    /* renamed from: g */
    public final HostnameVerifier f5114g;

    /* renamed from: h */
    public final C1275e f5115h;

    /* renamed from: i */
    public final C1272b f5116i;

    /* renamed from: j */
    public final ProxySelector f5117j;

    public C1271a(String str, int i2, C1272b c1272b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1275e c1275e, C1272b c1272b2, List list, List list2, ProxySelector proxySelector) {
        AbstractC1136c.m2637e(str, "uriHost");
        AbstractC1136c.m2637e(c1272b, "dns");
        AbstractC1136c.m2637e(socketFactory, "socketFactory");
        AbstractC1136c.m2637e(c1272b2, "proxyAuthenticator");
        AbstractC1136c.m2637e(list, "protocols");
        AbstractC1136c.m2637e(list2, "connectionSpecs");
        AbstractC1136c.m2637e(proxySelector, "proxySelector");
        this.f5111d = c1272b;
        this.f5112e = socketFactory;
        this.f5113f = sSLSocketFactory;
        this.f5114g = hostnameVerifier;
        this.f5115h = c1275e;
        this.f5116i = c1272b2;
        this.f5117j = proxySelector;
        C1282l c1282l = new C1282l();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c1282l.f5182a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c1282l.f5182a = "https";
        }
        String m397T = AbstractC0104l.m397T(C1272b.m2957f(str, 0, 0, 7));
        if (m397T == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c1282l.f5185d = m397T;
        if (1 > i2 || 65535 < i2) {
            throw new IllegalArgumentException(AbstractC0044g.m153e("unexpected port: ", i2).toString());
        }
        c1282l.f5186e = i2;
        this.f5108a = c1282l.m2968a();
        this.f5109b = AbstractC1302b.m3015x(list);
        this.f5110c = AbstractC1302b.m3015x(list2);
    }

    /* renamed from: a */
    public final boolean m2952a(C1271a c1271a) {
        AbstractC1136c.m2637e(c1271a, "that");
        return AbstractC1136c.m2633a(this.f5111d, c1271a.f5111d) && AbstractC1136c.m2633a(this.f5116i, c1271a.f5116i) && AbstractC1136c.m2633a(this.f5109b, c1271a.f5109b) && AbstractC1136c.m2633a(this.f5110c, c1271a.f5110c) && AbstractC1136c.m2633a(this.f5117j, c1271a.f5117j) && AbstractC1136c.m2633a(this.f5113f, c1271a.f5113f) && AbstractC1136c.m2633a(this.f5114g, c1271a.f5114g) && AbstractC1136c.m2633a(this.f5115h, c1271a.f5115h) && this.f5108a.f5196f == c1271a.f5108a.f5196f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1271a)) {
            return false;
        }
        C1271a c1271a = (C1271a) obj;
        return AbstractC1136c.m2633a(this.f5108a, c1271a.f5108a) && m2952a(c1271a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f5115h) + ((Objects.hashCode(this.f5114g) + ((Objects.hashCode(this.f5113f) + ((this.f5117j.hashCode() + ((this.f5110c.hashCode() + ((this.f5109b.hashCode() + ((this.f5116i.hashCode() + ((this.f5111d.hashCode() + ((this.f5108a.f5199i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C1283m c1283m = this.f5108a;
        sb.append(c1283m.f5195e);
        sb.append(':');
        sb.append(c1283m.f5196f);
        sb.append(", ");
        sb.append("proxySelector=" + this.f5117j);
        sb.append("}");
        return sb.toString();
    }
}
