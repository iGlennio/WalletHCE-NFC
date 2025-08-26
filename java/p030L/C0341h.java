package p030L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.h */
/* loaded from: classes.dex */
public final class C0341h {

    /* renamed from: a */
    public final AccessibilityNodeInfo.CollectionItemInfo f891a;

    public C0341h(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f891a = collectionItemInfo;
    }

    /* renamed from: a */
    public static C0341h m987a(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        return new C0341h(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3));
    }
}
