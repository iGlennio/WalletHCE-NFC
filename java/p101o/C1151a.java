package p101o;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a */
/* loaded from: classes.dex */
public final class C1151a {

    /* renamed from: a */
    public C1158h f4376a;

    /* renamed from: b */
    public C1158h f4377b;

    /* renamed from: c */
    public C1160j f4378c;

    /* renamed from: d */
    public final /* synthetic */ int f4379d;

    /* renamed from: e */
    public final /* synthetic */ Object f4380e;

    public /* synthetic */ C1151a(int i2, Object obj) {
        this.f4379d = i2;
        this.f4380e = obj;
    }

    /* renamed from: h */
    public static boolean m2652h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void m2653a() {
        switch (this.f4379d) {
            case 0:
                ((C1152b) this.f4380e).clear();
                break;
            default:
                ((C1153c) this.f4380e).clear();
                break;
        }
    }

    /* renamed from: b */
    public final Object m2654b(int i2, int i3) {
        switch (this.f4379d) {
            case 0:
                return ((C1152b) this.f4380e).f4421b[(i2 << 1) + i3];
            default:
                return ((C1153c) this.f4380e).f4389b[i2];
        }
    }

    /* renamed from: c */
    public final Map m2655c() {
        switch (this.f4379d) {
            case 0:
                return (C1152b) this.f4380e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    /* renamed from: d */
    public final int m2656d() {
        switch (this.f4379d) {
            case 0:
                return ((C1152b) this.f4380e).f4422c;
            default:
                return ((C1153c) this.f4380e).f4390c;
        }
    }

    /* renamed from: e */
    public final int m2657e(Object obj) {
        switch (this.f4379d) {
            case 0:
                return ((C1152b) this.f4380e).m2680e(obj);
            default:
                C1153c c1153c = (C1153c) this.f4380e;
                return obj == null ? c1153c.m2664d() : c1153c.m2663c(obj.hashCode(), obj);
        }
    }

    /* renamed from: f */
    public final int m2658f(Object obj) {
        switch (this.f4379d) {
            case 0:
                return ((C1152b) this.f4380e).m2682g(obj);
            default:
                C1153c c1153c = (C1153c) this.f4380e;
                return obj == null ? c1153c.m2664d() : c1153c.m2663c(obj.hashCode(), obj);
        }
    }

    /* renamed from: g */
    public final void m2659g(int i2) {
        switch (this.f4379d) {
            case 0:
                ((C1152b) this.f4380e).m2684i(i2);
                break;
            default:
                ((C1153c) this.f4380e).m2665e(i2);
                break;
        }
    }

    /* renamed from: i */
    public final Object[] m2660i(Object[] objArr, int i2) {
        int m2656d = m2656d();
        if (objArr.length < m2656d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), m2656d);
        }
        for (int i3 = 0; i3 < m2656d; i3++) {
            objArr[i3] = m2654b(i3, i2);
        }
        if (objArr.length > m2656d) {
            objArr[m2656d] = null;
        }
        return objArr;
    }
}
