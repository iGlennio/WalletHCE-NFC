package p079f0;

import android.util.SparseArray;

/* renamed from: f0.M */
/* loaded from: classes.dex */
public final class C0817M {

    /* renamed from: a */
    public SparseArray f3239a;

    /* renamed from: b */
    public int f3240b;

    /* renamed from: a */
    public final C0816L m2197a(int i2) {
        SparseArray sparseArray = this.f3239a;
        C0816L c0816l = (C0816L) sparseArray.get(i2);
        if (c0816l != null) {
            return c0816l;
        }
        C0816L c0816l2 = new C0816L();
        sparseArray.put(i2, c0816l2);
        return c0816l2;
    }
}
