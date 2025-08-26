package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0635i implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0638l f2173a;

    public DialogInterfaceOnCancelListenerC0635i(DialogInterfaceOnCancelListenerC0638l dialogInterfaceOnCancelListenerC0638l) {
        this.f2173a = dialogInterfaceOnCancelListenerC0638l;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0638l dialogInterfaceOnCancelListenerC0638l = this.f2173a;
        Dialog dialog = dialogInterfaceOnCancelListenerC0638l.f2186a0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0638l.onCancel(dialog);
        }
    }
}
