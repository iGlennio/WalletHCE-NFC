package p002B;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: B.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0025o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f57a;

    /* renamed from: b */
    public final /* synthetic */ int f58b;

    /* renamed from: c */
    public final /* synthetic */ Object f59c;

    public /* synthetic */ RunnableC0025o(Object obj, int i2, int i3) {
        this.f57a = i3;
        this.f59c = obj;
        this.f58b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57a) {
            case 0:
                ((AbstractC0012b) this.f59c).mo43g(this.f58b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f59c;
                View view = (View) sideSheetBehavior.f2777p.get();
                if (view != null) {
                    sideSheetBehavior.m1975y(view, this.f58b, false);
                    break;
                }
                break;
        }
    }
}
