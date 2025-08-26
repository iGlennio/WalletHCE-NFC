package p133z;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import p018H.RunnableC0181a;

/* renamed from: z.a */
/* loaded from: classes.dex */
public final class C1324a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Object f5423a;

    /* renamed from: b */
    public Activity f5424b;

    /* renamed from: c */
    public final int f5425c;

    /* renamed from: d */
    public boolean f5426d = false;

    /* renamed from: e */
    public boolean f5427e = false;

    /* renamed from: f */
    public boolean f5428f = false;

    public C1324a(Activity activity) {
        this.f5424b = activity;
        this.f5425c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f5424b == activity) {
            this.f5424b = null;
            this.f5427e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f5427e || this.f5428f || this.f5426d) {
            return;
        }
        Object obj = this.f5423a;
        try {
            Object obj2 = AbstractC1325b.f5431c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f5425c) {
                AbstractC1325b.f5435g.postAtFrontOfQueue(new RunnableC0181a(AbstractC1325b.f5430b.get(activity), 9, obj2));
                this.f5428f = true;
                this.f5423a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f5424b == activity) {
            this.f5426d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
