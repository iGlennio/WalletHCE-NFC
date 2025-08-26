package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.nfupay.s145.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p010D1.AbstractC0096d;
import p013E1.C0117i;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p043P0.C0427u;
import p048R.AbstractC0461c;
import p073d.AbstractC0734a;
import p083h.InterfaceC0874b;
import p088j.AbstractC0929C0;
import p088j.C0931D0;
import p088j.C0966V0;
import p088j.C0974Z0;
import p088j.C0986d1;
import p088j.C0989e1;
import p088j.C1017o;
import p088j.InterfaceC0977a1;
import p088j.InterfaceC0980b1;
import p088j.InterfaceC0983c1;
import p088j.RunnableC0968W0;
import p088j.ViewOnClickListenerC0995g1;
import p088j.ViewOnFocusChangeListenerC0970X0;
import p088j.ViewOnLayoutChangeListenerC0972Y0;

/* loaded from: classes.dex */
public class SearchView extends AbstractC0929C0 implements InterfaceC0874b {

    /* renamed from: g0 */
    public static final C0117i f1735g0;

    /* renamed from: A */
    public final Rect f1736A;

    /* renamed from: B */
    public final int[] f1737B;

    /* renamed from: C */
    public final int[] f1738C;

    /* renamed from: D */
    public final ImageView f1739D;

    /* renamed from: E */
    public final Drawable f1740E;

    /* renamed from: F */
    public final int f1741F;

    /* renamed from: G */
    public final int f1742G;

    /* renamed from: H */
    public final Intent f1743H;

    /* renamed from: I */
    public final Intent f1744I;

    /* renamed from: J */
    public final CharSequence f1745J;

    /* renamed from: K */
    public View.OnFocusChangeListener f1746K;

    /* renamed from: L */
    public View.OnClickListener f1747L;

    /* renamed from: M */
    public boolean f1748M;

    /* renamed from: N */
    public boolean f1749N;

    /* renamed from: O */
    public AbstractC0461c f1750O;

    /* renamed from: P */
    public boolean f1751P;

    /* renamed from: Q */
    public CharSequence f1752Q;

    /* renamed from: R */
    public boolean f1753R;

    /* renamed from: S */
    public boolean f1754S;

    /* renamed from: T */
    public int f1755T;

    /* renamed from: U */
    public boolean f1756U;

    /* renamed from: V */
    public CharSequence f1757V;

    /* renamed from: W */
    public boolean f1758W;

    /* renamed from: a0 */
    public int f1759a0;

    /* renamed from: b0 */
    public SearchableInfo f1760b0;

    /* renamed from: c0 */
    public Bundle f1761c0;

    /* renamed from: d0 */
    public final RunnableC0968W0 f1762d0;

    /* renamed from: e0 */
    public final RunnableC0968W0 f1763e0;

    /* renamed from: f0 */
    public final WeakHashMap f1764f0;

    /* renamed from: p */
    public final SearchAutoComplete f1765p;

    /* renamed from: q */
    public final View f1766q;

    /* renamed from: r */
    public final View f1767r;

    /* renamed from: s */
    public final View f1768s;

    /* renamed from: t */
    public final ImageView f1769t;

    /* renamed from: u */
    public final ImageView f1770u;

    /* renamed from: v */
    public final ImageView f1771v;

    /* renamed from: w */
    public final ImageView f1772w;

    /* renamed from: x */
    public final View f1773x;

    /* renamed from: y */
    public C0989e1 f1774y;

    /* renamed from: z */
    public final Rect f1775z;

    public static class SearchAutoComplete extends C1017o {

        /* renamed from: e */
        public int f1776e;

        /* renamed from: f */
        public SearchView f1777f;

        /* renamed from: g */
        public boolean f1778g;

        /* renamed from: h */
        public final RunnableC0585d f1779h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1779h = new RunnableC0585d(this);
            this.f1776e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public final void m1420a() {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC0584c.m1444b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0117i c0117i = SearchView.f1735g0;
            c0117i.getClass();
            C0117i.m445a();
            Method method = c0117i.f337c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1776e <= 0 || super.enoughToFilter();
        }

        @Override // p088j.C1017o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1778g) {
                RunnableC0585d runnableC0585d = this.f1779h;
                removeCallbacks(runnableC0585d);
                post(runnableC0585d);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f1777f;
            searchView.m1419y(searchView.f1749N);
            searchView.post(searchView.f1762d0);
            if (searchView.f1765p.hasFocus()) {
                searchView.m1408n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1777f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f1777f.hasFocus() && getVisibility() == 0) {
                this.f1778g = true;
                Context context = getContext();
                C0117i c0117i = SearchView.f1735g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m1420a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0585d runnableC0585d = this.f1779h;
            if (!z2) {
                this.f1778g = false;
                removeCallbacks(runnableC0585d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1778g = true;
                    return;
                }
                this.f1778g = false;
                removeCallbacks(runnableC0585d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1777f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1776e = i2;
        }
    }

    static {
        C0117i c0117i = null;
        if (Build.VERSION.SDK_INT < 29) {
            C0117i c0117i2 = new C0117i();
            c0117i2.f335a = null;
            c0117i2.f336b = null;
            c0117i2.f337c = null;
            C0117i.m445a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                c0117i2.f335a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                c0117i2.f336b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c0117i2.f337c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c0117i = c0117i2;
        }
        f1735g0 = c0117i;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f1765p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // p083h.InterfaceC0874b
    /* renamed from: a */
    public final void mo1404a() {
        if (this.f1758W) {
            return;
        }
        this.f1758W = true;
        SearchAutoComplete searchAutoComplete = this.f1765p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f1759a0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1754S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1765p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1754S = false;
    }

    @Override // p083h.InterfaceC0874b
    /* renamed from: d */
    public final void mo1405d() {
        SearchAutoComplete searchAutoComplete = this.f1765p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1757V = "";
        clearFocus();
        m1419y(true);
        searchAutoComplete.setImeOptions(this.f1759a0);
        this.f1758W = false;
    }

    public int getImeOptions() {
        return this.f1765p.getImeOptions();
    }

    public int getInputType() {
        return this.f1765p.getInputType();
    }

    public int getMaxWidth() {
        return this.f1755T;
    }

    public CharSequence getQuery() {
        return this.f1765p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1752Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1760b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1745J : getContext().getText(this.f1760b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1742G;
    }

    public int getSuggestionRowLayout() {
        return this.f1741F;
    }

    public AbstractC0461c getSuggestionsAdapter() {
        return this.f1750O;
    }

    /* renamed from: l */
    public final Intent m1406l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1757V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1761c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1760b0.getSearchActivity());
        return intent;
    }

    /* renamed from: m */
    public final Intent m1407m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1761c0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: n */
    public final void m1408n() {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1765p;
        if (i2 >= 29) {
            AbstractC0584c.m1443a(searchAutoComplete);
            return;
        }
        C0117i c0117i = f1735g0;
        c0117i.getClass();
        C0117i.m445a();
        Method method = c0117i.f335a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        c0117i.getClass();
        C0117i.m445a();
        Method method2 = c0117i.f336b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: o */
    public final void m1409o() {
        SearchAutoComplete searchAutoComplete = this.f1765p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f1748M) {
            clearFocus();
            m1419y(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1762d0);
        post(this.f1763e0);
        super.onDetachedFromWindow();
    }

    @Override // p088j.AbstractC0929C0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f1737B;
            SearchAutoComplete searchAutoComplete = this.f1765p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f1738C;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f1775z;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f1736A;
            rect2.set(i8, 0, i9, i10);
            C0989e1 c0989e1 = this.f1774y;
            if (c0989e1 == null) {
                C0989e1 c0989e12 = new C0989e1(rect2, rect, searchAutoComplete);
                this.f1774y = c0989e12;
                setTouchDelegate(c0989e12);
            } else {
                c0989e1.f3908b.set(rect2);
                Rect rect3 = c0989e1.f3910d;
                rect3.set(rect2);
                int i11 = -c0989e1.f3911e;
                rect3.inset(i11, i11);
                c0989e1.f3909c.set(rect);
            }
        }
    }

    @Override // p088j.AbstractC0929C0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1749N) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f1755T;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1755T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f1755T) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0986d1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0986d1 c0986d1 = (C0986d1) parcelable;
        super.onRestoreInstanceState(c0986d1.f1273a);
        m1419y(c0986d1.f3905c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0986d1 c0986d1 = new C0986d1(super.onSaveInstanceState());
        c0986d1.f3905c = this.f1749N;
        return c0986d1;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f1762d0);
    }

    /* renamed from: p */
    public final void m1410p(int i2) {
        int i3;
        String m2469h;
        Cursor cursor = this.f1750O.f1264c;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = ViewOnClickListenerC0995g1.f3928x;
                String m2469h2 = ViewOnClickListenerC0995g1.m2469h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (m2469h2 == null) {
                    m2469h2 = this.f1760b0.getSuggestIntentAction();
                }
                if (m2469h2 == null) {
                    m2469h2 = "android.intent.action.SEARCH";
                }
                String m2469h3 = ViewOnClickListenerC0995g1.m2469h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (m2469h3 == null) {
                    m2469h3 = this.f1760b0.getSuggestIntentData();
                }
                if (m2469h3 != null && (m2469h = ViewOnClickListenerC0995g1.m2469h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    m2469h3 = m2469h3 + "/" + Uri.encode(m2469h);
                }
                intent = m1406l(m2469h2, m2469h3 == null ? null : Uri.parse(m2469h3), ViewOnClickListenerC0995g1.m2469h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC0995g1.m2469h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1765p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* renamed from: q */
    public final void m1411q(int i2) {
        Editable text = this.f1765p.getText();
        Cursor cursor = this.f1750O.f1264c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String mo1218c = this.f1750O.mo1218c(cursor);
        if (mo1218c != null) {
            setQuery(mo1218c);
        } else {
            setQuery(text);
        }
    }

    /* renamed from: r */
    public final void m1412r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f1754S || !isFocusable()) {
            return false;
        }
        if (this.f1749N) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f1765p.requestFocus(i2, rect);
        if (requestFocus) {
            m1419y(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public final void m1413s() {
        SearchAutoComplete searchAutoComplete = this.f1765p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1760b0 != null) {
            getContext().startActivity(m1406l("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1761c0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            m1409o();
            return;
        }
        m1419y(false);
        SearchAutoComplete searchAutoComplete = this.f1765p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1747L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.f1748M == z2) {
            return;
        }
        this.f1748M = z2;
        m1419y(z2);
        m1416v();
    }

    public void setImeOptions(int i2) {
        this.f1765p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f1765p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f1755T = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1746K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1747L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1752Q = charSequence;
        m1416v();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.f1753R = z2;
        AbstractC0461c abstractC0461c = this.f1750O;
        if (abstractC0461c instanceof ViewOnClickListenerC0995g1) {
            ((ViewOnClickListenerC0995g1) abstractC0461c).f3937p = z2 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f1760b0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f1765p
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f1760b0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f1760b0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f1760b0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            R.c r7 = r6.f1750O
            if (r7 == 0) goto L3b
            r7.mo1217b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f1760b0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            j.g1 r7 = new j.g1
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f1760b0
            java.util.WeakHashMap r5 = r6.f1764f0
            r7.<init>(r3, r6, r4, r5)
            r6.f1750O = r7
            r2.setAdapter(r7)
            R.c r7 = r6.f1750O
            j.g1 r7 = (p088j.ViewOnClickListenerC0995g1) r7
            boolean r3 = r6.f1753R
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f3937p = r3
        L62:
            r6.m1416v()
        L65:
            android.app.SearchableInfo r7 = r6.f1760b0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f1760b0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.f1743H
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f1760b0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.f1744I
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.f1756U = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.f1749N
            r6.m1419y(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.f1751P = z2;
        m1419y(this.f1749N);
    }

    public void setSuggestionsAdapter(AbstractC0461c abstractC0461c) {
        this.f1750O = abstractC0461c;
        this.f1765p.setAdapter(abstractC0461c);
    }

    /* renamed from: t */
    public final void m1414t() {
        boolean isEmpty = TextUtils.isEmpty(this.f1765p.getText());
        int i2 = (!isEmpty || (this.f1748M && !this.f1758W)) ? 0 : 8;
        ImageView imageView = this.f1771v;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: u */
    public final void m1415u() {
        int[] iArr = this.f1765p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1767r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1768s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: v */
    public final void m1416v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z2 = this.f1748M;
        SearchAutoComplete searchAutoComplete = this.f1765p;
        if (z2 && (drawable = this.f1740E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    /* renamed from: w */
    public final void m1417w() {
        this.f1768s.setVisibility(((this.f1751P || this.f1756U) && !this.f1749N && (this.f1770u.getVisibility() == 0 || this.f1772w.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: x */
    public final void m1418x(boolean z2) {
        boolean z3 = this.f1751P;
        this.f1770u.setVisibility((!z3 || !(z3 || this.f1756U) || this.f1749N || !hasFocus() || (!z2 && this.f1756U)) ? 8 : 0);
    }

    /* renamed from: y */
    public final void m1419y(boolean z2) {
        this.f1749N = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f1765p.getText());
        this.f1769t.setVisibility(i3);
        m1418x(!isEmpty);
        this.f1766q.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f1739D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f1748M) ? 8 : 0);
        m1414t();
        if (this.f1756U && !this.f1749N && isEmpty) {
            this.f1770u.setVisibility(8);
            i2 = 0;
        }
        this.f1772w.setVisibility(i2);
        m1417w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1775z = new Rect();
        this.f1736A = new Rect();
        this.f1737B = new int[2];
        this.f1738C = new int[2];
        this.f1762d0 = new RunnableC0968W0(this, 0);
        this.f1763e0 = new RunnableC0968W0(this, 1);
        this.f1764f0 = new WeakHashMap();
        ViewOnClickListenerC0582a viewOnClickListenerC0582a = new ViewOnClickListenerC0582a(this);
        ViewOnKeyListenerC0583b viewOnKeyListenerC0583b = new ViewOnKeyListenerC0583b(this);
        C0974Z0 c0974z0 = new C0974Z0(this);
        C0427u c0427u = new C0427u(2, this);
        C0931D0 c0931d0 = new C0931D0(1, this);
        C0966V0 c0966v0 = new C0966V0(this);
        int[] iArr = AbstractC0734a.f2931u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C0176h c0176h = new C0176h(context, obtainStyledAttributes);
        AbstractC0272P.m822l(this, context, iArr, attributeSet, obtainStyledAttributes, i2);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1765p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1766q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1767r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f1768s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1769t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1770u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1771v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1772w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1739D = imageView5;
        findViewById.setBackground(c0176h.m542q(20));
        findViewById2.setBackground(c0176h.m542q(25));
        imageView.setImageDrawable(c0176h.m542q(23));
        imageView2.setImageDrawable(c0176h.m542q(15));
        imageView3.setImageDrawable(c0176h.m542q(12));
        imageView4.setImageDrawable(c0176h.m542q(28));
        imageView5.setImageDrawable(c0176h.m542q(23));
        this.f1740E = c0176h.m542q(22);
        AbstractC0096d.m344e0(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f1741F = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1742G = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC0582a);
        imageView3.setOnClickListener(viewOnClickListenerC0582a);
        imageView2.setOnClickListener(viewOnClickListenerC0582a);
        imageView4.setOnClickListener(viewOnClickListenerC0582a);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0582a);
        searchAutoComplete.addTextChangedListener(c0966v0);
        searchAutoComplete.setOnEditorActionListener(c0974z0);
        searchAutoComplete.setOnItemClickListener(c0427u);
        searchAutoComplete.setOnItemSelectedListener(c0931d0);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0583b);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0970X0(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1745J = obtainStyledAttributes.getText(14);
        this.f1752Q = obtainStyledAttributes.getText(21);
        int i3 = obtainStyledAttributes.getInt(6, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = obtainStyledAttributes.getInt(5, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        c0176h.m523E();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1743H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1744I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1773x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0972Y0(0, this));
        }
        m1419y(this.f1748M);
        m1416v();
    }

    public void setOnCloseListener(InterfaceC0977a1 interfaceC0977a1) {
    }

    public void setOnQueryTextListener(InterfaceC0980b1 interfaceC0980b1) {
    }

    public void setOnSuggestionListener(InterfaceC0983c1 interfaceC0983c1) {
    }
}
