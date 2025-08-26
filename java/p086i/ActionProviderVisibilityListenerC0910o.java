package p086i;

import android.view.ActionProvider;
import android.view.View;
import p005C.C0046i;

/* renamed from: i.o */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC0910o implements ActionProvider.VisibilityListener {

    /* renamed from: a */
    public final ActionProvider f3719a;

    /* renamed from: b */
    public final /* synthetic */ MenuItemC0914s f3720b;

    /* renamed from: c */
    public C0046i f3721c;

    public ActionProviderVisibilityListenerC0910o(MenuItemC0914s menuItemC0914s, ActionProvider actionProvider) {
        this.f3720b = menuItemC0914s;
        this.f3719a = actionProvider;
    }

    /* renamed from: a */
    public final View m2356a(C0909n c0909n) {
        return this.f3719a.onCreateActionView(c0909n);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0046i c0046i = this.f3721c;
        if (c0046i != null) {
            MenuC0907l menuC0907l = ((C0909n) c0046i.f116b).f3706n;
            menuC0907l.f3670h = true;
            menuC0907l.mo492p(true);
        }
    }
}
