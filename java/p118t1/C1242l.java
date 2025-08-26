package p118t1;

import android.util.Log;
import androidx.fragment.app.C0651y;
import java.util.Timer;
import p088j.C0985d0;

/* renamed from: t1.l */
/* loaded from: classes.dex */
public final class C1242l {

    /* renamed from: a */
    public final C0651y f4838a;

    /* renamed from: b */
    public Timer f4839b = new Timer();

    /* renamed from: c */
    public final AsyncTaskC1240j f4840c = new AsyncTaskC1240j(new C0985d0(3, this));

    /* renamed from: d */
    public int f4841d;

    public C1242l(C0651y c0651y) {
        this.f4838a = c0651y;
    }

    /* renamed from: a */
    public final void m2909a(String str) {
        Log.d("test", "ping url = " + str);
        Timer timer = this.f4839b;
        if (timer != null) {
            timer.cancel();
        }
        C1241k c1241k = new C1241k(this, str);
        Timer timer2 = new Timer();
        this.f4839b = timer2;
        timer2.schedule(c1241k, 0L, 2000L);
    }
}
