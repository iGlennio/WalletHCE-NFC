package p076e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0632f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p010D1.AbstractC0096d;
import p016G.AbstractC0165f;
import p016G.C0166g;
import p016G.C0167h;
import p017G0.C0176h;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p027K.C0278W;
import p073d.AbstractC0734a;
import p083h.AbstractC0873a;
import p083h.C0876d;
import p083h.C0881i;
import p086i.C0909n;
import p086i.InterfaceC0905j;
import p086i.MenuC0907l;
import p088j.AbstractC0925A1;
import p088j.C0990f;
import p088j.C1005k;
import p088j.C1019o1;
import p088j.C1034t1;
import p088j.C1035u;
import p088j.InterfaceC1021p0;
import p088j.InterfaceC1024q0;
import p101o.C1161k;

/* renamed from: e.u */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0797u extends AbstractC0786j implements InterfaceC0905j, LayoutInflater.Factory2 {

    /* renamed from: h0 */
    public static final C1161k f3131h0 = new C1161k();

    /* renamed from: i0 */
    public static final int[] f3132i0 = {R.attr.windowBackground};

    /* renamed from: j0 */
    public static final boolean f3133j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: k0 */
    public static final boolean f3134k0 = true;

    /* renamed from: A */
    public ViewGroup f3135A;

    /* renamed from: B */
    public TextView f3136B;

    /* renamed from: C */
    public View f3137C;

    /* renamed from: D */
    public boolean f3138D;

    /* renamed from: E */
    public boolean f3139E;

    /* renamed from: F */
    public boolean f3140F;

    /* renamed from: G */
    public boolean f3141G;

    /* renamed from: H */
    public boolean f3142H;

    /* renamed from: I */
    public boolean f3143I;

    /* renamed from: J */
    public boolean f3144J;

    /* renamed from: K */
    public boolean f3145K;

    /* renamed from: L */
    public C0796t[] f3146L;

    /* renamed from: M */
    public C0796t f3147M;

    /* renamed from: N */
    public boolean f3148N;

    /* renamed from: O */
    public boolean f3149O;

    /* renamed from: P */
    public boolean f3150P;

    /* renamed from: Q */
    public boolean f3151Q;

    /* renamed from: R */
    public Configuration f3152R;

    /* renamed from: S */
    public final int f3153S;

    /* renamed from: T */
    public int f3154T;

    /* renamed from: U */
    public int f3155U;

    /* renamed from: V */
    public boolean f3156V;

    /* renamed from: W */
    public C0793q f3157W;

    /* renamed from: X */
    public C0793q f3158X;

    /* renamed from: Y */
    public boolean f3159Y;

    /* renamed from: Z */
    public int f3160Z;

    /* renamed from: b0 */
    public boolean f3162b0;

    /* renamed from: c0 */
    public Rect f3163c0;

    /* renamed from: d0 */
    public Rect f3164d0;

    /* renamed from: e0 */
    public C0800x f3165e0;

    /* renamed from: f0 */
    public OnBackInvokedDispatcher f3166f0;

    /* renamed from: g0 */
    public OnBackInvokedCallback f3167g0;

    /* renamed from: j */
    public final Object f3168j;

    /* renamed from: k */
    public final Context f3169k;

    /* renamed from: l */
    public Window f3170l;

    /* renamed from: m */
    public WindowCallbackC0792p f3171m;

    /* renamed from: n */
    public final Object f3172n;

    /* renamed from: o */
    public C0776H f3173o;

    /* renamed from: p */
    public C0881i f3174p;

    /* renamed from: q */
    public CharSequence f3175q;

    /* renamed from: r */
    public InterfaceC1021p0 f3176r;

    /* renamed from: s */
    public C0788l f3177s;

    /* renamed from: t */
    public C0788l f3178t;

    /* renamed from: u */
    public AbstractC0873a f3179u;

    /* renamed from: v */
    public ActionBarContextView f3180v;

    /* renamed from: w */
    public PopupWindow f3181w;

    /* renamed from: x */
    public RunnableC0787k f3182x;

    /* renamed from: z */
    public boolean f3184z;

    /* renamed from: y */
    public C0278W f3183y = null;

    /* renamed from: a0 */
    public final RunnableC0787k f3161a0 = new RunnableC0787k(this, 0);

    public LayoutInflaterFactory2C0797u(Context context, Window window, InterfaceC0783g interfaceC0783g, Object obj) {
        AbstractActivityC0782f abstractActivityC0782f;
        this.f3153S = -100;
        this.f3169k = context;
        this.f3172n = interfaceC0783g;
        this.f3168j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0782f)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0782f = (AbstractActivityC0782f) context;
                    break;
                }
            }
            abstractActivityC0782f = null;
            if (abstractActivityC0782f != null) {
                this.f3153S = ((LayoutInflaterFactory2C0797u) abstractActivityC0782f.m2094i()).f3153S;
            }
        }
        if (this.f3153S == -100) {
            C1161k c1161k = f3131h0;
            Integer num = (Integer) c1161k.getOrDefault(this.f3168j.getClass().getName(), null);
            if (num != null) {
                this.f3153S = num.intValue();
                c1161k.remove(this.f3168j.getClass().getName());
            }
        }
        if (window != null) {
            m2140o(window);
        }
        C1035u.m2529d();
    }

    /* renamed from: p */
    public static C0166g m2128p(Context context) {
        C0166g c0166g;
        C0166g c0166g2;
        if (Build.VERSION.SDK_INT >= 33 || (c0166g = AbstractC0786j.f3091c) == null) {
            return null;
        }
        C0166g m2118b = AbstractC0790n.m2118b(context.getApplicationContext().getResources().getConfiguration());
        C0167h c0167h = c0166g.f498a;
        if (c0167h.f499a.isEmpty()) {
            c0166g2 = C0166g.f497b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (i2 < m2118b.f498a.f499a.size() + c0167h.f499a.size()) {
                Locale locale = i2 < c0167h.f499a.size() ? c0167h.f499a.get(i2) : m2118b.f498a.f499a.get(i2 - c0167h.f499a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            c0166g2 = new C0166g(new C0167h(AbstractC0165f.m499a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c0166g2.f498a.f499a.isEmpty() ? m2118b : c0166g2;
    }

    /* renamed from: t */
    public static Configuration m2129t(Context context, int i2, C0166g c0166g, Configuration configuration, boolean z2) {
        int i3 = i2 != 1 ? i2 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (c0166g != null) {
            AbstractC0790n.m2120d(configuration2, c0166g);
        }
        return configuration2;
    }

    /* renamed from: A */
    public final void m2130A() {
        m2146w();
        if (this.f3140F && this.f3173o == null) {
            Object obj = this.f3168j;
            if (obj instanceof Activity) {
                this.f3173o = new C0776H((Activity) obj, this.f3141G);
            } else if (obj instanceof Dialog) {
                this.f3173o = new C0776H((Dialog) obj);
            }
            C0776H c0776h = this.f3173o;
            if (c0776h != null) {
                c0776h.m2081r0(this.f3162b0);
            }
        }
    }

    /* renamed from: B */
    public final void m2131B(int i2) {
        this.f3160Z = (1 << i2) | this.f3160Z;
        if (this.f3159Y) {
            return;
        }
        View decorView = this.f3170l.getDecorView();
        RunnableC0787k runnableC0787k = this.f3161a0;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        decorView.postOnAnimation(runnableC0787k);
        this.f3159Y = true;
    }

    /* renamed from: C */
    public final int m2132C(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f3158X == null) {
                            this.f3158X = new C0793q(this, context);
                        }
                        return this.f3158X.mo1641f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m2148y(context).mo1641f();
                }
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: D */
    public final boolean m2133D() {
        InterfaceC1024q0 interfaceC1024q0;
        C1019o1 c1019o1;
        boolean z2 = this.f3148N;
        this.f3148N = false;
        C0796t m2149z = m2149z(0);
        if (!m2149z.f3127m) {
            AbstractC0873a abstractC0873a = this.f3179u;
            if (abstractC0873a != null) {
                abstractC0873a.mo2064a();
                return true;
            }
            m2130A();
            C0776H c0776h = this.f3173o;
            if (c0776h == null || (interfaceC1024q0 = c0776h.f3033r) == null || (c1019o1 = ((C1034t1) interfaceC1024q0).f4054a.f1791L) == null || c1019o1.f4016b == null) {
                return false;
            }
            C1019o1 c1019o12 = ((C1034t1) interfaceC1024q0).f4054a.f1791L;
            C0909n c0909n = c1019o12 == null ? null : c1019o12.f4016b;
            if (c0909n != null) {
                c0909n.collapseActionView();
            }
        } else if (!z2) {
            m2143s(m2149z, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r3.f3655f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2134E(p076e.C0796t r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.LayoutInflaterFactory2C0797u.m2134E(e.t, android.view.KeyEvent):void");
    }

    /* renamed from: F */
    public final boolean m2135F(C0796t c0796t, int i2, KeyEvent keyEvent) {
        MenuC0907l menuC0907l;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0796t.f3125k || m2136G(c0796t, keyEvent)) && (menuC0907l = c0796t.f3122h) != null) {
            return menuC0907l.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.f3122h == null) goto L78;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2136G(p076e.C0796t r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.LayoutInflaterFactory2C0797u.m2136G(e.t, android.view.KeyEvent):boolean");
    }

    /* renamed from: H */
    public final void m2137H() {
        if (this.f3184z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: I */
    public final void m2138I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f3166f0 != null && (m2149z(0).f3127m || this.f3179u != null)) {
                z2 = true;
            }
            if (z2 && this.f3167g0 == null) {
                this.f3167g0 = AbstractC0791o.m2122b(this.f3166f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f3167g0) == null) {
                    return;
                }
                AbstractC0791o.m2123c(this.f3166f0, onBackInvokedCallback);
            }
        }
    }

    @Override // p076e.AbstractC0786j
    /* renamed from: a */
    public final void mo2108a() {
        LayoutInflater from = LayoutInflater.from(this.f3169k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0797u) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p076e.AbstractC0786j
    /* renamed from: b */
    public final void mo2109b() {
        if (this.f3173o != null) {
            m2130A();
            this.f3173o.getClass();
            m2131B(0);
        }
    }

    @Override // p076e.AbstractC0786j
    /* renamed from: d */
    public final void mo2110d() {
        String str;
        this.f3149O = true;
        m2139n(false, true);
        m2147x();
        Object obj = this.f3168j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0096d.m325E(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0776H c0776h = this.f3173o;
                if (c0776h == null) {
                    this.f3162b0 = true;
                } else {
                    c0776h.m2081r0(true);
                }
            }
            synchronized (AbstractC0786j.f3096h) {
                AbstractC0786j.m2107g(this);
                AbstractC0786j.f3095g.add(new WeakReference(this));
            }
        }
        this.f3152R = new Configuration(this.f3169k.getResources().getConfiguration());
        this.f3150P = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.m2488i() != false) goto L20;
     */
    @Override // p086i.InterfaceC0905j
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo169e(p086i.MenuC0907l r6) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.LayoutInflaterFactory2C0797u.mo169e(i.l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // p076e.AbstractC0786j
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2111f() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3168j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p076e.AbstractC0786j.f3096h
            monitor-enter(r0)
            p076e.AbstractC0786j.m2107g(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f3159Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f3170l
            android.view.View r0 = r0.getDecorView()
            e.k r1 = r3.f3161a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f3151Q = r0
            int r0 = r3.f3153S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f3168j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            o.k r0 = p076e.LayoutInflaterFactory2C0797u.f3131h0
            java.lang.Object r1 = r3.f3168j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f3153S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            o.k r0 = p076e.LayoutInflaterFactory2C0797u.f3131h0
            java.lang.Object r1 = r3.f3168j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            e.q r0 = r3.f3157W
            if (r0 == 0) goto L63
            r0.m1638c()
        L63:
            e.q r0 = r3.f3158X
            if (r0 == 0) goto L6a
            r0.m1638c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.LayoutInflaterFactory2C0797u.mo2111f():void");
    }

    @Override // p076e.AbstractC0786j
    /* renamed from: h */
    public final boolean mo2112h(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f3144J && i2 == 108) {
            return false;
        }
        if (this.f3140F && i2 == 1) {
            this.f3140F = false;
        }
        if (i2 == 1) {
            m2137H();
            this.f3144J = true;
            return true;
        }
        if (i2 == 2) {
            m2137H();
            this.f3138D = true;
            return true;
        }
        if (i2 == 5) {
            m2137H();
            this.f3139E = true;
            return true;
        }
        if (i2 == 10) {
            m2137H();
            this.f3142H = true;
            return true;
        }
        if (i2 == 108) {
            m2137H();
            this.f3140F = true;
            return true;
        }
        if (i2 != 109) {
            return this.f3170l.requestFeature(i2);
        }
        m2137H();
        this.f3141G = true;
        return true;
    }

    @Override // p076e.AbstractC0786j
    /* renamed from: i */
    public final void mo2113i(int i2) {
        m2146w();
        ViewGroup viewGroup = (ViewGroup) this.f3135A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3169k).inflate(i2, viewGroup);
        this.f3171m.m2124a(this.f3170l.getCallback());
    }

    @Override // p076e.AbstractC0786j
    /* renamed from: j */
    public final void mo2114j(View view) {
        m2146w();
        ViewGroup viewGroup = (ViewGroup) this.f3135A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3171m.m2124a(this.f3170l.getCallback());
    }

    @Override // p076e.AbstractC0786j
    /* renamed from: k */
    public final void mo2115k(View view, ViewGroup.LayoutParams layoutParams) {
        m2146w();
        ViewGroup viewGroup = (ViewGroup) this.f3135A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3171m.m2124a(this.f3170l.getCallback());
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: l */
    public final boolean mo176l(MenuC0907l menuC0907l, MenuItem menuItem) {
        C0796t c0796t;
        Window.Callback callback = this.f3170l.getCallback();
        if (callback != null && !this.f3151Q) {
            MenuC0907l mo2324k = menuC0907l.mo2324k();
            C0796t[] c0796tArr = this.f3146L;
            int length = c0796tArr != null ? c0796tArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    c0796t = c0796tArr[i2];
                    if (c0796t != null && c0796t.f3122h == mo2324k) {
                        break;
                    }
                    i2++;
                } else {
                    c0796t = null;
                    break;
                }
            }
            if (c0796t != null) {
                return callback.onMenuItemSelected(c0796t.f3115a, menuItem);
            }
        }
        return false;
    }

    @Override // p076e.AbstractC0786j
    /* renamed from: m */
    public final void mo2116m(CharSequence charSequence) {
        this.f3175q = charSequence;
        InterfaceC1021p0 interfaceC1021p0 = this.f3176r;
        if (interfaceC1021p0 != null) {
            interfaceC1021p0.setWindowTitle(charSequence);
            return;
        }
        C0776H c0776h = this.f3173o;
        if (c0776h == null) {
            TextView textView = this.f3136B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C1034t1 c1034t1 = (C1034t1) c0776h.f3033r;
        if (c1034t1.f4060g) {
            return;
        }
        c1034t1.f4061h = charSequence;
        if ((c1034t1.f4055b & 8) != 0) {
            Toolbar toolbar = c1034t1.f4054a;
            toolbar.setTitle(charSequence);
            if (c1034t1.f4060g) {
                AbstractC0272P.m824n(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017e  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2139n(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.LayoutInflaterFactory2C0797u.m2139n(boolean, boolean):boolean");
    }

    /* renamed from: o */
    public final void m2140o(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f3170l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC0792p) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC0792p windowCallbackC0792p = new WindowCallbackC0792p(this, callback);
        this.f3171m = windowCallbackC0792p;
        window.setCallback(windowCallbackC0792p);
        int[] iArr = f3132i0;
        Context context = this.f3169k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C1035u m2527a = C1035u.m2527a();
            synchronized (m2527a) {
                drawable = m2527a.f4071a.m2429d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f3170l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f3166f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f3167g0) != null) {
            AbstractC0791o.m2123c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3167g0 = null;
        }
        Object obj = this.f3168j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f3166f0 = AbstractC0791o.m2121a(activity);
                m2138I();
            }
        }
        this.f3166f0 = null;
        m2138I();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x010f, code lost:
    
        if (r13.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.LayoutInflaterFactory2C0797u.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* renamed from: q */
    public final void m2141q(int i2, C0796t c0796t, MenuC0907l menuC0907l) {
        if (menuC0907l == null) {
            if (c0796t == null && i2 >= 0) {
                C0796t[] c0796tArr = this.f3146L;
                if (i2 < c0796tArr.length) {
                    c0796t = c0796tArr[i2];
                }
            }
            if (c0796t != null) {
                menuC0907l = c0796t.f3122h;
            }
        }
        if ((c0796t == null || c0796t.f3127m) && !this.f3151Q) {
            WindowCallbackC0792p windowCallbackC0792p = this.f3171m;
            Window.Callback callback = this.f3170l.getCallback();
            windowCallbackC0792p.getClass();
            try {
                windowCallbackC0792p.f3107d = true;
                callback.onPanelClosed(i2, menuC0907l);
            } finally {
                windowCallbackC0792p.f3107d = false;
            }
        }
    }

    /* renamed from: r */
    public final void m2142r(MenuC0907l menuC0907l) {
        C1005k c1005k;
        if (this.f3145K) {
            return;
        }
        this.f3145K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3176r;
        actionBarOverlayLayout.m1395k();
        ActionMenuView actionMenuView = ((C1034t1) actionBarOverlayLayout.f1690e).f4054a.f1797a;
        if (actionMenuView != null && (c1005k = actionMenuView.f1716t) != null) {
            c1005k.m2487f();
            C0990f c0990f = c1005k.f3981u;
            if (c0990f != null && c0990f.m2361b()) {
                c0990f.f3739i.dismiss();
            }
        }
        Window.Callback callback = this.f3170l.getCallback();
        if (callback != null && !this.f3151Q) {
            callback.onPanelClosed(108, menuC0907l);
        }
        this.f3145K = false;
    }

    /* renamed from: s */
    public final void m2143s(C0796t c0796t, boolean z2) {
        C0795s c0795s;
        InterfaceC1021p0 interfaceC1021p0;
        C1005k c1005k;
        if (z2 && c0796t.f3115a == 0 && (interfaceC1021p0 = this.f3176r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1021p0;
            actionBarOverlayLayout.m1395k();
            ActionMenuView actionMenuView = ((C1034t1) actionBarOverlayLayout.f1690e).f4054a.f1797a;
            if (actionMenuView != null && (c1005k = actionMenuView.f1716t) != null && c1005k.m2488i()) {
                m2142r(c0796t.f3122h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f3169k.getSystemService("window");
        if (windowManager != null && c0796t.f3127m && (c0795s = c0796t.f3119e) != null) {
            windowManager.removeView(c0795s);
            if (z2) {
                m2141q(c0796t.f3115a, c0796t, null);
            }
        }
        c0796t.f3125k = false;
        c0796t.f3126l = false;
        c0796t.f3127m = false;
        c0796t.f3120f = null;
        c0796t.f3128n = true;
        if (this.f3147M == c0796t) {
            this.f3147M = null;
        }
        if (c0796t.f3115a == 0) {
            m2138I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r7.m2487f() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0102, code lost:
    
        if (r7.m2489o() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2144u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p076e.LayoutInflaterFactory2C0797u.m2144u(android.view.KeyEvent):boolean");
    }

    /* renamed from: v */
    public final void m2145v(int i2) {
        C0796t m2149z = m2149z(i2);
        if (m2149z.f3122h != null) {
            Bundle bundle = new Bundle();
            m2149z.f3122h.m2347t(bundle);
            if (bundle.size() > 0) {
                m2149z.f3130p = bundle;
            }
            m2149z.f3122h.m2350w();
            m2149z.f3122h.clear();
        }
        m2149z.f3129o = true;
        m2149z.f3128n = true;
        if ((i2 == 108 || i2 == 0) && this.f3176r != null) {
            C0796t m2149z2 = m2149z(0);
            m2149z2.f3125k = false;
            m2136G(m2149z2, null);
        }
    }

    /* renamed from: w */
    public final void m2146w() {
        ViewGroup viewGroup;
        int i2 = 1;
        int i3 = 0;
        if (this.f3184z) {
            return;
        }
        int[] iArr = AbstractC0734a.f2920j;
        Context context = this.f3169k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            mo2112h(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            mo2112h(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            mo2112h(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            mo2112h(10);
        }
        this.f3143I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        m2147x();
        this.f3170l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f3144J) {
            viewGroup = this.f3142H ? (ViewGroup) from.inflate(com.nfupay.s145.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.nfupay.s145.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f3143I) {
            viewGroup = (ViewGroup) from.inflate(com.nfupay.s145.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f3141G = false;
            this.f3140F = false;
        } else if (this.f3140F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.nfupay.s145.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0876d(context, typedValue.resourceId) : context).inflate(com.nfupay.s145.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1021p0 interfaceC1021p0 = (InterfaceC1021p0) viewGroup.findViewById(com.nfupay.s145.R.id.decor_content_parent);
            this.f3176r = interfaceC1021p0;
            interfaceC1021p0.setWindowCallback(this.f3170l.getCallback());
            if (this.f3141G) {
                ((ActionBarOverlayLayout) this.f3176r).m1394j(109);
            }
            if (this.f3138D) {
                ((ActionBarOverlayLayout) this.f3176r).m1394j(2);
            }
            if (this.f3139E) {
                ((ActionBarOverlayLayout) this.f3176r).m1394j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f3140F + ", windowActionBarOverlay: " + this.f3141G + ", android:windowIsFloating: " + this.f3143I + ", windowActionModeOverlay: " + this.f3142H + ", windowNoTitle: " + this.f3144J + " }");
        }
        C0788l c0788l = new C0788l(this, i3);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        AbstractC0261E.m760u(viewGroup, c0788l);
        if (this.f3176r == null) {
            this.f3136B = (TextView) viewGroup.findViewById(com.nfupay.s145.R.id.title);
        }
        Method method = AbstractC0925A1.f3755a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.nfupay.s145.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f3170l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f3170l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0788l(this, i2));
        this.f3135A = viewGroup;
        Object obj = this.f3168j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f3175q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1021p0 interfaceC1021p02 = this.f3176r;
            if (interfaceC1021p02 != null) {
                interfaceC1021p02.setWindowTitle(title);
            } else {
                C0776H c0776h = this.f3173o;
                if (c0776h != null) {
                    C1034t1 c1034t1 = (C1034t1) c0776h.f3033r;
                    if (!c1034t1.f4060g) {
                        c1034t1.f4061h = title;
                        if ((c1034t1.f4055b & 8) != 0) {
                            Toolbar toolbar = c1034t1.f4054a;
                            toolbar.setTitle(title);
                            if (c1034t1.f4060g) {
                                AbstractC0272P.m824n(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f3136B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f3135A.findViewById(R.id.content);
        View decorView = this.f3170l.getDecorView();
        contentFrameLayout2.f1733g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = AbstractC0272P.f768a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f3184z = true;
        C0796t m2149z = m2149z(0);
        if (this.f3151Q || m2149z.f3122h != null) {
            return;
        }
        m2131B(108);
    }

    /* renamed from: x */
    public final void m2147x() {
        if (this.f3170l == null) {
            Object obj = this.f3168j;
            if (obj instanceof Activity) {
                m2140o(((Activity) obj).getWindow());
            }
        }
        if (this.f3170l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: y */
    public final AbstractC0632f m2148y(Context context) {
        if (this.f3157W == null) {
            if (C0176h.f512e == null) {
                Context applicationContext = context.getApplicationContext();
                C0176h.f512e = new C0176h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f3157W = new C0793q(this, C0176h.f512e);
        }
        return this.f3157W;
    }

    /* renamed from: z */
    public final C0796t m2149z(int i2) {
        C0796t[] c0796tArr = this.f3146L;
        if (c0796tArr == null || c0796tArr.length <= i2) {
            C0796t[] c0796tArr2 = new C0796t[i2 + 1];
            if (c0796tArr != null) {
                System.arraycopy(c0796tArr, 0, c0796tArr2, 0, c0796tArr.length);
            }
            this.f3146L = c0796tArr2;
            c0796tArr = c0796tArr2;
        }
        C0796t c0796t = c0796tArr[i2];
        if (c0796t != null) {
            return c0796t;
        }
        C0796t c0796t2 = new C0796t();
        c0796t2.f3115a = i2;
        c0796t2.f3128n = false;
        c0796tArr[i2] = c0796t2;
        return c0796t2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
