package p076e;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import p002B.C0019i;
import p010D1.AbstractC0096d;
import p027K.AbstractC0259C;
import p027K.AbstractC0272P;

/* renamed from: e.F */
/* loaded from: classes.dex */
public final class C0774F extends AbstractC0096d {

    /* renamed from: n */
    public final /* synthetic */ int f3009n;

    /* renamed from: o */
    public final /* synthetic */ C0776H f3010o;

    public /* synthetic */ C0774F(C0776H c0776h, int i2) {
        this.f3009n = i2;
        this.f3010o = c0776h;
    }

    @Override // p027K.InterfaceC0279X
    /* renamed from: a */
    public final void mo844a() {
        View view;
        C0776H c0776h = this.f3010o;
        switch (this.f3009n) {
            case 0:
                if (c0776h.f3019B && (view = c0776h.f3035t) != null) {
                    view.setTranslationY(0.0f);
                    c0776h.f3032q.setTranslationY(0.0f);
                }
                c0776h.f3032q.setVisibility(8);
                c0776h.f3032q.setTransitioning(false);
                c0776h.f3023F = null;
                C0019i c0019i = c0776h.f3039x;
                if (c0019i != null) {
                    c0019i.m52C(c0776h.f3038w);
                    c0776h.f3038w = null;
                    c0776h.f3039x = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0776h.f3031p;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    AbstractC0259C.m739c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c0776h.f3023F = null;
                c0776h.f3032q.requestLayout();
                break;
        }
    }
}
