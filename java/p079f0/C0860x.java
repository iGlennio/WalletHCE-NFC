package p079f0;

import android.view.View;
import androidx.emoji2.text.AbstractC0593g;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.x */
/* loaded from: classes.dex */
public final class C0860x extends AbstractC0814J {

    /* renamed from: a */
    public RecyclerView f3487a;

    /* renamed from: b */
    public final C0829Z f3488b = new C0829Z(this);

    /* renamed from: c */
    public C0858v f3489c;

    /* renamed from: d */
    public C0858v f3490d;

    /* renamed from: b */
    public static int m2271b(View view, AbstractC0593g abstractC0593g) {
        return ((abstractC0593g.mo1512c(view) / 2) + abstractC0593g.mo1514e(view)) - ((abstractC0593g.mo1521l() / 2) + abstractC0593g.mo1520k());
    }

    /* renamed from: c */
    public static View m2272c(AbstractC0812H abstractC0812H, AbstractC0593g abstractC0593g) {
        int m2194v = abstractC0812H.m2194v();
        View view = null;
        if (m2194v == 0) {
            return null;
        }
        int mo1521l = (abstractC0593g.mo1521l() / 2) + abstractC0593g.mo1520k();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < m2194v; i3++) {
            View m2192u = abstractC0812H.m2192u(i3);
            int abs = Math.abs(((abstractC0593g.mo1512c(m2192u) / 2) + abstractC0593g.mo1514e(m2192u)) - mo1521l);
            if (abs < i2) {
                view = m2192u;
                i2 = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    public final int[] m2273a(AbstractC0812H abstractC0812H, View view) {
        int[] iArr = new int[2];
        if (abstractC0812H.mo1782d()) {
            iArr[0] = m2271b(view, m2274d(abstractC0812H));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0812H.mo1785e()) {
            iArr[1] = m2271b(view, m2275e(abstractC0812H));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* renamed from: d */
    public final AbstractC0593g m2274d(AbstractC0812H abstractC0812H) {
        C0858v c0858v = this.f3490d;
        if (c0858v == null || ((AbstractC0812H) c0858v.f1971b) != abstractC0812H) {
            this.f3490d = new C0858v(abstractC0812H, 0);
        }
        return this.f3490d;
    }

    /* renamed from: e */
    public final AbstractC0593g m2275e(AbstractC0812H abstractC0812H) {
        C0858v c0858v = this.f3489c;
        if (c0858v == null || ((AbstractC0812H) c0858v.f1971b) != abstractC0812H) {
            this.f3489c = new C0858v(abstractC0812H, 1);
        }
        return this.f3489c;
    }

    /* renamed from: f */
    public final void m2276f() {
        AbstractC0812H layoutManager;
        RecyclerView recyclerView = this.f3487a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View m2272c = layoutManager.mo1785e() ? m2272c(layoutManager, m2275e(layoutManager)) : layoutManager.mo1782d() ? m2272c(layoutManager, m2274d(layoutManager)) : null;
        if (m2272c == null) {
            return;
        }
        int[] m2273a = m2273a(layoutManager, m2272c);
        int i2 = m2273a[0];
        if (i2 == 0 && m2273a[1] == 0) {
            return;
        }
        this.f3487a.m1826a0(i2, m2273a[1], false);
    }
}
