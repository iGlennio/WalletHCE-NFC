package p101o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.i */
/* loaded from: classes.dex */
public final class C1159i implements Iterator, Map.Entry {

    /* renamed from: a */
    public int f4411a;

    /* renamed from: d */
    public final /* synthetic */ C1151a f4414d;

    /* renamed from: c */
    public boolean f4413c = false;

    /* renamed from: b */
    public int f4412b = -1;

    public C1159i(C1151a c1151a) {
        this.f4414d = c1151a;
        this.f4411a = c1151a.m2656d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f4413c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f4412b;
        C1151a c1151a = this.f4414d;
        Object m2654b = c1151a.m2654b(i2, 0);
        if (key != m2654b && (key == null || !key.equals(m2654b))) {
            return false;
        }
        Object value = entry.getValue();
        Object m2654b2 = c1151a.m2654b(this.f4412b, 1);
        return value == m2654b2 || (value != null && value.equals(m2654b2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f4413c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f4414d.m2654b(this.f4412b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f4413c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f4414d.m2654b(this.f4412b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4412b < this.f4411a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f4413c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f4412b;
        C1151a c1151a = this.f4414d;
        Object m2654b = c1151a.m2654b(i2, 0);
        Object m2654b2 = c1151a.m2654b(this.f4412b, 1);
        return (m2654b == null ? 0 : m2654b.hashCode()) ^ (m2654b2 != null ? m2654b2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4412b++;
        this.f4413c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4413c) {
            throw new IllegalStateException();
        }
        this.f4414d.m2659g(this.f4412b);
        this.f4412b--;
        this.f4411a--;
        this.f4413c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f4413c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C1151a c1151a = this.f4414d;
        int i2 = this.f4412b;
        switch (c1151a.f4379d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                Object[] objArr = ((C1152b) c1151a.f4380e).f4421b;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
