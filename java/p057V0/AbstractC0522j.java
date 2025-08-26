package p057V0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import p010D1.AbstractC0096d;
import p051S0.AbstractC0477l;
import p051S0.C0472g;
import p061X0.AbstractC0545c;
import p068a1.C0558a;
import p068a1.C0559b;

/* renamed from: V0.j */
/* loaded from: classes.dex */
public abstract class AbstractC0522j extends AbstractC0477l {

    /* renamed from: a */
    public final LinkedHashMap f1432a;

    public AbstractC0522j(LinkedHashMap linkedHashMap) {
        this.f1432a = linkedHashMap;
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        if (c0558a.m1303B() == 9) {
            c0558a.m1328x();
            return null;
        }
        Object mo1285c = mo1285c();
        try {
            c0558a.m1312h();
            while (c0558a.m1319o()) {
                C0521i c0521i = (C0521i) this.f1432a.get(c0558a.m1326v());
                if (c0521i != null && c0521i.f1424e) {
                    mo1287e(mo1285c, c0558a, c0521i);
                }
                c0558a.m1309H();
            }
            c0558a.m1316l();
            return mo1286d(mo1285c);
        } catch (IllegalAccessException e2) {
            AbstractC0096d abstractC0096d = AbstractC0545c.f1501a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalStateException e3) {
            throw new C0472g(e3);
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        if (obj == null) {
            c0559b.m1339o();
            return;
        }
        c0559b.m1333i();
        try {
            Iterator it = this.f1432a.values().iterator();
            while (it.hasNext()) {
                ((C0521i) it.next()).m1284a(c0559b, obj);
            }
            c0559b.m1336l();
        } catch (IllegalAccessException e2) {
            AbstractC0096d abstractC0096d = AbstractC0545c.f1501a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        }
    }

    /* renamed from: c */
    public abstract Object mo1285c();

    /* renamed from: d */
    public abstract Object mo1286d(Object obj);

    /* renamed from: e */
    public abstract void mo1287e(Object obj, C0558a c0558a, C0521i c0521i);
}
