package p114s0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.C0710k;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p127x.AbstractC1303a;

/* renamed from: s0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1210a extends AbstractC1303a {

    /* renamed from: a */
    public C0710k f4754a;

    @Override // p127x.AbstractC1303a
    /* renamed from: k */
    public boolean mo1886k(CoordinatorLayout coordinatorLayout, View view, int i2) {
        mo1899v(coordinatorLayout, view, i2);
        if (this.f4754a == null) {
            this.f4754a = new C0710k(view);
        }
        C0710k c0710k = this.f4754a;
        View view2 = c0710k.f2657a;
        c0710k.f2658b = view2.getTop();
        c0710k.f2659c = view2.getLeft();
        C0710k c0710k2 = this.f4754a;
        View view3 = c0710k2.f2657a;
        int top = 0 - (view3.getTop() - c0710k2.f2658b);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0710k2.f2659c));
        return true;
    }

    /* renamed from: v */
    public void mo1899v(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.m1466q(view, i2);
    }
}
