package p075d1;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p095l1.AbstractC1136c;

/* renamed from: d1.g */
/* loaded from: classes.dex */
public final class C0755g extends AbstractList implements List {

    /* renamed from: d */
    public static final Object[] f2991d = new Object[0];

    /* renamed from: a */
    public int f2992a;

    /* renamed from: b */
    public Object[] f2993b = f2991d;

    /* renamed from: c */
    public int f2994c;

    /* renamed from: a */
    public final void m2044a(Object obj) {
        m2046c(this.f2994c + 1);
        this.f2993b[m2048e(this.f2992a + this.f2994c)] = obj;
        this.f2994c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.f2994c;
        if (i2 < 0 || i2 > i4) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i4);
        }
        if (i2 == i4) {
            m2044a(obj);
            return;
        }
        if (i2 == 0) {
            m2046c(i4 + 1);
            int i5 = this.f2992a;
            if (i5 == 0) {
                Object[] objArr = this.f2993b;
                AbstractC1136c.m2637e(objArr, "<this>");
                i5 = objArr.length;
            }
            int i6 = i5 - 1;
            this.f2992a = i6;
            this.f2993b[i6] = obj;
            this.f2994c++;
            return;
        }
        m2046c(i4 + 1);
        int m2048e = m2048e(this.f2992a + i2);
        int i7 = this.f2994c;
        if (i2 < ((i7 + 1) >> 1)) {
            if (m2048e == 0) {
                Object[] objArr2 = this.f2993b;
                AbstractC1136c.m2637e(objArr2, "<this>");
                i3 = objArr2.length - 1;
            } else {
                i3 = m2048e - 1;
            }
            int i8 = this.f2992a;
            if (i8 == 0) {
                Object[] objArr3 = this.f2993b;
                AbstractC1136c.m2637e(objArr3, "<this>");
                i8 = objArr3.length;
            }
            int i9 = i8 - 1;
            int i10 = this.f2992a;
            if (i3 >= i10) {
                Object[] objArr4 = this.f2993b;
                objArr4[i9] = objArr4[i10];
                AbstractC0756h.m2050p0(objArr4, objArr4, i10, i10 + 1, i3 + 1);
            } else {
                Object[] objArr5 = this.f2993b;
                AbstractC0756h.m2050p0(objArr5, objArr5, i10 - 1, i10, objArr5.length);
                Object[] objArr6 = this.f2993b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0756h.m2050p0(objArr6, objArr6, 0, 1, i3 + 1);
            }
            this.f2993b[i3] = obj;
            this.f2992a = i9;
        } else {
            int m2048e2 = m2048e(this.f2992a + i7);
            if (m2048e < m2048e2) {
                Object[] objArr7 = this.f2993b;
                AbstractC0756h.m2050p0(objArr7, objArr7, m2048e + 1, m2048e, m2048e2);
            } else {
                Object[] objArr8 = this.f2993b;
                AbstractC0756h.m2050p0(objArr8, objArr8, 1, 0, m2048e2);
                Object[] objArr9 = this.f2993b;
                objArr9[0] = objArr9[objArr9.length - 1];
                AbstractC0756h.m2050p0(objArr9, objArr9, m2048e + 1, m2048e, objArr9.length - 1);
            }
            this.f2993b[m2048e] = obj;
        }
        this.f2994c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        AbstractC1136c.m2637e(collection, "elements");
        int i3 = this.f2994c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i4 = this.f2994c;
        if (i2 == i4) {
            return addAll(collection);
        }
        m2046c(collection.size() + i4);
        int m2048e = m2048e(this.f2992a + this.f2994c);
        int m2048e2 = m2048e(this.f2992a + i2);
        int size = collection.size();
        if (i2 >= ((this.f2994c + 1) >> 1)) {
            int i5 = m2048e2 + size;
            if (m2048e2 < m2048e) {
                int i6 = size + m2048e;
                Object[] objArr = this.f2993b;
                if (i6 <= objArr.length) {
                    AbstractC0756h.m2050p0(objArr, objArr, i5, m2048e2, m2048e);
                } else if (i5 >= objArr.length) {
                    AbstractC0756h.m2050p0(objArr, objArr, i5 - objArr.length, m2048e2, m2048e);
                } else {
                    int length = m2048e - (i6 - objArr.length);
                    AbstractC0756h.m2050p0(objArr, objArr, 0, length, m2048e);
                    Object[] objArr2 = this.f2993b;
                    AbstractC0756h.m2050p0(objArr2, objArr2, i5, m2048e2, length);
                }
            } else {
                Object[] objArr3 = this.f2993b;
                AbstractC0756h.m2050p0(objArr3, objArr3, size, 0, m2048e);
                Object[] objArr4 = this.f2993b;
                if (i5 >= objArr4.length) {
                    AbstractC0756h.m2050p0(objArr4, objArr4, i5 - objArr4.length, m2048e2, objArr4.length);
                } else {
                    AbstractC0756h.m2050p0(objArr4, objArr4, 0, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f2993b;
                    AbstractC0756h.m2050p0(objArr5, objArr5, i5, m2048e2, objArr5.length - size);
                }
            }
            m2045b(m2048e2, collection);
            return true;
        }
        int i7 = this.f2992a;
        int i8 = i7 - size;
        if (m2048e2 < i7) {
            Object[] objArr6 = this.f2993b;
            AbstractC0756h.m2050p0(objArr6, objArr6, i8, i7, objArr6.length);
            if (size >= m2048e2) {
                Object[] objArr7 = this.f2993b;
                AbstractC0756h.m2050p0(objArr7, objArr7, objArr7.length - size, 0, m2048e2);
            } else {
                Object[] objArr8 = this.f2993b;
                AbstractC0756h.m2050p0(objArr8, objArr8, objArr8.length - size, 0, size);
                Object[] objArr9 = this.f2993b;
                AbstractC0756h.m2050p0(objArr9, objArr9, 0, size, m2048e2);
            }
        } else if (i8 >= 0) {
            Object[] objArr10 = this.f2993b;
            AbstractC0756h.m2050p0(objArr10, objArr10, i8, i7, m2048e2);
        } else {
            Object[] objArr11 = this.f2993b;
            i8 += objArr11.length;
            int i9 = m2048e2 - i7;
            int length2 = objArr11.length - i8;
            if (length2 >= i9) {
                AbstractC0756h.m2050p0(objArr11, objArr11, i8, i7, m2048e2);
            } else {
                AbstractC0756h.m2050p0(objArr11, objArr11, i8, i7, i7 + length2);
                Object[] objArr12 = this.f2993b;
                AbstractC0756h.m2050p0(objArr12, objArr12, 0, this.f2992a + length2, m2048e2);
            }
        }
        this.f2992a = i8;
        int i10 = m2048e2 - size;
        if (i10 < 0) {
            i10 += this.f2993b.length;
        }
        m2045b(i10, collection);
        return true;
    }

    /* renamed from: b */
    public final void m2045b(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2993b.length;
        while (i2 < length && it.hasNext()) {
            this.f2993b[i2] = it.next();
            i2++;
        }
        int i3 = this.f2992a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f2993b[i4] = it.next();
        }
        this.f2994c = collection.size() + this.f2994c;
    }

    /* renamed from: c */
    public final void m2046c(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2993b;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f2991d) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f2993b = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        AbstractC0756h.m2050p0(objArr, objArr2, 0, this.f2992a, objArr.length);
        Object[] objArr3 = this.f2993b;
        int length2 = objArr3.length;
        int i4 = this.f2992a;
        AbstractC0756h.m2050p0(objArr3, objArr2, length2 - i4, 0, i4);
        this.f2992a = 0;
        this.f2993b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int m2048e = m2048e(this.f2992a + this.f2994c);
        int i2 = this.f2992a;
        if (i2 < m2048e) {
            AbstractC0756h.m2052r0(this.f2993b, i2, m2048e);
        } else if (!isEmpty()) {
            Object[] objArr = this.f2993b;
            AbstractC0756h.m2052r0(objArr, this.f2992a, objArr.length);
            AbstractC0756h.m2052r0(this.f2993b, 0, m2048e);
        }
        this.f2992a = 0;
        this.f2994c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m2047d(int i2) {
        AbstractC1136c.m2637e(this.f2993b, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    /* renamed from: e */
    public final int m2048e(int i2) {
        Object[] objArr = this.f2993b;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f2994c;
        if (i2 >= 0 && i2 < i3) {
            return this.f2993b[m2048e(this.f2992a + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int m2048e = m2048e(this.f2992a + this.f2994c);
        int i3 = this.f2992a;
        if (i3 < m2048e) {
            while (i3 < m2048e) {
                if (AbstractC1136c.m2633a(obj, this.f2993b[i3])) {
                    i2 = this.f2992a;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < m2048e) {
            return -1;
        }
        int length = this.f2993b.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < m2048e; i4++) {
                    if (AbstractC1136c.m2633a(obj, this.f2993b[i4])) {
                        i3 = i4 + this.f2993b.length;
                        i2 = this.f2992a;
                    }
                }
                return -1;
            }
            if (AbstractC1136c.m2633a(obj, this.f2993b[i3])) {
                i2 = this.f2992a;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2994c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int m2048e = m2048e(this.f2992a + this.f2994c);
        int i3 = this.f2992a;
        if (i3 < m2048e) {
            length = m2048e - 1;
            if (i3 <= length) {
                while (!AbstractC1136c.m2633a(obj, this.f2993b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f2992a;
                return length - i2;
            }
            return -1;
        }
        if (i3 > m2048e) {
            int i4 = m2048e - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f2993b;
                    AbstractC1136c.m2637e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f2992a;
                    if (i5 <= length) {
                        while (!AbstractC1136c.m2633a(obj, this.f2993b[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f2992a;
                    }
                } else {
                    if (AbstractC1136c.m2633a(obj, this.f2993b[i4])) {
                        length = i4 + this.f2993b.length;
                        i2 = this.f2992a;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3 = this.f2994c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == size() - 1) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int m2048e = m2048e((size() - 1) + this.f2992a);
            Object[] objArr = this.f2993b;
            Object obj = objArr[m2048e];
            objArr[m2048e] = null;
            this.f2994c--;
            return obj;
        }
        if (i2 == 0) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            Object[] objArr2 = this.f2993b;
            int i4 = this.f2992a;
            Object obj2 = objArr2[i4];
            objArr2[i4] = null;
            this.f2992a = m2047d(i4);
            this.f2994c--;
            return obj2;
        }
        int m2048e2 = m2048e(this.f2992a + i2);
        Object[] objArr3 = this.f2993b;
        Object obj3 = objArr3[m2048e2];
        if (i2 < (this.f2994c >> 1)) {
            int i5 = this.f2992a;
            if (m2048e2 >= i5) {
                AbstractC0756h.m2050p0(objArr3, objArr3, i5 + 1, i5, m2048e2);
            } else {
                AbstractC0756h.m2050p0(objArr3, objArr3, 1, 0, m2048e2);
                Object[] objArr4 = this.f2993b;
                objArr4[0] = objArr4[objArr4.length - 1];
                int i6 = this.f2992a;
                AbstractC0756h.m2050p0(objArr4, objArr4, i6 + 1, i6, objArr4.length - 1);
            }
            Object[] objArr5 = this.f2993b;
            int i7 = this.f2992a;
            objArr5[i7] = null;
            this.f2992a = m2047d(i7);
        } else {
            int m2048e3 = m2048e((size() - 1) + this.f2992a);
            if (m2048e2 <= m2048e3) {
                Object[] objArr6 = this.f2993b;
                AbstractC0756h.m2050p0(objArr6, objArr6, m2048e2, m2048e2 + 1, m2048e3 + 1);
            } else {
                Object[] objArr7 = this.f2993b;
                AbstractC0756h.m2050p0(objArr7, objArr7, m2048e2, m2048e2 + 1, objArr7.length);
                Object[] objArr8 = this.f2993b;
                objArr8[objArr8.length - 1] = objArr8[0];
                AbstractC0756h.m2050p0(objArr8, objArr8, 0, 1, m2048e3 + 1);
            }
            this.f2993b[m2048e3] = null;
        }
        this.f2994c--;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int m2048e;
        AbstractC1136c.m2637e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2993b.length != 0) {
            int m2048e2 = m2048e(this.f2992a + this.f2994c);
            int i2 = this.f2992a;
            if (i2 < m2048e2) {
                m2048e = i2;
                while (i2 < m2048e2) {
                    Object obj = this.f2993b[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f2993b[m2048e] = obj;
                        m2048e++;
                    }
                    i2++;
                }
                AbstractC0756h.m2052r0(this.f2993b, m2048e, m2048e2);
            } else {
                int length = this.f2993b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f2993b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f2993b[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                m2048e = m2048e(i3);
                for (int i4 = 0; i4 < m2048e2; i4++) {
                    Object[] objArr2 = this.f2993b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f2993b[m2048e] = obj3;
                        m2048e = m2047d(m2048e);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i5 = m2048e - this.f2992a;
                if (i5 < 0) {
                    i5 += this.f2993b.length;
                }
                this.f2994c = i5;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int m2048e;
        AbstractC1136c.m2637e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2993b.length != 0) {
            int m2048e2 = m2048e(this.f2992a + this.f2994c);
            int i2 = this.f2992a;
            if (i2 < m2048e2) {
                m2048e = i2;
                while (i2 < m2048e2) {
                    Object obj = this.f2993b[i2];
                    if (collection.contains(obj)) {
                        this.f2993b[m2048e] = obj;
                        m2048e++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                AbstractC0756h.m2052r0(this.f2993b, m2048e, m2048e2);
            } else {
                int length = this.f2993b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f2993b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f2993b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                m2048e = m2048e(i3);
                for (int i4 = 0; i4 < m2048e2; i4++) {
                    Object[] objArr2 = this.f2993b;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f2993b[m2048e] = obj3;
                        m2048e = m2047d(m2048e);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                int i5 = m2048e - this.f2992a;
                if (i5 < 0) {
                    i5 += this.f2993b.length;
                }
                this.f2994c = i5;
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.f2994c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int m2048e = m2048e(this.f2992a + i2);
        Object[] objArr = this.f2993b;
        Object obj2 = objArr[m2048e];
        objArr[m2048e] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2994c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f2994c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC1136c.m2637e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f2994c;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            AbstractC1136c.m2635c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int m2048e = m2048e(this.f2992a + this.f2994c);
        int i3 = this.f2992a;
        if (i3 < m2048e) {
            AbstractC0756h.m2050p0(this.f2993b, objArr, 0, i3, m2048e);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2993b;
            AbstractC0756h.m2050p0(objArr2, objArr, 0, this.f2992a, objArr2.length);
            Object[] objArr3 = this.f2993b;
            AbstractC0756h.m2050p0(objArr3, objArr, objArr3.length - this.f2992a, 0, m2048e);
        }
        int length2 = objArr.length;
        int i4 = this.f2994c;
        if (length2 > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2044a(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC1136c.m2637e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m2046c(collection.size() + this.f2994c);
        m2045b(m2048e(this.f2992a + this.f2994c), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
