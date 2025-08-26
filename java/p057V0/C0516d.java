package p057V0;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p005C.AbstractC0044g;
import p051S0.AbstractC0477l;
import p051S0.C0472g;
import p055U0.AbstractC0495i;
import p059W0.AbstractC0532a;
import p068a1.C0558a;
import p068a1.C0559b;

/* renamed from: V0.d */
/* loaded from: classes.dex */
public final class C0516d extends AbstractC0477l {

    /* renamed from: b */
    public static final C0513a f1408b = new C0513a(1);

    /* renamed from: a */
    public final ArrayList f1409a;

    public C0516d() {
        ArrayList arrayList = new ArrayList();
        this.f1409a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC0495i.f1352a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        if (c0558a.m1303B() == 9) {
            c0558a.m1328x();
            return null;
        }
        String m1330z = c0558a.m1330z();
        synchronized (this.f1409a) {
            try {
                Iterator it = this.f1409a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(m1330z);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return AbstractC0532a.m1291b(m1330z, new ParsePosition(0));
                } catch (ParseException e2) {
                    StringBuilder m156h = AbstractC0044g.m156h("Failed parsing '", m1330z, "' as Date; at path ");
                    m156h.append(c0558a.m1318n(true));
                    throw new C0472g(m156h.toString(), e2);
                }
            } finally {
            }
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            c0559b.m1339o();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f1409a.get(0);
        synchronized (this.f1409a) {
            format = dateFormat.format(date);
        }
        c0559b.m1345u(format);
    }
}
