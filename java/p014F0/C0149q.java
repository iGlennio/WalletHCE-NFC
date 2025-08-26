package p014F0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.NavigationMenuView;
import p030L.C0342i;
import p079f0.C0828Y;

/* renamed from: F0.q */
/* loaded from: classes.dex */
public final class C0149q extends C0828Y {

    /* renamed from: f */
    public final /* synthetic */ C0152t f442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149q(C0152t c0152t, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.f442f = c0152t;
    }

    @Override // p079f0.C0828Y, p027K.C0284b
    /* renamed from: d */
    public final void mo459d(View view, C0342i c0342i) {
        super.mo459d(view, c0342i);
        C0144l c0144l = this.f442f.f450e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C0152t c0152t = c0144l.f437f;
            if (i2 >= c0152t.f450e.f434c.size()) {
                c0342i.f893a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i3, 1, false));
                return;
            } else {
                int mo476c = c0152t.f450e.mo476c(i2);
                if (mo476c == 0 || mo476c == 1) {
                    i3++;
                }
                i2++;
            }
        }
    }
}
