package p079f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.b */
/* loaded from: classes.dex */
public final class RunnableC0832b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3312a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3313b;

    /* renamed from: c */
    public final /* synthetic */ C0844h f3314c;

    public /* synthetic */ RunnableC0832b(C0844h c0844h, ArrayList arrayList, int i2) {
        this.f3312a = i2;
        this.f3314c = c0844h;
        this.f3313b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3312a) {
            case 0:
                ArrayList arrayList = this.f3313b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C0844h c0844h = this.f3314c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0844h.f3379m.remove(arrayList);
                        break;
                    } else {
                        C0842g c0842g = (C0842g) it.next();
                        AbstractC0827X abstractC0827X = c0842g.f3363a;
                        c0844h.getClass();
                        View view = abstractC0827X.f3280a;
                        int i2 = c0842g.f3366d - c0842g.f3364b;
                        int i3 = c0842g.f3367e - c0842g.f3365c;
                        if (i2 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i3 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0844h.f3382p.add(abstractC0827X);
                        animate.setDuration(c0844h.f3208e).setListener(new C0836d(c0844h, abstractC0827X, i2, view, i3, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f3313b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C0844h c0844h2 = this.f3314c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0844h2.f3380n.remove(arrayList2);
                        break;
                    } else {
                        C0840f c0840f = (C0840f) it2.next();
                        c0844h2.getClass();
                        AbstractC0827X abstractC0827X2 = c0840f.f3352a;
                        View view2 = abstractC0827X2 == null ? null : abstractC0827X2.f3280a;
                        AbstractC0827X abstractC0827X3 = c0840f.f3353b;
                        View view3 = abstractC0827X3 != null ? abstractC0827X3.f3280a : null;
                        ArrayList arrayList3 = c0844h2.f3384r;
                        long j2 = c0844h2.f3209f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0840f.f3352a);
                            duration.translationX(c0840f.f3356e - c0840f.f3354c);
                            duration.translationY(c0840f.f3357f - c0840f.f3355d);
                            duration.alpha(0.0f).setListener(new C0838e(c0844h2, c0840f, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0840f.f3353b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0838e(c0844h2, c0840f, animate2, view3, 1)).start();
                        }
                    }
                }
            default:
                ArrayList arrayList4 = this.f3313b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    C0844h c0844h3 = this.f3314c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0844h3.f3378l.remove(arrayList4);
                        break;
                    } else {
                        AbstractC0827X abstractC0827X4 = (AbstractC0827X) it3.next();
                        c0844h3.getClass();
                        View view4 = abstractC0827X4.f3280a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0844h3.f3381o.add(abstractC0827X4);
                        animate3.alpha(1.0f).setDuration(c0844h3.f3206c).setListener(new C0834c(c0844h3, abstractC0827X4, view4, animate3)).start();
                    }
                }
        }
    }
}
