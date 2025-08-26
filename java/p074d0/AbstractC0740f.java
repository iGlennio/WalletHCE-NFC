package p074d0;

import android.content.pm.PackageInfo;
import androidx.fragment.app.C0651y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import p005C.AbstractC0044g;

/* renamed from: d0.f */
/* loaded from: classes.dex */
public abstract class AbstractC0740f {

    /* renamed from: a */
    public static final C0651y f2957a = new C0651y(4);

    /* renamed from: b */
    public static final byte[] f2958b = {112, 114, 111, 0};

    /* renamed from: c */
    public static final byte[] f2959c = {112, 114, 109, 0};

    /* renamed from: d */
    public static final byte[] f2960d = {48, 49, 53, 0};

    /* renamed from: e */
    public static final byte[] f2961e = {48, 49, 48, 0};

    /* renamed from: f */
    public static final byte[] f2962f = {48, 48, 57, 0};

    /* renamed from: g */
    public static final byte[] f2963g = {48, 48, 53, 0};

    /* renamed from: h */
    public static final byte[] f2964h = {48, 48, 49, 0};

    /* renamed from: i */
    public static final byte[] f2965i = {48, 48, 49, 0};

    /* renamed from: j */
    public static final byte[] f2966j = {48, 48, 50, 0};

    /* renamed from: a */
    public static byte[] m2015a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m2016b(C0737c[] c0737cArr, byte[] bArr) {
        int i2 = 0;
        for (C0737c c0737c : c0737cArr) {
            i2 += ((((c0737c.f2954g * 2) + 7) & (-8)) / 8) + (c0737c.f2952e * 2) + m2018d(c0737c.f2948a, c0737c.f2949b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0737c.f2953f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, f2962f)) {
            for (C0737c c0737c2 : c0737cArr) {
                m2030p(byteArrayOutputStream, c0737c2, m2018d(c0737c2.f2948a, c0737c2.f2949b, bArr));
                m2032r(byteArrayOutputStream, c0737c2);
                int[] iArr = c0737c2.f2955h;
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = iArr[i3];
                    m2035u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                m2031q(byteArrayOutputStream, c0737c2);
            }
        } else {
            for (C0737c c0737c3 : c0737cArr) {
                m2030p(byteArrayOutputStream, c0737c3, m2018d(c0737c3.f2948a, c0737c3.f2949b, bArr));
            }
            for (C0737c c0737c4 : c0737cArr) {
                m2032r(byteArrayOutputStream, c0737c4);
                int[] iArr2 = c0737c4.f2955h;
                int length2 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr2[i6];
                    m2035u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                m2031q(byteArrayOutputStream, c0737c4);
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* renamed from: c */
    public static boolean m2017c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : listFiles) {
            z2 = m2017c(file2) && z2;
        }
        return z2;
    }

    /* renamed from: d */
    public static String m2018d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f2964h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f2963g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    /* renamed from: e */
    public static void m2019e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: f */
    public static byte[] m2020f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                throw new IllegalStateException(AbstractC0044g.m153e("Not enough bytes to read: ", i2));
            }
            i3 += read;
        }
        return bArr;
    }

    /* renamed from: g */
    public static int[] m2021g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) m2027m(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m2022h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p074d0.AbstractC0740f.m2022h(java.io.FileInputStream, int, int):byte[]");
    }

    /* renamed from: i */
    public static C0737c[] m2023i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0737c[] c0737cArr) {
        byte[] bArr3 = f2965i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f2966j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m2027m = (int) m2027m(fileInputStream, 2);
            byte[] m2022h = m2022h(fileInputStream, (int) m2027m(fileInputStream, 4), (int) m2027m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m2022h);
            try {
                C0737c[] m2025k = m2025k(byteArrayInputStream, bArr2, m2027m, c0737cArr);
                byteArrayInputStream.close();
                return m2025k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f2960d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m2027m2 = (int) m2027m(fileInputStream, 1);
        byte[] m2022h2 = m2022h(fileInputStream, (int) m2027m(fileInputStream, 4), (int) m2027m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(m2022h2);
        try {
            C0737c[] m2024j = m2024j(byteArrayInputStream2, m2027m2, c0737cArr);
            byteArrayInputStream2.close();
            return m2024j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: j */
    public static C0737c[] m2024j(ByteArrayInputStream byteArrayInputStream, int i2, C0737c[] c0737cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0737c[0];
        }
        if (i2 != c0737cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2027m = (int) m2027m(byteArrayInputStream, 2);
            iArr[i3] = (int) m2027m(byteArrayInputStream, 2);
            strArr[i3] = new String(m2020f(byteArrayInputStream, m2027m), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0737c c0737c = c0737cArr[i4];
            if (!c0737c.f2949b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            c0737c.f2952e = i5;
            c0737c.f2955h = m2021g(byteArrayInputStream, i5);
        }
        return c0737cArr;
    }

    /* renamed from: k */
    public static C0737c[] m2025k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, C0737c[] c0737cArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0737c[0];
        }
        if (i2 != c0737cArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m2027m(byteArrayInputStream, 2);
            String str = new String(m2020f(byteArrayInputStream, (int) m2027m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m2027m = m2027m(byteArrayInputStream, 4);
            int m2027m2 = (int) m2027m(byteArrayInputStream, 2);
            C0737c c0737c = null;
            if (c0737cArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= c0737cArr.length) {
                        break;
                    }
                    if (c0737cArr[i4].f2949b.equals(substring)) {
                        c0737c = c0737cArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (c0737c == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0737c.f2951d = m2027m;
            int[] m2021g = m2021g(byteArrayInputStream, m2027m2);
            if (Arrays.equals(bArr, f2964h)) {
                c0737c.f2952e = m2027m2;
                c0737c.f2955h = m2021g;
            }
        }
        return c0737cArr;
    }

    /* renamed from: l */
    public static C0737c[] m2026l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f2961e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m2027m = (int) m2027m(fileInputStream, 1);
        byte[] m2022h = m2022h(fileInputStream, (int) m2027m(fileInputStream, 4), (int) m2027m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m2022h);
        try {
            C0737c[] m2028n = m2028n(byteArrayInputStream, str, m2027m);
            byteArrayInputStream.close();
            return m2028n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m2027m(InputStream inputStream, int i2) {
        byte[] m2020f = m2020f(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (m2020f[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    /* renamed from: n */
    public static C0737c[] m2028n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0737c[0];
        }
        C0737c[] c0737cArr = new C0737c[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m2027m = (int) m2027m(byteArrayInputStream, 2);
            int m2027m2 = (int) m2027m(byteArrayInputStream, 2);
            c0737cArr[i3] = new C0737c(str, new String(m2020f(byteArrayInputStream, m2027m), StandardCharsets.UTF_8), m2027m(byteArrayInputStream, 4), m2027m2, (int) m2027m(byteArrayInputStream, 4), (int) m2027m(byteArrayInputStream, 4), new int[m2027m2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C0737c c0737c = c0737cArr[i4];
            int available = byteArrayInputStream.available() - c0737c.f2953f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c0737c.f2956i;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) m2027m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i5), 1);
                for (int m2027m3 = (int) m2027m(byteArrayInputStream, 2); m2027m3 > 0; m2027m3--) {
                    m2027m(byteArrayInputStream, 2);
                    int m2027m4 = (int) m2027m(byteArrayInputStream, 1);
                    if (m2027m4 != 6 && m2027m4 != 7) {
                        while (m2027m4 > 0) {
                            m2027m(byteArrayInputStream, 1);
                            for (int m2027m5 = (int) m2027m(byteArrayInputStream, 1); m2027m5 > 0; m2027m5--) {
                                m2027m(byteArrayInputStream, 2);
                            }
                            m2027m4--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0737c.f2955h = m2021g(byteArrayInputStream, c0737c.f2952e);
            int i6 = c0737c.f2954g;
            BitSet valueOf = BitSet.valueOf(m2020f(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = valueOf.get(i7) ? 2 : 0;
                if (valueOf.get(i7 + i6)) {
                    i8 |= 4;
                }
                if (i8 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                }
            }
        }
        return c0737cArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public static boolean m2029o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0737c[] c0737cArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f2960d;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f2961e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] m2016b = m2016b(c0737cArr, bArr3);
                m2034t(byteArrayOutputStream, c0737cArr.length, 1);
                m2034t(byteArrayOutputStream, m2016b.length, 4);
                byte[] m2015a = m2015a(m2016b);
                m2034t(byteArrayOutputStream, m2015a.length, 4);
                byteArrayOutputStream.write(m2015a);
                return true;
            }
            byte[] bArr4 = f2963g;
            if (Arrays.equals(bArr, bArr4)) {
                m2034t(byteArrayOutputStream, c0737cArr.length, 1);
                for (C0737c c0737c : c0737cArr) {
                    int size = c0737c.f2956i.size() * 4;
                    String m2018d = m2018d(c0737c.f2948a, c0737c.f2949b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m2035u(byteArrayOutputStream, m2018d.getBytes(charset).length);
                    m2035u(byteArrayOutputStream, c0737c.f2955h.length);
                    m2034t(byteArrayOutputStream, size, 4);
                    m2034t(byteArrayOutputStream, c0737c.f2950c, 4);
                    byteArrayOutputStream.write(m2018d.getBytes(charset));
                    Iterator it = c0737c.f2956i.keySet().iterator();
                    while (it.hasNext()) {
                        m2035u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m2035u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c0737c.f2955h) {
                        m2035u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f2962f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] m2016b2 = m2016b(c0737cArr, bArr5);
                m2034t(byteArrayOutputStream, c0737cArr.length, 1);
                m2034t(byteArrayOutputStream, m2016b2.length, 4);
                byte[] m2015a2 = m2015a(m2016b2);
                m2034t(byteArrayOutputStream, m2015a2.length, 4);
                byteArrayOutputStream.write(m2015a2);
                return true;
            }
            byte[] bArr6 = f2964h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m2035u(byteArrayOutputStream, c0737cArr.length);
            for (C0737c c0737c2 : c0737cArr) {
                String m2018d2 = m2018d(c0737c2.f2948a, c0737c2.f2949b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m2035u(byteArrayOutputStream, m2018d2.getBytes(charset2).length);
                TreeMap treeMap = c0737c2.f2956i;
                m2035u(byteArrayOutputStream, treeMap.size());
                m2035u(byteArrayOutputStream, c0737c2.f2955h.length);
                m2034t(byteArrayOutputStream, c0737c2.f2950c, 4);
                byteArrayOutputStream.write(m2018d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m2035u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c0737c2.f2955h) {
                    m2035u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m2035u(byteArrayOutputStream2, c0737cArr.length);
            int i5 = 2;
            int i6 = 2;
            for (C0737c c0737c3 : c0737cArr) {
                m2034t(byteArrayOutputStream2, c0737c3.f2950c, 4);
                m2034t(byteArrayOutputStream2, c0737c3.f2951d, 4);
                m2034t(byteArrayOutputStream2, c0737c3.f2954g, 4);
                String m2018d3 = m2018d(c0737c3.f2948a, c0737c3.f2949b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = m2018d3.getBytes(charset3).length;
                m2035u(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(m2018d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            C0748n c0748n = new C0748n(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0748n);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < c0737cArr.length) {
                try {
                    C0737c c0737c4 = c0737cArr[i7];
                    m2035u(byteArrayOutputStream3, i7);
                    m2035u(byteArrayOutputStream3, c0737c4.f2952e);
                    i8 = i8 + 4 + (c0737c4.f2952e * i5);
                    int[] iArr = c0737c4.f2955h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    int i10 = i5;
                    int i11 = i9;
                    while (i11 < length3) {
                        int i12 = iArr[i11];
                        m2035u(byteArrayOutputStream3, i12 - i9);
                        i11++;
                        i9 = i12;
                    }
                    i7++;
                    i5 = i10;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            C0748n c0748n2 = new C0748n(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0748n2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            int i14 = 0;
            while (i13 < c0737cArr.length) {
                try {
                    C0737c c0737c5 = c0737cArr[i13];
                    Iterator it3 = c0737c5.f2956i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m2031q(byteArrayOutputStream4, c0737c5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m2032r(byteArrayOutputStream4, c0737c5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m2035u(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i14 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m2034t(byteArrayOutputStream3, length4, 4);
                            m2035u(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i14 = i16 + length4;
                            i13++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i14 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray5.length);
            }
            C0748n c0748n3 = new C0748n(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0748n3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            m2034t(byteArrayOutputStream, arrayList2.size(), 4);
            int i17 = 0;
            while (i17 < arrayList2.size()) {
                C0748n c0748n4 = (C0748n) arrayList2.get(i17);
                int i18 = c0748n4.f2977a;
                if (i18 == 1) {
                    j2 = 0;
                } else if (i18 == 2) {
                    j2 = 1;
                } else if (i18 == 3) {
                    j2 = 2;
                } else if (i18 == 4) {
                    j2 = 3;
                } else {
                    if (i18 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                m2034t(byteArrayOutputStream, j2, 4);
                m2034t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0748n4.f2978b;
                if (c0748n4.f2979c) {
                    long length5 = bArr7.length;
                    byte[] m2015a3 = m2015a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(m2015a3);
                    m2034t(byteArrayOutputStream, m2015a3.length, 4);
                    m2034t(byteArrayOutputStream, length5, 4);
                    length = m2015a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m2034t(byteArrayOutputStream, bArr7.length, 4);
                    m2034t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* renamed from: p */
    public static void m2030p(ByteArrayOutputStream byteArrayOutputStream, C0737c c0737c, String str) {
        Charset charset = StandardCharsets.UTF_8;
        m2035u(byteArrayOutputStream, str.getBytes(charset).length);
        m2035u(byteArrayOutputStream, c0737c.f2952e);
        m2034t(byteArrayOutputStream, c0737c.f2953f, 4);
        m2034t(byteArrayOutputStream, c0737c.f2950c, 4);
        m2034t(byteArrayOutputStream, c0737c.f2954g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: q */
    public static void m2031q(ByteArrayOutputStream byteArrayOutputStream, C0737c c0737c) {
        byte[] bArr = new byte[(((c0737c.f2954g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0737c.f2956i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i2 = intValue / 8;
                bArr[i2] = (byte) (bArr[i2] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i3 = intValue + c0737c.f2954g;
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: r */
    public static void m2032r(ByteArrayOutputStream byteArrayOutputStream, C0737c c0737c) {
        int i2 = 0;
        for (Map.Entry entry : c0737c.f2956i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m2035u(byteArrayOutputStream, intValue - i2);
                m2035u(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2033s(android.content.Context r18, java.util.concurrent.Executor r19, p074d0.InterfaceC0739e r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p074d0.AbstractC0740f.m2033s(android.content.Context, java.util.concurrent.Executor, d0.e, boolean):void");
    }

    /* renamed from: t */
    public static void m2034t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: u */
    public static void m2035u(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        m2034t(byteArrayOutputStream, i2, 2);
    }
}
