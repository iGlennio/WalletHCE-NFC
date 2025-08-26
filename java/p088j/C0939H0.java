package p088j;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: j.H0 */
/* loaded from: classes.dex */
public final class C0939H0 implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ C0943J0 f3792a;

    public C0939H0(C0943J0 c0943j0) {
        this.f3792a = c0943j0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            C0943J0 c0943j0 = this.f3792a;
            if (c0943j0.f3823z.getInputMethodMode() == 2 || c0943j0.f3823z.getContentView() == null) {
                return;
            }
            Handler handler = c0943j0.f3819v;
            RunnableC0937G0 runnableC0937G0 = c0943j0.f3815r;
            handler.removeCallbacks(runnableC0937G0);
            runnableC0937G0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
