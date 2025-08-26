package p107q;

import java.util.ArrayList;
import p017G0.C0176h;

/* renamed from: q.b */
/* loaded from: classes.dex */
public class C1178b {

    /* renamed from: d */
    public final C1177a f4481d;

    /* renamed from: a */
    public C1182f f4478a = null;

    /* renamed from: b */
    public float f4479b = 0.0f;

    /* renamed from: c */
    public final ArrayList f4480c = new ArrayList();

    /* renamed from: e */
    public boolean f4482e = false;

    public C1178b(C0176h c0176h) {
        this.f4481d = new C1177a(this, c0176h);
    }

    /* renamed from: a */
    public final void m2709a(C1179c c1179c, int i2) {
        this.f4481d.m2707g(c1179c.m2728j(i2), 1.0f);
        this.f4481d.m2707g(c1179c.m2728j(i2), -1.0f);
    }

    /* renamed from: b */
    public final void m2710b(C1182f c1182f, C1182f c1182f2, C1182f c1182f3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f4479b = i2;
        }
        if (z2) {
            this.f4481d.m2707g(c1182f, 1.0f);
            this.f4481d.m2707g(c1182f2, -1.0f);
            this.f4481d.m2707g(c1182f3, -1.0f);
        } else {
            this.f4481d.m2707g(c1182f, -1.0f);
            this.f4481d.m2707g(c1182f2, 1.0f);
            this.f4481d.m2707g(c1182f3, 1.0f);
        }
    }

    /* renamed from: c */
    public final void m2711c(C1182f c1182f, C1182f c1182f2, C1182f c1182f3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f4479b = i2;
        }
        if (z2) {
            this.f4481d.m2707g(c1182f, 1.0f);
            this.f4481d.m2707g(c1182f2, -1.0f);
            this.f4481d.m2707g(c1182f3, 1.0f);
        } else {
            this.f4481d.m2707g(c1182f, -1.0f);
            this.f4481d.m2707g(c1182f2, 1.0f);
            this.f4481d.m2707g(c1182f3, -1.0f);
        }
    }

    /* renamed from: d */
    public C1182f mo2712d(boolean[] zArr) {
        return m2714f(zArr, null);
    }

    /* renamed from: e */
    public boolean mo2713e() {
        return this.f4478a == null && this.f4479b == 0.0f && this.f4481d.m2704d() == 0;
    }

    /* renamed from: f */
    public final C1182f m2714f(boolean[] zArr, C1182f c1182f) {
        int i2;
        int m2704d = this.f4481d.m2704d();
        C1182f c1182f2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < m2704d; i3++) {
            float m2706f = this.f4481d.m2706f(i3);
            if (m2706f < 0.0f) {
                C1182f m2705e = this.f4481d.m2705e(i3);
                if ((zArr == null || !zArr[m2705e.f4506b]) && m2705e != c1182f && (((i2 = m2705e.f4516l) == 3 || i2 == 4) && m2706f < f)) {
                    f = m2706f;
                    c1182f2 = m2705e;
                }
            }
        }
        return c1182f2;
    }

    /* renamed from: g */
    public final void m2715g(C1182f c1182f) {
        C1182f c1182f2 = this.f4478a;
        if (c1182f2 != null) {
            this.f4481d.m2707g(c1182f2, -1.0f);
            this.f4478a.f4507c = -1;
            this.f4478a = null;
        }
        float m2708h = this.f4481d.m2708h(c1182f, true) * (-1.0f);
        this.f4478a = c1182f;
        if (m2708h == 1.0f) {
            return;
        }
        this.f4479b /= m2708h;
        C1177a c1177a = this.f4481d;
        int i2 = c1177a.f4475h;
        for (int i3 = 0; i2 != -1 && i3 < c1177a.f4468a; i3++) {
            float[] fArr = c1177a.f4474g;
            fArr[i2] = fArr[i2] / m2708h;
            i2 = c1177a.f4473f[i2];
        }
    }

    /* renamed from: h */
    public final void m2716h(C1179c c1179c, C1182f c1182f, boolean z2) {
        if (c1182f == null || !c1182f.f4510f) {
            return;
        }
        float m2703c = this.f4481d.m2703c(c1182f);
        this.f4479b = (c1182f.f4509e * m2703c) + this.f4479b;
        this.f4481d.m2708h(c1182f, z2);
        if (z2) {
            c1182f.m2743b(this);
        }
        if (this.f4481d.m2704d() == 0) {
            this.f4482e = true;
            c1179c.f4485a = true;
        }
    }

    /* renamed from: i */
    public void mo2717i(C1179c c1179c, C1178b c1178b, boolean z2) {
        C1177a c1177a = this.f4481d;
        c1177a.getClass();
        float m2703c = c1177a.m2703c(c1178b.f4478a);
        c1177a.m2708h(c1178b.f4478a, z2);
        C1177a c1177a2 = c1178b.f4481d;
        int m2704d = c1177a2.m2704d();
        for (int i2 = 0; i2 < m2704d; i2++) {
            C1182f m2705e = c1177a2.m2705e(i2);
            c1177a.m2701a(m2705e, c1177a2.m2703c(m2705e) * m2703c, z2);
        }
        this.f4479b = (c1178b.f4479b * m2703c) + this.f4479b;
        if (z2) {
            c1178b.f4478a.m2743b(this);
        }
        if (this.f4478a == null || this.f4481d.m2704d() != 0) {
            return;
        }
        this.f4482e = true;
        c1179c.f4485a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            q.f r0 = r10.f4478a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            q.f r1 = r10.f4478a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = p005C.AbstractC0044g.m154f(r0, r1)
            float r1 = r10.f4479b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f4479b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            q.a r5 = r10.f4481d
            int r5 = r5.m2704d()
        L40:
            if (r4 >= r5) goto La0
            q.a r6 = r10.f4481d
            q.f r6 = r6.m2705e(r4)
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            q.a r7 = r10.f4481d
            float r7 = r7.m2706f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L9d
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7a
            java.lang.String r1 = "- "
            java.lang.String r0 = p005C.AbstractC0044g.m154f(r0, r1)
        L68:
            float r7 = r7 * r9
            goto L7a
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = p005C.AbstractC0044g.m154f(r0, r1)
            goto L7a
        L73:
            java.lang.String r1 = " - "
            java.lang.String r0 = p005C.AbstractC0044g.m154f(r0, r1)
            goto L68
        L7a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L85
            java.lang.String r0 = p005C.AbstractC0044g.m154f(r0, r6)
            goto L9c
        L85:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L9c:
            r1 = r3
        L9d:
            int r4 = r4 + 1
            goto L40
        La0:
            if (r1 != 0) goto La8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = p005C.AbstractC0044g.m154f(r0, r1)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p107q.C1178b.toString():java.lang.String");
    }
}
