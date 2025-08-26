package p004B1;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import p001A1.AbstractC0007f;
import p001A1.C0010i;
import p001A1.InterfaceC0006e;
import p007C1.AbstractC0069i;
import p010D1.AbstractC0104l;
import p026J1.C0248p;
import p026J1.C0249q;
import p026J1.InterfaceC0253u;
import p026J1.InterfaceC0254v;
import p075d1.C0765q;
import p088j.C0985d0;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p123v1.C1271a;
import p123v1.C1281k;
import p123v1.C1283m;
import p123v1.C1287q;
import p123v1.C1289s;
import p123v1.C1290t;
import p123v1.EnumC1288r;
import p126w1.AbstractC1302b;
import p132y1.C1323c;
import p135z1.C1340h;
import p135z1.C1344l;

/* renamed from: B1.h */
/* loaded from: classes.dex */
public final class C0037h implements InterfaceC0006e {

    /* renamed from: a */
    public Object f98a;

    /* renamed from: b */
    public Object f99b;

    /* renamed from: c */
    public int f100c;

    /* renamed from: d */
    public Object f101d;

    /* renamed from: e */
    public Object f102e;

    /* renamed from: f */
    public Object f103f;

    /* renamed from: g */
    public final Object f104g;

    public C0037h(C1271a c1271a, C0985d0 c0985d0, C1340h c1340h) {
        List m3003l;
        AbstractC1136c.m2637e(c0985d0, "routeDatabase");
        AbstractC1136c.m2637e(c1340h, "call");
        this.f104g = c1271a;
        this.f98a = c0985d0;
        this.f99b = c1340h;
        C0765q c0765q = C0765q.f2996a;
        this.f101d = c0765q;
        this.f102e = c0765q;
        this.f103f = new ArrayList();
        C1283m c1283m = c1271a.f5108a;
        AbstractC1136c.m2637e(c1283m, "url");
        URI m2977g = c1283m.m2977g();
        if (m2977g.getHost() == null) {
            m3003l = AbstractC1302b.m3003l(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c1271a.f5117j.select(m2977g);
            m3003l = (select == null || select.isEmpty()) ? AbstractC1302b.m3003l(Proxy.NO_PROXY) : AbstractC1302b.m3015x(select);
        }
        this.f101d = m3003l;
        this.f100c = 0;
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: a */
    public void mo10a() {
        ((C0248p) this.f99b).flush();
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: b */
    public void mo11b() {
        ((C0248p) this.f99b).flush();
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: c */
    public InterfaceC0254v mo12c(C1290t c1290t) {
        if (!AbstractC0007f.m18a(c1290t)) {
            return m107j(0L);
        }
        if ("chunked".equalsIgnoreCase(C1290t.m2982g("Transfer-Encoding", c1290t))) {
            C1283m c1283m = (C1283m) c1290t.f5281a.f4045c;
            if (this.f100c == 4) {
                this.f100c = 5;
                return new C0033d(this, c1283m);
            }
            throw new IllegalStateException(("state: " + this.f100c).toString());
        }
        long m3002k = AbstractC1302b.m3002k(c1290t);
        if (m3002k != -1) {
            return m107j(m3002k);
        }
        if (this.f100c == 4) {
            this.f100c = 5;
            ((C1344l) this.f104g).m3102k();
            return new C0036g(this);
        }
        throw new IllegalStateException(("state: " + this.f100c).toString());
    }

    @Override // p001A1.InterfaceC0006e
    public void cancel() {
        Socket socket = ((C1344l) this.f104g).f5556b;
        if (socket != null) {
            AbstractC1302b.m2995d(socket);
        }
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: d */
    public long mo13d(C1290t c1290t) {
        if (!AbstractC0007f.m18a(c1290t)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C1290t.m2982g("Transfer-Encoding", c1290t))) {
            return -1L;
        }
        return AbstractC1302b.m3002k(c1290t);
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: e */
    public C1289s mo14e(boolean z2) {
        C0030a c0030a = (C0030a) this.f101d;
        int i2 = this.f100c;
        if (i2 != 1 && i2 != 3) {
            throw new IllegalStateException(("state: " + this.f100c).toString());
        }
        try {
            String m721p = ((C0249q) c0030a.f80c).m721p(c0030a.f79b);
            c0030a.f79b -= m721p.length();
            C0010i m394O = AbstractC0104l.m394O(m721p);
            int i3 = m394O.f18b;
            C1289s c1289s = new C1289s();
            c1289s.f5269b = (EnumC1288r) m394O.f19c;
            c1289s.f5270c = i3;
            c1289s.f5271d = (String) m394O.f20d;
            c1289s.f5273f = c0030a.m96f().m2966c();
            if (z2 && i3 == 100) {
                return null;
            }
            if (i3 == 100) {
                this.f100c = 3;
                return c1289s;
            }
            this.f100c = 4;
            return c1289s;
        } catch (EOFException e2) {
            throw new IOException("unexpected end of stream on ".concat(((C1344l) this.f104g).f5571q.f5296a.f5108a.m2976f()), e2);
        }
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: f */
    public InterfaceC0253u mo15f(C1032t c1032t, long j2) {
        if ("chunked".equalsIgnoreCase(((C1281k) c1032t.f4047e).m2964a("Transfer-Encoding"))) {
            if (this.f100c == 1) {
                this.f100c = 2;
                return new C0032c(this);
            }
            throw new IllegalStateException(("state: " + this.f100c).toString());
        }
        if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f100c == 1) {
            this.f100c = 2;
            return new C0035f(this);
        }
        throw new IllegalStateException(("state: " + this.f100c).toString());
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: g */
    public void mo16g(C1032t c1032t) {
        Proxy.Type type = ((C1344l) this.f104g).f5571q.f5297b.type();
        AbstractC1136c.m2636d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) c1032t.f4046d);
        sb.append(' ');
        C1283m c1283m = (C1283m) c1032t.f4045c;
        if (c1283m.f5191a || type != Proxy.Type.HTTP) {
            String m2972b = c1283m.m2972b();
            String m2974d = c1283m.m2974d();
            if (m2974d != null) {
                m2972b = m2972b + '?' + m2974d;
            }
            sb.append(m2972b);
        } else {
            sb.append(c1283m);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        AbstractC1136c.m2636d(sb2, "StringBuilder().apply(builderAction).toString()");
        m108k((C1281k) c1032t.f4047e, sb2);
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: h */
    public C1344l mo17h() {
        return (C1344l) this.f104g;
    }

    /* renamed from: i */
    public boolean m106i() {
        return this.f100c < ((List) this.f101d).size() || !((ArrayList) this.f103f).isEmpty();
    }

    /* renamed from: j */
    public C0034e m107j(long j2) {
        if (this.f100c == 4) {
            this.f100c = 5;
            return new C0034e(this, j2);
        }
        throw new IllegalStateException(("state: " + this.f100c).toString());
    }

    /* renamed from: k */
    public void m108k(C1281k c1281k, String str) {
        AbstractC1136c.m2637e(str, "requestLine");
        if (this.f100c != 0) {
            throw new IllegalStateException(("state: " + this.f100c).toString());
        }
        C0248p c0248p = (C0248p) this.f99b;
        c0248p.mo664e(str);
        c0248p.mo664e("\r\n");
        int size = c1281k.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0248p.mo664e(c1281k.m2965b(i2));
            c0248p.mo664e(": ");
            c0248p.mo664e(c1281k.m2967d(i2));
            c0248p.mo664e("\r\n");
        }
        c0248p.mo664e("\r\n");
        this.f100c = 1;
    }

    public C0037h(C1287q c1287q, C1344l c1344l, C0249q c0249q, C0248p c0248p) {
        AbstractC1136c.m2637e(c1344l, "connection");
        AbstractC1136c.m2637e(c0249q, "source");
        AbstractC1136c.m2637e(c0248p, "sink");
        this.f103f = c1287q;
        this.f104g = c1344l;
        this.f98a = c0249q;
        this.f99b = c0248p;
        this.f101d = new C0030a(c0249q);
    }

    public C0037h(C1323c c1323c) {
        AbstractC1136c.m2637e(c1323c, "taskRunner");
        this.f104g = c1323c;
        this.f103f = AbstractC0069i.f178a;
    }
}
