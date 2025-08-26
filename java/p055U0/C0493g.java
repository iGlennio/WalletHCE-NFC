package p055U0;

import java.util.List;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p051S0.InterfaceC0478m;
import p065Z0.C0551a;
import p068a1.C0558a;
import p068a1.C0559b;

/* renamed from: U0.g */
/* loaded from: classes.dex */
public final class C0493g extends AbstractC0477l {

    /* renamed from: a */
    public AbstractC0477l f1343a;

    /* renamed from: b */
    public final /* synthetic */ boolean f1344b;

    /* renamed from: c */
    public final /* synthetic */ boolean f1345c;

    /* renamed from: d */
    public final /* synthetic */ C0469d f1346d;

    /* renamed from: e */
    public final /* synthetic */ C0551a f1347e;

    /* renamed from: f */
    public final /* synthetic */ C0494h f1348f;

    public C0493g(C0494h c0494h, boolean z2, boolean z3, C0469d c0469d, C0551a c0551a) {
        this.f1348f = c0494h;
        this.f1344b = z2;
        this.f1345c = z3;
        this.f1346d = c0469d;
        this.f1347e = c0551a;
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        if (this.f1344b) {
            c0558a.m1309H();
            return null;
        }
        AbstractC0477l abstractC0477l = this.f1343a;
        if (abstractC0477l == null) {
            C0551a c0551a = this.f1347e;
            C0469d c0469d = this.f1346d;
            List<InterfaceC0478m> list = c0469d.f1282e;
            InterfaceC0478m interfaceC0478m = this.f1348f;
            if (!list.contains(interfaceC0478m)) {
                interfaceC0478m = c0469d.f1281d;
            }
            boolean z2 = false;
            for (InterfaceC0478m interfaceC0478m2 : list) {
                if (z2) {
                    AbstractC0477l mo1231a = interfaceC0478m2.mo1231a(c0469d, c0551a);
                    if (mo1231a != null) {
                        this.f1343a = mo1231a;
                        abstractC0477l = mo1231a;
                    }
                } else if (interfaceC0478m2 == interfaceC0478m) {
                    z2 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c0551a);
        }
        return abstractC0477l.mo1221a(c0558a);
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        if (this.f1345c) {
            c0559b.m1339o();
            return;
        }
        AbstractC0477l abstractC0477l = this.f1343a;
        if (abstractC0477l == null) {
            C0551a c0551a = this.f1347e;
            C0469d c0469d = this.f1346d;
            List<InterfaceC0478m> list = c0469d.f1282e;
            InterfaceC0478m interfaceC0478m = this.f1348f;
            if (!list.contains(interfaceC0478m)) {
                interfaceC0478m = c0469d.f1281d;
            }
            boolean z2 = false;
            for (InterfaceC0478m interfaceC0478m2 : list) {
                if (z2) {
                    AbstractC0477l mo1231a = interfaceC0478m2.mo1231a(c0469d, c0551a);
                    if (mo1231a != null) {
                        this.f1343a = mo1231a;
                        abstractC0477l = mo1231a;
                    }
                } else if (interfaceC0478m2 == interfaceC0478m) {
                    z2 = true;
                }
            }
            throw new IllegalArgumentException("GSON cannot serialize " + c0551a);
        }
        abstractC0477l.mo1222b(c0559b, obj);
    }
}
