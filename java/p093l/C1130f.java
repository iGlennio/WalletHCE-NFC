package p093l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.f */
/* loaded from: classes.dex */
public class C1130f implements Iterable {

    /* renamed from: a */
    public C1127c f4320a;

    /* renamed from: b */
    public C1127c f4321b;

    /* renamed from: c */
    public final WeakHashMap f4322c = new WeakHashMap();

    /* renamed from: d */
    public int f4323d = 0;

    /* renamed from: a */
    public C1127c mo2619a(Object obj) {
        C1127c c1127c = this.f4320a;
        while (c1127c != null && !c1127c.f4313a.equals(obj)) {
            c1127c = c1127c.f4315c;
        }
        return c1127c;
    }

    /* renamed from: b */
    public Object mo2620b(Object obj) {
        C1127c mo2619a = mo2619a(obj);
        if (mo2619a == null) {
            return null;
        }
        this.f4323d--;
        WeakHashMap weakHashMap = this.f4322c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1129e) it.next()).mo2621a(mo2619a);
            }
        }
        C1127c c1127c = mo2619a.f4316d;
        if (c1127c != null) {
            c1127c.f4315c = mo2619a.f4315c;
        } else {
            this.f4320a = mo2619a.f4315c;
        }
        C1127c c1127c2 = mo2619a.f4315c;
        if (c1127c2 != null) {
            c1127c2.f4316d = c1127c;
        } else {
            this.f4321b = c1127c;
        }
        mo2619a.f4315c = null;
        mo2619a.f4316d = null;
        return mo2619a.f4314b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p093l.C1126b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p093l.C1130f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l.f r7 = (p093l.C1130f) r7
            int r1 = r6.f4323d
            int r3 = r7.f4323d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            l.b r3 = (p093l.C1126b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            l.b r4 = (p093l.C1126b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            l.b r7 = (p093l.C1126b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p093l.C1130f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            C1126b c1126b = (C1126b) it;
            if (!c1126b.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) c1126b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1126b c1126b = new C1126b(this.f4320a, this.f4321b, 0);
        this.f4322c.put(c1126b, Boolean.FALSE);
        return c1126b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1126b c1126b = (C1126b) it;
            if (!c1126b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1126b.next()).toString());
            if (c1126b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
