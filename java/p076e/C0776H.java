package p076e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002B.C0019i;
import p005C.C0046i;
import p010D1.AbstractC0096d;
import p019H0.C0195a;
import p027K.AbstractC0259C;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p027K.C0278W;
import p073d.AbstractC0734a;
import p083h.C0882j;
import p083h.C0883k;
import p088j.C1034t1;
import p088j.InterfaceC0984d;
import p088j.InterfaceC1024q0;

/* renamed from: e.H */
/* loaded from: classes.dex */
public final class C0776H extends AbstractC0096d implements InterfaceC0984d {

    /* renamed from: L */
    public static final AccelerateInterpolator f3016L = new AccelerateInterpolator();

    /* renamed from: M */
    public static final DecelerateInterpolator f3017M = new DecelerateInterpolator();

    /* renamed from: A */
    public int f3018A;

    /* renamed from: B */
    public boolean f3019B;

    /* renamed from: C */
    public boolean f3020C;

    /* renamed from: D */
    public boolean f3021D;

    /* renamed from: E */
    public boolean f3022E;

    /* renamed from: F */
    public C0883k f3023F;

    /* renamed from: G */
    public boolean f3024G;

    /* renamed from: H */
    public boolean f3025H;

    /* renamed from: I */
    public final C0774F f3026I;

    /* renamed from: J */
    public final C0774F f3027J;

    /* renamed from: K */
    public final C0046i f3028K;

    /* renamed from: n */
    public Context f3029n;

    /* renamed from: o */
    public Context f3030o;

    /* renamed from: p */
    public ActionBarOverlayLayout f3031p;

    /* renamed from: q */
    public ActionBarContainer f3032q;

    /* renamed from: r */
    public InterfaceC1024q0 f3033r;

    /* renamed from: s */
    public ActionBarContextView f3034s;

    /* renamed from: t */
    public final View f3035t;

    /* renamed from: u */
    public boolean f3036u;

    /* renamed from: v */
    public C0775G f3037v;

    /* renamed from: w */
    public C0775G f3038w;

    /* renamed from: x */
    public C0019i f3039x;

    /* renamed from: y */
    public boolean f3040y;

    /* renamed from: z */
    public final ArrayList f3041z;

    public C0776H(Activity activity, boolean z2) {
        new ArrayList();
        this.f3041z = new ArrayList();
        this.f3018A = 0;
        this.f3019B = true;
        this.f3022E = true;
        this.f3026I = new C0774F(this, 0);
        this.f3027J = new C0774F(this, 1);
        this.f3028K = new C0046i(24, this);
        View decorView = activity.getWindow().getDecorView();
        m2080q0(decorView);
        if (z2) {
            return;
        }
        this.f3035t = decorView.findViewById(R.id.content);
    }

    /* renamed from: o0 */
    public final void m2078o0(boolean z2) {
        C0278W m1390i;
        C0278W c0278w;
        if (z2) {
            if (!this.f3021D) {
                this.f3021D = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3031p;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2083t0(false);
            }
        } else if (this.f3021D) {
            this.f3021D = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3031p;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2083t0(false);
        }
        ActionBarContainer actionBarContainer = this.f3032q;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                ((C1034t1) this.f3033r).f4054a.setVisibility(4);
                this.f3034s.setVisibility(0);
                return;
            } else {
                ((C1034t1) this.f3033r).f4054a.setVisibility(0);
                this.f3034s.setVisibility(8);
                return;
            }
        }
        if (z2) {
            C1034t1 c1034t1 = (C1034t1) this.f3033r;
            m1390i = AbstractC0272P.m811a(c1034t1.f4054a);
            m1390i.m839a(0.0f);
            m1390i.m841c(100L);
            m1390i.m842d(new C0882j(c1034t1, 4));
            c0278w = this.f3034s.m1390i(0, 200L);
        } else {
            C1034t1 c1034t12 = (C1034t1) this.f3033r;
            C0278W m811a = AbstractC0272P.m811a(c1034t12.f4054a);
            m811a.m839a(1.0f);
            m811a.m841c(200L);
            m811a.m842d(new C0882j(c1034t12, 0));
            m1390i = this.f3034s.m1390i(8, 100L);
            c0278w = m811a;
        }
        C0883k c0883k = new C0883k();
        ArrayList arrayList = c0883k.f3564a;
        arrayList.add(m1390i);
        View view = (View) m1390i.f775a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0278w.f775a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0278w);
        c0883k.m2300b();
    }

    /* renamed from: p0 */
    public final Context m2079p0() {
        if (this.f3030o == null) {
            TypedValue typedValue = new TypedValue();
            this.f3029n.getTheme().resolveAttribute(com.nfupay.s145.R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f3030o = new ContextThemeWrapper(this.f3029n, i2);
            } else {
                this.f3030o = this.f3029n;
            }
        }
        return this.f3030o;
    }

    /* renamed from: q0 */
    public final void m2080q0(View view) {
        InterfaceC1024q0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.nfupay.s145.R.id.decor_content_parent);
        this.f3031p = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.nfupay.s145.R.id.action_bar);
        if (findViewById instanceof InterfaceC1024q0) {
            wrapper = (InterfaceC1024q0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f3033r = wrapper;
        this.f3034s = (ActionBarContextView) view.findViewById(com.nfupay.s145.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.nfupay.s145.R.id.action_bar_container);
        this.f3032q = actionBarContainer;
        InterfaceC1024q0 interfaceC1024q0 = this.f3033r;
        if (interfaceC1024q0 == null || this.f3034s == null || actionBarContainer == null) {
            throw new IllegalStateException(C0776H.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C1034t1) interfaceC1024q0).f4054a.getContext();
        this.f3029n = context;
        if ((((C1034t1) this.f3033r).f4055b & 4) != 0) {
            this.f3036u = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f3033r.getClass();
        m2082s0(context.getResources().getBoolean(com.nfupay.s145.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f3029n.obtainStyledAttributes(null, AbstractC0734a.f2911a, com.nfupay.s145.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3031p;
            if (!actionBarOverlayLayout2.f1693h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f3025H = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f3032q;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            AbstractC0261E.m758s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: r0 */
    public final void m2081r0(boolean z2) {
        if (this.f3036u) {
            return;
        }
        int i2 = z2 ? 4 : 0;
        C1034t1 c1034t1 = (C1034t1) this.f3033r;
        int i3 = c1034t1.f4055b;
        this.f3036u = true;
        c1034t1.m2524a((i2 & 4) | (i3 & (-5)));
    }

    /* renamed from: s0 */
    public final void m2082s0(boolean z2) {
        if (z2) {
            this.f3032q.setTabContainer(null);
            ((C1034t1) this.f3033r).getClass();
        } else {
            ((C1034t1) this.f3033r).getClass();
            this.f3032q.setTabContainer(null);
        }
        C1034t1 c1034t1 = (C1034t1) this.f3033r;
        c1034t1.getClass();
        c1034t1.f4054a.setCollapsible(false);
        this.f3031p.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: t0 */
    public final void m2083t0(boolean z2) {
        boolean z3 = this.f3021D || !this.f3020C;
        View view = this.f3035t;
        C0046i c0046i = this.f3028K;
        if (!z3) {
            if (this.f3022E) {
                this.f3022E = false;
                C0883k c0883k = this.f3023F;
                if (c0883k != null) {
                    c0883k.m2299a();
                }
                int i2 = this.f3018A;
                C0774F c0774f = this.f3026I;
                if (i2 != 0 || (!this.f3024G && !z2)) {
                    c0774f.mo844a();
                    return;
                }
                this.f3032q.setAlpha(1.0f);
                this.f3032q.setTransitioning(true);
                C0883k c0883k2 = new C0883k();
                float f = -this.f3032q.getHeight();
                if (z2) {
                    this.f3032q.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                C0278W m811a = AbstractC0272P.m811a(this.f3032q);
                m811a.m843e(f);
                View view2 = (View) m811a.f775a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0046i != null ? new C0195a(c0046i, view2) : null);
                }
                boolean z4 = c0883k2.f3568e;
                ArrayList arrayList = c0883k2.f3564a;
                if (!z4) {
                    arrayList.add(m811a);
                }
                if (this.f3019B && view != null) {
                    C0278W m811a2 = AbstractC0272P.m811a(view);
                    m811a2.m843e(f);
                    if (!c0883k2.f3568e) {
                        arrayList.add(m811a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f3016L;
                boolean z5 = c0883k2.f3568e;
                if (!z5) {
                    c0883k2.f3566c = accelerateInterpolator;
                }
                if (!z5) {
                    c0883k2.f3565b = 250L;
                }
                if (!z5) {
                    c0883k2.f3567d = c0774f;
                }
                this.f3023F = c0883k2;
                c0883k2.m2300b();
                return;
            }
            return;
        }
        if (this.f3022E) {
            return;
        }
        this.f3022E = true;
        C0883k c0883k3 = this.f3023F;
        if (c0883k3 != null) {
            c0883k3.m2299a();
        }
        this.f3032q.setVisibility(0);
        int i3 = this.f3018A;
        C0774F c0774f2 = this.f3027J;
        if (i3 == 0 && (this.f3024G || z2)) {
            this.f3032q.setTranslationY(0.0f);
            float f2 = -this.f3032q.getHeight();
            if (z2) {
                this.f3032q.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.f3032q.setTranslationY(f2);
            C0883k c0883k4 = new C0883k();
            C0278W m811a3 = AbstractC0272P.m811a(this.f3032q);
            m811a3.m843e(0.0f);
            View view3 = (View) m811a3.f775a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0046i != null ? new C0195a(c0046i, view3) : null);
            }
            boolean z6 = c0883k4.f3568e;
            ArrayList arrayList2 = c0883k4.f3564a;
            if (!z6) {
                arrayList2.add(m811a3);
            }
            if (this.f3019B && view != null) {
                view.setTranslationY(f2);
                C0278W m811a4 = AbstractC0272P.m811a(view);
                m811a4.m843e(0.0f);
                if (!c0883k4.f3568e) {
                    arrayList2.add(m811a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f3017M;
            boolean z7 = c0883k4.f3568e;
            if (!z7) {
                c0883k4.f3566c = decelerateInterpolator;
            }
            if (!z7) {
                c0883k4.f3565b = 250L;
            }
            if (!z7) {
                c0883k4.f3567d = c0774f2;
            }
            this.f3023F = c0883k4;
            c0883k4.m2300b();
        } else {
            this.f3032q.setAlpha(1.0f);
            this.f3032q.setTranslationY(0.0f);
            if (this.f3019B && view != null) {
                view.setTranslationY(0.0f);
            }
            c0774f2.mo844a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3031p;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            AbstractC0259C.m739c(actionBarOverlayLayout);
        }
    }

    public C0776H(Dialog dialog) {
        new ArrayList();
        this.f3041z = new ArrayList();
        this.f3018A = 0;
        this.f3019B = true;
        this.f3022E = true;
        this.f3026I = new C0774F(this, 0);
        this.f3027J = new C0774F(this, 1);
        this.f3028K = new C0046i(24, this);
        m2080q0(dialog.getWindow().getDecorView());
    }
}
