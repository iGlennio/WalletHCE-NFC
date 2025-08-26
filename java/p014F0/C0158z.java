package p014F0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: F0.z */
/* loaded from: classes.dex */
public final class C0158z {

    /* renamed from: a */
    public CharSequence f480a;

    /* renamed from: b */
    public final TextPaint f481b;

    /* renamed from: c */
    public final int f482c;

    /* renamed from: d */
    public int f483d;

    /* renamed from: j */
    public boolean f489j;

    /* renamed from: e */
    public Layout.Alignment f484e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f485f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f486g = 1.0f;

    /* renamed from: h */
    public int f487h = 1;

    /* renamed from: i */
    public boolean f488i = true;

    /* renamed from: k */
    public TextUtils.TruncateAt f490k = null;

    public C0158z(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f480a = charSequence;
        this.f481b = textPaint;
        this.f482c = i2;
        this.f483d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout m493a() {
        if (this.f480a == null) {
            this.f480a = "";
        }
        int max = Math.max(0, this.f482c);
        CharSequence charSequence = this.f480a;
        int i2 = this.f485f;
        TextPaint textPaint = this.f481b;
        if (i2 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f490k);
        }
        int min = Math.min(charSequence.length(), this.f483d);
        this.f483d = min;
        if (this.f489j && this.f485f == 1) {
            this.f484e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f484e);
        obtain.setIncludePad(this.f488i);
        obtain.setTextDirection(this.f489j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f490k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f485f);
        float f = this.f486g;
        if (f != 1.0f) {
            obtain.setLineSpacing(0.0f, f);
        }
        if (this.f485f > 1) {
            obtain.setHyphenationFrequency(this.f487h);
        }
        return obtain.build();
    }
}
