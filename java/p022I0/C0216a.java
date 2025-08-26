package p022I0;

import android.R;
import android.content.res.ColorStateList;
import p045Q.AbstractC0435b;
import p047Q1.AbstractC0458e;
import p088j.C0930D;

/* renamed from: I0.a */
/* loaded from: classes.dex */
public final class C0216a extends C0930D {

    /* renamed from: g */
    public static final int[][] f600g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f601e;

    /* renamed from: f */
    public boolean f602f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f601e == null) {
            int m1208z = AbstractC0458e.m1208z(this, com.nfupay.s145.R.attr.colorControlActivated);
            int m1208z2 = AbstractC0458e.m1208z(this, com.nfupay.s145.R.attr.colorOnSurface);
            int m1208z3 = AbstractC0458e.m1208z(this, com.nfupay.s145.R.attr.colorSurface);
            this.f601e = new ColorStateList(f600g, new int[]{AbstractC0458e.m1174H(m1208z3, m1208z, 1.0f), AbstractC0458e.m1174H(m1208z3, m1208z2, 0.54f), AbstractC0458e.m1174H(m1208z3, m1208z2, 0.38f), AbstractC0458e.m1174H(m1208z3, m1208z2, 0.38f)});
        }
        return this.f601e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f602f && AbstractC0435b.m1125a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f602f = z2;
        if (z2) {
            AbstractC0435b.m1127c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0435b.m1127c(this, null);
        }
    }
}
