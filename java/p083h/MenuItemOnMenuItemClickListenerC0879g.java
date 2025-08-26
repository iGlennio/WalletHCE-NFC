package p083h;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: h.g */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0879g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c */
    public static final Class[] f3520c = {MenuItem.class};

    /* renamed from: a */
    public Object f3521a;

    /* renamed from: b */
    public Method f3522b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f3522b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f3521a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
