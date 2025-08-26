package p034M0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p010D1.AbstractC0104l;
import p047Q1.AbstractC0458e;
import p108q0.AbstractC1183a;

/* renamed from: M0.k */
/* loaded from: classes.dex */
public final class C0366k {

    /* renamed from: a */
    public AbstractC0104l f966a = new C0364i();

    /* renamed from: b */
    public AbstractC0104l f967b = new C0364i();

    /* renamed from: c */
    public AbstractC0104l f968c = new C0364i();

    /* renamed from: d */
    public AbstractC0104l f969d = new C0364i();

    /* renamed from: e */
    public InterfaceC0358c f970e = new C0356a(0.0f);

    /* renamed from: f */
    public InterfaceC0358c f971f = new C0356a(0.0f);

    /* renamed from: g */
    public InterfaceC0358c f972g = new C0356a(0.0f);

    /* renamed from: h */
    public InterfaceC0358c f973h = new C0356a(0.0f);

    /* renamed from: i */
    public C0360e f974i = new C0360e(0);

    /* renamed from: j */
    public C0360e f975j = new C0360e(0);

    /* renamed from: k */
    public C0360e f976k = new C0360e(0);

    /* renamed from: l */
    public C0360e f977l = new C0360e(0);

    /* renamed from: a */
    public static C0365j m1033a(Context context, int i2, int i3, C0356a c0356a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC1183a.f4545x);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            InterfaceC0358c m1035c = m1035c(obtainStyledAttributes, 5, c0356a);
            InterfaceC0358c m1035c2 = m1035c(obtainStyledAttributes, 8, m1035c);
            InterfaceC0358c m1035c3 = m1035c(obtainStyledAttributes, 9, m1035c);
            InterfaceC0358c m1035c4 = m1035c(obtainStyledAttributes, 7, m1035c);
            InterfaceC0358c m1035c5 = m1035c(obtainStyledAttributes, 6, m1035c);
            C0365j c0365j = new C0365j();
            AbstractC0104l m1198p = AbstractC0458e.m1198p(i5);
            c0365j.f954a = m1198p;
            C0365j.m1031b(m1198p);
            c0365j.f958e = m1035c2;
            AbstractC0104l m1198p2 = AbstractC0458e.m1198p(i6);
            c0365j.f955b = m1198p2;
            C0365j.m1031b(m1198p2);
            c0365j.f959f = m1035c3;
            AbstractC0104l m1198p3 = AbstractC0458e.m1198p(i7);
            c0365j.f956c = m1198p3;
            C0365j.m1031b(m1198p3);
            c0365j.f960g = m1035c4;
            AbstractC0104l m1198p4 = AbstractC0458e.m1198p(i8);
            c0365j.f957d = m1198p4;
            C0365j.m1031b(m1198p4);
            c0365j.f961h = m1035c5;
            return c0365j;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C0365j m1034b(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0356a c0356a = new C0356a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1183a.f4537p, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m1033a(context, resourceId, resourceId2, c0356a);
    }

    /* renamed from: c */
    public static InterfaceC0358c m1035c(TypedArray typedArray, int i2, InterfaceC0358c interfaceC0358c) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                return new C0356a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new C0363h(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0358c;
    }

    /* renamed from: d */
    public final boolean m1036d(RectF rectF) {
        boolean z2 = this.f977l.getClass().equals(C0360e.class) && this.f975j.getClass().equals(C0360e.class) && this.f974i.getClass().equals(C0360e.class) && this.f976k.getClass().equals(C0360e.class);
        float mo1004a = this.f970e.mo1004a(rectF);
        return z2 && ((this.f971f.mo1004a(rectF) > mo1004a ? 1 : (this.f971f.mo1004a(rectF) == mo1004a ? 0 : -1)) == 0 && (this.f973h.mo1004a(rectF) > mo1004a ? 1 : (this.f973h.mo1004a(rectF) == mo1004a ? 0 : -1)) == 0 && (this.f972g.mo1004a(rectF) > mo1004a ? 1 : (this.f972g.mo1004a(rectF) == mo1004a ? 0 : -1)) == 0) && ((this.f967b instanceof C0364i) && (this.f966a instanceof C0364i) && (this.f968c instanceof C0364i) && (this.f969d instanceof C0364i));
    }

    /* renamed from: e */
    public final C0365j m1037e() {
        C0365j c0365j = new C0365j();
        c0365j.f954a = this.f966a;
        c0365j.f955b = this.f967b;
        c0365j.f956c = this.f968c;
        c0365j.f957d = this.f969d;
        c0365j.f958e = this.f970e;
        c0365j.f959f = this.f971f;
        c0365j.f960g = this.f972g;
        c0365j.f961h = this.f973h;
        c0365j.f962i = this.f974i;
        c0365j.f963j = this.f975j;
        c0365j.f964k = this.f976k;
        c0365j.f965l = this.f977l;
        return c0365j;
    }
}
