package p086i;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p018H.C0190j;
import p076e.C0778b;
import p076e.DialogC0781e;

/* renamed from: i.h */
/* loaded from: classes.dex */
public final class C0903h implements InterfaceC0920y, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Context f3650a;

    /* renamed from: b */
    public LayoutInflater f3651b;

    /* renamed from: c */
    public MenuC0907l f3652c;

    /* renamed from: d */
    public ExpandedMenuView f3653d;

    /* renamed from: e */
    public InterfaceC0919x f3654e;

    /* renamed from: f */
    public C0902g f3655f;

    public C0903h(ContextWrapper contextWrapper) {
        this.f3650a = contextWrapper;
        this.f3651b = LayoutInflater.from(contextWrapper);
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: a */
    public final void mo482a(MenuC0907l menuC0907l, boolean z2) {
        InterfaceC0919x interfaceC0919x = this.f3654e;
        if (interfaceC0919x != null) {
            interfaceC0919x.mo165a(menuC0907l, z2);
        }
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: c */
    public final void mo483c() {
        C0902g c0902g = this.f3655f;
        if (c0902g != null) {
            c0902g.notifyDataSetChanged();
        }
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: d */
    public final int mo484d() {
        return 0;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: e */
    public final boolean mo485e(C0909n c0909n) {
        return false;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: g */
    public final boolean mo486g() {
        return false;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: h */
    public final void mo487h(Context context, MenuC0907l menuC0907l) {
        if (this.f3650a != null) {
            this.f3650a = context;
            if (this.f3651b == null) {
                this.f3651b = LayoutInflater.from(context);
            }
        }
        this.f3652c = menuC0907l;
        C0902g c0902g = this.f3655f;
        if (c0902g != null) {
            c0902g.notifyDataSetChanged();
        }
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: j */
    public final Parcelable mo488j() {
        if (this.f3653d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f3653d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: k */
    public final void mo2311k(InterfaceC0919x interfaceC0919x) {
        throw null;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: l */
    public final boolean mo489l(C0909n c0909n) {
        return false;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: m */
    public final void mo490m(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f3653d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: n */
    public final boolean mo491n(SubMenuC0895E subMenuC0895E) {
        if (!subMenuC0895E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0908m dialogInterfaceOnKeyListenerC0908m = new DialogInterfaceOnKeyListenerC0908m();
        dialogInterfaceOnKeyListenerC0908m.f3687a = subMenuC0895E;
        Context context = subMenuC0895E.f3663a;
        C0190j c0190j = new C0190j(context);
        C0778b c0778b = (C0778b) c0190j.f555b;
        C0903h c0903h = new C0903h(c0778b.f3044a);
        dialogInterfaceOnKeyListenerC0908m.f3689c = c0903h;
        c0903h.f3654e = dialogInterfaceOnKeyListenerC0908m;
        subMenuC0895E.m2338b(c0903h, context);
        C0903h c0903h2 = dialogInterfaceOnKeyListenerC0908m.f3689c;
        if (c0903h2.f3655f == null) {
            c0903h2.f3655f = new C0902g(c0903h2);
        }
        c0778b.f3050g = c0903h2.f3655f;
        c0778b.f3051h = dialogInterfaceOnKeyListenerC0908m;
        View view = subMenuC0895E.f3677o;
        if (view != null) {
            c0778b.f3048e = view;
        } else {
            c0778b.f3046c = subMenuC0895E.f3676n;
            c0778b.f3047d = subMenuC0895E.f3675m;
        }
        c0778b.f3049f = dialogInterfaceOnKeyListenerC0908m;
        DialogC0781e m575a = c0190j.m575a();
        dialogInterfaceOnKeyListenerC0908m.f3688b = m575a;
        m575a.setOnDismissListener(dialogInterfaceOnKeyListenerC0908m);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0908m.f3688b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0908m.f3688b.show();
        InterfaceC0919x interfaceC0919x = this.f3654e;
        if (interfaceC0919x == null) {
            return true;
        }
        interfaceC0919x.mo173i(subMenuC0895E);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f3652c.m2344q(this.f3655f.getItem(i2), this, 0);
    }
}
