package p004B1;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p026J1.C0239g;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;
import p135z1.C1344l;

/* renamed from: B1.e */
/* loaded from: classes.dex */
public final class C0034e extends AbstractC0031b {

    /* renamed from: d */
    public long f91d;

    /* renamed from: e */
    public final /* synthetic */ C0037h f92e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0034e(C0037h c0037h, long j2) {
        super(c0037h);
        this.f92e = c0037h;
        this.f91d = j2;
        if (j2 == 0) {
            m102g();
        }
    }

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
        long j3 = this.f91d;
        if (j3 == 0) {
            return -1L;
        }
        long mo101c = super.mo101c(c0239g, Math.min(j3, j2));
        if (mo101c == -1) {
            ((C1344l) this.f92e.f104g).m3102k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m102g();
            throw protocolException;
        }
        long j4 = this.f91d - mo101c;
        this.f91d = j4;
        if (j4 == 0) {
            m102g();
        }
        return mo101c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f82b) {
            return;
        }
        if (this.f91d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!AbstractC1302b.m2999h(this)) {
                ((C1344l) this.f92e.f104g).m3102k();
                m102g();
            }
        }
        this.f82b = true;
    }
}
