package p034M0;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* renamed from: M0.z */
/* loaded from: classes.dex */
public final class C0381z extends AbstractC0378w {
    public C0381z(NavigationView navigationView) {
        m1051d(navigationView);
    }

    /* renamed from: d */
    private void m1051d(View view) {
        view.setOutlineProvider(new C0379x(1, this));
    }

    @Override // p034M0.AbstractC0378w
    /* renamed from: a */
    public final void mo1047a(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.f1016a);
        if (this.f1016a) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // p034M0.AbstractC0378w
    /* renamed from: b */
    public final boolean mo1048b() {
        return this.f1016a;
    }
}
