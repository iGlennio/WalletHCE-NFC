package p123v1;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p095l1.AbstractC1136c;

/* renamed from: v1.w */
/* loaded from: classes.dex */
public final class C1293w {

    /* renamed from: a */
    public final C1271a f5296a;

    /* renamed from: b */
    public final Proxy f5297b;

    /* renamed from: c */
    public final InetSocketAddress f5298c;

    public C1293w(C1271a c1271a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC1136c.m2637e(inetSocketAddress, "socketAddress");
        this.f5296a = c1271a;
        this.f5297b = proxy;
        this.f5298c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1293w)) {
            return false;
        }
        C1293w c1293w = (C1293w) obj;
        return AbstractC1136c.m2633a(c1293w.f5296a, this.f5296a) && AbstractC1136c.m2633a(c1293w.f5297b, this.f5297b) && AbstractC1136c.m2633a(c1293w.f5298c, this.f5298c);
    }

    public final int hashCode() {
        return this.f5298c.hashCode() + ((this.f5297b.hashCode() + ((this.f5296a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f5298c + '}';
    }
}
