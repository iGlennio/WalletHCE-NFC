package p089j0;

import android.view.ViewGroup;
import com.nfupay.s145.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p101o.C1152b;

/* renamed from: j0.q */
/* loaded from: classes.dex */
public abstract class AbstractC1075q {

    /* renamed from: a */
    public static final C1059a f4213a;

    /* renamed from: b */
    public static final ThreadLocal f4214b;

    /* renamed from: c */
    public static final ArrayList f4215c;

    static {
        C1059a c1059a = new C1059a();
        c1059a.f4147A = new ArrayList();
        c1059a.f4148B = true;
        c1059a.f4150D = false;
        c1059a.f4151E = 0;
        c1059a.f4148B = false;
        c1059a.m2565I(new C1066h(2));
        c1059a.m2565I(new C1064f());
        c1059a.m2565I(new C1066h(1));
        f4213a = c1059a;
        f4214b = new ThreadLocal();
        f4215c = new ArrayList();
    }

    /* renamed from: a */
    public static void m2600a(ViewGroup viewGroup, AbstractC1071m abstractC1071m) {
        ArrayList arrayList = f4215c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC1071m == null) {
            abstractC1071m = f4213a;
        }
        AbstractC1071m clone = abstractC1071m.clone();
        ArrayList arrayList2 = (ArrayList) m2601b().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC1071m) it.next()).mo2572w(viewGroup);
            }
        }
        clone.m2592h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC1074p viewTreeObserverOnPreDrawListenerC1074p = new ViewTreeObserverOnPreDrawListenerC1074p();
        viewTreeObserverOnPreDrawListenerC1074p.f4211a = clone;
        viewTreeObserverOnPreDrawListenerC1074p.f4212b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1074p);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1074p);
    }

    /* renamed from: b */
    public static C1152b m2601b() {
        C1152b c1152b;
        ThreadLocal threadLocal = f4214b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1152b = (C1152b) weakReference.get()) != null) {
            return c1152b;
        }
        C1152b c1152b2 = new C1152b();
        threadLocal.set(new WeakReference(c1152b2));
        return c1152b2;
    }
}
