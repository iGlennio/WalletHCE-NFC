package p089j0;

import java.util.ArrayList;
import p101o.C1152b;

/* renamed from: j0.o */
/* loaded from: classes.dex */
public final class C1073o extends AbstractC1072n {

    /* renamed from: a */
    public final /* synthetic */ C1152b f4209a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC1074p f4210b;

    public C1073o(ViewTreeObserverOnPreDrawListenerC1074p viewTreeObserverOnPreDrawListenerC1074p, C1152b c1152b) {
        this.f4210b = viewTreeObserverOnPreDrawListenerC1074p;
        this.f4209a = c1152b;
    }

    @Override // p089j0.InterfaceC1069k
    /* renamed from: d */
    public final void mo2554d(AbstractC1071m abstractC1071m) {
        ((ArrayList) this.f4209a.getOrDefault(this.f4210b.f4212b, null)).remove(abstractC1071m);
        abstractC1071m.mo2573x(this);
    }
}
