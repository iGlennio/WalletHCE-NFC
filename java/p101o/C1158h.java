package p101o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.h */
/* loaded from: classes.dex */
public final class C1158h implements Set {

    /* renamed from: a */
    public final /* synthetic */ int f4409a;

    /* renamed from: b */
    public final /* synthetic */ C1151a f4410b;

    public /* synthetic */ C1158h(C1151a c1151a, int i2) {
        this.f4409a = i2;
        this.f4410b = c1151a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f4409a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f4409a) {
            case 0:
                C1151a c1151a = this.f4410b;
                int m2656d = c1151a.m2656d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c1151a.f4379d) {
                        case 0:
                            ((C1152b) c1151a.f4380e).put(key, value);
                            break;
                        default:
                            ((C1153c) c1151a.f4380e).add(key);
                            break;
                    }
                }
                return m2656d != c1151a.m2656d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f4409a) {
            case 0:
                this.f4410b.m2653a();
                break;
            default:
                this.f4410b.m2653a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4409a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C1151a c1151a = this.f4410b;
                int m2657e = c1151a.m2657e(key);
                if (m2657e < 0) {
                    return false;
                }
                Object m2654b = c1151a.m2654b(m2657e, 1);
                Object value = entry.getValue();
                return m2654b == value || (m2654b != null && m2654b.equals(value));
            default:
                return this.f4410b.m2657e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f4409a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map m2655c = this.f4410b.m2655c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!m2655c.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f4409a) {
        }
        return C1151a.m2652h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f4409a) {
            case 0:
                C1151a c1151a = this.f4410b;
                int i2 = 0;
                for (int m2656d = c1151a.m2656d() - 1; m2656d >= 0; m2656d--) {
                    Object m2654b = c1151a.m2654b(m2656d, 0);
                    Object m2654b2 = c1151a.m2654b(m2656d, 1);
                    i2 += (m2654b == null ? 0 : m2654b.hashCode()) ^ (m2654b2 == null ? 0 : m2654b2.hashCode());
                }
                return i2;
            default:
                C1151a c1151a2 = this.f4410b;
                int i3 = 0;
                for (int m2656d2 = c1151a2.m2656d() - 1; m2656d2 >= 0; m2656d2--) {
                    Object m2654b3 = c1151a2.m2654b(m2656d2, 0);
                    i3 += m2654b3 == null ? 0 : m2654b3.hashCode();
                }
                return i3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f4409a) {
            case 0:
                if (this.f4410b.m2656d() == 0) {
                }
                break;
            default:
                if (this.f4410b.m2656d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4409a) {
            case 0:
                return new C1159i(this.f4410b);
            default:
                return new C1157g(this.f4410b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f4409a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1151a c1151a = this.f4410b;
                int m2657e = c1151a.m2657e(obj);
                if (m2657e < 0) {
                    return false;
                }
                c1151a.m2659g(m2657e);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f4409a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map m2655c = this.f4410b.m2655c();
                int size = m2655c.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    m2655c.remove(it.next());
                }
                return size != m2655c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f4409a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map m2655c = this.f4410b.m2655c();
                int size = m2655c.size();
                Iterator it = m2655c.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != m2655c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f4409a) {
        }
        return this.f4410b.m2656d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f4409a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f4410b.m2660i(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f4409a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C1151a c1151a = this.f4410b;
                int m2656d = c1151a.m2656d();
                Object[] objArr = new Object[m2656d];
                for (int i2 = 0; i2 < m2656d; i2++) {
                    objArr[i2] = c1151a.m2654b(i2, 0);
                }
                return objArr;
        }
    }
}
