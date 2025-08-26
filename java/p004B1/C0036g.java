package p004B1;

import p026J1.C0239g;
import p095l1.AbstractC1136c;

/* renamed from: B1.g */
/* loaded from: classes.dex */
public final class C0036g extends AbstractC0031b {

    /* renamed from: d */
    public boolean f97d;

    @Override // p004B1.AbstractC0031b, p026J1.InterfaceC0254v
    /* renamed from: c */
    public final long mo101c(C0239g c0239g, long j2) {
        AbstractC1136c.m2637e(c0239g, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (this.f82b) {
            throw new IllegalStateException("closed");
        }
        if (this.f97d) {
            return -1L;
        }
        long mo101c = super.mo101c(c0239g, j2);
        if (mo101c != -1) {
            return mo101c;
        }
        this.f97d = true;
        m102g();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f82b) {
            return;
        }
        if (!this.f97d) {
            m102g();
        }
        this.f82b = true;
    }
}
