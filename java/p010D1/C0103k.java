package p010D1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p075d1.AbstractC0759k;
import p095l1.AbstractC1136c;
import p123v1.EnumC1288r;

/* renamed from: D1.k */
/* loaded from: classes.dex */
public final class C0103k extends C0106n {

    /* renamed from: c */
    public static final boolean f316c;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r0.intValue() >= 9) goto L13;
     */
    static {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto Ld
            java.lang.Integer r0 = p112r1.AbstractC1199i.m2762H0(r0)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L1b
            goto L26
        L1b:
            r1 = r2
            goto L26
        L1d:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1b
            r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L1b
        L26:
            p010D1.C0103k.f316c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p010D1.C0103k.<clinit>():void");
    }

    @Override // p010D1.C0106n
    /* renamed from: d */
    public final void mo315d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1136c.m2637e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
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
        AbstractC1136c.m2636d(sSLParameters, "sslParameters");
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p010D1.C0106n
    /* renamed from: f */
    public final String mo316f(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
