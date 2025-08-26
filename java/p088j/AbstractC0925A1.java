package p088j;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;

/* renamed from: j.A1 */
/* loaded from: classes.dex */
public abstract class AbstractC0925A1 {

    /* renamed from: a */
    public static final Method f3755a;

    /* renamed from: b */
    public static final boolean f3756b;

    static {
        f3756b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f3755a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static boolean m2376a(View view) {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        return view.getLayoutDirection() == 1;
    }
}
