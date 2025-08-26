package p075d1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p109q1.C1184a;

/* renamed from: d1.b */
/* loaded from: classes.dex */
public class C0750b implements Iterator {

    /* renamed from: a */
    public final /* synthetic */ int f2982a;

    /* renamed from: b */
    public int f2983b;

    /* renamed from: c */
    public final Object f2984c;

    public /* synthetic */ C0750b(int i2, Object obj) {
        this.f2982a = i2;
        this.f2984c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2982a) {
            case 0:
                return this.f2983b < ((AbstractC0753e) this.f2984c).mo708a();
            case 1:
                return this.f2983b < ((Object[]) this.f2984c).length;
        }
        while (true) {
            int i2 = this.f2983b;
            it = (Iterator) this.f2984c;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f2983b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2982a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f2983b;
                this.f2983b = i2 + 1;
                return ((AbstractC0753e) this.f2984c).get(i2);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f2984c;
                    int i3 = this.f2983b;
                    this.f2983b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.f2983b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
        }
        while (true) {
            int i4 = this.f2983b;
            it = (Iterator) this.f2984c;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f2983b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2982a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0750b(C1184a c1184a) {
        this.f2982a = 2;
        this.f2984c = c1184a.f4548a.iterator();
        this.f2983b = c1184a.f4549b;
    }
}
