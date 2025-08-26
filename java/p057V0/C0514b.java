package p057V0;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p051S0.C0472g;
import p055U0.InterfaceC0501o;
import p068a1.C0558a;
import p068a1.C0559b;

/* renamed from: V0.b */
/* loaded from: classes.dex */
public final class C0514b extends AbstractC0477l {

    /* renamed from: d */
    public static final C0513a f1402d = new C0513a(0);

    /* renamed from: a */
    public final /* synthetic */ int f1403a = 0;

    /* renamed from: b */
    public final Object f1404b;

    /* renamed from: c */
    public final Object f1405c;

    public C0514b(C0469d c0469d, AbstractC0477l abstractC0477l, Class cls) {
        this.f1404b = new C0525m(c0469d, abstractC0477l, cls);
        this.f1405c = cls;
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        switch (this.f1403a) {
            case 0:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                c0558a.m1311g();
                while (c0558a.m1319o()) {
                    arrayList.add(((AbstractC0477l) ((C0525m) this.f1404b).f1440c).mo1221a(c0558a));
                }
                c0558a.m1315k();
                int size = arrayList.size();
                Class cls = (Class) this.f1405c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object newInstance = Array.newInstance((Class<?>) cls, size);
                for (int i2 = 0; i2 < size; i2++) {
                    Array.set(newInstance, i2, arrayList.get(i2));
                }
                return newInstance;
            case 1:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC0501o) this.f1405c).mo178n();
                c0558a.m1311g();
                while (c0558a.m1319o()) {
                    collection.add(((AbstractC0477l) ((C0525m) this.f1404b).f1440c).mo1221a(c0558a));
                }
                c0558a.m1315k();
                return collection;
            default:
                Object mo1221a = ((AbstractC0477l) ((C0526n) this.f1404b).f1444c).mo1221a(c0558a);
                if (mo1221a != null) {
                    Class cls2 = (Class) this.f1405c;
                    if (!cls2.isInstance(mo1221a)) {
                        throw new C0472g("Expected a " + cls2.getName() + " but was " + mo1221a.getClass().getName() + "; at path " + c0558a.m1318n(true));
                    }
                }
                return mo1221a;
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        switch (this.f1403a) {
            case 0:
                if (obj == null) {
                    c0559b.m1339o();
                    break;
                } else {
                    c0559b.m1332h();
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        ((C0525m) this.f1404b).mo1222b(c0559b, Array.get(obj, i2));
                    }
                    c0559b.m1335k();
                    break;
                }
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c0559b.m1339o();
                    break;
                } else {
                    c0559b.m1332h();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C0525m) this.f1404b).mo1222b(c0559b, it.next());
                    }
                    c0559b.m1335k();
                    break;
                }
            default:
                ((AbstractC0477l) ((C0526n) this.f1404b).f1444c).mo1222b(c0559b, obj);
                break;
        }
    }

    public C0514b(C0469d c0469d, Type type, AbstractC0477l abstractC0477l, InterfaceC0501o interfaceC0501o) {
        this.f1404b = new C0525m(c0469d, abstractC0477l, type);
        this.f1405c = interfaceC0501o;
    }

    public C0514b(C0526n c0526n, Class cls) {
        this.f1404b = c0526n;
        this.f1405c = cls;
    }
}
