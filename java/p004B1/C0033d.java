package p004B1;

import java.util.concurrent.TimeUnit;
import p095l1.AbstractC1136c;
import p123v1.C1283m;
import p126w1.AbstractC1302b;
import p135z1.C1344l;

/* renamed from: B1.d */
/* loaded from: classes.dex */
public final class C0033d extends AbstractC0031b {

    /* renamed from: d */
    public long f87d;

    /* renamed from: e */
    public boolean f88e;

    /* renamed from: f */
    public final C1283m f89f;

    /* renamed from: g */
    public final /* synthetic */ C0037h f90g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0033d(C0037h c0037h, C1283m c1283m) {
        super(c0037h);
        AbstractC1136c.m2637e(c1283m, "url");
        this.f90g = c0037h;
        this.f89f = c1283m;
        this.f87d = -1L;
        this.f88e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r10.f88e == false) goto L30;
     */
    @Override // p004B1.AbstractC0031b, p026J1.InterfaceC0254v
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo101c(p026J1.C0239g r11, long r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p004B1.C0033d.mo101c(J1.g, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f82b) {
            return;
        }
        if (this.f88e) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!AbstractC1302b.m2999h(this)) {
                ((C1344l) this.f90g.f104g).m3102k();
                m102g();
            }
        }
        this.f82b = true;
    }
}
