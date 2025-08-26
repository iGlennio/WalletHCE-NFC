package p089j0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: j0.C */
/* loaded from: classes.dex */
public final class C1055C extends C1054B {
    @Override // p010D1.AbstractC0096d
    /* renamed from: I */
    public final float mo361I(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: f0 */
    public final void mo369f0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p089j0.C1054B, p010D1.AbstractC0096d
    /* renamed from: g0 */
    public final void mo370g0(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // p089j0.C1054B
    /* renamed from: o0 */
    public final void mo2548o0(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // p089j0.C1054B
    /* renamed from: p0 */
    public final void mo2549p0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p089j0.C1054B
    /* renamed from: q0 */
    public final void mo2550q0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
