package p126w1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p007C1.C0062b;
import p010D1.AbstractC0096d;
import p026J1.C0239g;
import p026J1.C0247o;
import p026J1.C0249q;
import p026J1.InterfaceC0241i;
import p026J1.InterfaceC0254v;
import p047Q1.AbstractC0458e;
import p075d1.C0765q;
import p095l1.AbstractC1136c;
import p095l1.C1139f;
import p112r1.AbstractC1191a;
import p112r1.AbstractC1199i;
import p123v1.C1281k;
import p123v1.C1283m;
import p123v1.C1290t;
import p123v1.C1291u;

/* renamed from: w1.b */
/* loaded from: classes.dex */
public abstract class AbstractC1302b {

    /* renamed from: a */
    public static final byte[] f5337a;

    /* renamed from: b */
    public static final C1281k f5338b = AbstractC0096d.m332T(new String[0]);

    /* renamed from: c */
    public static final C1291u f5339c;

    /* renamed from: d */
    public static final C0247o f5340d;

    /* renamed from: e */
    public static final TimeZone f5341e;

    /* renamed from: f */
    public static final C1139f f5342f;

    /* renamed from: g */
    public static final String f5343g;

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p126w1.AbstractC1302b.<clinit>():void");
    }

    /* renamed from: A */
    public static final void m2991A(IOException iOException, List list) {
        AbstractC1136c.m2637e(iOException, "$this$withSuppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0458e.m1188f(iOException, (Exception) it.next());
        }
    }

    /* renamed from: a */
    public static final boolean m2992a(C1283m c1283m, C1283m c1283m2) {
        AbstractC1136c.m2637e(c1283m, "$this$canReuseConnectionFor");
        AbstractC1136c.m2637e(c1283m2, "other");
        return AbstractC1136c.m2633a(c1283m.f5195e, c1283m2.f5195e) && c1283m.f5196f == c1283m2.f5196f && AbstractC1136c.m2633a(c1283m.f5192b, c1283m2.f5192b);
    }

    /* renamed from: b */
    public static final void m2993b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: c */
    public static final void m2994c(Closeable closeable) {
        AbstractC1136c.m2637e(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final void m2995d(Socket socket) {
        AbstractC1136c.m2637e(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!AbstractC1136c.m2633a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final int m2996e(String str, char c2, int i2, int i3) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: f */
    public static final int m2997f(String str, String str2, int i2, int i3) {
        while (i2 < i3) {
            if (AbstractC1199i.m2764p0(str2, str.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: g */
    public static /* synthetic */ int m2998g(String str, char c2, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = str.length();
        }
        return m2996e(str, c2, i2, i3);
    }

    /* renamed from: h */
    public static final boolean m2999h(InterfaceC0254v interfaceC0254v) {
        AbstractC1136c.m2637e(TimeUnit.MILLISECONDS, "timeUnit");
        try {
            return m3012u(interfaceC0254v, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static final String m3000i(String str, Object... objArr) {
        AbstractC1136c.m2637e(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* renamed from: j */
    public static final boolean m3001j(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1136c.m2637e(strArr, "$this$hasIntersection");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public static final long m3002k(C1290t c1290t) {
        String m2964a = c1290t.f5286f.m2964a("Content-Length");
        if (m2964a == null) {
            return -1L;
        }
        try {
            return Long.parseLong(m2964a);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: l */
    public static final List m3003l(Object... objArr) {
        List list;
        AbstractC1136c.m2637e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        AbstractC1136c.m2637e(copyOf, "elements");
        if (copyOf.length > 0) {
            list = Arrays.asList(copyOf);
            AbstractC1136c.m2636d(list, "asList(this)");
        } else {
            list = C0765q.f2996a;
        }
        List unmodifiableList = Collections.unmodifiableList(list);
        AbstractC1136c.m2636d(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: m */
    public static final int m3004m(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (AbstractC1136c.m2638f(charAt, 31) <= 0 || AbstractC1136c.m2638f(charAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public static final int m3005n(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: o */
    public static final int m3006o(String str, int i2, int i3) {
        int i4 = i3 - 1;
        if (i4 >= i2) {
            while (true) {
                char charAt = str.charAt(i4);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i4 + 1;
                }
                if (i4 == i2) {
                    break;
                }
                i4--;
            }
        }
        return i2;
    }

    /* renamed from: p */
    public static final String[] m3007p(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1136c.m2637e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: q */
    public static final boolean m3008q(String str) {
        AbstractC1136c.m2637e(str, "name");
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* renamed from: r */
    public static final int m3009r(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        return -1;
    }

    /* renamed from: s */
    public static final Charset m3010s(InterfaceC0241i interfaceC0241i, Charset charset) {
        AbstractC1136c.m2637e(interfaceC0241i, "$this$readBomAsCharset");
        AbstractC1136c.m2637e(charset, "default");
        int mo663d = interfaceC0241i.mo663d(f5340d);
        if (mo663d == -1) {
            return charset;
        }
        if (mo663d == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            AbstractC1136c.m2636d(charset2, "UTF_8");
            return charset2;
        }
        if (mo663d == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            AbstractC1136c.m2636d(charset3, "UTF_16BE");
            return charset3;
        }
        if (mo663d == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            AbstractC1136c.m2636d(charset4, "UTF_16LE");
            return charset4;
        }
        if (mo663d == 3) {
            Charset charset5 = AbstractC1191a.f4563a;
            Charset charset6 = AbstractC1191a.f4565c;
            if (charset6 != null) {
                return charset6;
            }
            Charset forName = Charset.forName("UTF-32BE");
            AbstractC1136c.m2636d(forName, "forName(\"UTF-32BE\")");
            AbstractC1191a.f4565c = forName;
            return forName;
        }
        if (mo663d != 4) {
            throw new AssertionError();
        }
        Charset charset7 = AbstractC1191a.f4563a;
        Charset charset8 = AbstractC1191a.f4564b;
        if (charset8 != null) {
            return charset8;
        }
        Charset forName2 = Charset.forName("UTF-32LE");
        AbstractC1136c.m2636d(forName2, "forName(\"UTF-32LE\")");
        AbstractC1191a.f4564b = forName2;
        return forName2;
    }

    /* renamed from: t */
    public static final int m3011t(C0249q c0249q) {
        AbstractC1136c.m2637e(c0249q, "$this$readMedium");
        return (c0249q.m714i() & 255) | ((c0249q.m714i() & 255) << 16) | ((c0249q.m714i() & 255) << 8);
    }

    /* renamed from: u */
    public static final boolean m3012u(InterfaceC0254v interfaceC0254v, int i2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1136c.m2637e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long mo699c = interfaceC0254v.mo100a().mo701e() ? interfaceC0254v.mo100a().mo699c() - nanoTime : Long.MAX_VALUE;
        interfaceC0254v.mo100a().mo700d(Math.min(mo699c, timeUnit.toNanos(i2)) + nanoTime);
        try {
            C0239g c0239g = new C0239g();
            while (interfaceC0254v.mo101c(c0239g, 8192L) != -1) {
                c0239g.m678s(c0239g.f715b);
            }
            if (mo699c == Long.MAX_VALUE) {
                interfaceC0254v.mo100a().mo697a();
                return true;
            }
            interfaceC0254v.mo100a().mo700d(nanoTime + mo699c);
            return true;
        } catch (InterruptedIOException unused) {
            if (mo699c == Long.MAX_VALUE) {
                interfaceC0254v.mo100a().mo697a();
                return false;
            }
            interfaceC0254v.mo100a().mo700d(nanoTime + mo699c);
            return false;
        } catch (Throwable th) {
            if (mo699c == Long.MAX_VALUE) {
                interfaceC0254v.mo100a().mo697a();
            } else {
                interfaceC0254v.mo100a().mo700d(nanoTime + mo699c);
            }
            throw th;
        }
    }

    /* renamed from: v */
    public static final C1281k m3013v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0062b c0062b = (C0062b) it.next();
            String m695j = c0062b.f152b.m695j();
            String m695j2 = c0062b.f153c.m695j();
            arrayList.add(m695j);
            arrayList.add(AbstractC1199i.m2763I0(m695j2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new C1281k((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[RETURN] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m3014w(p123v1.C1283m r3, boolean r4) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            p095l1.AbstractC1136c.m2637e(r3, r0)
            java.lang.String r0 = ":"
            java.lang.String r1 = r3.f5195e
            boolean r0 = p112r1.AbstractC1199i.m2765q0(r1, r0)
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r0.<init>(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L22:
            int r0 = r3.f5196f
            if (r4 != 0) goto L57
            java.lang.String r3 = r3.f5192b
            java.lang.String r4 = "scheme"
            p095l1.AbstractC1136c.m2637e(r3, r4)
            int r4 = r3.hashCode()
            r2 = 3213448(0x310888, float:4.503E-39)
            if (r4 == r2) goto L47
            r2 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r4 == r2) goto L3c
            goto L52
        L3c:
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L52
            r3 = 443(0x1bb, float:6.21E-43)
            goto L53
        L47:
            java.lang.String r4 = "http"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L52
            r3 = 80
            goto L53
        L52:
            r3 = -1
        L53:
            if (r0 == r3) goto L56
            goto L57
        L56:
            return r1
        L57:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r4 = 58
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p126w1.AbstractC1302b.m3014w(v1.m, boolean):java.lang.String");
    }

    /* renamed from: x */
    public static final List m3015x(List list) {
        AbstractC1136c.m2637e(list, "$this$toImmutableList");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        AbstractC1136c.m2636d(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* renamed from: y */
    public static final int m3016y(String str, int i2) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    /* renamed from: z */
    public static final String m3017z(String str, int i2, int i3) {
        int m3005n = m3005n(str, i2, i3);
        String substring = str.substring(m3005n, m3006o(str, m3005n, i3));
        AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
