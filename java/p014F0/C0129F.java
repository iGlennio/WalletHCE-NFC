package p014F0;

import java.util.Comparator;

/* renamed from: F0.F */
/* loaded from: classes.dex */
public final class C0129F implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f353a;

    public /* synthetic */ C0129F(int i2) {
        this.f353a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 != false) goto L27;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            int r3 = r6.f353a
            switch(r3) {
                case 0: goto L69;
                case 1: goto L60;
                case 2: goto L2c;
                case 3: goto L22;
                default: goto L8;
            }
        L8:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r3 = p027K.AbstractC0272P.f768a
            float r7 = p027K.AbstractC0261E.m752m(r7)
            float r8 = p027K.AbstractC0261E.m752m(r8)
            int r3 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r3 <= 0) goto L1c
            r0 = r2
            goto L21
        L1c:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L21
            r0 = r1
        L21:
            return r0
        L22:
            q.f r7 = (p107q.C1182f) r7
            q.f r8 = (p107q.C1182f) r8
            int r7 = r7.f4506b
            int r8 = r8.f4506b
            int r7 = r7 - r8
            return r7
        L2c:
            f0.m r7 = (p079f0.C0849m) r7
            f0.m r8 = (p079f0.C0849m) r8
            androidx.recyclerview.widget.RecyclerView r3 = r7.f3425d
            if (r3 != 0) goto L36
            r4 = r1
            goto L37
        L36:
            r4 = r0
        L37:
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3425d
            if (r5 != 0) goto L3d
            r5 = r1
            goto L3e
        L3d:
            r5 = r0
        L3e:
            if (r4 == r5) goto L43
            if (r3 != 0) goto L4b
            goto L4d
        L43:
            boolean r3 = r7.f3422a
            boolean r4 = r8.f3422a
            if (r3 == r4) goto L4f
            if (r3 == 0) goto L4d
        L4b:
            r0 = r2
            goto L5f
        L4d:
            r0 = r1
            goto L5f
        L4f:
            int r1 = r8.f3423b
            int r2 = r7.f3423b
            int r1 = r1 - r2
            if (r1 == 0) goto L57
            goto L4d
        L57:
            int r7 = r7.f3424c
            int r8 = r8.f3424c
            int r7 = r7 - r8
            if (r7 == 0) goto L5f
            r0 = r7
        L5f:
            return r0
        L60:
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r7 = r7.compareTo(r8)
            return r7
        L69:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r7.getTop()
            int r8 = r8.getTop()
            int r7 = r7 - r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p014F0.C0129F.compare(java.lang.Object, java.lang.Object):int");
    }
}
