package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p095l1.AbstractC1136c;

/* renamed from: androidx.lifecycle.A */
/* loaded from: classes.dex */
public final class C0653A extends AbstractC0671f {
    final /* synthetic */ C0654B this$0;

    /* renamed from: androidx.lifecycle.A$a */
    public static final class a extends AbstractC0671f {
        final /* synthetic */ C0654B this$0;

        public a(C0654B c0654b) {
            this.this$0 = c0654b;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
            this.this$0.m1687a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
            C0654B c0654b = this.this$0;
            int i2 = c0654b.f2273a + 1;
            c0654b.f2273a = i2;
            if (i2 == 1 && c0654b.f2276d) {
                c0654b.f2278f.m1702d(EnumC0677l.ON_START);
                c0654b.f2276d = false;
            }
        }
    }

    public C0653A(C0654B c0654b) {
        this.this$0 = c0654b;
    }

    @Override // androidx.lifecycle.AbstractC0671f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1136c.m2637e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = FragmentC0657E.f2284b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC1136c.m2635c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC0657E) findFragmentByTag).f2285a = this.this$0.f2280h;
        }
    }

    @Override // androidx.lifecycle.AbstractC0671f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC1136c.m2637e(activity, "activity");
        C0654B c0654b = this.this$0;
        int i2 = c0654b.f2274b - 1;
        c0654b.f2274b = i2;
        if (i2 == 0) {
            Handler handler = c0654b.f2277e;
            AbstractC1136c.m2634b(handler);
            handler.postDelayed(c0654b.f2279g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC1136c.m2637e(activity, "activity");
        AbstractC0691z.m1715a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0671f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC1136c.m2637e(activity, "activity");
        C0654B c0654b = this.this$0;
        int i2 = c0654b.f2273a - 1;
        c0654b.f2273a = i2;
        if (i2 == 0 && c0654b.f2275c) {
            c0654b.f2278f.m1702d(EnumC0677l.ON_STOP);
            c0654b.f2276d = true;
        }
    }
}
