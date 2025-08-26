package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p017G0.C0176h;
import p086i.C0909n;
import p086i.InterfaceC0891A;
import p086i.InterfaceC0906k;
import p086i.MenuC0907l;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0906k, InterfaceC0891A, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public static final int[] f1636b = {R.attr.background, R.attr.divider};

    /* renamed from: a */
    public MenuC0907l f1637a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0176h m519B = C0176h.m519B(context, attributeSet, f1636b, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) m519B.f516c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(m519B.m542q(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(m519B.m542q(1));
        }
        m519B.m523E();
    }

    @Override // p086i.InterfaceC0891A
    /* renamed from: b */
    public final void mo1380b(MenuC0907l menuC0907l) {
        this.f1637a = menuC0907l;
    }

    @Override // p086i.InterfaceC0906k
    /* renamed from: c */
    public final boolean mo1381c(C0909n c0909n) {
        return this.f1637a.m2344q(c0909n, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        mo1381c((C0909n) getAdapter().getItem(i2));
    }
}
