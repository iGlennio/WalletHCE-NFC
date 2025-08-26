package p014F0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ExecutorC0570j;
import androidx.emoji2.text.C0602p;
import androidx.emoji2.text.C0605s;
import androidx.lifecycle.C0654B;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0677l;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.AbstractC0729e;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import nfc.share.nfcshare.App;
import nfc.share.nfcshare.MainActivity;
import p000A.AbstractC0001b;
import p005C.AbstractC0047j;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p016G.AbstractC0168i;
import p017G0.C0173e;
import p017G0.C0176h;
import p017G0.InterfaceC0170b;
import p018H.C0191k;
import p018H.RunnableC0181a;
import p034M0.C0360e;
import p037N0.C0389f;
import p043P0.C0411e;
import p043P0.C0417k;
import p047Q1.AbstractC0458e;
import p052T.C0483e;
import p076e.AbstractActivityC0782f;
import p076e.DialogC0781e;
import p095l1.AbstractC1136c;
import p118t1.AbstractActivityC1233c;
import p118t1.AbstractC1232b;
import p118t1.AbstractC1244n;
import p118t1.C1234d;
import p123v1.C1285o;
import p133z.AbstractC1325b;
import p133z.C1324a;

/* renamed from: F0.G */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0130G implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f354a;

    /* renamed from: b */
    public final /* synthetic */ Object f355b;

    public /* synthetic */ RunnableC0130G(int i2, Object obj) {
        this.f354a = i2;
        this.f355b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C1324a c1324a;
        Handler handler;
        Application application = null;
        ?? r5 = 1;
        r5 = 1;
        switch (this.f354a) {
            case 0:
                View view = (View) this.f355b;
                ((InputMethodManager) AbstractC0001b.m4b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 1:
                C0176h c0176h = (C0176h) this.f355b;
                C0173e c0173e = (C0173e) c0176h.f515b;
                if (c0173e != null) {
                    c0173e.m517b((InterfaceC0170b) c0176h.f516c, (NavigationView) c0176h.f517d, true);
                    return;
                }
                return;
            case 2:
                C0389f c0389f = (C0389f) this.f355b;
                c0389f.f1039c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0389f.f1041e;
                C0483e c0483e = sideSheetBehavior.f2770i;
                if (c0483e != null && c0483e.m1246g()) {
                    c0389f.m1052a(c0389f.f1038b);
                    return;
                } else {
                    if (sideSheetBehavior.f2769h == 2) {
                        sideSheetBehavior.m1973w(c0389f.f1038b);
                        return;
                    }
                    return;
                }
            case 3:
                ((C0411e) this.f355b).m1074t(true);
                return;
            case 4:
                C0417k c0417k = (C0417k) this.f355b;
                boolean isPopupShowing = c0417k.f1095h.isPopupShowing();
                c0417k.m1083t(isPopupShowing);
                c0417k.f1100m = isPopupShowing;
                return;
            case 5:
                ((TextInputLayout) this.f355b).f2823d.requestLayout();
                return;
            case 6:
                ((AbstractActivityC0782f) this.f355b).invalidateOptionsMenu();
                return;
            case 7:
                ExecutorC0570j executorC0570j = (ExecutorC0570j) this.f355b;
                Runnable runnable = executorC0570j.f1578b;
                if (runnable != null) {
                    runnable.run();
                    executorC0570j.f1578b = null;
                    return;
                }
                return;
            case 8:
                DialogC0781e.m2085a((DialogC0781e) this.f355b);
                return;
            case 9:
                C0602p c0602p = (C0602p) this.f355b;
                synchronized (c0602p.f2003d) {
                    try {
                        if (c0602p.f2007h == null) {
                            return;
                        }
                        try {
                            C0191k m1537b = c0602p.m1537b();
                            int i2 = m1537b.f560e;
                            if (i2 == 2) {
                                synchronized (c0602p.f2003d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = AbstractC0168i.f500a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0360e c0360e = c0602p.f2002c;
                                Context context = c0602p.f2000a;
                                c0360e.getClass();
                                Typeface mo194o = AbstractC0047j.f117a.mo194o(context, new C0191k[]{m1537b}, 0);
                                MappedByteBuffer m392G = AbstractC0104l.m392G(c0602p.f2000a, m1537b.f556a);
                                if (m392G == null || mo194o == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0605s c0605s = new C0605s(mo194o, AbstractC0096d.m335X(m392G));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0602p.f2003d) {
                                        try {
                                            AbstractC0458e abstractC0458e = c0602p.f2007h;
                                            if (abstractC0458e != null) {
                                                abstractC0458e.mo1213O(c0605s);
                                            }
                                        } finally {
                                        }
                                    }
                                    c0602p.m1536a();
                                    return;
                                } finally {
                                    int i4 = AbstractC0168i.f500a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (c0602p.f2003d) {
                                try {
                                    AbstractC0458e abstractC0458e2 = c0602p.f2007h;
                                    if (abstractC0458e2 != null) {
                                        abstractC0458e2.mo1210J(th2);
                                    }
                                    c0602p.m1536a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 10:
                C0654B c0654b = (C0654B) this.f355b;
                AbstractC1136c.m2637e(c0654b, "this$0");
                int i5 = c0654b.f2274b;
                C0685t c0685t = c0654b.f2278f;
                if (i5 == 0) {
                    c0654b.f2275c = true;
                    c0685t.m1702d(EnumC0677l.ON_PAUSE);
                }
                if (c0654b.f2273a == 0 && c0654b.f2275c) {
                    c0685t.m1702d(EnumC0677l.ON_STOP);
                    c0654b.f2276d = true;
                    return;
                }
                return;
            case 11:
                ((AbstractC0729e) this.f355b).mo2008m();
                return;
            case 12:
                MainActivity mainActivity = ((C1234d) this.f355b).f4828b;
                C1285o c1285o = AbstractC1232b.f4825a;
                SharedPreferences.Editor edit = mainActivity.getSharedPreferences("UserSession", 0).edit();
                edit.clear();
                edit.apply();
                App.f4363b.f4364a = null;
                C0176h.f513f = false;
                C0176h c0176h2 = AbstractC1244n.f4848b;
                if (c0176h2 != null) {
                    c0176h2.m535i();
                    AbstractC1244n.f4848b = null;
                }
                Intent intent = new Intent(mainActivity, (Class<?>) AbstractActivityC1233c.class);
                intent.addFlags(67141632);
                mainActivity.startActivity(intent);
                mainActivity.finish();
                AbstractC1244n.f4850d = null;
                if (mainActivity.f4366B.isShowing()) {
                    mainActivity.f4366B.dismiss();
                    return;
                }
                return;
            case 13:
                ((CarouselLayoutManager) this.f355b).m2186l0();
                return;
            default:
                Activity activity = (Activity) this.f355b;
                if (activity.isFinishing()) {
                    return;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    Class cls = AbstractC1325b.f5429a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC1325b.f5429a;
                ?? r6 = 27;
                boolean z2 = i6 == 26 || i6 == 27;
                Method method = AbstractC1325b.f5434f;
                if ((!z2 || method != null) && (AbstractC1325b.f5433e != null || AbstractC1325b.f5432d != null)) {
                    try {
                        Object obj2 = AbstractC1325b.f5431c.get(activity);
                        if (obj2 != null && (obj = AbstractC1325b.f5430b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            C1324a c1324a2 = new C1324a(activity);
                            application2.registerActivityLifecycleCallbacks(c1324a2);
                            Handler handler2 = AbstractC1325b.f5435g;
                            handler2.post(new RunnableC0181a(c1324a2, 7, obj2));
                            if (i6 != 26 && i6 != 27) {
                                r5 = 0;
                            }
                            try {
                                if (r5 != 0) {
                                    Handler handler3 = handler2;
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        application = application2;
                                        r6 = c1324a2;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                        r5 = handler3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        application = application2;
                                        c1324a = c1324a2;
                                        handler = handler3;
                                        handler.post(new RunnableC0181a(application, 8, c1324a));
                                        throw th;
                                    }
                                } else {
                                    application = application2;
                                    r6 = c1324a2;
                                    r5 = handler2;
                                    activity.recreate();
                                }
                                r5.post(new RunnableC0181a(application, 8, (Object) r6));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                handler = r5;
                                c1324a = r6;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
        }
    }
}
