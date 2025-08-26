package p088j;

import androidx.appcompat.widget.SearchView;
import p048R.AbstractC0461c;

/* renamed from: j.W0 */
/* loaded from: classes.dex */
public final class RunnableC0968W0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3878a;

    /* renamed from: b */
    public final /* synthetic */ SearchView f3879b;

    public /* synthetic */ RunnableC0968W0(SearchView searchView, int i2) {
        this.f3878a = i2;
        this.f3879b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3878a) {
            case 0:
                this.f3879b.m1415u();
                break;
            default:
                AbstractC0461c abstractC0461c = this.f3879b.f1750O;
                if (abstractC0461c instanceof ViewOnClickListenerC0995g1) {
                    abstractC0461c.mo1217b(null);
                    break;
                }
                break;
        }
    }
}
