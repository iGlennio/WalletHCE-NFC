package p007C1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p026J1.C0239g;
import p026J1.C0242j;
import p026J1.C0249q;
import p026J1.C0256x;
import p026J1.InterfaceC0254v;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;

/* renamed from: C1.t */
/* loaded from: classes.dex */
public final class C0080t implements InterfaceC0254v {

    /* renamed from: a */
    public int f235a;

    /* renamed from: b */
    public int f236b;

    /* renamed from: c */
    public int f237c;

    /* renamed from: d */
    public int f238d;

    /* renamed from: e */
    public int f239e;

    /* renamed from: f */
    public final C0249q f240f;

    public C0080t(C0249q c0249q) {
        AbstractC1136c.m2637e(c0249q, "source");
        this.f240f = c0249q;
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: a */
    public final C0256x mo100a() {
        return this.f240f.f738c.mo100a();
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: c */
    public final long mo101c(C0239g c0239g, long j2) {
        int i2;
        int m718m;
        AbstractC1136c.m2637e(c0239g, "sink");
        do {
            int i3 = this.f238d;
            C0249q c0249q = this.f240f;
            if (i3 == 0) {
                c0249q.m724s(this.f239e);
                this.f239e = 0;
                if ((this.f236b & 4) == 0) {
                    i2 = this.f237c;
                    int m3011t = AbstractC1302b.m3011t(c0249q);
                    this.f238d = m3011t;
                    this.f235a = m3011t;
                    int m714i = c0249q.m714i() & 255;
                    this.f236b = c0249q.m714i() & 255;
                    Logger logger = C0081u.f241d;
                    if (logger.isLoggable(Level.FINE)) {
                        C0242j c0242j = AbstractC0066f.f171a;
                        logger.fine(AbstractC0066f.m255a(true, this.f237c, this.f235a, m714i, this.f236b));
                    }
                    m718m = c0249q.m718m() & Integer.MAX_VALUE;
                    this.f237c = m718m;
                    if (m714i != 9) {
                        throw new IOException(m714i + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long mo101c = c0249q.mo101c(c0239g, Math.min(j2, i3));
                if (mo101c != -1) {
                    this.f238d -= (int) mo101c;
                    return mo101c;
                }
            }
            return -1L;
        } while (m718m == i2);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
