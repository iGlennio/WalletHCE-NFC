package p027K;

import android.view.animation.Interpolator;

/* renamed from: K.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC0291e0 {

    /* renamed from: a */
    public final int f801a;

    /* renamed from: b */
    public float f802b;

    /* renamed from: c */
    public final Interpolator f803c;

    /* renamed from: d */
    public final long f804d;

    public AbstractC0291e0(int i2, Interpolator interpolator, long j2) {
        this.f801a = i2;
        this.f803c = interpolator;
        this.f804d = j2;
    }

    /* renamed from: a */
    public long mo861a() {
        return this.f804d;
    }

    /* renamed from: b */
    public float mo862b() {
        Interpolator interpolator = this.f803c;
        return interpolator != null ? interpolator.getInterpolation(this.f802b) : this.f802b;
    }

    /* renamed from: c */
    public int mo863c() {
        return this.f801a;
    }

    /* renamed from: d */
    public void mo864d(float f) {
        this.f802b = f;
    }
}
