package p027K;

import android.view.View;
import android.view.ViewParent;

/* renamed from: K.V */
/* loaded from: classes.dex */
public abstract class AbstractC0277V {
    /* renamed from: a */
    public static boolean m832a(ViewParent viewParent, View view, float f, float f2, boolean z2) {
        return viewParent.onNestedFling(view, f, f2, z2);
    }

    /* renamed from: b */
    public static boolean m833b(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    /* renamed from: c */
    public static void m834c(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
        viewParent.onNestedPreScroll(view, i2, i3, iArr);
    }

    /* renamed from: d */
    public static void m835d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
        viewParent.onNestedScroll(view, i2, i3, i4, i5);
    }

    /* renamed from: e */
    public static void m836e(ViewParent viewParent, View view, View view2, int i2) {
        viewParent.onNestedScrollAccepted(view, view2, i2);
    }

    /* renamed from: f */
    public static boolean m837f(ViewParent viewParent, View view, View view2, int i2) {
        return viewParent.onStartNestedScroll(view, view2, i2);
    }

    /* renamed from: g */
    public static void m838g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
