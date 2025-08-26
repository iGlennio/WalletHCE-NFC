package p088j;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p017G0.C0172d;

/* renamed from: j.n1 */
/* loaded from: classes.dex */
public abstract class AbstractC1016n1 {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2502a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m2503b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0172d(3, runnable);
    }

    /* renamed from: c */
    public static void m2504c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: d */
    public static void m2505d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
