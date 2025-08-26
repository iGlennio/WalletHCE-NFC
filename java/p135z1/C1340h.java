package p135z1;

import androidx.emoji2.text.C0605s;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A1.C0002a;
import p001A1.C0003b;
import p001A1.C0008g;
import p001A1.InterfaceC0006e;
import p007C1.C0084x;
import p010D1.C0106n;
import p075d1.AbstractC0763o;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p123v1.C1283m;
import p123v1.C1287q;
import p123v1.C1290t;
import p123v1.InterfaceC1274d;
import p126w1.AbstractC1302b;
import p129x1.C1316b;
import p132y1.C1322b;

/* renamed from: z1.h */
/* loaded from: classes.dex */
public final class C1340h implements Cloneable {

    /* renamed from: a */
    public final C1345m f5532a;

    /* renamed from: b */
    public final C0084x f5533b;

    /* renamed from: c */
    public final AtomicBoolean f5534c;

    /* renamed from: d */
    public Object f5535d;

    /* renamed from: e */
    public C1337e f5536e;

    /* renamed from: f */
    public C1344l f5537f;

    /* renamed from: g */
    public boolean f5538g;

    /* renamed from: h */
    public C0605s f5539h;

    /* renamed from: i */
    public boolean f5540i;

    /* renamed from: j */
    public boolean f5541j;

    /* renamed from: k */
    public boolean f5542k;

    /* renamed from: l */
    public volatile boolean f5543l;

    /* renamed from: m */
    public volatile C0605s f5544m;

    /* renamed from: n */
    public volatile C1344l f5545n;

    /* renamed from: o */
    public final C1287q f5546o;

    /* renamed from: p */
    public final C1032t f5547p;

    /* renamed from: q */
    public final boolean f5548q;

    public C1340h(C1287q c1287q, C1032t c1032t, boolean z2) {
        AbstractC1136c.m2637e(c1287q, "client");
        this.f5546o = c1287q;
        this.f5547p = c1032t;
        this.f5548q = z2;
        this.f5532a = (C1345m) c1287q.f5235b.f3904b;
        c1287q.f5238e.getClass();
        C0084x c0084x = new C0084x(2, this);
        c0084x.mo703g(0, TimeUnit.MILLISECONDS);
        this.f5533b = c0084x;
        this.f5534c = new AtomicBoolean();
        this.f5542k = true;
    }

    /* renamed from: a */
    public static final String m3084a(C1340h c1340h) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1340h.f5543l ? "canceled " : "");
        sb.append(c1340h.f5548q ? "web socket" : "call");
        sb.append(" to ");
        sb.append(((C1283m) c1340h.f5547p.f4045c).m2976f());
        return sb.toString();
    }

    /* renamed from: b */
    public final void m3085b(C1344l c1344l) {
        byte[] bArr = AbstractC1302b.f5337a;
        if (this.f5537f != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f5537f = c1344l;
        c1344l.f5569o.add(new C1339g(this, this.f5535d));
    }

    /* renamed from: c */
    public final IOException m3086c(IOException iOException) {
        IOException iOException2;
        Socket m3093j;
        byte[] bArr = AbstractC1302b.f5337a;
        C1344l c1344l = this.f5537f;
        if (c1344l != null) {
            synchronized (c1344l) {
                m3093j = m3093j();
            }
            if (this.f5537f == null) {
                if (m3093j != null) {
                    AbstractC1302b.m2995d(m3093j);
                }
            } else if (m3093j != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f5538g && this.f5533b.m654j()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            AbstractC1136c.m2634b(iOException2);
        }
        return iOException2;
    }

    public final Object clone() {
        return new C1340h(this.f5546o, this.f5547p, this.f5548q);
    }

    /* renamed from: d */
    public final void m3087d() {
        Socket socket;
        if (this.f5543l) {
            return;
        }
        this.f5543l = true;
        C0605s c0605s = this.f5544m;
        if (c0605s != null) {
            ((InterfaceC0006e) c0605s.f2014d).cancel();
        }
        C1344l c1344l = this.f5545n;
        if (c1344l == null || (socket = c1344l.f5556b) == null) {
            return;
        }
        AbstractC1302b.m2995d(socket);
    }

    /* renamed from: e */
    public final void m3088e(InterfaceC1274d interfaceC1274d) {
        RunnableC1338f runnableC1338f;
        if (!this.f5534c.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        C0106n c0106n = C0106n.f319a;
        this.f5535d = C0106n.f319a.mo321g();
        C0605s c0605s = this.f5546o.f5234a;
        RunnableC1338f runnableC1338f2 = new RunnableC1338f(this, interfaceC1274d);
        c0605s.getClass();
        synchronized (c0605s) {
            ((ArrayDeque) c0605s.f2012b).add(runnableC1338f2);
            if (!this.f5548q) {
                String str = ((C1283m) this.f5547p.f4045c).f5195e;
                Iterator it = ((ArrayDeque) c0605s.f2013c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) c0605s.f2012b).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                runnableC1338f = null;
                                break;
                            } else {
                                runnableC1338f = (RunnableC1338f) it2.next();
                                if (AbstractC1136c.m2633a(((C1283m) runnableC1338f.f5530c.f5547p.f4045c).f5195e, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        runnableC1338f = (RunnableC1338f) it.next();
                        if (AbstractC1136c.m2633a(((C1283m) runnableC1338f.f5530c.f5547p.f4045c).f5195e, str)) {
                            break;
                        }
                    }
                }
                if (runnableC1338f != null) {
                    runnableC1338f2.f5528a = runnableC1338f.f5528a;
                }
            }
        }
        c0605s.m1546h();
    }

    /* renamed from: f */
    public final void m3089f(boolean z2) {
        C0605s c0605s;
        synchronized (this) {
            if (!this.f5542k) {
                throw new IllegalStateException("released");
            }
        }
        if (z2 && (c0605s = this.f5544m) != null) {
            ((InterfaceC0006e) c0605s.f2014d).cancel();
            ((C1340h) c0605s.f2012b).m3091h(c0605s, true, true, null);
        }
        this.f5539h = null;
    }

    /* renamed from: g */
    public final C1290t m3090g() {
        ArrayList arrayList = new ArrayList();
        AbstractC0763o.m2058Y(arrayList, this.f5546o.f5236c);
        arrayList.add(new C0002a(this.f5546o));
        arrayList.add(new C0002a(this.f5546o.f5243j));
        this.f5546o.getClass();
        arrayList.add(new C1316b());
        arrayList.add(C1333a.f5501a);
        if (!this.f5548q) {
            AbstractC0763o.m2058Y(arrayList, this.f5546o.f5237d);
        }
        arrayList.add(new C0003b(this.f5548q));
        C1032t c1032t = this.f5547p;
        C1287q c1287q = this.f5546o;
        try {
            try {
                C1290t m21b = new C0008g(this, arrayList, 0, null, c1032t, c1287q.f5255v, c1287q.f5256w, c1287q.f5257x).m21b(this.f5547p);
                if (this.f5543l) {
                    AbstractC1302b.m2994c(m21b);
                    throw new IOException("Canceled");
                }
                m3092i(null);
                return m21b;
            } catch (IOException e2) {
                IOException m3092i = m3092i(e2);
                if (m3092i == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw m3092i;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                m3092i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:48:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001c), top: B:47:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException m3091h(androidx.emoji2.text.C0605s r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            p095l1.AbstractC1136c.m2637e(r3, r0)
            androidx.emoji2.text.s r0 = r2.f5544m
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Le
            goto L60
        Le:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L1a
            boolean r1 = r2.f5540i     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            goto L1a
        L18:
            r3 = move-exception
            goto L41
        L1a:
            if (r5 == 0) goto L43
            boolean r1 = r2.f5541j     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L43
        L20:
            if (r4 == 0) goto L24
            r2.f5540i = r0     // Catch: java.lang.Throwable -> L18
        L24:
            if (r5 == 0) goto L28
            r2.f5541j = r0     // Catch: java.lang.Throwable -> L18
        L28:
            boolean r4 = r2.f5540i     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            boolean r5 = r2.f5541j     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L32
            r5 = r3
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != 0) goto L3e
            boolean r4 = r2.f5541j     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            boolean r4 = r2.f5542k     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            r0 = r3
        L3e:
            r4 = r0
            r0 = r5
            goto L44
        L41:
            monitor-exit(r2)
            throw r3
        L43:
            r4 = r0
        L44:
            monitor-exit(r2)
            if (r0 == 0) goto L59
            r5 = 0
            r2.f5544m = r5
            z1.l r5 = r2.f5537f
            if (r5 == 0) goto L59
            monitor-enter(r5)
            int r0 = r5.f5566l     // Catch: java.lang.Throwable -> L56
            int r0 = r0 + r3
            r5.f5566l = r0     // Catch: java.lang.Throwable -> L56
            monitor-exit(r5)
            goto L59
        L56:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L56
            throw r3
        L59:
            if (r4 == 0) goto L60
            java.io.IOException r3 = r2.m3086c(r6)
            return r3
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p135z1.C1340h.m3091h(androidx.emoji2.text.s, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: i */
    public final IOException m3092i(IOException iOException) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.f5542k) {
                this.f5542k = false;
                if (!this.f5540i) {
                    if (!this.f5541j) {
                        z2 = true;
                    }
                }
            }
        }
        return z2 ? m3086c(iOException) : iOException;
    }

    /* renamed from: j */
    public final Socket m3093j() {
        C1344l c1344l = this.f5537f;
        AbstractC1136c.m2634b(c1344l);
        byte[] bArr = AbstractC1302b.f5337a;
        ArrayList arrayList = c1344l.f5569o;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (AbstractC1136c.m2633a((C1340h) ((Reference) it.next()).get(), this)) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i2);
        this.f5537f = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c1344l.f5570p = System.nanoTime();
        C1345m c1345m = this.f5532a;
        c1345m.getClass();
        byte[] bArr2 = AbstractC1302b.f5337a;
        boolean z2 = c1344l.f5563i;
        C1322b c1322b = c1345m.f5573b;
        if (!z2) {
            c1322b.m3026c(c1345m.f5574c, 0L);
            return null;
        }
        c1344l.f5563i = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = c1345m.f5575d;
        concurrentLinkedQueue.remove(c1344l);
        if (concurrentLinkedQueue.isEmpty()) {
            c1322b.m3024a();
        }
        Socket socket = c1344l.f5557c;
        AbstractC1136c.m2634b(socket);
        return socket;
    }
}
