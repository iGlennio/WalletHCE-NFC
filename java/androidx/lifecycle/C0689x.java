package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.C0615E;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0638l;
import java.util.Map;
import p005C.AbstractC0044g;
import p005C.C0046i;
import p090k.C1085a;
import p093l.C1127c;
import p093l.C1128d;
import p093l.C1130f;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public class C0689x {

    /* renamed from: j */
    public static final Object f2337j = new Object();

    /* renamed from: a */
    public final Object f2338a = new Object();

    /* renamed from: b */
    public final C1130f f2339b = new C1130f();

    /* renamed from: c */
    public int f2340c = 0;

    /* renamed from: d */
    public boolean f2341d;

    /* renamed from: e */
    public volatile Object f2342e;

    /* renamed from: f */
    public volatile Object f2343f;

    /* renamed from: g */
    public int f2344g;

    /* renamed from: h */
    public boolean f2345h;

    /* renamed from: i */
    public boolean f2346i;

    public C0689x() {
        Object obj = f2337j;
        this.f2343f = obj;
        this.f2342e = obj;
        this.f2344g = -1;
    }

    /* renamed from: a */
    public static void m1710a(String str) {
        ((C1085a) C1085a.m2613e0().f4225h).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0044g.m155g("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m1711b(AbstractC0688w abstractC0688w) {
        if (abstractC0688w.f2334b) {
            if (!abstractC0688w.mo1693e()) {
                abstractC0688w.m1709c(false);
                return;
            }
            int i2 = abstractC0688w.f2335c;
            int i3 = this.f2344g;
            if (i2 >= i3) {
                return;
            }
            abstractC0688w.f2335c = i3;
            C0046i c0046i = abstractC0688w.f2333a;
            Object obj = this.f2342e;
            c0046i.getClass();
            if (((InterfaceC0683r) obj) != null) {
                DialogInterfaceOnCancelListenerC0638l dialogInterfaceOnCancelListenerC0638l = (DialogInterfaceOnCancelListenerC0638l) c0046i.f116b;
                if (dialogInterfaceOnCancelListenerC0638l.f2182W) {
                    View m1672x = dialogInterfaceOnCancelListenerC0638l.m1672x();
                    if (m1672x.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (dialogInterfaceOnCancelListenerC0638l.f2186a0 != null) {
                        if (C0615E.m1556E(3)) {
                            Log.d("FragmentManager", "DialogFragment " + c0046i + " setting the content view on " + dialogInterfaceOnCancelListenerC0638l.f2186a0);
                        }
                        dialogInterfaceOnCancelListenerC0638l.f2186a0.setContentView(m1672x);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1712c(AbstractC0688w abstractC0688w) {
        if (this.f2345h) {
            this.f2346i = true;
            return;
        }
        this.f2345h = true;
        do {
            this.f2346i = false;
            if (abstractC0688w != null) {
                m1711b(abstractC0688w);
                abstractC0688w = null;
            } else {
                C1130f c1130f = this.f2339b;
                c1130f.getClass();
                C1128d c1128d = new C1128d(c1130f);
                c1130f.f4322c.put(c1128d, Boolean.FALSE);
                while (c1128d.hasNext()) {
                    m1711b((AbstractC0688w) ((Map.Entry) c1128d.next()).getValue());
                    if (this.f2346i) {
                        break;
                    }
                }
            }
        } while (this.f2346i);
        this.f2345h = false;
    }

    /* renamed from: d */
    public final void m1713d(C0046i c0046i) {
        Object obj;
        m1710a("observeForever");
        C0687v c0687v = new C0687v(this, c0046i);
        C1130f c1130f = this.f2339b;
        C1127c mo2619a = c1130f.mo2619a(c0046i);
        if (mo2619a != null) {
            obj = mo2619a.f4314b;
        } else {
            C1127c c1127c = new C1127c(c0046i, c0687v);
            c1130f.f4323d++;
            C1127c c1127c2 = c1130f.f4321b;
            if (c1127c2 == null) {
                c1130f.f4320a = c1127c;
                c1130f.f4321b = c1127c;
            } else {
                c1127c2.f4315c = c1127c;
                c1127c.f4316d = c1127c2;
                c1130f.f4321b = c1127c;
            }
            obj = null;
        }
        AbstractC0688w abstractC0688w = (AbstractC0688w) obj;
        if (abstractC0688w instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC0688w != null) {
            return;
        }
        c0687v.m1709c(true);
    }

    /* renamed from: e */
    public final void m1714e(Object obj) {
        m1710a("setValue");
        this.f2344g++;
        this.f2342e = obj;
        m1712c(null);
    }
}
