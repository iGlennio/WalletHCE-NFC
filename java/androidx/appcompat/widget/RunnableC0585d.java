package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public final class RunnableC0585d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ SearchView.SearchAutoComplete f1829a;

    public RunnableC0585d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f1829a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f1829a;
        if (searchAutoComplete.f1778g) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f1778g = false;
        }
    }
}
