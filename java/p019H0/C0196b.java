package p019H0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import p027K.C0285b0;
import p027K.C0293f0;
import p089j0.AbstractC1071m;
import p101o.C1152b;

/* renamed from: H0.b */
/* loaded from: classes.dex */
public final class C0196b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f568a;

    /* renamed from: b */
    public final /* synthetic */ Object f569b;

    /* renamed from: c */
    public final /* synthetic */ Object f570c;

    public /* synthetic */ C0196b(Object obj, View view, int i2) {
        this.f568a = i2;
        this.f569b = obj;
        this.f570c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f568a) {
            case 0:
                NavigationView navigationView = (NavigationView) this.f570c;
                DrawerLayout drawerLayout = (DrawerLayout) this.f569b;
                drawerLayout.m1493b(navigationView, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
            case 1:
                ((C0293f0) this.f569b).f806a.mo864d(1.0f);
                C0285b0.m853e((View) this.f570c);
                break;
            default:
                ((C1152b) this.f569b).remove(animator);
                ((AbstractC1071m) this.f570c).f4200n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f568a) {
            case 2:
                ((AbstractC1071m) this.f570c).f4200n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0196b(AbstractC1071m abstractC1071m, C1152b c1152b) {
        this.f568a = 2;
        this.f570c = abstractC1071m;
        this.f569b = c1152b;
    }
}
