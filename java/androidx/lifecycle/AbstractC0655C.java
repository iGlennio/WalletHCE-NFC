package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.FragmentC0657E;
import p095l1.AbstractC1136c;

/* renamed from: androidx.lifecycle.C */
/* loaded from: classes.dex */
public abstract class AbstractC0655C {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1688a(Activity activity, EnumC0677l enumC0677l) {
        C0685t mo1362d;
        AbstractC1136c.m2637e(enumC0677l, "event");
        if (!(activity instanceof InterfaceC0683r) || (mo1362d = ((InterfaceC0683r) activity).mo1362d()) == null) {
            return;
        }
        mo1362d.m1702d(enumC0677l);
    }

    /* renamed from: b */
    public static void m1689b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0657E.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC0657E.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0657E(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
