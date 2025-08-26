package p075d1;

import java.util.RandomAccess;

/* renamed from: d1.d */
/* loaded from: classes.dex */
public final class C0752d extends AbstractC0753e implements RandomAccess {

    /* renamed from: a */
    public final AbstractC0753e f2986a;

    /* renamed from: b */
    public final int f2987b;

    /* renamed from: c */
    public final int f2988c;

    public C0752d(AbstractC0753e abstractC0753e, int i2, int i3) {
        this.f2986a = abstractC0753e;
        this.f2987b = i2;
        int mo708a = abstractC0753e.mo708a();
        if (i2 < 0 || i3 > mo708a) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + mo708a);
        }
        if (i2 <= i3) {
            this.f2988c = i3 - i2;
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
    }

    @Override // p075d1.AbstractC0753e
    /* renamed from: a */
    public final int mo708a() {
        return this.f2988c;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        int i3 = this.f2988c;
        if (i2 >= 0 && i2 < i3) {
            return this.f2986a.get(this.f2987b + i2);
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }
}
