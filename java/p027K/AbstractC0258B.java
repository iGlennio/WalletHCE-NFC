package p027K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p034M0.C0360e;

/* renamed from: K.B */
/* loaded from: classes.dex */
public abstract class AbstractC0258B {

    /* renamed from: a */
    public int f756a;

    /* renamed from: b */
    public int f757b;

    /* renamed from: c */
    public int f758c;

    /* renamed from: d */
    public Object f759d;

    public AbstractC0258B() {
        if (C0360e.f911b == null) {
            C0360e.f911b = new C0360e(21);
        }
    }

    /* renamed from: a */
    public int m732a(int i2) {
        if (i2 < this.f758c) {
            return ((ByteBuffer) this.f759d).getShort(this.f757b + i2);
        }
        return 0;
    }

    /* renamed from: b */
    public abstract Object mo733b(View view);

    /* renamed from: c */
    public abstract void mo734c(View view, Object obj);

    /* renamed from: d */
    public void m735d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f757b) {
            mo734c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f757b) {
            tag = mo733b(view);
        } else {
            tag = view.getTag(this.f756a);
            if (!((Class) this.f759d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo736e(tag, obj)) {
            View.AccessibilityDelegate m814d = AbstractC0272P.m814d(view);
            C0284b c0284b = m814d == null ? null : m814d instanceof C0282a ? ((C0282a) m814d).f781a : new C0284b(m814d);
            if (c0284b == null) {
                c0284b = new C0284b();
            }
            AbstractC0272P.m823m(view, c0284b);
            view.setTag(this.f756a, obj);
            AbstractC0272P.m818h(view, this.f758c);
        }
    }

    /* renamed from: e */
    public abstract boolean mo736e(Object obj, Object obj2);
}
