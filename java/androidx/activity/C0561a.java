package androidx.activity;

import android.window.BackEvent;
import p095l1.AbstractC1136c;

/* renamed from: androidx.activity.a */
/* loaded from: classes.dex */
public final class C0561a {

    /* renamed from: a */
    public static final C0561a f1561a = new C0561a();

    /* renamed from: a */
    public final BackEvent m1349a(float f, float f2, float f3, int i2) {
        return new BackEvent(f, f2, f3, i2);
    }

    /* renamed from: b */
    public final float m1350b(BackEvent backEvent) {
        AbstractC1136c.m2637e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* renamed from: c */
    public final int m1351c(BackEvent backEvent) {
        AbstractC1136c.m2637e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* renamed from: d */
    public final float m1352d(BackEvent backEvent) {
        AbstractC1136c.m2637e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* renamed from: e */
    public final float m1353e(BackEvent backEvent) {
        AbstractC1136c.m2637e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
