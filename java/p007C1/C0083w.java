package p007C1;

import java.io.IOException;
import p005C.AbstractC0044g;
import p026J1.C0239g;
import p026J1.C0256x;
import p026J1.InterfaceC0254v;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;

/* renamed from: C1.w */
/* loaded from: classes.dex */
public final class C0083w implements InterfaceC0254v {

    /* renamed from: a */
    public final C0239g f249a = new C0239g();

    /* renamed from: b */
    public final C0239g f250b = new C0239g();

    /* renamed from: c */
    public boolean f251c;

    /* renamed from: d */
    public final long f252d;

    /* renamed from: e */
    public boolean f253e;

    /* renamed from: f */
    public final /* synthetic */ C0085y f254f;

    public C0083w(C0085y c0085y, long j2, boolean z2) {
        this.f254f = c0085y;
        this.f252d = j2;
        this.f253e = z2;
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: a */
    public final C0256x mo100a() {
        return this.f254f.f265i;
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: c */
    public final long mo101c(C0239g c0239g, long j2) {
        int i2;
        Throwable th;
        long j3;
        long j4;
        boolean z2;
        int i3;
        AbstractC1136c.m2637e(c0239g, "sink");
        long j5 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        while (true) {
            synchronized (this.f254f) {
                this.f254f.f265i.m653i();
                try {
                    C0085y c0085y = this.f254f;
                    synchronized (c0085y) {
                        i2 = c0085y.f267k;
                    }
                    if (i2 != 0) {
                        th = this.f254f.f268l;
                        if (th == null) {
                            C0085y c0085y2 = this.f254f;
                            synchronized (c0085y2) {
                                i3 = c0085y2.f267k;
                            }
                            AbstractC0044g.m157i(i3);
                            th = new C0060E(i3);
                        }
                    } else {
                        th = null;
                    }
                    if (this.f251c) {
                        throw new IOException("stream closed");
                    }
                    C0239g c0239g2 = this.f250b;
                    long j6 = c0239g2.f715b;
                    if (j6 > j5) {
                        j4 = c0239g2.mo101c(c0239g, Math.min(j2, j6));
                        C0085y c0085y3 = this.f254f;
                        long j7 = c0085y3.f257a + j4;
                        c0085y3.f257a = j7;
                        j3 = -1;
                        long j8 = j7 - c0085y3.f258b;
                        if (th == null && j8 >= c0085y3.f270n.f217q.m241a() / 2) {
                            C0085y c0085y4 = this.f254f;
                            c0085y4.f270n.m267n(c0085y4.f269m, j8);
                            C0085y c0085y5 = this.f254f;
                            c0085y5.f258b = c0085y5.f257a;
                        }
                    } else {
                        j3 = -1;
                        if (this.f253e || th != null) {
                            j4 = -1;
                        } else {
                            this.f254f.m289k();
                            z2 = true;
                            j4 = -1;
                        }
                    }
                    z2 = false;
                } finally {
                    this.f254f.f265i.m277l();
                }
            }
            if (!z2) {
                if (j4 != j3) {
                    m275g(j4);
                    return j4;
                }
                if (th == null) {
                    return j3;
                }
                throw th;
            }
            j5 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        synchronized (this.f254f) {
            this.f251c = true;
            C0239g c0239g = this.f250b;
            j2 = c0239g.f715b;
            c0239g.m678s(j2);
            C0085y c0085y = this.f254f;
            if (c0085y == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
            c0085y.notifyAll();
        }
        if (j2 > 0) {
            m275g(j2);
        }
        this.f254f.m279a();
    }

    /* renamed from: g */
    public final void m275g(long j2) {
        byte[] bArr = AbstractC1302b.f5337a;
        this.f254f.f270n.m264k(j2);
    }
}
