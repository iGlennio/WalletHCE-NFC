package p017G0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p008D.AbstractC0087a;
import p027K.InterfaceC0279X;
import p043P0.C0417k;
import p089j0.AbstractC1071m;
import p091k0.C1092f;
import p131y0.C1318a;
import p131y0.C1320c;

/* renamed from: G0.i */
/* loaded from: classes.dex */
public final class C0177i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f518a;

    /* renamed from: b */
    public final /* synthetic */ Object f519b;

    public /* synthetic */ C0177i(int i2, Object obj) {
        this.f518a = i2;
        this.f519b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f518a) {
            case 1:
                ((InterfaceC0279X) this.f519b).mo367b();
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f519b;
                actionBarOverlayLayout.f1708w = null;
                actionBarOverlayLayout.f1696k = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f518a) {
            case 0:
                C0178j c0178j = (C0178j) this.f519b;
                c0178j.f502b.setTranslationY(0.0f);
                c0178j.m553b(0.0f);
                break;
            case 1:
                ((InterfaceC0279X) this.f519b).mo844a();
                break;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f519b;
                sideSheetBehavior.m1973w(5);
                WeakReference weakReference = sideSheetBehavior.f2777p;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.f2777p.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                C0417k c0417k = (C0417k) this.f519b;
                c0417k.m1105q();
                c0417k.f1105r.start();
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f519b;
                actionBarOverlayLayout.f1708w = null;
                actionBarOverlayLayout.f1696k = false;
                break;
            case 5:
                ((AbstractC1071m) this.f519b).m2594m();
                animator.removeListener(this);
                break;
            case 6:
                C1092f c1092f = (C1092f) this.f519b;
                ArrayList arrayList = new ArrayList(c1092f.f4243e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((C1318a) arrayList.get(i2)).f5378b.f5394o;
                    if (colorStateList != null) {
                        AbstractC0087a.m305h(c1092f, colorStateList);
                    }
                }
                break;
            case 7:
                ((HideBottomViewOnScrollBehavior) this.f519b).f2504h = null;
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f519b;
                bottomSheetBehavior.m1909G(5);
                WeakReference weakReference2 = bottomSheetBehavior.f2532U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) bottomSheetBehavior.f2532U.get()).requestLayout();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f518a) {
            case 1:
                ((InterfaceC0279X) this.f519b).mo368c();
                break;
            case 6:
                C1092f c1092f = (C1092f) this.f519b;
                ArrayList arrayList = new ArrayList(c1092f.f4243e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C1320c c1320c = ((C1318a) arrayList.get(i2)).f5378b;
                    ColorStateList colorStateList = c1320c.f5394o;
                    if (colorStateList != null) {
                        AbstractC0087a.m304g(c1092f, colorStateList.getColorForState(c1320c.f5398s, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0177i(InterfaceC0279X interfaceC0279X, View view) {
        this.f518a = 1;
        this.f519b = interfaceC0279X;
    }
}
