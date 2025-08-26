package p079f0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import p027K.C0312p;

/* renamed from: f0.h */
/* loaded from: classes.dex */
public final class C0844h extends AbstractC0808D {

    /* renamed from: s */
    public static TimeInterpolator f3372s;

    /* renamed from: g */
    public boolean f3373g;

    /* renamed from: h */
    public ArrayList f3374h;

    /* renamed from: i */
    public ArrayList f3375i;

    /* renamed from: j */
    public ArrayList f3376j;

    /* renamed from: k */
    public ArrayList f3377k;

    /* renamed from: l */
    public ArrayList f3378l;

    /* renamed from: m */
    public ArrayList f3379m;

    /* renamed from: n */
    public ArrayList f3380n;

    /* renamed from: o */
    public ArrayList f3381o;

    /* renamed from: p */
    public ArrayList f3382p;

    /* renamed from: q */
    public ArrayList f3383q;

    /* renamed from: r */
    public ArrayList f3384r;

    /* renamed from: h */
    public static void m2241h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0827X) arrayList.get(size)).f3280a.animate().cancel();
        }
    }

    @Override // p079f0.AbstractC0808D
    /* renamed from: a */
    public final boolean mo2155a(AbstractC0827X abstractC0827X, AbstractC0827X abstractC0827X2, C0312p c0312p, C0312p c0312p2) {
        int i2;
        int i3;
        int i4 = c0312p.f849a;
        int i5 = c0312p.f850b;
        if (abstractC0827X2.m2228o()) {
            int i6 = c0312p.f849a;
            i3 = c0312p.f850b;
            i2 = i6;
        } else {
            i2 = c0312p2.f849a;
            i3 = c0312p2.f850b;
        }
        if (abstractC0827X == abstractC0827X2) {
            return m2242g(abstractC0827X, i4, i5, i2, i3);
        }
        View view = abstractC0827X.f3280a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2246l(abstractC0827X);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m2246l(abstractC0827X2);
        float f = -((int) ((i2 - i4) - translationX));
        View view2 = abstractC0827X2.f3280a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i3 - i5) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3377k;
        C0840f c0840f = new C0840f();
        c0840f.f3352a = abstractC0827X;
        c0840f.f3353b = abstractC0827X2;
        c0840f.f3354c = i4;
        c0840f.f3355d = i5;
        c0840f.f3356e = i2;
        c0840f.f3357f = i3;
        arrayList.add(c0840f);
        return true;
    }

    @Override // p079f0.AbstractC0808D
    /* renamed from: d */
    public final void mo2157d(AbstractC0827X abstractC0827X) {
        View view = abstractC0827X.f3280a;
        view.animate().cancel();
        ArrayList arrayList = this.f3376j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0842g) arrayList.get(size)).f3363a == abstractC0827X) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2156c(abstractC0827X);
                arrayList.remove(size);
            }
        }
        m2244j(this.f3377k, abstractC0827X);
        if (this.f3374h.remove(abstractC0827X)) {
            view.setAlpha(1.0f);
            m2156c(abstractC0827X);
        }
        if (this.f3375i.remove(abstractC0827X)) {
            view.setAlpha(1.0f);
            m2156c(abstractC0827X);
        }
        ArrayList arrayList2 = this.f3380n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m2244j(arrayList3, abstractC0827X);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3379m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0842g) arrayList5.get(size4)).f3363a == abstractC0827X) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2156c(abstractC0827X);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3378l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC0827X)) {
                view.setAlpha(1.0f);
                m2156c(abstractC0827X);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3383q.remove(abstractC0827X);
        this.f3381o.remove(abstractC0827X);
        this.f3384r.remove(abstractC0827X);
        this.f3382p.remove(abstractC0827X);
        m2243i();
    }

    @Override // p079f0.AbstractC0808D
    /* renamed from: e */
    public final void mo2158e() {
        ArrayList arrayList = this.f3376j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0842g c0842g = (C0842g) arrayList.get(size);
            View view = c0842g.f3363a.f3280a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2156c(c0842g.f3363a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3374h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m2156c((AbstractC0827X) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f3375i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0827X abstractC0827X = (AbstractC0827X) arrayList3.get(size3);
            abstractC0827X.f3280a.setAlpha(1.0f);
            m2156c(abstractC0827X);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3377k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0840f c0840f = (C0840f) arrayList4.get(size4);
            AbstractC0827X abstractC0827X2 = c0840f.f3352a;
            if (abstractC0827X2 != null) {
                m2245k(c0840f, abstractC0827X2);
            }
            AbstractC0827X abstractC0827X3 = c0840f.f3353b;
            if (abstractC0827X3 != null) {
                m2245k(c0840f, abstractC0827X3);
            }
        }
        arrayList4.clear();
        if (mo2159f()) {
            ArrayList arrayList5 = this.f3379m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0842g c0842g2 = (C0842g) arrayList6.get(size6);
                    View view2 = c0842g2.f3363a.f3280a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2156c(c0842g2.f3363a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3378l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC0827X abstractC0827X4 = (AbstractC0827X) arrayList8.get(size8);
                    abstractC0827X4.f3280a.setAlpha(1.0f);
                    m2156c(abstractC0827X4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3380n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0840f c0840f2 = (C0840f) arrayList10.get(size10);
                    AbstractC0827X abstractC0827X5 = c0840f2.f3352a;
                    if (abstractC0827X5 != null) {
                        m2245k(c0840f2, abstractC0827X5);
                    }
                    AbstractC0827X abstractC0827X6 = c0840f2.f3353b;
                    if (abstractC0827X6 != null) {
                        m2245k(c0840f2, abstractC0827X6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m2241h(this.f3383q);
            m2241h(this.f3382p);
            m2241h(this.f3381o);
            m2241h(this.f3384r);
            ArrayList arrayList11 = this.f3205b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p079f0.AbstractC0808D
    /* renamed from: f */
    public final boolean mo2159f() {
        return (this.f3375i.isEmpty() && this.f3377k.isEmpty() && this.f3376j.isEmpty() && this.f3374h.isEmpty() && this.f3382p.isEmpty() && this.f3383q.isEmpty() && this.f3381o.isEmpty() && this.f3384r.isEmpty() && this.f3379m.isEmpty() && this.f3378l.isEmpty() && this.f3380n.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    public final boolean m2242g(AbstractC0827X abstractC0827X, int i2, int i3, int i4, int i5) {
        View view = abstractC0827X.f3280a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) abstractC0827X.f3280a.getTranslationY());
        m2246l(abstractC0827X);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            m2156c(abstractC0827X);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        ArrayList arrayList = this.f3376j;
        C0842g c0842g = new C0842g();
        c0842g.f3363a = abstractC0827X;
        c0842g.f3364b = translationX;
        c0842g.f3365c = translationY;
        c0842g.f3366d = i4;
        c0842g.f3367e = i5;
        arrayList.add(c0842g);
        return true;
    }

    /* renamed from: i */
    public final void m2243i() {
        if (mo2159f()) {
            return;
        }
        ArrayList arrayList = this.f3205b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: j */
    public final void m2244j(ArrayList arrayList, AbstractC0827X abstractC0827X) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0840f c0840f = (C0840f) arrayList.get(size);
            if (m2245k(c0840f, abstractC0827X) && c0840f.f3352a == null && c0840f.f3353b == null) {
                arrayList.remove(c0840f);
            }
        }
    }

    /* renamed from: k */
    public final boolean m2245k(C0840f c0840f, AbstractC0827X abstractC0827X) {
        if (c0840f.f3353b == abstractC0827X) {
            c0840f.f3353b = null;
        } else {
            if (c0840f.f3352a != abstractC0827X) {
                return false;
            }
            c0840f.f3352a = null;
        }
        abstractC0827X.f3280a.setAlpha(1.0f);
        View view = abstractC0827X.f3280a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m2156c(abstractC0827X);
        return true;
    }

    /* renamed from: l */
    public final void m2246l(AbstractC0827X abstractC0827X) {
        if (f3372s == null) {
            f3372s = new ValueAnimator().getInterpolator();
        }
        abstractC0827X.f3280a.animate().setInterpolator(f3372s);
        mo2157d(abstractC0827X);
    }
}
