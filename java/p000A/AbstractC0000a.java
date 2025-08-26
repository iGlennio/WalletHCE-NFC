package p000A;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: A.a */
/* loaded from: classes.dex */
public abstract class AbstractC0000a {
    /* renamed from: a */
    public static File m0a(Context context) {
        return context.getCodeCacheDir();
    }

    /* renamed from: b */
    public static Drawable m1b(Context context, int i2) {
        return context.getDrawable(i2);
    }

    /* renamed from: c */
    public static File m2c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
