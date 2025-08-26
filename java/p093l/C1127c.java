package p093l;

import java.util.Map;

/* renamed from: l.c */
/* loaded from: classes.dex */
public final class C1127c implements Map.Entry {

    /* renamed from: a */
    public final Object f4313a;

    /* renamed from: b */
    public final Object f4314b;

    /* renamed from: c */
    public C1127c f4315c;

    /* renamed from: d */
    public C1127c f4316d;

    public C1127c(Object obj, Object obj2) {
        this.f4313a = obj;
        this.f4314b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1127c)) {
            return false;
        }
        C1127c c1127c = (C1127c) obj;
        return this.f4313a.equals(c1127c.f4313a) && this.f4314b.equals(c1127c.f4314b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4313a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4314b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4313a.hashCode() ^ this.f4314b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4313a + "=" + this.f4314b;
    }
}
