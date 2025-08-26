package p121v;

import p113s.C1200a;
import p113s.C1203d;

/* renamed from: v.a */
/* loaded from: classes.dex */
public final class C1251a extends AbstractC1253c {

    /* renamed from: h */
    public int f4872h;

    /* renamed from: i */
    public int f4873i;

    /* renamed from: j */
    public C1200a f4874j;

    public boolean getAllowsGoneWidget() {
        return this.f4874j.f4572t0;
    }

    public int getMargin() {
        return this.f4874j.f4573u0;
    }

    public int getType() {
        return this.f4872h;
    }

    @Override // p121v.AbstractC1253c
    /* renamed from: h */
    public final void mo1446h(C1203d c1203d, boolean z2) {
        int i2 = this.f4872h;
        this.f4873i = i2;
        if (z2) {
            if (i2 == 5) {
                this.f4873i = 1;
            } else if (i2 == 6) {
                this.f4873i = 0;
            }
        } else if (i2 == 5) {
            this.f4873i = 0;
        } else if (i2 == 6) {
            this.f4873i = 1;
        }
        if (c1203d instanceof C1200a) {
            ((C1200a) c1203d).f4571s0 = this.f4873i;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f4874j.f4572t0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f4874j.f4573u0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f4874j.f4573u0 = i2;
    }

    public void setType(int i2) {
        this.f4872h = i2;
    }
}
