package p014F0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: F0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0137e {

    /* renamed from: a */
    public static final ThreadLocal f421a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f422b = new ThreadLocal();

    /* renamed from: a */
    public static void m473a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            m473a(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
