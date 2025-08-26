package p076e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import p002B.C0019i;
import p010D1.AbstractC0096d;
import p027K.AbstractC0259C;
import p027K.AbstractC0272P;

/* renamed from: e.m */
/* loaded from: classes.dex */
public final class C0789m extends AbstractC0096d {

    /* renamed from: n */
    public final /* synthetic */ int f3102n;

    /* renamed from: o */
    public final /* synthetic */ Object f3103o;

    public /* synthetic */ C0789m(int i2, Object obj) {
        this.f3102n = i2;
        this.f3103o = obj;
    }

    @Override // p027K.InterfaceC0279X
    /* renamed from: a */
    public final void mo844a() {
        Object obj = this.f3103o;
        switch (this.f3102n) {
            case 0:
                LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = ((RunnableC0787k) obj).f3099b;
                layoutInflaterFactory2C0797u.f3180v.setAlpha(1.0f);
                layoutInflaterFactory2C0797u.f3183y.m842d(null);
                layoutInflaterFactory2C0797u.f3183y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u2 = (LayoutInflaterFactory2C0797u) obj;
                layoutInflaterFactory2C0797u2.f3180v.setAlpha(1.0f);
                layoutInflaterFactory2C0797u2.f3183y.m842d(null);
                layoutInflaterFactory2C0797u2.f3183y = null;
                break;
            default:
                C0019i c0019i = (C0019i) obj;
                ((LayoutInflaterFactory2C0797u) c0019i.f48c).f3180v.setVisibility(8);
                LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u3 = (LayoutInflaterFactory2C0797u) c0019i.f48c;
                PopupWindow popupWindow = layoutInflaterFactory2C0797u3.f3181w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0797u3.f3180v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0797u3.f3180v.getParent();
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    AbstractC0259C.m739c(view);
                }
                layoutInflaterFactory2C0797u3.f3180v.m1388e();
                layoutInflaterFactory2C0797u3.f3183y.m842d(null);
                layoutInflaterFactory2C0797u3.f3183y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0797u3.f3135A;
                WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
                AbstractC0259C.m739c(viewGroup);
                break;
        }
    }

    @Override // p010D1.AbstractC0096d, p027K.InterfaceC0279X
    /* renamed from: c */
    public void mo368c() {
        Object obj = this.f3103o;
        switch (this.f3102n) {
            case 0:
                ((RunnableC0787k) obj).f3099b.f3180v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) obj;
                layoutInflaterFactory2C0797u.f3180v.setVisibility(0);
                if (layoutInflaterFactory2C0797u.f3180v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0797u.f3180v.getParent();
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    AbstractC0259C.m739c(view);
                    break;
                }
                break;
        }
    }
}
