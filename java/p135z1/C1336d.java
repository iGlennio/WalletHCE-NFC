package p135z1;

import androidx.emoji2.text.C0605s;
import java.io.IOException;
import java.net.ProtocolException;
import p026J1.C0239g;
import p026J1.C0256x;
import p026J1.InterfaceC0254v;
import p095l1.AbstractC1136c;

/* renamed from: z1.d */
/* loaded from: classes.dex */
public final class C1336d implements InterfaceC0254v {

    /* renamed from: a */
    public final InterfaceC0254v f5512a;

    /* renamed from: b */
    public long f5513b;

    /* renamed from: c */
    public boolean f5514c;

    /* renamed from: d */
    public boolean f5515d;

    /* renamed from: e */
    public boolean f5516e;

    /* renamed from: f */
    public final long f5517f;

    /* renamed from: g */
    public final /* synthetic */ C0605s f5518g;

    public C1336d(C0605s c0605s, InterfaceC0254v interfaceC0254v, long j2) {
        AbstractC1136c.m2637e(interfaceC0254v, "delegate");
        this.f5518g = c0605s;
        this.f5512a = interfaceC0254v;
        this.f5517f = j2;
        this.f5514c = true;
        if (j2 == 0) {
            m3080h(null);
        }
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: a */
    public final C0256x mo100a() {
        return this.f5512a.mo100a();
    }

    @Override // p026J1.InterfaceC0254v
    /* renamed from: c */
    public final long mo101c(C0239g c0239g, long j2) {
        AbstractC1136c.m2637e(c0239g, "sink");
        if (this.f5516e) {
            throw new IllegalStateException("closed");
        }
        try {
            long mo101c = this.f5512a.mo101c(c0239g, j2);
            if (this.f5514c) {
                this.f5514c = false;
                C0605s c0605s = this.f5518g;
                c0605s.getClass();
                AbstractC1136c.m2637e((C1340h) c0605s.f2012b, "call");
            }
            if (mo101c == -1) {
                m3080h(null);
                return -1L;
            }
            long j3 = this.f5513b + mo101c;
            long j4 = this.f5517f;
            if (j4 == -1 || j3 <= j4) {
                this.f5513b = j3;
                if (j3 == j4) {
                    m3080h(null);
                }
                return mo101c;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e2) {
            throw m3080h(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5516e) {
            return;
        }
        this.f5516e = true;
        try {
            m3079g();
            m3080h(null);
        } catch (IOException e2) {
            throw m3080h(e2);
        }
    }

    /* renamed from: g */
    public final void m3079g() {
        this.f5512a.close();
    }

    /* renamed from: h */
    public final IOException m3080h(IOException iOException) {
        if (this.f5515d) {
            return iOException;
        }
        this.f5515d = true;
        C0605s c0605s = this.f5518g;
        if (iOException == null && this.f5514c) {
            this.f5514c = false;
            c0605s.getClass();
            AbstractC1136c.m2637e((C1340h) c0605s.f2012b, "call");
        }
        return c0605s.m1539a(true, false, iOException);
    }

    public final String toString() {
        return C1336d.class.getSimpleName() + '(' + this.f5512a + ')';
    }
}
