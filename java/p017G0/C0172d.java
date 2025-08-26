package p017G0;

import android.window.OnBackInvokedCallback;
import p076e.LayoutInflaterFactory2C0797u;
import p092k1.InterfaceC1103a;

/* renamed from: G0.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0172d implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f507a;

    /* renamed from: b */
    public final /* synthetic */ Object f508b;

    public /* synthetic */ C0172d(int i2, Object obj) {
        this.f507a = i2;
        this.f508b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f507a) {
            case 0:
                ((InterfaceC0170b) this.f508b).mo503a();
                break;
            case 1:
                ((InterfaceC1103a) this.f508b).mo259a();
                break;
            case 2:
                ((LayoutInflaterFactory2C0797u) this.f508b).m2133D();
                break;
            default:
                ((Runnable) this.f508b).run();
                break;
        }
    }
}
