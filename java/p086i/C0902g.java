package p086i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.nfupay.s145.R;
import java.util.ArrayList;

/* renamed from: i.g */
/* loaded from: classes.dex */
public final class C0902g extends BaseAdapter {

    /* renamed from: a */
    public int f3648a = -1;

    /* renamed from: b */
    public final /* synthetic */ C0903h f3649b;

    public C0902g(C0903h c0903h) {
        this.f3649b = c0903h;
        m2333a();
    }

    /* renamed from: a */
    public final void m2333a() {
        MenuC0907l menuC0907l = this.f3649b.f3652c;
        C0909n c0909n = menuC0907l.f3684v;
        if (c0909n != null) {
            menuC0907l.m2342i();
            ArrayList arrayList = menuC0907l.f3672j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((C0909n) arrayList.get(i2)) == c0909n) {
                    this.f3648a = i2;
                    return;
                }
            }
        }
        this.f3648a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0909n getItem(int i2) {
        C0903h c0903h = this.f3649b;
        MenuC0907l menuC0907l = c0903h.f3652c;
        menuC0907l.m2342i();
        ArrayList arrayList = menuC0907l.f3672j;
        c0903h.getClass();
        int i3 = this.f3648a;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (C0909n) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0903h c0903h = this.f3649b;
        MenuC0907l menuC0907l = c0903h.f3652c;
        menuC0907l.m2342i();
        int size = menuC0907l.f3672j.size();
        c0903h.getClass();
        return this.f3648a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3649b.f3651b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0921z) view).mo1377e(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2333a();
        super.notifyDataSetChanged();
    }
}
