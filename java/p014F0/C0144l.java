package p014F0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;
import p079f0.AbstractC0827X;
import p079f0.AbstractC0862z;
import p086i.C0909n;
import p086i.SubMenuC0895E;

/* renamed from: F0.l */
/* loaded from: classes.dex */
public final class C0144l extends AbstractC0862z {

    /* renamed from: c */
    public final ArrayList f434c = new ArrayList();

    /* renamed from: d */
    public C0909n f435d;

    /* renamed from: e */
    public boolean f436e;

    /* renamed from: f */
    public final /* synthetic */ C0152t f437f;

    public C0144l(C0152t c0152t) {
        this.f437f = c0152t;
        m480g();
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: a */
    public final int mo474a() {
        return this.f434c.size();
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: b */
    public final long mo475b(int i2) {
        return i2;
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: c */
    public final int mo476c(int i2) {
        InterfaceC0146n interfaceC0146n = (InterfaceC0146n) this.f434c.get(i2);
        if (interfaceC0146n instanceof C0147o) {
            return 2;
        }
        if (interfaceC0146n instanceof C0145m) {
            return 3;
        }
        if (interfaceC0146n instanceof C0148p) {
            return ((C0148p) interfaceC0146n).f440a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: d */
    public final void mo477d(AbstractC0827X abstractC0827X, int i2) {
        int mo476c = mo476c(i2);
        ArrayList arrayList = this.f434c;
        C0152t c0152t = this.f437f;
        View view = ((AbstractC0151s) abstractC0827X).f3280a;
        if (mo476c != 0) {
            if (mo476c != 1) {
                if (mo476c != 2) {
                    return;
                }
                C0147o c0147o = (C0147o) arrayList.get(i2);
                view.setPadding(c0152t.f464s, c0147o.f438a, c0152t.f465t, c0147o.f439b);
                return;
            }
            TextView textView = (TextView) view;
            textView.setText(((C0148p) arrayList.get(i2)).f440a.f3697e);
            textView.setTextAppearance(c0152t.f452g);
            textView.setPadding(c0152t.f466u, textView.getPaddingTop(), c0152t.f467v, textView.getPaddingBottom());
            ColorStateList colorStateList = c0152t.f453h;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            AbstractC0272P.m823m(textView, new C0143k(this, i2, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(c0152t.f457l);
        navigationMenuItemView.setTextAppearance(c0152t.f454i);
        ColorStateList colorStateList2 = c0152t.f456k;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = c0152t.f458m;
        Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        navigationMenuItemView.setBackground(newDrawable);
        RippleDrawable rippleDrawable = c0152t.f459n;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        C0148p c0148p = (C0148p) arrayList.get(i2);
        navigationMenuItemView.setNeedsEmptyIcon(c0148p.f441b);
        int i3 = c0152t.f460o;
        int i4 = c0152t.f461p;
        navigationMenuItemView.setPadding(i3, i4, i3, i4);
        navigationMenuItemView.setIconPadding(c0152t.f462q);
        if (c0152t.f468w) {
            navigationMenuItemView.setIconSize(c0152t.f463r);
        }
        navigationMenuItemView.setMaxLines(c0152t.f470y);
        navigationMenuItemView.f2742y = c0152t.f455j;
        navigationMenuItemView.mo1377e(c0148p.f440a);
        AbstractC0272P.m823m(navigationMenuItemView, new C0143k(this, i2, false));
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: e */
    public final AbstractC0827X mo478e(ViewGroup viewGroup, int i2) {
        C0152t c0152t = this.f437f;
        if (i2 == 0) {
            LayoutInflater layoutInflater = c0152t.f451f;
            ViewOnClickListenerC0141i viewOnClickListenerC0141i = c0152t.f445C;
            View inflate = layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false);
            C0150r c0150r = new C0150r(inflate);
            inflate.setOnClickListener(viewOnClickListenerC0141i);
            return c0150r;
        }
        if (i2 == 1) {
            return new C0142j(c0152t.f451f.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i2 == 2) {
            return new C0142j(c0152t.f451f.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i2 != 3) {
            return null;
        }
        return new C0142j(c0152t.f447b);
    }

    @Override // p079f0.AbstractC0862z
    /* renamed from: f */
    public final void mo479f(AbstractC0827X abstractC0827X) {
        AbstractC0151s abstractC0151s = (AbstractC0151s) abstractC0827X;
        if (abstractC0151s instanceof C0150r) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC0151s.f3280a;
            FrameLayout frameLayout = navigationMenuItemView.f2733A;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f2743z.setCompoundDrawables(null, null, null, null);
        }
    }

    /* renamed from: g */
    public final void m480g() {
        boolean z2;
        if (this.f436e) {
            return;
        }
        this.f436e = true;
        ArrayList arrayList = this.f434c;
        arrayList.clear();
        arrayList.add(new C0145m());
        C0152t c0152t = this.f437f;
        int size = c0152t.f448c.m2343l().size();
        boolean z3 = false;
        int i2 = -1;
        int i3 = 0;
        boolean z4 = false;
        int i4 = 0;
        while (i3 < size) {
            C0909n c0909n = (C0909n) c0152t.f448c.m2343l().get(i3);
            if (c0909n.isChecked()) {
                m481h(c0909n);
            }
            if (c0909n.isCheckable()) {
                c0909n.m2354f(z3);
            }
            if (c0909n.hasSubMenu()) {
                SubMenuC0895E subMenuC0895E = c0909n.f3707o;
                if (subMenuC0895E.hasVisibleItems()) {
                    if (i3 != 0) {
                        arrayList.add(new C0147o(c0152t.f443A, z3 ? 1 : 0));
                    }
                    arrayList.add(new C0148p(c0909n));
                    int size2 = subMenuC0895E.f3668f.size();
                    int i5 = z3 ? 1 : 0;
                    int i6 = i5;
                    while (i5 < size2) {
                        C0909n c0909n2 = (C0909n) subMenuC0895E.getItem(i5);
                        if (c0909n2.isVisible()) {
                            if (i6 == 0 && c0909n2.getIcon() != null) {
                                i6 = 1;
                            }
                            if (c0909n2.isCheckable()) {
                                c0909n2.m2354f(z3);
                            }
                            if (c0909n.isChecked()) {
                                m481h(c0909n);
                            }
                            arrayList.add(new C0148p(c0909n2));
                        }
                        i5++;
                        z3 = false;
                    }
                    if (i6 != 0) {
                        int size3 = arrayList.size();
                        for (int size4 = arrayList.size(); size4 < size3; size4++) {
                            ((C0148p) arrayList.get(size4)).f441b = true;
                        }
                    }
                }
                z2 = true;
            } else {
                int i7 = c0909n.f3694b;
                if (i7 != i2) {
                    i4 = arrayList.size();
                    z4 = c0909n.getIcon() != null;
                    if (i3 != 0) {
                        i4++;
                        int i8 = c0152t.f443A;
                        arrayList.add(new C0147o(i8, i8));
                    }
                } else if (!z4 && c0909n.getIcon() != null) {
                    int size5 = arrayList.size();
                    for (int i9 = i4; i9 < size5; i9++) {
                        ((C0148p) arrayList.get(i9)).f441b = true;
                    }
                    z2 = true;
                    z4 = true;
                    C0148p c0148p = new C0148p(c0909n);
                    c0148p.f441b = z4;
                    arrayList.add(c0148p);
                    i2 = i7;
                }
                z2 = true;
                C0148p c0148p2 = new C0148p(c0909n);
                c0148p2.f441b = z4;
                arrayList.add(c0148p2);
                i2 = i7;
            }
            i3++;
            z3 = false;
        }
        this.f436e = z3 ? 1 : 0;
    }

    /* renamed from: h */
    public final void m481h(C0909n c0909n) {
        if (this.f435d == c0909n || !c0909n.isCheckable()) {
            return;
        }
        C0909n c0909n2 = this.f435d;
        if (c0909n2 != null) {
            c0909n2.setChecked(false);
        }
        this.f435d = c0909n;
        c0909n.setChecked(true);
    }
}
