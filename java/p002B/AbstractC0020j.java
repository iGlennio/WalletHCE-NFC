package p002B;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: B.j */
/* loaded from: classes.dex */
public abstract class AbstractC0020j {
    /* renamed from: a */
    public static Drawable m84a(Resources resources, int i2, Resources.Theme theme) {
        return resources.getDrawable(i2, theme);
    }

    /* renamed from: b */
    public static Drawable m85b(Resources resources, int i2, int i3, Resources.Theme theme) {
        return resources.getDrawableForDensity(i2, i3, theme);
    }
}
