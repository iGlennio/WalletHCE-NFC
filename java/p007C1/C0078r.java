package p007C1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p001A1.AbstractC0007f;
import p001A1.C0008g;
import p001A1.C0010i;
import p001A1.InterfaceC0006e;
import p005C.AbstractC0044g;
import p010D1.AbstractC0104l;
import p026J1.C0242j;
import p026J1.InterfaceC0253u;
import p026J1.InterfaceC0254v;
import p088j.C0985d0;
import p088j.C1032t;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1199i;
import p123v1.C1281k;
import p123v1.C1283m;
import p123v1.C1287q;
import p123v1.C1289s;
import p123v1.C1290t;
import p123v1.EnumC1288r;
import p126w1.AbstractC1302b;
import p135z1.C1344l;

/* renamed from: C1.r */
/* loaded from: classes.dex */
public final class C0078r implements InterfaceC0006e {

    /* renamed from: g */
    public static final List f227g = AbstractC1302b.m3003l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List f228h = AbstractC1302b.m3003l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public volatile C0085y f229a;

    /* renamed from: b */
    public final EnumC1288r f230b;

    /* renamed from: c */
    public volatile boolean f231c;

    /* renamed from: d */
    public final C1344l f232d;

    /* renamed from: e */
    public final C0008g f233e;

    /* renamed from: f */
    public final C0077q f234f;

    public C0078r(C1287q c1287q, C1344l c1344l, C0008g c0008g, C0077q c0077q) {
        AbstractC1136c.m2637e(c1287q, "client");
        AbstractC1136c.m2637e(c1344l, "connection");
        AbstractC1136c.m2637e(c0077q, "http2Connection");
        this.f232d = c1344l;
        this.f233e = c0008g;
        this.f234f = c0077q;
        EnumC1288r enumC1288r = EnumC1288r.H2_PRIOR_KNOWLEDGE;
        this.f230b = c1287q.f5251r.contains(enumC1288r) ? enumC1288r : EnumC1288r.HTTP_2;
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: a */
    public final void mo10a() {
        C0085y c0085y = this.f229a;
        AbstractC1136c.m2634b(c0085y);
        c0085y.m284f().close();
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: b */
    public final void mo11b() {
        this.f234f.flush();
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: c */
    public final InterfaceC0254v mo12c(C1290t c1290t) {
        C0085y c0085y = this.f229a;
        AbstractC1136c.m2634b(c0085y);
        return c0085y.f263g;
    }

    @Override // p001A1.InterfaceC0006e
    public final void cancel() {
        this.f231c = true;
        C0085y c0085y = this.f229a;
        if (c0085y != null) {
            c0085y.m283e(9);
        }
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: d */
    public final long mo13d(C1290t c1290t) {
        if (AbstractC0007f.m18a(c1290t)) {
            return AbstractC1302b.m3002k(c1290t);
        }
        return 0L;
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: e */
    public final C1289s mo14e(boolean z2) {
        C1281k c1281k;
        C0085y c0085y = this.f229a;
        AbstractC1136c.m2634b(c0085y);
        synchronized (c0085y) {
            c0085y.f265i.m653i();
            while (c0085y.f261e.isEmpty() && c0085y.f267k == 0) {
                try {
                    c0085y.m289k();
                } catch (Throwable th) {
                    c0085y.f265i.m277l();
                    throw th;
                }
            }
            c0085y.f265i.m277l();
            if (c0085y.f261e.isEmpty()) {
                IOException iOException = c0085y.f268l;
                if (iOException != null) {
                    throw iOException;
                }
                int i2 = c0085y.f267k;
                AbstractC0044g.m157i(i2);
                throw new C0060E(i2);
            }
            Object removeFirst = c0085y.f261e.removeFirst();
            AbstractC1136c.m2636d(removeFirst, "headersQueue.removeFirst()");
            c1281k = (C1281k) removeFirst;
        }
        EnumC1288r enumC1288r = this.f230b;
        AbstractC1136c.m2637e(enumC1288r, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = c1281k.size();
        C0010i c0010i = null;
        for (int i3 = 0; i3 < size; i3++) {
            String m2965b = c1281k.m2965b(i3);
            String m2967d = c1281k.m2967d(i3);
            if (AbstractC1136c.m2633a(m2965b, ":status")) {
                c0010i = AbstractC0104l.m394O("HTTP/1.1 " + m2967d);
            } else if (!f228h.contains(m2965b)) {
                AbstractC1136c.m2637e(m2965b, "name");
                AbstractC1136c.m2637e(m2967d, "value");
                arrayList.add(m2965b);
                arrayList.add(AbstractC1199i.m2763I0(m2967d).toString());
            }
        }
        if (c0010i == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C1289s c1289s = new C1289s();
        c1289s.f5269b = enumC1288r;
        c1289s.f5270c = c0010i.f18b;
        c1289s.f5271d = (String) c0010i.f20d;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        C0985d0 c0985d0 = new C0985d0(8);
        ArrayList arrayList2 = (ArrayList) c0985d0.f3904b;
        AbstractC1136c.m2637e(arrayList2, "<this>");
        List asList = Arrays.asList((String[]) array);
        AbstractC1136c.m2636d(asList, "asList(this)");
        arrayList2.addAll(asList);
        c1289s.f5273f = c0985d0;
        if (z2 && c1289s.f5270c == 100) {
            return null;
        }
        return c1289s;
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: f */
    public final InterfaceC0253u mo15f(C1032t c1032t, long j2) {
        C0085y c0085y = this.f229a;
        AbstractC1136c.m2634b(c0085y);
        return c0085y.m284f();
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: g */
    public final void mo16g(C1032t c1032t) {
        int i2;
        C0085y c0085y;
        if (this.f229a != null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = ((C0010i) c1032t.f4048f) != null;
        C1281k c1281k = (C1281k) c1032t.f4047e;
        ArrayList arrayList = new ArrayList(c1281k.size() + 4);
        arrayList.add(new C0062b(C0062b.f147f, (String) c1032t.f4046d));
        C0242j c0242j = C0062b.f148g;
        C1283m c1283m = (C1283m) c1032t.f4045c;
        AbstractC1136c.m2637e(c1283m, "url");
        String m2972b = c1283m.m2972b();
        String m2974d = c1283m.m2974d();
        if (m2974d != null) {
            m2972b = m2972b + '?' + m2974d;
        }
        arrayList.add(new C0062b(c0242j, m2972b));
        String m2964a = ((C1281k) c1032t.f4047e).m2964a("Host");
        if (m2964a != null) {
            arrayList.add(new C0062b(C0062b.f150i, m2964a));
        }
        arrayList.add(new C0062b(C0062b.f149h, c1283m.f5192b));
        int size = c1281k.size();
        for (int i3 = 0; i3 < size; i3++) {
            String m2965b = c1281k.m2965b(i3);
            Locale locale = Locale.US;
            AbstractC1136c.m2636d(locale, "Locale.US");
            if (m2965b == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = m2965b.toLowerCase(locale);
            AbstractC1136c.m2636d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (!f227g.contains(lowerCase) || (lowerCase.equals("te") && AbstractC1136c.m2633a(c1281k.m2967d(i3), "trailers"))) {
                arrayList.add(new C0062b(lowerCase, c1281k.m2967d(i3)));
            }
        }
        C0077q c0077q = this.f234f;
        c0077q.getClass();
        boolean z4 = !z3;
        synchronized (c0077q.f224x) {
            synchronized (c0077q) {
                try {
                    if (c0077q.f205e > 1073741823) {
                        c0077q.m263j(8);
                    }
                    if (c0077q.f206f) {
                        throw new C0061a();
                    }
                    i2 = c0077q.f205e;
                    c0077q.f205e = i2 + 2;
                    c0085y = new C0085y(i2, c0077q, z4, false, null);
                    if (z3 && c0077q.f221u < c0077q.f222v && c0085y.f259c < c0085y.f260d) {
                        z2 = false;
                    }
                    if (c0085y.m286h()) {
                        c0077q.f202b.put(Integer.valueOf(i2), c0085y);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0077q.f224x.m294k(z4, i2, arrayList);
        }
        if (z2) {
            c0077q.f224x.flush();
        }
        this.f229a = c0085y;
        if (this.f231c) {
            C0085y c0085y2 = this.f229a;
            AbstractC1136c.m2634b(c0085y2);
            c0085y2.m283e(9);
            throw new IOException("Canceled");
        }
        C0085y c0085y3 = this.f229a;
        AbstractC1136c.m2634b(c0085y3);
        C0084x c0084x = c0085y3.f265i;
        long j2 = this.f233e.f12h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0084x.mo703g(j2, timeUnit);
        C0085y c0085y4 = this.f229a;
        AbstractC1136c.m2634b(c0085y4);
        c0085y4.f266j.mo703g(this.f233e.f13i, timeUnit);
    }

    @Override // p001A1.InterfaceC0006e
    /* renamed from: h */
    public final C1344l mo17h() {
        return this.f232d;
    }
}
