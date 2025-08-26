package p086i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p027K.AbstractC0272P;

/* renamed from: i.w */
/* loaded from: classes.dex */
public class C0918w {

    /* renamed from: a */
    public final Context f3731a;

    /* renamed from: b */
    public final MenuC0907l f3732b;

    /* renamed from: c */
    public final boolean f3733c;

    /* renamed from: d */
    public final int f3734d;

    /* renamed from: e */
    public View f3735e;

    /* renamed from: g */
    public boolean f3737g;

    /* renamed from: h */
    public InterfaceC0919x f3738h;

    /* renamed from: i */
    public AbstractC0915t f3739i;

    /* renamed from: j */
    public C0916u f3740j;

    /* renamed from: f */
    public int f3736f = 8388611;

    /* renamed from: k */
    public final C0916u f3741k = new C0916u(this);

    public C0918w(int i2, Context context, View view, MenuC0907l menuC0907l, boolean z2) {
        this.f3731a = context;
        this.f3732b = menuC0907l;
        this.f3735e = view;
        this.f3733c = z2;
        this.f3734d = i2;
    }

    /* renamed from: a */
    public final AbstractC0915t m2360a() {
        AbstractC0915t viewOnKeyListenerC0894D;
        if (this.f3739i == null) {
            Context context = this.f3731a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC0917v.m2359a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0894D = new ViewOnKeyListenerC0901f(context, this.f3735e, this.f3734d, this.f3733c);
            } else {
                View view = this.f3735e;
                Context context2 = this.f3731a;
                boolean z2 = this.f3733c;
                viewOnKeyListenerC0894D = new ViewOnKeyListenerC0894D(this.f3734d, context2, view, this.f3732b, z2);
            }
            viewOnKeyListenerC0894D.mo2312o(this.f3732b);
            viewOnKeyListenerC0894D.mo2317u(this.f3741k);
            viewOnKeyListenerC0894D.mo2313q(this.f3735e);
            viewOnKeyListenerC0894D.mo2311k(this.f3738h);
            viewOnKeyListenerC0894D.mo2314r(this.f3737g);
            viewOnKeyListenerC0894D.mo2315s(this.f3736f);
            this.f3739i = viewOnKeyListenerC0894D;
        }
        return this.f3739i;
    }

    /* renamed from: b */
    public final boolean m2361b() {
        AbstractC0915t abstractC0915t = this.f3739i;
        return abstractC0915t != null && abstractC0915t.mo2308b();
    }

    /* renamed from: c */
    public void mo2362c() {
        this.f3739i = null;
        C0916u c0916u = this.f3740j;
        if (c0916u != null) {
            c0916u.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m2363d(int i2, int i3, boolean z2, boolean z3) {
        AbstractC0915t m2360a = m2360a();
        m2360a.mo2318v(z3);
        if (z2) {
            int i4 = this.f3736f;
            View view = this.f3735e;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f3735e.getWidth();
            }
            m2360a.mo2316t(i2);
            m2360a.mo2319w(i3);
            int i5 = (int) ((this.f3731a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m2360a.f3729a = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        m2360a.mo2310i();
    }
}
