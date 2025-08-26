package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0677l;
import androidx.lifecycle.InterfaceC0681p;
import androidx.lifecycle.InterfaceC0683r;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0681p {

    /* renamed from: a */
    public static int f1556a;

    @Override // androidx.lifecycle.InterfaceC0681p
    /* renamed from: b */
    public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
        if (enumC0677l != EnumC0677l.ON_DESTROY) {
            return;
        }
        if (f1556a == 0) {
            try {
                f1556a = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f1556a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1556a == 1) {
            throw null;
        }
    }
}
