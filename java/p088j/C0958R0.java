package p088j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.nfupay.s145.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p000A.AbstractC0000a;
import p091k0.C1102p;
import p101o.AbstractC1154d;
import p101o.C1155e;
import p101o.C1162l;

/* renamed from: j.R0 */
/* loaded from: classes.dex */
public final class C0958R0 {

    /* renamed from: g */
    public static C0958R0 f3845g;

    /* renamed from: a */
    public WeakHashMap f3847a;

    /* renamed from: b */
    public final WeakHashMap f3848b = new WeakHashMap(0);

    /* renamed from: c */
    public TypedValue f3849c;

    /* renamed from: d */
    public boolean f3850d;

    /* renamed from: e */
    public C1032t f3851e;

    /* renamed from: f */
    public static final PorterDuff.Mode f3844f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    public static final C0957Q0 f3846h = new C0957Q0(6);

    /* renamed from: b */
    public static synchronized C0958R0 m2425b() {
        C0958R0 c0958r0;
        synchronized (C0958R0.class) {
            try {
                if (f3845g == null) {
                    f3845g = new C0958R0();
                }
                c0958r0 = f3845g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0958r0;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m2426e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0958R0.class) {
            C0957Q0 c0957q0 = f3846h;
            c0957q0.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c0957q0.m2674a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    public final Drawable m2427a(Context context, int i2) {
        Drawable drawable;
        if (this.f3849c == null) {
            this.f3849c = new TypedValue();
        }
        TypedValue typedValue = this.f3849c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            C1155e c1155e = (C1155e) this.f3848b.get(context);
            drawable = null;
            if (c1155e != null) {
                WeakReference weakReference = (WeakReference) c1155e.m2670c(j2, null);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int m2667b = AbstractC1154d.m2667b(c1155e.f4396b, c1155e.f4398d, j2);
                        if (m2667b >= 0) {
                            Object[] objArr = c1155e.f4397c;
                            Object obj = objArr[m2667b];
                            Object obj2 = C1155e.f4394e;
                            if (obj != obj2) {
                                objArr[m2667b] = obj2;
                                c1155e.f4395a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f3851e != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{m2428c(context, R.drawable.abc_cab_background_internal_bg), m2428c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawable = C1032t.m2520c(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C1032t.m2520c(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C1032t.m2520c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    C1155e c1155e2 = (C1155e) this.f3848b.get(context);
                    if (c1155e2 == null) {
                        c1155e2 = new C1155e();
                        this.f3848b.put(context, c1155e2);
                    }
                    c1155e2.m2671d(j2, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    /* renamed from: c */
    public final synchronized Drawable m2428c(Context context, int i2) {
        return m2429d(context, i2, false);
    }

    /* renamed from: d */
    public final synchronized Drawable m2429d(Context context, int i2, boolean z2) {
        Drawable m2427a;
        try {
            if (!this.f3850d) {
                this.f3850d = true;
                Drawable m2428c = m2428c(context, R.drawable.abc_vector_test);
                if (m2428c == null || (!(m2428c instanceof C1102p) && !"android.graphics.drawable.VectorDrawable".equals(m2428c.getClass().getName()))) {
                    this.f3850d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            m2427a = m2427a(context, i2);
            if (m2427a == null) {
                m2427a = AbstractC0000a.m1b(context, i2);
            }
            if (m2427a != null) {
                m2427a = m2431g(context, i2, z2, m2427a);
            }
            if (m2427a != null) {
                AbstractC1027r0.m2515a(m2427a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m2427a;
    }

    /* renamed from: f */
    public final synchronized ColorStateList m2430f(Context context, int i2) {
        ColorStateList colorStateList;
        C1162l c1162l;
        WeakHashMap weakHashMap = this.f3847a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c1162l = (C1162l) weakHashMap.get(context)) == null) ? null : (ColorStateList) c1162l.m2687b(i2, null);
        if (colorStateList == null) {
            C1032t c1032t = this.f3851e;
            if (c1032t != null) {
                colorStateList2 = c1032t.m2522d(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f3847a == null) {
                    this.f3847a = new WeakHashMap();
                }
                C1162l c1162l2 = (C1162l) this.f3847a.get(context);
                if (c1162l2 == null) {
                    c1162l2 = new C1162l();
                    this.f3847a.put(context, c1162l2);
                }
                c1162l2.m2686a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m2431g(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j.C0958R0.m2431g(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
