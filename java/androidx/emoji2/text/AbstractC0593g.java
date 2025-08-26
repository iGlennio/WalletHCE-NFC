package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import p079f0.AbstractC0812H;
import p079f0.C0858v;

/* renamed from: androidx.emoji2.text.g */
/* loaded from: classes.dex */
public abstract class AbstractC0593g {

    /* renamed from: a */
    public int f1970a;

    /* renamed from: b */
    public final Object f1971b;

    /* renamed from: c */
    public final Object f1972c;

    public AbstractC0593g(AbstractC0812H abstractC0812H) {
        this.f1970a = Integer.MIN_VALUE;
        this.f1972c = new Rect();
        this.f1971b = abstractC0812H;
    }

    /* renamed from: a */
    public static AbstractC0593g m1510a(AbstractC0812H abstractC0812H, int i2) {
        if (i2 == 0) {
            return new C0858v(abstractC0812H, 0);
        }
        if (i2 == 1) {
            return new C0858v(abstractC0812H, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo1511b(View view);

    /* renamed from: c */
    public abstract int mo1512c(View view);

    /* renamed from: d */
    public abstract int mo1513d(View view);

    /* renamed from: e */
    public abstract int mo1514e(View view);

    /* renamed from: f */
    public abstract int mo1515f();

    /* renamed from: g */
    public abstract int mo1516g();

    /* renamed from: h */
    public abstract int mo1517h();

    /* renamed from: i */
    public abstract int mo1518i();

    /* renamed from: j */
    public abstract int mo1519j();

    /* renamed from: k */
    public abstract int mo1520k();

    /* renamed from: l */
    public abstract int mo1521l();

    /* renamed from: m */
    public abstract int mo1522m(View view);

    /* renamed from: n */
    public abstract int mo1523n(View view);

    /* renamed from: o */
    public abstract void mo1524o(int i2);

    public AbstractC0593g(InterfaceC0595i interfaceC0595i) {
        this.f1970a = 0;
        this.f1972c = new C0590d();
        this.f1971b = interfaceC0595i;
    }
}
