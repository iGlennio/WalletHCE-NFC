package p123v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p010D1.AbstractC0096d;
import p072c1.C0697a;
import p075d1.C0750b;
import p088j.C0985d0;
import p095l1.AbstractC1136c;
import p103o1.C1164a;
import p126w1.AbstractC1302b;

/* renamed from: v1.k */
/* loaded from: classes.dex */
public final class C1281k implements Iterable {

    /* renamed from: a */
    public final String[] f5181a;

    public C1281k(String[] strArr) {
        this.f5181a = strArr;
    }

    /* renamed from: a */
    public final String m2964a(String str) {
        AbstractC1136c.m2637e(str, "name");
        String[] strArr = this.f5181a;
        C1164a m351k0 = AbstractC0096d.m351k0(new C1164a(strArr.length - 2, 0, -1), 2);
        int i2 = m351k0.f4432a;
        int i3 = m351k0.f4433b;
        int i4 = m351k0.f4434c;
        if (i4 >= 0) {
            if (i2 > i3) {
                return null;
            }
        } else if (i2 < i3) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[i2])) {
            if (i2 == i3) {
                return null;
            }
            i2 += i4;
        }
        return strArr[i2 + 1];
    }

    /* renamed from: b */
    public final String m2965b(int i2) {
        return this.f5181a[i2 * 2];
    }

    /* renamed from: c */
    public final C0985d0 m2966c() {
        C0985d0 c0985d0 = new C0985d0(8);
        ArrayList arrayList = (ArrayList) c0985d0.f3904b;
        AbstractC1136c.m2637e(arrayList, "<this>");
        List asList = Arrays.asList(this.f5181a);
        AbstractC1136c.m2636d(asList, "asList(this)");
        arrayList.addAll(asList);
        return c0985d0;
    }

    /* renamed from: d */
    public final String m2967d(int i2) {
        return this.f5181a[(i2 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1281k) {
            return Arrays.equals(this.f5181a, ((C1281k) obj).f5181a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5181a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C0697a[] c0697aArr = new C0697a[size];
        for (int i2 = 0; i2 < size; i2++) {
            c0697aArr[i2] = new C0697a(m2965b(i2), m2967d(i2));
        }
        return new C0750b(1, c0697aArr);
    }

    public final int size() {
        return this.f5181a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            String m2965b = m2965b(i2);
            String m2967d = m2967d(i2);
            sb.append(m2965b);
            sb.append(": ");
            if (AbstractC1302b.m3008q(m2965b)) {
                m2967d = "██";
            }
            sb.append(m2967d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        AbstractC1136c.m2636d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
