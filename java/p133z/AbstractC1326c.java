package p133z;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: z.c */
/* loaded from: classes.dex */
public abstract class AbstractC1326c {
    /* renamed from: a */
    public static <T> T m3034a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* renamed from: b */
    public static int m3035b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: c */
    public static int m3036c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: d */
    public static String m3037d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
