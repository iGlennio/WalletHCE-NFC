package p088j;

import java.util.WeakHashMap;
import p027K.AbstractC0272P;

/* renamed from: j.G0 */
/* loaded from: classes.dex */
public final class RunnableC0937G0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3784a;

    /* renamed from: b */
    public final /* synthetic */ C0943J0 f3785b;

    public /* synthetic */ RunnableC0937G0(C0943J0 c0943j0, int i2) {
        this.f3784a = i2;
        this.f3785b = c0943j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0943J0 c0943j0 = this.f3785b;
        switch (this.f3784a) {
            case 0:
                C1045x0 c1045x0 = c0943j0.f3800c;
                if (c1045x0 != null) {
                    c1045x0.setListSelectionHidden(true);
                    c1045x0.requestLayout();
                    break;
                }
                break;
            default:
                C1045x0 c1045x02 = c0943j0.f3800c;
                if (c1045x02 != null) {
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    if (c1045x02.isAttachedToWindow() && c0943j0.f3800c.getCount() > c0943j0.f3800c.getChildCount() && c0943j0.f3800c.getChildCount() <= c0943j0.f3810m) {
                        c0943j0.f3823z.setInputMethodMode(2);
                        c0943j0.mo2310i();
                        break;
                    }
                }
                break;
        }
    }
}
