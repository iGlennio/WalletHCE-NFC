package p027K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.nfupay.s145.R;
import p005C.C0041d;

/* renamed from: K.E */
/* loaded from: classes.dex */
public abstract class AbstractC0261E {
    /* renamed from: a */
    public static void m740a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: b */
    public static C0319s0 m741b(View view, C0319s0 c0319s0, Rect rect) {
        WindowInsets m941f = c0319s0.m941f();
        if (m941f != null) {
            return C0319s0.m936g(view, view.computeSystemWindowInsets(m941f, rect));
        }
        rect.setEmpty();
        return c0319s0;
    }

    /* renamed from: c */
    public static boolean m742c(View view, float f, float f2, boolean z2) {
        return view.dispatchNestedFling(f, f2, z2);
    }

    /* renamed from: d */
    public static boolean m743d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* renamed from: e */
    public static boolean m744e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    /* renamed from: f */
    public static boolean m745f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
    }

    /* renamed from: g */
    public static ColorStateList m746g(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: h */
    public static PorterDuff.Mode m747h(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: i */
    public static float m748i(View view) {
        return view.getElevation();
    }

    /* renamed from: j */
    public static C0319s0 m749j(View view) {
        if (!AbstractC0295g0.f811d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0295g0.f808a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0295g0.f809b.get(obj);
            Rect rect2 = (Rect) AbstractC0295g0.f810c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            AbstractC0303k0 c0301j0 = i2 >= 30 ? new C0301j0() : i2 >= 29 ? new C0299i0() : new C0297h0();
            c0301j0.mo868e(C0041d.m145b(rect.left, rect.top, rect.right, rect.bottom));
            c0301j0.mo869g(C0041d.m145b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0319s0 mo867b = c0301j0.mo867b();
            mo867b.f855a.mo905p(mo867b);
            mo867b.f855a.mo899d(view.getRootView());
            return mo867b;
        } catch (IllegalAccessException e2) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            return null;
        }
    }

    /* renamed from: k */
    public static String m750k(View view) {
        return view.getTransitionName();
    }

    /* renamed from: l */
    public static float m751l(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: m */
    public static float m752m(View view) {
        return view.getZ();
    }

    /* renamed from: n */
    public static boolean m753n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* renamed from: o */
    public static boolean m754o(View view) {
        return view.isImportantForAccessibility();
    }

    /* renamed from: p */
    public static boolean m755p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: q */
    public static void m756q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: r */
    public static void m757r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: s */
    public static void m758s(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: t */
    public static void m759t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    /* renamed from: u */
    public static void m760u(View view, InterfaceC0314q interfaceC0314q) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0314q);
        }
        if (interfaceC0314q == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0260D(view, interfaceC0314q));
        }
    }

    /* renamed from: v */
    public static void m761v(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: w */
    public static void m762w(View view, float f) {
        view.setTranslationZ(f);
    }

    /* renamed from: x */
    public static void m763x(View view, float f) {
        view.setZ(f);
    }

    /* renamed from: y */
    public static boolean m764y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    /* renamed from: z */
    public static void m765z(View view) {
        view.stopNestedScroll();
    }
}
