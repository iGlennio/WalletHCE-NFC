package p043P0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import p027K.AbstractC0259C;
import p027K.AbstractC0272P;
import p030L.AccessibilityManagerTouchExplorationStateChangeListenerC0335b;
import p042P.C0400b;
import p086i.ViewOnKeyListenerC0894D;
import p086i.ViewOnKeyListenerC0901f;

/* renamed from: P0.n */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0420n implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f1108a;

    /* renamed from: b */
    public final /* synthetic */ Object f1109b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0420n(int i2, Object obj) {
        this.f1108a = i2;
        this.f1109b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f1109b;
        switch (this.f1108a) {
            case 0:
                C0422p c0422p = (C0422p) obj;
                if (c0422p.f1134u != null && (accessibilityManager = c0422p.f1133t) != null) {
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    if (c0422p.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0335b(c0422p.f1134u));
                        break;
                    }
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                AbstractC0259C.m739c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1108a) {
            case 0:
                C0422p c0422p = (C0422p) this.f1109b;
                C0400b c0400b = c0422p.f1134u;
                if (c0400b != null && (accessibilityManager = c0422p.f1133t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0335b(c0400b));
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                ViewOnKeyListenerC0901f viewOnKeyListenerC0901f = (ViewOnKeyListenerC0901f) this.f1109b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0901f.f3645x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0901f.f3645x = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0901f.f3645x.removeGlobalOnLayoutListener(viewOnKeyListenerC0901f.f3630i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0894D viewOnKeyListenerC0894D = (ViewOnKeyListenerC0894D) this.f1109b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0894D.f3590o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0894D.f3590o = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0894D.f3590o.removeGlobalOnLayoutListener(viewOnKeyListenerC0894D.f3584i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    /* renamed from: a */
    private final void m1086a(View view) {
    }

    /* renamed from: b */
    private final void m1087b(View view) {
    }

    /* renamed from: c */
    private final void m1088c(View view) {
    }
}
