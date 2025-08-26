package p027K;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import p005C.C0041d;

/* renamed from: K.p0 */
/* loaded from: classes.dex */
public final class C0313p0 extends C0311o0 {

    /* renamed from: q */
    public static final C0319s0 f851q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f851q = C0319s0.m936g(null, windowInsets);
    }

    public C0313p0(C0319s0 c0319s0, WindowInsets windowInsets) {
        super(c0319s0, windowInsets);
    }

    @Override // p027K.AbstractC0305l0, p027K.C0315q0
    /* renamed from: f */
    public C0041d mo900f(int i2) {
        Insets insets;
        insets = this.f835c.getInsets(AbstractC0317r0.m933a(i2));
        return C0041d.m146c(insets);
    }

    @Override // p027K.AbstractC0305l0, p027K.C0315q0
    /* renamed from: d */
    public final void mo899d(View view) {
    }
}
