package p027K;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: K.i */
/* loaded from: classes.dex */
public abstract class AbstractC0298i {
    /* renamed from: a */
    public static DisplayCutout m870a(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }

    /* renamed from: b */
    public static List<Rect> m871b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* renamed from: c */
    public static int m872c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: d */
    public static int m873d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: e */
    public static int m874e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: f */
    public static int m875f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
