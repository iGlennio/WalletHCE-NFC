package p135z1;

import androidx.emoji2.text.C0605s;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p010D1.C0106n;
import p047Q1.AbstractC0458e;
import p095l1.AbstractC1136c;
import p123v1.C1283m;
import p123v1.InterfaceC1274d;

/* renamed from: z1.f */
/* loaded from: classes.dex */
public final class RunnableC1338f implements Runnable {

    /* renamed from: a */
    public volatile AtomicInteger f5528a = new AtomicInteger(0);

    /* renamed from: b */
    public final InterfaceC1274d f5529b;

    /* renamed from: c */
    public final /* synthetic */ C1340h f5530c;

    public RunnableC1338f(C1340h c1340h, InterfaceC1274d interfaceC1274d) {
        this.f5530c = c1340h;
        this.f5529b = interfaceC1274d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0605s c0605s;
        String concat = "OkHttp ".concat(((C1283m) this.f5530c.f5547p.f4045c).m2976f());
        Thread currentThread = Thread.currentThread();
        AbstractC1136c.m2636d(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            this.f5530c.f5533b.m653i();
            boolean z2 = false;
            try {
                try {
                    try {
                        this.f5529b.mo61b(this.f5530c, this.f5530c.m3090g());
                        c0605s = this.f5530c.f5546o.f5234a;
                    } catch (IOException e2) {
                        e = e2;
                        z2 = true;
                        if (z2) {
                            C0106n c0106n = C0106n.f319a;
                            C0106n c0106n2 = C0106n.f319a;
                            String str = "Callback failure for " + C1340h.m3084a(this.f5530c);
                            c0106n2.getClass();
                            C0106n.m436i(str, 4, e);
                        } else {
                            this.f5529b.mo62c(this.f5530c, e);
                        }
                        c0605s = this.f5530c.f5546o.f5234a;
                        c0605s.m1541c(this);
                    } catch (Throwable th) {
                        th = th;
                        z2 = true;
                        this.f5530c.m3087d();
                        if (!z2) {
                            IOException iOException = new IOException("canceled due to " + th);
                            AbstractC0458e.m1188f(iOException, th);
                            this.f5529b.mo62c(this.f5530c, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                }
                c0605s.m1541c(this);
            } catch (Throwable th3) {
                this.f5530c.f5546o.f5234a.m1541c(this);
                throw th3;
            }
        } finally {
            currentThread.setName(name);
        }
    }
}
