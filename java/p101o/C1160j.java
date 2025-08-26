package p101o;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.j */
/* loaded from: classes.dex */
public final class C1160j implements Collection {

    /* renamed from: a */
    public final /* synthetic */ C1151a f4415a;

    public C1160j(C1151a c1151a) {
        this.f4415a = c1151a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f4415a.m2653a();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4415a.m2658f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4415a.m2656d() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1157g(this.f4415a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1151a c1151a = this.f4415a;
        int m2658f = c1151a.m2658f(obj);
        if (m2658f < 0) {
            return false;
        }
        c1151a.m2659g(m2658f);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1151a c1151a = this.f4415a;
        int m2656d = c1151a.m2656d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < m2656d) {
            if (collection.contains(c1151a.m2654b(i2, 1))) {
                c1151a.m2659g(i2);
                i2--;
                m2656d--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1151a c1151a = this.f4415a;
        int m2656d = c1151a.m2656d();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < m2656d) {
            if (!collection.contains(c1151a.m2654b(i2, 1))) {
                c1151a.m2659g(i2);
                i2--;
                m2656d--;
                z2 = true;
            }
            i2++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4415a.m2656d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1151a c1151a = this.f4415a;
        int m2656d = c1151a.m2656d();
        Object[] objArr = new Object[m2656d];
        for (int i2 = 0; i2 < m2656d; i2++) {
            objArr[i2] = c1151a.m2654b(i2, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f4415a.m2660i(objArr, 1);
    }
}
