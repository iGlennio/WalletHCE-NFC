package p017G0;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: G0.e */
/* loaded from: classes.dex */
public class C0173e {

    /* renamed from: a */
    public OnBackInvokedCallback f509a;

    /* renamed from: a */
    public OnBackInvokedCallback mo516a(InterfaceC0170b interfaceC0170b) {
        Objects.requireNonNull(interfaceC0170b);
        return new C0172d(0, interfaceC0170b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m517b(p017G0.InterfaceC0170b r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.f509a
            if (r0 == 0) goto L5
            goto Lb
        L5:
            android.window.OnBackInvokedDispatcher r3 = p017G0.AbstractC0171c.m510d(r3)
            if (r3 != 0) goto Lc
        Lb:
            return
        Lc:
            android.window.OnBackInvokedCallback r2 = r1.mo516a(r2)
            r1.f509a = r2
            if (r4 == 0) goto L18
            r4 = 1000000(0xf4240, float:1.401298E-39)
            goto L19
        L18:
            r4 = 0
        L19:
            p017G0.AbstractC0171c.m513g(r3, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p017G0.C0173e.m517b(G0.b, android.view.View, boolean):void");
    }

    /* renamed from: c */
    public void m518c(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (findOnBackInvokedDispatcher == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f509a);
        this.f509a = null;
    }
}
