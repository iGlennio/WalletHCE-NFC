package p088j;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p083h.InterfaceC0874b;
import p086i.C0909n;
import p086i.InterfaceC0920y;
import p086i.MenuC0907l;
import p086i.SubMenuC0895E;

/* renamed from: j.o1 */
/* loaded from: classes.dex */
public final class C1019o1 implements InterfaceC0920y {

    /* renamed from: a */
    public MenuC0907l f4015a;

    /* renamed from: b */
    public C0909n f4016b;

    /* renamed from: c */
    public final /* synthetic */ Toolbar f4017c;

    public C1019o1(Toolbar toolbar) {
        this.f4017c = toolbar;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: c */
    public final void mo483c() {
        if (this.f4016b != null) {
            MenuC0907l menuC0907l = this.f4015a;
            if (menuC0907l != null) {
                int size = menuC0907l.f3668f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f4015a.getItem(i2) == this.f4016b) {
                        return;
                    }
                }
            }
            mo485e(this.f4016b);
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
        Toolbar toolbar = this.f4017c;
        KeyEvent.Callback callback = toolbar.f1805i;
        if (callback instanceof InterfaceC0874b) {
            ((InterfaceC0874b) callback).mo1405d();
        }
        toolbar.removeView(toolbar.f1805i);
        toolbar.removeView(toolbar.f1804h);
        toolbar.f1805i = null;
        ArrayList arrayList = toolbar.f1784E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f4016b = null;
        toolbar.requestLayout();
        c0909n.f3692C = false;
        c0909n.f3706n.mo492p(false);
        toolbar.m1441u();
        return true;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: g */
    public final boolean mo486g() {
        return false;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: h */
    public final void mo487h(Context context, MenuC0907l menuC0907l) {
        C0909n c0909n;
        MenuC0907l menuC0907l2 = this.f4015a;
        if (menuC0907l2 != null && (c0909n = this.f4016b) != null) {
            menuC0907l2.mo2320d(c0909n);
        }
        this.f4015a = menuC0907l;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: j */
    public final Parcelable mo488j() {
        return null;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: l */
    public final boolean mo489l(C0909n c0909n) {
        Toolbar toolbar = this.f4017c;
        toolbar.m1427c();
        ViewParent parent = toolbar.f1804h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1804h);
            }
            toolbar.addView(toolbar.f1804h);
        }
        View actionView = c0909n.getActionView();
        toolbar.f1805i = actionView;
        this.f4016b = c0909n;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1805i);
            }
            C1022p1 m1421h = Toolbar.m1421h();
            m1421h.f4024a = (toolbar.f1810n & 112) | 8388611;
            m1421h.f4025b = 2;
            toolbar.f1805i.setLayoutParams(m1421h);
            toolbar.addView(toolbar.f1805i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1022p1) childAt.getLayoutParams()).f4025b != 2 && childAt != toolbar.f1797a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1784E.add(childAt);
            }
        }
        toolbar.requestLayout();
        c0909n.f3692C = true;
        c0909n.f3706n.mo492p(false);
        KeyEvent.Callback callback = toolbar.f1805i;
        if (callback instanceof InterfaceC0874b) {
            ((InterfaceC0874b) callback).mo1404a();
        }
        toolbar.m1441u();
        return true;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: n */
    public final boolean mo491n(SubMenuC0895E subMenuC0895E) {
        return false;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: m */
    public final void mo490m(Parcelable parcelable) {
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: a */
    public final void mo482a(MenuC0907l menuC0907l, boolean z2) {
    }
}
