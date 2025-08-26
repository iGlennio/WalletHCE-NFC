package p133z;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: z.d */
/* loaded from: classes.dex */
public abstract class AbstractC1327d {
    /* renamed from: a */
    public static int m3038a(AppOpsManager appOpsManager, String str, int i2, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i2, str2);
    }

    /* renamed from: b */
    public static String m3039b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static AppOpsManager m3040c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
