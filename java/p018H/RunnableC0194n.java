package p018H;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.C0625O;
import androidx.fragment.app.C0634h;
import java.util.ArrayList;
import p002B.C0019i;
import p005C.AbstractC0044g;
import p027K.C0285b0;
import p027K.C0293f0;

/* renamed from: H.n */
/* loaded from: classes.dex */
public final class RunnableC0194n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f562a = 0;

    /* renamed from: b */
    public Object f563b;

    /* renamed from: c */
    public Object f564c;

    /* renamed from: d */
    public Object f565d;

    public /* synthetic */ RunnableC0194n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f562a) {
            case 0:
                try {
                    obj = ((CallableC0186f) this.f563b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f565d).post(new RunnableC0181a((C0187g) this.f564c, 1, obj));
                break;
            case 1:
                C0285b0.m856h((View) this.f563b, (C0019i) this.f564c);
                ((ValueAnimator) this.f565d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f563b;
                C0625O c0625o = (C0625O) this.f564c;
                if (arrayList.contains(c0625o)) {
                    arrayList.remove(c0625o);
                    ((C0634h) this.f565d).getClass();
                    AbstractC0044g.m149a(c0625o.f2117c.f2207E, c0625o.f2115a);
                    break;
                }
                break;
        }
    }

    public RunnableC0194n(C0634h c0634h, ArrayList arrayList, C0625O c0625o) {
        this.f565d = c0634h;
        this.f563b = arrayList;
        this.f564c = c0625o;
    }

    public RunnableC0194n(View view, C0293f0 c0293f0, C0019i c0019i, ValueAnimator valueAnimator) {
        this.f563b = view;
        this.f564c = c0019i;
        this.f565d = valueAnimator;
    }
}
