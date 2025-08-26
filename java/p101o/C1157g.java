package p101o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.g */
/* loaded from: classes.dex */
public final class C1157g implements Iterator {

    /* renamed from: a */
    public final int f4404a;

    /* renamed from: b */
    public int f4405b;

    /* renamed from: c */
    public int f4406c;

    /* renamed from: d */
    public boolean f4407d = false;

    /* renamed from: e */
    public final /* synthetic */ C1151a f4408e;

    public C1157g(C1151a c1151a, int i2) {
        this.f4408e = c1151a;
        this.f4404a = i2;
        this.f4405b = c1151a.m2656d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4406c < this.f4405b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object m2654b = this.f4408e.m2654b(this.f4406c, this.f4404a);
        this.f4406c++;
        this.f4407d = true;
        return m2654b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4407d) {
            throw new IllegalStateException();
        }
        int i2 = this.f4406c - 1;
        this.f4406c = i2;
        this.f4405b--;
        this.f4407d = false;
        this.f4408e.m2659g(i2);
    }
}
