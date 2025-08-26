package p027K;

import android.view.VelocityTracker;

/* renamed from: K.v */
/* loaded from: classes.dex */
public abstract class AbstractC0324v {
    /* renamed from: a */
    public static float m946a(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    /* renamed from: b */
    public static float m947b(VelocityTracker velocityTracker, int i2, int i3) {
        return velocityTracker.getAxisVelocity(i2, i3);
    }

    /* renamed from: c */
    public static boolean m948c(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.isAxisSupported(i2);
    }
}
