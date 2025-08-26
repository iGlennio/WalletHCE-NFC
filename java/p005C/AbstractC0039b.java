package p005C;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowInsets;

/* renamed from: C.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0039b {
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ ColorStateListDrawable m120d(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    /* renamed from: f */
    public static /* synthetic */ WindowInsets.Builder m122f() {
        return new WindowInsets.Builder();
    }

    /* renamed from: g */
    public static /* synthetic */ WindowInsets.Builder m123g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ boolean m133q(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
