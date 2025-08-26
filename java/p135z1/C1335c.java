package p135z1;

import androidx.emoji2.text.C0605s;
import java.io.IOException;
import java.net.ProtocolException;
import p026J1.C0239g;
import p026J1.C0256x;
import p026J1.InterfaceC0253u;
import p095l1.AbstractC1136c;

/* renamed from: z1.c */
/* loaded from: classes.dex */
public final class C1335c implements InterfaceC0253u {

    /* renamed from: a */
    public final InterfaceC0253u f5506a;

    /* renamed from: b */
    public boolean f5507b;

    /* renamed from: c */
    public long f5508c;

    /* renamed from: d */
    public boolean f5509d;

    /* renamed from: e */
    public final long f5510e;

    /* renamed from: f */
    public final /* synthetic */ C0605s f5511f;

    public C1335c(C0605s c0605s, InterfaceC0253u interfaceC0253u, long j2) {
        AbstractC1136c.m2637e(interfaceC0253u, "delegate");
        this.f5511f = c0605s;
        this.f5506a = interfaceC0253u;
        this.f5510e = j2;
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: a */
    public final C0256x mo103a() {
        return this.f5506a.mo103a();
    }

    @Override // p026J1.InterfaceC0253u
    /* renamed from: b */
    public final void mo104b(C0239g c0239g, long j2) {
        if (this.f5509d) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f5510e;
        if (j3 == -1 || this.f5508c + j2 <= j3) {
            try {
                this.f5506a.mo104b(c0239g, j2);
                this.f5508c += j2;
                return;
            } catch (IOException e2) {
                throw m3077h(e2);
            }
        }
        throw new ProtocolException("expected " + j3 + " bytes but received " + (this.f5508c + j2));
    }

    @Override // p026J1.InterfaceC0253u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5509d) {
            return;
        }
        this.f5509d = true;
        long j2 = this.f5510e;
        if (j2 != -1 && this.f5508c != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m3076g();
            m3077h(null);
        } catch (IOException e2) {
            throw m3077h(e2);
        }
    }

    @Override // p026J1.InterfaceC0253u, java.io.Flushable
    public final void flush() {
        try {
            m3078i();
        } catch (IOException e2) {
            throw m3077h(e2);
        }
    }

    /* renamed from: g */
    public final void m3076g() {
        this.f5506a.close();
    }

    /* renamed from: h */
    public final IOException m3077h(IOException iOException) {
        if (this.f5507b) {
            return iOException;
        }
        this.f5507b = true;
        return this.f5511f.m1539a(false, true, iOException);
    }

    /* renamed from: i */
    public final void m3078i() {
        this.f5506a.flush();
    }

    public final String toString() {
        return C1335c.class.getSimpleName() + '(' + this.f5506a + ')';
    }
}
