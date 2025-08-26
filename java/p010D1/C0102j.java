package p010D1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p075d1.AbstractC0759k;
import p095l1.AbstractC1136c;
import p123v1.EnumC1288r;

/* renamed from: D1.j */
/* loaded from: classes.dex */
public final class C0102j extends C0106n {

    /* renamed from: c */
    public final Method f311c;

    /* renamed from: d */
    public final Method f312d;

    /* renamed from: e */
    public final Method f313e;

    /* renamed from: f */
    public final Class f314f;

    /* renamed from: g */
    public final Class f315g;

    public C0102j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f311c = method;
        this.f312d = method2;
        this.f313e = method3;
        this.f314f = cls;
        this.f315g = cls2;
    }

    @Override // p010D1.C0106n
    /* renamed from: a */
    public final void mo387a(SSLSocket sSLSocket) {
        try {
            this.f313e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // p010D1.C0106n
    /* renamed from: d */
    public final void mo315d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC1288r) obj) != EnumC1288r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0759k.m2057X(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC1288r) it.next()).f5267a);
        }
        try {
            this.f311c.invoke(null, sSLSocket, Proxy.newProxyInstance(C0106n.class.getClassLoader(), new Class[]{this.f314f, this.f315g}, new C0101i(arrayList2)));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // p010D1.C0106n
    /* renamed from: f */
    public final String mo316f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f312d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            C0101i c0101i = (C0101i) invocationHandler;
            boolean z2 = c0101i.f308a;
            if (!z2 && c0101i.f309b == null) {
                C0106n.m436i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z2) {
                return null;
            }
            return c0101i.f309b;
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
