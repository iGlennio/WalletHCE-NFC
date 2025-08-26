package p090k;

import java.util.concurrent.Executors;
import p047Q1.AbstractC0458e;

/* renamed from: k.a */
/* loaded from: classes.dex */
public final class C1085a extends AbstractC0458e {

    /* renamed from: i */
    public static volatile C1085a f4224i;

    /* renamed from: h */
    public final Object f4225h;

    public C1085a(int i2) {
        switch (i2) {
            case 1:
                this.f4225h = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1086b());
                break;
            default:
                this.f4225h = new C1085a(1);
                break;
        }
    }

    /* renamed from: e0 */
    public static C1085a m2613e0() {
        if (f4224i != null) {
            return f4224i;
        }
        synchronized (C1085a.class) {
            try {
                if (f4224i == null) {
                    f4224i = new C1085a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4224i;
    }
}
