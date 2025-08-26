package p088j;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: j.w0 */
/* loaded from: classes.dex */
public abstract class AbstractC1042w0 {

    /* renamed from: a */
    public static final Field f4083a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        f4083a = field;
    }
}
