package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p018H.RunnableC0182b;
import p047Q1.AbstractC0458e;
import p101o.C1153c;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: classes.dex */
public final class C0596j {

    /* renamed from: i */
    public static final Object f1973i = new Object();

    /* renamed from: j */
    public static volatile C0596j f1974j;

    /* renamed from: a */
    public final ReentrantReadWriteLock f1975a;

    /* renamed from: b */
    public final C1153c f1976b;

    /* renamed from: c */
    public volatile int f1977c;

    /* renamed from: d */
    public final Handler f1978d;

    /* renamed from: e */
    public final C0592f f1979e;

    /* renamed from: f */
    public final InterfaceC0595i f1980f;

    /* renamed from: g */
    public final int f1981g;

    /* renamed from: h */
    public final C0590d f1982h;

    public C0596j(C0603q c0603q) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1975a = reentrantReadWriteLock;
        this.f1977c = 3;
        InterfaceC0595i interfaceC0595i = (InterfaceC0595i) c0603q.f1971b;
        this.f1980f = interfaceC0595i;
        int i2 = c0603q.f1970a;
        this.f1981g = i2;
        this.f1982h = (C0590d) c0603q.f1972c;
        this.f1978d = new Handler(Looper.getMainLooper());
        this.f1976b = new C1153c();
        C0592f c0592f = new C0592f(this);
        this.f1979e = c0592f;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f1977c = 0;
            } catch (Throwable th) {
                this.f1975a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m1526b() == 0) {
            try {
                interfaceC0595i.mo183s(new C0591e(c0592f));
            } catch (Throwable th2) {
                m1528d(th2);
            }
        }
    }

    /* renamed from: a */
    public static C0596j m1525a() {
        C0596j c0596j;
        synchronized (f1973i) {
            try {
                c0596j = f1974j;
                if (!(c0596j != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0596j;
    }

    /* renamed from: b */
    public final int m1526b() {
        this.f1975a.readLock().lock();
        try {
            return this.f1977c;
        } finally {
            this.f1975a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void m1527c() {
        if (!(this.f1981g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m1526b() == 1) {
            return;
        }
        this.f1975a.writeLock().lock();
        try {
            if (this.f1977c == 0) {
                return;
            }
            this.f1977c = 0;
            this.f1975a.writeLock().unlock();
            C0592f c0592f = this.f1979e;
            C0596j c0596j = c0592f.f1967a;
            try {
                c0596j.f1980f.mo183s(new C0591e(c0592f));
            } catch (Throwable th) {
                c0596j.m1528d(th);
            }
        } finally {
            this.f1975a.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public final void m1528d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1975a.writeLock().lock();
        try {
            this.f1977c = 2;
            arrayList.addAll(this.f1976b);
            this.f1976b.clear();
            this.f1975a.writeLock().unlock();
            this.f1978d.post(new RunnableC0182b(arrayList, this.f1977c, th));
        } catch (Throwable th2) {
            this.f1975a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0169, code lost:
    
        if (r4 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x016b, code lost:
    
        ((androidx.emoji2.text.C0607u) r12).m1550b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0171, code lost:
    
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x015f A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:116:0x005a, B:119:0x005f, B:121:0x0063, B:123:0x0070, B:29:0x0083, B:31:0x008d, B:33:0x0090, B:35:0x0094, B:37:0x00a4, B:39:0x00a7, B:43:0x00b4, B:46:0x00bc, B:51:0x00db, B:75:0x00e7, B:79:0x00f3, B:80:0x00fd, B:63:0x010c, B:66:0x0113, B:54:0x0118, B:56:0x0123, B:85:0x012a, B:87:0x012e, B:89:0x0134, B:91:0x0138, B:94:0x0140, B:97:0x014c, B:98:0x0151, B:100:0x015f, B:27:0x0079), top: B:115:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:116:0x005a, B:119:0x005f, B:121:0x0063, B:123:0x0070, B:29:0x0083, B:31:0x008d, B:33:0x0090, B:35:0x0094, B:37:0x00a4, B:39:0x00a7, B:43:0x00b4, B:46:0x00bc, B:51:0x00db, B:75:0x00e7, B:79:0x00f3, B:80:0x00fd, B:63:0x010c, B:66:0x0113, B:54:0x0118, B:56:0x0123, B:85:0x012a, B:87:0x012e, B:89:0x0134, B:91:0x0138, B:94:0x0140, B:97:0x014c, B:98:0x0151, B:100:0x015f, B:27:0x0079), top: B:115:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:116:0x005a, B:119:0x005f, B:121:0x0063, B:123:0x0070, B:29:0x0083, B:31:0x008d, B:33:0x0090, B:35:0x0094, B:37:0x00a4, B:39:0x00a7, B:43:0x00b4, B:46:0x00bc, B:51:0x00db, B:75:0x00e7, B:79:0x00f3, B:80:0x00fd, B:63:0x010c, B:66:0x0113, B:54:0x0118, B:56:0x0123, B:85:0x012a, B:87:0x012e, B:89:0x0134, B:91:0x0138, B:94:0x0140, B:97:0x014c, B:98:0x0151, B:100:0x015f, B:27:0x0079), top: B:115:0x005a }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence m1529e(java.lang.CharSequence r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0596j.m1529e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    /* renamed from: f */
    public final void m1530f(AbstractC0594h abstractC0594h) {
        AbstractC0458e.m1192j(abstractC0594h, "initCallback cannot be null");
        this.f1975a.writeLock().lock();
        try {
            if (this.f1977c != 1 && this.f1977c != 2) {
                this.f1976b.add(abstractC0594h);
                this.f1975a.writeLock().unlock();
            }
            this.f1978d.post(new RunnableC0182b(Arrays.asList(abstractC0594h), this.f1977c, (Throwable) null));
            this.f1975a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1975a.writeLock().unlock();
            throw th;
        }
    }
}
