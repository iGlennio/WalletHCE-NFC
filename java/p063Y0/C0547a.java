package p063Y0;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p005C.AbstractC0044g;
import p051S0.AbstractC0477l;
import p051S0.C0472g;
import p057V0.C0513a;
import p068a1.C0558a;
import p068a1.C0559b;

/* renamed from: Y0.a */
/* loaded from: classes.dex */
public final class C0547a extends AbstractC0477l {

    /* renamed from: c */
    public static final C0513a f1504c = new C0513a(4);

    /* renamed from: d */
    public static final C0513a f1505d = new C0513a(5);

    /* renamed from: e */
    public static final C0513a f1506e = new C0513a(6);

    /* renamed from: a */
    public final /* synthetic */ int f1507a;

    /* renamed from: b */
    public final Object f1508b;

    public C0547a(int i2) {
        this.f1507a = i2;
        switch (i2) {
            case 1:
                this.f1508b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f1508b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        Date parse;
        Time time;
        switch (this.f1507a) {
            case 0:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                String m1330z = c0558a.m1330z();
                try {
                    synchronized (this) {
                        parse = ((SimpleDateFormat) this.f1508b).parse(m1330z);
                    }
                    return new java.sql.Date(parse.getTime());
                } catch (ParseException e2) {
                    StringBuilder m156h = AbstractC0044g.m156h("Failed parsing '", m1330z, "' as SQL Date; at path ");
                    m156h.append(c0558a.m1318n(true));
                    throw new C0472g(m156h.toString(), e2);
                }
            case 1:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                String m1330z2 = c0558a.m1330z();
                try {
                    synchronized (this) {
                        time = new Time(((SimpleDateFormat) this.f1508b).parse(m1330z2).getTime());
                    }
                    return time;
                } catch (ParseException e3) {
                    StringBuilder m156h2 = AbstractC0044g.m156h("Failed parsing '", m1330z2, "' as SQL Time; at path ");
                    m156h2.append(c0558a.m1318n(true));
                    throw new C0472g(m156h2.toString(), e3);
                }
            default:
                Date date = (Date) ((AbstractC0477l) this.f1508b).mo1221a(c0558a);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        String format;
        String format2;
        switch (this.f1507a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    c0559b.m1339o();
                    return;
                }
                synchronized (this) {
                    format = ((SimpleDateFormat) this.f1508b).format((Date) date);
                }
                c0559b.m1345u(format);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    c0559b.m1339o();
                    return;
                }
                synchronized (this) {
                    format2 = ((SimpleDateFormat) this.f1508b).format((Date) time);
                }
                c0559b.m1345u(format2);
                return;
            default:
                ((AbstractC0477l) this.f1508b).mo1222b(c0559b, (Timestamp) obj);
                return;
        }
    }

    public C0547a(AbstractC0477l abstractC0477l) {
        this.f1507a = 2;
        this.f1508b = abstractC0477l;
    }
}
