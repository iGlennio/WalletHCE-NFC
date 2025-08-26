package p015F1;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p010D1.AbstractC0104l;

/* renamed from: F1.a */
/* loaded from: classes.dex */
public final class C0159a extends ProxySelector {

    /* renamed from: a */
    public static final C0159a f491a = new C0159a();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return AbstractC0104l.m391F(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
