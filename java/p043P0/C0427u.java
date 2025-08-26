package p043P0;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import p088j.C0943J0;
import p088j.C0954P;
import p088j.C0961T;

/* renamed from: P0.u */
/* loaded from: classes.dex */
public final class C0427u implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f1174a;

    /* renamed from: b */
    public final /* synthetic */ Object f1175b;

    public /* synthetic */ C0427u(int i2, Object obj) {
        this.f1174a = i2;
        this.f1175b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        Object item;
        switch (this.f1174a) {
            case 0:
                C0429w c0429w = (C0429w) this.f1175b;
                if (i2 < 0) {
                    C0943J0 c0943j0 = c0429w.f1179e;
                    item = !c0943j0.f3823z.isShowing() ? null : c0943j0.f3800c.getSelectedItem();
                } else {
                    item = c0429w.getAdapter().getItem(i2);
                }
                C0429w.m1116a(c0429w, item);
                AdapterView.OnItemClickListener onItemClickListener = c0429w.getOnItemClickListener();
                C0943J0 c0943j02 = c0429w.f1179e;
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        view = c0943j02.f3823z.isShowing() ? c0943j02.f3800c.getSelectedView() : null;
                        i2 = !c0943j02.f3823z.isShowing() ? -1 : c0943j02.f3800c.getSelectedItemPosition();
                        j2 = !c0943j02.f3823z.isShowing() ? Long.MIN_VALUE : c0943j02.f3800c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0943j02.f3800c, view, i2, j2);
                }
                c0943j02.dismiss();
                break;
            case 1:
                C0954P c0954p = (C0954P) this.f1175b;
                c0954p.f3840G.setSelection(i2);
                C0961T c0961t = c0954p.f3840G;
                if (c0961t.getOnItemClickListener() != null) {
                    c0961t.performItemClick(view, i2, c0954p.f3837D.getItemId(i2));
                }
                c0954p.dismiss();
                break;
            default:
                ((SearchView) this.f1175b).m1410p(i2);
                break;
        }
    }
}
