package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p034M0.C0360e;

/* renamed from: androidx.emoji2.text.x */
/* loaded from: classes.dex */
public final class C0610x implements Spannable {

    /* renamed from: a */
    public boolean f2022a = false;

    /* renamed from: b */
    public Spannable f2023b;

    public C0610x(Spannable spannable) {
        this.f2023b = spannable;
    }

    /* renamed from: a */
    public final void m1554a() {
        Spannable spannable = this.f2023b;
        if (!this.f2022a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0360e(28) : new C0609w(28)).mo1017l(spannable)) {
                this.f2023b = new SpannableString(spannable);
            }
        }
        this.f2022a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f2023b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f2023b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f2023b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f2023b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f2023b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f2023b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f2023b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2023b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f2023b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m1554a();
        this.f2023b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        m1554a();
        this.f2023b.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f2023b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2023b.toString();
    }

    public C0610x(CharSequence charSequence) {
        this.f2023b = new SpannableString(charSequence);
    }
}
