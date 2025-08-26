package p007C1;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import p004B1.C0037h;
import p005C.AbstractC0044g;
import p026J1.C0248p;
import p026J1.C0249q;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;
import p132y1.C1322b;
import p132y1.C1323c;

/* renamed from: C1.q */
/* loaded from: classes.dex */
public final class C0077q implements Closeable {

    /* renamed from: A */
    public static final C0059D f200A;

    /* renamed from: a */
    public final AbstractC0069i f201a;

    /* renamed from: b */
    public final LinkedHashMap f202b = new LinkedHashMap();

    /* renamed from: c */
    public final String f203c;

    /* renamed from: d */
    public int f204d;

    /* renamed from: e */
    public int f205e;

    /* renamed from: f */
    public boolean f206f;

    /* renamed from: g */
    public final C1323c f207g;

    /* renamed from: h */
    public final C1322b f208h;

    /* renamed from: i */
    public final C1322b f209i;

    /* renamed from: j */
    public final C1322b f210j;

    /* renamed from: k */
    public final C0058C f211k;

    /* renamed from: l */
    public long f212l;

    /* renamed from: m */
    public long f213m;

    /* renamed from: n */
    public long f214n;

    /* renamed from: o */
    public long f215o;

    /* renamed from: p */
    public long f216p;

    /* renamed from: q */
    public final C0059D f217q;

    /* renamed from: r */
    public C0059D f218r;

    /* renamed from: s */
    public long f219s;

    /* renamed from: t */
    public long f220t;

    /* renamed from: u */
    public long f221u;

    /* renamed from: v */
    public long f222v;

    /* renamed from: w */
    public final Socket f223w;

    /* renamed from: x */
    public final C0086z f224x;

    /* renamed from: y */
    public final C0071k f225y;

    /* renamed from: z */
    public final LinkedHashSet f226z;

    static {
        C0059D c0059d = new C0059D();
        c0059d.m243c(7, 65535);
        c0059d.m243c(5, 16384);
        f200A = c0059d;
    }

    public C0077q(C0037h c0037h) {
        this.f201a = (AbstractC0069i) c0037h.f103f;
        String str = (String) c0037h.f102e;
        if (str == null) {
            AbstractC1136c.m2640h("connectionName");
            throw null;
        }
        this.f203c = str;
        this.f205e = 3;
        C1323c c1323c = (C1323c) c0037h.f104g;
        this.f207g = c1323c;
        C1322b m3033e = c1323c.m3033e();
        this.f208h = m3033e;
        this.f209i = c1323c.m3033e();
        this.f210j = c1323c.m3033e();
        this.f211k = C0058C.f141a;
        C0059D c0059d = new C0059D();
        c0059d.m243c(7, 16777216);
        this.f217q = c0059d;
        this.f218r = f200A;
        this.f222v = r2.m241a();
        Socket socket = (Socket) c0037h.f101d;
        if (socket == null) {
            AbstractC1136c.m2640h("socket");
            throw null;
        }
        this.f223w = socket;
        C0248p c0248p = (C0248p) c0037h.f99b;
        if (c0248p == null) {
            AbstractC1136c.m2640h("sink");
            throw null;
        }
        this.f224x = new C0086z(c0248p);
        C0249q c0249q = (C0249q) c0037h.f98a;
        if (c0249q == null) {
            AbstractC1136c.m2640h("source");
            throw null;
        }
        this.f225y = new C0071k(this, new C0081u(c0249q));
        this.f226z = new LinkedHashSet();
        int i2 = c0037h.f100c;
        if (i2 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            m3033e.m3026c(new C0067g(str.concat(" ping"), this, nanos), nanos);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m260g(1, 9, null);
    }

    public final void flush() {
        this.f224x.flush();
    }

    /* renamed from: g */
    public final void m260g(int i2, int i3, IOException iOException) {
        int i4;
        C0085y[] c0085yArr;
        AbstractC0044g.m158j("connectionCode", i2);
        AbstractC0044g.m158j("streamCode", i3);
        byte[] bArr = AbstractC1302b.f5337a;
        try {
            m263j(i2);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f202b.isEmpty()) {
                    c0085yArr = null;
                } else {
                    Object[] array = this.f202b.values().toArray(new C0085y[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    c0085yArr = (C0085y[]) array;
                    this.f202b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0085yArr != null) {
            for (C0085y c0085y : c0085yArr) {
                try {
                    c0085y.m281c(i3, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f224x.close();
        } catch (IOException unused3) {
        }
        try {
            this.f223w.close();
        } catch (IOException unused4) {
        }
        this.f208h.m3028e();
        this.f209i.m3028e();
        this.f210j.m3028e();
    }

    /* renamed from: h */
    public final synchronized C0085y m261h(int i2) {
        return (C0085y) this.f202b.get(Integer.valueOf(i2));
    }

    /* renamed from: i */
    public final synchronized C0085y m262i(int i2) {
        C0085y c0085y;
        c0085y = (C0085y) this.f202b.remove(Integer.valueOf(i2));
        notifyAll();
        return c0085y;
    }

    /* renamed from: j */
    public final void m263j(int i2) {
        AbstractC0044g.m158j("statusCode", i2);
        synchronized (this.f224x) {
            synchronized (this) {
                if (this.f206f) {
                    return;
                }
                this.f206f = true;
                this.f224x.m293j(this.f204d, i2, AbstractC1302b.f5337a);
            }
        }
    }

    /* renamed from: k */
    public final synchronized void m264k(long j2) {
        long j3 = this.f219s + j2;
        this.f219s = j3;
        long j4 = j3 - this.f220t;
        if (j4 >= this.f217q.m241a() / 2) {
            m267n(0, j4);
            this.f220t += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f224x.f273b);
        r6 = r2;
        r8.f221u += r6;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m265l(int r9, boolean r10, p026J1.C0239g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            C1.z r12 = r8.f224x
            r12.m291h(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f221u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f222v     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f202b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            C1.z r4 = r8.f224x     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f273b     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f221u     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f221u = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            C1.z r4 = r8.f224x
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.m291h(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007C1.C0077q.m265l(int, boolean, J1.g, long):void");
    }

    /* renamed from: m */
    public final void m266m(int i2, int i3) {
        AbstractC0044g.m158j("errorCode", i3);
        this.f208h.m3026c(new C0074n(this.f203c + '[' + i2 + "] writeSynReset", this, i2, i3, 1), 0L);
    }

    /* renamed from: n */
    public final void m267n(int i2, long j2) {
        this.f208h.m3026c(new C0076p(this.f203c + '[' + i2 + "] windowUpdate", this, i2, j2), 0L);
    }
}
