package p027K;

import android.graphics.Insets;
import android.view.WindowInsets;
import p005C.C0041d;

/* renamed from: K.o0 */
/* loaded from: classes.dex */
public class C0311o0 extends C0309n0 {

    /* renamed from: n */
    public C0041d f846n;

    /* renamed from: o */
    public C0041d f847o;

    /* renamed from: p */
    public C0041d f848p;

    public C0311o0(C0319s0 c0319s0, WindowInsets windowInsets) {
        super(c0319s0, windowInsets);
        this.f846n = null;
        this.f847o = null;
        this.f848p = null;
    }

    @Override // p027K.C0315q0
    /* renamed from: g */
    public C0041d mo929g() {
        Insets mandatorySystemGestureInsets;
        if (this.f847o == null) {
            mandatorySystemGestureInsets = this.f835c.getMandatorySystemGestureInsets();
            this.f847o = C0041d.m146c(mandatorySystemGestureInsets);
        }
        return this.f847o;
    }

    @Override // p027K.C0315q0
    /* renamed from: i */
    public C0041d mo930i() {
        Insets systemGestureInsets;
        if (this.f846n == null) {
            systemGestureInsets = this.f835c.getSystemGestureInsets();
            this.f846n = C0041d.m146c(systemGestureInsets);
        }
        return this.f846n;
    }

    @Override // p027K.C0315q0
    /* renamed from: k */
    public C0041d mo931k() {
        Insets tappableElementInsets;
        if (this.f848p == null) {
            tappableElementInsets = this.f835c.getTappableElementInsets();
            this.f848p = C0041d.m146c(tappableElementInsets);
        }
        return this.f848p;
    }

    @Override // p027K.AbstractC0305l0, p027K.C0315q0
    /* renamed from: l */
    public C0319s0 mo902l(int i2, int i3, int i4, int i5) {
        WindowInsets inset;
        inset = this.f835c.inset(i2, i3, i4, i5);
        return C0319s0.m936g(null, inset);
    }

    @Override // p027K.C0307m0, p027K.C0315q0
    /* renamed from: q */
    public void mo920q(C0041d c0041d) {
    }
}
