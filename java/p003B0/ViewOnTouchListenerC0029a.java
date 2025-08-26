package p003B0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: B0.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0029a implements View.OnTouchListener {

    /* renamed from: a */
    public final Dialog f74a;

    /* renamed from: b */
    public final int f75b;

    /* renamed from: c */
    public final int f76c;

    /* renamed from: d */
    public final int f77d;

    public ViewOnTouchListenerC0029a(Dialog dialog, Rect rect) {
        this.f74a = dialog;
        this.f75b = rect.left;
        this.f76c = rect.top;
        this.f77d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f75b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f76c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.f77d;
            obtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f74a.onTouchEvent(obtain);
    }
}
