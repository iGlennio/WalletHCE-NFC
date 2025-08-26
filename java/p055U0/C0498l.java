package p055U0;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: U0.l */
/* loaded from: classes.dex */
public final class C0498l extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f1359a;

    /* renamed from: b */
    public final /* synthetic */ C0500n f1360b;

    public /* synthetic */ C0498l(C0500n c0500n, int i2) {
        this.f1359a = i2;
        this.f1360b = c0500n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f1359a) {
            case 0:
                this.f1360b.clear();
                break;
            default:
                this.f1360b.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f1359a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            U0.n r0 = r4.f1360b
            boolean r5 = r0.containsKey(r5)
            return r5
        Lc:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L34
            U0.n r0 = r4.f1360b
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L21
            U0.m r0 = r0.m1273a(r2, r1)     // Catch: java.lang.ClassCastException -> L21
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 == 0) goto L31
            java.lang.Object r2 = r0.f1368h
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L31
            r3 = r0
        L31:
            if (r3 == 0) goto L34
            r1 = 1
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p055U0.C0498l.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f1359a) {
            case 0:
                return new C0497k(this.f1360b, 0);
            default:
                return new C0497k(this.f1360b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f1359a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            U0.n r0 = r5.f1360b
            r1 = 0
            r2 = 0
            if (r6 == 0) goto Lf
            U0.m r2 = r0.m1273a(r6, r1)     // Catch: java.lang.ClassCastException -> Lf
        Lf:
            r6 = 1
            if (r2 == 0) goto L15
            r0.m1275c(r2, r6)
        L15:
            if (r2 == 0) goto L18
            r1 = r6
        L18:
            return r1
        L19:
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L1f
            goto L46
        L1f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            U0.n r0 = r5.f1360b
            java.lang.Object r2 = r6.getKey()
            r3 = 0
            if (r2 == 0) goto L2f
            U0.m r2 = r0.m1273a(r2, r1)     // Catch: java.lang.ClassCastException -> L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L3f
            java.lang.Object r4 = r2.f1368h
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r4, r6)
            if (r6 == 0) goto L3f
            r3 = r2
        L3f:
            if (r3 != 0) goto L42
            goto L46
        L42:
            r1 = 1
            r0.m1275c(r3, r1)
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p055U0.C0498l.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f1359a) {
        }
        return this.f1360b.f1374d;
    }
}
