package p133z;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0655C;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.FragmentC0657E;
import androidx.lifecycle.InterfaceC0683r;
import p027K.InterfaceC0302k;
import p047Q1.AbstractC0458e;
import p095l1.AbstractC1136c;

/* renamed from: z.e */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1328e extends Activity implements InterfaceC0683r, InterfaceC0302k {

    /* renamed from: a */
    public final C0685t f5436a = new C0685t(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC1136c.m2637e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1136c.m2636d(decorView, "window.decorView");
        if (AbstractC0458e.m1201s(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0458e.m1202t(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC1136c.m2637e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1136c.m2636d(decorView, "window.decorView");
        if (AbstractC0458e.m1201s(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // p027K.InterfaceC0302k
    /* renamed from: e */
    public final boolean mo880e(KeyEvent keyEvent) {
        AbstractC1136c.m2637e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = FragmentC0657E.f2284b;
        AbstractC0655C.m1689b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1136c.m2637e(bundle, "outState");
        this.f5436a.m1705g();
        super.onSaveInstanceState(bundle);
    }
}
