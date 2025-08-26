package p103o1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o1.b */
/* loaded from: classes.dex */
public final class C1165b implements Iterator {

    /* renamed from: a */
    public final int f4435a;

    /* renamed from: b */
    public final int f4436b;

    /* renamed from: c */
    public boolean f4437c;

    /* renamed from: d */
    public int f4438d;

    public C1165b(int i2, int i3, int i4) {
        this.f4435a = i4;
        this.f4436b = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f4437c = z2;
        this.f4438d = z2 ? i2 : i3;
    }

    /* renamed from: a */
    public final int m2689a() {
        int i2 = this.f4438d;
        if (i2 != this.f4436b) {
            this.f4438d = this.f4435a + i2;
            return i2;
        }
        if (!this.f4437c) {
            throw new NoSuchElementException();
        }
        this.f4437c = false;
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4437c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(m2689a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
