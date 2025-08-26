package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0636j implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0638l f2174a;

    public DialogInterfaceOnDismissListenerC0636j(DialogInterfaceOnCancelListenerC0638l dialogInterfaceOnCancelListenerC0638l) {
        this.f2174a = dialogInterfaceOnCancelListenerC0638l;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0638l dialogInterfaceOnCancelListenerC0638l = this.f2174a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0638l.f2186a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0638l.onDismiss(dialog);
        }
    }
}
