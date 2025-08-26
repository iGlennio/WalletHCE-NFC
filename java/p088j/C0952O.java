package p088j;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p019H0.ViewTreeObserverOnGlobalLayoutListenerC0199e;

/* renamed from: j.O */
/* loaded from: classes.dex */
public final class C0952O implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0199e f3830a;

    /* renamed from: b */
    public final /* synthetic */ C0954P f3831b;

    public C0952O(C0954P c0954p, ViewTreeObserverOnGlobalLayoutListenerC0199e viewTreeObserverOnGlobalLayoutListenerC0199e) {
        this.f3831b = c0954p;
        this.f3830a = viewTreeObserverOnGlobalLayoutListenerC0199e;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3831b.f3840G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3830a);
        }
    }
}
