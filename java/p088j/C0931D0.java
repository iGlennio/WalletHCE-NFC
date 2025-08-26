package p088j;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: j.D0 */
/* loaded from: classes.dex */
public final class C0931D0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final /* synthetic */ int f3780a;

    /* renamed from: b */
    public final /* synthetic */ Object f3781b;

    public /* synthetic */ C0931D0(int i2, Object obj) {
        this.f3780a = i2;
        this.f3781b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        C1045x0 c1045x0;
        switch (this.f3780a) {
            case 0:
                if (i2 != -1 && (c1045x0 = ((C0943J0) this.f3781b).f3800c) != null) {
                    c1045x0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f3781b).m1411q(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f3780a;
    }

    /* renamed from: a */
    private final void m2385a(AdapterView adapterView) {
    }

    /* renamed from: b */
    private final void m2386b(AdapterView adapterView) {
    }
}
