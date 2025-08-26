package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p002B.C0019i;
import p005C.AbstractC0044g;
import p005C.C0046i;
import p016G.C0163d;
import p017G0.C0176h;
import p018H.RunnableC0194n;
import p027K.AbstractC0272P;
import p107q.AbstractC1181e;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public final class C0634h {

    /* renamed from: a */
    public final ViewGroup f2168a;

    /* renamed from: b */
    public final ArrayList f2169b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f2170c = new ArrayList();

    /* renamed from: d */
    public boolean f2171d = false;

    /* renamed from: e */
    public boolean f2172e = false;

    public C0634h(ViewGroup viewGroup) {
        this.f2168a = viewGroup;
    }

    /* renamed from: f */
    public static C0634h m1645f(ViewGroup viewGroup, C0651y c0651y) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0634h) {
            return (C0634h) tag;
        }
        c0651y.getClass();
        C0634h c0634h = new C0634h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0634h);
        return c0634h;
    }

    /* renamed from: a */
    public final void m1646a(int i2, int i3, C0620J c0620j) {
        synchronized (this.f2169b) {
            try {
                C0163d c0163d = new C0163d();
                C0625O m1649d = m1649d(c0620j.f2096c);
                if (m1649d != null) {
                    m1649d.m1632c(i2, i3);
                    return;
                }
                C0625O c0625o = new C0625O(i2, i3, c0620j, c0163d);
                this.f2169b.add(c0625o);
                c0625o.f2118d.add(new RunnableC0624N(this, c0625o, 0));
                c0625o.f2118d.add(new RunnableC0624N(this, c0625o, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m1647b(ArrayList arrayList, boolean z2) {
        int i2;
        int i3;
        Iterator it = arrayList.iterator();
        C0625O c0625o = null;
        C0625O c0625o2 = null;
        while (true) {
            i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            C0625O c0625o3 = (C0625O) it.next();
            int m151c = AbstractC0044g.m151c(c0625o3.f2117c.f2207E);
            int m2740a = AbstractC1181e.m2740a(c0625o3.f2115a);
            if (m2740a != 0) {
                if (m2740a != 1) {
                    if (m2740a != 2 && m2740a != 3) {
                    }
                } else if (m151c != 2) {
                    c0625o2 = c0625o3;
                }
            }
            if (m151c == 2 && c0625o == null) {
                c0625o = c0625o3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it2.hasNext()) {
                break;
            }
            C0625O c0625o4 = (C0625O) it2.next();
            C0163d c0163d = new C0163d();
            c0625o4.m1633d();
            HashSet hashSet = c0625o4.f2119e;
            hashSet.add(c0163d);
            C0631e c0631e = new C0631e(c0625o4, c0163d);
            c0631e.f2164d = false;
            c0631e.f2163c = z2;
            arrayList2.add(c0631e);
            C0163d c0163d2 = new C0163d();
            c0625o4.m1633d();
            hashSet.add(c0163d2);
            if (!z2 ? c0625o4 == c0625o2 : c0625o4 == c0625o) {
                z3 = true;
            }
            C0633g c0633g = new C0633g(c0625o4, c0163d2);
            int i4 = c0625o4.f2115a;
            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = c0625o4.f2117c;
            if (i4 == 2) {
                if (z2) {
                    abstractComponentCallbacksC0641o.getClass();
                } else {
                    abstractComponentCallbacksC0641o.getClass();
                }
                if (z2) {
                    abstractComponentCallbacksC0641o.getClass();
                } else {
                    abstractComponentCallbacksC0641o.getClass();
                }
            } else if (z2) {
                abstractComponentCallbacksC0641o.getClass();
            } else {
                abstractComponentCallbacksC0641o.getClass();
            }
            if (z3) {
                if (z2) {
                    abstractComponentCallbacksC0641o.getClass();
                } else {
                    abstractComponentCallbacksC0641o.getClass();
                }
            }
            arrayList3.add(c0633g);
            c0625o4.f2118d.add(new RunnableC0194n(this, arrayList4, c0625o4));
        }
        HashMap hashMap = new HashMap();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C0625O c0625o5 = (C0625O) ((C0633g) it3.next()).f2166a;
            AbstractC0044g.m151c(c0625o5.f2117c.f2207E);
            int i5 = c0625o5.f2115a;
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C0633g c0633g2 = (C0633g) it4.next();
            hashMap.put((C0625O) c0633g2.f2166a, Boolean.FALSE);
            c0633g2.m1639d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f2168a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        boolean z4 = false;
        while (it5.hasNext()) {
            C0631e c0631e2 = (C0631e) it5.next();
            C0625O c0625o6 = (C0625O) c0631e2.f2166a;
            int m151c2 = AbstractC0044g.m151c(c0625o6.f2117c.f2207E);
            int i6 = c0625o6.f2115a;
            if (m151c2 == i6 || !(m151c2 == i2 || i6 == i2)) {
                i3 = i2;
                c0631e2.m1639d();
            } else {
                C0019i m1637j = c0631e2.m1637j(context);
                if (m1637j == null) {
                    c0631e2.m1639d();
                } else {
                    Animator animator = (Animator) m1637j.f48c;
                    if (animator == null) {
                        arrayList5.add(c0631e2);
                    } else {
                        C0625O c0625o7 = (C0625O) c0631e2.f2166a;
                        i3 = i2;
                        boolean equals = Boolean.TRUE.equals(hashMap.get(c0625o7));
                        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o2 = c0625o7.f2117c;
                        if (equals) {
                            if (C0615E.m1556E(i3)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0641o2 + " as this Fragment was involved in a Transition.");
                            }
                            c0631e2.m1639d();
                        } else {
                            boolean z5 = c0625o7.f2115a == 3;
                            if (z5) {
                                arrayList4.remove(c0625o7);
                            }
                            View view = abstractComponentCallbacksC0641o2.f2207E;
                            viewGroup.startViewTransition(view);
                            animator.addListener(new C0629c(viewGroup, view, z5, c0625o7, c0631e2));
                            animator.setTarget(view);
                            animator.start();
                            ((C0163d) c0631e2.f2167b).m496a(new C0046i(16, animator));
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
                i3 = i2;
            }
            i2 = i3;
        }
        int i7 = i2;
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            C0631e c0631e3 = (C0631e) it6.next();
            C0625O c0625o8 = (C0625O) c0631e3.f2166a;
            AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o3 = c0625o8.f2117c;
            if (containsValue) {
                if (C0615E.m1556E(i7)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0641o3 + " as Animations cannot run alongside Transitions.");
                }
                c0631e3.m1639d();
            } else if (z4) {
                if (C0615E.m1556E(i7)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0641o3 + " as Animations cannot run alongside Animators.");
                }
                c0631e3.m1639d();
            } else {
                View view2 = abstractComponentCallbacksC0641o3.f2207E;
                C0019i m1637j2 = c0631e3.m1637j(context);
                m1637j2.getClass();
                Animation animation = (Animation) m1637j2.f47b;
                animation.getClass();
                if (c0625o8.f2115a != 1) {
                    view2.startAnimation(animation);
                    c0631e3.m1639d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0645s runnableC0645s = new RunnableC0645s(animation, viewGroup, view2);
                    runnableC0645s.setAnimationListener(new AnimationAnimationListenerC0630d(view2, viewGroup, c0631e3));
                    view2.startAnimation(runnableC0645s);
                }
                ((C0163d) c0631e3.f2167b).m496a(new C0176h(view2, viewGroup, c0631e3));
            }
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            C0625O c0625o9 = (C0625O) it7.next();
            AbstractC0044g.m149a(c0625o9.f2117c.f2207E, c0625o9.f2115a);
        }
        arrayList4.clear();
    }

    /* renamed from: c */
    public final void m1648c() {
        if (this.f2172e) {
            return;
        }
        ViewGroup viewGroup = this.f2168a;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (!viewGroup.isAttachedToWindow()) {
            m1650e();
            this.f2171d = false;
            return;
        }
        synchronized (this.f2169b) {
            try {
                if (!this.f2169b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2170c);
                    this.f2170c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0625O c0625o = (C0625O) it.next();
                        if (C0615E.m1556E(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c0625o);
                        }
                        c0625o.m1630a();
                        if (!c0625o.f2121g) {
                            this.f2170c.add(c0625o);
                        }
                    }
                    m1651g();
                    ArrayList arrayList2 = new ArrayList(this.f2169b);
                    this.f2169b.clear();
                    this.f2170c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((C0625O) it2.next()).m1633d();
                    }
                    m1647b(arrayList2, this.f2171d);
                    this.f2171d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final C0625O m1649d(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        Iterator it = this.f2169b.iterator();
        while (it.hasNext()) {
            C0625O c0625o = (C0625O) it.next();
            if (c0625o.f2117c.equals(abstractComponentCallbacksC0641o) && !c0625o.f2120f) {
                return c0625o;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m1650e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f2168a;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f2169b) {
            try {
                m1651g();
                Iterator it = this.f2169b.iterator();
                while (it.hasNext()) {
                    ((C0625O) it.next()).m1633d();
                }
                Iterator it2 = new ArrayList(this.f2170c).iterator();
                while (it2.hasNext()) {
                    C0625O c0625o = (C0625O) it2.next();
                    if (C0615E.m1556E(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f2168a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(c0625o);
                        Log.v("FragmentManager", sb.toString());
                    }
                    c0625o.m1630a();
                }
                Iterator it3 = new ArrayList(this.f2169b).iterator();
                while (it3.hasNext()) {
                    C0625O c0625o2 = (C0625O) it3.next();
                    if (C0615E.m1556E(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f2168a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(c0625o2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    c0625o2.m1630a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m1651g() {
        Iterator it = this.f2169b.iterator();
        while (it.hasNext()) {
            C0625O c0625o = (C0625O) it.next();
            if (c0625o.f2116b == 2) {
                c0625o.m1632c(AbstractC0044g.m150b(c0625o.f2117c.m1672x().getVisibility()), 1);
            }
        }
    }
}
