package p088j;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p018H.C0190j;
import p076e.C0778b;
import p076e.DialogC0781e;

/* renamed from: j.M */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0948M implements InterfaceC0959S, DialogInterface.OnClickListener {

    /* renamed from: a */
    public DialogC0781e f3824a;

    /* renamed from: b */
    public C0950N f3825b;

    /* renamed from: c */
    public CharSequence f3826c;

    /* renamed from: d */
    public final /* synthetic */ C0961T f3827d;

    public DialogInterfaceOnClickListenerC0948M(C0961T c0961t) {
        this.f3827d = c0961t;
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: a */
    public final CharSequence mo2411a() {
        return this.f3826c;
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: b */
    public final boolean mo2412b() {
        DialogC0781e dialogC0781e = this.f3824a;
        if (dialogC0781e != null) {
            return dialogC0781e.isShowing();
        }
        return false;
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: c */
    public final void mo2413c(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: d */
    public final int mo2414d() {
        return 0;
    }

    @Override // p088j.InterfaceC0959S
    public final void dismiss() {
        DialogC0781e dialogC0781e = this.f3824a;
        if (dialogC0781e != null) {
            dialogC0781e.dismiss();
            this.f3824a = null;
        }
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: e */
    public final void mo2415e(int i2, int i3) {
        if (this.f3825b == null) {
            return;
        }
        C0961T c0961t = this.f3827d;
        C0190j c0190j = new C0190j(c0961t.getPopupContext());
        CharSequence charSequence = this.f3826c;
        C0778b c0778b = (C0778b) c0190j.f555b;
        if (charSequence != null) {
            c0778b.f3047d = charSequence;
        }
        C0950N c0950n = this.f3825b;
        int selectedItemPosition = c0961t.getSelectedItemPosition();
        c0778b.f3050g = c0950n;
        c0778b.f3051h = this;
        c0778b.f3053j = selectedItemPosition;
        c0778b.f3052i = true;
        DialogC0781e m575a = c0190j.m575a();
        this.f3824a = m575a;
        AlertController$RecycleListView alertController$RecycleListView = m575a.f3082f.f3058e;
        AbstractC0944K.m2407d(alertController$RecycleListView, i2);
        AbstractC0944K.m2406c(alertController$RecycleListView, i3);
        this.f3824a.show();
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: h */
    public final void mo2416h(CharSequence charSequence) {
        this.f3826c = charSequence;
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: j */
    public final int mo2417j() {
        return 0;
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: k */
    public final void mo2418k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: l */
    public final void mo2419l(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: n */
    public final Drawable mo2420n() {
        return null;
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: o */
    public final void mo2401o(ListAdapter listAdapter) {
        this.f3825b = (C0950N) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        C0961T c0961t = this.f3827d;
        c0961t.setSelection(i2);
        if (c0961t.getOnItemClickListener() != null) {
            c0961t.performItemClick(null, i2, this.f3825b.getItemId(i2));
        }
        dismiss();
    }

    @Override // p088j.InterfaceC0959S
    /* renamed from: p */
    public final void mo2421p(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
