package p101o;

/* renamed from: o.l */
/* loaded from: classes.dex */
public final class C1162l implements Cloneable {

    /* renamed from: d */
    public static final Object f4423d = new Object();

    /* renamed from: a */
    public int[] f4424a;

    /* renamed from: b */
    public Object[] f4425b;

    /* renamed from: c */
    public int f4426c;

    public C1162l() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f4424a = new int[i5];
        this.f4425b = new Object[i5];
    }

    /* renamed from: a */
    public final void m2686a(int i2, Object obj) {
        int i3 = this.f4426c;
        if (i3 != 0 && i2 <= this.f4424a[i3 - 1]) {
            m2688c(i2, obj);
            return;
        }
        if (i3 >= this.f4424a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f4424a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f4425b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f4424a = iArr;
            this.f4425b = objArr;
        }
        this.f4424a[i3] = i2;
        this.f4425b[i3] = obj;
        this.f4426c = i3 + 1;
    }

    /* renamed from: b */
    public final Object m2687b(int i2, Integer num) {
        Object obj;
        int m2666a = AbstractC1154d.m2666a(this.f4426c, i2, this.f4424a);
        return (m2666a < 0 || (obj = this.f4425b[m2666a]) == f4423d) ? num : obj;
    }

    /* renamed from: c */
    public final void m2688c(int i2, Object obj) {
        int m2666a = AbstractC1154d.m2666a(this.f4426c, i2, this.f4424a);
        if (m2666a >= 0) {
            this.f4425b[m2666a] = obj;
            return;
        }
        int i3 = ~m2666a;
        int i4 = this.f4426c;
        if (i3 < i4) {
            Object[] objArr = this.f4425b;
            if (objArr[i3] == f4423d) {
                this.f4424a[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f4424a.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f4424a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f4425b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4424a = iArr;
            this.f4425b = objArr2;
        }
        int i9 = this.f4426c - i3;
        if (i9 != 0) {
            int[] iArr3 = this.f4424a;
            int i10 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i10, i9);
            Object[] objArr4 = this.f4425b;
            System.arraycopy(objArr4, i3, objArr4, i10, this.f4426c - i3);
        }
        this.f4424a[i3] = i2;
        this.f4425b[i3] = obj;
        this.f4426c++;
    }

    public final Object clone() {
        try {
            C1162l c1162l = (C1162l) super.clone();
            c1162l.f4424a = (int[]) this.f4424a.clone();
            c1162l.f4425b = (Object[]) this.f4425b.clone();
            return c1162l;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        int i2 = this.f4426c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f4426c; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f4424a[i3]);
            sb.append('=');
            Object obj = this.f4425b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
