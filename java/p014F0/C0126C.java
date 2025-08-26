package p014F0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p025J0.C0231d;
import p134z0.C1332d;

/* renamed from: F0.C */
/* loaded from: classes.dex */
public final class C0126C {

    /* renamed from: c */
    public float f345c;

    /* renamed from: e */
    public final WeakReference f347e;

    /* renamed from: f */
    public C0231d f348f;

    /* renamed from: a */
    public final TextPaint f343a = new TextPaint(1);

    /* renamed from: b */
    public final C0124A f344b = new C0124A(0, this);

    /* renamed from: d */
    public boolean f346d = true;

    public C0126C(C1332d c1332d) {
        this.f347e = new WeakReference(null);
        this.f347e = new WeakReference(c1332d);
    }

    /* renamed from: a */
    public final float m450a(String str) {
        if (!this.f346d) {
            return this.f345c;
        }
        TextPaint textPaint = this.f343a;
        this.f345c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f346d = false;
        return this.f345c;
    }
}
