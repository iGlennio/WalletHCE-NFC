package p025J0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p002B.AbstractC0027q;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p047Q1.AbstractC0458e;
import p108q0.AbstractC1183a;

/* renamed from: J0.d */
/* loaded from: classes.dex */
public final class C0231d {

    /* renamed from: a */
    public final ColorStateList f680a;

    /* renamed from: b */
    public final String f681b;

    /* renamed from: c */
    public final int f682c;

    /* renamed from: d */
    public final int f683d;

    /* renamed from: e */
    public final float f684e;

    /* renamed from: f */
    public final float f685f;

    /* renamed from: g */
    public final float f686g;

    /* renamed from: h */
    public final boolean f687h;

    /* renamed from: i */
    public final float f688i;

    /* renamed from: j */
    public final ColorStateList f689j;

    /* renamed from: k */
    public float f690k;

    /* renamed from: l */
    public final int f691l;

    /* renamed from: m */
    public boolean f692m = false;

    /* renamed from: n */
    public Typeface f693n;

    public C0231d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC1183a.f4518B);
        this.f690k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f689j = AbstractC0104l.m413t(context, obtainStyledAttributes, 3);
        AbstractC0104l.m413t(context, obtainStyledAttributes, 4);
        AbstractC0104l.m413t(context, obtainStyledAttributes, 5);
        this.f682c = obtainStyledAttributes.getInt(2, 0);
        this.f683d = obtainStyledAttributes.getInt(1, 1);
        int i3 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f691l = obtainStyledAttributes.getResourceId(i3, 0);
        this.f681b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.f680a = AbstractC0104l.m413t(context, obtainStyledAttributes, 6);
        this.f684e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f685f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f686g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, AbstractC1183a.f4538q);
        this.f687h = obtainStyledAttributes2.hasValue(0);
        this.f688i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m633a() {
        String str;
        Typeface typeface = this.f693n;
        int i2 = this.f682c;
        if (typeface == null && (str = this.f681b) != null) {
            this.f693n = Typeface.create(str, i2);
        }
        if (this.f693n == null) {
            int i3 = this.f683d;
            if (i3 == 1) {
                this.f693n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f693n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f693n = Typeface.DEFAULT;
            } else {
                this.f693n = Typeface.MONOSPACE;
            }
            this.f693n = Typeface.create(this.f693n, i2);
        }
    }

    /* renamed from: b */
    public final Typeface m634b(Context context) {
        if (this.f692m) {
            return this.f693n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m89a = AbstractC0027q.m89a(context, this.f691l);
                this.f693n = m89a;
                if (m89a != null) {
                    this.f693n = Typeface.create(m89a, this.f682c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f681b, e2);
            }
        }
        m633a();
        this.f692m = true;
        return this.f693n;
    }

    /* renamed from: c */
    public final void m635c(Context context, AbstractC0458e abstractC0458e) {
        if (m636d(context)) {
            m634b(context);
        } else {
            m633a();
        }
        int i2 = this.f691l;
        if (i2 == 0) {
            this.f692m = true;
        }
        if (this.f692m) {
            abstractC0458e.mo449M(this.f693n, true);
            return;
        }
        try {
            C0229b c0229b = new C0229b(this, abstractC0458e);
            ThreadLocal threadLocal = AbstractC0027q.f60a;
            if (context.isRestricted()) {
                c0229b.m42a(-4);
            } else {
                AbstractC0027q.m90b(context, i2, new TypedValue(), 0, c0229b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f692m = true;
            abstractC0458e.mo448L(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f681b, e2);
            this.f692m = true;
            abstractC0458e.mo448L(-3);
        }
    }

    /* renamed from: d */
    public final boolean m636d(Context context) {
        Typeface typeface = null;
        int i2 = this.f691l;
        if (i2 != 0) {
            ThreadLocal threadLocal = AbstractC0027q.f60a;
            if (!context.isRestricted()) {
                typeface = AbstractC0027q.m90b(context, i2, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    /* renamed from: e */
    public final void m637e(Context context, TextPaint textPaint, AbstractC0458e abstractC0458e) {
        m638f(context, textPaint, abstractC0458e);
        ColorStateList colorStateList = this.f689j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f680a;
        textPaint.setShadowLayer(this.f686g, this.f684e, this.f685f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void m638f(Context context, TextPaint textPaint, AbstractC0458e abstractC0458e) {
        if (m636d(context)) {
            m639g(context, textPaint, m634b(context));
            return;
        }
        m633a();
        m639g(context, textPaint, this.f693n);
        m635c(context, new C0230c(this, context, textPaint, abstractC0458e));
    }

    /* renamed from: g */
    public final void m639g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface m330R = AbstractC0096d.m330R(context.getResources().getConfiguration(), typeface);
        if (m330R != null) {
            typeface = m330R;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f682c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f690k);
        if (this.f687h) {
            textPaint.setLetterSpacing(this.f688i);
        }
    }
}
