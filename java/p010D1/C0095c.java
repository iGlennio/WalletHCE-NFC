package p010D1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p013E1.C0110b;
import p013E1.C0114f;
import p013E1.C0116h;
import p013E1.C0117i;
import p013E1.C0119k;
import p013E1.C0121m;
import p013E1.C0123o;
import p013E1.InterfaceC0122n;
import p020H1.C0202a;
import p020H1.InterfaceC0205d;
import p034M0.C0360e;
import p075d1.AbstractC0756h;
import p095l1.AbstractC1136c;

/* renamed from: D1.c */
/* loaded from: classes.dex */
public final class C0095c extends C0106n {

    /* renamed from: e */
    public static final boolean f287e;

    /* renamed from: c */
    public final ArrayList f288c;

    /* renamed from: d */
    public final C0117i f289d;

    static {
        boolean z2 = false;
        if (C0360e.m1012k() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f287e = z2;
    }

    public C0095c() {
        C0123o c0123o;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c0123o = new C0123o(cls);
        } catch (Exception e2) {
            C0106n.f319a.getClass();
            C0106n.m436i("unable to load android socket classes", 5, e2);
            c0123o = null;
        }
        ArrayList m2053s0 = AbstractC0756h.m2053s0(new InterfaceC0122n[]{c0123o, new C0121m(C0114f.f328f), new C0121m(C0119k.f338a), new C0121m(C0116h.f334a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = m2053s0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((InterfaceC0122n) next).mo441c()) {
                arrayList.add(next);
            }
        }
        this.f288c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        C0117i c0117i = new C0117i();
        c0117i.f335a = method3;
        c0117i.f336b = method2;
        c0117i.f337c = method;
        this.f289d = c0117i;
    }

    @Override // p010D1.C0106n
    /* renamed from: b */
    public final AbstractC0096d mo314b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        C0110b c0110b = x509TrustManagerExtensions != null ? new C0110b(x509TrustManager, x509TrustManagerExtensions) : null;
        return c0110b != null ? c0110b : new C0202a(mo319c(x509TrustManager));
    }

    @Override // p010D1.C0106n
    /* renamed from: c */
    public final InterfaceC0205d mo319c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            AbstractC1136c.m2636d(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0094b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo319c(x509TrustManager);
        }
    }

    @Override // p010D1.C0106n
    /* renamed from: d */
    public final void mo315d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        AbstractC1136c.m2637e(list, "protocols");
        Iterator it = this.f288c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((InterfaceC0122n) obj).mo439a(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC0122n interfaceC0122n = (InterfaceC0122n) obj;
        if (interfaceC0122n != null) {
            interfaceC0122n.mo442d(sSLSocket, str, list);
        }
    }

    @Override // p010D1.C0106n
    /* renamed from: e */
    public final void mo320e(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        AbstractC1136c.m2637e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // p010D1.C0106n
    /* renamed from: f */
    public final String mo316f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f288c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC0122n) obj).mo439a(sSLSocket)) {
                break;
            }
        }
        InterfaceC0122n interfaceC0122n = (InterfaceC0122n) obj;
        if (interfaceC0122n != null) {
            return interfaceC0122n.mo440b(sSLSocket);
        }
        return null;
    }

    @Override // p010D1.C0106n
    /* renamed from: g */
    public final Object mo321g() {
        C0117i c0117i = this.f289d;
        c0117i.getClass();
        Method method = c0117i.f335a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = c0117i.f336b;
                AbstractC1136c.m2634b(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // p010D1.C0106n
    /* renamed from: h */
    public final boolean mo317h(String str) {
        AbstractC1136c.m2637e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p010D1.C0106n
    /* renamed from: j */
    public final void mo322j(Object obj, String str) {
        AbstractC1136c.m2637e(str, "message");
        C0117i c0117i = this.f289d;
        c0117i.getClass();
        if (obj != null) {
            try {
                Method method = c0117i.f337c;
                AbstractC1136c.m2634b(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        C0106n.m436i(str, 5, null);
    }
}
