package p076e;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p010D1.AbstractC0104l;
import p083h.C0876d;

/* renamed from: e.s */
/* loaded from: classes.dex */
public final class C0795s extends ContentFrameLayout {

    /* renamed from: i */
    public final /* synthetic */ LayoutInflaterFactory2C0797u f3114i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0795s(LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u, C0876d c0876d) {
        super(c0876d, null);
        this.f3114i = layoutInflaterFactory2C0797u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f3114i.m2144u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = this.f3114i;
                layoutInflaterFactory2C0797u.m2143s(layoutInflaterFactory2C0797u.m2149z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(AbstractC0104l.m415w(getContext(), i2));
    }
}
