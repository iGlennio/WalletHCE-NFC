package p004B1;

import java.io.IOException;
import p026J1.C0239g;
import p026J1.C0243k;
import p026J1.C0249q;
import p026J1.C0256x;
import p026J1.InterfaceC0254v;
import p095l1.AbstractC1136c;
import p135z1.C1344l;

/* renamed from: B1.b */
/* loaded from: classes.dex */
public abstract class AbstractC0031b implements InterfaceC0254v {

    /* renamed from: a */
    public final C0243k f81a;

    /* renamed from: b */
    public boolean f82b;

    /* renamed from: c */
    public final /* synthetic */ C0037h f83c;

    public AbstractC0031b(C0037h c0037h) {
        this.f83c = c0037h;
        this.f81a = new C0243k(((C0249q) c0037h.f98a).f738c.mo100a());
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: a */
    public final C0256x mo100a() {
        return this.f81a;
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: c */
    public long mo101c(C0239g c0239g, long j2) {
        C0037h c0037h = this.f83c;
        AbstractC1136c.m2637e(c0239g, "sink");
        try {
            return ((C0249q) c0037h.f98a).mo101c(c0239g, j2);
        } catch (IOException e2) {
            ((C1344l) c0037h.f104g).m3102k();
            m102g();
            throw e2;
        }
    }

    /* renamed from: g */
    public final void m102g() {
        C0037h c0037h = this.f83c;
        int i2 = c0037h.f100c;
        if (i2 == 6) {
            return;
        }
        if (i2 != 5) {
            throw new IllegalStateException("state: " + c0037h.f100c);
        }
        C0243k c0243k = this.f81a;
        C0256x c0256x = c0243k.f720e;
        c0243k.f720e = C0256x.f751d;
        c0256x.mo697a();
        c0256x.mo698b();
        c0037h.f100c = 6;
    }
}
