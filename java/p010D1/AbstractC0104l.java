package p010D1;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EdgeEffect;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nfc.share.nfcshare.MainActivity;
import p001A1.C0010i;
import p005C.AbstractC0044g;
import p017G0.C0176h;
import p026J1.C0238f;
import p026J1.C0239g;
import p026J1.C0242j;
import p034M0.C0376u;
import p045Q.AbstractC0437d;
import p045Q.AbstractC0438e;
import p045Q.InterfaceC0443j;
import p047Q1.AbstractC0458e;
import p088j.C0958R0;
import p095l1.AbstractC1136c;
import p095l1.InterfaceC1134a;
import p104p.AbstractFutureC1173g;
import p104p.C1169c;
import p104p.C1172f;
import p106p1.InterfaceC1176a;
import p112r1.AbstractC1199i;
import p123v1.C1279i;
import p123v1.C1285o;
import p123v1.EnumC1288r;
import p126w1.AbstractC1302b;
import p133z.AbstractC1326c;
import p133z.AbstractC1327d;

/* renamed from: D1.l */
/* loaded from: classes.dex */
public abstract class AbstractC0104l implements InterfaceC0443j {
    /* renamed from: C */
    public static int m388C(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC0044g.m153e("type needs to be >= FIRST and <= LAST, type=", i2));
    }

    /* renamed from: D */
    public static boolean m389D(MainActivity mainActivity) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) mainActivity.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) ? false : true;
    }

    /* renamed from: E */
    public static boolean m390E(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: F */
    public static List m391F(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC1136c.m2636d(singletonList, "singletonList(element)");
        return singletonList;
    }

    /* renamed from: G */
    public static MappedByteBuffer m392G(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: J */
    public static float m393J(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0438e.m1133c(edgeEffect, f, f2);
        }
        AbstractC0437d.m1130a(edgeEffect, f, f2);
        return f;
    }

    /* renamed from: O */
    public static C0010i m394O(String str) {
        int i2;
        String str2;
        AbstractC1136c.m2637e(str, "statusLine");
        boolean m2760F0 = AbstractC1199i.m2760F0(str, "HTTP/1.", false);
        EnumC1288r enumC1288r = EnumC1288r.HTTP_1_0;
        if (m2760F0) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC1288r = EnumC1288r.HTTP_1_1;
            }
        } else {
            if (!AbstractC1199i.m2760F0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i2, i3);
            AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i3) {
                str2 = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i2 + 4);
                AbstractC1136c.m2636d(str2, "(this as java.lang.String).substring(startIndex)");
            }
            return new C0010i(enumC1288r, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* renamed from: P */
    public static long m395P(String str, int i2) {
        int m409p = m409p(str, 0, i2, false);
        Matcher matcher = C1279i.f5167m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (m409p < i2) {
            int m409p2 = m409p(str, m409p + 1, i2, true);
            matcher.region(m409p, m409p2);
            if (i4 == -1 && matcher.usePattern(C1279i.f5167m).matches()) {
                String group = matcher.group(1);
                AbstractC1136c.m2636d(group, "matcher.group(1)");
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                AbstractC1136c.m2636d(group2, "matcher.group(2)");
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                AbstractC1136c.m2636d(group3, "matcher.group(3)");
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(C1279i.f5166l).matches()) {
                String group4 = matcher.group(1);
                AbstractC1136c.m2636d(group4, "matcher.group(1)");
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = C1279i.f5165k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        AbstractC1136c.m2636d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        AbstractC1136c.m2636d(locale, "Locale.US");
                        String lowerCase = group5.toLowerCase(locale);
                        AbstractC1136c.m2636d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        AbstractC1136c.m2636d(pattern2, "MONTH_PATTERN.pattern()");
                        i6 = AbstractC1199i.m2770v0(pattern2, lowerCase, 0, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(C1279i.f5164j).matches()) {
                    String group6 = matcher.group(1);
                    AbstractC1136c.m2636d(group6, "matcher.group(1)");
                    i3 = Integer.parseInt(group6);
                }
            }
            m409p = m409p(str, m409p2 + 1, i2, false);
        }
        if (70 <= i3 && 99 >= i3) {
            i3 += 1900;
        }
        if (i3 >= 0 && 69 >= i3) {
            i3 += 2000;
        }
        if (!(i3 >= 1601)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i5 || 31 < i5) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0 || 23 < i4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || 59 < i7) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 < 0 || 59 < i8) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC1302b.f5341e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* renamed from: S */
    public static void m396S(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    /* renamed from: T */
    public static final String m397T(String str) {
        AbstractC1136c.m2637e(str, "$this$toCanonicalHost");
        int i2 = 0;
        int i3 = -1;
        if (!AbstractC1199i.m2765q0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC1136c.m2636d(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                AbstractC1136c.m2636d(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                AbstractC1136c.m2636d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = lowerCase.charAt(i4);
                    if (AbstractC1136c.m2638f(charAt, 31) <= 0 || AbstractC1136c.m2638f(charAt, 127) >= 0 || AbstractC1199i.m2769u0(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress m410q = (AbstractC1199i.m2760F0(str, "[", false) && str.endsWith("]")) ? m410q(str, 1, str.length() - 1) : m410q(str, 0, str.length());
        if (m410q == null) {
            return null;
        }
        byte[] address = m410q.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return m410q.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        C0239g c0239g = new C0239g();
        while (i2 < address.length) {
            if (i2 == i3) {
                c0239g.m685z(58);
                i2 += i6;
                if (i2 == 16) {
                    c0239g.m685z(58);
                }
            } else {
                if (i2 > 0) {
                    c0239g.m685z(58);
                }
                byte b = address[i2];
                byte[] bArr = AbstractC1302b.f5337a;
                c0239g.m657A(((b & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c0239g.m677r();
    }

    /* renamed from: U */
    public static void m398U(C0238f c0238f, byte[] bArr) {
        long j2;
        AbstractC1136c.m2637e(c0238f, "cursor");
        AbstractC1136c.m2637e(bArr, "key");
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = c0238f.f711e;
            int i3 = c0238f.f712f;
            int i4 = c0238f.f713g;
            if (bArr2 != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
            long j3 = c0238f.f710d;
            C0239g c0239g = c0238f.f707a;
            AbstractC1136c.m2634b(c0239g);
            if (j3 == c0239g.f715b) {
                throw new IllegalStateException("no more bytes");
            }
            j2 = c0238f.f710d;
        } while (c0238f.m656h(j2 == -1 ? 0L : j2 + (c0238f.f713g - c0238f.f712f)) != -1);
    }

    /* renamed from: a */
    public static final boolean m399a(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        AbstractC1136c.m2637e(bArr, "a");
        AbstractC1136c.m2637e(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m400b(long j2, C0239g c0239g, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        C0242j c0242j;
        int i5;
        int i6;
        long j3;
        int i7;
        C0239g c0239g2;
        ArrayList arrayList3;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        int i9 = 0;
        int i10 = 1;
        if (!(i3 < i4)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i11 = i3; i11 < i4; i11++) {
            if (((C0242j) arrayList4.get(i11)).mo688c() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0242j c0242j2 = (C0242j) arrayList.get(i3);
        C0242j c0242j3 = (C0242j) arrayList4.get(i4 - 1);
        if (i8 == c0242j2.mo688c()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i12 = i3 + 1;
            c0242j = (C0242j) arrayList4.get(i12);
            i5 = i12;
            i6 = intValue;
        } else {
            c0242j = c0242j2;
            i5 = i3;
            i6 = -1;
        }
        if (c0242j.mo691f(i8) == c0242j3.mo691f(i8)) {
            int min = Math.min(c0242j.mo688c(), c0242j3.mo688c());
            for (int i13 = i8; i13 < min && c0242j.mo691f(i13) == c0242j3.mo691f(i13); i13++) {
                i9++;
            }
            long j4 = 4;
            long j5 = (c0239g.f715b / j4) + j2 + 2 + i9 + 1;
            c0239g.m658B(-i9);
            c0239g.m658B(i6);
            int i14 = i8 + i9;
            while (i8 < i14) {
                c0239g.m658B(c0242j.mo691f(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i14 != ((C0242j) arrayList4.get(i5)).mo688c()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0239g.m658B(((Number) arrayList5.get(i5)).intValue());
                return;
            } else {
                C0239g c0239g3 = new C0239g();
                c0239g.m658B(((int) ((c0239g3.f715b / j4) + j5)) * (-1));
                m400b(j5, c0239g3, i14, arrayList4, i5, i4, arrayList5);
                c0239g.m684y(c0239g3);
                return;
            }
        }
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((C0242j) arrayList4.get(i15 - 1)).mo691f(i8) != ((C0242j) arrayList4.get(i15)).mo691f(i8)) {
                i10++;
            }
        }
        long j6 = 4;
        long j7 = (c0239g.f715b / j6) + j2 + 2 + (i10 * 2);
        c0239g.m658B(i10);
        c0239g.m658B(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int mo691f = ((C0242j) arrayList4.get(i16)).mo691f(i8);
            if (i16 == i5 || mo691f != ((C0242j) arrayList4.get(i16 - 1)).mo691f(i8)) {
                c0239g.m658B(mo691f & 255);
            }
        }
        C0239g c0239g4 = new C0239g();
        int i17 = i5;
        while (i17 < i4) {
            byte mo691f2 = ((C0242j) arrayList4.get(i17)).mo691f(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (mo691f2 != ((C0242j) arrayList4.get(i19)).mo691f(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((C0242j) arrayList4.get(i17)).mo688c()) {
                c0239g.m658B(((Number) arrayList5.get(i17)).intValue());
                int i20 = i19;
                c0239g2 = c0239g4;
                arrayList3 = arrayList5;
                i7 = i20;
                j3 = j7;
            } else {
                c0239g.m658B(((int) ((c0239g4.f715b / j6) + j7)) * (-1));
                ArrayList arrayList6 = arrayList5;
                j3 = j7;
                i7 = i19;
                m400b(j3, c0239g4, i8 + 1, arrayList, i17, i7, arrayList6);
                arrayList4 = arrayList;
                c0239g2 = c0239g4;
                arrayList3 = arrayList6;
            }
            j7 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
            c0239g4 = c0239g2;
        }
        c0239g.m684y(c0239g4);
    }

    /* renamed from: f */
    public static final void m401f(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    /* renamed from: g */
    public static int m402g(Context context, String str) {
        int m3036c;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String m3037d = AbstractC1326c.m3037d(str);
            if (m3037d != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    m3036c = AbstractC1326c.m3036c((AppOpsManager) AbstractC1326c.m3034a(context, AppOpsManager.class), m3037d, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager m3040c = AbstractC1327d.m3040c(context);
                    m3036c = AbstractC1327d.m3038a(m3040c, m3037d, Binder.getCallingUid(), packageName);
                    if (m3036c == 0) {
                        m3036c = AbstractC1327d.m3038a(m3040c, m3037d, myUid, AbstractC1327d.m3039b(context));
                    }
                } else {
                    m3036c = AbstractC1326c.m3036c((AppOpsManager) AbstractC1326c.m3034a(context, AppOpsManager.class), m3037d, packageName);
                }
                if (m3036c != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: h */
    public static int m403h(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    /* renamed from: k */
    public static final void m404k(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0458e.m1188f(th, th2);
            }
        }
    }

    /* renamed from: l */
    public static void m405l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: m */
    public static boolean m406m(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m407n = m407n(file, inputStream);
            m405l(inputStream);
            return m407n;
        } catch (Throwable th2) {
            th = th2;
            m405l(inputStream);
            throw th;
        }
    }

    /* renamed from: n */
    public static boolean m407n(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            m405l(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m405l(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m405l(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.emoji2.text.C0603q m408o(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            androidx.emoji2.text.c r0 = new androidx.emoji2.text.c
            r1 = 25
            r0.<init>(r1)
            goto L15
        Le:
            M0.e r0 = new M0.e
            r1 = 25
            r0.<init>(r1)
        L15:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            p047Q1.AbstractC0458e.m1192j(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2e
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r1 = r5
            goto L7e
        L4f:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.Signature[] r0 = r0.mo1016i(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
        L5d:
            if (r3 >= r6) goto L6b
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r3 = r3 + 1
            goto L5d
        L6b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            H.e r1 = new H.e     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4d
        L7e:
            if (r1 != 0) goto L81
            goto L8b
        L81:
            androidx.emoji2.text.q r5 = new androidx.emoji2.text.q
            androidx.emoji2.text.p r0 = new androidx.emoji2.text.p
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p010D1.AbstractC0104l.m408o(android.content.Context):androidx.emoji2.text.q");
    }

    /* renamed from: p */
    public static int m409p(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress m410q(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p010D1.AbstractC0104l.m410q(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: r */
    public static C1285o m411r(String str) {
        AbstractC1136c.m2637e(str, "$this$toMediaType");
        Matcher matcher = C1285o.f5200c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        AbstractC1136c.m2636d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        AbstractC1136c.m2636d(locale, "Locale.US");
        AbstractC1136c.m2636d(group.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        AbstractC1136c.m2636d(group2, "typeSubtype.group(2)");
        AbstractC1136c.m2636d(group2.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = C1285o.f5201d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                AbstractC1136c.m2636d(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (AbstractC1199i.m2760F0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    AbstractC1136c.m2636d(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new C1285o(str, (String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: s */
    public static ColorStateList m412s(Context context, C0176h c0176h, int i2) {
        int resourceId;
        ColorStateList m355v;
        TypedArray typedArray = (TypedArray) c0176h.f516c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (m355v = AbstractC0096d.m355v(context, resourceId)) == null) ? c0176h.m541p(i2) : m355v;
    }

    /* renamed from: t */
    public static ColorStateList m413t(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList m355v;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (m355v = AbstractC0096d.m355v(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : m355v;
    }

    /* renamed from: v */
    public static float m414v(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0438e.m1132b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: w */
    public static Drawable m415w(Context context, int i2) {
        return C0958R0.m2425b().m2428c(context, i2);
    }

    /* renamed from: x */
    public static Drawable m416x(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable m415w;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (m415w = m415w(context, resourceId)) == null) ? typedArray.getDrawable(i2) : m415w;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: y */
    public static final Class m417y(InterfaceC1176a interfaceC1176a) {
        AbstractC1136c.m2637e(interfaceC1176a, "<this>");
        Class mo2632a = ((InterfaceC1134a) interfaceC1176a).mo2632a();
        if (mo2632a.isPrimitive()) {
            String name = mo2632a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return mo2632a;
    }

    /* renamed from: z */
    public static File m418z(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: A */
    public int mo419A(View view) {
        return 0;
    }

    /* renamed from: B */
    public int mo420B() {
        return 0;
    }

    /* renamed from: L */
    public abstract void mo424L(int i2);

    /* renamed from: M */
    public abstract void mo425M(View view, int i2, int i3);

    /* renamed from: N */
    public abstract void mo426N(View view, float f, float f2);

    /* renamed from: Q */
    public abstract void mo427Q(C1172f c1172f, C1172f c1172f2);

    /* renamed from: R */
    public abstract void mo428R(C1172f c1172f, Thread thread);

    /* renamed from: V */
    public abstract boolean mo429V(View view, int i2);

    /* renamed from: c */
    public abstract boolean mo430c(AbstractFutureC1173g abstractFutureC1173g, C1169c c1169c);

    /* renamed from: d */
    public abstract boolean mo431d(AbstractFutureC1173g abstractFutureC1173g, Object obj, Object obj2);

    /* renamed from: e */
    public abstract boolean mo432e(AbstractFutureC1173g abstractFutureC1173g, C1172f c1172f, C1172f c1172f2);

    /* renamed from: i */
    public abstract int mo433i(View view, int i2);

    /* renamed from: j */
    public abstract int mo434j(View view, int i2);

    /* renamed from: u */
    public abstract void mo435u(C0376u c0376u, float f, float f2);

    /* renamed from: I */
    public void mo422I() {
    }

    /* renamed from: H */
    public void mo421H(int i2, int i3) {
    }

    /* renamed from: K */
    public void mo423K(View view, int i2) {
    }
}
