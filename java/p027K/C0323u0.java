package p027K;

import android.view.View;
import android.view.Window;

/* renamed from: K.u0 */
/* loaded from: classes.dex */
public final class C0323u0 extends C0321t0 {
    @Override // p047Q1.AbstractC0458e
    /* renamed from: V */
    public final void mo945V(boolean z2) {
        if (!z2) {
            m944e0(16);
            return;
        }
        Window window = this.f859h;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
