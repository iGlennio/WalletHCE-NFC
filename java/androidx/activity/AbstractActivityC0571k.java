package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C0651y;
import androidx.lifecycle.AbstractC0655C;
import androidx.lifecycle.AbstractC0658F;
import androidx.lifecycle.C0660H;
import androidx.lifecycle.C0663K;
import androidx.lifecycle.C0664L;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0677l;
import androidx.lifecycle.EnumC0678m;
import androidx.lifecycle.FragmentC0657E;
import androidx.lifecycle.InterfaceC0665M;
import androidx.lifecycle.InterfaceC0673h;
import androidx.lifecycle.InterfaceC0681p;
import androidx.lifecycle.InterfaceC0683r;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p002B.C0019i;
import p005C.AbstractC0044g;
import p010D1.AbstractC0096d;
import p014F0.RunnableC0130G;
import p018H.C0187g;
import p043P0.RunnableC0402A;
import p047Q1.C0456c;
import p066a.C0552a;
import p066a.InterfaceC0553b;
import p067a0.AbstractC0555b;
import p067a0.C0554a;
import p067a0.C0556c;
import p076e.AbstractActivityC0782f;
import p081g0.C0869d;
import p081g0.InterfaceC0868c;
import p081g0.InterfaceC0870e;
import p092k1.InterfaceC1103a;
import p093l.C1126b;
import p093l.C1130f;
import p095l1.AbstractC1136c;
import p133z.AbstractActivityC1328e;

/* renamed from: androidx.activity.k */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0571k extends AbstractActivityC1328e implements InterfaceC0665M, InterfaceC0673h, InterfaceC0870e {

    /* renamed from: b */
    public final C0552a f1581b = new C0552a();

    /* renamed from: c */
    public final C0019i f1582c;

    /* renamed from: d */
    public final C0685t f1583d;

    /* renamed from: e */
    public final C0456c f1584e;

    /* renamed from: f */
    public C0664L f1585f;

    /* renamed from: g */
    public C0581s f1586g;

    /* renamed from: h */
    public final ExecutorC0570j f1587h;

    /* renamed from: i */
    public final C0456c f1588i;

    /* renamed from: j */
    public final C0567g f1589j;

    /* renamed from: k */
    public final CopyOnWriteArrayList f1590k;

    /* renamed from: l */
    public final CopyOnWriteArrayList f1591l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f1592m;

    /* renamed from: n */
    public final CopyOnWriteArrayList f1593n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f1594o;

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.activity.d] */
    public AbstractActivityC0571k() {
        final AbstractActivityC0782f abstractActivityC0782f = (AbstractActivityC0782f) this;
        this.f1582c = new C0019i(new RunnableC0130G(6, abstractActivityC0782f));
        C0685t c0685t = new C0685t(this);
        this.f1583d = c0685t;
        C0456c c0456c = new C0456c(this);
        this.f1584e = c0456c;
        InterfaceC0868c interfaceC0868c = null;
        this.f1586g = null;
        ExecutorC0570j executorC0570j = new ExecutorC0570j(abstractActivityC0782f);
        this.f1587h = executorC0570j;
        this.f1588i = new C0456c(executorC0570j, new InterfaceC1103a() { // from class: androidx.activity.d
            @Override // p092k1.InterfaceC1103a
            /* renamed from: a */
            public final Object mo259a() {
                AbstractActivityC0782f.this.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.f1589j = new C0567g();
        this.f1590k = new CopyOnWriteArrayList();
        this.f1591l = new CopyOnWriteArrayList();
        this.f1592m = new CopyOnWriteArrayList();
        this.f1593n = new CopyOnWriteArrayList();
        this.f1594o = new CopyOnWriteArrayList();
        c0685t.m1699a(new InterfaceC0681p() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.InterfaceC0681p
            /* renamed from: b */
            public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
                if (enumC0677l == EnumC0677l.ON_STOP) {
                    Window window = AbstractActivityC0782f.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0685t.m1699a(new InterfaceC0681p() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.InterfaceC0681p
            /* renamed from: b */
            public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
                if (enumC0677l == EnumC0677l.ON_DESTROY) {
                    AbstractActivityC0782f.this.f1581b.f1522b = null;
                    if (!AbstractActivityC0782f.this.isChangingConfigurations()) {
                        AbstractActivityC0782f.this.mo1361c().m1691a();
                    }
                    ExecutorC0570j executorC0570j2 = AbstractActivityC0782f.this.f1587h;
                    AbstractActivityC0782f abstractActivityC0782f2 = executorC0570j2.f1580d;
                    abstractActivityC0782f2.getWindow().getDecorView().removeCallbacks(executorC0570j2);
                    abstractActivityC0782f2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0570j2);
                }
            }
        });
        c0685t.m1699a(new InterfaceC0681p() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0681p
            /* renamed from: b */
            public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
                AbstractActivityC0782f abstractActivityC0782f2 = AbstractActivityC0782f.this;
                if (abstractActivityC0782f2.f1585f == null) {
                    C0569i c0569i = (C0569i) abstractActivityC0782f2.getLastNonConfigurationInstance();
                    if (c0569i != null) {
                        abstractActivityC0782f2.f1585f = c0569i.f1576a;
                    }
                    if (abstractActivityC0782f2.f1585f == null) {
                        abstractActivityC0782f2.f1585f = new C0664L();
                    }
                }
                abstractActivityC0782f2.f1583d.m1704f(this);
            }
        });
        c0456c.m1165b();
        EnumC0678m enumC0678m = c0685t.f2325c;
        if (enumC0678m != EnumC0678m.f2315b && enumC0678m != EnumC0678m.f2316c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0869d c0869d = (C0869d) c0456c.f1251c;
        c0869d.getClass();
        Iterator it = ((C1130f) c0869d.f3500d).iterator();
        while (true) {
            C1126b c1126b = (C1126b) it;
            if (!c1126b.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1126b.next();
            AbstractC1136c.m2636d(entry, "components");
            String str = (String) entry.getKey();
            InterfaceC0868c interfaceC0868c2 = (InterfaceC0868c) entry.getValue();
            if (AbstractC1136c.m2633a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                interfaceC0868c = interfaceC0868c2;
                break;
            }
        }
        if (interfaceC0868c == null) {
            C0660H c0660h = new C0660H((C0869d) this.f1584e.f1251c, this);
            ((C0869d) this.f1584e.f1251c).m2291e("androidx.lifecycle.internal.SavedStateHandlesProvider", c0660h);
            this.f1583d.m1699a(new SavedStateHandleAttacher(c0660h));
        }
        ((C0869d) this.f1584e.f1251c).m2291e("android:support:activity-result", new InterfaceC0868c() { // from class: androidx.activity.e
            @Override // p081g0.InterfaceC0868c
            /* renamed from: a */
            public final Bundle mo1354a() {
                AbstractActivityC0782f abstractActivityC0782f2 = AbstractActivityC0782f.this;
                Bundle bundle = new Bundle();
                C0567g c0567g = abstractActivityC0782f2.f1589j;
                c0567g.getClass();
                HashMap hashMap = c0567g.f1570b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0567g.f1572d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0567g.f1575g.clone());
                return bundle;
            }
        });
        m1363g(new InterfaceC0553b() { // from class: androidx.activity.f
            @Override // p066a.InterfaceC0553b
            /* renamed from: a */
            public final void mo1301a() {
                AbstractActivityC0782f abstractActivityC0782f2 = AbstractActivityC0782f.this;
                Bundle m2289c = ((C0869d) abstractActivityC0782f2.f1584e.f1251c).m2289c("android:support:activity-result");
                if (m2289c != null) {
                    C0567g c0567g = abstractActivityC0782f2.f1589j;
                    c0567g.getClass();
                    ArrayList<Integer> integerArrayList = m2289c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = m2289c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    c0567g.f1572d = m2289c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    Bundle bundle = m2289c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0567g.f1575g;
                    bundle2.putAll(bundle);
                    for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                        String str2 = stringArrayList.get(i2);
                        HashMap hashMap = c0567g.f1570b;
                        boolean containsKey = hashMap.containsKey(str2);
                        HashMap hashMap2 = c0567g.f1569a;
                        if (containsKey) {
                            Integer num = (Integer) hashMap.remove(str2);
                            if (!bundle2.containsKey(str2)) {
                                hashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i2);
                        num2.intValue();
                        String str3 = stringArrayList.get(i2);
                        hashMap2.put(num2, str3);
                        hashMap.put(str3, num2);
                    }
                }
            }
        });
    }

    @Override // androidx.lifecycle.InterfaceC0673h
    /* renamed from: a */
    public final AbstractC0555b mo1359a() {
        C0554a c0554a = C0554a.f1523b;
        AbstractC1136c.m2637e(c0554a, "initialExtras");
        C0556c c0556c = new C0556c();
        c0556c.f1524a.putAll(c0554a.f1524a);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0556c.f1524a;
        if (application != null) {
            linkedHashMap.put(C0663K.f2298a, getApplication());
        }
        linkedHashMap.put(AbstractC0658F.f2286a, this);
        linkedHashMap.put(AbstractC0658F.f2287b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC0658F.f2288c, getIntent().getExtras());
        }
        return c0556c;
    }

    @Override // p081g0.InterfaceC0870e
    /* renamed from: b */
    public final C0869d mo1360b() {
        return (C0869d) this.f1584e.f1251c;
    }

    @Override // androidx.lifecycle.InterfaceC0665M
    /* renamed from: c */
    public final C0664L mo1361c() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1585f == null) {
            C0569i c0569i = (C0569i) getLastNonConfigurationInstance();
            if (c0569i != null) {
                this.f1585f = c0569i.f1576a;
            }
            if (this.f1585f == null) {
                this.f1585f = new C0664L();
            }
        }
        return this.f1585f;
    }

    @Override // androidx.lifecycle.InterfaceC0683r
    /* renamed from: d */
    public final C0685t mo1362d() {
        return this.f1583d;
    }

    /* renamed from: g */
    public final void m1363g(InterfaceC0553b interfaceC0553b) {
        C0552a c0552a = this.f1581b;
        c0552a.getClass();
        if (c0552a.f1522b != null) {
            interfaceC0553b.mo1301a();
        }
        c0552a.f1521a.add(interfaceC0553b);
    }

    /* renamed from: h */
    public final C0581s m1364h() {
        if (this.f1586g == null) {
            this.f1586g = new C0581s(new RunnableC0402A(4, this));
            this.f1583d.m1699a(new InterfaceC0681p() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.InterfaceC0681p
                /* renamed from: b */
                public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
                    if (enumC0677l != EnumC0677l.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    C0581s c0581s = AbstractActivityC0571k.this.f1586g;
                    OnBackInvokedDispatcher m1357a = AbstractC0568h.m1357a((AbstractActivityC0571k) interfaceC0683r);
                    c0581s.getClass();
                    AbstractC1136c.m2637e(m1357a, "invoker");
                    c0581s.f1620e = m1357a;
                    c0581s.m1373c(c0581s.f1622g);
                }
            });
        }
        return this.f1586g;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f1589j.m1355a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m1364h().m1372b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1590k.iterator();
        while (it.hasNext()) {
            ((C0187g) it.next()).m573a(configuration);
        }
    }

    @Override // p133z.AbstractActivityC1328e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1584e.m1166c(bundle);
        C0552a c0552a = this.f1581b;
        c0552a.getClass();
        c0552a.f1522b = this;
        Iterator it = c0552a.f1521a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0553b) it.next()).mo1301a();
        }
        super.onCreate(bundle);
        int i2 = FragmentC0657E.f2284b;
        AbstractC0655C.m1689b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1582c.f48c).iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1582c.f48c).iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        super.onMultiWindowModeChanged(z2, configuration);
        Iterator it = this.f1593n.iterator();
        while (it.hasNext()) {
            C0187g c0187g = (C0187g) it.next();
            AbstractC1136c.m2637e(configuration, "newConfig");
            c0187g.m573a(new C0651y(16));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f1592m.iterator();
        while (it.hasNext()) {
            ((C0187g) it.next()).m573a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f1582c.f48c).iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        super.onPictureInPictureModeChanged(z2, configuration);
        Iterator it = this.f1594o.iterator();
        while (it.hasNext()) {
            C0187g c0187g = (C0187g) it.next();
            AbstractC1136c.m2637e(configuration, "newConfig");
            c0187g.m573a(new C0651y(17));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1582c.f48c).iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.f1589j.m1355a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0569i c0569i;
        C0664L c0664l = this.f1585f;
        if (c0664l == null && (c0569i = (C0569i) getLastNonConfigurationInstance()) != null) {
            c0664l = c0569i.f1576a;
        }
        if (c0664l == null) {
            return null;
        }
        C0569i c0569i2 = new C0569i();
        c0569i2.f1576a = c0664l;
        return c0569i2;
    }

    @Override // p133z.AbstractActivityC1328e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0685t c0685t = this.f1583d;
        if (c0685t != null) {
            c0685t.m1705g();
        }
        super.onSaveInstanceState(bundle);
        this.f1584e.m1167d(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.f1591l.iterator();
        while (it.hasNext()) {
            ((C0187g) it.next()).m573a(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC0096d.m328L()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0456c c0456c = this.f1588i;
            synchronized (c0456c.f1250b) {
                try {
                    c0456c.f1249a = true;
                    Iterator it = ((ArrayList) c0456c.f1251c).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1103a) it.next()).mo259a();
                    }
                    ((ArrayList) c0456c.f1251c).clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        View decorView = getWindow().getDecorView();
        AbstractC1136c.m2637e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1136c.m2637e(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC1136c.m2637e(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC1136c.m2637e(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC1136c.m2637e(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        ExecutorC0570j executorC0570j = this.f1587h;
        if (!executorC0570j.f1579c) {
            executorC0570j.f1579c = true;
            decorView6.getViewTreeObserver().addOnDrawListener(executorC0570j);
        }
        super.setContentView(view);
    }
}
