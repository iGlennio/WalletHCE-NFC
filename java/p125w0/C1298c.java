package p125w0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p008D.AbstractC0087a;
import p027K.AbstractC0272P;
import p028K0.AbstractC0331a;
import p034M0.C0361f;
import p034M0.C0362g;
import p034M0.C0366k;
import p034M0.InterfaceC0377v;
import p047Q1.AbstractC0458e;

/* renamed from: w0.c */
/* loaded from: classes.dex */
public final class C1298c {

    /* renamed from: a */
    public final MaterialButton f5309a;

    /* renamed from: b */
    public C0366k f5310b;

    /* renamed from: c */
    public int f5311c;

    /* renamed from: d */
    public int f5312d;

    /* renamed from: e */
    public int f5313e;

    /* renamed from: f */
    public int f5314f;

    /* renamed from: g */
    public int f5315g;

    /* renamed from: h */
    public int f5316h;

    /* renamed from: i */
    public PorterDuff.Mode f5317i;

    /* renamed from: j */
    public ColorStateList f5318j;

    /* renamed from: k */
    public ColorStateList f5319k;

    /* renamed from: l */
    public ColorStateList f5320l;

    /* renamed from: m */
    public C0362g f5321m;

    /* renamed from: q */
    public boolean f5325q;

    /* renamed from: s */
    public RippleDrawable f5327s;

    /* renamed from: t */
    public int f5328t;

    /* renamed from: n */
    public boolean f5322n = false;

    /* renamed from: o */
    public boolean f5323o = false;

    /* renamed from: p */
    public boolean f5324p = false;

    /* renamed from: r */
    public boolean f5326r = true;

    public C1298c(MaterialButton materialButton, C0366k c0366k) {
        this.f5309a = materialButton;
        this.f5310b = c0366k;
    }

    /* renamed from: a */
    public final InterfaceC0377v m2985a() {
        RippleDrawable rippleDrawable = this.f5327s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f5327s.getNumberOfLayers() > 2 ? (InterfaceC0377v) this.f5327s.getDrawable(2) : (InterfaceC0377v) this.f5327s.getDrawable(1);
    }

    /* renamed from: b */
    public final C0362g m2986b(boolean z2) {
        RippleDrawable rippleDrawable = this.f5327s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0362g) ((LayerDrawable) ((InsetDrawable) this.f5327s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    /* renamed from: c */
    public final void m2987c(C0366k c0366k) {
        this.f5310b = c0366k;
        if (m2986b(false) != null) {
            m2986b(false).setShapeAppearanceModel(c0366k);
        }
        if (m2986b(true) != null) {
            m2986b(true).setShapeAppearanceModel(c0366k);
        }
        if (m2985a() != null) {
            m2985a().setShapeAppearanceModel(c0366k);
        }
    }

    /* renamed from: d */
    public final void m2988d(int i2, int i3) {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        MaterialButton materialButton = this.f5309a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.f5313e;
        int i5 = this.f5314f;
        this.f5314f = i3;
        this.f5313e = i2;
        if (!this.f5323o) {
            m2989e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    /* renamed from: e */
    public final void m2989e() {
        C0362g c0362g = new C0362g(this.f5310b);
        MaterialButton materialButton = this.f5309a;
        c0362g.m1025h(materialButton.getContext());
        AbstractC0087a.m305h(c0362g, this.f5318j);
        PorterDuff.Mode mode = this.f5317i;
        if (mode != null) {
            AbstractC0087a.m306i(c0362g, mode);
        }
        float f = this.f5316h;
        ColorStateList colorStateList = this.f5319k;
        c0362g.f931a.f923j = f;
        c0362g.invalidateSelf();
        C0361f c0361f = c0362g.f931a;
        if (c0361f.f917d != colorStateList) {
            c0361f.f917d = colorStateList;
            c0362g.onStateChange(c0362g.getState());
        }
        C0362g c0362g2 = new C0362g(this.f5310b);
        c0362g2.setTint(0);
        float f2 = this.f5316h;
        int m1208z = this.f5322n ? AbstractC0458e.m1208z(materialButton, R.attr.colorSurface) : 0;
        c0362g2.f931a.f923j = f2;
        c0362g2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(m1208z);
        C0361f c0361f2 = c0362g2.f931a;
        if (c0361f2.f917d != valueOf) {
            c0361f2.f917d = valueOf;
            c0362g2.onStateChange(c0362g2.getState());
        }
        C0362g c0362g3 = new C0362g(this.f5310b);
        this.f5321m = c0362g3;
        AbstractC0087a.m304g(c0362g3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0331a.m952a(this.f5320l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0362g2, c0362g}), this.f5311c, this.f5313e, this.f5312d, this.f5314f), this.f5321m);
        this.f5327s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C0362g m2986b = m2986b(false);
        if (m2986b != null) {
            m2986b.m1026i(this.f5328t);
            m2986b.setState(materialButton.getDrawableState());
        }
    }

    /* renamed from: f */
    public final void m2990f() {
        C0362g m2986b = m2986b(false);
        C0362g m2986b2 = m2986b(true);
        if (m2986b != null) {
            float f = this.f5316h;
            ColorStateList colorStateList = this.f5319k;
            m2986b.f931a.f923j = f;
            m2986b.invalidateSelf();
            C0361f c0361f = m2986b.f931a;
            if (c0361f.f917d != colorStateList) {
                c0361f.f917d = colorStateList;
                m2986b.onStateChange(m2986b.getState());
            }
            if (m2986b2 != null) {
                float f2 = this.f5316h;
                int m1208z = this.f5322n ? AbstractC0458e.m1208z(this.f5309a, R.attr.colorSurface) : 0;
                m2986b2.f931a.f923j = f2;
                m2986b2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(m1208z);
                C0361f c0361f2 = m2986b2.f931a;
                if (c0361f2.f917d != valueOf) {
                    c0361f2.f917d = valueOf;
                    m2986b2.onStateChange(m2986b2.getState());
                }
            }
        }
    }
}
