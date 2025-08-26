package p030L;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import p005C.C0046i;

/* renamed from: L.j */
/* loaded from: classes.dex */
public class C0343j extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final C0046i f895a;

    public C0343j(C0046i c0046i) {
        this.f895a = c0046i;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        C0342i mo185u = this.f895a.mo185u(i2);
        if (mo185u == null) {
            return null;
        }
        return mo185u.f893a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f895a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        C0342i mo186v = this.f895a.mo186v(i2);
        if (mo186v == null) {
            return null;
        }
        return mo186v.f893a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.f895a.mo188x(i2, i3, bundle);
    }
}
