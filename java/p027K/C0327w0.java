package p027K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p034M0.C0360e;
import p047Q1.AbstractC0458e;

/* renamed from: K.w0 */
/* loaded from: classes.dex */
public final class C0327w0 extends AbstractC0458e {

    /* renamed from: h */
    public final WindowInsetsController f861h;

    /* renamed from: i */
    public Window f862i;

    public C0327w0(WindowInsetsController windowInsetsController, C0360e c0360e) {
        this.f861h = windowInsetsController;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: V */
    public final void mo945V(boolean z2) {
        Window window = this.f862i;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f861h.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f861h.setSystemBarsAppearance(0, 16);
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: W */
    public final void mo943W(boolean z2) {
        Window window = this.f862i;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f861h.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f861h.setSystemBarsAppearance(0, 8);
    }
}
