package p123v1;

import androidx.emoji2.text.C0605s;
import androidx.fragment.app.C0651y;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p002B.C0019i;
import p010D1.AbstractC0096d;
import p018H.C0185e;
import p020H1.C0204c;
import p023I1.C0222f;
import p075d1.AbstractC0763o;
import p088j.C0985d0;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;
import p132y1.C1323c;
import p135z1.C1340h;

/* renamed from: v1.q */
/* loaded from: classes.dex */
public final class C1287q implements Cloneable {

    /* renamed from: B */
    public static final List f5231B = AbstractC1302b.m3003l(EnumC1288r.HTTP_2, EnumC1288r.HTTP_1_1);

    /* renamed from: C */
    public static final List f5232C = AbstractC1302b.m3003l(C1278h.f5158e, C1278h.f5159f);

    /* renamed from: A */
    public final C0985d0 f5233A;

    /* renamed from: a */
    public final C0605s f5234a;

    /* renamed from: b */
    public final C0985d0 f5235b;

    /* renamed from: c */
    public final List f5236c;

    /* renamed from: d */
    public final List f5237d;

    /* renamed from: e */
    public final C0651y f5238e;

    /* renamed from: f */
    public final boolean f5239f;

    /* renamed from: g */
    public final C1272b f5240g;

    /* renamed from: h */
    public final boolean f5241h;

    /* renamed from: i */
    public final boolean f5242i;

    /* renamed from: j */
    public final C1272b f5243j;

    /* renamed from: k */
    public final C1272b f5244k;

    /* renamed from: l */
    public final ProxySelector f5245l;

    /* renamed from: m */
    public final C1272b f5246m;

    /* renamed from: n */
    public final SocketFactory f5247n;

    /* renamed from: o */
    public final SSLSocketFactory f5248o;

    /* renamed from: p */
    public final X509TrustManager f5249p;

    /* renamed from: q */
    public final List f5250q;

    /* renamed from: r */
    public final List f5251r;

    /* renamed from: s */
    public final C0204c f5252s;

    /* renamed from: t */
    public final C1275e f5253t;

    /* renamed from: u */
    public final AbstractC0096d f5254u;

    /* renamed from: v */
    public final int f5255v;

    /* renamed from: w */
    public final int f5256w;

    /* renamed from: x */
    public final int f5257x;

    /* renamed from: y */
    public final int f5258y;

    /* renamed from: z */
    public final long f5259z;

    /* JADX WARN: Removed duplicated region for block: B:16:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1287q(p123v1.C1286p r5) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p123v1.C1287q.<init>(v1.p):void");
    }

    /* renamed from: a */
    public final C0222f m2979a(C1032t c1032t, C0985d0 c0985d0) {
        AbstractC1136c.m2637e(c1032t, "request");
        AbstractC1136c.m2637e(c0985d0, "listener");
        C1323c c1323c = C1323c.f5414h;
        Random random = new Random();
        int i2 = this.f5258y;
        C0222f c0222f = new C0222f(c1323c, c1032t, c0985d0, random, i2, this.f5259z);
        if (((C1281k) c1032t.f4047e).m2964a("Sec-WebSocket-Extensions") != null) {
            c0222f.m621c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"));
            return c0222f;
        }
        C1286p c1286p = new C1286p();
        c1286p.f5205a = this.f5234a;
        c1286p.f5206b = this.f5235b;
        AbstractC0763o.m2058Y(c1286p.f5207c, this.f5236c);
        AbstractC0763o.m2058Y(c1286p.f5208d, this.f5237d);
        c1286p.f5210f = this.f5239f;
        c1286p.f5211g = this.f5240g;
        c1286p.f5212h = this.f5241h;
        c1286p.f5213i = this.f5242i;
        c1286p.f5214j = this.f5243j;
        c1286p.f5215k = this.f5244k;
        c1286p.f5216l = this.f5245l;
        c1286p.f5217m = this.f5246m;
        c1286p.f5218n = this.f5247n;
        c1286p.f5219o = this.f5248o;
        c1286p.f5220p = this.f5249p;
        c1286p.f5221q = this.f5250q;
        c1286p.f5222r = this.f5251r;
        c1286p.f5223s = this.f5252s;
        c1286p.f5224t = this.f5253t;
        c1286p.f5225u = this.f5254u;
        c1286p.f5226v = this.f5255v;
        c1286p.f5227w = this.f5256w;
        c1286p.f5228x = this.f5257x;
        c1286p.f5229y = i2;
        c1286p.f5230z = this.f5259z;
        c1286p.f5204A = this.f5233A;
        c1286p.f5209e = new C0651y(15);
        List list = C0222f.f614w;
        AbstractC1136c.m2637e(list, "protocols");
        ArrayList arrayList = new ArrayList(list);
        EnumC1288r enumC1288r = EnumC1288r.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(enumC1288r) && !arrayList.contains(EnumC1288r.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
        }
        if (arrayList.contains(enumC1288r) && arrayList.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
        }
        if (arrayList.contains(EnumC1288r.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
        }
        if (arrayList.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayList.remove(EnumC1288r.SPDY_3);
        if (!arrayList.equals(c1286p.f5222r)) {
            c1286p.f5204A = null;
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC1136c.m2636d(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
        c1286p.f5222r = unmodifiableList;
        C1287q c1287q = new C1287q(c1286p);
        C0185e m2523e = c1032t.m2523e();
        m2523e.m566i("Upgrade", "websocket");
        m2523e.m566i("Connection", "Upgrade");
        m2523e.m566i("Sec-WebSocket-Key", c0222f.f615a);
        m2523e.m566i("Sec-WebSocket-Version", "13");
        m2523e.m566i("Sec-WebSocket-Extensions", "permessage-deflate");
        C1032t m559b = m2523e.m559b();
        C1340h c1340h = new C1340h(c1287q, m559b, true);
        c0222f.f616b = c1340h;
        c1340h.m3088e(new C0019i(c0222f, 3, m559b));
        return c0222f;
    }

    public final Object clone() {
        return super.clone();
    }
}
