package p005C;

import android.animation.Animator;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.emoji2.text.InterfaceC0595i;
import androidx.emoji2.text.RunnableC0597k;
import androidx.emoji2.text.ThreadFactoryC0587a;
import androidx.fragment.app.C0625O;
import androidx.fragment.app.C0644r;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002B.C0019i;
import p010D1.AbstractC0096d;
import p016G.InterfaceC0162c;
import p025J0.AbstractC0232e;
import p027K.C0292f;
import p027K.InterfaceC0286c;
import p027K.InterfaceC0290e;
import p030L.C0342i;
import p030L.C0343j;
import p030L.C0344k;
import p030L.InterfaceC0352s;
import p040O0.C0396e;
import p047Q1.AbstractC0458e;
import p055U0.AbstractC0506t;
import p055U0.InterfaceC0501o;
import p060X.C0539g;
import p061X0.AbstractC0545c;
import p074d0.InterfaceC0739e;
import p086i.C0900e;
import p086i.C0909n;
import p086i.InterfaceC0905j;
import p086i.InterfaceC0919x;
import p086i.MenuC0907l;
import p086i.RunnableC0899d;
import p086i.SubMenuC0895E;
import p086i.ViewOnKeyListenerC0901f;
import p088j.C1005k;
import p088j.C1013m1;
import p088j.InterfaceC0945K0;
import p088j.InterfaceC1014n;
import p109q1.InterfaceC1185b;

/* renamed from: C.i */
/* loaded from: classes.dex */
public class C0046i implements InterfaceC0286c, InterfaceC0290e, InterfaceC0501o, InterfaceC0352s, InterfaceC0595i, InterfaceC0162c, InterfaceC0739e, InterfaceC1185b, InterfaceC0945K0, InterfaceC0919x, InterfaceC0905j {

    /* renamed from: c */
    public static C0046i f114c;

    /* renamed from: a */
    public final /* synthetic */ int f115a;

    /* renamed from: b */
    public Object f116b;

    public /* synthetic */ C0046i(int i2, Object obj) {
        this.f115a = i2;
        this.f116b = obj;
    }

    @Override // p086i.InterfaceC0919x
    /* renamed from: a */
    public void mo165a(MenuC0907l menuC0907l, boolean z2) {
        if (menuC0907l instanceof SubMenuC0895E) {
            ((SubMenuC0895E) menuC0907l).f3597z.mo2324k().m2339c(false);
        }
        InterfaceC0919x interfaceC0919x = ((C1005k) this.f116b).f3965e;
        if (interfaceC0919x != null) {
            interfaceC0919x.mo165a(menuC0907l, z2);
        }
    }

    @Override // p027K.InterfaceC0286c
    /* renamed from: b */
    public void mo166b(Bundle bundle) {
        ((ContentInfo.Builder) this.f116b).setExtras(bundle);
    }

    @Override // p027K.InterfaceC0286c
    /* renamed from: c */
    public void mo167c(Uri uri) {
        ((ContentInfo.Builder) this.f116b).setLinkUri(uri);
    }

    @Override // p027K.InterfaceC0290e
    /* renamed from: d */
    public int mo168d() {
        int source;
        source = ((ContentInfo) this.f116b).getSource();
        return source;
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: e */
    public void mo169e(MenuC0907l menuC0907l) {
        C1013m1 c1013m1 = ((ActionMenuView) this.f116b).f1717u;
        if (c1013m1 != null) {
            c1013m1.mo169e(menuC0907l);
        }
    }

    @Override // p027K.InterfaceC0290e
    /* renamed from: f */
    public ClipData mo170f() {
        ClipData clip;
        clip = ((ContentInfo) this.f116b).getClip();
        return clip;
    }

    @Override // p088j.InterfaceC0945K0
    /* renamed from: g */
    public void mo171g(MenuC0907l menuC0907l, C0909n c0909n) {
        ViewOnKeyListenerC0901f viewOnKeyListenerC0901f = (ViewOnKeyListenerC0901f) this.f116b;
        viewOnKeyListenerC0901f.f3627f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0901f.f3629h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0907l == ((C0900e) arrayList.get(i2)).f3621b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        viewOnKeyListenerC0901f.f3627f.postAtTime(new RunnableC0899d(this, i3 < arrayList.size() ? (C0900e) arrayList.get(i3) : null, c0909n, menuC0907l), menuC0907l, SystemClock.uptimeMillis() + 200);
    }

    @Override // p030L.InterfaceC0352s
    /* renamed from: h */
    public boolean mo172h(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.f116b;
        if (!DrawerLayout.m1490k(view) || drawerLayout.m1498g(view) == 2) {
            return false;
        }
        drawerLayout.m1493b(view, true);
        return true;
    }

    @Override // p086i.InterfaceC0919x
    /* renamed from: i */
    public boolean mo173i(MenuC0907l menuC0907l) {
        C1005k c1005k = (C1005k) this.f116b;
        if (menuC0907l == c1005k.f3963c) {
            return false;
        }
        c1005k.f3985y = ((SubMenuC0895E) menuC0907l).f3596A.f3693a;
        InterfaceC0919x interfaceC0919x = c1005k.f3965e;
        if (interfaceC0919x != null) {
            return interfaceC0919x.mo173i(menuC0907l);
        }
        return false;
    }

    @Override // p109q1.InterfaceC1185b
    public Iterator iterator() {
        return ((List) this.f116b).iterator();
    }

    @Override // p027K.InterfaceC0286c
    /* renamed from: j */
    public C0292f mo174j() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f116b).build();
        return new C0292f(new C0046i(build));
    }

    @Override // p074d0.InterfaceC0739e
    /* renamed from: k */
    public void mo175k(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f116b).setResultCode(i2);
    }

    @Override // p086i.InterfaceC0905j
    /* renamed from: l */
    public boolean mo176l(MenuC0907l menuC0907l, MenuItem menuItem) {
        InterfaceC1014n interfaceC1014n = ((ActionMenuView) this.f116b).f1722z;
        if (interfaceC1014n == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C1013m1) interfaceC1014n).f4007a.f1786G.f48c).iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        return false;
    }

    @Override // p088j.InterfaceC0945K0
    /* renamed from: m */
    public void mo177m(MenuC0907l menuC0907l, C0909n c0909n) {
        ((ViewOnKeyListenerC0901f) this.f116b).f3627f.removeCallbacksAndMessages(menuC0907l);
    }

    @Override // p055U0.InterfaceC0501o
    /* renamed from: n */
    public Object mo178n() {
        switch (this.f115a) {
            case 10:
                Class cls = (Class) this.f116b;
                try {
                    return AbstractC0506t.f1384a.mo1279a(cls);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e2);
                }
            default:
                Constructor constructor = (Constructor) this.f116b;
                try {
                    return constructor.newInstance(new Object[0]);
                } catch (IllegalAccessException e3) {
                    AbstractC0096d abstractC0096d = AbstractC0545c.f1501a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
                } catch (InstantiationException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0545c.m1297b(constructor) + "' with no args", e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0545c.m1297b(constructor) + "' with no args", e5.getCause());
                }
        }
    }

    @Override // p016G.InterfaceC0162c
    /* renamed from: o */
    public void mo179o() {
        switch (this.f115a) {
            case 16:
                ((Animator) this.f116b).end();
                break;
            default:
                ((C0625O) this.f116b).m1630a();
                break;
        }
    }

    @Override // p027K.InterfaceC0290e
    /* renamed from: p */
    public int mo180p() {
        int flags;
        flags = ((ContentInfo) this.f116b).getFlags();
        return flags;
    }

    @Override // p074d0.InterfaceC0739e
    /* renamed from: q */
    public void mo181q() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p027K.InterfaceC0290e
    /* renamed from: r */
    public ContentInfo mo182r() {
        return (ContentInfo) this.f116b;
    }

    @Override // androidx.emoji2.text.InterfaceC0595i
    /* renamed from: s */
    public void mo183s(AbstractC0458e abstractC0458e) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0587a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0597k(this, abstractC0458e, threadPoolExecutor, 0));
    }

    @Override // p027K.InterfaceC0286c
    /* renamed from: t */
    public void mo184t(int i2) {
        ((ContentInfo.Builder) this.f116b).setFlags(i2);
    }

    public String toString() {
        switch (this.f115a) {
            case 3:
                return "ContentInfoCompat{" + ((ContentInfo) this.f116b) + "}";
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public C0342i mo185u(int i2) {
        return null;
    }

    /* renamed from: v */
    public C0342i mo186v(int i2) {
        return null;
    }

    /* renamed from: w */
    public void m187w() {
        ((C0644r) this.f116b).f2252k.m1566J();
    }

    /* renamed from: x */
    public boolean mo188x(int i2, int i3, Bundle bundle) {
        return false;
    }

    public C0046i(int i2) {
        this.f115a = i2;
        switch (i2) {
            case 4:
                if (Build.VERSION.SDK_INT < 26) {
                    this.f116b = new C0343j(this);
                    break;
                } else {
                    this.f116b = new C0344k(this);
                    break;
                }
            case 6:
                this.f116b = new Object();
                new Handler(Looper.getMainLooper(), new C0396e(this));
                break;
        }
    }

    public C0046i(TextView textView) {
        this.f115a = 14;
        this.f116b = new C0539g(textView);
    }

    public C0046i(EditText editText) {
        this.f115a = 13;
        this.f116b = new C0019i(editText);
    }

    public C0046i(Context context) {
        this.f115a = 15;
        this.f116b = context.getApplicationContext();
    }

    public C0046i(ContentInfo contentInfo) {
        this.f115a = 3;
        contentInfo.getClass();
        this.f116b = AbstractC0232e.m646g(contentInfo);
    }

    public C0046i(ClipData clipData, int i2) {
        this.f115a = 2;
        this.f116b = AbstractC0232e.m644e(clipData, i2);
    }
}
