package p101o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.k */
/* loaded from: classes.dex */
public class C1161k {

    /* renamed from: d */
    public static Object[] f4416d;

    /* renamed from: e */
    public static int f4417e;

    /* renamed from: f */
    public static Object[] f4418f;

    /* renamed from: g */
    public static int f4419g;

    /* renamed from: a */
    public int[] f4420a = AbstractC1154d.f4392a;

    /* renamed from: b */
    public Object[] f4421b = AbstractC1154d.f4393b;

    /* renamed from: c */
    public int f4422c = 0;

    /* renamed from: c */
    public static void m2676c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C1161k.class) {
                try {
                    if (f4419g < 10) {
                        objArr[0] = f4418f;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f4418f = objArr;
                        f4419g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1161k.class) {
                try {
                    if (f4417e < 10) {
                        objArr[0] = f4416d;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f4416d = objArr;
                        f4417e++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2677a(int i2) {
        if (i2 == 8) {
            synchronized (C1161k.class) {
                try {
                    Object[] objArr = f4418f;
                    if (objArr != null) {
                        this.f4421b = objArr;
                        f4418f = (Object[]) objArr[0];
                        this.f4420a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4419g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C1161k.class) {
                try {
                    Object[] objArr2 = f4416d;
                    if (objArr2 != null) {
                        this.f4421b = objArr2;
                        f4416d = (Object[]) objArr2[0];
                        this.f4420a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4417e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f4420a = new int[i2];
        this.f4421b = new Object[i2 << 1];
    }

    /* renamed from: b */
    public final void m2678b(int i2) {
        int i3 = this.f4422c;
        int[] iArr = this.f4420a;
        if (iArr.length < i2) {
            Object[] objArr = this.f4421b;
            m2677a(i2);
            if (this.f4422c > 0) {
                System.arraycopy(iArr, 0, this.f4420a, 0, i3);
                System.arraycopy(objArr, 0, this.f4421b, 0, i3 << 1);
            }
            m2676c(iArr, objArr, i3);
        }
        if (this.f4422c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.f4422c;
        if (i2 > 0) {
            int[] iArr = this.f4420a;
            Object[] objArr = this.f4421b;
            this.f4420a = AbstractC1154d.f4392a;
            this.f4421b = AbstractC1154d.f4393b;
            this.f4422c = 0;
            m2676c(iArr, objArr, i2);
        }
        if (this.f4422c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m2680e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m2682g(obj) >= 0;
    }

    /* renamed from: d */
    public final int m2679d(int i2, Object obj) {
        int i3 = this.f4422c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int m2666a = AbstractC1154d.m2666a(i3, i2, this.f4420a);
            if (m2666a < 0 || obj.equals(this.f4421b[m2666a << 1])) {
                return m2666a;
            }
            int i4 = m2666a + 1;
            while (i4 < i3 && this.f4420a[i4] == i2) {
                if (obj.equals(this.f4421b[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = m2666a - 1; i5 >= 0 && this.f4420a[i5] == i2; i5--) {
                if (obj.equals(this.f4421b[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    public final int m2680e(Object obj) {
        return obj == null ? m2681f() : m2679d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1161k) {
            C1161k c1161k = (C1161k) obj;
            if (this.f4422c != c1161k.f4422c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f4422c; i2++) {
                try {
                    Object m2683h = m2683h(i2);
                    Object m2685j = m2685j(i2);
                    Object orDefault = c1161k.getOrDefault(m2683h, null);
                    if (m2685j == null) {
                        if (orDefault != null || !c1161k.containsKey(m2683h)) {
                            return false;
                        }
                    } else if (!m2685j.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f4422c != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f4422c; i3++) {
                try {
                    Object m2683h2 = m2683h(i3);
                    Object m2685j2 = m2685j(i3);
                    Object obj2 = map.get(m2683h2);
                    if (m2685j2 == null) {
                        if (obj2 != null || !map.containsKey(m2683h2)) {
                            return false;
                        }
                    } else if (!m2685j2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m2681f() {
        int i2 = this.f4422c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int m2666a = AbstractC1154d.m2666a(i2, 0, this.f4420a);
            if (m2666a < 0 || this.f4421b[m2666a << 1] == null) {
                return m2666a;
            }
            int i3 = m2666a + 1;
            while (i3 < i2 && this.f4420a[i3] == 0) {
                if (this.f4421b[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m2666a - 1; i4 >= 0 && this.f4420a[i4] == 0; i4--) {
                if (this.f4421b[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final int m2682g(Object obj) {
        int i2 = this.f4422c * 2;
        Object[] objArr = this.f4421b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int m2680e = m2680e(obj);
        return m2680e >= 0 ? this.f4421b[(m2680e << 1) + 1] : obj2;
    }

    /* renamed from: h */
    public final Object m2683h(int i2) {
        return this.f4421b[i2 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f4420a;
        Object[] objArr = this.f4421b;
        int i2 = this.f4422c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* renamed from: i */
    public final Object m2684i(int i2) {
        Object[] objArr = this.f4421b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f4422c;
        int i5 = 0;
        if (i4 <= 1) {
            m2676c(this.f4420a, objArr, i4);
            this.f4420a = AbstractC1154d.f4392a;
            this.f4421b = AbstractC1154d.f4393b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f4420a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f4421b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f4421b;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                m2677a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f4422c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f4420a, 0, i2);
                    System.arraycopy(objArr, 0, this.f4421b, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f4420a, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f4421b, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f4422c) {
            throw new ConcurrentModificationException();
        }
        this.f4422c = i5;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f4422c <= 0;
    }

    /* renamed from: j */
    public final Object m2685j(int i2) {
        return this.f4421b[(i2 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int m2679d;
        int i3 = this.f4422c;
        if (obj == null) {
            m2679d = m2681f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            m2679d = m2679d(hashCode, obj);
        }
        if (m2679d >= 0) {
            int i4 = (m2679d << 1) + 1;
            Object[] objArr = this.f4421b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~m2679d;
        int[] iArr = this.f4420a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f4421b;
            m2677a(i6);
            if (i3 != this.f4422c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f4420a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f4421b, 0, objArr2.length);
            }
            m2676c(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f4420a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f4421b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f4422c - i5) << 1);
        }
        int i8 = this.f4422c;
        if (i3 == i8) {
            int[] iArr4 = this.f4420a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f4421b;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f4422c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int m2680e = m2680e(obj);
        if (m2680e >= 0) {
            return m2684i(m2680e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int m2680e = m2680e(obj);
        if (m2680e < 0) {
            return null;
        }
        int i2 = (m2680e << 1) + 1;
        Object[] objArr = this.f4421b;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f4422c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4422c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f4422c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object m2683h = m2683h(i2);
            if (m2683h != this) {
                sb.append(m2683h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m2685j = m2685j(i2);
            if (m2685j != this) {
                sb.append(m2685j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int m2680e = m2680e(obj);
        if (m2680e < 0) {
            return false;
        }
        Object m2685j = m2685j(m2680e);
        if (obj2 != m2685j && (obj2 == null || !obj2.equals(m2685j))) {
            return false;
        }
        m2684i(m2680e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int m2680e = m2680e(obj);
        if (m2680e < 0) {
            return false;
        }
        Object m2685j = m2685j(m2680e);
        if (m2685j != obj2 && (obj2 == null || !obj2.equals(m2685j))) {
            return false;
        }
        int i2 = (m2680e << 1) + 1;
        Object[] objArr = this.f4421b;
        Object obj4 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
