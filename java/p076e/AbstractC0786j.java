package p076e;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p016G.C0166g;
import p101o.C1153c;
import p101o.C1157g;

/* renamed from: e.j */
/* loaded from: classes.dex */
public abstract class AbstractC0786j {

    /* renamed from: a */
    public static final ExecutorC0769A f3089a = new ExecutorC0769A(new ExecutorC0770B());

    /* renamed from: b */
    public static final int f3090b = -100;

    /* renamed from: c */
    public static C0166g f3091c = null;

    /* renamed from: d */
    public static C0166g f3092d = null;

    /* renamed from: e */
    public static Boolean f3093e = null;

    /* renamed from: f */
    public static boolean f3094f = false;

    /* renamed from: g */
    public static final C1153c f3095g = new C1153c();

    /* renamed from: h */
    public static final Object f3096h = new Object();

    /* renamed from: i */
    public static final Object f3097i = new Object();

    /* renamed from: c */
    public static boolean m2106c(Context context) {
        if (f3093e == null) {
            try {
                int i2 = AbstractServiceC0802z.f3199a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0802z.class), AbstractC0801y.m2151a() | 128).metaData;
                if (bundle != null) {
                    f3093e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f3093e = Boolean.FALSE;
            }
        }
        return f3093e.booleanValue();
    }

    /* renamed from: g */
    public static void m2107g(LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u) {
        synchronized (f3096h) {
            try {
                Iterator it = f3095g.iterator();
                while (true) {
                    C1157g c1157g = (C1157g) it;
                    if (c1157g.hasNext()) {
                        AbstractC0786j abstractC0786j = (AbstractC0786j) ((WeakReference) c1157g.next()).get();
                        if (abstractC0786j == layoutInflaterFactory2C0797u || abstractC0786j == null) {
                            c1157g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2108a();

    /* renamed from: b */
    public abstract void mo2109b();

    /* renamed from: d */
    public abstract void mo2110d();

    /* renamed from: f */
    public abstract void mo2111f();

    /* renamed from: h */
    public abstract boolean mo2112h(int i2);

    /* renamed from: i */
    public abstract void mo2113i(int i2);

    /* renamed from: j */
    public abstract void mo2114j(View view);

    /* renamed from: k */
    public abstract void mo2115k(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: m */
    public abstract void mo2116m(CharSequence charSequence);
}
