package p112r1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p002B.C0019i;
import p095l1.AbstractC1136c;
import p103o1.C1166c;

/* renamed from: r1.b */
/* loaded from: classes.dex */
public final class C1192b implements Iterator {

    /* renamed from: a */
    public int f4566a = -1;

    /* renamed from: b */
    public int f4567b;

    /* renamed from: c */
    public int f4568c;

    /* renamed from: d */
    public C1166c f4569d;

    /* renamed from: e */
    public final /* synthetic */ C0019i f4570e;

    public C1192b(C0019i c0019i) {
        this.f4570e = c0019i;
        c0019i.getClass();
        int length = ((CharSequence) c0019i.f47b).length();
        if (length >= 0) {
            length = length >= 0 ? 0 : length;
            this.f4567b = length;
            this.f4568c = length;
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2753a() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p112r1.C1192b.m2753a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4566a == -1) {
            m2753a();
        }
        return this.f4566a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4566a == -1) {
            m2753a();
        }
        if (this.f4566a == 0) {
            throw new NoSuchElementException();
        }
        C1166c c1166c = this.f4569d;
        AbstractC1136c.m2635c(c1166c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f4569d = null;
        this.f4566a = -1;
        return c1166c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
