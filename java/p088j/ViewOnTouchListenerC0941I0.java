package p088j;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: j.I0 */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0941I0 implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C0943J0 f3795a;

    public ViewOnTouchListenerC0941I0(C0943J0 c0943j0) {
        this.f3795a = c0943j0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0926B c0926b;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        C0943J0 c0943j0 = this.f3795a;
        if (action == 0 && (c0926b = c0943j0.f3823z) != null && c0926b.isShowing() && x2 >= 0 && x2 < c0943j0.f3823z.getWidth() && y2 >= 0 && y2 < c0943j0.f3823z.getHeight()) {
            c0943j0.f3819v.postDelayed(c0943j0.f3815r, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        c0943j0.f3819v.removeCallbacks(c0943j0.f3815r);
        return false;
    }
}
