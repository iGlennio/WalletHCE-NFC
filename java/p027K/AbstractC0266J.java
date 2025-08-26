package p027K;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import p039O.AbstractC0391a;

/* renamed from: K.J */
/* loaded from: classes.dex */
public abstract class AbstractC0266J {
    /* renamed from: a */
    public static View.AccessibilityDelegate m796a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* renamed from: b */
    public static ContentCaptureSession m797b(View view) {
        return view.getContentCaptureSession();
    }

    /* renamed from: c */
    public static List<Rect> m798c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* renamed from: d */
    public static void m799d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
    }

    /* renamed from: e */
    public static void m800e(View view, AbstractC0391a abstractC0391a) {
        view.setContentCaptureSession(null);
    }

    /* renamed from: f */
    public static void m801f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
