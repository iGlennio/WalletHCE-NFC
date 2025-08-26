package p105p0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p032L1.AbstractC0354a;
import p041O1.AbstractC0398b;
import p041O1.InterfaceC0397a;
import p099n0.AbstractC1148b;
import p099n0.C1147a;
import p099n0.C1149c;
import p102o0.C1163a;
import p115s1.AbstractC1214d;
import p115s1.C1213c;

/* renamed from: p0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1175a {

    /* renamed from: a */
    public static final InterfaceC0397a f4467a = AbstractC0398b.m1056d(AbstractC1175a.class);

    /* renamed from: a */
    public static C1149c m2698a(C1213c c1213c) {
        InterfaceC0397a interfaceC0397a = f4467a;
        C1149c c1149c = null;
        try {
            try {
                try {
                    if (c1213c.f4763a.available() <= 2) {
                        return null;
                    }
                    C1163a m2700c = m2700c(c1213c.m2856h());
                    int m2855g = c1213c.m2855g();
                    if (c1213c.f4763a.available() >= m2855g) {
                        AbstractC1214d.m2858a(m2855g);
                        c1149c = new C1149c(m2700c, m2855g, c1213c.m2857i());
                    }
                    return c1149c;
                } catch (EOFException e2) {
                    interfaceC0397a.mo527a(e2.getMessage(), e2);
                    return null;
                }
            } catch (IOException e3) {
                interfaceC0397a.mo528b(e3.getMessage(), e3);
                return null;
            }
        } finally {
            AbstractC0354a.m1000a(c1213c);
        }
    }

    /* renamed from: b */
    public static ArrayList m2699b(byte[] bArr, C1163a... c1163aArr) {
        C1149c m2698a;
        ArrayList arrayList = new ArrayList();
        C1213c c1213c = new C1213c(new ByteArrayInputStream(bArr));
        while (c1213c.f4763a.available() > 0 && (m2698a = m2698a(c1213c)) != null) {
            try {
                try {
                    C1163a c1163a = m2698a.f4361a;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= c1163aArr.length) {
                            i2 = -1;
                            break;
                        }
                        if (c1163a.equals(c1163aArr[i2])) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        arrayList.add(m2698a);
                    } else {
                        if (c1163a.f4431e == 2) {
                            arrayList.addAll(m2699b(m2698a.f4362b, c1163aArr));
                        }
                    }
                } catch (IOException e2) {
                    f4467a.mo528b(e2.getMessage(), e2);
                    AbstractC0354a.m1000a(c1213c);
                    return arrayList;
                }
            } catch (Throwable th) {
                AbstractC0354a.m1000a(c1213c);
                throw th;
            }
        }
        AbstractC0354a.m1000a(c1213c);
        return arrayList;
    }

    /* renamed from: c */
    public static C1163a m2700c(int i2) {
        int i3 = AbstractC1214d.f4766a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int log = ((int) (Math.log(i2) / Math.log(256.0d))) + 1;
        for (int i4 = 0; i4 < log; i4++) {
            int i5 = ((log - i4) - 1) * 8;
            byteArrayOutputStream.write(((255 << i5) & i2) >> i5);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i6 = 3;
        int i7 = 3;
        while (i7 >= 0 && ((255 << (i7 * 8)) & i2) == 0) {
            i7--;
        }
        int i8 = i7 * 8;
        int i9 = (((255 << i8) & i2) >> i8) & 192;
        char c2 = i9 != 0 ? i9 != 64 ? i9 != 128 ? (char) 3 : (char) 2 : (char) 1 : (char) 0;
        if (c2 == 1) {
            byteArray[0] = (byte) (byteArray[0] | 64);
        } else if (c2 == 2) {
            byteArray[0] = (byte) (byteArray[0] | 128);
        } else if (c2 == 3) {
            byteArray[0] = (byte) (byteArray[0] | 192);
        }
        while (i6 >= 0 && ((255 << (i6 * 8)) & i2) == 0) {
            i6--;
        }
        int i10 = i6 * 8;
        if ((((i2 & (255 << i10)) >> i10) & 32) != 0) {
            byteArray[0] = (byte) (byteArray[0] | 32);
        }
        LinkedHashMap linkedHashMap = AbstractC1148b.f4358a;
        byteArray.getClass();
        C1163a c1163a = (C1163a) linkedHashMap.get(new C1147a(byteArray));
        return c1163a == null ? new C1163a(byteArray, 1, "[UNKNOWN TAG]") : c1163a;
    }
}
