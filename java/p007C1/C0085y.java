package p007C1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import p005C.AbstractC0044g;
import p095l1.AbstractC1136c;
import p123v1.C1281k;
import p126w1.AbstractC1302b;

/* renamed from: C1.y */
/* loaded from: classes.dex */
public final class C0085y {

    /* renamed from: a */
    public long f257a;

    /* renamed from: b */
    public long f258b;

    /* renamed from: c */
    public long f259c;

    /* renamed from: d */
    public long f260d;

    /* renamed from: e */
    public final ArrayDeque f261e;

    /* renamed from: f */
    public boolean f262f;

    /* renamed from: g */
    public final C0083w f263g;

    /* renamed from: h */
    public final C0082v f264h;

    /* renamed from: i */
    public final C0084x f265i;

    /* renamed from: j */
    public final C0084x f266j;

    /* renamed from: k */
    public int f267k;

    /* renamed from: l */
    public IOException f268l;

    /* renamed from: m */
    public final int f269m;

    /* renamed from: n */
    public final C0077q f270n;

    public C0085y(int i2, C0077q c0077q, boolean z2, boolean z3, C1281k c1281k) {
        AbstractC1136c.m2637e(c0077q, "connection");
        this.f269m = i2;
        this.f270n = c0077q;
        this.f260d = c0077q.f218r.m241a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f261e = arrayDeque;
        this.f263g = new C0083w(this, c0077q.f217q.m241a(), z3);
        this.f264h = new C0082v(this, z2);
        int i3 = 0;
        this.f265i = new C0084x(i3, this);
        this.f266j = new C0084x(i3, this);
        if (c1281k == null) {
            if (!m285g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m285g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c1281k);
        }
    }

    /* renamed from: a */
    public final void m279a() {
        boolean z2;
        boolean m286h;
        byte[] bArr = AbstractC1302b.f5337a;
        synchronized (this) {
            try {
                C0083w c0083w = this.f263g;
                if (!c0083w.f253e && c0083w.f251c) {
                    C0082v c0082v = this.f264h;
                    if (c0082v.f247c || c0082v.f246b) {
                        z2 = true;
                        m286h = m286h();
                    }
                }
                z2 = false;
                m286h = m286h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            m281c(9, null);
        } else {
            if (m286h) {
                return;
            }
            this.f270n.m262i(this.f269m);
        }
    }

    /* renamed from: b */
    public final void m280b() {
        C0082v c0082v = this.f264h;
        if (c0082v.f246b) {
            throw new IOException("stream closed");
        }
        if (c0082v.f247c) {
            throw new IOException("stream finished");
        }
        if (this.f267k != 0) {
            IOException iOException = this.f268l;
            if (iOException != null) {
                throw iOException;
            }
            int i2 = this.f267k;
            AbstractC0044g.m157i(i2);
            throw new C0060E(i2);
        }
    }

    /* renamed from: c */
    public final void m281c(int i2, IOException iOException) {
        AbstractC0044g.m158j("rstStatusCode", i2);
        if (m282d(i2, iOException)) {
            C0077q c0077q = this.f270n;
            c0077q.getClass();
            AbstractC0044g.m158j("statusCode", i2);
            c0077q.f224x.m296m(this.f269m, i2);
        }
    }

    /* renamed from: d */
    public final boolean m282d(int i2, IOException iOException) {
        byte[] bArr = AbstractC1302b.f5337a;
        synchronized (this) {
            if (this.f267k != 0) {
                return false;
            }
            if (this.f263g.f253e && this.f264h.f247c) {
                return false;
            }
            this.f267k = i2;
            this.f268l = iOException;
            notifyAll();
            this.f270n.m262i(this.f269m);
            return true;
        }
    }

    /* renamed from: e */
    public final void m283e(int i2) {
        AbstractC0044g.m158j("errorCode", i2);
        if (m282d(i2, null)) {
            this.f270n.m266m(this.f269m, i2);
        }
    }

    /* renamed from: f */
    public final C0082v m284f() {
        synchronized (this) {
            if (!this.f262f && !m285g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f264h;
    }

    /* renamed from: g */
    public final boolean m285g() {
        boolean z2 = (this.f269m & 1) == 1;
        this.f270n.getClass();
        return true == z2;
    }

    /* renamed from: h */
    public final synchronized boolean m286h() {
        if (this.f267k != 0) {
            return false;
        }
        C0083w c0083w = this.f263g;
        if (c0083w.f253e || c0083w.f251c) {
            C0082v c0082v = this.f264h;
            if (c0082v.f247c || c0082v.f246b) {
                if (this.f262f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m287i(p123v1.C1281k r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            p095l1.AbstractC1136c.m2637e(r3, r0)
            byte[] r0 = p126w1.AbstractC1302b.f5337a
            monitor-enter(r2)
            boolean r0 = r2.f262f     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            if (r4 != 0) goto L10
            goto L18
        L10:
            C1.w r3 = r2.f263g     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            goto L37
        L18:
            r2.f262f = r1     // Catch: java.lang.Throwable -> L16
            java.util.ArrayDeque r0 = r2.f261e     // Catch: java.lang.Throwable -> L16
            r0.add(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            if (r4 == 0) goto L25
            C1.w r3 = r2.f263g     // Catch: java.lang.Throwable -> L16
            r3.f253e = r1     // Catch: java.lang.Throwable -> L16
        L25:
            boolean r3 = r2.m286h()     // Catch: java.lang.Throwable -> L16
            r2.notifyAll()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            if (r3 != 0) goto L36
            C1.q r3 = r2.f270n
            int r4 = r2.f269m
            r3.m262i(r4)
        L36:
            return
        L37:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p007C1.C0085y.m287i(v1.k, boolean):void");
    }

    /* renamed from: j */
    public final synchronized void m288j(int i2) {
        AbstractC0044g.m158j("errorCode", i2);
        if (this.f267k == 0) {
            this.f267k = i2;
            notifyAll();
        }
    }

    /* renamed from: k */
    public final void m289k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
