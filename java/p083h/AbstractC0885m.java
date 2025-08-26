package p083h;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: h.m */
/* loaded from: classes.dex */
public abstract class AbstractC0885m {
    /* renamed from: a */
    public static void m2303a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        callback.onProvideKeyboardShortcuts(list, menu, i2);
    }
}
