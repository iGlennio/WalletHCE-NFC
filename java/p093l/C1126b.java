package p093l;

import java.util.Iterator;

/* renamed from: l.b */
/* loaded from: classes.dex */
public final class C1126b extends AbstractC1129e implements Iterator {

    /* renamed from: a */
    public C1127c f4310a;

    /* renamed from: b */
    public C1127c f4311b;

    /* renamed from: c */
    public final /* synthetic */ int f4312c;

    public C1126b(C1127c c1127c, C1127c c1127c2, int i2) {
        this.f4312c = i2;
        this.f4310a = c1127c2;
        this.f4311b = c1127c;
    }

    @Override // p093l.AbstractC1129e
    /* renamed from: a */
    public final void mo2621a(C1127c c1127c) {
        C1127c c1127c2;
        C1127c c1127c3 = null;
        if (this.f4310a == c1127c && c1127c == this.f4311b) {
            this.f4311b = null;
            this.f4310a = null;
        }
        C1127c c1127c4 = this.f4310a;
        if (c1127c4 == c1127c) {
            switch (this.f4312c) {
                case 0:
                    c1127c2 = c1127c4.f4316d;
                    break;
                default:
                    c1127c2 = c1127c4.f4315c;
                    break;
            }
            this.f4310a = c1127c2;
        }
        C1127c c1127c5 = this.f4311b;
        if (c1127c5 == c1127c) {
            C1127c c1127c6 = this.f4310a;
            if (c1127c5 != c1127c6 && c1127c6 != null) {
                c1127c3 = m2622b(c1127c5);
            }
            this.f4311b = c1127c3;
        }
    }

    /* renamed from: b */
    public final C1127c m2622b(C1127c c1127c) {
        switch (this.f4312c) {
            case 0:
                return c1127c.f4315c;
            default:
                return c1127c.f4316d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4311b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1127c c1127c = this.f4311b;
        C1127c c1127c2 = this.f4310a;
        this.f4311b = (c1127c == c1127c2 || c1127c2 == null) ? null : m2622b(c1127c);
        return c1127c;
    }
}
