package p088j;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: j.V0 */
/* loaded from: classes.dex */
public final class C0966V0 implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ SearchView f3873a;

    public C0966V0(SearchView searchView) {
        this.f3873a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        SearchView searchView = this.f3873a;
        Editable text = searchView.f1765p.getText();
        searchView.f1757V = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.m1418x(!isEmpty);
        int i5 = 8;
        if (searchView.f1756U && !searchView.f1749N && isEmpty) {
            searchView.f1770u.setVisibility(8);
            i5 = 0;
        }
        searchView.f1772w.setVisibility(i5);
        searchView.m1414t();
        searchView.m1417w();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
