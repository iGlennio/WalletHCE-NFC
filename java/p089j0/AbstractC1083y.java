package p089j0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: j0.y */
/* loaded from: classes.dex */
public abstract class AbstractC1083y {
    /* renamed from: a */
    public static void m2609a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: b */
    public static void m2610b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: c */
    public static void m2611c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
