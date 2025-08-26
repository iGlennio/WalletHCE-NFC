package p027K;

import android.view.View;
import java.lang.ref.WeakReference;
import p017G0.C0177i;

/* renamed from: K.W */
/* loaded from: classes.dex */
public final class C0278W {

    /* renamed from: a */
    public final WeakReference f775a;

    public C0278W(View view) {
        this.f775a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void m839a(float f) {
        View view = (View) this.f775a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: b */
    public final void m840b() {
        View view = (View) this.f775a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void m841c(long j2) {
        View view = (View) this.f775a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    /* renamed from: d */
    public final void m842d(InterfaceC0279X interfaceC0279X) {
        View view = (View) this.f775a.get();
        if (view != null) {
            if (interfaceC0279X != null) {
                view.animate().setListener(new C0177i(interfaceC0279X, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: e */
    public final void m843e(float f) {
        View view = (View) this.f775a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
