package p086i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p076e.DialogC0781e;

/* renamed from: i.m */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC0908m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0919x {

    /* renamed from: a */
    public SubMenuC0895E f3687a;

    /* renamed from: b */
    public DialogC0781e f3688b;

    /* renamed from: c */
    public C0903h f3689c;

    @Override // p086i.InterfaceC0919x
    /* renamed from: a */
    public final void mo165a(MenuC0907l menuC0907l, boolean z2) {
        DialogC0781e dialogC0781e;
        if ((z2 || menuC0907l == this.f3687a) && (dialogC0781e = this.f3688b) != null) {
            dialogC0781e.dismiss();
        }
    }

    @Override // p086i.InterfaceC0919x
    /* renamed from: i */
    public final boolean mo173i(MenuC0907l menuC0907l) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        C0903h c0903h = this.f3689c;
        if (c0903h.f3655f == null) {
            c0903h.f3655f = new C0902g(c0903h);
        }
        this.f3687a.m2344q(c0903h.f3655f.getItem(i2), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f3689c.mo482a(this.f3687a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC0895E subMenuC0895E = this.f3687a;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f3688b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f3688b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC0895E.m2339c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC0895E.performShortcut(i2, keyEvent, 0);
    }
}
