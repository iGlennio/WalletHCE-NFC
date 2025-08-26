package p074d0;

import android.content.Context;

/* renamed from: d0.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0741g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2967a;

    /* renamed from: b */
    public final /* synthetic */ Context f2968b;

    public /* synthetic */ RunnableC0741g(Context context, int i2) {
        this.f2967a = i2;
        this.f2968b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f2967a
            switch(r0) {
                case 0: goto L9b;
                case 1: goto L8d;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 1
            if (r0 < r1) goto L8a
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r11.f2968b
            java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r0.<init>(r1, r3)
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            int r3 = r3.getComponentEnabledSetting(r0)
            if (r3 == r2) goto L8a
            boolean r3 = p016G.AbstractC0161b.m495a()
            java.lang.String r4 = "locale"
            if (r3 == 0) goto L61
            o.c r3 = p076e.AbstractC0786j.f3095g
            java.util.Iterator r3 = r3.iterator()
        L2d:
            r5 = r3
            o.g r5 = (p101o.C1157g) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4f
            java.lang.Object r5 = r5.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r5 = r5.get()
            e.j r5 = (p076e.AbstractC0786j) r5
            if (r5 == 0) goto L2d
            e.u r5 = (p076e.LayoutInflaterFactory2C0797u) r5
            android.content.Context r5 = r5.f3169k
            if (r5 == 0) goto L2d
            java.lang.Object r3 = r5.getSystemService(r4)
            goto L50
        L4f:
            r3 = 0
        L50:
            if (r3 == 0) goto L66
            android.os.LocaleList r3 = p076e.AbstractC0785i.m2104a(r3)
            G.g r5 = new G.g
            G.h r6 = new G.h
            r6.<init>(r3)
            r5.<init>(r6)
            goto L68
        L61:
            G.g r5 = p076e.AbstractC0786j.f3091c
            if (r5 == 0) goto L66
            goto L68
        L66:
            G.g r5 = p016G.C0166g.f497b
        L68:
            G.h r3 = r5.f498a
            android.os.LocaleList r3 = r3.f499a
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L83
            java.lang.String r3 = p047Q1.AbstractC0458e.m1177Q(r1)
            java.lang.Object r4 = r1.getSystemService(r4)
            if (r4 == 0) goto L83
            android.os.LocaleList r3 = p076e.AbstractC0784h.m2103a(r3)
            p076e.AbstractC0785i.m2105b(r4, r3)
        L83:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r1.setComponentEnabledSetting(r0, r2, r2)
        L8a:
            p076e.AbstractC0786j.f3094f = r2
            return
        L8d:
            d0.d r0 = new d0.d
            r0.<init>()
            androidx.fragment.app.y r1 = p074d0.AbstractC0740f.f2957a
            r2 = 0
            android.content.Context r3 = r11.f2968b
            p074d0.AbstractC0740f.m2033s(r3, r0, r1, r2)
            return
        L9b:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r6 = 1
            r7 = 0
            r5 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            d0.g r0 = new d0.g
            android.content.Context r1 = r11.f2968b
            r2 = 1
            r0.<init>(r1, r2)
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074d0.RunnableC0741g.run():void");
    }
}
