package p123v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p010D1.AbstractC0096d;
import p075d1.AbstractC0768t;
import p075d1.C0767s;
import p095l1.AbstractC1136c;

/* renamed from: v1.e */
/* loaded from: classes.dex */
public final class C1275e {

    /* renamed from: c */
    public static final C1275e f5135c;

    /* renamed from: a */
    public final Set f5136a;

    /* renamed from: b */
    public final AbstractC0096d f5137b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = C0767s.f2998a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(AbstractC0768t.m2059e0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                AbstractC1136c.m2636d(set, "singleton(element)");
            }
        }
        f5135c = new C1275e(set, null);
    }

    public C1275e(Set set, AbstractC0096d abstractC0096d) {
        this.f5136a = set;
        this.f5137b = abstractC0096d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1275e)) {
            return false;
        }
        C1275e c1275e = (C1275e) obj;
        return AbstractC1136c.m2633a(c1275e.f5136a, this.f5136a) && AbstractC1136c.m2633a(c1275e.f5137b, this.f5137b);
    }

    public final int hashCode() {
        int hashCode = (this.f5136a.hashCode() + 1517) * 41;
        AbstractC0096d abstractC0096d = this.f5137b;
        return hashCode + (abstractC0096d != null ? abstractC0096d.hashCode() : 0);
    }
}
