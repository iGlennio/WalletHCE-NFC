package p001A1;

import android.os.Handler;
import androidx.emoji2.text.C0605s;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import nfc.share.nfcshare.MainActivity;
import p007C1.C0061a;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p018H.C0185e;
import p020H1.C0204c;
import p026J1.C0244l;
import p026J1.C0249q;
import p043P0.RunnableC0402A;
import p075d1.C0765q;
import p088j.C0985d0;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p123v1.AbstractC1292v;
import p123v1.C1271a;
import p123v1.C1272b;
import p123v1.C1275e;
import p123v1.C1281k;
import p123v1.C1282l;
import p123v1.C1283m;
import p123v1.C1285o;
import p123v1.C1287q;
import p123v1.C1289s;
import p123v1.C1290t;
import p123v1.C1293w;
import p123v1.InterfaceC1284n;
import p126w1.AbstractC1302b;
import p135z1.C1337e;
import p135z1.C1340h;
import p135z1.C1344l;
import p135z1.C1345m;
import p135z1.C1346n;

/* renamed from: A1.a */
/* loaded from: classes.dex */
public final class C0002a implements InterfaceC1284n {

    /* renamed from: a */
    public final /* synthetic */ int f0a = 2;

    /* renamed from: b */
    public final Object f1b;

    public C0002a(MainActivity mainActivity) {
        this.f1b = mainActivity;
    }

    /* renamed from: d */
    public static int m6d(C1290t c1290t, int i2) {
        String m2982g = C1290t.m2982g("Retry-After", c1290t);
        if (m2982g == null) {
            return i2;
        }
        Pattern compile = Pattern.compile("\\d+");
        AbstractC1136c.m2636d(compile, "compile(pattern)");
        if (!compile.matcher(m2982g).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(m2982g);
        AbstractC1136c.m2636d(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p123v1.InterfaceC1284n
    /* renamed from: a */
    public final C1290t mo7a(C0008g c0008g) {
        AbstractC1292v abstractC1292v;
        SSLSocketFactory sSLSocketFactory;
        C0204c c0204c;
        C1275e c1275e;
        switch (this.f0a) {
            case 0:
                C1032t c1032t = c0008g.f10f;
                C0185e m2523e = c1032t.m2523e();
                C0010i c0010i = (C0010i) c1032t.f4048f;
                if (c0010i != null) {
                    C1285o c1285o = (C1285o) c0010i.f20d;
                    if (c1285o != null) {
                        m2523e.m566i("Content-Type", c1285o.f5202a);
                    }
                    long j2 = c0010i.f18b;
                    if (j2 != -1) {
                        m2523e.m566i("Content-Length", String.valueOf(j2));
                        ((C0985d0) m2523e.f538d).m2463j("Transfer-Encoding");
                    } else {
                        m2523e.m566i("Transfer-Encoding", "chunked");
                        ((C0985d0) m2523e.f538d).m2463j("Content-Length");
                    }
                }
                C1281k c1281k = (C1281k) c1032t.f4047e;
                String m2964a = c1281k.m2964a("Host");
                boolean z2 = false;
                C1283m c1283m = (C1283m) c1032t.f4045c;
                if (m2964a == null) {
                    m2523e.m566i("Host", AbstractC1302b.m3014w(c1283m, false));
                }
                if (c1281k.m2964a("Connection") == null) {
                    m2523e.m566i("Connection", "Keep-Alive");
                }
                if (c1281k.m2964a("Accept-Encoding") == null && c1281k.m2964a("Range") == null) {
                    m2523e.m566i("Accept-Encoding", "gzip");
                    z2 = true;
                }
                C1272b c1272b = (C1272b) this.f1b;
                c1272b.getClass();
                AbstractC1136c.m2637e(c1283m, "url");
                if (c1281k.m2964a("User-Agent") == null) {
                    m2523e.m566i("User-Agent", "okhttp/4.9.3");
                }
                C1290t m21b = c0008g.m21b(m2523e.m559b());
                C1281k c1281k2 = m21b.f5286f;
                AbstractC0007f.m19b(c1272b, c1283m, c1281k2);
                C1289s m2983h = m21b.m2983h();
                m2983h.f5268a = c1032t;
                if (z2 && "gzip".equalsIgnoreCase(C1290t.m2982g("Content-Encoding", m21b)) && AbstractC0007f.m18a(m21b) && (abstractC1292v = m21b.f5287g) != null) {
                    C0244l c0244l = new C0244l(abstractC1292v.mo24i());
                    C0985d0 m2966c = c1281k2.m2966c();
                    m2966c.m2463j("Content-Encoding");
                    m2966c.m2463j("Content-Length");
                    m2983h.f5273f = m2966c.m2462i().m2966c();
                    m2983h.f5274g = new C0009h(C1290t.m2982g("Content-Type", m21b), -1L, new C0249q(c0244l));
                }
                return m2983h.m2981a();
            case 1:
                C1032t c1032t2 = c0008g.f10f;
                C1340h c1340h = c0008g.f6b;
                C0765q c0765q = C0765q.f2996a;
                C1290t c1290t = null;
                int i2 = 0;
                C1032t c1032t3 = c1032t2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        c1340h.getClass();
                        if (c1340h.f5539h != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (c1340h) {
                            try {
                                if (c1340h.f5541j) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (c1340h.f5540i) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            C1345m c1345m = c1340h.f5532a;
                            C1283m c1283m2 = (C1283m) c1032t3.f4045c;
                            boolean z4 = c1283m2.f5191a;
                            C1287q c1287q = c1340h.f5546o;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = c1287q.f5248o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                C0204c c0204c2 = c1287q.f5252s;
                                c1275e = c1287q.f5253t;
                                sSLSocketFactory = sSLSocketFactory2;
                                c0204c = c0204c2;
                            } else {
                                sSLSocketFactory = null;
                                c0204c = null;
                                c1275e = null;
                            }
                            c1340h.f5536e = new C1337e(c1345m, new C1271a(c1283m2.f5195e, c1283m2.f5196f, c1287q.f5244k, c1287q.f5247n, sSLSocketFactory, c0204c, c1275e, c1287q.f5246m, c1287q.f5251r, c1287q.f5250q, c1287q.f5245l), c1340h);
                        }
                        try {
                            if (c1340h.f5543l) {
                                throw new IOException("Canceled");
                            }
                            try {
                                C1290t m21b2 = c0008g.m21b(c1032t3);
                                if (c1290t != null) {
                                    C1289s m2983h2 = m21b2.m2983h();
                                    C1289s m2983h3 = c1290t.m2983h();
                                    m2983h3.f5274g = null;
                                    C1290t m2981a = m2983h3.m2981a();
                                    if (m2981a.f5287g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    m2983h2.f5277j = m2981a;
                                    m21b2 = m2983h2.m2981a();
                                }
                                c1290t = m21b2;
                                c1032t3 = m8b(c1290t, c1340h.f5539h);
                                if (c1032t3 == null) {
                                    c1340h.m3089f(false);
                                    return c1290t;
                                }
                                AbstractC1292v abstractC1292v2 = c1290t.f5287g;
                                if (abstractC1292v2 != null) {
                                    AbstractC1302b.m2994c(abstractC1292v2);
                                }
                                i2++;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                c1340h.m3089f(true);
                            } catch (IOException e2) {
                                if (!m9c(e2, c1340h, c1032t3, !(e2 instanceof C0061a))) {
                                    AbstractC1302b.m2991A(e2, c0765q);
                                    throw e2;
                                }
                                ArrayList arrayList = new ArrayList(c0765q.size() + 1);
                                arrayList.addAll(c0765q);
                                arrayList.add(e2);
                                c1340h.m3089f(true);
                                c0765q = arrayList;
                                z3 = false;
                            } catch (C1346n e3) {
                                if (!m9c(e3.f5576a, c1340h, c1032t3, false)) {
                                    IOException iOException = e3.f5577b;
                                    AbstractC1302b.m2991A(iOException, c0765q);
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f5577b;
                                ArrayList arrayList2 = new ArrayList(c0765q.size() + 1);
                                arrayList2.addAll(c0765q);
                                arrayList2.add(iOException2);
                                c1340h.m3089f(true);
                                c0765q = arrayList2;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            c1340h.m3089f(true);
                            throw th2;
                        }
                    }
                }
            default:
                C1032t c1032t4 = c0008g.f10f;
                MainActivity mainActivity = (MainActivity) this.f1b;
                if (!AbstractC0104l.m389D(mainActivity)) {
                    new Handler(mainActivity.getMainLooper()).post(new RunnableC0402A(15, this));
                }
                return c0008g.m21b(c1032t4);
        }
    }

    /* renamed from: b */
    public C1032t m8b(C1290t c1290t, C0605s c0605s) {
        String m2982g;
        C1282l c1282l;
        C1290t c1290t2;
        C1344l c1344l;
        C1293w c1293w = (c0605s == null || (c1344l = (C1344l) c0605s.f2011a) == null) ? null : c1344l.f5571q;
        int i2 = c1290t.f5284d;
        String str = (String) c1290t.f5281a.f4046d;
        if (i2 != 307 && i2 != 308) {
            if (i2 == 401) {
                ((C1287q) this.f1b).f5240g.getClass();
                return null;
            }
            if (i2 != 421) {
                if (i2 == 503) {
                    C1290t c1290t3 = c1290t.f5290j;
                    if ((c1290t3 == null || c1290t3.f5284d != 503) && m6d(c1290t, Integer.MAX_VALUE) == 0) {
                        return c1290t.f5281a;
                    }
                } else {
                    if (i2 == 407) {
                        AbstractC1136c.m2634b(c1293w);
                        if (c1293w.f5297b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((C1287q) this.f1b).f5246m.getClass();
                        return null;
                    }
                    if (i2 != 408) {
                        switch (i2) {
                        }
                    } else if (((C1287q) this.f1b).f5239f && (((c1290t2 = c1290t.f5290j) == null || c1290t2.f5284d != 408) && m6d(c1290t, 0) <= 0)) {
                        return c1290t.f5281a;
                    }
                }
            } else if (c0605s != null && !AbstractC1136c.m2633a(((C1337e) c0605s.f2013c).f5526h.f5108a.f5195e, ((C1344l) c0605s.f2011a).f5571q.f5296a.f5108a.f5195e)) {
                C1344l c1344l2 = (C1344l) c0605s.f2011a;
                synchronized (c1344l2) {
                    c1344l2.f5564j = true;
                }
                return c1290t.f5281a;
            }
            return null;
        }
        C1287q c1287q = (C1287q) this.f1b;
        if (c1287q.f5241h && (m2982g = C1290t.m2982g("Location", c1290t)) != null) {
            C1032t c1032t = c1290t.f5281a;
            C1283m c1283m = (C1283m) c1032t.f4045c;
            c1283m.getClass();
            try {
                c1282l = new C1282l();
                c1282l.m2970c(c1283m, m2982g);
            } catch (IllegalArgumentException unused) {
                c1282l = null;
            }
            C1283m m2968a = c1282l != null ? c1282l.m2968a() : null;
            if (m2968a != null) {
                if (AbstractC1136c.m2633a(m2968a.f5192b, ((C1283m) c1032t.f4045c).f5192b) || c1287q.f5242i) {
                    C0185e m2523e = c1032t.m2523e();
                    if (AbstractC0096d.m333V(str)) {
                        boolean equals = str.equals("PROPFIND");
                        int i3 = c1290t.f5284d;
                        boolean z2 = equals || i3 == 308 || i3 == 307;
                        if (str.equals("PROPFIND") || i3 == 308 || i3 == 307) {
                            m2523e.m567j(str, z2 ? (C0010i) c1032t.f4048f : null);
                        } else {
                            m2523e.m567j("GET", null);
                        }
                        if (!z2) {
                            ((C0985d0) m2523e.f538d).m2463j("Transfer-Encoding");
                            ((C0985d0) m2523e.f538d).m2463j("Content-Length");
                            ((C0985d0) m2523e.f538d).m2463j("Content-Type");
                        }
                    }
                    if (!AbstractC1302b.m2992a((C1283m) c1032t.f4045c, m2968a)) {
                        ((C0985d0) m2523e.f538d).m2463j("Authorization");
                    }
                    m2523e.f537c = m2968a;
                    return m2523e.m559b();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r7 == false) goto L26;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m9c(java.io.IOException r4, p135z1.C1340h r5, p088j.C1032t r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r6 = r3.f1b
            v1.q r6 = (p123v1.C1287q) r6
            boolean r6 = r6.f5239f
            r0 = 0
            if (r6 != 0) goto Lb
            goto L9b
        Lb:
            if (r7 == 0) goto L12
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L12
            return r0
        L12:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L17
            return r0
        L17:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L22
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L9b
            if (r7 != 0) goto L9b
            goto L35
        L22:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L30
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L30
            goto L9b
        L30:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L35
            return r0
        L35:
            z1.e r4 = r5.f5536e
            p095l1.AbstractC1136c.m2634b(r4)
            int r5 = r4.f5521c
            r6 = 1
            if (r5 != 0) goto L49
            int r7 = r4.f5522d
            if (r7 != 0) goto L49
            int r7 = r4.f5523e
            if (r7 != 0) goto L49
            r4 = r0
            goto L99
        L49:
            v1.w r7 = r4.f5524f
            if (r7 == 0) goto L4e
            goto L84
        L4e:
            r7 = 0
            if (r5 > r6) goto L80
            int r5 = r4.f5522d
            if (r5 > r6) goto L80
            int r5 = r4.f5523e
            if (r5 <= 0) goto L5a
            goto L80
        L5a:
            z1.h r5 = r4.f5527i
            z1.l r5 = r5.f5537f
            if (r5 == 0) goto L80
            monitor-enter(r5)
            int r1 = r5.f5565k     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L67
            monitor-exit(r5)
            goto L80
        L67:
            v1.w r1 = r5.f5571q     // Catch: java.lang.Throwable -> L7d
            v1.a r1 = r1.f5296a     // Catch: java.lang.Throwable -> L7d
            v1.m r1 = r1.f5108a     // Catch: java.lang.Throwable -> L7d
            v1.a r2 = r4.f5526h     // Catch: java.lang.Throwable -> L7d
            v1.m r2 = r2.f5108a     // Catch: java.lang.Throwable -> L7d
            boolean r1 = p126w1.AbstractC1302b.m2992a(r1, r2)     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L79
            monitor-exit(r5)
            goto L80
        L79:
            v1.w r7 = r5.f5571q     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r5)
            goto L80
        L7d:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L80:
            if (r7 == 0) goto L86
            r4.f5524f = r7
        L84:
            r4 = r6
            goto L99
        L86:
            H.j r5 = r4.f5519a
            if (r5 == 0) goto L91
            boolean r5 = r5.m576b()
            if (r5 != r6) goto L91
            goto L84
        L91:
            B1.h r4 = r4.f5520b
            if (r4 == 0) goto L84
            boolean r4 = r4.m106i()
        L99:
            if (r4 != 0) goto L9c
        L9b:
            return r0
        L9c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p001A1.C0002a.m9c(java.io.IOException, z1.h, j.t, boolean):boolean");
    }

    public C0002a(C1272b c1272b) {
        AbstractC1136c.m2637e(c1272b, "cookieJar");
        this.f1b = c1272b;
    }

    public C0002a(C1287q c1287q) {
        AbstractC1136c.m2637e(c1287q, "client");
        this.f1b = c1287q;
    }
}
