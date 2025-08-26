package p101o;

/* renamed from: o.e */
/* loaded from: classes.dex */
public final class C1155e implements Cloneable {

    /* renamed from: e */
    public static final Object f4394e = new Object();

    /* renamed from: a */
    public boolean f4395a = false;

    /* renamed from: b */
    public long[] f4396b;

    /* renamed from: c */
    public Object[] f4397c;

    /* renamed from: d */
    public int f4398d;

    public C1155e() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f4396b = new long[i5];
        this.f4397c = new Object[i5];
    }

    /* renamed from: a */
    public final void m2668a() {
        int i2 = this.f4398d;
        Object[] objArr = this.f4397c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f4398d = 0;
        this.f4395a = false;
    }

    /* renamed from: b */
    public final void m2669b() {
        int i2 = this.f4398d;
        long[] jArr = this.f4396b;
        Object[] objArr = this.f4397c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f4394e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f4395a = false;
        this.f4398d = i3;
    }

    /* renamed from: c */
    public final Object m2670c(long j2, Long l2) {
        Object obj;
        int m2667b = AbstractC1154d.m2667b(this.f4396b, this.f4398d, j2);
        return (m2667b < 0 || (obj = this.f4397c[m2667b]) == f4394e) ? l2 : obj;
    }

    public final Object clone() {
        try {
            C1155e c1155e = (C1155e) super.clone();
            c1155e.f4396b = (long[]) this.f4396b.clone();
            c1155e.f4397c = (Object[]) this.f4397c.clone();
            return c1155e;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: d */
    public final void m2671d(long j2, Object obj) {
        int m2667b = AbstractC1154d.m2667b(this.f4396b, this.f4398d, j2);
        if (m2667b >= 0) {
            this.f4397c[m2667b] = obj;
            return;
        }
        int i2 = ~m2667b;
        int i3 = this.f4398d;
        if (i2 < i3) {
            Object[] objArr = this.f4397c;
            if (objArr[i2] == f4394e) {
                this.f4396b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f4395a && i3 >= this.f4396b.length) {
            m2669b();
            i2 = ~AbstractC1154d.m2667b(this.f4396b, this.f4398d, j2);
        }
        int i4 = this.f4398d;
        if (i4 >= this.f4396b.length) {
            int i5 = (i4 + 1) * 8;
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
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr2 = new Object[i8];
            long[] jArr2 = this.f4396b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4397c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4396b = jArr;
            this.f4397c = objArr2;
        }
        int i9 = this.f4398d - i2;
        if (i9 != 0) {
            long[] jArr3 = this.f4396b;
            int i10 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i10, i9);
            Object[] objArr4 = this.f4397c;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f4398d - i2);
        }
        this.f4396b[i2] = j2;
        this.f4397c[i2] = obj;
        this.f4398d++;
    }

    /* renamed from: e */
    public final int m2672e() {
        if (this.f4395a) {
            m2669b();
        }
        return this.f4398d;
    }

    /* renamed from: f */
    public final Object m2673f(int i2) {
        if (this.f4395a) {
            m2669b();
        }
        return this.f4397c[i2];
    }

    public final String toString() {
        if (m2672e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4398d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f4398d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f4395a) {
                m2669b();
            }
            sb.append(this.f4396b[i2]);
            sb.append('=');
            Object m2673f = m2673f(i2);
            if (m2673f != this) {
                sb.append(m2673f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
