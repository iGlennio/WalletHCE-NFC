package p076e;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p017G0.AbstractC0171c;
import p017G0.C0172d;

/* renamed from: e.o */
/* loaded from: classes.dex */
public abstract class AbstractC0791o {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m2121a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m2122b(Object obj, LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u) {
        Objects.requireNonNull(layoutInflaterFactory2C0797u);
        C0172d c0172d = new C0172d(2, layoutInflaterFactory2C0797u);
        AbstractC0171c.m512f(obj).registerOnBackInvokedCallback(1000000, c0172d);
        return c0172d;
    }

    /* renamed from: c */
    public static void m2123c(Object obj, Object obj2) {
        AbstractC0171c.m512f(obj).unregisterOnBackInvokedCallback(AbstractC0171c.m508b(obj2));
    }
}
