package p086i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p019H0.ViewTreeObserverOnGlobalLayoutListenerC0199e;
import p027K.AbstractC0272P;
import p043P0.ViewOnAttachStateChangeListenerC0420n;
import p088j.C0955P0;
import p088j.C1045x0;

/* renamed from: i.D */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0894D extends AbstractC0915t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b */
    public final Context f3577b;

    /* renamed from: c */
    public final MenuC0907l f3578c;

    /* renamed from: d */
    public final C0904i f3579d;

    /* renamed from: e */
    public final boolean f3580e;

    /* renamed from: f */
    public final int f3581f;

    /* renamed from: g */
    public final int f3582g;

    /* renamed from: h */
    public final C0955P0 f3583h;

    /* renamed from: k */
    public C0916u f3586k;

    /* renamed from: l */
    public View f3587l;

    /* renamed from: m */
    public View f3588m;

    /* renamed from: n */
    public InterfaceC0919x f3589n;

    /* renamed from: o */
    public ViewTreeObserver f3590o;

    /* renamed from: p */
    public boolean f3591p;

    /* renamed from: q */
    public boolean f3592q;

    /* renamed from: r */
    public int f3593r;

    /* renamed from: t */
    public boolean f3595t;

    /* renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0199e f3584i = new ViewTreeObserverOnGlobalLayoutListenerC0199e(2, this);

    /* renamed from: j */
    public final ViewOnAttachStateChangeListenerC0420n f3585j = new ViewOnAttachStateChangeListenerC0420n(3, this);

    /* renamed from: s */
    public int f3594s = 0;

    public ViewOnKeyListenerC0894D(int i2, Context context, View view, MenuC0907l menuC0907l, boolean z2) {
        this.f3577b = context;
        this.f3578c = menuC0907l;
        this.f3580e = z2;
        this.f3579d = new C0904i(menuC0907l, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f3582g = i2;
        Resources resources = context.getResources();
        this.f3581f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3587l = view;
        this.f3583h = new C0955P0(context, null, i2);
        menuC0907l.m2338b(this, context);
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: a */
    public final void mo482a(MenuC0907l menuC0907l, boolean z2) {
        if (menuC0907l != this.f3578c) {
            return;
        }
        dismiss();
        InterfaceC0919x interfaceC0919x = this.f3589n;
        if (interfaceC0919x != null) {
            interfaceC0919x.mo165a(menuC0907l, z2);
        }
    }

    @Override // p086i.InterfaceC0893C
    /* renamed from: b */
    public final boolean mo2308b() {
        return !this.f3591p && this.f3583h.f3823z.isShowing();
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: c */
    public final void mo483c() {
        this.f3592q = false;
        C0904i c0904i = this.f3579d;
        if (c0904i != null) {
            c0904i.notifyDataSetChanged();
        }
    }

    @Override // p086i.InterfaceC0893C
    public final void dismiss() {
        if (mo2308b()) {
            this.f3583h.dismiss();
        }
    }

    @Override // p086i.InterfaceC0893C
    /* renamed from: f */
    public final C1045x0 mo2309f() {
        return this.f3583h.f3800c;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: g */
    public final boolean mo486g() {
        return false;
    }

    @Override // p086i.InterfaceC0893C
    /* renamed from: i */
    public final void mo2310i() {
        View view;
        if (mo2308b()) {
            return;
        }
        if (this.f3591p || (view = this.f3587l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3588m = view;
        C0955P0 c0955p0 = this.f3583h;
        c0955p0.f3823z.setOnDismissListener(this);
        c0955p0.f3813p = this;
        c0955p0.f3822y = true;
        c0955p0.f3823z.setFocusable(true);
        View view2 = this.f3588m;
        boolean z2 = this.f3590o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3590o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3584i);
        }
        view2.addOnAttachStateChangeListener(this.f3585j);
        c0955p0.f3812o = view2;
        c0955p0.f3809l = this.f3594s;
        boolean z3 = this.f3592q;
        Context context = this.f3577b;
        C0904i c0904i = this.f3579d;
        if (!z3) {
            this.f3593r = AbstractC0915t.m2357p(c0904i, context, this.f3581f);
            this.f3592q = true;
        }
        c0955p0.m2403r(this.f3593r);
        c0955p0.f3823z.setInputMethodMode(2);
        Rect rect = this.f3729a;
        c0955p0.f3821x = rect != null ? new Rect(rect) : null;
        c0955p0.mo2310i();
        C1045x0 c1045x0 = c0955p0.f3800c;
        c1045x0.setOnKeyListener(this);
        if (this.f3595t) {
            MenuC0907l menuC0907l = this.f3578c;
            if (menuC0907l.f3675m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1045x0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0907l.f3675m);
                }
                frameLayout.setEnabled(false);
                c1045x0.addHeaderView(frameLayout, null, false);
            }
        }
        c0955p0.mo2401o(c0904i);
        c0955p0.mo2310i();
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: j */
    public final Parcelable mo488j() {
        return null;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: k */
    public final void mo2311k(InterfaceC0919x interfaceC0919x) {
        this.f3589n = interfaceC0919x;
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: n */
    public final boolean mo491n(SubMenuC0895E subMenuC0895E) {
        if (subMenuC0895E.hasVisibleItems()) {
            View view = this.f3588m;
            C0918w c0918w = new C0918w(this.f3582g, this.f3577b, view, subMenuC0895E, this.f3580e);
            InterfaceC0919x interfaceC0919x = this.f3589n;
            c0918w.f3738h = interfaceC0919x;
            AbstractC0915t abstractC0915t = c0918w.f3739i;
            if (abstractC0915t != null) {
                abstractC0915t.mo2311k(interfaceC0919x);
            }
            boolean m2358x = AbstractC0915t.m2358x(subMenuC0895E);
            c0918w.f3737g = m2358x;
            AbstractC0915t abstractC0915t2 = c0918w.f3739i;
            if (abstractC0915t2 != null) {
                abstractC0915t2.mo2314r(m2358x);
            }
            c0918w.f3740j = this.f3586k;
            this.f3586k = null;
            this.f3578c.m2339c(false);
            C0955P0 c0955p0 = this.f3583h;
            int i2 = c0955p0.f3803f;
            int m2397j = c0955p0.m2397j();
            int i3 = this.f3594s;
            View view2 = this.f3587l;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            if ((Gravity.getAbsoluteGravity(i3, view2.getLayoutDirection()) & 7) == 5) {
                i2 += this.f3587l.getWidth();
            }
            if (!c0918w.m2361b()) {
                if (c0918w.f3735e != null) {
                    c0918w.m2363d(i2, m2397j, true, true);
                }
            }
            InterfaceC0919x interfaceC0919x2 = this.f3589n;
            if (interfaceC0919x2 != null) {
                interfaceC0919x2.mo173i(subMenuC0895E);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3591p = true;
        this.f3578c.m2339c(true);
        ViewTreeObserver viewTreeObserver = this.f3590o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3590o = this.f3588m.getViewTreeObserver();
            }
            this.f3590o.removeGlobalOnLayoutListener(this.f3584i);
            this.f3590o = null;
        }
        this.f3588m.removeOnAttachStateChangeListener(this.f3585j);
        C0916u c0916u = this.f3586k;
        if (c0916u != null) {
            c0916u.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: q */
    public final void mo2313q(View view) {
        this.f3587l = view;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: r */
    public final void mo2314r(boolean z2) {
        this.f3579d.f3658c = z2;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: s */
    public final void mo2315s(int i2) {
        this.f3594s = i2;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: t */
    public final void mo2316t(int i2) {
        this.f3583h.f3803f = i2;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: u */
    public final void mo2317u(PopupWindow.OnDismissListener onDismissListener) {
        this.f3586k = (C0916u) onDismissListener;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: v */
    public final void mo2318v(boolean z2) {
        this.f3595t = z2;
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: w */
    public final void mo2319w(int i2) {
        this.f3583h.m2399l(i2);
    }

    @Override // p086i.InterfaceC0920y
    /* renamed from: m */
    public final void mo490m(Parcelable parcelable) {
    }

    @Override // p086i.AbstractC0915t
    /* renamed from: o */
    public final void mo2312o(MenuC0907l menuC0907l) {
    }
}
