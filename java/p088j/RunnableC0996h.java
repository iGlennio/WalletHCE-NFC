package p088j;

import android.view.View;
import p086i.InterfaceC0905j;
import p086i.MenuC0907l;

/* renamed from: j.h */
/* loaded from: classes.dex */
public final class RunnableC0996h implements Runnable {

    /* renamed from: a */
    public final C0990f f3945a;

    /* renamed from: b */
    public final /* synthetic */ C1005k f3946b;

    public RunnableC0996h(C1005k c1005k, C0990f c0990f) {
        this.f3946b = c1005k;
        this.f3945a = c0990f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0905j interfaceC0905j;
        C1005k c1005k = this.f3946b;
        MenuC0907l menuC0907l = c1005k.f3963c;
        if (menuC0907l != null && (interfaceC0905j = menuC0907l.f3667e) != null) {
            interfaceC0905j.mo169e(menuC0907l);
        }
        View view = (View) c1005k.f3968h;
        if (view != null && view.getWindowToken() != null) {
            C0990f c0990f = this.f3945a;
            if (!c0990f.m2361b()) {
                if (c0990f.f3735e != null) {
                    c0990f.m2363d(0, 0, false, false);
                }
            }
            c1005k.f3980t = c0990f;
        }
        c1005k.f3982v = null;
    }
}
