package p048R;

import android.database.DataSetObserver;
import p088j.C0943J0;
import p088j.ViewOnClickListenerC0995g1;

/* renamed from: R.b */
/* loaded from: classes.dex */
public final class C0460b extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ int f1260a;

    /* renamed from: b */
    public final /* synthetic */ Object f1261b;

    public /* synthetic */ C0460b(int i2, Object obj) {
        this.f1260a = i2;
        this.f1261b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1260a) {
            case 0:
                ViewOnClickListenerC0995g1 viewOnClickListenerC0995g1 = (ViewOnClickListenerC0995g1) this.f1261b;
                viewOnClickListenerC0995g1.f1262a = true;
                viewOnClickListenerC0995g1.notifyDataSetChanged();
                break;
            default:
                C0943J0 c0943j0 = (C0943J0) this.f1261b;
                if (c0943j0.f3823z.isShowing()) {
                    c0943j0.mo2310i();
                    break;
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1260a) {
            case 0:
                ViewOnClickListenerC0995g1 viewOnClickListenerC0995g1 = (ViewOnClickListenerC0995g1) this.f1261b;
                viewOnClickListenerC0995g1.f1262a = false;
                viewOnClickListenerC0995g1.notifyDataSetInvalidated();
                break;
            default:
                ((C0943J0) this.f1261b).dismiss();
                break;
        }
    }
}
