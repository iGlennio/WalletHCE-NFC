package p123v1;

import java.io.Closeable;
import java.nio.charset.Charset;
import p026J1.InterfaceC0241i;
import p112r1.AbstractC1191a;
import p126w1.AbstractC1302b;

/* renamed from: v1.v */
/* loaded from: classes.dex */
public abstract class AbstractC1292v implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC1302b.m2994c(mo24i());
    }

    /* renamed from: g */
    public abstract long mo22g();

    /* renamed from: h */
    public abstract C1285o mo23h();

    /* renamed from: i */
    public abstract InterfaceC0241i mo24i();

    /* renamed from: j */
    public final String m2984j() {
        Charset charset;
        InterfaceC0241i mo24i = mo24i();
        try {
            C1285o mo23h = mo23h();
            if (mo23h == null || (charset = mo23h.m2978a(AbstractC1191a.f4563a)) == null) {
                charset = AbstractC1191a.f4563a;
            }
            String mo665f = mo24i.mo665f(AbstractC1302b.m3010s(mo24i, charset));
            mo24i.close();
            return mo665f;
        } finally {
        }
    }
}
