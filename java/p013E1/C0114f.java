package p013E1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p010D1.C0095c;
import p010D1.C0106n;
import p034M0.C0360e;
import p095l1.AbstractC1136c;

/* renamed from: E1.f */
/* loaded from: classes.dex */
public class C0114f implements InterfaceC0122n {

    /* renamed from: f */
    public static final C0113e f328f = new C0113e();

    /* renamed from: a */
    public final Method f329a;

    /* renamed from: b */
    public final Method f330b;

    /* renamed from: c */
    public final Method f331c;

    /* renamed from: d */
    public final Method f332d;

    /* renamed from: e */
    public final Class f333e;

    public C0114f(Class cls) {
        this.f333e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC1136c.m2636d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f329a = declaredMethod;
        this.f330b = cls.getMethod("setHostname", String.class);
        this.f331c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f332d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: a */
    public final boolean mo439a(SSLSocket sSLSocket) {
        return this.f333e.isInstance(sSLSocket);
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: b */
    public final String mo440b(SSLSocket sSLSocket) {
        if (!this.f333e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f331c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            AbstractC1136c.m2636d(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (NullPointerException e3) {
            if (AbstractC1136c.m2633a(e3.getMessage(), "ssl == null")) {
                return null;
            }
            throw e3;
        } catch (InvocationTargetException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: c */
    public final boolean mo441c() {
        boolean z2 = C0095c.f287e;
        return C0095c.f287e;
    }

    @Override // p013E1.InterfaceC0122n
    /* renamed from: d */
    public final void mo442d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
        if (this.f333e.isInstance(sSLSocket)) {
            try {
                this.f329a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f330b.invoke(sSLSocket, str);
                }
                Method method = this.f332d;
                C0106n c0106n = C0106n.f319a;
                method.invoke(sSLSocket, C0360e.m1008e(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
