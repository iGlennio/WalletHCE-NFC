package p057V0;

import java.lang.reflect.Type;
import java.util.Map;
import p005C.AbstractC0044g;
import p034M0.C0360e;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p051S0.C0472g;
import p055U0.InterfaceC0501o;
import p068a1.C0558a;
import p068a1.C0559b;

/* renamed from: V0.e */
/* loaded from: classes.dex */
public final class C0517e extends AbstractC0477l {

    /* renamed from: a */
    public final C0525m f1410a;

    /* renamed from: b */
    public final C0525m f1411b;

    /* renamed from: c */
    public final InterfaceC0501o f1412c;

    /* renamed from: d */
    public final /* synthetic */ C0515c f1413d;

    public C0517e(C0515c c0515c, C0469d c0469d, Type type, AbstractC0477l abstractC0477l, Type type2, AbstractC0477l abstractC0477l2, InterfaceC0501o interfaceC0501o) {
        this.f1413d = c0515c;
        this.f1410a = new C0525m(c0469d, abstractC0477l, type);
        this.f1411b = new C0525m(c0469d, abstractC0477l2, type2);
        this.f1412c = interfaceC0501o;
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        int m1303B = c0558a.m1303B();
        if (m1303B == 9) {
            c0558a.m1328x();
            return null;
        }
        Map map = (Map) this.f1412c.mo178n();
        C0525m c0525m = this.f1411b;
        C0525m c0525m2 = this.f1410a;
        AbstractC0477l abstractC0477l = (AbstractC0477l) c0525m.f1440c;
        AbstractC0477l abstractC0477l2 = (AbstractC0477l) c0525m2.f1440c;
        if (m1303B == 1) {
            c0558a.m1311g();
            while (c0558a.m1319o()) {
                c0558a.m1311g();
                Object mo1221a = abstractC0477l2.mo1221a(c0558a);
                if (map.put(mo1221a, abstractC0477l.mo1221a(c0558a)) != null) {
                    throw new C0472g("duplicate key: " + mo1221a);
                }
                c0558a.m1315k();
            }
            c0558a.m1315k();
            return map;
        }
        c0558a.m1312h();
        while (c0558a.m1319o()) {
            C0360e.f912c.getClass();
            int i2 = c0558a.f1533h;
            if (i2 == 0) {
                i2 = c0558a.m1314j();
            }
            if (i2 == 13) {
                c0558a.f1533h = 9;
            } else if (i2 == 12) {
                c0558a.f1533h = 8;
            } else {
                if (i2 != 14) {
                    throw new IllegalStateException("Expected a name but was " + AbstractC0044g.m160l(c0558a.m1303B()) + c0558a.m1321q());
                }
                c0558a.f1533h = 10;
            }
            Object mo1221a2 = abstractC0477l2.mo1221a(c0558a);
            if (map.put(mo1221a2, abstractC0477l.mo1221a(c0558a)) != null) {
                throw new C0472g("duplicate key: " + mo1221a2);
            }
        }
        c0558a.m1316l();
        return map;
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            c0559b.m1339o();
            return;
        }
        this.f1413d.getClass();
        C0525m c0525m = this.f1411b;
        c0559b.m1333i();
        for (Map.Entry entry : map.entrySet()) {
            c0559b.m1337m(String.valueOf(entry.getKey()));
            c0525m.mo1222b(c0559b, entry.getValue());
        }
        c0559b.m1336l();
    }
}
