package p014F0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p047Q1.AbstractC0458e;
import p134z0.C1332d;

/* renamed from: F0.A */
/* loaded from: classes.dex */
public final class C0124A extends AbstractC0458e {

    /* renamed from: h */
    public final /* synthetic */ int f341h;

    /* renamed from: i */
    public final /* synthetic */ Object f342i;

    public /* synthetic */ C0124A(int i2, Object obj) {
        this.f341h = i2;
        this.f342i = obj;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: L */
    public final void mo448L(int i2) {
        switch (this.f341h) {
            case 0:
                C0126C c0126c = (C0126C) this.f342i;
                c0126c.f346d = true;
                InterfaceC0125B interfaceC0125B = (InterfaceC0125B) c0126c.f347e.get();
                if (interfaceC0125B != null) {
                    C1332d c1332d = (C1332d) interfaceC0125B;
                    c1332d.m3069u();
                    c1332d.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: M */
    public final void mo449M(Typeface typeface, boolean z2) {
        switch (this.f341h) {
            case 0:
                if (!z2) {
                    C0126C c0126c = (C0126C) this.f342i;
                    c0126c.f346d = true;
                    InterfaceC0125B interfaceC0125B = (InterfaceC0125B) c0126c.f347e.get();
                    if (interfaceC0125B != null) {
                        C1332d c1332d = (C1332d) interfaceC0125B;
                        c1332d.m3069u();
                        c1332d.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                Chip chip = (Chip) this.f342i;
                C1332d c1332d2 = chip.f2602e;
                chip.setText(c1332d2.f5446C0 ? c1332d2.f5449E : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    /* renamed from: e0 */
    private final void m447e0(int i2) {
    }
}
