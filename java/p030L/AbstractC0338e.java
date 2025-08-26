package p030L;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L.e */
/* loaded from: classes.dex */
public abstract class AbstractC0338e {
    /* renamed from: a */
    public static Object m962a(int i2, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f, f2, f3);
    }

    /* renamed from: b */
    public static CharSequence m963b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* renamed from: c */
    public static void m964c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
