package p043P0;

import android.view.View;

/* renamed from: P0.b */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0408b implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f1071a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0423q f1072b;

    public /* synthetic */ ViewOnFocusChangeListenerC0408b(AbstractC0423q abstractC0423q, int i2) {
        this.f1071a = i2;
        this.f1072b = abstractC0423q;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f1071a) {
            case 0:
                C0411e c0411e = (C0411e) this.f1072b;
                c0411e.m1074t(c0411e.m1075u());
                break;
            default:
                C0417k c0417k = (C0417k) this.f1072b;
                c0417k.f1099l = z2;
                c0417k.m1105q();
                if (!z2) {
                    c0417k.m1083t(false);
                    c0417k.f1100m = false;
                    break;
                }
                break;
        }
    }
}
