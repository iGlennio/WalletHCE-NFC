package p007C1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p010D1.AbstractC0096d;
import p026J1.AbstractC0246n;
import p026J1.C0237e;
import p135z1.C1340h;

/* renamed from: C1.x */
/* loaded from: classes.dex */
public final class C0084x extends C0237e {

    /* renamed from: k */
    public final /* synthetic */ int f255k;

    /* renamed from: l */
    public final Object f256l;

    public /* synthetic */ C0084x(int i2, Object obj) {
        this.f255k = i2;
        this.f256l = obj;
    }

    @Override // p026J1.C0237e
    /* renamed from: k */
    public final void mo276k() {
        switch (this.f255k) {
            case 0:
                ((C0085y) this.f256l).m283e(9);
                C0077q c0077q = ((C0085y) this.f256l).f270n;
                synchronized (c0077q) {
                    long j2 = c0077q.f215o;
                    long j3 = c0077q.f214n;
                    if (j2 < j3) {
                        return;
                    }
                    c0077q.f214n = j3 + 1;
                    c0077q.f216p = System.nanoTime() + 1000000000;
                    c0077q.f208h.m3026c(new C0075o(c0077q.f203c + " ping", c0077q), 0L);
                    return;
                }
            case 1:
                Socket socket = (Socket) this.f256l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e2) {
                    if (!AbstractC0096d.m326J(e2)) {
                        throw e2;
                    }
                    AbstractC0246n.f730a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                    return;
                } catch (Exception e3) {
                    AbstractC0246n.f730a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
                    return;
                }
            default:
                ((C1340h) this.f256l).m3087d();
                return;
        }
    }

    /* renamed from: l */
    public void m277l() {
        if (m654j()) {
            throw m278m(null);
        }
    }

    /* renamed from: m */
    public IOException m278m(IOException iOException) {
        switch (this.f255k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }
}
