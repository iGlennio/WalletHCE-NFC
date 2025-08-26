package p089j0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import p010D1.AbstractC0096d;

/* renamed from: j0.B */
/* loaded from: classes.dex */
public class C1054B extends AbstractC0096d {

    /* renamed from: n */
    public static boolean f4126n = true;

    /* renamed from: o */
    public static boolean f4127o = true;

    /* renamed from: p */
    public static boolean f4128p = true;

    /* renamed from: q */
    public static boolean f4129q = true;

    @Override // p010D1.AbstractC0096d
    /* renamed from: g0 */
    public void mo370g0(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo370g0(view, i2);
        } else if (f4129q) {
            try {
                AbstractC1053A.m2547a(view, i2);
            } catch (NoSuchMethodError unused) {
                f4129q = false;
            }
        }
    }

    /* renamed from: o0 */
    public void mo2548o0(View view, int i2, int i3, int i4, int i5) {
        if (f4128p) {
            try {
                AbstractC1084z.m2612a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f4128p = false;
            }
        }
    }

    /* renamed from: p0 */
    public void mo2549p0(View view, Matrix matrix) {
        if (f4126n) {
            try {
                AbstractC1083y.m2610b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f4126n = false;
            }
        }
    }

    /* renamed from: q0 */
    public void mo2550q0(View view, Matrix matrix) {
        if (f4127o) {
            try {
                AbstractC1083y.m2611c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f4127o = false;
            }
        }
    }
}
