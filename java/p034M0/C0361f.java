package p034M0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p009D0.C0092a;

/* renamed from: M0.f */
/* loaded from: classes.dex */
public class C0361f extends Drawable.ConstantState {

    /* renamed from: a */
    public C0366k f914a;

    /* renamed from: b */
    public C0092a f915b;

    /* renamed from: c */
    public ColorStateList f916c;

    /* renamed from: d */
    public ColorStateList f917d;

    /* renamed from: e */
    public ColorStateList f918e;

    /* renamed from: f */
    public PorterDuff.Mode f919f;

    /* renamed from: g */
    public Rect f920g;

    /* renamed from: h */
    public final float f921h;

    /* renamed from: i */
    public float f922i;

    /* renamed from: j */
    public float f923j;

    /* renamed from: k */
    public int f924k;

    /* renamed from: l */
    public float f925l;

    /* renamed from: m */
    public float f926m;

    /* renamed from: n */
    public int f927n;

    /* renamed from: o */
    public int f928o;

    /* renamed from: p */
    public final Paint.Style f929p;

    public C0361f(C0366k c0366k) {
        this.f916c = null;
        this.f917d = null;
        this.f918e = null;
        this.f919f = PorterDuff.Mode.SRC_IN;
        this.f920g = null;
        this.f921h = 1.0f;
        this.f922i = 1.0f;
        this.f924k = 255;
        this.f925l = 0.0f;
        this.f926m = 0.0f;
        this.f927n = 0;
        this.f928o = 0;
        this.f929p = Paint.Style.FILL_AND_STROKE;
        this.f914a = c0366k;
        this.f915b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C0362g c0362g = new C0362g(this);
        c0362g.f935e = true;
        return c0362g;
    }

    public C0361f(C0361f c0361f) {
        this.f916c = null;
        this.f917d = null;
        this.f918e = null;
        this.f919f = PorterDuff.Mode.SRC_IN;
        this.f920g = null;
        this.f921h = 1.0f;
        this.f922i = 1.0f;
        this.f924k = 255;
        this.f925l = 0.0f;
        this.f926m = 0.0f;
        this.f927n = 0;
        this.f928o = 0;
        this.f929p = Paint.Style.FILL_AND_STROKE;
        this.f914a = c0361f.f914a;
        this.f915b = c0361f.f915b;
        this.f923j = c0361f.f923j;
        this.f916c = c0361f.f916c;
        this.f917d = c0361f.f917d;
        this.f919f = c0361f.f919f;
        this.f918e = c0361f.f918e;
        this.f924k = c0361f.f924k;
        this.f921h = c0361f.f921h;
        this.f928o = c0361f.f928o;
        this.f922i = c0361f.f922i;
        this.f925l = c0361f.f925l;
        this.f926m = c0361f.f926m;
        this.f927n = c0361f.f927n;
        this.f929p = c0361f.f929p;
        if (c0361f.f920g != null) {
            this.f920g = new Rect(c0361f.f920g);
        }
    }
}
