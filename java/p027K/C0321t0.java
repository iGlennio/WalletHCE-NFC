package p027K;

import android.view.View;
import android.view.Window;
import p034M0.C0360e;
import p047Q1.AbstractC0458e;

/* renamed from: K.t0 */
/* loaded from: classes.dex */
public class C0321t0 extends AbstractC0458e {

    /* renamed from: h */
    public final Window f859h;

    public C0321t0(Window window, C0360e c0360e) {
        this.f859h = window;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: W */
    public final void mo943W(boolean z2) {
        if (!z2) {
            m944e0(8192);
            return;
        }
        Window window = this.f859h;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    /* renamed from: e0 */
    public final void m944e0(int i2) {
        View decorView = this.f859h.getDecorView();
        decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
    }
}
