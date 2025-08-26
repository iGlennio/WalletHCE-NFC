package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p075d1.C0765q;
import p084h0.C0887a;
import p084h0.InterfaceC0888b;
import p095l1.AbstractC1136c;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0888b {
    @Override // p084h0.InterfaceC0888b
    /* renamed from: a */
    public final List mo1506a() {
        return C0765q.f2996a;
    }

    @Override // p084h0.InterfaceC0888b
    /* renamed from: b */
    public final Object mo1507b(Context context) {
        AbstractC1136c.m2637e(context, "context");
        C0887a m2305c = C0887a.m2305c(context);
        AbstractC1136c.m2636d(m2305c, "getInstance(context)");
        if (!m2305c.f3573b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0680o.f2320a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC1136c.m2635c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0679n());
        }
        C0654B c0654b = C0654B.f2272i;
        c0654b.getClass();
        c0654b.f2277e = new Handler();
        c0654b.f2278f.m1702d(EnumC0677l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC1136c.m2635c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0653A(c0654b));
        return c0654b;
    }
}
