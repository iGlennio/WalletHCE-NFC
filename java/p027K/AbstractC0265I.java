package p027K;

import android.view.View;
import com.nfupay.s145.R;
import java.util.Objects;
import p036N.AbstractC0383a;
import p101o.C1161k;

/* renamed from: K.I */
/* loaded from: classes.dex */
public abstract class AbstractC0265I {
    /* renamed from: a */
    public static void m786a(View view, InterfaceC0270N interfaceC0270N) {
        C1161k c1161k = (C1161k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1161k == null) {
            c1161k = new C1161k();
            view.setTag(R.id.tag_unhandled_key_listeners, c1161k);
        }
        Objects.requireNonNull(interfaceC0270N);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0264H = new ViewOnUnhandledKeyEventListenerC0264H();
        c1161k.put(interfaceC0270N, viewOnUnhandledKeyEventListenerC0264H);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0264H);
    }

    /* renamed from: b */
    public static CharSequence m787b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: c */
    public static boolean m788c(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: d */
    public static boolean m789d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: e */
    public static void m790e(View view, InterfaceC0270N interfaceC0270N) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1161k c1161k = (C1161k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1161k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1161k.getOrDefault(interfaceC0270N, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* renamed from: f */
    public static <T> T m791f(View view, int i2) {
        return (T) view.requireViewById(i2);
    }

    /* renamed from: g */
    public static void m792g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    /* renamed from: h */
    public static void m793h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: i */
    public static void m794i(View view, AbstractC0383a abstractC0383a) {
        view.setAutofillId(null);
    }

    /* renamed from: j */
    public static void m795j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
