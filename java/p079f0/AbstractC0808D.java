package p079f0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p004B1.C0030a;
import p017G0.C0176h;
import p027K.C0312p;

/* renamed from: f0.D */
/* loaded from: classes.dex */
public abstract class AbstractC0808D {

    /* renamed from: a */
    public C0861y f3204a;

    /* renamed from: b */
    public ArrayList f3205b;

    /* renamed from: c */
    public long f3206c;

    /* renamed from: d */
    public long f3207d;

    /* renamed from: e */
    public long f3208e;

    /* renamed from: f */
    public long f3209f;

    /* renamed from: b */
    public static void m2154b(AbstractC0827X abstractC0827X) {
        RecyclerView recyclerView;
        int i2 = abstractC0827X.f3289j;
        if (abstractC0827X.m2219f() || (i2 & 4) != 0 || (recyclerView = abstractC0827X.f3297r) == null) {
            return;
        }
        recyclerView.m1806F(abstractC0827X);
    }

    /* renamed from: a */
    public abstract boolean mo2155a(AbstractC0827X abstractC0827X, AbstractC0827X abstractC0827X2, C0312p c0312p, C0312p c0312p2);

    /* renamed from: c */
    public final void m2156c(AbstractC0827X abstractC0827X) {
        C0861y c0861y = this.f3204a;
        if (c0861y != null) {
            boolean z2 = true;
            abstractC0827X.m2227n(true);
            if (abstractC0827X.f3287h != null && abstractC0827X.f3288i == null) {
                abstractC0827X.f3287h = null;
            }
            abstractC0827X.f3288i = null;
            if ((abstractC0827X.f3289j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0861y.f3491a;
            recyclerView.m1827b0();
            C0176h c0176h = recyclerView.f2404e;
            C0861y c0861y2 = (C0861y) c0176h.f515b;
            RecyclerView recyclerView2 = c0861y2.f3491a;
            View view = abstractC0827X.f3280a;
            int indexOfChild = recyclerView2.indexOfChild(view);
            if (indexOfChild == -1) {
                c0176h.m525G(view);
            } else {
                C0030a c0030a = (C0030a) c0176h.f516c;
                if (c0030a.m94d(indexOfChild)) {
                    c0030a.m97g(indexOfChild);
                    c0176h.m525G(view);
                    c0861y2.m2284h(indexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                AbstractC0827X m1796I = RecyclerView.m1796I(view);
                C0818N c0818n = recyclerView.f2398b;
                c0818n.m2207j(m1796I);
                c0818n.m2204g(m1796I);
            }
            recyclerView.m1828c0(!z2);
            if (z2 || !abstractC0827X.m2223j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* renamed from: d */
    public abstract void mo2157d(AbstractC0827X abstractC0827X);

    /* renamed from: e */
    public abstract void mo2158e();

    /* renamed from: f */
    public abstract boolean mo2159f();
}
