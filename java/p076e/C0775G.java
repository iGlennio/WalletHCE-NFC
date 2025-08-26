package p076e;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.C0605s;
import java.lang.ref.WeakReference;
import p002B.C0019i;
import p083h.AbstractC0873a;
import p083h.C0881i;
import p086i.InterfaceC0905j;
import p086i.MenuC0907l;
import p088j.C1005k;

/* renamed from: e.G */
/* loaded from: classes.dex */
public final class C0775G extends AbstractC0873a implements InterfaceC0905j {

    /* renamed from: c */
    public final Context f3011c;

    /* renamed from: d */
    public final MenuC0907l f3012d;

    /* renamed from: e */
    public C0019i f3013e;

    /* renamed from: f */
    public WeakReference f3014f;

    /* renamed from: g */
    public final /* synthetic */ C0776H f3015g;

    public C0775G(C0776H c0776h, Context context, C0019i c0019i) {
        this.f3015g = c0776h;
        this.f3011c = context;
        this.f3013e = c0019i;
        MenuC0907l menuC0907l = new MenuC0907l(context);
        menuC0907l.f3674l = 1;
        this.f3012d = menuC0907l;
        menuC0907l.f3667e = this;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: a */
    public final void mo2064a() {
        C0776H c0776h = this.f3015g;
        if (c0776h.f3037v != this) {
            return;
        }
        if (c0776h.f3020C) {
            c0776h.f3038w = this;
            c0776h.f3039x = this.f3013e;
        } else {
            this.f3013e.m52C(this);
        }
        this.f3013e = null;
        c0776h.m2078o0(false);
        ActionBarContextView actionBarContextView = c0776h.f3034s;
        if (actionBarContextView.f1674k == null) {
            actionBarContextView.m1388e();
        }
        c0776h.f3031p.setHideOnContentScrollEnabled(c0776h.f3025H);
        c0776h.f3037v = null;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: b */
    public final View mo2065b() {
        WeakReference weakReference = this.f3014f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: c */
    public final MenuC0907l mo2066c() {
        return this.f3012d;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: d */
    public final MenuInflater mo2067d() {
        return new C0881i(this.f3011c);
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: e */
    public final void mo169e(MenuC0907l menuC0907l) {
        if (this.f3013e == null) {
            return;
        }
        mo2070h();
        C1005k c1005k = this.f3015g.f3034s.f1667d;
        if (c1005k != null) {
            c1005k.m2489o();
        }
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: f */
    public final CharSequence mo2068f() {
        return this.f3015g.f3034s.getSubtitle();
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: g */
    public final CharSequence mo2069g() {
        return this.f3015g.f3034s.getTitle();
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: h */
    public final void mo2070h() {
        if (this.f3015g.f3037v != this) {
            return;
        }
        MenuC0907l menuC0907l = this.f3012d;
        menuC0907l.m2350w();
        try {
            this.f3013e.m53D(this, menuC0907l);
        } finally {
            menuC0907l.m2349v();
        }
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: i */
    public final boolean mo2071i() {
        return this.f3015g.f3034s.f1682s;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: j */
    public final void mo2072j(View view) {
        this.f3015g.f3034s.setCustomView(view);
        this.f3014f = new WeakReference(view);
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: k */
    public final void mo2073k(int i2) {
        mo2074m(this.f3015g.f3029n.getResources().getString(i2));
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: l */
    public final boolean mo176l(MenuC0907l menuC0907l, MenuItem menuItem) {
        C0019i c0019i = this.f3013e;
        if (c0019i != null) {
            return ((C0605s) c0019i.f47b).m1544f(this, menuItem);
        }
        return false;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: m */
    public final void mo2074m(CharSequence charSequence) {
        this.f3015g.f3034s.setSubtitle(charSequence);
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: n */
    public final void mo2075n(int i2) {
        mo2076o(this.f3015g.f3029n.getResources().getString(i2));
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: o */
    public final void mo2076o(CharSequence charSequence) {
        this.f3015g.f3034s.setTitle(charSequence);
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: p */
    public final void mo2077p(boolean z2) {
        this.f3505b = z2;
        this.f3015g.f3034s.setTitleOptional(z2);
    }
}
