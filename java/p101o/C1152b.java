package p101o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.b */
/* loaded from: classes.dex */
public final class C1152b extends C1161k implements Map {

    /* renamed from: h */
    public C1151a f4381h;

    public C1152b(C1161k c1161k) {
        int i2 = c1161k.f4422c;
        m2678b(i2);
        if (this.f4422c != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(c1161k.m2683h(i3), c1161k.m2685j(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(c1161k.f4420a, 0, this.f4420a, 0, i2);
            System.arraycopy(c1161k.f4421b, 0, this.f4421b, 0, i2 << 1);
            this.f4422c = i2;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f4381h == null) {
            this.f4381h = new C1151a(0, this);
        }
        C1151a c1151a = this.f4381h;
        if (c1151a.f4376a == null) {
            c1151a.f4376a = new C1158h(c1151a, 0);
        }
        return c1151a.f4376a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f4381h == null) {
            this.f4381h = new C1151a(0, this);
        }
        C1151a c1151a = this.f4381h;
        if (c1151a.f4377b == null) {
            c1151a.f4377b = new C1158h(c1151a, 1);
        }
        return c1151a.f4377b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m2678b(map.size() + this.f4422c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f4381h == null) {
            this.f4381h = new C1151a(0, this);
        }
        C1151a c1151a = this.f4381h;
        if (c1151a.f4378c == null) {
            c1151a.f4378c = new C1160j(c1151a);
        }
        return c1151a.f4378c;
    }
}
