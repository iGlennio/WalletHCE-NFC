package androidx.fragment.app;

import android.view.View;
import p047Q1.AbstractC0458e;

/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public final class C0639m extends AbstractC0458e {

    /* renamed from: h */
    public final /* synthetic */ AbstractComponentCallbacksC0641o f2190h;

    public C0639m(AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o) {
        this.f2190h = abstractComponentCallbacksC0641o;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: K */
    public final View mo1211K(int i2) {
        AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o = this.f2190h;
        View view = abstractComponentCallbacksC0641o.f2207E;
        if (view != null) {
            return view.findViewById(i2);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0641o + " does not have a view");
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: N */
    public final boolean mo1212N() {
        return this.f2190h.f2207E != null;
    }
}
