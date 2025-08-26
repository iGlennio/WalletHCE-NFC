package p026J1;

import java.util.concurrent.TimeUnit;
import p095l1.AbstractC1136c;

/* renamed from: J1.e */
/* loaded from: classes.dex */
public class C0237e extends C0256x {

    /* renamed from: h */
    public static final long f701h;

    /* renamed from: i */
    public static final long f702i;

    /* renamed from: j */
    public static C0237e f703j;

    /* renamed from: e */
    public boolean f704e;

    /* renamed from: f */
    public C0237e f705f;

    /* renamed from: g */
    public long f706g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f701h = millis;
        f702i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: i */
    public final void m653i() {
        C0237e c0237e;
        if (this.f704e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long j2 = this.f754c;
        boolean z2 = this.f752a;
        if (j2 != 0 || z2) {
            this.f704e = true;
            synchronized (C0237e.class) {
                try {
                    if (f703j == null) {
                        f703j = new C0237e();
                        C0234b c0234b = new C0234b("Okio Watchdog");
                        c0234b.setDaemon(true);
                        c0234b.start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j2 != 0 && z2) {
                        this.f706g = Math.min(j2, mo699c() - nanoTime) + nanoTime;
                    } else if (j2 != 0) {
                        this.f706g = j2 + nanoTime;
                    } else {
                        if (!z2) {
                            throw new AssertionError();
                        }
                        this.f706g = mo699c();
                    }
                    long j3 = this.f706g - nanoTime;
                    C0237e c0237e2 = f703j;
                    AbstractC1136c.m2634b(c0237e2);
                    while (true) {
                        c0237e = c0237e2.f705f;
                        if (c0237e == null || j3 < c0237e.f706g - nanoTime) {
                            break;
                        } else {
                            c0237e2 = c0237e;
                        }
                    }
                    this.f705f = c0237e;
                    c0237e2.f705f = this;
                    if (c0237e2 == f703j) {
                        C0237e.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean m654j() {
        if (!this.f704e) {
            return false;
        }
        this.f704e = false;
        synchronized (C0237e.class) {
            C0237e c0237e = f703j;
            while (c0237e != null) {
                C0237e c0237e2 = c0237e.f705f;
                if (c0237e2 == this) {
                    c0237e.f705f = this.f705f;
                    this.f705f = null;
                    return false;
                }
                c0237e = c0237e2;
            }
            return true;
        }
    }

    /* renamed from: k */
    public void mo276k() {
    }
}
