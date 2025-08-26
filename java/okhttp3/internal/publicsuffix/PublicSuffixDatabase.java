package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import p005C.C0046i;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p010D1.C0106n;
import p026J1.AbstractC0246n;
import p026J1.C0236d;
import p026J1.C0244l;
import p026J1.C0249q;
import p026J1.C0256x;
import p034M0.C0360e;
import p075d1.AbstractC0757i;
import p075d1.AbstractC0758j;
import p075d1.C0765q;
import p095l1.AbstractC1136c;
import p109q1.C1184a;
import p109q1.InterfaceC1185b;
import p112r1.AbstractC1199i;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f4440e = {(byte) 42};

    /* renamed from: f */
    public static final List f4441f = AbstractC0104l.m391F("*");

    /* renamed from: g */
    public static final PublicSuffixDatabase f4442g = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f4443a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f4444b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f4445c;

    /* renamed from: d */
    public byte[] f4446d;

    /* renamed from: c */
    public static List m2690c(String str) {
        int i2 = 0;
        List m2758D0 = AbstractC1199i.m2758D0(str, new char[]{'.'});
        if (m2758D0.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!AbstractC1136c.m2633a((String) m2758D0.get(m2758D0.size() - 1), "")) {
            return m2758D0;
        }
        int size = m2758D0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        if (size == 0) {
            return C0765q.f2996a;
        }
        if (size >= m2758D0.size()) {
            return AbstractC0757i.m2055a0(m2758D0);
        }
        if (size == 1) {
            if (m2758D0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return AbstractC0104l.m391F(m2758D0.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = m2758D0.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == size) {
                break;
            }
        }
        return AbstractC0758j.m2056W(arrayList);
    }

    /* renamed from: a */
    public final String m2691a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        int size;
        int size2;
        int i2 = 0;
        String unicode = IDN.toUnicode(str);
        AbstractC1136c.m2636d(unicode, "unicodeDomain");
        List m2690c = m2690c(unicode);
        if (this.f4443a.get() || !this.f4443a.compareAndSet(false, true)) {
            try {
                this.f4444b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        m2692b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z2 = true;
                    } catch (IOException e2) {
                        C0106n c0106n = C0106n.f319a;
                        C0106n.f319a.getClass();
                        C0106n.m436i("Failed to read public suffix list", 5, e2);
                        if (z2) {
                        }
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f4445c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = m2690c.size();
        byte[][] bArr = new byte[size3][];
        for (int i3 = 0; i3 < size3; i3++) {
            String str5 = (String) m2690c.get(i3);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC1136c.m2636d(charset, "UTF_8");
            if (str5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str5.getBytes(charset);
            AbstractC1136c.m2636d(bytes, "(this as java.lang.String).getBytes(charset)");
            bArr[i3] = bytes;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                str2 = null;
                break;
            }
            byte[] bArr2 = this.f4445c;
            if (bArr2 == null) {
                AbstractC1136c.m2640h("publicSuffixListBytes");
                throw null;
            }
            str2 = C0360e.m1005b(bArr2, bArr, i4);
            if (str2 != null) {
                break;
            }
            i4++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i5 = 0; i5 < length; i5++) {
                bArr3[i5] = f4440e;
                byte[] bArr4 = this.f4445c;
                if (bArr4 == null) {
                    AbstractC1136c.m2640h("publicSuffixListBytes");
                    throw null;
                }
                str3 = C0360e.m1005b(bArr4, bArr3, i5);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i6 = size3 - 1;
            for (int i7 = 0; i7 < i6; i7++) {
                byte[] bArr5 = this.f4446d;
                if (bArr5 == null) {
                    AbstractC1136c.m2640h("publicSuffixExceptionListBytes");
                    throw null;
                }
                str4 = C0360e.m1005b(bArr5, bArr, i7);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = AbstractC1199i.m2758D0("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = f4441f;
        } else {
            List list2 = C0765q.f2996a;
            List m2758D0 = str2 != null ? AbstractC1199i.m2758D0(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = AbstractC1199i.m2758D0(str3, new char[]{'.'});
            }
            list = m2758D0.size() > list2.size() ? m2758D0 : list2;
        }
        if (m2690c.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list.get(0)).charAt(0) == '!') {
            size = m2690c.size();
            size2 = list.size();
        } else {
            size = m2690c.size();
            size2 = list.size() + 1;
        }
        int i8 = size - size2;
        InterfaceC1185b c0046i = new C0046i(23, m2690c(str));
        if (i8 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
        }
        if (i8 != 0) {
            c0046i = new C1184a(c0046i, i8);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        for (Object obj : c0046i) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) ".");
            }
            AbstractC0096d.m341d(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        AbstractC1136c.m2636d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: b */
    public final void m2692b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = AbstractC0246n.f730a;
        C0249q c0249q = new C0249q(new C0244l(new C0236d(resourceAsStream, 1, new C0256x())));
        try {
            long m718m = c0249q.m718m();
            c0249q.m723r(m718m);
            byte[] m671l = c0249q.f736a.m671l(m718m);
            long m718m2 = c0249q.m718m();
            c0249q.m723r(m718m2);
            byte[] m671l2 = c0249q.f736a.m671l(m718m2);
            c0249q.close();
            synchronized (this) {
                this.f4445c = m671l;
                this.f4446d = m671l2;
            }
            this.f4444b.countDown();
        } finally {
        }
    }
}
