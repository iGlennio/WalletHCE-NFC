package p088j;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: j.Z0 */
/* loaded from: classes.dex */
public final class C0974Z0 implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f3883a;

    public C0974Z0(SearchView searchView) {
        this.f3883a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        this.f3883a.m1413s();
        return true;
    }
}
