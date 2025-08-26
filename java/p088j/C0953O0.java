package p088j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p086i.C0904i;
import p086i.C0909n;
import p086i.MenuC0907l;

/* renamed from: j.O0 */
/* loaded from: classes.dex */
public final class C0953O0 extends C1045x0 {

    /* renamed from: m */
    public final int f3832m;

    /* renamed from: n */
    public final int f3833n;

    /* renamed from: o */
    public InterfaceC0945K0 f3834o;

    /* renamed from: p */
    public C0909n f3835p;

    public C0953O0(Context context, boolean z2) {
        super(context, z2);
        if (1 == AbstractC0951N0.m2423a(context.getResources().getConfiguration())) {
            this.f3832m = 21;
            this.f3833n = 22;
        } else {
            this.f3832m = 22;
            this.f3833n = 21;
        }
    }

    @Override // p088j.C1045x0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0904i c0904i;
        int i2;
        int pointToPosition;
        int i3;
        if (this.f3834o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i2 = headerViewListAdapter.getHeadersCount();
                c0904i = (C0904i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c0904i = (C0904i) adapter;
                i2 = 0;
            }
            C0909n item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = pointToPosition - i2) < 0 || i3 >= c0904i.getCount()) ? null : c0904i.getItem(i3);
            C0909n c0909n = this.f3835p;
            if (c0909n != item) {
                MenuC0907l menuC0907l = c0904i.f3656a;
                if (c0909n != null) {
                    this.f3834o.mo177m(menuC0907l, c0909n);
                }
                this.f3835p = item;
                if (item != null) {
                    this.f3834o.mo171g(menuC0907l, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f3832m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f3833n) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C0904i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0904i) adapter).f3656a.m2339c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0945K0 interfaceC0945K0) {
        this.f3834o = interfaceC0945K0;
    }

    @Override // p088j.C1045x0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
