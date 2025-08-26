package p103o1;

import java.util.Iterator;

/* renamed from: o1.a */
/* loaded from: classes.dex */
public class C1164a implements Iterable {

    /* renamed from: a */
    public final int f4432a;

    /* renamed from: b */
    public final int f4433b;

    /* renamed from: c */
    public final int f4434c;

    public C1164a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4432a = i2;
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                int i6 = i2 % i4;
                int i7 = ((i5 < 0 ? i5 + i4 : i5) - (i6 < 0 ? i6 + i4 : i6)) % i4;
                i3 -= i7 < 0 ? i7 + i4 : i7;
            }
        } else {
            if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                int i10 = i3 % i8;
                int i11 = ((i9 < 0 ? i9 + i8 : i9) - (i10 < 0 ? i10 + i8 : i10)) % i8;
                i3 += i11 < 0 ? i11 + i8 : i11;
            }
        }
        this.f4433b = i3;
        this.f4434c = i4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1164a)) {
            return false;
        }
        if (isEmpty() && ((C1164a) obj).isEmpty()) {
            return true;
        }
        C1164a c1164a = (C1164a) obj;
        return this.f4432a == c1164a.f4432a && this.f4433b == c1164a.f4433b && this.f4434c == c1164a.f4434c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f4432a * 31) + this.f4433b) * 31) + this.f4434c;
    }

    public boolean isEmpty() {
        int i2 = this.f4434c;
        int i3 = this.f4433b;
        int i4 = this.f4432a;
        return i2 > 0 ? i4 > i3 : i4 < i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1165b(this.f4432a, this.f4433b, this.f4434c);
    }

    public String toString() {
        StringBuilder sb;
        int i2 = this.f4433b;
        int i3 = this.f4432a;
        int i4 = this.f4434c;
        if (i4 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i2);
            sb.append(" step ");
            sb.append(i4);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i2);
            sb.append(" step ");
            sb.append(-i4);
        }
        return sb.toString();
    }
}
