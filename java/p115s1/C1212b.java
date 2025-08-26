package p115s1;

import java.util.ArrayDeque;

/* renamed from: s1.b */
/* loaded from: classes.dex */
public final class C1212b {

    /* renamed from: a */
    public final ArrayDeque f4758a;

    /* renamed from: b */
    public boolean f4759b;

    /* renamed from: c */
    public boolean f4760c;

    /* renamed from: d */
    public boolean f4761d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1212b(p115s1.C1212b r7) {
        /*
            r6 = this;
            r7.getClass()
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.ArrayDeque r1 = r7.f4758a
            int r2 = r1.size()
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            s1.a r2 = (p115s1.C1211a) r2
            s1.a r3 = new s1.a
            int r4 = r2.f4755a
            int r5 = r2.f4756b
            int r2 = r2.f4757c
            r3.<init>(r4, r5, r2)
            r0.addLast(r3)
            goto L12
        L2d:
            boolean r1 = r7.f4759b
            boolean r2 = r7.f4760c
            boolean r7 = r7.f4761d
            r6.<init>(r0, r1, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p115s1.C1212b.<init>(s1.b):void");
    }

    /* renamed from: a */
    public final void m2854a(int i2) {
        ArrayDeque arrayDeque = this.f4758a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C1211a c1211a = (C1211a) arrayDeque.peek();
        int i3 = c1211a.f4756b;
        int i4 = c1211a.f4757c;
        int i5 = i3 - i4;
        if (i2 > i5) {
            throw new IllegalArgumentException("Cannot process " + i2 + " bytes! Only " + i5 + " bytes left in this TLV object " + c1211a);
        }
        int i6 = i4 + i2;
        c1211a.f4757c = i6;
        if (i6 != i3) {
            this.f4759b = false;
            this.f4760c = false;
            this.f4761d = true;
        } else {
            arrayDeque.pop();
            m2854a(i3);
            this.f4759b = true;
            this.f4760c = false;
            this.f4761d = false;
        }
    }

    public final String toString() {
        return this.f4758a.toString();
    }

    public C1212b(ArrayDeque arrayDeque, boolean z2, boolean z3, boolean z4) {
        this.f4758a = arrayDeque;
        this.f4759b = z2;
        this.f4760c = z3;
        this.f4761d = z4;
    }
}
