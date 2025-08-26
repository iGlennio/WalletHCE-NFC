package p027K;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.nfupay.s145.R;
import java.util.List;
import p002B.C0019i;
import p064Z.C0549a;

/* renamed from: K.b0 */
/* loaded from: classes.dex */
public final class C0285b0 extends AbstractC0291e0 {

    /* renamed from: e */
    public static final PathInterpolator f787e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f */
    public static final C0549a f788f = new C0549a(0);

    /* renamed from: g */
    public static final DecelerateInterpolator f789g = new DecelerateInterpolator();

    /* renamed from: e */
    public static void m853e(View view) {
        C0288d m858j = m858j(view);
        if (m858j != null) {
            ((View) m858j.f798e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m853e(viewGroup.getChildAt(i2));
            }
        }
    }

    /* renamed from: f */
    public static void m854f(View view, WindowInsets windowInsets, boolean z2) {
        C0288d m858j = m858j(view);
        if (m858j != null) {
            m858j.f795b = windowInsets;
            if (!z2) {
                View view2 = (View) m858j.f798e;
                int[] iArr = (int[]) m858j.f799f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                m858j.f796c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m854f(viewGroup.getChildAt(i2), windowInsets, z2);
            }
        }
    }

    /* renamed from: g */
    public static void m855g(View view, C0319s0 c0319s0, List list) {
        C0288d m858j = m858j(view);
        if (m858j != null) {
            m858j.m860a(c0319s0, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m855g(viewGroup.getChildAt(i2), c0319s0, list);
            }
        }
    }

    /* renamed from: h */
    public static void m856h(View view, C0019i c0019i) {
        C0288d m858j = m858j(view);
        if (m858j != null) {
            View view2 = (View) m858j.f798e;
            int[] iArr = (int[]) m858j.f799f;
            view2.getLocationOnScreen(iArr);
            int i2 = m858j.f796c - iArr[1];
            m858j.f797d = i2;
            view2.setTranslationY(i2);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m856h(viewGroup.getChildAt(i3), c0019i);
            }
        }
    }

    /* renamed from: i */
    public static WindowInsets m857i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: j */
    public static C0288d m858j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0283a0) {
            return ((ViewOnApplyWindowInsetsListenerC0283a0) tag).f782a;
        }
        return null;
    }
}
