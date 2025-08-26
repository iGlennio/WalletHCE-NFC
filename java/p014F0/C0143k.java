package p014F0;

import android.view.View;
import p027K.C0284b;
import p030L.C0341h;
import p030L.C0342i;

/* renamed from: F0.k */
/* loaded from: classes.dex */
public final class C0143k extends C0284b {

    /* renamed from: d */
    public final /* synthetic */ int f431d;

    /* renamed from: e */
    public final /* synthetic */ boolean f432e;

    /* renamed from: f */
    public final /* synthetic */ C0144l f433f;

    public C0143k(C0144l c0144l, int i2, boolean z2) {
        this.f433f = c0144l;
        this.f431d = i2;
        this.f432e = z2;
    }

    @Override // p027K.C0284b
    /* renamed from: d */
    public final void mo459d(View view, C0342i c0342i) {
        this.f785a.onInitializeAccessibilityNodeInfo(view, c0342i.f893a);
        int i2 = this.f431d;
        int i3 = 0;
        int i4 = i2;
        while (true) {
            C0144l c0144l = this.f433f;
            if (i3 >= i2) {
                c0144l.getClass();
                c0342i.m997j(C0341h.m987a(i4, 1, 1, 1, this.f432e, view.isSelected()));
                return;
            } else {
                C0152t c0152t = c0144l.f437f;
                if (c0152t.f450e.mo476c(i3) == 2 || c0152t.f450e.mo476c(i3) == 3) {
                    i4--;
                }
                i3++;
            }
        }
    }
}
