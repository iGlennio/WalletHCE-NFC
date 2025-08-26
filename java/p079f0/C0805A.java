package p079f0;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.A */
/* loaded from: classes.dex */
public final class C0805A extends Observable {
    /* renamed from: a */
    public final boolean m2152a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* renamed from: b */
    public final void m2153b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C0820P) ((Observable) this).mObservers.get(size)).f3249a;
            recyclerView.m1833i(null);
            recyclerView.f2401c0.f3263f = true;
            recyclerView.m1819T(true);
            if (!recyclerView.f2402d.m565h()) {
                recyclerView.requestLayout();
            }
        }
    }
}
