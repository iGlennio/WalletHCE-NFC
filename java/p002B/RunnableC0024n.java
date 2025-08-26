package p002B;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import p074d0.AbstractC0744j;
import p074d0.RunnableC0741g;
import p076e.ExecutorC0769A;
import p118t1.C1234d;

/* renamed from: B.n */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0024n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f54a;

    /* renamed from: b */
    public final /* synthetic */ Object f55b;

    /* renamed from: c */
    public final /* synthetic */ Object f56c;

    public /* synthetic */ RunnableC0024n(Object obj, int i2, Object obj2) {
        this.f54a = i2;
        this.f55b = obj;
        this.f56c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54a) {
            case 0:
                ((AbstractC0012b) this.f55b).mo44h((Typeface) this.f56c);
                return;
            case 1:
                ((ProfileInstallerInitializer) this.f55b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0744j.m2037a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0741g((Context) this.f56c, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 2:
                Runnable runnable = (Runnable) this.f56c;
                ExecutorC0769A executorC0769A = (ExecutorC0769A) this.f55b;
                executorC0769A.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0769A.m2061a();
                }
            default:
                Toast.makeText(((C1234d) this.f55b).f4828b, (String) this.f56c, 0).show();
                return;
        }
    }
}
