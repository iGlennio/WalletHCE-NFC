package p014F0;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.datepicker.C0709j;
import com.google.android.material.internal.NavigationMenuItemView;
import p076e.C0780d;
import p083h.AbstractC0873a;
import p086i.C0909n;
import p088j.C1019o1;

/* renamed from: F0.i */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0141i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f429a;

    /* renamed from: b */
    public final /* synthetic */ Object f430b;

    public /* synthetic */ ViewOnClickListenerC0141i(int i2, Object obj) {
        this.f429a = i2;
        this.f430b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f429a) {
            case 0:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                C0152t c0152t = (C0152t) this.f430b;
                C0144l c0144l = c0152t.f450e;
                boolean z2 = true;
                if (c0144l != null) {
                    c0144l.f436e = true;
                }
                C0909n itemData = navigationMenuItemView.getItemData();
                boolean m2344q = c0152t.f448c.m2344q(itemData, c0152t, 0);
                if (itemData != null && itemData.isCheckable() && m2344q) {
                    c0152t.f450e.m481h(itemData);
                } else {
                    z2 = false;
                }
                C0144l c0144l2 = c0152t.f450e;
                if (c0144l2 != null) {
                    c0144l2.f436e = false;
                }
                if (z2) {
                    c0152t.mo483c();
                    break;
                }
                break;
            case 1:
                C0709j c0709j = (C0709j) this.f430b;
                int i2 = c0709j.f2649V;
                if (i2 != 2) {
                    if (i2 == 1) {
                        c0709j.m1950B(2);
                        break;
                    }
                } else {
                    c0709j.m1950B(1);
                    break;
                }
                break;
            case 2:
                C0780d c0780d = (C0780d) this.f430b;
                Button button = c0780d.f3059f;
                c0780d.f3075v.obtainMessage(1, c0780d.f3055b).sendToTarget();
                break;
            case 3:
                ((AbstractC0873a) this.f430b).mo2064a();
                break;
            case 4:
                C1019o1 c1019o1 = ((Toolbar) this.f430b).f1791L;
                C0909n c0909n = c1019o1 == null ? null : c1019o1.f4016b;
                if (c0909n != null) {
                    c0909n.collapseActionView();
                    break;
                }
                break;
            default:
                ((AlertDialog) this.f430b).dismiss();
                break;
        }
    }
}
