package p123v1;

import androidx.emoji2.text.C0605s;
import androidx.fragment.app.C0651y;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p010D1.AbstractC0096d;
import p020H1.C0204c;
import p088j.C0985d0;
import p095l1.AbstractC1136c;

/* renamed from: v1.p */
/* loaded from: classes.dex */
public final class C1286p {

    /* renamed from: A */
    public C0985d0 f5204A;

    /* renamed from: a */
    public C0605s f5205a = new C0605s(3);

    /* renamed from: b */
    public C0985d0 f5206b = new C0985d0(7);

    /* renamed from: c */
    public final ArrayList f5207c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f5208d = new ArrayList();

    /* renamed from: e */
    public C0651y f5209e = new C0651y(15);

    /* renamed from: f */
    public boolean f5210f = true;

    /* renamed from: g */
    public C1272b f5211g;

    /* renamed from: h */
    public boolean f5212h;

    /* renamed from: i */
    public boolean f5213i;

    /* renamed from: j */
    public C1272b f5214j;

    /* renamed from: k */
    public C1272b f5215k;

    /* renamed from: l */
    public ProxySelector f5216l;

    /* renamed from: m */
    public C1272b f5217m;

    /* renamed from: n */
    public SocketFactory f5218n;

    /* renamed from: o */
    public SSLSocketFactory f5219o;

    /* renamed from: p */
    public X509TrustManager f5220p;

    /* renamed from: q */
    public List f5221q;

    /* renamed from: r */
    public List f5222r;

    /* renamed from: s */
    public C0204c f5223s;

    /* renamed from: t */
    public C1275e f5224t;

    /* renamed from: u */
    public AbstractC0096d f5225u;

    /* renamed from: v */
    public int f5226v;

    /* renamed from: w */
    public int f5227w;

    /* renamed from: x */
    public int f5228x;

    /* renamed from: y */
    public int f5229y;

    /* renamed from: z */
    public long f5230z;

    public C1286p() {
        C1272b c1272b = C1272b.f5118a;
        this.f5211g = c1272b;
        this.f5212h = true;
        this.f5213i = true;
        this.f5214j = C1272b.f5119b;
        this.f5215k = C1272b.f5120c;
        this.f5217m = c1272b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC1136c.m2636d(socketFactory, "SocketFactory.getDefault()");
        this.f5218n = socketFactory;
        this.f5221q = C1287q.f5232C;
        this.f5222r = C1287q.f5231B;
        this.f5223s = C0204c.f578a;
        this.f5224t = C1275e.f5135c;
        this.f5226v = 10000;
        this.f5227w = 10000;
        this.f5228x = 10000;
        this.f5230z = 1024L;
    }
}
