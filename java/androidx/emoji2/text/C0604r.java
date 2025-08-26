package androidx.emoji2.text;

import android.util.SparseArray;

/* renamed from: androidx.emoji2.text.r */
/* loaded from: classes.dex */
public final class C0604r {

    /* renamed from: a */
    public final SparseArray f2009a;

    /* renamed from: b */
    public C0600n f2010b;

    public C0604r(int i2) {
        this.f2009a = new SparseArray(i2);
    }

    /* renamed from: a */
    public final void m1538a(C0600n c0600n, int i2, int i3) {
        int m1531a = c0600n.m1531a(i2);
        SparseArray sparseArray = this.f2009a;
        C0604r c0604r = sparseArray == null ? null : (C0604r) sparseArray.get(m1531a);
        if (c0604r == null) {
            c0604r = new C0604r(1);
            sparseArray.put(c0600n.m1531a(i2), c0604r);
        }
        if (i3 > i2) {
            c0604r.m1538a(c0600n, i2 + 1, i3);
        } else {
            c0604r.f2010b = c0600n;
        }
    }
}
