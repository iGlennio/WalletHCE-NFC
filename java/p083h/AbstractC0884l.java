package p083h;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: h.l */
/* loaded from: classes.dex */
public abstract class AbstractC0884l {
    /* renamed from: a */
    public static boolean m2301a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* renamed from: b */
    public static ActionMode m2302b(Window.Callback callback, ActionMode.Callback callback2, int i2) {
        return callback.onWindowStartingActionMode(callback2, i2);
    }
}
