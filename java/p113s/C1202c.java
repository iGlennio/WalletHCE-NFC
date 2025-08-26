package p113s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p005C.AbstractC0044g;
import p107q.AbstractC1181e;
import p107q.C1182f;
import p116t.AbstractC1222h;
import p116t.C1228n;

/* renamed from: s.c */
/* loaded from: classes.dex */
public final class C1202c {

    /* renamed from: b */
    public int f4593b;

    /* renamed from: c */
    public boolean f4594c;

    /* renamed from: d */
    public final C1203d f4595d;

    /* renamed from: e */
    public final int f4596e;

    /* renamed from: f */
    public C1202c f4597f;

    /* renamed from: i */
    public C1182f f4600i;

    /* renamed from: a */
    public HashSet f4592a = null;

    /* renamed from: g */
    public int f4598g = 0;

    /* renamed from: h */
    public int f4599h = Integer.MIN_VALUE;

    public C1202c(C1203d c1203d, int i2) {
        this.f4595d = c1203d;
        this.f4596e = i2;
    }

    /* renamed from: a */
    public final void m2781a(C1202c c1202c, int i2) {
        m2782b(c1202c, i2, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public final boolean m2782b(C1202c c1202c, int i2, int i3, boolean z2) {
        if (c1202c == null) {
            m2790j();
            return true;
        }
        if (!z2 && !m2789i(c1202c)) {
            return false;
        }
        this.f4597f = c1202c;
        if (c1202c.f4592a == null) {
            c1202c.f4592a = new HashSet();
        }
        HashSet hashSet = this.f4597f.f4592a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4598g = i2;
        this.f4599h = i3;
        return true;
    }

    /* renamed from: c */
    public final void m2783c(int i2, ArrayList arrayList, C1228n c1228n) {
        HashSet hashSet = this.f4592a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC1222h.m2878b(((C1202c) it.next()).f4595d, i2, arrayList, c1228n);
            }
        }
    }

    /* renamed from: d */
    public final int m2784d() {
        if (this.f4594c) {
            return this.f4593b;
        }
        return 0;
    }

    /* renamed from: e */
    public final int m2785e() {
        C1202c c1202c;
        if (this.f4595d.f4640g0 == 8) {
            return 0;
        }
        int i2 = this.f4599h;
        return (i2 == Integer.MIN_VALUE || (c1202c = this.f4597f) == null || c1202c.f4595d.f4640g0 != 8) ? this.f4598g : i2;
    }

    /* renamed from: f */
    public final C1202c m2786f() {
        int i2 = this.f4596e;
        int m2740a = AbstractC1181e.m2740a(i2);
        C1203d c1203d = this.f4595d;
        switch (m2740a) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c1203d.f4611K;
            case 2:
                return c1203d.f4612L;
            case 3:
                return c1203d.f4609I;
            case 4:
                return c1203d.f4610J;
            default:
                throw new AssertionError(AbstractC0044g.m159k(i2));
        }
    }

    /* renamed from: g */
    public final boolean m2787g() {
        HashSet hashSet = this.f4592a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1202c) it.next()).m2786f().m2788h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m2788h() {
        return this.f4597f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2789i(p113s.C1202c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            r1 = 6
            int r2 = r10.f4596e
            r3 = 1
            s.d r4 = r11.f4595d
            int r11 = r11.f4596e
            if (r11 != r2) goto L1c
            if (r2 != r1) goto L63
            boolean r11 = r4.f4605E
            if (r11 == 0) goto L65
            s.d r11 = r10.f4595d
            boolean r11 = r11.f4605E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = p107q.AbstractC1181e.m2740a(r2)
            r6 = 8
            r7 = 9
            r8 = 4
            r9 = 2
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = p005C.AbstractC0044g.m159k(r2)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r1) goto L65
            if (r11 == r6) goto L65
            if (r11 == r7) goto L65
            goto L63
        L3a:
            if (r11 == r9) goto L65
            if (r11 != r8) goto L63
            goto L65
        L3f:
            r1 = 3
            if (r11 == r1) goto L48
            r1 = 5
            if (r11 != r1) goto L46
            goto L48
        L46:
            r1 = r0
            goto L49
        L48:
            r1 = r3
        L49:
            boolean r2 = r4 instanceof p113s.C1207h
            if (r2 == 0) goto L52
            if (r1 != 0) goto L63
            if (r11 != r7) goto L65
            goto L63
        L52:
            return r1
        L53:
            if (r11 == r9) goto L5a
            if (r11 != r8) goto L58
            goto L5a
        L58:
            r1 = r0
            goto L5b
        L5a:
            r1 = r3
        L5b:
            boolean r2 = r4 instanceof p113s.C1207h
            if (r2 == 0) goto L64
            if (r1 != 0) goto L63
            if (r11 != r6) goto L65
        L63:
            return r3
        L64:
            return r1
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p113s.C1202c.m2789i(s.c):boolean");
    }

    /* renamed from: j */
    public final void m2790j() {
        HashSet hashSet;
        C1202c c1202c = this.f4597f;
        if (c1202c != null && (hashSet = c1202c.f4592a) != null) {
            hashSet.remove(this);
            if (this.f4597f.f4592a.size() == 0) {
                this.f4597f.f4592a = null;
            }
        }
        this.f4592a = null;
        this.f4597f = null;
        this.f4598g = 0;
        this.f4599h = Integer.MIN_VALUE;
        this.f4594c = false;
        this.f4593b = 0;
    }

    /* renamed from: k */
    public final void m2791k() {
        C1182f c1182f = this.f4600i;
        if (c1182f == null) {
            this.f4600i = new C1182f(1);
        } else {
            c1182f.m2744c();
        }
    }

    /* renamed from: l */
    public final void m2792l(int i2) {
        this.f4593b = i2;
        this.f4594c = true;
    }

    public final String toString() {
        return this.f4595d.f4642h0 + ":" + AbstractC0044g.m159k(this.f4596e);
    }
}
