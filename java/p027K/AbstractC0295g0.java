package p027K;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: K.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC0295g0 {

    /* renamed from: a */
    public static final Field f808a;

    /* renamed from: b */
    public static final Field f809b;

    /* renamed from: c */
    public static final Field f810c;

    /* renamed from: d */
    public static final boolean f811d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f808a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f809b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f810c = declaredField3;
            declaredField3.setAccessible(true);
            f811d = true;
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
        }
    }
}
