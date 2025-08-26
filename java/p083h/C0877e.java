package p083h;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.C0605s;
import java.lang.ref.WeakReference;
import p002B.C0019i;
import p086i.InterfaceC0905j;
import p086i.MenuC0907l;
import p088j.C1005k;

/* renamed from: h.e */
/* loaded from: classes.dex */
public final class C0877e extends AbstractC0873a implements InterfaceC0905j {

    /* renamed from: c */
    public Context f3512c;

    /* renamed from: d */
    public ActionBarContextView f3513d;

    /* renamed from: e */
    public C0019i f3514e;

    /* renamed from: f */
    public WeakReference f3515f;

    /* renamed from: g */
    public boolean f3516g;

    /* renamed from: h */
    public MenuC0907l f3517h;

    @Override // p083h.AbstractC0873a
    /* renamed from: a */
    public final void mo2064a() {
        if (this.f3516g) {
            return;
        }
        this.f3516g = true;
        this.f3514e.m52C(this);
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: b */
    public final View mo2065b() {
        WeakReference weakReference = this.f3515f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: c */
    public final MenuC0907l mo2066c() {
        return this.f3517h;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: d */
    public final MenuInflater mo2067d() {
        return new C0881i(this.f3513d.getContext());
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: e */
    public final void mo169e(MenuC0907l menuC0907l) {
        mo2070h();
        C1005k c1005k = this.f3513d.f1667d;
        if (c1005k != null) {
            c1005k.m2489o();
        }
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: f */
    public final CharSequence mo2068f() {
        return this.f3513d.getSubtitle();
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: g */
    public final CharSequence mo2069g() {
        return this.f3513d.getTitle();
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: h */
    public final void mo2070h() {
        this.f3514e.m53D(this, this.f3517h);
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: i */
    public final boolean mo2071i() {
        return this.f3513d.f1682s;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: j */
    public final void mo2072j(View view) {
        this.f3513d.setCustomView(view);
        this.f3515f = view != null ? new WeakReference(view) : null;
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: k */
    public final void mo2073k(int i2) {
        mo2074m(this.f3512c.getString(i2));
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: l */
    public final boolean mo176l(MenuC0907l menuC0907l, MenuItem menuItem) {
        return ((C0605s) this.f3514e.f47b).m1544f(this, menuItem);
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: m */
    public final void mo2074m(CharSequence charSequence) {
        this.f3513d.setSubtitle(charSequence);
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: n */
    public final void mo2075n(int i2) {
        mo2076o(this.f3512c.getString(i2));
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: o */
    public final void mo2076o(CharSequence charSequence) {
        this.f3513d.setTitle(charSequence);
    }

    @Override // p083h.AbstractC0873a
    /* renamed from: p */
    public final void mo2077p(boolean z2) {
        this.f3505b = z2;
        this.f3513d.setTitleOptional(z2);
    }
}
