package p079f0;

import android.view.View;
import androidx.emoji2.text.AbstractC0593g;

/* renamed from: f0.q */
/* loaded from: classes.dex */
public final class C0853q {

    /* renamed from: a */
    public AbstractC0593g f3444a;

    /* renamed from: b */
    public int f3445b;

    /* renamed from: c */
    public int f3446c;

    /* renamed from: d */
    public boolean f3447d;

    /* renamed from: e */
    public boolean f3448e;

    public C0853q() {
        m2260d();
    }

    /* renamed from: a */
    public final void m2257a() {
        this.f3446c = this.f3447d ? this.f3444a.mo1516g() : this.f3444a.mo1520k();
    }

    /* renamed from: b */
    public final void m2258b(View view, int i2) {
        if (this.f3447d) {
            int mo1511b = this.f3444a.mo1511b(view);
            AbstractC0593g abstractC0593g = this.f3444a;
            this.f3446c = (Integer.MIN_VALUE == abstractC0593g.f1970a ? 0 : abstractC0593g.mo1521l() - abstractC0593g.f1970a) + mo1511b;
        } else {
            this.f3446c = this.f3444a.mo1514e(view);
        }
        this.f3445b = i2;
    }

    /* renamed from: c */
    public final void m2259c(View view, int i2) {
        AbstractC0593g abstractC0593g = this.f3444a;
        int mo1521l = Integer.MIN_VALUE == abstractC0593g.f1970a ? 0 : abstractC0593g.mo1521l() - abstractC0593g.f1970a;
        if (mo1521l >= 0) {
            m2258b(view, i2);
            return;
        }
        this.f3445b = i2;
        if (!this.f3447d) {
            int mo1514e = this.f3444a.mo1514e(view);
            int mo1520k = mo1514e - this.f3444a.mo1520k();
            this.f3446c = mo1514e;
            if (mo1520k > 0) {
                int mo1516g = (this.f3444a.mo1516g() - Math.min(0, (this.f3444a.mo1516g() - mo1521l) - this.f3444a.mo1511b(view))) - (this.f3444a.mo1512c(view) + mo1514e);
                if (mo1516g < 0) {
                    this.f3446c -= Math.min(mo1520k, -mo1516g);
                    return;
                }
                return;
            }
            return;
        }
        int mo1516g2 = (this.f3444a.mo1516g() - mo1521l) - this.f3444a.mo1511b(view);
        this.f3446c = this.f3444a.mo1516g() - mo1516g2;
        if (mo1516g2 > 0) {
            int mo1512c = this.f3446c - this.f3444a.mo1512c(view);
            int mo1520k2 = this.f3444a.mo1520k();
            int min = mo1512c - (Math.min(this.f3444a.mo1514e(view) - mo1520k2, 0) + mo1520k2);
            if (min < 0) {
                this.f3446c = Math.min(mo1516g2, -min) + this.f3446c;
            }
        }
    }

    /* renamed from: d */
    public final void m2260d() {
        this.f3445b = -1;
        this.f3446c = Integer.MIN_VALUE;
        this.f3447d = false;
        this.f3448e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3445b + ", mCoordinate=" + this.f3446c + ", mLayoutFromEnd=" + this.f3447d + ", mValid=" + this.f3448e + '}';
    }
}
