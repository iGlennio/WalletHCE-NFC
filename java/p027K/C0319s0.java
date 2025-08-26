package p027K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p005C.C0041d;

/* renamed from: K.s0 */
/* loaded from: classes.dex */
public final class C0319s0 {

    /* renamed from: b */
    public static final C0319s0 f854b;

    /* renamed from: a */
    public final C0315q0 f855a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f854b = C0313p0.f851q;
        } else {
            f854b = C0315q0.f852b;
        }
    }

    public C0319s0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f855a = new C0313p0(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f855a = new C0311o0(this, windowInsets);
        } else if (i2 >= 28) {
            this.f855a = new C0309n0(this, windowInsets);
        } else {
            this.f855a = new C0307m0(this, windowInsets);
        }
    }

    /* renamed from: e */
    public static C0041d m935e(C0041d c0041d, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, c0041d.f107a - i2);
        int max2 = Math.max(0, c0041d.f108b - i3);
        int max3 = Math.max(0, c0041d.f109c - i4);
        int max4 = Math.max(0, c0041d.f110d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? c0041d : C0041d.m145b(max, max2, max3, max4);
    }

    /* renamed from: g */
    public static C0319s0 m936g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0319s0 c0319s0 = new C0319s0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            C0319s0 m766a = AbstractC0262F.m766a(view);
            C0315q0 c0315q0 = c0319s0.f855a;
            c0315q0.mo905p(m766a);
            c0315q0.mo899d(view.getRootView());
        }
        return c0319s0;
    }

    /* renamed from: a */
    public final int m937a() {
        return this.f855a.mo901j().f110d;
    }

    /* renamed from: b */
    public final int m938b() {
        return this.f855a.mo901j().f107a;
    }

    /* renamed from: c */
    public final int m939c() {
        return this.f855a.mo901j().f109c;
    }

    /* renamed from: d */
    public final int m940d() {
        return this.f855a.mo901j().f108b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0319s0)) {
            return false;
        }
        return Objects.equals(this.f855a, ((C0319s0) obj).f855a);
    }

    /* renamed from: f */
    public final WindowInsets m941f() {
        C0315q0 c0315q0 = this.f855a;
        if (c0315q0 instanceof AbstractC0305l0) {
            return ((AbstractC0305l0) c0315q0).f835c;
        }
        return null;
    }

    public final int hashCode() {
        C0315q0 c0315q0 = this.f855a;
        if (c0315q0 == null) {
            return 0;
        }
        return c0315q0.hashCode();
    }

    public C0319s0() {
        this.f855a = new C0315q0(this);
    }
}
