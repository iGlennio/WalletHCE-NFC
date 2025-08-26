package p057V0;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p005C.AbstractC0044g;
import p051S0.AbstractC0471f;
import p051S0.AbstractC0477l;
import p051S0.C0470e;
import p051S0.C0472g;
import p051S0.C0473h;
import p051S0.C0474i;
import p051S0.C0476k;
import p055U0.C0496j;
import p055U0.C0497k;
import p055U0.C0498l;
import p055U0.C0499m;
import p068a1.C0558a;
import p068a1.C0559b;
import p107q.AbstractC1181e;

/* renamed from: V0.g */
/* loaded from: classes.dex */
public final class C0519g extends AbstractC0477l {

    /* renamed from: b */
    public static final C0518f f1416b = new C0518f(new C0519g(0), 0);

    /* renamed from: a */
    public final /* synthetic */ int f1417a;

    public /* synthetic */ C0519g(int i2) {
        this.f1417a = i2;
    }

    /* renamed from: c */
    public static AbstractC0471f m1281c(C0558a c0558a, int i2) {
        int m2740a = AbstractC1181e.m2740a(i2);
        if (m2740a == 5) {
            return new C0476k(c0558a.m1330z());
        }
        if (m2740a == 6) {
            return new C0476k(new C0496j(c0558a.m1330z()));
        }
        if (m2740a == 7) {
            return new C0476k(Boolean.valueOf(c0558a.m1322r()));
        }
        if (m2740a != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0044g.m160l(i2)));
        }
        c0558a.m1328x();
        return C0473h.f1285a;
    }

    /* renamed from: d */
    public static void m1282d(C0559b c0559b, AbstractC0471f abstractC0471f) {
        if (abstractC0471f == null || (abstractC0471f instanceof C0473h)) {
            c0559b.m1339o();
            return;
        }
        boolean z2 = abstractC0471f instanceof C0476k;
        if (z2) {
            if (!z2) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC0471f);
            }
            C0476k c0476k = (C0476k) abstractC0471f;
            Serializable serializable = c0476k.f1287a;
            if (serializable instanceof Number) {
                c0559b.m1344t(c0476k.m1229a());
                return;
            } else if (serializable instanceof Boolean) {
                c0559b.m1346v(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c0476k.m1230b()));
                return;
            } else {
                c0559b.m1345u(c0476k.m1230b());
                return;
            }
        }
        boolean z3 = abstractC0471f instanceof C0470e;
        if (z3) {
            c0559b.m1332h();
            if (!z3) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC0471f);
            }
            Iterator it = ((C0470e) abstractC0471f).f1284a.iterator();
            while (it.hasNext()) {
                m1282d(c0559b, (AbstractC0471f) it.next());
            }
            c0559b.m1335k();
            return;
        }
        boolean z4 = abstractC0471f instanceof C0474i;
        if (!z4) {
            throw new IllegalArgumentException("Couldn't write " + abstractC0471f.getClass());
        }
        c0559b.m1333i();
        if (!z4) {
            throw new IllegalStateException("Not a JSON Object: " + abstractC0471f);
        }
        Iterator it2 = ((C0498l) ((C0474i) abstractC0471f).f1286a.entrySet()).iterator();
        while (((C0497k) it2).hasNext()) {
            C0499m m1272b = ((C0497k) it2).m1272b();
            c0559b.m1337m((String) m1272b.getKey());
            m1282d(c0559b, (AbstractC0471f) m1272b.getValue());
        }
        c0559b.m1336l();
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: a */
    public final Object mo1221a(C0558a c0558a) {
        AbstractC0471f c0470e;
        AbstractC0471f c0470e2;
        boolean z2;
        switch (this.f1417a) {
            case 0:
                int m1303B = c0558a.m1303B();
                int m2740a = AbstractC1181e.m2740a(m1303B);
                if (m2740a == 5 || m2740a == 6) {
                    return new C0496j(c0558a.m1330z());
                }
                if (m2740a == 8) {
                    c0558a.m1328x();
                    return null;
                }
                throw new C0472g("Expecting number, got: " + AbstractC0044g.m160l(m1303B) + "; at path " + c0558a.m1318n(false));
            case 1:
                ArrayList arrayList = new ArrayList();
                c0558a.m1311g();
                while (c0558a.m1319o()) {
                    try {
                        arrayList.add(Integer.valueOf(c0558a.m1324t()));
                    } catch (NumberFormatException e2) {
                        throw new C0472g(e2);
                    }
                }
                c0558a.m1315k();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            case 2:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                try {
                    return Long.valueOf(c0558a.m1325u());
                } catch (NumberFormatException e3) {
                    throw new C0472g(e3);
                }
            case 3:
                if (c0558a.m1303B() != 9) {
                    return Float.valueOf((float) c0558a.m1323s());
                }
                c0558a.m1328x();
                return null;
            case 4:
                if (c0558a.m1303B() != 9) {
                    return Double.valueOf(c0558a.m1323s());
                }
                c0558a.m1328x();
                return null;
            case 5:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                String m1330z = c0558a.m1330z();
                if (m1330z.length() == 1) {
                    return Character.valueOf(m1330z.charAt(0));
                }
                StringBuilder m156h = AbstractC0044g.m156h("Expecting character, got: ", m1330z, "; at ");
                m156h.append(c0558a.m1318n(true));
                throw new C0472g(m156h.toString());
            case 6:
                int m1303B2 = c0558a.m1303B();
                if (m1303B2 != 9) {
                    return m1303B2 == 8 ? Boolean.toString(c0558a.m1322r()) : c0558a.m1330z();
                }
                c0558a.m1328x();
                return null;
            case 7:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                String m1330z2 = c0558a.m1330z();
                try {
                    return new BigDecimal(m1330z2);
                } catch (NumberFormatException e4) {
                    StringBuilder m156h2 = AbstractC0044g.m156h("Failed parsing '", m1330z2, "' as BigDecimal; at path ");
                    m156h2.append(c0558a.m1318n(true));
                    throw new C0472g(m156h2.toString(), e4);
                }
            case 8:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                String m1330z3 = c0558a.m1330z();
                try {
                    return new BigInteger(m1330z3);
                } catch (NumberFormatException e5) {
                    StringBuilder m156h3 = AbstractC0044g.m156h("Failed parsing '", m1330z3, "' as BigInteger; at path ");
                    m156h3.append(c0558a.m1318n(true));
                    throw new C0472g(m156h3.toString(), e5);
                }
            case 9:
                if (c0558a.m1303B() != 9) {
                    return new C0496j(c0558a.m1330z());
                }
                c0558a.m1328x();
                return null;
            case 10:
                if (c0558a.m1303B() != 9) {
                    return new StringBuilder(c0558a.m1330z());
                }
                c0558a.m1328x();
                return null;
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (c0558a.m1303B() != 9) {
                    return new StringBuffer(c0558a.m1330z());
                }
                c0558a.m1328x();
                return null;
            case 13:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                String m1330z4 = c0558a.m1330z();
                if ("null".equals(m1330z4)) {
                    return null;
                }
                return new URL(m1330z4);
            case 14:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                try {
                    String m1330z5 = c0558a.m1330z();
                    if ("null".equals(m1330z5)) {
                        return null;
                    }
                    return new URI(m1330z5);
                } catch (URISyntaxException e6) {
                    throw new C0472g(e6);
                }
            case 15:
                if (c0558a.m1303B() != 9) {
                    return InetAddress.getByName(c0558a.m1330z());
                }
                c0558a.m1328x();
                return null;
            case 16:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                String m1330z6 = c0558a.m1330z();
                try {
                    return UUID.fromString(m1330z6);
                } catch (IllegalArgumentException e7) {
                    StringBuilder m156h4 = AbstractC0044g.m156h("Failed parsing '", m1330z6, "' as UUID; at path ");
                    m156h4.append(c0558a.m1318n(true));
                    throw new C0472g(m156h4.toString(), e7);
                }
            case 17:
                String m1330z7 = c0558a.m1330z();
                try {
                    return Currency.getInstance(m1330z7);
                } catch (IllegalArgumentException e8) {
                    StringBuilder m156h5 = AbstractC0044g.m156h("Failed parsing '", m1330z7, "' as Currency; at path ");
                    m156h5.append(c0558a.m1318n(true));
                    throw new C0472g(m156h5.toString(), e8);
                }
            case 18:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                c0558a.m1312h();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (c0558a.m1303B() != 4) {
                    String m1326v = c0558a.m1326v();
                    int m1324t = c0558a.m1324t();
                    if ("year".equals(m1326v)) {
                        i3 = m1324t;
                    } else if ("month".equals(m1326v)) {
                        i4 = m1324t;
                    } else if ("dayOfMonth".equals(m1326v)) {
                        i5 = m1324t;
                    } else if ("hourOfDay".equals(m1326v)) {
                        i6 = m1324t;
                    } else if ("minute".equals(m1326v)) {
                        i7 = m1324t;
                    } else if ("second".equals(m1326v)) {
                        i8 = m1324t;
                    }
                }
                c0558a.m1316l();
                return new GregorianCalendar(i3, i4, i5, i6, i7, i8);
            case 19:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c0558a.m1330z(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            case 20:
                int m1303B3 = c0558a.m1303B();
                int m2740a2 = AbstractC1181e.m2740a(m1303B3);
                if (m2740a2 == 0) {
                    c0558a.m1311g();
                    c0470e = new C0470e();
                } else if (m2740a2 != 2) {
                    c0470e = null;
                } else {
                    c0558a.m1312h();
                    c0470e = new C0474i();
                }
                if (c0470e == null) {
                    return m1281c(c0558a, m1303B3);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c0558a.m1319o()) {
                        String m1326v2 = c0470e instanceof C0474i ? c0558a.m1326v() : null;
                        int m1303B4 = c0558a.m1303B();
                        int m2740a3 = AbstractC1181e.m2740a(m1303B4);
                        if (m2740a3 == 0) {
                            c0558a.m1311g();
                            c0470e2 = new C0470e();
                        } else if (m2740a3 != 2) {
                            c0470e2 = null;
                        } else {
                            c0558a.m1312h();
                            c0470e2 = new C0474i();
                        }
                        boolean z3 = c0470e2 != null;
                        if (c0470e2 == null) {
                            c0470e2 = m1281c(c0558a, m1303B4);
                        }
                        if (c0470e instanceof C0470e) {
                            ((C0470e) c0470e).f1284a.add(c0470e2);
                        } else {
                            ((C0474i) c0470e).f1286a.put(m1326v2, c0470e2);
                        }
                        if (z3) {
                            arrayDeque.addLast(c0470e);
                            c0470e = c0470e2;
                        }
                    } else {
                        if (c0470e instanceof C0470e) {
                            c0558a.m1315k();
                        } else {
                            c0558a.m1316l();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c0470e;
                        }
                        c0470e = (AbstractC0471f) arrayDeque.removeLast();
                    }
                }
            case 21:
                BitSet bitSet = new BitSet();
                c0558a.m1311g();
                int m1303B5 = c0558a.m1303B();
                int i9 = 0;
                while (m1303B5 != 2) {
                    int m2740a4 = AbstractC1181e.m2740a(m1303B5);
                    if (m2740a4 == 5 || m2740a4 == 6) {
                        int m1324t2 = c0558a.m1324t();
                        if (m1324t2 == 0) {
                            z2 = false;
                        } else {
                            if (m1324t2 != 1) {
                                throw new C0472g("Invalid bitset value " + m1324t2 + ", expected 0 or 1; at path " + c0558a.m1318n(true));
                            }
                            z2 = true;
                        }
                    } else {
                        if (m2740a4 != 7) {
                            throw new C0472g("Invalid bitset value type: " + AbstractC0044g.m160l(m1303B5) + "; at path " + c0558a.m1318n(false));
                        }
                        z2 = c0558a.m1322r();
                    }
                    if (z2) {
                        bitSet.set(i9);
                    }
                    i9++;
                    m1303B5 = c0558a.m1303B();
                }
                c0558a.m1315k();
                return bitSet;
            case 22:
                int m1303B6 = c0558a.m1303B();
                if (m1303B6 != 9) {
                    return m1303B6 == 6 ? Boolean.valueOf(Boolean.parseBoolean(c0558a.m1330z())) : Boolean.valueOf(c0558a.m1322r());
                }
                c0558a.m1328x();
                return null;
            case 23:
                if (c0558a.m1303B() != 9) {
                    return Boolean.valueOf(c0558a.m1330z());
                }
                c0558a.m1328x();
                return null;
            case 24:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                try {
                    int m1324t3 = c0558a.m1324t();
                    if (m1324t3 <= 255 && m1324t3 >= -128) {
                        return Byte.valueOf((byte) m1324t3);
                    }
                    throw new C0472g("Lossy conversion from " + m1324t3 + " to byte; at path " + c0558a.m1318n(true));
                } catch (NumberFormatException e9) {
                    throw new C0472g(e9);
                }
            case 25:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                try {
                    int m1324t4 = c0558a.m1324t();
                    if (m1324t4 <= 65535 && m1324t4 >= -32768) {
                        return Short.valueOf((short) m1324t4);
                    }
                    throw new C0472g("Lossy conversion from " + m1324t4 + " to short; at path " + c0558a.m1318n(true));
                } catch (NumberFormatException e10) {
                    throw new C0472g(e10);
                }
            case 26:
                if (c0558a.m1303B() == 9) {
                    c0558a.m1328x();
                    return null;
                }
                try {
                    return Integer.valueOf(c0558a.m1324t());
                } catch (NumberFormatException e11) {
                    throw new C0472g(e11);
                }
            case 27:
                try {
                    return new AtomicInteger(c0558a.m1324t());
                } catch (NumberFormatException e12) {
                    throw new C0472g(e12);
                }
            default:
                return new AtomicBoolean(c0558a.m1322r());
        }
    }

    @Override // p051S0.AbstractC0477l
    /* renamed from: b */
    public final void mo1222b(C0559b c0559b, Object obj) {
        switch (this.f1417a) {
            case 0:
                c0559b.m1344t((Number) obj);
                return;
            case 1:
                c0559b.m1332h();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i2 = 0; i2 < length; i2++) {
                    c0559b.m1343s(r6.get(i2));
                }
                c0559b.m1335k();
                return;
            case 2:
                Number number = (Number) obj;
                if (number == null) {
                    c0559b.m1339o();
                    return;
                } else {
                    c0559b.m1343s(number.longValue());
                    return;
                }
            case 3:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c0559b.m1339o();
                    return;
                }
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(number2.floatValue());
                }
                c0559b.m1344t(number2);
                return;
            case 4:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c0559b.m1339o();
                    return;
                } else {
                    c0559b.m1342r(number3.doubleValue());
                    return;
                }
            case 5:
                Character ch = (Character) obj;
                c0559b.m1345u(ch == null ? null : String.valueOf(ch));
                return;
            case 6:
                c0559b.m1345u((String) obj);
                return;
            case 7:
                c0559b.m1344t((BigDecimal) obj);
                return;
            case 8:
                c0559b.m1344t((BigInteger) obj);
                return;
            case 9:
                c0559b.m1344t((C0496j) obj);
                return;
            case 10:
                StringBuilder sb = (StringBuilder) obj;
                c0559b.m1345u(sb == null ? null : sb.toString());
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c0559b.m1345u(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 13:
                URL url = (URL) obj;
                c0559b.m1345u(url == null ? null : url.toExternalForm());
                return;
            case 14:
                URI uri = (URI) obj;
                c0559b.m1345u(uri == null ? null : uri.toASCIIString());
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                c0559b.m1345u(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 16:
                UUID uuid = (UUID) obj;
                c0559b.m1345u(uuid == null ? null : uuid.toString());
                return;
            case 17:
                c0559b.m1345u(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                if (((Calendar) obj) == null) {
                    c0559b.m1339o();
                    return;
                }
                c0559b.m1333i();
                c0559b.m1337m("year");
                c0559b.m1343s(r6.get(1));
                c0559b.m1337m("month");
                c0559b.m1343s(r6.get(2));
                c0559b.m1337m("dayOfMonth");
                c0559b.m1343s(r6.get(5));
                c0559b.m1337m("hourOfDay");
                c0559b.m1343s(r6.get(11));
                c0559b.m1337m("minute");
                c0559b.m1343s(r6.get(12));
                c0559b.m1337m("second");
                c0559b.m1343s(r6.get(13));
                c0559b.m1336l();
                return;
            case 19:
                Locale locale = (Locale) obj;
                c0559b.m1345u(locale == null ? null : locale.toString());
                return;
            case 20:
                m1282d(c0559b, (AbstractC0471f) obj);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                c0559b.m1332h();
                int length2 = bitSet.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    c0559b.m1343s(bitSet.get(i3) ? 1L : 0L);
                }
                c0559b.m1335k();
                return;
            case 22:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    c0559b.m1339o();
                    return;
                }
                c0559b.m1347w();
                c0559b.m1331g();
                c0559b.f1544a.write(bool.booleanValue() ? "true" : "false");
                return;
            case 23:
                Boolean bool2 = (Boolean) obj;
                c0559b.m1345u(bool2 == null ? "null" : bool2.toString());
                return;
            case 24:
                if (((Number) obj) == null) {
                    c0559b.m1339o();
                    return;
                } else {
                    c0559b.m1343s(r6.byteValue());
                    return;
                }
            case 25:
                if (((Number) obj) == null) {
                    c0559b.m1339o();
                    return;
                } else {
                    c0559b.m1343s(r6.shortValue());
                    return;
                }
            case 26:
                if (((Number) obj) == null) {
                    c0559b.m1339o();
                    return;
                } else {
                    c0559b.m1343s(r6.intValue());
                    return;
                }
            case 27:
                c0559b.m1343s(((AtomicInteger) obj).get());
                return;
            default:
                c0559b.m1346v(((AtomicBoolean) obj).get());
                return;
        }
    }
}
