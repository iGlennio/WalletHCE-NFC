package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import p113s.C1203d;
import p113s.C1206g;
import p116t.C1216b;
import p121v.AbstractC1267q;
import p121v.AbstractC1269s;

/* loaded from: classes.dex */
public class Flow extends AbstractC1269s {

    /* renamed from: j */
    public final C1206g f1837j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4882a = new int[32];
        this.f4888g = new HashMap();
        this.f4884c = context;
        super.mo2930g(attributeSet);
        C1206g c1206g = new C1206g();
        c1206g.f4737s0 = 0;
        c1206g.f4738t0 = 0;
        c1206g.f4739u0 = 0;
        c1206g.f4740v0 = 0;
        c1206g.f4741w0 = 0;
        c1206g.f4742x0 = 0;
        c1206g.f4743y0 = false;
        c1206g.f4744z0 = 0;
        c1206g.f4709A0 = 0;
        c1206g.f4710B0 = new C1216b();
        c1206g.f4711C0 = null;
        c1206g.f4712D0 = -1;
        c1206g.f4713E0 = -1;
        c1206g.f4714F0 = -1;
        c1206g.f4715G0 = -1;
        c1206g.f4716H0 = -1;
        c1206g.f4717I0 = -1;
        c1206g.f4718J0 = 0.5f;
        c1206g.f4719K0 = 0.5f;
        c1206g.f4720L0 = 0.5f;
        c1206g.f4721M0 = 0.5f;
        c1206g.f4722N0 = 0.5f;
        c1206g.f4723O0 = 0.5f;
        c1206g.f4724P0 = 0;
        c1206g.f4725Q0 = 0;
        c1206g.f4726R0 = 2;
        c1206g.f4727S0 = 2;
        c1206g.f4728T0 = 0;
        c1206g.f4729U0 = -1;
        c1206g.f4730V0 = 0;
        c1206g.f4731W0 = new ArrayList();
        c1206g.f4732X0 = null;
        c1206g.f4733Y0 = null;
        c1206g.f4734Z0 = null;
        c1206g.f4736b1 = 0;
        this.f1837j = c1206g;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1267q.f5092b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f1837j.f4730V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1206g c1206g2 = this.f1837j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1206g2.f4737s0 = dimensionPixelSize;
                    c1206g2.f4738t0 = dimensionPixelSize;
                    c1206g2.f4739u0 = dimensionPixelSize;
                    c1206g2.f4740v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C1206g c1206g3 = this.f1837j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1206g3.f4739u0 = dimensionPixelSize2;
                    c1206g3.f4741w0 = dimensionPixelSize2;
                    c1206g3.f4742x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1837j.f4740v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1837j.f4741w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1837j.f4737s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1837j.f4742x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1837j.f4738t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1837j.f4728T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1837j.f4712D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1837j.f4713E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1837j.f4714F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1837j.f4716H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1837j.f4715G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1837j.f4717I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1837j.f4718J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1837j.f4720L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1837j.f4722N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1837j.f4721M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1837j.f4723O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1837j.f4719K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1837j.f4726R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1837j.f4727S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1837j.f4724P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1837j.f4725Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1837j.f4729U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f4885d = this.f1837j;
        m2931i();
    }

    @Override // p121v.AbstractC1253c
    /* renamed from: h */
    public final void mo1446h(C1203d c1203d, boolean z2) {
        C1206g c1206g = this.f1837j;
        int i2 = c1206g.f4739u0;
        if (i2 > 0 || c1206g.f4740v0 > 0) {
            if (z2) {
                c1206g.f4741w0 = c1206g.f4740v0;
                c1206g.f4742x0 = i2;
            } else {
                c1206g.f4741w0 = i2;
                c1206g.f4742x0 = c1206g.f4740v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06f1  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    @Override // p121v.AbstractC1269s
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1447j(p113s.C1206g r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.mo1447j(s.g, int, int):void");
    }

    @Override // p121v.AbstractC1253c, android.view.View
    public final void onMeasure(int i2, int i3) {
        mo1447j(this.f1837j, i2, i3);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1837j.f4720L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f1837j.f4714F0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1837j.f4721M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f1837j.f4715G0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f1837j.f4726R0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1837j.f4718J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f1837j.f4724P0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f1837j.f4712D0 = i2;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f1837j.f4722N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i2) {
        this.f1837j.f4716H0 = i2;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f1837j.f4723O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i2) {
        this.f1837j.f4717I0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f1837j.f4729U0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f1837j.f4730V0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        C1206g c1206g = this.f1837j;
        c1206g.f4737s0 = i2;
        c1206g.f4738t0 = i2;
        c1206g.f4739u0 = i2;
        c1206g.f4740v0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f1837j.f4738t0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f1837j.f4741w0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f1837j.f4742x0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f1837j.f4737s0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f1837j.f4727S0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1837j.f4719K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f1837j.f4725Q0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f1837j.f4713E0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f1837j.f4728T0 = i2;
        requestLayout();
    }
}
