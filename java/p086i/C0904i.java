package p086i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: i.i */
/* loaded from: classes.dex */
public final class C0904i extends BaseAdapter {

    /* renamed from: a */
    public final MenuC0907l f3656a;

    /* renamed from: b */
    public int f3657b = -1;

    /* renamed from: c */
    public boolean f3658c;

    /* renamed from: d */
    public final boolean f3659d;

    /* renamed from: e */
    public final LayoutInflater f3660e;

    /* renamed from: f */
    public final int f3661f;

    public C0904i(MenuC0907l menuC0907l, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f3659d = z2;
        this.f3660e = layoutInflater;
        this.f3656a = menuC0907l;
        this.f3661f = i2;
        m2335a();
    }

    /* renamed from: a */
    public final void m2335a() {
        MenuC0907l menuC0907l = this.f3656a;
        C0909n c0909n = menuC0907l.f3684v;
        if (c0909n != null) {
            menuC0907l.m2342i();
            ArrayList arrayList = menuC0907l.f3672j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0909n) arrayList.get(i2)) == c0909n) {
                    this.f3657b = i2;
                    return;
                }
            }
        }
        this.f3657b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0909n getItem(int i2) {
        ArrayList m2343l;
        MenuC0907l menuC0907l = this.f3656a;
        if (this.f3659d) {
            menuC0907l.m2342i();
            m2343l = menuC0907l.f3672j;
        } else {
            m2343l = menuC0907l.m2343l();
        }
        int i3 = this.f3657b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C0909n) m2343l.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList m2343l;
        MenuC0907l menuC0907l = this.f3656a;
        if (this.f3659d) {
            menuC0907l.m2342i();
            m2343l = menuC0907l.f3672j;
        } else {
            m2343l = menuC0907l.m2343l();
        }
        return this.f3657b < 0 ? m2343l.size() : m2343l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f3660e.inflate(this.f3661f, viewGroup, false);
        }
        int i3 = getItem(i2).f3694b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f3694b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3656a.mo2325m() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0921z interfaceC0921z = (InterfaceC0921z) view;
        if (this.f3658c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0921z.mo1377e(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2335a();
        super.notifyDataSetChanged();
    }
}
