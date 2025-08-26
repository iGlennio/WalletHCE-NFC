package p014F0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.nfupay.s145.R;
import java.util.ArrayList;
import p086i.C0909n;
import p086i.InterfaceC0920y;
import p086i.MenuC0907l;
import p086i.SubMenuC0895E;

/* renamed from: F0.t */
/* loaded from: classes.dex */
public final class C0152t implements InterfaceC0920y {

    /* renamed from: A */
    public int f443A;

    /* renamed from: a */
    public NavigationMenuView f446a;

    /* renamed from: b */
    public LinearLayout f447b;

    /* renamed from: c */
    public MenuC0907l f448c;

    /* renamed from: d */
    public int f449d;

    /* renamed from: e */
    public C0144l f450e;

    /* renamed from: f */
    public LayoutInflater f451f;

    /* renamed from: h */
    public ColorStateList f453h;

    /* renamed from: k */
    public ColorStateList f456k;

    /* renamed from: l */
    public ColorStateList f457l;

    /* renamed from: m */
    public Drawable f458m;

    /* renamed from: n */
    public RippleDrawable f459n;

    /* renamed from: o */
    public int f460o;

    /* renamed from: p */
    public int f461p;

    /* renamed from: q */
    public int f462q;

    /* renamed from: r */
    public int f463r;

    /* renamed from: s */
    public int f464s;

    /* renamed from: t */
    public int f465t;

    /* renamed from: u */
    public int f466u;

    /* renamed from: v */
    public int f467v;

    /* renamed from: w */
    public boolean f468w;

    /* renamed from: y */
    public int f470y;

    /* renamed from: z */
    public int f471z;

    /* renamed from: g */
    public int f452g = 0;

    /* renamed from: i */
    public int f454i = 0;

    /* renamed from: j */
    public boolean f455j = true;

    /* renamed from: x */
    public boolean f469x = true;

    /* renamed from: B */
    public int f444B = -1;

    /* renamed from: C */
    public final ViewOnClickListenerC0141i f445C = new ViewOnClickListenerC0141i(0, this);

    @Override // p086i.InterfaceC0920y
    /* renamed from: c */
    public final void mo483c() {
        C0144l c0144l = this.f450e;
        if (c0144l != null) {
            c0144l.m480g();
            c0144l.f3492a.m2153b();
        }
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: d */
    public final int mo484d() {
        return this.f449d;
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
        this.f451f = LayoutInflater.from(context);
        this.f448c = menuC0907l;
        this.f443A = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: j */
    public final Parcelable mo488j() {
        Bundle bundle = new Bundle();
        if (this.f446a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f446a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C0144l c0144l = this.f450e;
        if (c0144l != null) {
            c0144l.getClass();
            Bundle bundle2 = new Bundle();
            C0909n c0909n = c0144l.f435d;
            if (c0909n != null) {
                bundle2.putInt("android:menu:checked", c0909n.f3693a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            ArrayList arrayList = c0144l.f434c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC0146n interfaceC0146n = (InterfaceC0146n) arrayList.get(i2);
                if (interfaceC0146n instanceof C0148p) {
                    C0909n c0909n2 = ((C0148p) interfaceC0146n).f440a;
                    View actionView = c0909n2 != null ? c0909n2.getActionView() : null;
                    if (actionView != null) {
                        C0154v c0154v = new C0154v();
                        actionView.saveHierarchyState(c0154v);
                        sparseArray2.put(c0909n2.f3693a, c0154v);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f447b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.f447b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: l */
    public final boolean mo489l(C0909n c0909n) {
        return false;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: m */
    public final void mo490m(Parcelable parcelable) {
        C0909n c0909n;
        View actionView;
        C0154v c0154v;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f446a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C0144l c0144l = this.f450e;
                c0144l.getClass();
                int i2 = bundle2.getInt("android:menu:checked", 0);
                ArrayList arrayList = c0144l.f434c;
                if (i2 != 0) {
                    c0144l.f436e = true;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        InterfaceC0146n interfaceC0146n = (InterfaceC0146n) arrayList.get(i3);
                        if (interfaceC0146n instanceof C0148p) {
                            C0909n c0909n2 = ((C0148p) interfaceC0146n).f440a;
                            if (c0909n2.f3693a == i2) {
                                c0144l.m481h(c0909n2);
                                break;
                            }
                        }
                        i3++;
                    }
                    c0144l.f436e = false;
                    c0144l.m480g();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        InterfaceC0146n interfaceC0146n2 = (InterfaceC0146n) arrayList.get(i4);
                        if ((interfaceC0146n2 instanceof C0148p) && (actionView = (c0909n = ((C0148p) interfaceC0146n2).f440a).getActionView()) != null && (c0154v = (C0154v) sparseParcelableArray2.get(c0909n.f3693a)) != null) {
                            actionView.restoreHierarchyState(c0154v);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f447b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: n */
    public final boolean mo491n(SubMenuC0895E subMenuC0895E) {
        return false;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: a */
    public final void mo482a(MenuC0907l menuC0907l, boolean z2) {
    }
}
