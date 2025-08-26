package p093l;

import java.util.Iterator;

/* renamed from: l.d */
/* loaded from: classes.dex */
public final class C1128d extends AbstractC1129e implements Iterator {

    /* renamed from: a */
    public C1127c f4317a;

    /* renamed from: b */
    public boolean f4318b = true;

    /* renamed from: c */
    public final /* synthetic */ C1130f f4319c;

    public C1128d(C1130f c1130f) {
        this.f4319c = c1130f;
    }

    @Override // p093l.AbstractC1129e
    /* renamed from: a */
    public final void mo2621a(C1127c c1127c) {
        C1127c c1127c2 = this.f4317a;
        if (c1127c == c1127c2) {
            C1127c c1127c3 = c1127c2.f4316d;
            this.f4317a = c1127c3;
            this.f4318b = c1127c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4318b) {
            return this.f4319c.f4320a != null;
        }
        C1127c c1127c = this.f4317a;
        return (c1127c == null || c1127c.f4315c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4318b) {
            this.f4318b = false;
            this.f4317a = this.f4319c.f4320a;
        } else {
            C1127c c1127c = this.f4317a;
            this.f4317a = c1127c != null ? c1127c.f4315c : null;
        }
        return this.f4317a;
    }
}
