package p026J1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p095l1.AbstractC1136c;

/* renamed from: J1.x */
/* loaded from: classes.dex */
public class C0256x {

    /* renamed from: d */
    public static final C0255w f751d = new C0255w();

    /* renamed from: a */
    public boolean f752a;

    /* renamed from: b */
    public long f753b;

    /* renamed from: c */
    public long f754c;

    /* renamed from: a */
    public C0256x mo697a() {
        this.f752a = false;
        return this;
    }

    /* renamed from: b */
    public C0256x mo698b() {
        this.f754c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo699c() {
        if (this.f752a) {
            return this.f753b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C0256x mo700d(long j2) {
        this.f752a = true;
        this.f753b = j2;
        return this;
    }

    /* renamed from: e */
    public boolean mo701e() {
        return this.f752a;
    }

    /* renamed from: f */
    public void mo702f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f752a && this.f753b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C0256x mo703g(long j2, TimeUnit timeUnit) {
        AbstractC1136c.m2637e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f754c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }

    /* renamed from: h */
    public long mo704h() {
        return this.f754c;
    }
}
