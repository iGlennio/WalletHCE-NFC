package p027K;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p005C.C0041d;
import p010D1.AbstractC0104l;

/* renamed from: K.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC0305l0 extends C0315q0 {

    /* renamed from: h */
    public static boolean f830h = false;

    /* renamed from: i */
    public static Method f831i;

    /* renamed from: j */
    public static Class f832j;

    /* renamed from: k */
    public static Field f833k;

    /* renamed from: l */
    public static Field f834l;

    /* renamed from: c */
    public final WindowInsets f835c;

    /* renamed from: d */
    public C0041d[] f836d;

    /* renamed from: e */
    public C0041d f837e;

    /* renamed from: f */
    public C0319s0 f838f;

    /* renamed from: g */
    public C0041d f839g;

    public AbstractC0305l0(C0319s0 c0319s0, WindowInsets windowInsets) {
        super(c0319s0);
        this.f837e = null;
        this.f835c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: r */
    private C0041d m895r(int i2, boolean z2) {
        C0041d c0041d = C0041d.f106e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                c0041d = C0041d.m144a(c0041d, m906s(i3, z2));
            }
        }
        return c0041d;
    }

    /* renamed from: t */
    private C0041d m896t() {
        C0319s0 c0319s0 = this.f838f;
        return c0319s0 != null ? c0319s0.f855a.mo918h() : C0041d.f106e;
    }

    /* renamed from: u */
    private C0041d m897u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f830h) {
            m898v();
        }
        Method method = f831i;
        if (method != null && f832j != null && f833k != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f833k.get(f834l.get(invoke));
                if (rect != null) {
                    return C0041d.m145b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: v */
    private static void m898v() {
        try {
            f831i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f832j = cls;
            f833k = cls.getDeclaredField("mVisibleInsets");
            f834l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f833k.setAccessible(true);
            f834l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f830h = true;
    }

    @Override // p027K.C0315q0
    /* renamed from: d */
    public void mo899d(View view) {
        C0041d m897u = m897u(view);
        if (m897u == null) {
            m897u = C0041d.f106e;
        }
        m907w(m897u);
    }

    @Override // p027K.C0315q0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f839g, ((AbstractC0305l0) obj).f839g);
        }
        return false;
    }

    @Override // p027K.C0315q0
    /* renamed from: f */
    public C0041d mo900f(int i2) {
        return m895r(i2, false);
    }

    @Override // p027K.C0315q0
    /* renamed from: j */
    public final C0041d mo901j() {
        if (this.f837e == null) {
            WindowInsets windowInsets = this.f835c;
            this.f837e = C0041d.m145b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f837e;
    }

    @Override // p027K.C0315q0
    /* renamed from: l */
    public C0319s0 mo902l(int i2, int i3, int i4, int i5) {
        C0319s0 m936g = C0319s0.m936g(null, this.f835c);
        int i6 = Build.VERSION.SDK_INT;
        AbstractC0303k0 c0301j0 = i6 >= 30 ? new C0301j0(m936g) : i6 >= 29 ? new C0299i0(m936g) : new C0297h0(m936g);
        c0301j0.mo869g(C0319s0.m935e(mo901j(), i2, i3, i4, i5));
        c0301j0.mo868e(C0319s0.m935e(mo918h(), i2, i3, i4, i5));
        return c0301j0.mo867b();
    }

    @Override // p027K.C0315q0
    /* renamed from: n */
    public boolean mo903n() {
        return this.f835c.isRound();
    }

    @Override // p027K.C0315q0
    /* renamed from: o */
    public void mo904o(C0041d[] c0041dArr) {
        this.f836d = c0041dArr;
    }

    @Override // p027K.C0315q0
    /* renamed from: p */
    public void mo905p(C0319s0 c0319s0) {
        this.f838f = c0319s0;
    }

    /* renamed from: s */
    public C0041d m906s(int i2, boolean z2) {
        C0041d mo918h;
        int i3;
        if (i2 == 1) {
            return z2 ? C0041d.m145b(0, Math.max(m896t().f108b, mo901j().f108b), 0, 0) : C0041d.m145b(0, mo901j().f108b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0041d m896t = m896t();
                C0041d mo918h2 = mo918h();
                return C0041d.m145b(Math.max(m896t.f107a, mo918h2.f107a), 0, Math.max(m896t.f109c, mo918h2.f109c), Math.max(m896t.f110d, mo918h2.f110d));
            }
            C0041d mo901j = mo901j();
            C0319s0 c0319s0 = this.f838f;
            mo918h = c0319s0 != null ? c0319s0.f855a.mo918h() : null;
            int i4 = mo901j.f110d;
            if (mo918h != null) {
                i4 = Math.min(i4, mo918h.f110d);
            }
            return C0041d.m145b(mo901j.f107a, 0, mo901j.f109c, i4);
        }
        C0041d c0041d = C0041d.f106e;
        if (i2 == 8) {
            C0041d[] c0041dArr = this.f836d;
            mo918h = c0041dArr != null ? c0041dArr[AbstractC0104l.m388C(8)] : null;
            if (mo918h != null) {
                return mo918h;
            }
            C0041d mo901j2 = mo901j();
            C0041d m896t2 = m896t();
            int i5 = mo901j2.f110d;
            if (i5 > m896t2.f110d) {
                return C0041d.m145b(0, 0, 0, i5);
            }
            C0041d c0041d2 = this.f839g;
            return (c0041d2 == null || c0041d2.equals(c0041d) || (i3 = this.f839g.f110d) <= m896t2.f110d) ? c0041d : C0041d.m145b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return mo930i();
        }
        if (i2 == 32) {
            return mo929g();
        }
        if (i2 == 64) {
            return mo931k();
        }
        if (i2 != 128) {
            return c0041d;
        }
        C0319s0 c0319s02 = this.f838f;
        C0300j mo927e = c0319s02 != null ? c0319s02.f855a.mo927e() : mo927e();
        if (mo927e == null) {
            return c0041d;
        }
        int i6 = Build.VERSION.SDK_INT;
        return C0041d.m145b(i6 >= 28 ? AbstractC0298i.m873d(mo927e.f827a) : 0, i6 >= 28 ? AbstractC0298i.m875f(mo927e.f827a) : 0, i6 >= 28 ? AbstractC0298i.m874e(mo927e.f827a) : 0, i6 >= 28 ? AbstractC0298i.m872c(mo927e.f827a) : 0);
    }

    /* renamed from: w */
    public void m907w(C0041d c0041d) {
        this.f839g = c0041d;
    }
}
