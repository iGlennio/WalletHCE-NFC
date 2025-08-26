package p076e;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.AbstractActivityC0571k;
import androidx.fragment.app.AbstractComponentCallbacksC0641o;
import androidx.fragment.app.C0615E;
import androidx.fragment.app.C0622L;
import androidx.fragment.app.C0642p;
import androidx.fragment.app.C0643q;
import androidx.fragment.app.C0644r;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0677l;
import androidx.lifecycle.EnumC0678m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import nfc.share.nfcshare.MainActivity;
import p002B.AbstractC0012b;
import p002B.AbstractC0026p;
import p002B.C0019i;
import p005C.C0046i;
import p010D1.AbstractC0096d;
import p016G.AbstractC0161b;
import p016G.C0166g;
import p047Q1.AbstractC0458e;
import p074d0.RunnableC0741g;
import p081g0.C0869d;
import p083h.C0876d;
import p083h.C0881i;
import p083h.C0883k;
import p088j.AbstractC1049y1;
import p088j.C0958R0;
import p088j.C1034t1;
import p088j.C1035u;
import p095l1.AbstractC1136c;
import p101o.C1155e;

/* renamed from: e.f */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0782f extends AbstractActivityC0571k implements InterfaceC0783g {

    /* renamed from: p */
    public final C0046i f3083p;

    /* renamed from: r */
    public boolean f3085r;

    /* renamed from: s */
    public boolean f3086s;

    /* renamed from: u */
    public LayoutInflaterFactory2C0797u f3088u;

    /* renamed from: q */
    public final C0685t f3084q = new C0685t(this);

    /* renamed from: t */
    public boolean f3087t = true;

    public AbstractActivityC0782f() {
        MainActivity mainActivity = (MainActivity) this;
        this.f3083p = new C0046i(18, new C0644r(mainActivity));
        ((C0869d) this.f1584e.f1251c).m2291e("android:support:fragments", new C0642p(mainActivity, 0));
        m1363g(new C0643q(mainActivity, 0));
        ((C0869d) this.f1584e.f1251c).m2291e("androidx:appcompat", new C0642p(mainActivity, 1));
        m1363g(new C0643q(mainActivity, 1));
    }

    /* renamed from: k */
    public static boolean m2093k(C0615E c0615e) {
        boolean z2 = false;
        for (AbstractComponentCallbacksC0641o abstractComponentCallbacksC0641o : c0615e.f2038c.m545t()) {
            if (abstractComponentCallbacksC0641o != null) {
                C0644r c0644r = abstractComponentCallbacksC0641o.f2237s;
                if ((c0644r == null ? null : c0644r.f2253l) != null) {
                    z2 |= m2093k(abstractComponentCallbacksC0641o.m1665g());
                }
                C0622L c0622l = abstractComponentCallbacksC0641o.f2215M;
                EnumC0678m enumC0678m = EnumC0678m.f2317d;
                if (c0622l != null) {
                    c0622l.m1628f();
                    if (c0622l.f2108b.f2325c.compareTo(enumC0678m) >= 0) {
                        abstractComponentCallbacksC0641o.f2215M.f2108b.m1705g();
                        z2 = true;
                    }
                }
                if (abstractComponentCallbacksC0641o.f2214L.f2325c.compareTo(enumC0678m) >= 0) {
                    abstractComponentCallbacksC0641o.f2214L.m1705g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2095j();
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2094i();
        layoutInflaterFactory2C0797u.m2146w();
        ((ViewGroup) layoutInflaterFactory2C0797u.f3135A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0797u.f3171m.m2124a(layoutInflaterFactory2C0797u.f3170l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2094i();
        layoutInflaterFactory2C0797u.f3149O = true;
        int i10 = layoutInflaterFactory2C0797u.f3153S;
        if (i10 == -100) {
            i10 = AbstractC0786j.f3090b;
        }
        int m2132C = layoutInflaterFactory2C0797u.m2132C(context, i10);
        if (AbstractC0786j.m2106c(context) && AbstractC0786j.m2106c(context)) {
            if (!AbstractC0161b.m495a()) {
                synchronized (AbstractC0786j.f3097i) {
                    try {
                        C0166g c0166g = AbstractC0786j.f3091c;
                        if (c0166g == null) {
                            if (AbstractC0786j.f3092d == null) {
                                AbstractC0786j.f3092d = C0166g.m502a(AbstractC0458e.m1177Q(context));
                            }
                            if (!AbstractC0786j.f3092d.f498a.f499a.isEmpty()) {
                                AbstractC0786j.f3091c = AbstractC0786j.f3092d;
                            }
                        } else if (!c0166g.equals(AbstractC0786j.f3092d)) {
                            C0166g c0166g2 = AbstractC0786j.f3091c;
                            AbstractC0786j.f3092d = c0166g2;
                            AbstractC0458e.m1176P(context, c0166g2.f498a.f499a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0786j.f3094f) {
                AbstractC0786j.f3089a.execute(new RunnableC0741g(context, 2));
            }
        }
        C0166g m2128p = LayoutInflaterFactory2C0797u.m2128p(context);
        if (LayoutInflaterFactory2C0797u.f3134k0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0797u.m2129t(context, m2132C, m2128p, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0876d) {
            try {
                ((C0876d) context).m2293a(LayoutInflaterFactory2C0797u.m2129t(context, m2132C, m2128p, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0797u.f3133j0) {
            int i11 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i12 = configuration3.mcc;
                    int i13 = configuration4.mcc;
                    if (i12 != i13) {
                        configuration.mcc = i13;
                    }
                    int i14 = configuration3.mnc;
                    int i15 = configuration4.mnc;
                    if (i14 != i15) {
                        configuration.mnc = i15;
                    }
                    AbstractC0790n.m2117a(configuration3, configuration4, configuration);
                    int i16 = configuration3.touchscreen;
                    int i17 = configuration4.touchscreen;
                    if (i16 != i17) {
                        configuration.touchscreen = i17;
                    }
                    int i18 = configuration3.keyboard;
                    int i19 = configuration4.keyboard;
                    if (i18 != i19) {
                        configuration.keyboard = i19;
                    }
                    int i20 = configuration3.keyboardHidden;
                    int i21 = configuration4.keyboardHidden;
                    if (i20 != i21) {
                        configuration.keyboardHidden = i21;
                    }
                    int i22 = configuration3.navigation;
                    int i23 = configuration4.navigation;
                    if (i22 != i23) {
                        configuration.navigation = i23;
                    }
                    int i24 = configuration3.navigationHidden;
                    int i25 = configuration4.navigationHidden;
                    if (i24 != i25) {
                        configuration.navigationHidden = i25;
                    }
                    int i26 = configuration3.orientation;
                    int i27 = configuration4.orientation;
                    if (i26 != i27) {
                        configuration.orientation = i27;
                    }
                    int i28 = configuration3.screenLayout & 15;
                    int i29 = configuration4.screenLayout & 15;
                    if (i28 != i29) {
                        configuration.screenLayout |= i29;
                    }
                    int i30 = configuration3.screenLayout & 192;
                    int i31 = configuration4.screenLayout & 192;
                    if (i30 != i31) {
                        configuration.screenLayout |= i31;
                    }
                    int i32 = configuration3.screenLayout & 48;
                    int i33 = configuration4.screenLayout & 48;
                    if (i32 != i33) {
                        configuration.screenLayout |= i33;
                    }
                    int i34 = configuration3.screenLayout & 768;
                    int i35 = configuration4.screenLayout & 768;
                    if (i34 != i35) {
                        configuration.screenLayout |= i35;
                    }
                    if (i11 >= 26) {
                        i2 = configuration3.colorMode;
                        int i36 = i2 & 3;
                        i3 = configuration4.colorMode;
                        if (i36 != (i3 & 3)) {
                            i8 = configuration.colorMode;
                            i9 = configuration4.colorMode;
                            configuration.colorMode = i8 | (i9 & 3);
                        }
                        i4 = configuration3.colorMode;
                        int i37 = i4 & 12;
                        i5 = configuration4.colorMode;
                        if (i37 != (i5 & 12)) {
                            i6 = configuration.colorMode;
                            i7 = configuration4.colorMode;
                            configuration.colorMode = i6 | (i7 & 12);
                        }
                    }
                    int i38 = configuration3.uiMode & 15;
                    int i39 = configuration4.uiMode & 15;
                    if (i38 != i39) {
                        configuration.uiMode |= i39;
                    }
                    int i40 = configuration3.uiMode & 48;
                    int i41 = configuration4.uiMode & 48;
                    if (i40 != i41) {
                        configuration.uiMode |= i41;
                    }
                    int i42 = configuration3.screenWidthDp;
                    int i43 = configuration4.screenWidthDp;
                    if (i42 != i43) {
                        configuration.screenWidthDp = i43;
                    }
                    int i44 = configuration3.screenHeightDp;
                    int i45 = configuration4.screenHeightDp;
                    if (i44 != i45) {
                        configuration.screenHeightDp = i45;
                    }
                    int i46 = configuration3.smallestScreenWidthDp;
                    int i47 = configuration4.smallestScreenWidthDp;
                    if (i46 != i47) {
                        configuration.smallestScreenWidthDp = i47;
                    }
                    int i48 = configuration3.densityDpi;
                    int i49 = configuration4.densityDpi;
                    if (i48 != i49) {
                        configuration.densityDpi = i49;
                    }
                }
            }
            Configuration m2129t = LayoutInflaterFactory2C0797u.m2129t(context, m2132C, m2128p, configuration, true);
            C0876d c0876d = new C0876d(context, com.nfupay.s145.R.style.Theme_AppCompat_Empty);
            c0876d.m2293a(m2129t);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0876d.getTheme();
                    if (i11 >= 29) {
                        AbstractC0026p.m88a(theme);
                    } else {
                        synchronized (AbstractC0012b.f31e) {
                            if (!AbstractC0012b.f33g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    AbstractC0012b.f32f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                AbstractC0012b.f33g = true;
                            }
                            Method method = AbstractC0012b.f32f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                    AbstractC0012b.f32f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0876d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C0797u) m2094i()).m2130A();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p133z.AbstractActivityC1328e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0797u) m2094i()).m2130A();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f3085r);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3086s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3087t);
        if (getApplication() != null) {
            new C0019i(this, mo1361c()).m78t(str2, printWriter);
        }
        ((C0644r) this.f3083p.f116b).f2252k.m1600u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i2) {
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2094i();
        layoutInflaterFactory2C0797u.m2146w();
        return layoutInflaterFactory2C0797u.f3170l.findViewById(i2);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2094i();
        if (layoutInflaterFactory2C0797u.f3174p == null) {
            layoutInflaterFactory2C0797u.m2130A();
            C0776H c0776h = layoutInflaterFactory2C0797u.f3173o;
            layoutInflaterFactory2C0797u.f3174p = new C0881i(c0776h != null ? c0776h.m2079p0() : layoutInflaterFactory2C0797u.f3169k);
        }
        return layoutInflaterFactory2C0797u.f3174p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i2 = AbstractC1049y1.f4120a;
        return super.getResources();
    }

    /* renamed from: i */
    public final AbstractC0786j m2094i() {
        if (this.f3088u == null) {
            ExecutorC0769A executorC0769A = AbstractC0786j.f3089a;
            this.f3088u = new LayoutInflaterFactory2C0797u(this, null, this, this);
        }
        return this.f3088u;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m2094i().mo2109b();
    }

    /* renamed from: j */
    public final void m2095j() {
        View decorView = getWindow().getDecorView();
        AbstractC1136c.m2637e(decorView, "<this>");
        decorView.setTag(com.nfupay.s145.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1136c.m2637e(decorView2, "<this>");
        decorView2.setTag(com.nfupay.s145.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC1136c.m2637e(decorView3, "<this>");
        decorView3.setTag(com.nfupay.s145.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC1136c.m2637e(decorView4, "<this>");
        decorView4.setTag(com.nfupay.s145.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    /* renamed from: l */
    public final void m2096l(Configuration configuration) {
        C0046i c0046i = this.f3083p;
        c0046i.m187w();
        super.onConfigurationChanged(configuration);
        ((C0644r) c0046i.f116b).f2252k.m1587h();
    }

    /* renamed from: m */
    public final void m2097m() {
        super.onDestroy();
        ((C0644r) this.f3083p.f116b).f2252k.m1590k();
        this.f3084q.m1702d(EnumC0677l.ON_DESTROY);
    }

    /* renamed from: n */
    public final boolean m2098n(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        C0046i c0046i = this.f3083p;
        if (i2 == 0) {
            return ((C0644r) c0046i.f116b).f2252k.m1593n();
        }
        if (i2 != 6) {
            return false;
        }
        return ((C0644r) c0046i.f116b).f2252k.m1588i();
    }

    /* renamed from: o */
    public final void m2099o(int i2, Menu menu) {
        if (i2 == 0) {
            ((C0644r) this.f3083p.f116b).f2252k.m1594o();
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        this.f3083p.m187w();
        super.onActivityResult(i2, i3, intent);
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        m2096l(configuration);
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2094i();
        if (layoutInflaterFactory2C0797u.f3140F && layoutInflaterFactory2C0797u.f3184z) {
            layoutInflaterFactory2C0797u.m2130A();
            C0776H c0776h = layoutInflaterFactory2C0797u.f3173o;
            if (c0776h != null) {
                c0776h.m2082s0(c0776h.f3029n.getResources().getBoolean(com.nfupay.s145.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1035u m2527a = C1035u.m2527a();
        Context context = layoutInflaterFactory2C0797u.f3169k;
        synchronized (m2527a) {
            C0958R0 c0958r0 = m2527a.f4071a;
            synchronized (c0958r0) {
                C1155e c1155e = (C1155e) c0958r0.f3848b.get(context);
                if (c1155e != null) {
                    c1155e.m2668a();
                }
            }
        }
        layoutInflaterFactory2C0797u.f3152R = new Configuration(layoutInflaterFactory2C0797u.f3169k.getResources().getConfiguration());
        layoutInflaterFactory2C0797u.m2139n(false, false);
    }

    @Override // androidx.activity.AbstractActivityC0571k, p133z.AbstractActivityC1328e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3084q.m1702d(EnumC0677l.ON_CREATE);
        C0615E c0615e = ((C0644r) this.f3083p.f116b).f2252k;
        c0615e.f2060y = false;
        c0615e.f2061z = false;
        c0615e.f2034F.f2080h = false;
        c0615e.m1598s(1);
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            super.onCreatePanelMenu(i2, menu);
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        ((C0644r) this.f3083p.f116b).f2252k.m1589j();
        return true;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0644r) this.f3083p.f116b).f2252k.f2041f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        m2097m();
        m2094i().mo2111f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ((C0644r) this.f3083p.f116b).f2252k.m1591l();
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent m323C;
        if (!m2098n(i2, menuItem)) {
            LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2094i();
            layoutInflaterFactory2C0797u.m2130A();
            C0776H c0776h = layoutInflaterFactory2C0797u.f3173o;
            if (menuItem.getItemId() != 16908332 || c0776h == null || (((C1034t1) c0776h.f3033r).f4055b & 4) == 0 || (m323C = AbstractC0096d.m323C(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(m323C)) {
                navigateUpTo(m323C);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent m323C2 = AbstractC0096d.m323C(this);
            if (m323C2 == null) {
                m323C2 = AbstractC0096d.m323C(this);
            }
            if (m323C2 != null) {
                ComponentName component = m323C2.getComponent();
                if (component == null) {
                    component = m323C2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent m324D = AbstractC0096d.m324D(this, component);
                    while (m324D != null) {
                        arrayList.add(size, m324D);
                        m324D = AbstractC0096d.m324D(this, m324D.getComponent());
                    }
                    arrayList.add(m323C2);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2) {
        ((C0644r) this.f3083p.f116b).f2252k.m1592m();
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        this.f3083p.m187w();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        m2099o(i2, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f3086s = false;
        ((C0644r) this.f3083p.f116b).f2252k.m1598s(5);
        this.f3084q.m1702d(EnumC0677l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2) {
        ((C0644r) this.f3083p.f116b).f2252k.m1596q();
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0797u) m2094i()).m2146w();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        m2100p();
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2094i();
        layoutInflaterFactory2C0797u.m2130A();
        C0776H c0776h = layoutInflaterFactory2C0797u.f3173o;
        if (c0776h != null) {
            c0776h.f3024G = true;
        }
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            super.onPreparePanel(i2, view, menu);
            return true;
        }
        super.onPreparePanel(0, view, menu);
        ((C0644r) this.f3083p.f116b).f2252k.m1597r();
        return true;
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f3083p.m187w();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0046i c0046i = this.f3083p;
        c0046i.m187w();
        super.onResume();
        this.f3086s = true;
        ((C0644r) c0046i.f116b).f2252k.m1603x(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        m2101q();
        ((LayoutInflaterFactory2C0797u) m2094i()).m2139n(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f3083p.m187w();
    }

    @Override // android.app.Activity
    public final void onStop() {
        m2102r();
        LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = (LayoutInflaterFactory2C0797u) m2094i();
        layoutInflaterFactory2C0797u.m2130A();
        C0776H c0776h = layoutInflaterFactory2C0797u.f3173o;
        if (c0776h != null) {
            c0776h.f3024G = false;
            C0883k c0883k = c0776h.f3023F;
            if (c0883k != null) {
                c0883k.m2299a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        m2094i().mo2116m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C0797u) m2094i()).m2130A();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public final void m2100p() {
        super.onPostResume();
        this.f3084q.m1702d(EnumC0677l.ON_RESUME);
        C0615E c0615e = ((C0644r) this.f3083p.f116b).f2252k;
        c0615e.f2060y = false;
        c0615e.f2061z = false;
        c0615e.f2034F.f2080h = false;
        c0615e.m1598s(7);
    }

    /* renamed from: q */
    public final void m2101q() {
        C0046i c0046i = this.f3083p;
        c0046i.m187w();
        super.onStart();
        this.f3087t = false;
        boolean z2 = this.f3085r;
        C0644r c0644r = (C0644r) c0046i.f116b;
        if (!z2) {
            this.f3085r = true;
            C0615E c0615e = c0644r.f2252k;
            c0615e.f2060y = false;
            c0615e.f2061z = false;
            c0615e.f2034F.f2080h = false;
            c0615e.m1598s(4);
        }
        c0644r.f2252k.m1603x(true);
        this.f3084q.m1702d(EnumC0677l.ON_START);
        C0615E c0615e2 = c0644r.f2252k;
        c0615e2.f2060y = false;
        c0615e2.f2061z = false;
        c0615e2.f2034F.f2080h = false;
        c0615e2.m1598s(5);
    }

    /* renamed from: r */
    public final void m2102r() {
        C0046i c0046i;
        super.onStop();
        this.f3087t = true;
        do {
            c0046i = this.f3083p;
        } while (m2093k(((C0644r) c0046i.f116b).f2252k));
        C0615E c0615e = ((C0644r) c0046i.f116b).f2252k;
        c0615e.f2061z = true;
        c0615e.f2034F.f2080h = true;
        c0615e.m1598s(4);
        this.f3084q.m1702d(EnumC0677l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i2) {
        m2095j();
        m2094i().mo2113i(i2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        super.setTheme(i2);
        ((LayoutInflaterFactory2C0797u) m2094i()).f3154T = i2;
    }

    @Override // androidx.activity.AbstractActivityC0571k, android.app.Activity
    public void setContentView(View view) {
        m2095j();
        m2094i().mo2114j(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0644r) this.f3083p.f116b).f2252k.f2041f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2095j();
        m2094i().mo2115k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
