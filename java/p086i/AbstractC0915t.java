package p086i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: i.t */
/* loaded from: classes.dex */
public abstract class AbstractC0915t implements InterfaceC0893C, InterfaceC0920y, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f3729a;

    /* renamed from: p */
    public static int m2357p(ListAdapter listAdapter, Context context, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i2) {
                return i2;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* renamed from: x */
    public static boolean m2358x(MenuC0907l menuC0907l) {
        int size = menuC0907l.f3668f.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = menuC0907l.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
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
    /* renamed from: l */
    public final boolean mo489l(C0909n c0909n) {
        return false;
    }

    /* renamed from: o */
    public abstract void mo2312o(MenuC0907l menuC0907l);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C0904i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0904i) listAdapter).f3656a.m2344q((MenuItem) listAdapter.getItem(i2), this, !(this instanceof ViewOnKeyListenerC0901f) ? 0 : 4);
    }

    /* renamed from: q */
    public abstract void mo2313q(View view);

    /* renamed from: r */
    public abstract void mo2314r(boolean z2);

    /* renamed from: s */
    public abstract void mo2315s(int i2);

    /* renamed from: t */
    public abstract void mo2316t(int i2);

    /* renamed from: u */
    public abstract void mo2317u(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: v */
    public abstract void mo2318v(boolean z2);

    /* renamed from: w */
    public abstract void mo2319w(int i2);

    @Override // p086i.InterfaceC0920y
    /* renamed from: h */
    public final void mo487h(Context context, MenuC0907l menuC0907l) {
    }
}
