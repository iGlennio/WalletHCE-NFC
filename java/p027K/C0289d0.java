package p027K;

import android.view.WindowInsetsAnimation;

/* renamed from: K.d0 */
/* loaded from: classes.dex */
public final class C0289d0 extends AbstractC0291e0 {

    /* renamed from: e */
    public final WindowInsetsAnimation f800e;

    public C0289d0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f800e = windowInsetsAnimation;
    }

    @Override // p027K.AbstractC0291e0
    /* renamed from: a */
    public final long mo861a() {
        long durationMillis;
        durationMillis = this.f800e.getDurationMillis();
        return durationMillis;
    }

    @Override // p027K.AbstractC0291e0
    /* renamed from: b */
    public final float mo862b() {
        float interpolatedFraction;
        interpolatedFraction = this.f800e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // p027K.AbstractC0291e0
    /* renamed from: c */
    public final int mo863c() {
        int typeMask;
        typeMask = this.f800e.getTypeMask();
        return typeMask;
    }

    @Override // p027K.AbstractC0291e0
    /* renamed from: d */
    public final void mo864d(float f) {
        this.f800e.setFraction(f);
    }
}
