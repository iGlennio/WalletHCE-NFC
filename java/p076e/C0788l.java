package p076e;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.nfupay.s145.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000A.AbstractC0001b;
import p005C.C0041d;
import p027K.AbstractC0259C;
import p027K.AbstractC0262F;
import p027K.AbstractC0272P;
import p027K.AbstractC0303k0;
import p027K.C0297h0;
import p027K.C0299i0;
import p027K.C0301j0;
import p027K.C0319s0;
import p027K.InterfaceC0314q;
import p086i.InterfaceC0919x;
import p086i.MenuC0907l;
import p088j.AbstractC0925A1;
import p088j.InterfaceC1018o0;

/* renamed from: e.l */
/* loaded from: classes.dex */
public final class C0788l implements InterfaceC0314q, InterfaceC1018o0, InterfaceC0919x {

    /* renamed from: a */
    public final /* synthetic */ int f3100a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0797u f3101b;

    public /* synthetic */ C0788l(LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u, int i2) {
        this.f3100a = i2;
        this.f3101b = layoutInflaterFactory2C0797u;
    }

    @Override // p086i.InterfaceC0919x
    /* renamed from: a */
    public void mo165a(MenuC0907l menuC0907l, boolean z2) {
        C0796t c0796t;
        switch (this.f3100a) {
            case 2:
                this.f3101b.m2142r(menuC0907l);
                break;
            default:
                MenuC0907l mo2324k = menuC0907l.mo2324k();
                int i2 = 0;
                boolean z3 = mo2324k != menuC0907l;
                if (z3) {
                    menuC0907l = mo2324k;
                }
                LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = this.f3101b;
                C0796t[] c0796tArr = layoutInflaterFactory2C0797u.f3146L;
                int length = c0796tArr != null ? c0796tArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c0796t = null;
                    } else {
                        c0796t = c0796tArr[i2];
                        if (c0796t == null || c0796t.f3122h != menuC0907l) {
                            i2++;
                        }
                    }
                }
                if (c0796t != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0797u.m2143s(c0796t, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0797u.m2141q(c0796t.f3115a, c0796t, mo2324k);
                        layoutInflaterFactory2C0797u.m2143s(c0796t, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p027K.InterfaceC0314q
    /* renamed from: d */
    public C0319s0 mo63d(View view, C0319s0 c0319s0) {
        boolean z2;
        C0319s0 c0319s02;
        boolean z3;
        boolean z4;
        int m940d = c0319s0.m940d();
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = this.f3101b;
        layoutInflaterFactory2C0797u.getClass();
        int m940d2 = c0319s0.m940d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0797u.f3180v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0797u.f3180v.getLayoutParams();
            if (layoutInflaterFactory2C0797u.f3180v.isShown()) {
                if (layoutInflaterFactory2C0797u.f3163c0 == null) {
                    layoutInflaterFactory2C0797u.f3163c0 = new Rect();
                    layoutInflaterFactory2C0797u.f3164d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0797u.f3163c0;
                Rect rect2 = layoutInflaterFactory2C0797u.f3164d0;
                rect.set(c0319s0.m938b(), c0319s0.m940d(), c0319s0.m939c(), c0319s0.m937a());
                ViewGroup viewGroup = layoutInflaterFactory2C0797u.f3135A;
                Method method = AbstractC0925A1.f3755a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e2) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0797u.f3135A;
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                C0319s0 m766a = AbstractC0262F.m766a(viewGroup2);
                int m938b = m766a == null ? 0 : m766a.m938b();
                int m939c = m766a == null ? 0 : m766a.m939c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z4 = true;
                }
                Context context = layoutInflaterFactory2C0797u.f3169k;
                if (i2 <= 0 || layoutInflaterFactory2C0797u.f3137C != null) {
                    View view2 = layoutInflaterFactory2C0797u.f3137C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != m938b || marginLayoutParams2.rightMargin != m939c) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = m938b;
                            marginLayoutParams2.rightMargin = m939c;
                            layoutInflaterFactory2C0797u.f3137C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0797u.f3137C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m938b;
                    layoutParams.rightMargin = m939c;
                    layoutInflaterFactory2C0797u.f3135A.addView(layoutInflaterFactory2C0797u.f3137C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0797u.f3137C;
                boolean z5 = view4 != null;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0797u.f3137C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? AbstractC0001b.m3a(context, R.color.abc_decor_view_status_guard_light) : AbstractC0001b.m3a(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0797u.f3142H && z5) {
                    m940d2 = 0;
                }
                z2 = z5;
                z3 = z4;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (z3) {
                layoutInflaterFactory2C0797u.f3180v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0797u.f3137C;
        if (view6 != null) {
            view6.setVisibility(z2 ? 0 : 8);
        }
        if (m940d != m940d2) {
            int m938b2 = c0319s0.m938b();
            int m939c2 = c0319s0.m939c();
            int m937a = c0319s0.m937a();
            int i7 = Build.VERSION.SDK_INT;
            AbstractC0303k0 c0301j0 = i7 >= 30 ? new C0301j0(c0319s0) : i7 >= 29 ? new C0299i0(c0319s0) : new C0297h0(c0319s0);
            c0301j0.mo869g(C0041d.m145b(m938b2, m940d2, m939c2, m937a));
            c0319s02 = c0301j0.mo867b();
        } else {
            c0319s02 = c0319s0;
        }
        WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
        WindowInsets m941f = c0319s02.m941f();
        if (m941f == null) {
            return c0319s02;
        }
        WindowInsets m738b = AbstractC0259C.m738b(view, m941f);
        return !m738b.equals(m941f) ? C0319s0.m936g(view, m738b) : c0319s02;
    }

    @Override // p086i.InterfaceC0919x
    /* renamed from: i */
    public boolean mo173i(MenuC0907l menuC0907l) {
        Window.Callback callback;
        switch (this.f3100a) {
            case 2:
                Window.Callback callback2 = this.f3101b.f3170l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0907l);
                    break;
                }
                break;
            default:
                if (menuC0907l == menuC0907l.mo2324k()) {
                    LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = this.f3101b;
                    if (layoutInflaterFactory2C0797u.f3140F && (callback = layoutInflaterFactory2C0797u.f3170l.getCallback()) != null && !layoutInflaterFactory2C0797u.f3151Q) {
                        callback.onMenuOpened(108, menuC0907l);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
