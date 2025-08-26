package p088j;

import androidx.appcompat.widget.Toolbar;
import p086i.C0909n;

/* renamed from: j.l1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1010l1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3986a;

    /* renamed from: b */
    public final /* synthetic */ Toolbar f3987b;

    public /* synthetic */ RunnableC1010l1(Toolbar toolbar, int i2) {
        this.f3986a = i2;
        this.f3987b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3986a) {
            case 0:
                C1019o1 c1019o1 = this.f3987b.f1791L;
                C0909n c0909n = c1019o1 == null ? null : c1019o1.f4016b;
                if (c0909n != null) {
                    c0909n.collapseActionView();
                    break;
                }
                break;
            default:
                this.f3987b.m1434n();
                break;
        }
    }
}
