package p027K;

import android.view.WindowInsets;
import p005C.C0041d;

/* renamed from: K.m0 */
/* loaded from: classes.dex */
public class C0307m0 extends AbstractC0305l0 {

    /* renamed from: m */
    public C0041d f845m;

    public C0307m0(C0319s0 c0319s0, WindowInsets windowInsets) {
        super(c0319s0, windowInsets);
        this.f845m = null;
    }

    @Override // p027K.C0315q0
    /* renamed from: b */
    public C0319s0 mo916b() {
        return C0319s0.m936g(null, this.f835c.consumeStableInsets());
    }

    @Override // p027K.C0315q0
    /* renamed from: c */
    public C0319s0 mo917c() {
        return C0319s0.m936g(null, this.f835c.consumeSystemWindowInsets());
    }

    @Override // p027K.C0315q0
    /* renamed from: h */
    public final C0041d mo918h() {
        if (this.f845m == null) {
            WindowInsets windowInsets = this.f835c;
            this.f845m = C0041d.m145b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f845m;
    }

    @Override // p027K.C0315q0
    /* renamed from: m */
    public boolean mo919m() {
        return this.f835c.isConsumed();
    }

    @Override // p027K.C0315q0
    /* renamed from: q */
    public void mo920q(C0041d c0041d) {
        this.f845m = c0041d;
    }
}
