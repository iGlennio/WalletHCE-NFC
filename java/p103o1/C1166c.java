package p103o1;

/* renamed from: o1.c */
/* loaded from: classes.dex */
public final class C1166c extends C1164a {

    /* renamed from: d */
    public static final C1166c f4439d = new C1166c(1, 0, 1);

    @Override // p103o1.C1164a
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1166c)) {
            return false;
        }
        if (isEmpty() && ((C1166c) obj).isEmpty()) {
            return true;
        }
        C1166c c1166c = (C1166c) obj;
        if (this.f4432a == c1166c.f4432a) {
            return this.f4433b == c1166c.f4433b;
        }
        return false;
    }

    @Override // p103o1.C1164a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f4432a * 31) + this.f4433b;
    }

    @Override // p103o1.C1164a
    public final boolean isEmpty() {
        return this.f4432a > this.f4433b;
    }

    @Override // p103o1.C1164a
    public final String toString() {
        return this.f4432a + ".." + this.f4433b;
    }
}
