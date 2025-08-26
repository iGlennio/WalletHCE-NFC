package p101o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.c */
/* loaded from: classes.dex */
public final class C1153c implements Collection, Set {

    /* renamed from: e */
    public static final int[] f4382e = new int[0];

    /* renamed from: f */
    public static final Object[] f4383f = new Object[0];

    /* renamed from: g */
    public static Object[] f4384g;

    /* renamed from: h */
    public static int f4385h;

    /* renamed from: i */
    public static Object[] f4386i;

    /* renamed from: j */
    public static int f4387j;

    /* renamed from: a */
    public int[] f4388a = f4382e;

    /* renamed from: b */
    public Object[] f4389b = f4383f;

    /* renamed from: c */
    public int f4390c = 0;

    /* renamed from: d */
    public C1151a f4391d;

    /* renamed from: b */
    public static void m2661b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C1153c.class) {
                try {
                    if (f4387j < 10) {
                        objArr[0] = f4386i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f4386i = objArr;
                        f4387j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1153c.class) {
                try {
                    if (f4385h < 10) {
                        objArr[0] = f4384g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f4384g = objArr;
                        f4385h++;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public final void m2662a(int i2) {
        if (i2 == 8) {
            synchronized (C1153c.class) {
                try {
                    Object[] objArr = f4386i;
                    if (objArr != null) {
                        this.f4389b = objArr;
                        f4386i = (Object[]) objArr[0];
                        this.f4388a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4387j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C1153c.class) {
                try {
                    Object[] objArr2 = f4384g;
                    if (objArr2 != null) {
                        this.f4389b = objArr2;
                        f4384g = (Object[]) objArr2[0];
                        this.f4388a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4385h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f4388a = new int[i2];
        this.f4389b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int m2663c;
        if (obj == null) {
            m2663c = m2664d();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            m2663c = m2663c(hashCode, obj);
        }
        if (m2663c >= 0) {
            return false;
        }
        int i3 = ~m2663c;
        int i4 = this.f4390c;
        int[] iArr = this.f4388a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f4389b;
            m2662a(i5);
            int[] iArr2 = this.f4388a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4389b, 0, objArr.length);
            }
            m2661b(iArr, objArr, this.f4390c);
        }
        int i6 = this.f4390c;
        if (i3 < i6) {
            int[] iArr3 = this.f4388a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f4389b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f4390c - i3);
        }
        this.f4388a[i3] = i2;
        this.f4389b[i3] = obj;
        this.f4390c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f4390c;
        int[] iArr = this.f4388a;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4389b;
            m2662a(size);
            int i2 = this.f4390c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f4388a, 0, i2);
                System.arraycopy(objArr, 0, this.f4389b, 0, this.f4390c);
            }
            m2661b(iArr, objArr, this.f4390c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z2 |= add(it.next());
        }
        return z2;
    }

    /* renamed from: c */
    public final int m2663c(int i2, Object obj) {
        int i3 = this.f4390c;
        if (i3 == 0) {
            return -1;
        }
        int m2666a = AbstractC1154d.m2666a(i3, i2, this.f4388a);
        if (m2666a < 0 || obj.equals(this.f4389b[m2666a])) {
            return m2666a;
        }
        int i4 = m2666a + 1;
        while (i4 < i3 && this.f4388a[i4] == i2) {
            if (obj.equals(this.f4389b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = m2666a - 1; i5 >= 0 && this.f4388a[i5] == i2; i5--) {
            if (obj.equals(this.f4389b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f4390c;
        if (i2 != 0) {
            m2661b(this.f4388a, this.f4389b, i2);
            this.f4388a = f4382e;
            this.f4389b = f4383f;
            this.f4390c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m2664d() : m2663c(obj.hashCode(), obj)) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int m2664d() {
        int i2 = this.f4390c;
        if (i2 == 0) {
            return -1;
        }
        int m2666a = AbstractC1154d.m2666a(i2, 0, this.f4388a);
        if (m2666a < 0 || this.f4389b[m2666a] == null) {
            return m2666a;
        }
        int i3 = m2666a + 1;
        while (i3 < i2 && this.f4388a[i3] == 0) {
            if (this.f4389b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m2666a - 1; i4 >= 0 && this.f4388a[i4] == 0; i4--) {
            if (this.f4389b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    /* renamed from: e */
    public final void m2665e(int i2) {
        Object[] objArr = this.f4389b;
        Object obj = objArr[i2];
        int i3 = this.f4390c;
        if (i3 <= 1) {
            m2661b(this.f4388a, objArr, i3);
            this.f4388a = f4382e;
            this.f4389b = f4383f;
            this.f4390c = 0;
            return;
        }
        int[] iArr = this.f4388a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.f4390c = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                Object[] objArr2 = this.f4389b;
                System.arraycopy(objArr2, i5, objArr2, i2, this.f4390c - i2);
            }
            this.f4389b[this.f4390c] = null;
            return;
        }
        m2662a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.f4390c--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.f4388a, 0, i2);
            System.arraycopy(objArr, 0, this.f4389b, 0, i2);
        }
        int i6 = this.f4390c;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, this.f4388a, i2, i6 - i2);
            System.arraycopy(objArr, i7, this.f4389b, i2, this.f4390c - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f4390c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f4390c; i2++) {
                try {
                    if (!set.contains(this.f4389b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f4388a;
        int i2 = this.f4390c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4390c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f4391d == null) {
            this.f4391d = new C1151a(1, this);
        }
        C1151a c1151a = this.f4391d;
        if (c1151a.f4377b == null) {
            c1151a.f4377b = new C1158h(c1151a, 1);
        }
        return c1151a.f4377b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m2664d = obj == null ? m2664d() : m2663c(obj.hashCode(), obj);
        if (m2664d < 0) {
            return false;
        }
        m2665e(m2664d);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i2 = this.f4390c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f4389b[i2])) {
                m2665e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4390c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.f4390c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f4389b, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4390c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f4390c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f4389b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f4390c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f4390c);
        }
        System.arraycopy(this.f4389b, 0, objArr, 0, this.f4390c);
        int length = objArr.length;
        int i2 = this.f4390c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
