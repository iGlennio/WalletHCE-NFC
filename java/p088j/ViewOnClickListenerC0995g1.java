package p088j;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.nfupay.s145.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p048R.AbstractC0461c;
import p048R.C0459a;
import p048R.C0460b;

/* renamed from: j.g1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0995g1 extends AbstractC0461c implements View.OnClickListener {

    /* renamed from: x */
    public static final /* synthetic */ int f3928x = 0;

    /* renamed from: h */
    public final int f3929h;

    /* renamed from: i */
    public final int f3930i;

    /* renamed from: j */
    public final LayoutInflater f3931j;

    /* renamed from: k */
    public final SearchView f3932k;

    /* renamed from: l */
    public final SearchableInfo f3933l;

    /* renamed from: m */
    public final Context f3934m;

    /* renamed from: n */
    public final WeakHashMap f3935n;

    /* renamed from: o */
    public final int f3936o;

    /* renamed from: p */
    public int f3937p;

    /* renamed from: q */
    public ColorStateList f3938q;

    /* renamed from: r */
    public int f3939r;

    /* renamed from: s */
    public int f3940s;

    /* renamed from: t */
    public int f3941t;

    /* renamed from: u */
    public int f3942u;

    /* renamed from: v */
    public int f3943v;

    /* renamed from: w */
    public int f3944w;

    public ViewOnClickListenerC0995g1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1263b = true;
        this.f1264c = null;
        this.f1262a = false;
        this.f1265d = -1;
        this.f1266e = new C0459a(this);
        this.f1267f = new C0460b(0, this);
        this.f3930i = suggestionRowLayout;
        this.f3929h = suggestionRowLayout;
        this.f3931j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f3937p = 1;
        this.f3939r = -1;
        this.f3940s = -1;
        this.f3941t = -1;
        this.f3942u = -1;
        this.f3943v = -1;
        this.f3944w = -1;
        this.f3932k = searchView;
        this.f3933l = searchableInfo;
        this.f3936o = searchView.getSuggestionCommitIconResId();
        this.f3934m = context;
        this.f3935n = weakHashMap;
    }

    /* renamed from: h */
    public static String m2469h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    @Override // p048R.AbstractC0461c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1216a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j.ViewOnClickListenerC0995g1.mo1216a(android.view.View, android.database.Cursor):void");
    }

    @Override // p048R.AbstractC0461c
    /* renamed from: b */
    public final void mo1217b(Cursor cursor) {
        try {
            super.mo1217b(cursor);
            if (cursor != null) {
                this.f3939r = cursor.getColumnIndex("suggest_text_1");
                this.f3940s = cursor.getColumnIndex("suggest_text_2");
                this.f3941t = cursor.getColumnIndex("suggest_text_2_url");
                this.f3942u = cursor.getColumnIndex("suggest_icon_1");
                this.f3943v = cursor.getColumnIndex("suggest_icon_2");
                this.f3944w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // p048R.AbstractC0461c
    /* renamed from: c */
    public final String mo1218c(Cursor cursor) {
        String m2469h;
        String m2469h2;
        if (cursor == null) {
            return null;
        }
        String m2469h3 = m2469h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (m2469h3 != null) {
            return m2469h3;
        }
        SearchableInfo searchableInfo = this.f3933l;
        if (searchableInfo.shouldRewriteQueryFromData() && (m2469h2 = m2469h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return m2469h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (m2469h = m2469h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return m2469h;
    }

    @Override // p048R.AbstractC0461c
    /* renamed from: d */
    public final View mo1219d(ViewGroup viewGroup) {
        View inflate = this.f3931j.inflate(this.f3929h, viewGroup, false);
        inflate.setTag(new C0992f1(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f3936o);
        return inflate;
    }

    /* renamed from: e */
    public final Drawable m2470e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f3934m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m2471f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j.ViewOnClickListenerC0995g1.m2471f(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: g */
    public final Cursor m2472g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f3934m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p048R.AbstractC0461c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f3931j.inflate(this.f3930i, viewGroup, false);
            if (inflate != null) {
                ((C0992f1) inflate.getTag()).f3922a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // p048R.AbstractC0461c, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View mo1219d = mo1219d(viewGroup);
            ((C0992f1) mo1219d.getTag()).f3922a.setText(e2.toString());
            return mo1219d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1264c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1264c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3932k.m1412r((CharSequence) tag);
        }
    }
}
