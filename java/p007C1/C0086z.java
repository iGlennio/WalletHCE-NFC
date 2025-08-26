package p007C1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005C.AbstractC0044g;
import p026J1.C0239g;
import p026J1.C0248p;
import p075d1.AbstractC0756h;
import p095l1.AbstractC1136c;
import p107q.AbstractC1181e;
import p126w1.AbstractC1302b;

/* renamed from: C1.z */
/* loaded from: classes.dex */
public final class C0086z implements Closeable {

    /* renamed from: f */
    public static final Logger f271f = Logger.getLogger(AbstractC0066f.class.getName());

    /* renamed from: a */
    public final C0239g f272a;

    /* renamed from: b */
    public int f273b;

    /* renamed from: c */
    public boolean f274c;

    /* renamed from: d */
    public final C0064d f275d;

    /* renamed from: e */
    public final C0248p f276e;

    public C0086z(C0248p c0248p) {
        AbstractC1136c.m2637e(c0248p, "sink");
        this.f276e = c0248p;
        C0239g c0239g = new C0239g();
        this.f272a = c0239g;
        this.f273b = 16384;
        this.f275d = new C0064d(c0239g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f274c = true;
        this.f276e.close();
    }

    public final synchronized void flush() {
        if (this.f274c) {
            throw new IOException("closed");
        }
        this.f276e.flush();
    }

    /* renamed from: g */
    public final synchronized void m290g(C0059D c0059d) {
        try {
            AbstractC1136c.m2637e(c0059d, "peerSettings");
            if (this.f274c) {
                throw new IOException("closed");
            }
            int i2 = this.f273b;
            int i3 = c0059d.f142a;
            if ((i3 & 32) != 0) {
                i2 = c0059d.f143b[5];
            }
            this.f273b = i2;
            if (((i3 & 2) != 0 ? c0059d.f143b[1] : -1) != -1) {
                C0064d c0064d = this.f275d;
                int i4 = (i3 & 2) != 0 ? c0059d.f143b[1] : -1;
                c0064d.getClass();
                int min = Math.min(i4, 16384);
                int i5 = c0064d.f163c;
                if (i5 != min) {
                    if (min < i5) {
                        c0064d.f161a = Math.min(c0064d.f161a, min);
                    }
                    c0064d.f162b = true;
                    c0064d.f163c = min;
                    int i6 = c0064d.f167g;
                    if (min < i6) {
                        if (min == 0) {
                            C0062b[] c0062bArr = c0064d.f164d;
                            AbstractC0756h.m2052r0(c0062bArr, 0, c0062bArr.length);
                            c0064d.f165e = c0064d.f164d.length - 1;
                            c0064d.f166f = 0;
                            c0064d.f167g = 0;
                        } else {
                            c0064d.m249a(i6 - min);
                        }
                    }
                }
            }
            m292i(0, 0, 4, 1);
            this.f276e.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h */
    public final synchronized void m291h(boolean z2, int i2, C0239g c0239g, int i3) {
        if (this.f274c) {
            throw new IOException("closed");
        }
        m292i(i2, i3, 0, z2 ? 1 : 0);
        if (i3 > 0) {
            AbstractC1136c.m2634b(c0239g);
            this.f276e.mo104b(c0239g, i3);
        }
    }

    /* renamed from: i */
    public final void m292i(int i2, int i3, int i4, int i5) {
        Level level = Level.FINE;
        Logger logger = f271f;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC0066f.m255a(false, i2, i3, i4, i5));
        }
        if (i3 > this.f273b) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f273b + ": " + i3).toString());
        }
        if ((((int) 2147483648L) & i2) != 0) {
            throw new IllegalArgumentException(AbstractC0044g.m153e("reserved bit set: ", i2).toString());
        }
        byte[] bArr = AbstractC1302b.f5337a;
        C0248p c0248p = this.f276e;
        AbstractC1136c.m2637e(c0248p, "$this$writeMedium");
        c0248p.m710h((i3 >>> 16) & 255);
        c0248p.m710h((i3 >>> 8) & 255);
        c0248p.m710h(i3 & 255);
        c0248p.m710h(i4 & 255);
        c0248p.m710h(i5 & 255);
        c0248p.m711i(i2 & Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public final synchronized void m293j(int i2, int i3, byte[] bArr) {
        AbstractC0044g.m158j("errorCode", i3);
        if (this.f274c) {
            throw new IOException("closed");
        }
        if (AbstractC1181e.m2740a(i3) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m292i(0, bArr.length + 8, 7, 0);
        this.f276e.m711i(i2);
        this.f276e.m711i(AbstractC1181e.m2740a(i3));
        if (bArr.length != 0) {
            C0248p c0248p = this.f276e;
            if (c0248p.f734b) {
                throw new IllegalStateException("closed");
            }
            c0248p.f733a.m682w(bArr);
            c0248p.m709g();
        }
        this.f276e.flush();
    }

    /* renamed from: k */
    public final synchronized void m294k(boolean z2, int i2, ArrayList arrayList) {
        if (this.f274c) {
            throw new IOException("closed");
        }
        this.f275d.m252d(arrayList);
        long j2 = this.f272a.f715b;
        long min = Math.min(this.f273b, j2);
        int i3 = j2 == min ? 4 : 0;
        if (z2) {
            i3 |= 1;
        }
        m292i(i2, (int) min, 1, i3);
        this.f276e.mo104b(this.f272a, min);
        if (j2 > min) {
            long j3 = j2 - min;
            while (j3 > 0) {
                long min2 = Math.min(this.f273b, j3);
                j3 -= min2;
                m292i(i2, (int) min2, 9, j3 == 0 ? 4 : 0);
                this.f276e.mo104b(this.f272a, min2);
            }
        }
    }

    /* renamed from: l */
    public final synchronized void m295l(int i2, int i3, boolean z2) {
        if (this.f274c) {
            throw new IOException("closed");
        }
        m292i(0, 8, 6, z2 ? 1 : 0);
        this.f276e.m711i(i2);
        this.f276e.m711i(i3);
        this.f276e.flush();
    }

    /* renamed from: m */
    public final synchronized void m296m(int i2, int i3) {
        AbstractC0044g.m158j("errorCode", i3);
        if (this.f274c) {
            throw new IOException("closed");
        }
        if (AbstractC1181e.m2740a(i3) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m292i(i2, 4, 3, 0);
        this.f276e.m711i(AbstractC1181e.m2740a(i3));
        this.f276e.flush();
    }

    /* renamed from: n */
    public final synchronized void m297n(int i2, long j2) {
        if (this.f274c) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        m292i(i2, 4, 8, 0);
        this.f276e.m711i((int) j2);
        this.f276e.flush();
    }
}
