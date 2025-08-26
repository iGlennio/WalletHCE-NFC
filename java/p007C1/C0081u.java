package p007C1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import p026J1.C0239g;
import p026J1.C0249q;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;

/* renamed from: C1.u */
/* loaded from: classes.dex */
public final class C0081u implements Closeable {

    /* renamed from: d */
    public static final Logger f241d;

    /* renamed from: a */
    public final C0080t f242a;

    /* renamed from: b */
    public final C0063c f243b;

    /* renamed from: c */
    public final C0249q f244c;

    static {
        Logger logger = Logger.getLogger(AbstractC0066f.class.getName());
        AbstractC1136c.m2636d(logger, "Logger.getLogger(Http2::class.java.name)");
        f241d = logger;
    }

    public C0081u(C0249q c0249q) {
        AbstractC1136c.m2637e(c0249q, "source");
        this.f244c = c0249q;
        C0080t c0080t = new C0080t(c0249q);
        this.f242a = c0080t;
        this.f243b = new C0063c(c0080t);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f244c.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0256, code lost:
    
        throw new java.io.IOException(p005C.AbstractC0044g.m153e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r7));
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m269g(boolean r20, p007C1.C0071k r21) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007C1.C0081u.m269g(boolean, C1.k):boolean");
    }

    /* renamed from: h */
    public final void m270h(C0071k c0071k, int i2, int i3, int i4) {
        int i5;
        boolean z2;
        boolean z3;
        long j2;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i3 & 1) != 0;
        if ((i3 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i3 & 8) != 0) {
            byte m714i = this.f244c.m714i();
            byte[] bArr = AbstractC1302b.f5337a;
            i5 = m714i & 255;
        } else {
            i5 = 0;
        }
        int m268a = AbstractC0079s.m268a(i2, i3, i5);
        C0249q c0249q = this.f244c;
        c0071k.getClass();
        AbstractC1136c.m2637e(c0249q, "source");
        c0071k.f183b.getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            C0077q c0077q = c0071k.f183b;
            c0077q.getClass();
            C0239g c0239g = new C0239g();
            long j3 = m268a;
            c0249q.m723r(j3);
            c0249q.mo101c(c0239g, j3);
            c0077q.f209i.m3026c(new C0072l(c0077q.f203c + '[' + i4 + "] onData", c0077q, i4, c0239g, m268a, z4), 0L);
        } else {
            C0085y m261h = c0071k.f183b.m261h(i4);
            if (m261h == null) {
                c0071k.f183b.m266m(i4, 2);
                long j4 = m268a;
                c0071k.f183b.m264k(j4);
                c0249q.m724s(j4);
            } else {
                byte[] bArr2 = AbstractC1302b.f5337a;
                C0083w c0083w = m261h.f263g;
                long j5 = m268a;
                c0083w.getClass();
                while (true) {
                    if (j5 <= 0) {
                        break;
                    }
                    synchronized (c0083w.f254f) {
                        z2 = c0083w.f253e;
                        z3 = c0083w.f250b.f715b + j5 > c0083w.f252d;
                    }
                    if (z3) {
                        c0249q.m724s(j5);
                        c0083w.f254f.m283e(4);
                        break;
                    }
                    if (z2) {
                        c0249q.m724s(j5);
                        break;
                    }
                    long mo101c = c0249q.mo101c(c0083w.f249a, j5);
                    if (mo101c == -1) {
                        throw new EOFException();
                    }
                    j5 -= mo101c;
                    synchronized (c0083w.f254f) {
                        try {
                            if (c0083w.f251c) {
                                C0239g c0239g2 = c0083w.f249a;
                                j2 = c0239g2.f715b;
                                c0239g2.m678s(j2);
                            } else {
                                C0239g c0239g3 = c0083w.f250b;
                                boolean z5 = c0239g3.f715b == 0;
                                c0239g3.m684y(c0083w.f249a);
                                if (z5) {
                                    C0085y c0085y = c0083w.f254f;
                                    if (c0085y == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                    c0085y.notifyAll();
                                }
                                j2 = 0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (j2 > 0) {
                        c0083w.m275g(j2);
                    }
                }
                if (z4) {
                    m261h.m287i(AbstractC1302b.f5338b, true);
                }
            }
        }
        this.f244c.m724s(i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f160g);
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m271i(int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p007C1.C0081u.m271i(int, int, int, int):java.util.List");
    }

    /* renamed from: j */
    public final void m272j(C0071k c0071k, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z2 = (i3 & 1) != 0;
        if ((i3 & 8) != 0) {
            byte m714i = this.f244c.m714i();
            byte[] bArr = AbstractC1302b.f5337a;
            i5 = m714i & 255;
        } else {
            i5 = 0;
        }
        if ((i3 & 32) != 0) {
            C0249q c0249q = this.f244c;
            c0249q.m718m();
            c0249q.m714i();
            byte[] bArr2 = AbstractC1302b.f5337a;
            c0071k.getClass();
            i2 -= 5;
        }
        List m271i = m271i(AbstractC0079s.m268a(i2, i3, i5), i5, i3, i4);
        c0071k.getClass();
        c0071k.f183b.getClass();
        if (i4 != 0 && (i4 & 1) == 0) {
            C0077q c0077q = c0071k.f183b;
            c0077q.getClass();
            c0077q.f209i.m3026c(new C0073m(c0077q.f203c + '[' + i4 + "] onHeaders", c0077q, i4, m271i, z2), 0L);
            return;
        }
        synchronized (c0071k.f183b) {
            C0085y m261h = c0071k.f183b.m261h(i4);
            if (m261h != null) {
                m261h.m287i(AbstractC1302b.m3013v(m271i), z2);
                return;
            }
            C0077q c0077q2 = c0071k.f183b;
            if (c0077q2.f206f) {
                return;
            }
            if (i4 <= c0077q2.f204d) {
                return;
            }
            if (i4 % 2 == c0077q2.f205e % 2) {
                return;
            }
            C0085y c0085y = new C0085y(i4, c0071k.f183b, false, z2, AbstractC1302b.m3013v(m271i));
            C0077q c0077q3 = c0071k.f183b;
            c0077q3.f204d = i4;
            c0077q3.f202b.put(Integer.valueOf(i4), c0085y);
            c0071k.f183b.f207g.m3033e().m3026c(new C0070j(c0071k.f183b.f203c + '[' + i4 + "] onStream", c0085y, c0071k), 0L);
        }
    }

    /* renamed from: k */
    public final void m273k(C0071k c0071k, int i2, int i3, int i4) {
        int i5;
        if (i4 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i3 & 8) != 0) {
            byte m714i = this.f244c.m714i();
            byte[] bArr = AbstractC1302b.f5337a;
            i5 = m714i & 255;
        } else {
            i5 = 0;
        }
        int m718m = this.f244c.m718m() & Integer.MAX_VALUE;
        List m271i = m271i(AbstractC0079s.m268a(i2 - 4, i3, i5), i5, i3, i4);
        c0071k.getClass();
        C0077q c0077q = c0071k.f183b;
        c0077q.getClass();
        synchronized (c0077q) {
            if (c0077q.f226z.contains(Integer.valueOf(m718m))) {
                c0077q.m266m(m718m, 2);
                return;
            }
            c0077q.f226z.add(Integer.valueOf(m718m));
            c0077q.f209i.m3026c(new C0073m(c0077q.f203c + '[' + m718m + "] onRequest", c0077q, m718m, m271i), 0L);
        }
    }
}
