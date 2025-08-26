package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0662J;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.G */
/* loaded from: classes.dex */
public final class C0617G extends AbstractC0662J {

    /* renamed from: f */
    public final boolean f2078f;

    /* renamed from: c */
    public final HashMap f2075c = new HashMap();

    /* renamed from: d */
    public final HashMap f2076d = new HashMap();

    /* renamed from: e */
    public final HashMap f2077e = new HashMap();

    /* renamed from: g */
    public boolean f2079g = false;

    /* renamed from: h */
    public boolean f2080h = false;

    public C0617G(boolean z2) {
        this.f2078f = z2;
    }

    @Override // androidx.lifecycle.AbstractC0662J
    /* renamed from: a */
    public final void mo1607a() {
        if (C0615E.m1556E(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2079g = true;
    }

    /* renamed from: b */
    public final void m1608b(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        if (this.f2080h) {
            if (C0615E.m1556E(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2075c.remove(abstractComponentCallbacksC0641o.f2223e) == null || !C0615E.m1556E(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0641o);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0617G.class == obj.getClass()) {
            C0617G c0617g = (C0617G) obj;
            if (this.f2075c.equals(c0617g.f2075c) && this.f2076d.equals(c0617g.f2076d) && this.f2077e.equals(c0617g.f2077e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2077e.hashCode() + ((this.f2076d.hashCode() + (this.f2075c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f2075c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2076d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2077e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
