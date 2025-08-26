package p074d0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.fragment.app.C0651y;
import p104p.AbstractFutureC1173g;
import p104p.C1174h;

/* renamed from: d0.m */
/* loaded from: classes.dex */
public abstract class AbstractC0747m {

    /* renamed from: a */
    public static final C1174h f2974a = new C1174h();

    /* renamed from: b */
    public static final Object f2975b = new Object();

    /* renamed from: c */
    public static C0651y f2976c = null;

    /* renamed from: a */
    public static long m2041a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0745k.m2038a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C0651y m2042b() {
        C0651y c0651y = new C0651y(7);
        f2976c = c0651y;
        C1174h c1174h = f2974a;
        c1174h.getClass();
        if (AbstractFutureC1173g.f4462f.mo431d(c1174h, null, c0651y)) {
            AbstractFutureC1173g.m2693b(c1174h);
        }
        return f2976c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
    
        r4 = 1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2043c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p074d0.AbstractC0747m.m2043c(android.content.Context, boolean):void");
    }
}
