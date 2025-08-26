package p075d1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: d1.c */
/* loaded from: classes.dex */
public final class C0751c extends C0750b implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ AbstractC0753e f2985d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0751c(AbstractC0753e abstractC0753e, int i2) {
        super(0, abstractC0753e);
        this.f2985d = abstractC0753e;
        int mo708a = abstractC0753e.mo708a();
        if (i2 >= 0 && i2 <= mo708a) {
            this.f2983b = i2;
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + mo708a);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2983b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2983b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f2983b - 1;
        this.f2983b = i2;
        return this.f2985d.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2983b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
