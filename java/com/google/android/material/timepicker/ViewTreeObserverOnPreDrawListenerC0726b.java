package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0726b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ ClockFaceView f2902a;

    public ViewTreeObserverOnPreDrawListenerC0726b(ClockFaceView clockFaceView) {
        this.f2902a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2902a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2881v.f2889d) - clockFaceView.f2874D;
        if (height != clockFaceView.f2905t) {
            clockFaceView.f2905t = height;
            clockFaceView.mo2008m();
            int i2 = clockFaceView.f2905t;
            ClockHandView clockHandView = clockFaceView.f2881v;
            clockHandView.f2897l = i2;
            clockHandView.invalidate();
        }
        return true;
    }
}
