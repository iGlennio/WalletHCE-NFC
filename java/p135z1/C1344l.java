package p135z1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p001A1.C0008g;
import p001A1.InterfaceC0006e;
import p004B1.C0034e;
import p004B1.C0037h;
import p005C.AbstractC0044g;
import p007C1.AbstractC0066f;
import p007C1.AbstractC0069i;
import p007C1.C0059D;
import p007C1.C0075o;
import p007C1.C0077q;
import p007C1.C0078r;
import p007C1.C0085y;
import p007C1.C0086z;
import p010D1.AbstractC0096d;
import p010D1.C0106n;
import p018H.C0185e;
import p020H1.C0204c;
import p026J1.C0242j;
import p026J1.C0248p;
import p026J1.C0249q;
import p026J1.C0256x;
import p047Q1.AbstractC0458e;
import p088j.C0985d0;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1193c;
import p123v1.C1271a;
import p123v1.C1275e;
import p123v1.C1278h;
import p123v1.C1280j;
import p123v1.C1281k;
import p123v1.C1283m;
import p123v1.C1287q;
import p123v1.C1289s;
import p123v1.C1290t;
import p123v1.C1293w;
import p123v1.EnumC1288r;
import p126w1.AbstractC1302b;
import p132y1.C1323c;

/* renamed from: z1.l */
/* loaded from: classes.dex */
public final class C1344l extends AbstractC0069i {

    /* renamed from: b */
    public Socket f5556b;

    /* renamed from: c */
    public Socket f5557c;

    /* renamed from: d */
    public C1280j f5558d;

    /* renamed from: e */
    public EnumC1288r f5559e;

    /* renamed from: f */
    public C0077q f5560f;

    /* renamed from: g */
    public C0249q f5561g;

    /* renamed from: h */
    public C0248p f5562h;

    /* renamed from: i */
    public boolean f5563i;

    /* renamed from: j */
    public boolean f5564j;

    /* renamed from: k */
    public int f5565k;

    /* renamed from: l */
    public int f5566l;

    /* renamed from: m */
    public int f5567m;

    /* renamed from: n */
    public int f5568n;

    /* renamed from: o */
    public final ArrayList f5569o;

    /* renamed from: p */
    public long f5570p;

    /* renamed from: q */
    public final C1293w f5571q;

    public C1344l(C1345m c1345m, C1293w c1293w) {
        AbstractC1136c.m2637e(c1345m, "connectionPool");
        AbstractC1136c.m2637e(c1293w, "route");
        this.f5571q = c1293w;
        this.f5568n = 1;
        this.f5569o = new ArrayList();
        this.f5570p = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public static void m3094d(C1287q c1287q, C1293w c1293w, IOException iOException) {
        AbstractC1136c.m2637e(c1287q, "client");
        AbstractC1136c.m2637e(c1293w, "failedRoute");
        AbstractC1136c.m2637e(iOException, "failure");
        if (c1293w.f5297b.type() != Proxy.Type.DIRECT) {
            C1271a c1271a = c1293w.f5296a;
            c1271a.f5117j.connectFailed(c1271a.f5108a.m2977g(), c1293w.f5297b.address(), iOException);
        }
        C0985d0 c0985d0 = c1287q.f5233A;
        synchronized (c0985d0) {
            ((LinkedHashSet) c0985d0.f3904b).add(c1293w);
        }
    }

    @Override // p007C1.AbstractC0069i
    /* renamed from: a */
    public final synchronized void mo258a(C0077q c0077q, C0059D c0059d) {
        AbstractC1136c.m2637e(c0077q, "connection");
        AbstractC1136c.m2637e(c0059d, "settings");
        this.f5568n = (c0059d.f142a & 16) != 0 ? c0059d.f143b[4] : Integer.MAX_VALUE;
    }

    @Override // p007C1.AbstractC0069i
    /* renamed from: b */
    public final void mo257b(C0085y c0085y) {
        c0085y.m281c(8, null);
    }

    /* renamed from: c */
    public final void m3095c(int i2, int i3, int i4, int i5, boolean z2, C1340h c1340h) {
        C1293w c1293w;
        AbstractC1136c.m2637e(c1340h, "call");
        if (this.f5559e != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f5571q.f5296a.f5110c;
        C1334b c1334b = new C1334b(list);
        C1271a c1271a = this.f5571q.f5296a;
        if (c1271a.f5113f == null) {
            if (!list.contains(C1278h.f5159f)) {
                throw new C1346n(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f5571q.f5296a.f5108a.f5195e;
            C0106n c0106n = C0106n.f319a;
            if (!C0106n.f319a.mo317h(str)) {
                throw new C1346n(new UnknownServiceException(AbstractC0044g.m155g("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c1271a.f5109b.contains(EnumC1288r.H2_PRIOR_KNOWLEDGE)) {
            throw new C1346n(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C1346n c1346n = null;
        do {
            try {
                C1293w c1293w2 = this.f5571q;
                if (c1293w2.f5296a.f5113f != null && c1293w2.f5297b.type() == Proxy.Type.HTTP) {
                    m3097f(i2, i3, i4, c1340h);
                    if (this.f5556b == null) {
                        c1293w = this.f5571q;
                        if (c1293w.f5296a.f5113f == null && c1293w.f5297b.type() == Proxy.Type.HTTP && this.f5556b == null) {
                            throw new C1346n(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f5570p = System.nanoTime();
                        return;
                    }
                } else {
                    m3096e(i2, i3, c1340h);
                }
                m3098g(c1334b, i5, c1340h);
                AbstractC1136c.m2637e(this.f5571q.f5298c, "inetSocketAddress");
                c1293w = this.f5571q;
                if (c1293w.f5296a.f5113f == null) {
                }
                this.f5570p = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.f5557c;
                if (socket != null) {
                    AbstractC1302b.m2995d(socket);
                }
                Socket socket2 = this.f5556b;
                if (socket2 != null) {
                    AbstractC1302b.m2995d(socket2);
                }
                this.f5557c = null;
                this.f5556b = null;
                this.f5561g = null;
                this.f5562h = null;
                this.f5558d = null;
                this.f5559e = null;
                this.f5560f = null;
                this.f5568n = 1;
                AbstractC1136c.m2637e(this.f5571q.f5298c, "inetSocketAddress");
                if (c1346n == null) {
                    c1346n = new C1346n(e2);
                } else {
                    AbstractC0458e.m1188f(c1346n.f5577b, e2);
                    c1346n.f5576a = e2;
                }
                if (!z2) {
                    throw c1346n;
                }
                c1334b.f5504c = true;
                if (!c1334b.f5503b) {
                    throw c1346n;
                }
                if (e2 instanceof ProtocolException) {
                    throw c1346n;
                }
                if (e2 instanceof InterruptedIOException) {
                    throw c1346n;
                }
                if ((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) {
                    throw c1346n;
                }
                if (e2 instanceof SSLPeerUnverifiedException) {
                    throw c1346n;
                }
            }
        } while (e2 instanceof SSLException);
        throw c1346n;
    }

    /* renamed from: e */
    public final void m3096e(int i2, int i3, C1340h c1340h) {
        Socket socket;
        int i4;
        C1293w c1293w = this.f5571q;
        Proxy proxy = c1293w.f5297b;
        C1271a c1271a = c1293w.f5296a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i4 = AbstractC1341i.f5549a[type.ordinal()]) == 1 || i4 == 2)) {
            socket = c1271a.f5112e.createSocket();
            AbstractC1136c.m2634b(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f5556b = socket;
        InetSocketAddress inetSocketAddress = this.f5571q.f5298c;
        AbstractC1136c.m2637e(c1340h, "call");
        AbstractC1136c.m2637e(inetSocketAddress, "inetSocketAddress");
        socket.setSoTimeout(i3);
        try {
            C0106n c0106n = C0106n.f319a;
            C0106n.f319a.mo320e(socket, this.f5571q.f5298c, i2);
            try {
                this.f5561g = new C0249q(AbstractC0096d.m349j0(socket));
                this.f5562h = new C0248p(AbstractC0096d.m347i0(socket));
            } catch (NullPointerException e2) {
                if (AbstractC1136c.m2633a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f5571q.f5298c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    /* renamed from: f */
    public final void m3097f(int i2, int i3, int i4, C1340h c1340h) {
        C0185e c0185e = new C0185e();
        C1293w c1293w = this.f5571q;
        C1283m c1283m = c1293w.f5296a.f5108a;
        AbstractC1136c.m2637e(c1283m, "url");
        c0185e.f537c = c1283m;
        c0185e.m567j("CONNECT", null);
        C1271a c1271a = c1293w.f5296a;
        c0185e.m566i("Host", AbstractC1302b.m3014w(c1271a.f5108a, true));
        c0185e.m566i("Proxy-Connection", "Keep-Alive");
        c0185e.m566i("User-Agent", "okhttp/4.9.3");
        C1032t m559b = c0185e.m559b();
        C0985d0 c0985d0 = new C0985d0(8);
        AbstractC0096d.m348j("Proxy-Authenticate");
        AbstractC0096d.m350k("OkHttp-Preemptive", "Proxy-Authenticate");
        c0985d0.m2463j("Proxy-Authenticate");
        c0985d0.m2461g("Proxy-Authenticate", "OkHttp-Preemptive");
        c0985d0.m2462i();
        c1271a.f5116i.getClass();
        m3096e(i2, i3, c1340h);
        String str = "CONNECT " + AbstractC1302b.m3014w((C1283m) m559b.f4045c, true) + " HTTP/1.1";
        C0249q c0249q = this.f5561g;
        AbstractC1136c.m2634b(c0249q);
        C0248p c0248p = this.f5562h;
        AbstractC1136c.m2634b(c0248p);
        C0037h c0037h = new C0037h(null, this, c0249q, c0248p);
        C0256x mo100a = c0249q.f738c.mo100a();
        long j2 = i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo100a.mo703g(j2, timeUnit);
        c0248p.f735c.mo103a().mo703g(i4, timeUnit);
        c0037h.m108k((C1281k) m559b.f4047e, str);
        c0037h.mo10a();
        C1289s mo14e = c0037h.mo14e(false);
        AbstractC1136c.m2634b(mo14e);
        mo14e.f5268a = m559b;
        C1290t m2981a = mo14e.m2981a();
        long m3002k = AbstractC1302b.m3002k(m2981a);
        if (m3002k != -1) {
            C0034e m107j = c0037h.m107j(m3002k);
            AbstractC1302b.m3012u(m107j, Integer.MAX_VALUE);
            m107j.close();
        }
        int i5 = m2981a.f5284d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(AbstractC0044g.m153e("Unexpected response code for CONNECT: ", i5));
            }
            c1271a.f5116i.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c0249q.f736a.m666g() || !c0248p.f733a.m666g()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* renamed from: g */
    public final void m3098g(C1334b c1334b, int i2, C1340h c1340h) {
        C1271a c1271a = this.f5571q.f5296a;
        SSLSocketFactory sSLSocketFactory = c1271a.f5113f;
        EnumC1288r enumC1288r = EnumC1288r.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c1271a.f5109b;
            EnumC1288r enumC1288r2 = EnumC1288r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(enumC1288r2)) {
                this.f5557c = this.f5556b;
                this.f5559e = enumC1288r;
                return;
            } else {
                this.f5557c = this.f5556b;
                this.f5559e = enumC1288r2;
                m3103l(i2);
                return;
            }
        }
        AbstractC1136c.m2637e(c1340h, "call");
        C1271a c1271a2 = this.f5571q.f5296a;
        SSLSocketFactory sSLSocketFactory2 = c1271a2.f5113f;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            AbstractC1136c.m2634b(sSLSocketFactory2);
            Socket socket = this.f5556b;
            C1283m c1283m = c1271a2.f5108a;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, c1283m.f5195e, c1283m.f5196f, true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                C1278h m3075a = c1334b.m3075a(sSLSocket2);
                if (m3075a.f5161b) {
                    C0106n c0106n = C0106n.f319a;
                    C0106n.f319a.mo315d(sSLSocket2, c1271a2.f5108a.f5195e, c1271a2.f5109b);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                AbstractC1136c.m2636d(session, "sslSocketSession");
                C1280j m1205w = AbstractC0458e.m1205w(session);
                HostnameVerifier hostnameVerifier = c1271a2.f5114g;
                AbstractC1136c.m2634b(hostnameVerifier);
                if (hostnameVerifier.verify(c1271a2.f5108a.f5195e, session)) {
                    C1275e c1275e = c1271a2.f5115h;
                    AbstractC1136c.m2634b(c1275e);
                    this.f5558d = new C1280j(m1205w.f5178b, m1205w.f5179c, m1205w.f5180d, new C1342j(c1275e, m1205w, c1271a2));
                    AbstractC1136c.m2637e(c1271a2.f5108a.f5195e, "hostname");
                    Iterator it = c1275e.f5136a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (m3075a.f5161b) {
                        C0106n c0106n2 = C0106n.f319a;
                        str = C0106n.f319a.mo316f(sSLSocket2);
                    }
                    this.f5557c = sSLSocket2;
                    this.f5561g = new C0249q(AbstractC0096d.m349j0(sSLSocket2));
                    this.f5562h = new C0248p(AbstractC0096d.m347i0(sSLSocket2));
                    if (str != null) {
                        enumC1288r = AbstractC0458e.m1206x(str);
                    }
                    this.f5559e = enumC1288r;
                    C0106n c0106n3 = C0106n.f319a;
                    C0106n.f319a.mo387a(sSLSocket2);
                    if (this.f5559e == EnumC1288r.HTTP_2) {
                        m3103l(i2);
                        return;
                    }
                    return;
                }
                List m2963a = m1205w.m2963a();
                if (m2963a.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c1271a2.f5108a.f5195e + " not verified (no certificates)");
                }
                Object obj = m2963a.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c1271a2.f5108a.f5195e);
                sb.append(" not verified:\n              |    certificate: ");
                C1275e c1275e2 = C1275e.f5135c;
                sb.append(AbstractC0096d.m334W(x509Certificate));
                sb.append("\n              |    DN: ");
                Principal subjectDN = x509Certificate.getSubjectDN();
                AbstractC1136c.m2636d(subjectDN, "cert.subjectDN");
                sb.append(subjectDN.getName());
                sb.append("\n              |    subjectAltNames: ");
                List m577a = C0204c.m577a(x509Certificate, 7);
                List m577a2 = C0204c.m577a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(m577a2.size() + m577a.size());
                arrayList.addAll(m577a);
                arrayList.addAll(m577a2);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(AbstractC1193c.m2754o0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C0106n c0106n4 = C0106n.f319a;
                    C0106n.f319a.mo387a(sSLSocket);
                }
                if (sSLSocket != null) {
                    AbstractC1302b.m2995d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
    
        if (p020H1.C0204c.m579c(r1, (java.security.cert.X509Certificate) r11) != false) goto L57;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3099h(p123v1.C1271a r10, java.util.ArrayList r11) {
        /*
            r9 = this;
            java.lang.String r0 = "hostname"
            byte[] r1 = p126w1.AbstractC1302b.f5337a
            java.util.ArrayList r1 = r9.f5569o
            int r1 = r1.size()
            int r2 = r9.f5568n
            r3 = 0
            if (r1 >= r2) goto Le4
            boolean r1 = r9.f5563i
            if (r1 == 0) goto L15
            goto Le4
        L15:
            v1.w r1 = r9.f5571q
            v1.a r2 = r1.f5296a
            boolean r2 = r2.m2952a(r10)
            if (r2 != 0) goto L21
            goto Le4
        L21:
            v1.m r2 = r10.f5108a
            java.lang.String r4 = r2.f5195e
            v1.a r5 = r1.f5296a
            v1.m r6 = r5.f5108a
            java.lang.String r6 = r6.f5195e
            boolean r4 = p095l1.AbstractC1136c.m2633a(r4, r6)
            r6 = 1
            if (r4 == 0) goto L33
            return r6
        L33:
            C1.q r4 = r9.f5560f
            if (r4 != 0) goto L39
            goto Le4
        L39:
            if (r11 == 0) goto Le4
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L43
            goto Le4
        L43:
            java.util.Iterator r11 = r11.iterator()
        L47:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto Le4
            java.lang.Object r4 = r11.next()
            v1.w r4 = (p123v1.C1293w) r4
            java.net.Proxy r7 = r4.f5297b
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 != r8) goto L47
            java.net.Proxy r7 = r1.f5297b
            java.net.Proxy$Type r7 = r7.type()
            if (r7 != r8) goto L47
            java.net.InetSocketAddress r4 = r4.f5298c
            java.net.InetSocketAddress r7 = r1.f5298c
            boolean r4 = p095l1.AbstractC1136c.m2633a(r7, r4)
            if (r4 == 0) goto L47
            H1.c r11 = p020H1.C0204c.f578a
            javax.net.ssl.HostnameVerifier r1 = r10.f5114g
            if (r1 == r11) goto L76
            goto Le4
        L76:
            byte[] r11 = p126w1.AbstractC1302b.f5337a
            v1.m r11 = r5.f5108a
            int r1 = r11.f5196f
            int r4 = r2.f5196f
            if (r4 == r1) goto L81
            goto Le4
        L81:
            java.lang.String r11 = r11.f5195e
            java.lang.String r1 = r2.f5195e
            boolean r11 = p095l1.AbstractC1136c.m2633a(r1, r11)
            if (r11 == 0) goto L8c
            goto Lac
        L8c:
            boolean r11 = r9.f5564j
            if (r11 != 0) goto Le4
            v1.j r11 = r9.f5558d
            if (r11 == 0) goto Le4
            java.util.List r11 = r11.m2963a()
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto Le4
            java.lang.Object r11 = r11.get(r3)
            if (r11 == 0) goto Ldc
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11
            boolean r11 = p020H1.C0204c.m579c(r1, r11)
            if (r11 == 0) goto Le4
        Lac:
            v1.e r10 = r10.f5115h     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            p095l1.AbstractC1136c.m2634b(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            v1.j r11 = r9.f5558d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            p095l1.AbstractC1136c.m2634b(r11)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.util.List r11 = r11.m2963a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            p095l1.AbstractC1136c.m2637e(r1, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.lang.String r0 = "peerCertificates"
            p095l1.AbstractC1136c.m2637e(r11, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.util.Set r10 = r10.f5136a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.util.Iterator r10 = r10.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            boolean r11 = r10.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            if (r11 != 0) goto Lcf
            return r6
        Lcf:
            java.lang.Object r10 = r10.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            r10.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            java.lang.ClassCastException r10 = new java.lang.ClassCastException     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            r10.<init>()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
            throw r10     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Le4
        Ldc:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r10.<init>(r11)
            throw r10
        Le4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p135z1.C1344l.m3099h(v1.a, java.util.ArrayList):boolean");
    }

    /* renamed from: i */
    public final boolean m3100i(boolean z2) {
        long j2;
        byte[] bArr = AbstractC1302b.f5337a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f5556b;
        AbstractC1136c.m2634b(socket);
        Socket socket2 = this.f5557c;
        AbstractC1136c.m2634b(socket2);
        AbstractC1136c.m2634b(this.f5561g);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C0077q c0077q = this.f5560f;
        if (c0077q != null) {
            synchronized (c0077q) {
                if (c0077q.f206f) {
                    return false;
                }
                if (c0077q.f215o < c0077q.f214n) {
                    if (nanoTime >= c0077q.f216p) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f5570p;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.m712g();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: j */
    public final InterfaceC0006e m3101j(C1287q c1287q, C0008g c0008g) {
        AbstractC1136c.m2637e(c1287q, "client");
        Socket socket = this.f5557c;
        AbstractC1136c.m2634b(socket);
        C0249q c0249q = this.f5561g;
        AbstractC1136c.m2634b(c0249q);
        C0248p c0248p = this.f5562h;
        AbstractC1136c.m2634b(c0248p);
        C0077q c0077q = this.f5560f;
        if (c0077q != null) {
            return new C0078r(c1287q, this, c0008g, c0077q);
        }
        int i2 = c0008g.f12h;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0249q.f738c.mo100a().mo703g(i2, timeUnit);
        c0248p.f735c.mo103a().mo703g(c0008g.f13i, timeUnit);
        return new C0037h(c1287q, this, c0249q, c0248p);
    }

    /* renamed from: k */
    public final synchronized void m3102k() {
        this.f5563i = true;
    }

    /* renamed from: l */
    public final void m3103l(int i2) {
        Socket socket = this.f5557c;
        AbstractC1136c.m2634b(socket);
        C0249q c0249q = this.f5561g;
        AbstractC1136c.m2634b(c0249q);
        C0248p c0248p = this.f5562h;
        AbstractC1136c.m2634b(c0248p);
        socket.setSoTimeout(0);
        C1323c c1323c = C1323c.f5414h;
        C0037h c0037h = new C0037h(c1323c);
        String str = this.f5571q.f5296a.f5108a.f5195e;
        AbstractC1136c.m2637e(str, "peerName");
        c0037h.f101d = socket;
        c0037h.f102e = AbstractC1302b.f5343g + ' ' + str;
        c0037h.f98a = c0249q;
        c0037h.f99b = c0248p;
        c0037h.f103f = this;
        c0037h.f100c = i2;
        C0077q c0077q = new C0077q(c0037h);
        this.f5560f = c0077q;
        C0059D c0059d = C0077q.f200A;
        this.f5568n = (c0059d.f142a & 16) != 0 ? c0059d.f143b[4] : Integer.MAX_VALUE;
        C0086z c0086z = c0077q.f224x;
        synchronized (c0086z) {
            try {
                if (c0086z.f274c) {
                    throw new IOException("closed");
                }
                Logger logger = C0086z.f271f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC1302b.m3000i(">> CONNECTION " + AbstractC0066f.f171a.mo689d(), new Object[0]));
                }
                C0248p c0248p2 = c0086z.f276e;
                C0242j c0242j = AbstractC0066f.f171a;
                c0248p2.getClass();
                AbstractC1136c.m2637e(c0242j, "byteString");
                if (c0248p2.f734b) {
                    throw new IllegalStateException("closed");
                }
                c0248p2.f733a.m681v(c0242j);
                c0248p2.m709g();
                c0086z.f276e.flush();
            } finally {
            }
        }
        C0086z c0086z2 = c0077q.f224x;
        C0059D c0059d2 = c0077q.f217q;
        synchronized (c0086z2) {
            try {
                AbstractC1136c.m2637e(c0059d2, "settings");
                if (c0086z2.f274c) {
                    throw new IOException("closed");
                }
                c0086z2.m292i(0, Integer.bitCount(c0059d2.f142a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    boolean z2 = true;
                    if (((1 << i3) & c0059d2.f142a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i4 = i3 != 4 ? i3 != 7 ? i3 : 4 : 3;
                        C0248p c0248p3 = c0086z2.f276e;
                        if (c0248p3.f734b) {
                            throw new IllegalStateException("closed");
                        }
                        c0248p3.f733a.m659C(i4);
                        c0248p3.m709g();
                        c0086z2.f276e.m711i(c0059d2.f143b[i3]);
                    }
                    i3++;
                }
                c0086z2.f276e.flush();
            } finally {
            }
        }
        if (c0077q.f217q.m241a() != 65535) {
            c0077q.f224x.m297n(0, r0 - 65535);
        }
        c1323c.m3033e().m3026c(new C0075o(c0077q.f225y, c0077q.f203c, 1), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C1293w c1293w = this.f5571q;
        sb.append(c1293w.f5296a.f5108a.f5195e);
        sb.append(':');
        sb.append(c1293w.f5296a.f5108a.f5196f);
        sb.append(", proxy=");
        sb.append(c1293w.f5297b);
        sb.append(" hostAddress=");
        sb.append(c1293w.f5298c);
        sb.append(" cipherSuite=");
        C1280j c1280j = this.f5558d;
        if (c1280j == null || (obj = c1280j.f5179c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f5559e);
        sb.append('}');
        return sb.toString();
    }
}
