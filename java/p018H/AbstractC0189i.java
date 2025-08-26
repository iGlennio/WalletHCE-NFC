package p018H;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p101o.C1156f;
import p101o.C1161k;

/* renamed from: H.i */
/* loaded from: classes.dex */
public abstract class AbstractC0189i {

    /* renamed from: a */
    public static final C1156f f550a = new C1156f(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f551b;

    /* renamed from: c */
    public static final Object f552c;

    /* renamed from: d */
    public static final C1161k f553d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0193m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f551b = threadPoolExecutor;
        f552c = new Object();
        f553d = new C1161k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p018H.C0188h m574a(java.lang.String r6, android.content.Context r7, p018H.C0185e r8, int r9) {
        /*
            o.f r0 = p018H.AbstractC0189i.f550a
            java.lang.Object r1 = r0.m2674a(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            H.h r6 = new H.h
            r6.<init>(r1)
            return r6
        L10:
            H.j r8 = p018H.AbstractC0184d.m557a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f555b
            H.k[] r3 = (p018H.C0191k[]) r3
            int r8 = r8.f554a
            if (r8 == 0) goto L24
            if (r8 == r1) goto L22
        L20:
            r1 = r2
            goto L3d
        L22:
            r1 = -2
            goto L3d
        L24:
            if (r3 == 0) goto L3d
            int r8 = r3.length
            if (r8 != 0) goto L2a
            goto L3d
        L2a:
            int r8 = r3.length
            r1 = 0
            r4 = r1
        L2d:
            if (r4 >= r8) goto L3d
            r5 = r3[r4]
            int r5 = r5.f560e
            if (r5 == 0) goto L3a
            if (r5 >= 0) goto L38
            goto L20
        L38:
            r1 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L2d
        L3d:
            if (r1 == 0) goto L45
            H.h r6 = new H.h
            r6.<init>(r1)
            return r6
        L45:
            D1.d r8 = p005C.AbstractC0047j.f117a
            android.graphics.Typeface r7 = r8.mo194o(r7, r3, r9)
            if (r7 == 0) goto L56
            r0.m2675b(r6, r7)
            H.h r6 = new H.h
            r6.<init>(r7)
            return r6
        L56:
            H.h r6 = new H.h
            r6.<init>(r2)
            return r6
        L5c:
            H.h r6 = new H.h
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p018H.AbstractC0189i.m574a(java.lang.String, android.content.Context, H.e, int):H.h");
    }
}
