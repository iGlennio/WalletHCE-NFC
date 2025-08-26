package p027K;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: K.n0 */
/* loaded from: classes.dex */
public class C0309n0 extends C0307m0 {
    public C0309n0(C0319s0 c0319s0, WindowInsets windowInsets) {
        super(c0319s0, windowInsets);
    }

    @Override // p027K.C0315q0
    /* renamed from: a */
    public C0319s0 mo926a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f835c.consumeDisplayCutout();
        return C0319s0.m936g(null, consumeDisplayCutout);
    }

    @Override // p027K.C0315q0
    /* renamed from: e */
    public C0300j mo927e() {
        DisplayCutout displayCutout;
        displayCutout = this.f835c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0300j(displayCutout);
    }

    @Override // p027K.AbstractC0305l0, p027K.C0315q0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0309n0)) {
            return false;
        }
        C0309n0 c0309n0 = (C0309n0) obj;
        return Objects.equals(this.f835c, c0309n0.f835c) && Objects.equals(this.f839g, c0309n0.f839g);
    }

    @Override // p027K.C0315q0
    public int hashCode() {
        return this.f835c.hashCode();
    }
}
