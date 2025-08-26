package p027K;

import android.os.Build;
import android.view.animation.Interpolator;
import p006C0.AbstractC0054b;

/* renamed from: K.f0 */
/* loaded from: classes.dex */
public final class C0293f0 {

    /* renamed from: a */
    public AbstractC0291e0 f806a;

    public C0293f0(int i2, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f806a = new C0289d0(AbstractC0054b.m223j(i2, interpolator, j2));
        } else {
            this.f806a = new C0285b0(i2, interpolator, j2);
        }
    }
}
