package p135z1;

import androidx.emoji2.text.C0605s;
import java.io.IOException;
import p001A1.C0008g;
import p095l1.AbstractC1136c;
import p123v1.C1287q;
import p123v1.C1290t;
import p123v1.InterfaceC1284n;

/* renamed from: z1.a */
/* loaded from: classes.dex */
public final class C1333a implements InterfaceC1284n {

    /* renamed from: a */
    public static final C1333a f5501a = new C1333a();

    @Override // p123v1.InterfaceC1284n
    /* renamed from: a */
    public final C1290t mo7a(C0008g c0008g) {
        C1340h c1340h = c0008g.f6b;
        c1340h.getClass();
        synchronized (c1340h) {
            try {
                if (!c1340h.f5542k) {
                    throw new IllegalStateException("released");
                }
                if (c1340h.f5541j) {
                    throw new IllegalStateException("Check failed.");
                }
                if (c1340h.f5540i) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1337e c1337e = c1340h.f5536e;
        AbstractC1136c.m2634b(c1337e);
        C1287q c1287q = c1340h.f5546o;
        AbstractC1136c.m2637e(c1287q, "client");
        try {
            C0605s c0605s = new C0605s(c1340h, c1337e, c1337e.m3081a(c0008g.f11g, c0008g.f12h, c0008g.f13i, c1287q.f5258y, c1287q.f5239f, !AbstractC1136c.m2633a((String) c0008g.f10f.f4046d, "GET")).m3101j(c1287q, c0008g));
            c1340h.f5539h = c0605s;
            c1340h.f5544m = c0605s;
            synchronized (c1340h) {
                c1340h.f5540i = true;
                c1340h.f5541j = true;
            }
            if (c1340h.f5543l) {
                throw new IOException("Canceled");
            }
            return C0008g.m20a(c0008g, 0, c0605s, null, 61).m21b(c0008g.f10f);
        } catch (IOException e2) {
            c1337e.m3083c(e2);
            throw new C1346n(e2);
        } catch (C1346n e3) {
            c1337e.m3083c(e3.f5576a);
            throw e3;
        }
    }
}
