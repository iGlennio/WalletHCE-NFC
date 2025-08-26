package p027K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: K.D */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0260D implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C0319s0 f760a = null;

    /* renamed from: b */
    public final /* synthetic */ View f761b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0314q f762c;

    public ViewOnApplyWindowInsetsListenerC0260D(View view, InterfaceC0314q interfaceC0314q) {
        this.f761b = view;
        this.f762c = interfaceC0314q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0319s0 m936g = C0319s0.m936g(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0314q interfaceC0314q = this.f762c;
        if (i2 < 30) {
            AbstractC0261E.m740a(windowInsets, this.f761b);
            if (m936g.equals(this.f760a)) {
                return interfaceC0314q.mo63d(view, m936g).m941f();
            }
        }
        this.f760a = m936g;
        C0319s0 mo63d = interfaceC0314q.mo63d(view, m936g);
        if (i2 >= 30) {
            return mo63d.m941f();
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        AbstractC0259C.m739c(view);
        return mo63d.m941f();
    }
}
