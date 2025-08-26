package p089j0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.emoji2.text.C0605s;
import androidx.fragment.app.C0651y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p010D1.AbstractC0104l;
import p017G0.C0177i;
import p019H0.C0196b;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p101o.AbstractC1154d;
import p101o.C1152b;
import p101o.C1155e;

/* renamed from: j0.m */
/* loaded from: classes.dex */
public abstract class AbstractC1071m implements Cloneable {

    /* renamed from: w */
    public static final Animator[] f4183w = new Animator[0];

    /* renamed from: x */
    public static final int[] f4184x = {2, 1, 3, 4};

    /* renamed from: y */
    public static final C0651y f4185y = new C0651y(9);

    /* renamed from: z */
    public static final ThreadLocal f4186z = new ThreadLocal();

    /* renamed from: k */
    public ArrayList f4197k;

    /* renamed from: l */
    public ArrayList f4198l;

    /* renamed from: m */
    public InterfaceC1069k[] f4199m;

    /* renamed from: a */
    public final String f4187a = getClass().getName();

    /* renamed from: b */
    public long f4188b = -1;

    /* renamed from: c */
    public long f4189c = -1;

    /* renamed from: d */
    public TimeInterpolator f4190d = null;

    /* renamed from: e */
    public final ArrayList f4191e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f4192f = new ArrayList();

    /* renamed from: g */
    public C0605s f4193g = new C0605s(2);

    /* renamed from: h */
    public C0605s f4194h = new C0605s(2);

    /* renamed from: i */
    public C1059a f4195i = null;

    /* renamed from: j */
    public final int[] f4196j = f4184x;

    /* renamed from: n */
    public final ArrayList f4200n = new ArrayList();

    /* renamed from: o */
    public Animator[] f4201o = f4183w;

    /* renamed from: p */
    public int f4202p = 0;

    /* renamed from: q */
    public boolean f4203q = false;

    /* renamed from: r */
    public boolean f4204r = false;

    /* renamed from: s */
    public AbstractC1071m f4205s = null;

    /* renamed from: t */
    public ArrayList f4206t = null;

    /* renamed from: u */
    public ArrayList f4207u = new ArrayList();

    /* renamed from: v */
    public C0651y f4208v = f4185y;

    /* renamed from: b */
    public static void m2586b(C0605s c0605s, View view, C1079u c1079u) {
        ((C1152b) c0605s.f2011a).put(view, c1079u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0605s.f2012b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        String m750k = AbstractC0261E.m750k(view);
        if (m750k != null) {
            C1152b c1152b = (C1152b) c0605s.f2014d;
            if (c1152b.containsKey(m750k)) {
                c1152b.put(m750k, null);
            } else {
                c1152b.put(m750k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1155e c1155e = (C1155e) c0605s.f2013c;
                if (c1155e.f4395a) {
                    c1155e.m2669b();
                }
                if (AbstractC1154d.m2667b(c1155e.f4396b, c1155e.f4398d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1155e.m2671d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1155e.m2670c(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1155e.m2671d(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: p */
    public static C1152b m2587p() {
        ThreadLocal threadLocal = f4186z;
        C1152b c1152b = (C1152b) threadLocal.get();
        if (c1152b != null) {
            return c1152b;
        }
        C1152b c1152b2 = new C1152b();
        threadLocal.set(c1152b2);
        return c1152b2;
    }

    /* renamed from: u */
    public static boolean m2588u(C1079u c1079u, C1079u c1079u2, String str) {
        Object obj = c1079u.f4219a.get(str);
        Object obj2 = c1079u2.f4219a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo2558A(long j2) {
        this.f4189c = j2;
    }

    /* renamed from: C */
    public void mo2560C(TimeInterpolator timeInterpolator) {
        this.f4190d = timeInterpolator;
    }

    /* renamed from: D */
    public void mo2561D(C0651y c0651y) {
        if (c0651y == null) {
            this.f4208v = f4185y;
        } else {
            this.f4208v = c0651y;
        }
    }

    /* renamed from: F */
    public void mo2563F(long j2) {
        this.f4188b = j2;
    }

    /* renamed from: G */
    public final void m2589G() {
        if (this.f4202p == 0) {
            m2599v(this, InterfaceC1070l.f4178a);
            this.f4204r = false;
        }
        this.f4202p++;
    }

    /* renamed from: H */
    public String mo2564H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f4189c != -1) {
            sb.append("dur(");
            sb.append(this.f4189c);
            sb.append(") ");
        }
        if (this.f4188b != -1) {
            sb.append("dly(");
            sb.append(this.f4188b);
            sb.append(") ");
        }
        if (this.f4190d != null) {
            sb.append("interp(");
            sb.append(this.f4190d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f4191e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4192f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m2590a(InterfaceC1069k interfaceC1069k) {
        if (this.f4206t == null) {
            this.f4206t = new ArrayList();
        }
        this.f4206t.add(interfaceC1069k);
    }

    /* renamed from: c */
    public void mo2566c() {
        ArrayList arrayList = this.f4200n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4201o);
        this.f4201o = f4183w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f4201o = animatorArr;
        m2599v(this, InterfaceC1070l.f4180c);
    }

    /* renamed from: d */
    public abstract void mo2567d(C1079u c1079u);

    /* renamed from: e */
    public final void m2591e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1079u c1079u = new C1079u(view);
            if (z2) {
                mo2569g(c1079u);
            } else {
                mo2567d(c1079u);
            }
            c1079u.f4221c.add(this);
            mo2568f(c1079u);
            if (z2) {
                m2586b(this.f4193g, view, c1079u);
            } else {
                m2586b(this.f4194h, view, c1079u);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m2591e(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    /* renamed from: g */
    public abstract void mo2569g(C1079u c1079u);

    /* renamed from: h */
    public final void m2592h(ViewGroup viewGroup, boolean z2) {
        m2593i(z2);
        ArrayList arrayList = this.f4191e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4192f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m2591e(viewGroup, z2);
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i2)).intValue());
            if (findViewById != null) {
                C1079u c1079u = new C1079u(findViewById);
                if (z2) {
                    mo2569g(c1079u);
                } else {
                    mo2567d(c1079u);
                }
                c1079u.f4221c.add(this);
                mo2568f(c1079u);
                if (z2) {
                    m2586b(this.f4193g, findViewById, c1079u);
                } else {
                    m2586b(this.f4194h, findViewById, c1079u);
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            View view = (View) arrayList2.get(i3);
            C1079u c1079u2 = new C1079u(view);
            if (z2) {
                mo2569g(c1079u2);
            } else {
                mo2567d(c1079u2);
            }
            c1079u2.f4221c.add(this);
            mo2568f(c1079u2);
            if (z2) {
                m2586b(this.f4193g, view, c1079u2);
            } else {
                m2586b(this.f4194h, view, c1079u2);
            }
        }
    }

    /* renamed from: i */
    public final void m2593i(boolean z2) {
        if (z2) {
            ((C1152b) this.f4193g.f2011a).clear();
            ((SparseArray) this.f4193g.f2012b).clear();
            ((C1155e) this.f4193g.f2013c).m2668a();
        } else {
            ((C1152b) this.f4194h.f2011a).clear();
            ((SparseArray) this.f4194h.f2012b).clear();
            ((C1155e) this.f4194h.f2013c).m2668a();
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC1071m clone() {
        try {
            AbstractC1071m abstractC1071m = (AbstractC1071m) super.clone();
            abstractC1071m.f4207u = new ArrayList();
            abstractC1071m.f4193g = new C0605s(2);
            abstractC1071m.f4194h = new C0605s(2);
            abstractC1071m.f4197k = null;
            abstractC1071m.f4198l = null;
            abstractC1071m.f4205s = this;
            abstractC1071m.f4206t = null;
            return abstractC1071m;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: k */
    public Animator mo2577k(ViewGroup viewGroup, C1079u c1079u, C1079u c1079u2) {
        return null;
    }

    /* renamed from: l */
    public void mo2571l(ViewGroup viewGroup, C0605s c0605s, C0605s c0605s2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int i3;
        View view;
        C1079u c1079u;
        Animator animator;
        C1079u c1079u2;
        C1152b m2587p = m2587p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m2596o().getClass();
        int i4 = 0;
        while (i4 < size) {
            C1079u c1079u3 = (C1079u) arrayList.get(i4);
            C1079u c1079u4 = (C1079u) arrayList2.get(i4);
            if (c1079u3 != null && !c1079u3.f4221c.contains(this)) {
                c1079u3 = null;
            }
            if (c1079u4 != null && !c1079u4.f4221c.contains(this)) {
                c1079u4 = null;
            }
            if ((c1079u3 != null || c1079u4 != null) && (c1079u3 == null || c1079u4 == null || mo2584s(c1079u3, c1079u4))) {
                Animator mo2577k = mo2577k(viewGroup, c1079u3, c1079u4);
                if (mo2577k != null) {
                    String str = this.f4187a;
                    if (c1079u4 != null) {
                        String[] mo2578q = mo2578q();
                        view = c1079u4.f4220b;
                        if (mo2578q != null && mo2578q.length > 0) {
                            c1079u2 = new C1079u(view);
                            C1079u c1079u5 = (C1079u) ((C1152b) c0605s2.f2011a).getOrDefault(view, null);
                            i2 = size;
                            if (c1079u5 != null) {
                                int i5 = 0;
                                while (i5 < mo2578q.length) {
                                    HashMap hashMap = c1079u2.f4219a;
                                    int i6 = i4;
                                    String str2 = mo2578q[i5];
                                    hashMap.put(str2, c1079u5.f4219a.get(str2));
                                    i5++;
                                    i4 = i6;
                                }
                            }
                            i3 = i4;
                            int i7 = m2587p.f4422c;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    animator = mo2577k;
                                    break;
                                }
                                C1068j c1068j = (C1068j) m2587p.getOrDefault((Animator) m2587p.m2683h(i8), null);
                                if (c1068j.f4174c != null && c1068j.f4172a == view && c1068j.f4173b.equals(str) && c1068j.f4174c.equals(c1079u2)) {
                                    animator = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            i2 = size;
                            i3 = i4;
                            animator = mo2577k;
                            c1079u2 = null;
                        }
                        mo2577k = animator;
                        c1079u = c1079u2;
                    } else {
                        i2 = size;
                        i3 = i4;
                        view = c1079u3.f4220b;
                        c1079u = null;
                    }
                    if (mo2577k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C1068j c1068j2 = new C1068j();
                        c1068j2.f4172a = view;
                        c1068j2.f4173b = str;
                        c1068j2.f4174c = c1079u;
                        c1068j2.f4175d = windowId;
                        c1068j2.f4176e = this;
                        c1068j2.f4177f = mo2577k;
                        m2587p.put(mo2577k, c1068j2);
                        this.f4207u.add(mo2577k);
                    }
                    i4 = i3 + 1;
                    size = i2;
                }
            }
            i2 = size;
            i3 = i4;
            i4 = i3 + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                C1068j c1068j3 = (C1068j) m2587p.getOrDefault((Animator) this.f4207u.get(sparseIntArray.keyAt(i9)), null);
                c1068j3.f4177f.setStartDelay(c1068j3.f4177f.getStartDelay() + (sparseIntArray.valueAt(i9) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: m */
    public final void m2594m() {
        int i2 = this.f4202p - 1;
        this.f4202p = i2;
        if (i2 == 0) {
            m2599v(this, InterfaceC1070l.f4179b);
            for (int i3 = 0; i3 < ((C1155e) this.f4193g.f2013c).m2672e(); i3++) {
                View view = (View) ((C1155e) this.f4193g.f2013c).m2673f(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((C1155e) this.f4194h.f2013c).m2672e(); i4++) {
                View view2 = (View) ((C1155e) this.f4194h.f2013c).m2673f(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f4204r = true;
        }
    }

    /* renamed from: n */
    public final C1079u m2595n(View view, boolean z2) {
        C1059a c1059a = this.f4195i;
        if (c1059a != null) {
            return c1059a.m2595n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f4197k : this.f4198l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            C1079u c1079u = (C1079u) arrayList.get(i2);
            if (c1079u == null) {
                return null;
            }
            if (c1079u.f4220b == view) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return (C1079u) (z2 ? this.f4198l : this.f4197k).get(i2);
        }
        return null;
    }

    /* renamed from: o */
    public final AbstractC1071m m2596o() {
        C1059a c1059a = this.f4195i;
        return c1059a != null ? c1059a.m2596o() : this;
    }

    /* renamed from: q */
    public String[] mo2578q() {
        return null;
    }

    /* renamed from: r */
    public final C1079u m2597r(View view, boolean z2) {
        C1059a c1059a = this.f4195i;
        if (c1059a != null) {
            return c1059a.m2597r(view, z2);
        }
        return (C1079u) ((C1152b) (z2 ? this.f4193g : this.f4194h).f2011a).getOrDefault(view, null);
    }

    /* renamed from: s */
    public boolean mo2584s(C1079u c1079u, C1079u c1079u2) {
        if (c1079u != null && c1079u2 != null) {
            String[] mo2578q = mo2578q();
            if (mo2578q != null) {
                for (String str : mo2578q) {
                    if (m2588u(c1079u, c1079u2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c1079u.f4219a.keySet().iterator();
                while (it.hasNext()) {
                    if (m2588u(c1079u, c1079u2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m2598t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f4191e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4192f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo2564H("");
    }

    /* renamed from: v */
    public final void m2599v(AbstractC1071m abstractC1071m, InterfaceC1070l interfaceC1070l) {
        AbstractC1071m abstractC1071m2 = this.f4205s;
        if (abstractC1071m2 != null) {
            abstractC1071m2.m2599v(abstractC1071m, interfaceC1070l);
        }
        ArrayList arrayList = this.f4206t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f4206t.size();
        InterfaceC1069k[] interfaceC1069kArr = this.f4199m;
        if (interfaceC1069kArr == null) {
            interfaceC1069kArr = new InterfaceC1069k[size];
        }
        this.f4199m = null;
        InterfaceC1069k[] interfaceC1069kArr2 = (InterfaceC1069k[]) this.f4206t.toArray(interfaceC1069kArr);
        for (int i2 = 0; i2 < size; i2++) {
            interfaceC1070l.mo865a(interfaceC1069kArr2[i2], abstractC1071m);
            interfaceC1069kArr2[i2] = null;
        }
        this.f4199m = interfaceC1069kArr2;
    }

    /* renamed from: w */
    public void mo2572w(ViewGroup viewGroup) {
        if (this.f4204r) {
            return;
        }
        ArrayList arrayList = this.f4200n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4201o);
        this.f4201o = f4183w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.pause();
        }
        this.f4201o = animatorArr;
        m2599v(this, InterfaceC1070l.f4181d);
        this.f4203q = true;
    }

    /* renamed from: x */
    public AbstractC1071m mo2573x(InterfaceC1069k interfaceC1069k) {
        AbstractC1071m abstractC1071m;
        ArrayList arrayList = this.f4206t;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC1069k) && (abstractC1071m = this.f4205s) != null) {
                abstractC1071m.mo2573x(interfaceC1069k);
            }
            if (this.f4206t.size() == 0) {
                this.f4206t = null;
            }
        }
        return this;
    }

    /* renamed from: y */
    public void mo2574y(View view) {
        if (this.f4203q) {
            if (!this.f4204r) {
                ArrayList arrayList = this.f4200n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4201o);
                this.f4201o = f4183w;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f4201o = animatorArr;
                m2599v(this, InterfaceC1070l.f4182e);
            }
            this.f4203q = false;
        }
    }

    /* renamed from: z */
    public void mo2575z() {
        m2589G();
        C1152b m2587p = m2587p();
        Iterator it = this.f4207u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (m2587p.containsKey(animator)) {
                m2589G();
                if (animator != null) {
                    animator.addListener(new C0196b(this, m2587p));
                    long j2 = this.f4189c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f4188b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f4190d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0177i(5, this));
                    animator.start();
                }
            }
        }
        this.f4207u.clear();
        m2594m();
    }

    /* renamed from: B */
    public void mo2559B(AbstractC0104l abstractC0104l) {
    }

    /* renamed from: f */
    public void mo2568f(C1079u c1079u) {
    }

    /* renamed from: E */
    public void mo2562E() {
    }
}
