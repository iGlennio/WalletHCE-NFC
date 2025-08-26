package p083h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p086i.MenuC0892B;

/* renamed from: h.f */
/* loaded from: classes.dex */
public final class C0878f extends ActionMode {

    /* renamed from: a */
    public final Context f3518a;

    /* renamed from: b */
    public final AbstractC0873a f3519b;

    public C0878f(Context context, AbstractC0873a abstractC0873a) {
        this.f3518a = context;
        this.f3519b = abstractC0873a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f3519b.mo2064a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f3519b.mo2065b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0892B(this.f3518a, this.f3519b.mo2066c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f3519b.mo2067d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f3519b.mo2068f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f3519b.f3504a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f3519b.mo2069g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f3519b.f3505b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f3519b.mo2070h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f3519b.mo2071i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f3519b.mo2072j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f3519b.mo2074m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f3519b.f3504a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f3519b.mo2076o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f3519b.mo2077p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f3519b.mo2073k(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f3519b.mo2075n(i2);
    }
}
