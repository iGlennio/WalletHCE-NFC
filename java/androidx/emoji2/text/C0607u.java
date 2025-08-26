package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p047Q1.AbstractC0458e;

/* renamed from: androidx.emoji2.text.u */
/* loaded from: classes.dex */
public final class C0607u extends SpannableStringBuilder {

    /* renamed from: a */
    public final Class f2017a;

    /* renamed from: b */
    public final ArrayList f2018b;

    public C0607u(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2018b = new ArrayList();
        AbstractC0458e.m1192j(cls, "watcherClass cannot be null");
        this.f2017a = cls;
    }

    /* renamed from: a */
    public final void m1549a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2018b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0606t) arrayList.get(i2)).f2016b.incrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: b */
    public final void m1550b() {
        m1553e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2018b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0606t) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
            i2++;
        }
    }

    /* renamed from: c */
    public final C0606t m1551c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2018b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C0606t c0606t = (C0606t) arrayList.get(i2);
            if (c0606t.f2015a == obj) {
                return c0606t;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public final boolean m1552d(Object obj) {
        if (obj != null) {
            return this.f2017a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    /* renamed from: e */
    public final void m1553e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2018b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0606t) arrayList.get(i2)).f2016b.decrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0606t m1551c;
        if (m1552d(obj) && (m1551c = m1551c(obj)) != null) {
            obj = m1551c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0606t m1551c;
        if (m1552d(obj) && (m1551c = m1551c(obj)) != null) {
            obj = m1551c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0606t m1551c;
        if (m1552d(obj) && (m1551c = m1551c(obj)) != null) {
            obj = m1551c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (this.f2017a != cls) {
            return super.getSpans(i2, i3, cls);
        }
        C0606t[] c0606tArr = (C0606t[]) super.getSpans(i2, i3, C0606t.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0606tArr.length);
        for (int i4 = 0; i4 < c0606tArr.length; i4++) {
            objArr[i4] = c0606tArr[i4].f2015a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        if (cls == null || this.f2017a == cls) {
            cls = C0606t.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0606t c0606t;
        if (m1552d(obj)) {
            c0606t = m1551c(obj);
            if (c0606t != null) {
                obj = c0606t;
            }
        } else {
            c0606t = null;
        }
        super.removeSpan(obj);
        if (c0606t != null) {
            this.f2018b.remove(c0606t);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence) {
        replace(i2, i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (m1552d(obj)) {
            C0606t c0606t = new C0606t(obj);
            this.f2018b.add(c0606t);
            obj = c0606t;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new C0607u(this.f2017a, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        replace(i2, i3, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        m1549a();
        super.replace(i2, i3, charSequence);
        m1553e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public C0607u(Class cls, C0607u c0607u, int i2, int i3) {
        super(c0607u, i2, i3);
        this.f2018b = new ArrayList();
        AbstractC0458e.m1192j(cls, "watcherClass cannot be null");
        this.f2017a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        m1549a();
        super.replace(i2, i3, charSequence, i4, i5);
        m1553e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
