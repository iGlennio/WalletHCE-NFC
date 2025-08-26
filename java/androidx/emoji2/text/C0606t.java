package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.t */
/* loaded from: classes.dex */
public final class C0606t implements TextWatcher, SpanWatcher {

    /* renamed from: a */
    public final Object f2015a;

    /* renamed from: b */
    public final AtomicInteger f2016b = new AtomicInteger(0);

    public C0606t(Object obj) {
        this.f2015a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f2015a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        ((TextWatcher) this.f2015a).beforeTextChanged(charSequence, i2, i3, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
        if (this.f2016b.get() <= 0 || !(obj instanceof C0608v)) {
            ((SpanWatcher) this.f2015a).onSpanAdded(spannable, obj, i2, i3);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (this.f2016b.get() <= 0 || !(obj instanceof C0608v)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i2 > i3) {
                    i2 = 0;
                }
                if (i4 > i5) {
                    i6 = i2;
                    i7 = 0;
                    ((SpanWatcher) this.f2015a).onSpanChanged(spannable, obj, i6, i3, i7, i5);
                }
            }
            i6 = i2;
            i7 = i4;
            ((SpanWatcher) this.f2015a).onSpanChanged(spannable, obj, i6, i3, i7, i5);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
        if (this.f2016b.get() <= 0 || !(obj instanceof C0608v)) {
            ((SpanWatcher) this.f2015a).onSpanRemoved(spannable, obj, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        ((TextWatcher) this.f2015a).onTextChanged(charSequence, i2, i3, i4);
    }
}
