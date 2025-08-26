package p088j;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: j.c */
/* loaded from: classes.dex */
public final class RunnableC0981c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3901a;

    /* renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f3902b;

    public /* synthetic */ RunnableC0981c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f3901a = i2;
        this.f3902b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3901a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3902b;
                actionBarOverlayLayout.m1392h();
                actionBarOverlayLayout.f1708w = actionBarOverlayLayout.f1689d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1709x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3902b;
                actionBarOverlayLayout2.m1392h();
                actionBarOverlayLayout2.f1708w = actionBarOverlayLayout2.f1689d.animate().translationY(-actionBarOverlayLayout2.f1689d.getHeight()).setListener(actionBarOverlayLayout2.f1709x);
                break;
        }
    }
}
