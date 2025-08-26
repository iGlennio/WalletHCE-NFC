package p088j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p017G0.C0176h;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p073d.AbstractC0734a;

/* renamed from: j.p */
/* loaded from: classes.dex */
public final class C1020p {

    /* renamed from: a */
    public final View f4018a;

    /* renamed from: d */
    public C1004j1 f4021d;

    /* renamed from: e */
    public C1004j1 f4022e;

    /* renamed from: f */
    public C1004j1 f4023f;

    /* renamed from: c */
    public int f4020c = -1;

    /* renamed from: b */
    public final C1035u f4019b = C1035u.m2527a();

    public C1020p(View view) {
        this.f4018a = view;
    }

    /* renamed from: a */
    public final void m2506a() {
        View view = this.f4018a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f4021d != null) {
                if (this.f4023f == null) {
                    this.f4023f = new C1004j1();
                }
                C1004j1 c1004j1 = this.f4023f;
                c1004j1.f3959c = null;
                c1004j1.f3958b = false;
                c1004j1.f3960d = null;
                c1004j1.f3957a = false;
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                ColorStateList m746g = AbstractC0261E.m746g(view);
                if (m746g != null) {
                    c1004j1.f3958b = true;
                    c1004j1.f3959c = m746g;
                }
                PorterDuff.Mode m747h = AbstractC0261E.m747h(view);
                if (m747h != null) {
                    c1004j1.f3957a = true;
                    c1004j1.f3960d = m747h;
                }
                if (c1004j1.f3958b || c1004j1.f3957a) {
                    C1035u.m2530e(background, c1004j1, view.getDrawableState());
                    return;
                }
            }
            C1004j1 c1004j12 = this.f4022e;
            if (c1004j12 != null) {
                C1035u.m2530e(background, c1004j12, view.getDrawableState());
                return;
            }
            C1004j1 c1004j13 = this.f4021d;
            if (c1004j13 != null) {
                C1035u.m2530e(background, c1004j13, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final ColorStateList m2507b() {
        C1004j1 c1004j1 = this.f4022e;
        if (c1004j1 != null) {
            return (ColorStateList) c1004j1.f3959c;
        }
        return null;
    }

    /* renamed from: c */
    public final PorterDuff.Mode m2508c() {
        C1004j1 c1004j1 = this.f4022e;
        if (c1004j1 != null) {
            return (PorterDuff.Mode) c1004j1.f3960d;
        }
        return null;
    }

    /* renamed from: d */
    public final void m2509d(AttributeSet attributeSet, int i2) {
        ColorStateList m2430f;
        View view = this.f4018a;
        Context context = view.getContext();
        int[] iArr = AbstractC0734a.f2936z;
        C0176h m519B = C0176h.m519B(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) m519B.f516c;
        View view2 = this.f4018a;
        AbstractC0272P.m822l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) m519B.f516c, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f4020c = typedArray.getResourceId(0, -1);
                C1035u c1035u = this.f4019b;
                Context context2 = view.getContext();
                int i3 = this.f4020c;
                synchronized (c1035u) {
                    m2430f = c1035u.f4071a.m2430f(context2, i3);
                }
                if (m2430f != null) {
                    m2512g(m2430f);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0261E.m756q(view, m519B.m541p(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0261E.m757r(view, AbstractC1027r0.m2516b(typedArray.getInt(2, -1), null));
            }
            m519B.m523E();
        } catch (Throwable th) {
            m519B.m523E();
            throw th;
        }
    }

    /* renamed from: e */
    public final void m2510e() {
        this.f4020c = -1;
        m2512g(null);
        m2506a();
    }

    /* renamed from: f */
    public final void m2511f(int i2) {
        ColorStateList colorStateList;
        this.f4020c = i2;
        C1035u c1035u = this.f4019b;
        if (c1035u != null) {
            Context context = this.f4018a.getContext();
            synchronized (c1035u) {
                colorStateList = c1035u.f4071a.m2430f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        m2512g(colorStateList);
        m2506a();
    }

    /* renamed from: g */
    public final void m2512g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f4021d == null) {
                this.f4021d = new C1004j1();
            }
            C1004j1 c1004j1 = this.f4021d;
            c1004j1.f3959c = colorStateList;
            c1004j1.f3958b = true;
        } else {
            this.f4021d = null;
        }
        m2506a();
    }

    /* renamed from: h */
    public final void m2513h(ColorStateList colorStateList) {
        if (this.f4022e == null) {
            this.f4022e = new C1004j1();
        }
        C1004j1 c1004j1 = this.f4022e;
        c1004j1.f3959c = colorStateList;
        c1004j1.f3958b = true;
        m2506a();
    }

    /* renamed from: i */
    public final void m2514i(PorterDuff.Mode mode) {
        if (this.f4022e == null) {
            this.f4022e = new C1004j1();
        }
        C1004j1 c1004j1 = this.f4022e;
        c1004j1.f3960d = mode;
        c1004j1.f3957a = true;
        m2506a();
    }
}
