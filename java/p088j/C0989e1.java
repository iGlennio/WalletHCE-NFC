package p088j;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: j.e1 */
/* loaded from: classes.dex */
public final class C0989e1 extends TouchDelegate {

    /* renamed from: a */
    public final View f3907a;

    /* renamed from: b */
    public final Rect f3908b;

    /* renamed from: c */
    public final Rect f3909c;

    /* renamed from: d */
    public final Rect f3910d;

    /* renamed from: e */
    public final int f3911e;

    /* renamed from: f */
    public boolean f3912f;

    public C0989e1(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3911e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f3908b = rect3;
        Rect rect4 = new Rect();
        this.f3910d = rect4;
        Rect rect5 = new Rect();
        this.f3909c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f3907a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z3 = this.f3912f;
                if (z3 && !this.f3910d.contains(x2, y2)) {
                    z4 = z3;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z3 = this.f3912f;
                    this.f3912f = false;
                }
                z2 = true;
                z4 = false;
            }
            z4 = z3;
            z2 = true;
        } else {
            if (this.f3908b.contains(x2, y2)) {
                this.f3912f = true;
                z2 = true;
            }
            z2 = true;
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        Rect rect = this.f3909c;
        View view = this.f3907a;
        if (!z2 || rect.contains(x2, y2)) {
            motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
