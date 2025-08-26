package p007C1;

import p026J1.C0239g;
import p026J1.C0256x;
import p026J1.InterfaceC0253u;
import p126w1.AbstractC1302b;

/* renamed from: C1.v */
/* loaded from: classes.dex */
public final class C0082v implements InterfaceC0253u {

    /* renamed from: a */
    public final C0239g f245a = new C0239g();

    /* renamed from: b */
    public boolean f246b;

    /* renamed from: c */
    public final boolean f247c;

    /* renamed from: d */
    public final /* synthetic */ C0085y f248d;

    public C0082v(C0085y c0085y, boolean z2) {
        this.f248d = c0085y;
        this.f247c = z2;
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: a */
    public final C0256x mo103a() {
        return this.f248d.f266j;
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: b */
    public final void mo104b(C0239g c0239g, long j2) {
        byte[] bArr = AbstractC1302b.f5337a;
        C0239g c0239g2 = this.f245a;
        c0239g2.mo104b(c0239g, j2);
        while (c0239g2.f715b >= 16384) {
            m274g(false);
        }
    }

    @Override // p026J1.InterfaceC0253u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i2;
        C0085y c0085y = this.f248d;
        byte[] bArr = AbstractC1302b.f5337a;
        synchronized (c0085y) {
            if (this.f246b) {
                return;
            }
            C0085y c0085y2 = this.f248d;
            synchronized (c0085y2) {
                i2 = c0085y2.f267k;
            }
            boolean z2 = i2 == 0;
            C0085y c0085y3 = this.f248d;
            if (!c0085y3.f264h.f247c) {
                if (this.f245a.f715b > 0) {
                    while (this.f245a.f715b > 0) {
                        m274g(true);
                    }
                } else if (z2) {
                    c0085y3.f270n.m265l(c0085y3.f269m, true, null, 0L);
                }
            }
            synchronized (this.f248d) {
                this.f246b = true;
            }
            this.f248d.f270n.flush();
            this.f248d.m279a();
        }
    }

    @Override // p026J1.InterfaceC0253u, java.io.Flushable
    public final void flush() {
        C0085y c0085y = this.f248d;
        byte[] bArr = AbstractC1302b.f5337a;
        synchronized (c0085y) {
            this.f248d.m280b();
        }
        while (this.f245a.f715b > 0) {
            m274g(false);
            this.f248d.f270n.flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: g */
    public final void m274g(boolean z2) {
        long min;
        C0085y c0085y;
        boolean z3;
        int i2;
        synchronized (this.f248d) {
            this.f248d.f266j.m653i();
            while (true) {
                try {
                    C0085y c0085y2 = this.f248d;
                    if (c0085y2.f259c >= c0085y2.f260d && !this.f247c && !this.f246b) {
                        synchronized (c0085y2) {
                            i2 = c0085y2.f267k;
                        }
                        if (i2 != 0) {
                            break;
                        } else {
                            this.f248d.m289k();
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f248d.f266j.m277l();
            this.f248d.m280b();
            C0085y c0085y3 = this.f248d;
            min = Math.min(c0085y3.f260d - c0085y3.f259c, this.f245a.f715b);
            c0085y = this.f248d;
            c0085y.f259c += min;
            z3 = z2 && min == this.f245a.f715b;
        }
        c0085y.f266j.m653i();
        try {
            C0085y c0085y4 = this.f248d;
            c0085y4.f270n.m265l(c0085y4.f269m, z3, this.f245a, min);
        } finally {
            this.f248d.f266j.m277l();
        }
    }
}
