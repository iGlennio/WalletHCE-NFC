package p120u1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import p018H.C0185e;
import p023I1.C0220d;
import p023I1.C0222f;
import p026J1.C0242j;
import p034M0.C0360e;
import p088j.C0985d0;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p123v1.C1286p;
import p123v1.C1287q;
import p126w1.AbstractC1302b;

/* renamed from: u1.e */
/* loaded from: classes.dex */
public final class C1250e {

    /* renamed from: a */
    public final C1287q f4865a;

    /* renamed from: b */
    public C0222f f4866b;

    /* renamed from: c */
    public final C1032t f4867c;

    /* renamed from: d */
    public final C0985d0 f4868d;

    /* renamed from: e */
    public boolean f4869e;

    /* renamed from: f */
    public final Handler f4870f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public C0985d0 f4871g;

    public C1250e(String str) {
        C1286p c1286p = new C1286p();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC1136c.m2637e(timeUnit, "unit");
        byte[] bArr = AbstractC1302b.f5337a;
        long millis = timeUnit.toMillis(15L);
        if (millis > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("interval".concat(" too large.").toString());
        }
        if (millis == 0) {
            throw new IllegalArgumentException("interval".concat(" too small.").toString());
        }
        c1286p.f5229y = (int) millis;
        c1286p.f5210f = true;
        this.f4865a = new C1287q(c1286p);
        C0185e c0185e = new C0185e();
        c0185e.m572o(str);
        this.f4867c = c0185e.m559b();
        this.f4868d = new C0985d0(6, this);
    }

    /* renamed from: a */
    public static void m2920a(C1250e c1250e, Runnable runnable) {
        c1250e.getClass();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            c1250e.f4870f.post(runnable);
        }
    }

    /* renamed from: b */
    public final void m2921b(String str) {
        C0222f c0222f;
        if (!this.f4869e || (c0222f = this.f4866b) == null) {
            return;
        }
        AbstractC1136c.m2637e(str, "text");
        C0242j c0242j = C0242j.f716d;
        C0242j m1010g = C0360e.m1010g(str);
        synchronized (c0222f) {
            if (!c0222f.f629o && !c0222f.f626l) {
                long j2 = c0222f.f625k;
                byte[] bArr = m1010g.f719c;
                if (bArr.length + j2 > 16777216) {
                    c0222f.m620b(null, 1001);
                    return;
                }
                c0222f.f625k = j2 + bArr.length;
                c0222f.f624j.add(new C0220d(m1010g));
                c0222f.m624f();
            }
        }
    }
}
