package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.nfupay.s145.R;
import p027K.C0284b;
import p030L.C0337d;
import p030L.C0341h;
import p030L.C0342i;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public final class C0727c extends C0284b {

    /* renamed from: d */
    public final /* synthetic */ ClockFaceView f2903d;

    public C0727c(ClockFaceView clockFaceView) {
        this.f2903d = clockFaceView;
    }

    @Override // p027K.C0284b
    /* renamed from: d */
    public final void mo459d(View view, C0342i c0342i) {
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0342i.f893a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2903d.f2885z.get(intValue - 1));
        }
        c0342i.m997j(C0341h.m987a(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c0342i.m990b(C0337d.f879g);
    }

    @Override // p027K.C0284b
    /* renamed from: g */
    public final boolean mo850g(View view, int i2, Bundle bundle) {
        if (i2 != 16) {
            return super.mo850g(view, i2, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2903d;
        view.getHitRect(clockFaceView.f2882w);
        float centerX = clockFaceView.f2882w.centerX();
        float centerY = clockFaceView.f2882w.centerY();
        clockFaceView.f2881v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2881v.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
