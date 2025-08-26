package p060X;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p002B.C0019i;
import p034M0.C0360e;

/* renamed from: X.e */
/* loaded from: classes.dex */
public final class C0537e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f1486a;

    /* renamed from: b */
    public final C0360e f1487b;

    public C0537e(KeyListener keyListener) {
        C0360e c0360e = new C0360e(23);
        this.f1486a = keyListener;
        this.f1487b = c0360e;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f1486a.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1486a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean z2;
        this.f1487b.getClass();
        if (i2 != 67 ? i2 != 112 ? false : C0019i.m48e(editable, keyEvent, true) : C0019i.m48e(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f1486a.onKeyDown(view, editable, i2, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1486a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f1486a.onKeyUp(view, editable, i2, keyEvent);
    }
}
