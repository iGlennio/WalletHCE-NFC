package p118t1;

import java.util.TimerTask;
import p088j.C0985d0;

/* renamed from: t1.k */
/* loaded from: classes.dex */
public final class C1241k extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ String f4836a;

    /* renamed from: b */
    public final /* synthetic */ C1242l f4837b;

    public C1241k(C1242l c1242l, String str) {
        this.f4837b = c1242l;
        this.f4836a = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        AsyncTaskC1240j asyncTaskC1240j = new AsyncTaskC1240j(new C0985d0(4, this));
        asyncTaskC1240j.f4835b = this.f4837b.f4841d;
        asyncTaskC1240j.execute(this.f4836a);
    }
}
