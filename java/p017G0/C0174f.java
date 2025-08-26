package p017G0;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import androidx.activity.C0562b;

/* renamed from: G0.f */
/* loaded from: classes.dex */
public final class C0174f implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0170b f510a;

    /* renamed from: b */
    public final /* synthetic */ C0175g f511b;

    public C0174f(C0175g c0175g, InterfaceC0170b interfaceC0170b) {
        this.f511b = c0175g;
        this.f510a = interfaceC0170b;
    }

    public final void onBackCancelled() {
        if (this.f511b.f509a != null) {
            this.f510a.mo506d();
        }
    }

    public final void onBackInvoked() {
        this.f510a.mo503a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f511b.f509a != null) {
            this.f510a.mo505c(new C0562b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f511b.f509a != null) {
            this.f510a.mo504b(new C0562b(backEvent));
        }
    }
}
