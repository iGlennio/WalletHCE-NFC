package p135z1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p078e1.C0804a;
import p088j.C1004j1;
import p095l1.AbstractC1136c;
import p123v1.C1276f;
import p123v1.C1277g;
import p123v1.C1278h;
import p126w1.AbstractC1302b;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public final class C1334b {

    /* renamed from: a */
    public int f5502a;

    /* renamed from: b */
    public boolean f5503b;

    /* renamed from: c */
    public boolean f5504c;

    /* renamed from: d */
    public final List f5505d;

    public C1334b(List list) {
        AbstractC1136c.m2637e(list, "connectionSpecs");
        this.f5505d = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    /* renamed from: a */
    public final C1278h m3075a(SSLSocket sSLSocket) {
        C1278h c1278h;
        int i2;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i3 = this.f5502a;
        List list = this.f5505d;
        int size = list.size();
        while (true) {
            if (i3 >= size) {
                c1278h = null;
                break;
            }
            c1278h = (C1278h) list.get(i3);
            if (c1278h.m2961b(sSLSocket)) {
                this.f5502a = i3 + 1;
                break;
            }
            i3++;
        }
        if (c1278h == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f5504c);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC1136c.m2634b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            AbstractC1136c.m2636d(arrays, "java.util.Arrays.toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i4 = this.f5502a;
        int size2 = list.size();
        while (true) {
            i2 = 0;
            if (i4 >= size2) {
                z2 = false;
                break;
            }
            if (((C1278h) list.get(i4)).m2961b(sSLSocket)) {
                z2 = true;
                break;
            }
            i4++;
        }
        this.f5503b = z2;
        boolean z3 = this.f5504c;
        String[] strArr = c1278h.f5162c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            AbstractC1136c.m2636d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = AbstractC1302b.m3007p(enabledCipherSuites2, strArr, C1277g.f5138b);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = c1278h.f5163d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            AbstractC1136c.m2636d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = AbstractC1302b.m3007p(enabledProtocols3, r6, C0804a.f3201b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC1136c.m2636d(supportedCipherSuites, "supportedCipherSuites");
        C1276f c1276f = C1277g.f5138b;
        byte[] bArr = AbstractC1302b.f5337a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (c1276f.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i2++;
        }
        if (z3 && i2 != -1) {
            AbstractC1136c.m2636d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i2];
            AbstractC1136c.m2636d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC1136c.m2636d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C1004j1 c1004j1 = new C1004j1();
        c1004j1.f3957a = c1278h.f5160a;
        c1004j1.f3959c = strArr;
        c1004j1.f3960d = r6;
        c1004j1.f3958b = c1278h.f5161b;
        AbstractC1136c.m2636d(enabledCipherSuites, "cipherSuitesIntersection");
        c1004j1.m2482b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC1136c.m2636d(enabledProtocols, "tlsVersionsIntersection");
        c1004j1.m2484d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C1278h m2481a = c1004j1.m2481a();
        if (m2481a.m2962c() != null) {
            sSLSocket.setEnabledProtocols(m2481a.f5163d);
        }
        if (m2481a.m2960a() != null) {
            sSLSocket.setEnabledCipherSuites(m2481a.f5162c);
        }
        return c1278h;
    }
}
