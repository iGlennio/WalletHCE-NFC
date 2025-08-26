package p001A1;

import androidx.emoji2.text.C0605s;
import java.util.ArrayList;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p123v1.C1283m;
import p123v1.C1290t;
import p123v1.InterfaceC1284n;
import p135z1.C1337e;
import p135z1.C1340h;

/* renamed from: A1.g */
/* loaded from: classes.dex */
public final class C0008g {

    /* renamed from: a */
    public int f5a;

    /* renamed from: b */
    public final C1340h f6b;

    /* renamed from: c */
    public final ArrayList f7c;

    /* renamed from: d */
    public final int f8d;

    /* renamed from: e */
    public final C0605s f9e;

    /* renamed from: f */
    public final C1032t f10f;

    /* renamed from: g */
    public final int f11g;

    /* renamed from: h */
    public final int f12h;

    /* renamed from: i */
    public final int f13i;

    public C0008g(C1340h c1340h, ArrayList arrayList, int i2, C0605s c0605s, C1032t c1032t, int i3, int i4, int i5) {
        AbstractC1136c.m2637e(c1340h, "call");
        this.f6b = c1340h;
        this.f7c = arrayList;
        this.f8d = i2;
        this.f9e = c0605s;
        this.f10f = c1032t;
        this.f11g = i3;
        this.f12h = i4;
        this.f13i = i5;
    }

    /* renamed from: a */
    public static C0008g m20a(C0008g c0008g, int i2, C0605s c0605s, C1032t c1032t, int i3) {
        if ((i3 & 1) != 0) {
            i2 = c0008g.f8d;
        }
        int i4 = i2;
        if ((i3 & 2) != 0) {
            c0605s = c0008g.f9e;
        }
        C0605s c0605s2 = c0605s;
        if ((i3 & 4) != 0) {
            c1032t = c0008g.f10f;
        }
        C1032t c1032t2 = c1032t;
        AbstractC1136c.m2637e(c1032t2, "request");
        return new C0008g(c0008g.f6b, c0008g.f7c, i4, c0605s2, c1032t2, c0008g.f11g, c0008g.f12h, c0008g.f13i);
    }

    /* renamed from: b */
    public final C1290t m21b(C1032t c1032t) {
        AbstractC1136c.m2637e(c1032t, "request");
        ArrayList arrayList = this.f7c;
        int size = arrayList.size();
        int i2 = this.f8d;
        if (i2 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f5a++;
        C0605s c0605s = this.f9e;
        if (c0605s != null) {
            if (!((C1337e) c0605s.f2013c).m3082b((C1283m) c1032t.f4045c)) {
                throw new IllegalStateException(("network interceptor " + ((InterfaceC1284n) arrayList.get(i2 - 1)) + " must retain the same host and port").toString());
            }
            if (this.f5a != 1) {
                throw new IllegalStateException(("network interceptor " + ((InterfaceC1284n) arrayList.get(i2 - 1)) + " must call proceed() exactly once").toString());
            }
        }
        int i3 = i2 + 1;
        C0008g m20a = m20a(this, i3, null, c1032t, 58);
        InterfaceC1284n interfaceC1284n = (InterfaceC1284n) arrayList.get(i2);
        C1290t mo7a = interfaceC1284n.mo7a(m20a);
        if (mo7a == null) {
            throw new NullPointerException("interceptor " + interfaceC1284n + " returned null");
        }
        if (c0605s != null && i3 < arrayList.size() && m20a.f5a != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC1284n + " must call proceed() exactly once").toString());
        }
        if (mo7a.f5287g != null) {
            return mo7a;
        }
        throw new IllegalStateException(("interceptor " + interfaceC1284n + " returned a response with no body").toString());
    }
}
