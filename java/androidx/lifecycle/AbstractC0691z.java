package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import p095l1.AbstractC1136c;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public abstract class AbstractC0691z {
    /* renamed from: a */
    public static final void m1715a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC1136c.m2637e(activity, "activity");
        AbstractC1136c.m2637e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
