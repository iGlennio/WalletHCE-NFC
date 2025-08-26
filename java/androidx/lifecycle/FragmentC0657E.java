package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p005C.C0046i;
import p095l1.AbstractC1136c;

/* renamed from: androidx.lifecycle.E */
/* loaded from: classes.dex */
public class FragmentC0657E extends Fragment {

    /* renamed from: b */
    public static final /* synthetic */ int f2284b = 0;

    /* renamed from: a */
    public C0046i f2285a;

    /* renamed from: androidx.lifecycle.E$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0656D Companion = new C0656D();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC1136c.m2637e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC1136c.m2637e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC1136c.m2637e(activity, "activity");
            int i2 = FragmentC0657E.f2284b;
            AbstractC0655C.m1688a(activity, EnumC0677l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
            int i2 = FragmentC0657E.f2284b;
            AbstractC0655C.m1688a(activity, EnumC0677l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
            int i2 = FragmentC0657E.f2284b;
            AbstractC0655C.m1688a(activity, EnumC0677l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
            int i2 = FragmentC0657E.f2284b;
            AbstractC0655C.m1688a(activity, EnumC0677l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
            int i2 = FragmentC0657E.f2284b;
            AbstractC0655C.m1688a(activity, EnumC0677l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
            int i2 = FragmentC0657E.f2284b;
            AbstractC0655C.m1688a(activity, EnumC0677l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC1136c.m2637e(activity, "activity");
            AbstractC1136c.m2637e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC1136c.m2637e(activity, "activity");
        }
    }

    /* renamed from: a */
    public final void m1690a(EnumC0677l enumC0677l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC1136c.m2636d(activity, "activity");
            AbstractC0655C.m1688a(activity, enumC0677l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1690a(EnumC0677l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1690a(EnumC0677l.ON_DESTROY);
        this.f2285a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1690a(EnumC0677l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0046i c0046i = this.f2285a;
        if (c0046i != null) {
            ((C0654B) c0046i.f116b).m1687a();
        }
        m1690a(EnumC0677l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0046i c0046i = this.f2285a;
        if (c0046i != null) {
            C0654B c0654b = (C0654B) c0046i.f116b;
            int i2 = c0654b.f2273a + 1;
            c0654b.f2273a = i2;
            if (i2 == 1 && c0654b.f2276d) {
                c0654b.f2278f.m1702d(EnumC0677l.ON_START);
                c0654b.f2276d = false;
            }
        }
        m1690a(EnumC0677l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1690a(EnumC0677l.ON_STOP);
    }
}
