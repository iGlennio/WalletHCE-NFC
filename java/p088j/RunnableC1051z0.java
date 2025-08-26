package p088j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: j.z0 */
/* loaded from: classes.dex */
public final class RunnableC1051z0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4124a;

    /* renamed from: b */
    public final /* synthetic */ AbstractViewOnTouchListenerC0924A0 f4125b;

    public /* synthetic */ RunnableC1051z0(AbstractViewOnTouchListenerC0924A0 abstractViewOnTouchListenerC0924A0, int i2) {
        this.f4124a = i2;
        this.f4125b = abstractViewOnTouchListenerC0924A0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4124a) {
            case 0:
                ViewParent parent = this.f4125b.f3749d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0924A0 abstractViewOnTouchListenerC0924A0 = this.f4125b;
                abstractViewOnTouchListenerC0924A0.m2375a();
                View view = abstractViewOnTouchListenerC0924A0.f3749d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0924A0.mo2330c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0924A0.f3752g = true;
                    break;
                }
                break;
        }
    }
}
