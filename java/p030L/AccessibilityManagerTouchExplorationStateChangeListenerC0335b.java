package p030L;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p042P.C0400b;
import p043P0.C0417k;
import p047Q1.AbstractC0458e;

/* renamed from: L.b */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0335b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final C0400b f876a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0335b(C0400b c0400b) {
        this.f876a = c0400b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0335b) {
            return this.f876a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0335b) obj).f876a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f876a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        C0417k c0417k = (C0417k) this.f876a.f1060a;
        AutoCompleteTextView autoCompleteTextView = c0417k.f1095h;
        if (autoCompleteTextView == null || AbstractC0458e.m1172F(autoCompleteTextView)) {
            return;
        }
        int i2 = z2 ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        c0417k.f1139d.setImportantForAccessibility(i2);
    }
}
