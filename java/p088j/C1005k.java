package p088j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.nfupay.s145.R;
import java.util.ArrayList;
import p005C.C0046i;
import p086i.AbstractC0915t;
import p086i.ActionProviderVisibilityListenerC0910o;
import p086i.C0909n;
import p086i.InterfaceC0891A;
import p086i.InterfaceC0919x;
import p086i.InterfaceC0920y;
import p086i.InterfaceC0921z;
import p086i.MenuC0907l;
import p086i.SubMenuC0895E;

/* renamed from: j.k */
/* loaded from: classes.dex */
public final class C1005k implements InterfaceC0920y {

    /* renamed from: a */
    public final Context f3961a;

    /* renamed from: b */
    public Context f3962b;

    /* renamed from: c */
    public MenuC0907l f3963c;

    /* renamed from: d */
    public final LayoutInflater f3964d;

    /* renamed from: e */
    public InterfaceC0919x f3965e;

    /* renamed from: h */
    public InterfaceC0891A f3968h;

    /* renamed from: i */
    public int f3969i;

    /* renamed from: j */
    public C0999i f3970j;

    /* renamed from: k */
    public Drawable f3971k;

    /* renamed from: l */
    public boolean f3972l;

    /* renamed from: m */
    public boolean f3973m;

    /* renamed from: n */
    public boolean f3974n;

    /* renamed from: o */
    public int f3975o;

    /* renamed from: p */
    public int f3976p;

    /* renamed from: q */
    public int f3977q;

    /* renamed from: r */
    public boolean f3978r;

    /* renamed from: t */
    public C0990f f3980t;

    /* renamed from: u */
    public C0990f f3981u;

    /* renamed from: v */
    public RunnableC0996h f3982v;

    /* renamed from: w */
    public C0993g f3983w;

    /* renamed from: y */
    public int f3985y;

    /* renamed from: f */
    public final int f3966f = R.layout.abc_action_menu_layout;

    /* renamed from: g */
    public final int f3967g = R.layout.abc_action_menu_item_layout;

    /* renamed from: s */
    public final SparseBooleanArray f3979s = new SparseBooleanArray();

    /* renamed from: x */
    public final C0046i f3984x = new C0046i(28, this);

    public C1005k(Context context) {
        this.f3961a = context;
        this.f3964d = LayoutInflater.from(context);
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: a */
    public final void mo482a(MenuC0907l menuC0907l, boolean z2) {
        m2487f();
        C0990f c0990f = this.f3981u;
        if (c0990f != null && c0990f.m2361b()) {
            c0990f.f3739i.dismiss();
        }
        InterfaceC0919x interfaceC0919x = this.f3965e;
        if (interfaceC0919x != null) {
            interfaceC0919x.mo165a(menuC0907l, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [i.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: b */
    public final View m2486b(C0909n c0909n, View view, ViewGroup viewGroup) {
        View actionView = c0909n.getActionView();
        if (actionView == null || c0909n.m2353e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0921z ? (InterfaceC0921z) view : (InterfaceC0921z) this.f3964d.inflate(this.f3967g, viewGroup, false);
            actionMenuItemView.mo1377e(c0909n);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f3968h);
            if (this.f3983w == null) {
                this.f3983w = new C0993g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3983w);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0909n.f3692C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1011m)) {
            actionView.setLayoutParams(ActionMenuView.m1398m(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p086i.InterfaceC0920y
    /* renamed from: c */
    public final void mo483c() {
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f3968h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuC0907l menuC0907l = this.f3963c;
            if (menuC0907l != null) {
                menuC0907l.m2342i();
                ArrayList m2343l = this.f3963c.m2343l();
                int size = m2343l.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0909n c0909n = (C0909n) m2343l.get(i3);
                    if ((c0909n.f3716x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0909n itemData = childAt instanceof InterfaceC0921z ? ((InterfaceC0921z) childAt).getItemData() : null;
                        View m2486b = m2486b(c0909n, childAt, viewGroup);
                        if (c0909n != itemData) {
                            m2486b.setPressed(false);
                            m2486b.jumpDrawablesToCurrentState();
                        }
                        if (m2486b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) m2486b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(m2486b);
                            }
                            ((ViewGroup) this.f3968h).addView(m2486b, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f3970j) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f3968h).requestLayout();
        MenuC0907l menuC0907l2 = this.f3963c;
        if (menuC0907l2 != null) {
            menuC0907l2.m2342i();
            ArrayList arrayList2 = menuC0907l2.f3671i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o = ((C0909n) arrayList2.get(i4)).f3690A;
            }
        }
        MenuC0907l menuC0907l3 = this.f3963c;
        if (menuC0907l3 != null) {
            menuC0907l3.m2342i();
            arrayList = menuC0907l3.f3672j;
        }
        if (this.f3973m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0909n) arrayList.get(0)).f3692C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f3970j == null) {
                this.f3970j = new C0999i(this, this.f3961a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f3970j.getParent();
            if (viewGroup3 != this.f3968h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f3970j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f3968h;
                C0999i c0999i = this.f3970j;
                actionMenuView.getClass();
                C1011m m1397l = ActionMenuView.m1397l();
                m1397l.f3988a = true;
                actionMenuView.addView(c0999i, m1397l);
            }
        } else {
            C0999i c0999i2 = this.f3970j;
            if (c0999i2 != null) {
                Object parent = c0999i2.getParent();
                Object obj = this.f3968h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f3970j);
                }
            }
        }
        ((ActionMenuView) this.f3968h).setOverflowReserved(this.f3973m);
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: d */
    public final int mo484d() {
        return this.f3969i;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: e */
    public final boolean mo485e(C0909n c0909n) {
        return false;
    }

    /* renamed from: f */
    public final boolean m2487f() {
        Object obj;
        RunnableC0996h runnableC0996h = this.f3982v;
        if (runnableC0996h != null && (obj = this.f3968h) != null) {
            ((View) obj).removeCallbacks(runnableC0996h);
            this.f3982v = null;
            return true;
        }
        C0990f c0990f = this.f3980t;
        if (c0990f == null) {
            return false;
        }
        if (c0990f.m2361b()) {
            c0990f.f3739i.dismiss();
        }
        return true;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: g */
    public final boolean mo486g() {
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        C1005k c1005k = this;
        MenuC0907l menuC0907l = c1005k.f3963c;
        if (menuC0907l != null) {
            arrayList = menuC0907l.m2343l();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i4 = c1005k.f3977q;
        int i5 = c1005k.f3976p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1005k.f3968h;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            C0909n c0909n = (C0909n) arrayList.get(i6);
            int i9 = c0909n.f3717y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z3 = true;
            }
            if (c1005k.f3978r && c0909n.f3692C) {
                i4 = 0;
            }
            i6++;
        }
        if (c1005k.f3973m && (z3 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = c1005k.f3979s;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            C0909n c0909n2 = (C0909n) arrayList.get(i11);
            int i13 = c0909n2.f3717y;
            boolean z4 = (i13 & 2) == i3 ? z2 : false;
            int i14 = c0909n2.f3694b;
            if (z4) {
                View m2486b = c1005k.m2486b(c0909n2, null, viewGroup);
                m2486b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = m2486b.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                c0909n2.m2355g(z2);
            } else if ((i13 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i14);
                boolean z6 = ((i10 > 0 || z5) && i5 > 0) ? z2 : false;
                if (z6) {
                    View m2486b2 = c1005k.m2486b(c0909n2, null, viewGroup);
                    m2486b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = m2486b2.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z6 &= i5 + i12 > 0;
                }
                if (z6 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z5) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i11; i15++) {
                        C0909n c0909n3 = (C0909n) arrayList.get(i15);
                        if (c0909n3.f3694b == i14) {
                            if ((c0909n3.f3716x & 32) == 32) {
                                i10++;
                            }
                            c0909n3.m2355g(false);
                        }
                    }
                }
                if (z6) {
                    i10--;
                }
                c0909n2.m2355g(z6);
            } else {
                c0909n2.m2355g(false);
                i11++;
                i3 = 2;
                c1005k = this;
                z2 = true;
            }
            i11++;
            i3 = 2;
            c1005k = this;
            z2 = true;
        }
        return z2;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: h */
    public final void mo487h(Context context, MenuC0907l menuC0907l) {
        this.f3962b = context;
        LayoutInflater.from(context);
        this.f3963c = menuC0907l;
        Resources resources = context.getResources();
        if (!this.f3974n) {
            this.f3973m = true;
        }
        int i2 = 2;
        this.f3975o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f3977q = i2;
        int i5 = this.f3975o;
        if (this.f3973m) {
            if (this.f3970j == null) {
                C0999i c0999i = new C0999i(this, this.f3961a);
                this.f3970j = c0999i;
                if (this.f3972l) {
                    c0999i.setImageDrawable(this.f3971k);
                    this.f3971k = null;
                    this.f3972l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3970j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f3970j.getMeasuredWidth();
        } else {
            this.f3970j = null;
        }
        this.f3976p = i5;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: i */
    public final boolean m2488i() {
        C0990f c0990f = this.f3980t;
        return c0990f != null && c0990f.m2361b();
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: j */
    public final Parcelable mo488j() {
        C1002j c1002j = new C1002j();
        c1002j.f3956a = this.f3985y;
        return c1002j;
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
        int i2;
        MenuItem findItem;
        if ((parcelable instanceof C1002j) && (i2 = ((C1002j) parcelable).f3956a) > 0 && (findItem = this.f3963c.findItem(i2)) != null) {
            mo491n((SubMenuC0895E) findItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p086i.InterfaceC0920y
    /* renamed from: n */
    public final boolean mo491n(SubMenuC0895E subMenuC0895E) {
        boolean z2;
        if (subMenuC0895E.hasVisibleItems()) {
            SubMenuC0895E subMenuC0895E2 = subMenuC0895E;
            while (true) {
                MenuC0907l menuC0907l = subMenuC0895E2.f3597z;
                if (menuC0907l == this.f3963c) {
                    break;
                }
                subMenuC0895E2 = (SubMenuC0895E) menuC0907l;
            }
            ViewGroup viewGroup = (ViewGroup) this.f3968h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof InterfaceC0921z) && ((InterfaceC0921z) childAt).getItemData() == subMenuC0895E2.f3596A) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                this.f3985y = subMenuC0895E.f3596A.f3693a;
                int size = subMenuC0895E.f3668f.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = subMenuC0895E.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                C0990f c0990f = new C0990f(this, this.f3962b, subMenuC0895E, view);
                this.f3981u = c0990f;
                c0990f.f3737g = z2;
                AbstractC0915t abstractC0915t = c0990f.f3739i;
                if (abstractC0915t != null) {
                    abstractC0915t.mo2314r(z2);
                }
                C0990f c0990f2 = this.f3981u;
                if (!c0990f2.m2361b()) {
                    if (c0990f2.f3735e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0990f2.m2363d(0, 0, false, false);
                }
                InterfaceC0919x interfaceC0919x = this.f3965e;
                if (interfaceC0919x != null) {
                    interfaceC0919x.mo173i(subMenuC0895E);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m2489o() {
        MenuC0907l menuC0907l;
        if (!this.f3973m || m2488i() || (menuC0907l = this.f3963c) == null || this.f3968h == null || this.f3982v != null) {
            return false;
        }
        menuC0907l.m2342i();
        if (menuC0907l.f3672j.isEmpty()) {
            return false;
        }
        RunnableC0996h runnableC0996h = new RunnableC0996h(this, new C0990f(this, this.f3962b, this.f3963c, this.f3970j));
        this.f3982v = runnableC0996h;
        ((View) this.f3968h).post(runnableC0996h);
        return true;
    }
}
