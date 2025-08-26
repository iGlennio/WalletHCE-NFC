package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0582a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SearchView f1827a;

    public ViewOnClickListenerC0582a(SearchView searchView) {
        this.f1827a = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f1827a;
        ImageView imageView = searchView.f1769t;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f1765p;
        if (view == imageView) {
            searchView.m1419y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f1747L;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f1771v) {
            searchView.m1409o();
            return;
        }
        if (view == searchView.f1770u) {
            searchView.m1413s();
            return;
        }
        if (view != searchView.f1772w) {
            if (view == searchAutoComplete) {
                searchView.m1408n();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f1760b0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.m1407m(searchView.f1744I, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f1743H);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
