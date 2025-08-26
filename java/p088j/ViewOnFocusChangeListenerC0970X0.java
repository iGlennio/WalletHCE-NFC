package p088j;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: j.X0 */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0970X0 implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f3880a;

    public ViewOnFocusChangeListenerC0970X0(SearchView searchView) {
        this.f3880a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.f3880a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f1746K;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
