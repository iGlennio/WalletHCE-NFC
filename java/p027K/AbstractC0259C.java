package p027K;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: K.C */
/* loaded from: classes.dex */
public abstract class AbstractC0259C {
    /* renamed from: a */
    public static WindowInsets m737a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static WindowInsets m738b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    public static void m739c(View view) {
        view.requestApplyInsets();
    }
}
