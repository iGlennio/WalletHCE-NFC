package p001A1;

import androidx.emoji2.text.C0605s;
import java.io.IOException;
import java.net.ProtocolException;
import p010D1.AbstractC0096d;
import p026J1.C0248p;
import p026J1.C0249q;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p123v1.AbstractC1292v;
import p123v1.C1281k;
import p123v1.C1289s;
import p123v1.C1290t;
import p123v1.InterfaceC1284n;
import p126w1.AbstractC1302b;
import p135z1.C1335c;
import p135z1.C1336d;
import p135z1.C1340h;
import p135z1.C1344l;

/* renamed from: A1.b */
/* loaded from: classes.dex */
public final class C0003b implements InterfaceC1284n {

    /* renamed from: a */
    public final boolean f2a;

    public C0003b(boolean z2) {
        this.f2a = z2;
    }

    @Override // p123v1.InterfaceC1284n
    /* renamed from: a */
    public final C1290t mo7a(C0008g c0008g) {
        Long l2;
        C1289s c1289s;
        C1290t m2981a;
        C0010i c0010i;
        boolean z2;
        C0605s c0605s = c0008g.f9e;
        AbstractC1136c.m2634b(c0605s);
        C1340h c1340h = (C1340h) c0605s.f2012b;
        InterfaceC0006e interfaceC0006e = (InterfaceC0006e) c0605s.f2014d;
        C1032t c1032t = c0008g.f10f;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            AbstractC1136c.m2637e(c1340h, "call");
            interfaceC0006e.mo16g(c1032t);
            boolean m333V = AbstractC0096d.m333V((String) c1032t.f4046d);
            boolean z3 = true;
            C1344l c1344l = (C1344l) c0605s.f2011a;
            if (!m333V || (c0010i = (C0010i) c1032t.f4048f) == null) {
                l2 = null;
                c1340h.m3091h(c0605s, true, false, null);
                c1289s = null;
            } else {
                if ("100-continue".equalsIgnoreCase(((C1281k) c1032t.f4047e).m2964a("Expect"))) {
                    try {
                        interfaceC0006e.mo11b();
                        c1289s = c0605s.m1547i(true);
                        AbstractC1136c.m2637e(c1340h, "call");
                        z2 = false;
                    } catch (IOException e2) {
                        AbstractC1136c.m2637e(c1340h, "call");
                        c0605s.m1548j(e2);
                        throw e2;
                    }
                } else {
                    z2 = true;
                    c1289s = null;
                }
                if (c1289s == null) {
                    AbstractC1136c.m2634b(c0010i);
                    long j2 = c0010i.f18b;
                    AbstractC1136c.m2637e(c1340h, "call");
                    C0248p c0248p = new C0248p(new C1335c(c0605s, interfaceC0006e.mo15f(c1032t, j2), j2));
                    byte[] bArr = (byte[]) c0010i.f19c;
                    if (c0248p.f734b) {
                        throw new IllegalStateException("closed");
                    }
                    c0248p.f733a.m683x(bArr, c0010i.f18b);
                    c0248p.m709g();
                    c0248p.close();
                } else {
                    c1340h.m3091h(c0605s, true, false, null);
                    if (c1344l.f5560f == null) {
                        interfaceC0006e.mo17h().m3102k();
                    }
                }
                z3 = z2;
                l2 = null;
            }
            try {
                interfaceC0006e.mo10a();
                if (c1289s == null) {
                    c1289s = c0605s.m1547i(false);
                    AbstractC1136c.m2634b(c1289s);
                    if (z3) {
                        AbstractC1136c.m2637e(c1340h, "call");
                        z3 = false;
                    }
                }
                c1289s.f5268a = c1032t;
                c1289s.f5272e = c1344l.f5558d;
                c1289s.f5278k = currentTimeMillis;
                c1289s.f5279l = System.currentTimeMillis();
                C1290t m2981a2 = c1289s.m2981a();
                int i2 = m2981a2.f5284d;
                if (i2 == 100) {
                    C1289s m1547i = c0605s.m1547i(false);
                    AbstractC1136c.m2634b(m1547i);
                    if (z3) {
                        AbstractC1136c.m2637e(c1340h, "call");
                    }
                    m1547i.f5268a = c1032t;
                    m1547i.f5272e = c1344l.f5558d;
                    m1547i.f5278k = currentTimeMillis;
                    m1547i.f5279l = System.currentTimeMillis();
                    m2981a2 = m1547i.m2981a();
                    i2 = m2981a2.f5284d;
                }
                if (this.f2a && i2 == 101) {
                    C1289s m2983h = m2981a2.m2983h();
                    m2983h.f5274g = AbstractC1302b.f5339c;
                    m2981a = m2983h.m2981a();
                } else {
                    C1289s m2983h2 = m2981a2.m2983h();
                    try {
                        String m2982g = C1290t.m2982g("Content-Type", m2981a2);
                        long mo13d = interfaceC0006e.mo13d(m2981a2);
                        m2983h2.f5274g = new C0009h(m2982g, mo13d, new C0249q(new C1336d(c0605s, interfaceC0006e.mo12c(m2981a2), mo13d)));
                        m2981a = m2983h2.m2981a();
                    } catch (IOException e3) {
                        c0605s.m1548j(e3);
                        throw e3;
                    }
                }
                if ("close".equalsIgnoreCase(((C1281k) m2981a.f5281a.f4047e).m2964a("Connection")) || "close".equalsIgnoreCase(C1290t.m2982g("Connection", m2981a))) {
                    interfaceC0006e.mo17h().m3102k();
                }
                if (i2 == 204 || i2 == 205) {
                    AbstractC1292v abstractC1292v = m2981a.f5287g;
                    if ((abstractC1292v != null ? abstractC1292v.mo22g() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i2);
                        sb.append(" had non-zero Content-Length: ");
                        sb.append(abstractC1292v != null ? Long.valueOf(abstractC1292v.mo22g()) : l2);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return m2981a;
            } catch (IOException e4) {
                c0605s.m1548j(e4);
                throw e4;
            }
        } catch (IOException e5) {
            AbstractC1136c.m2637e(c1340h, "call");
            c0605s.m1548j(e5);
            throw e5;
        }
    }
}
