package p088j;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: j.t0 */
/* loaded from: classes.dex */
public abstract class AbstractC1033t0 {

    /* renamed from: a */
    public static final Method f4050a;

    /* renamed from: b */
    public static final Method f4051b;

    /* renamed from: c */
    public static final Method f4052c;

    /* renamed from: d */
    public static final boolean f4053d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f4050a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f4051b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f4052c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f4053d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
