package p027K;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p002B.C0019i;
import p005C.C0041d;
import p018H.RunnableC0194n;
import p019H0.C0196b;

/* renamed from: K.a0 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0283a0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final C0288d f782a;

    /* renamed from: b */
    public C0319s0 f783b;

    public ViewOnApplyWindowInsetsListenerC0283a0(View view, C0288d c0288d) {
        C0319s0 c0319s0;
        this.f782a = c0288d;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        C0319s0 m766a = AbstractC0262F.m766a(view);
        if (m766a != null) {
            int i2 = Build.VERSION.SDK_INT;
            c0319s0 = (i2 >= 30 ? new C0301j0(m766a) : i2 >= 29 ? new C0299i0(m766a) : new C0297h0(m766a)).mo867b();
        } else {
            c0319s0 = null;
        }
        this.f783b = c0319s0;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0315q0 c0315q0;
        if (!view.isLaidOut()) {
            this.f783b = C0319s0.m936g(view, windowInsets);
            return C0285b0.m857i(view, windowInsets);
        }
        C0319s0 m936g = C0319s0.m936g(view, windowInsets);
        if (this.f783b == null) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            this.f783b = AbstractC0262F.m766a(view);
        }
        if (this.f783b == null) {
            this.f783b = m936g;
            return C0285b0.m857i(view, windowInsets);
        }
        C0288d m858j = C0285b0.m858j(view);
        if (m858j != null && Objects.equals((WindowInsets) m858j.f795b, windowInsets)) {
            return C0285b0.m857i(view, windowInsets);
        }
        C0319s0 c0319s0 = this.f783b;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            c0315q0 = m936g.f855a;
            if (i2 > 256) {
                break;
            }
            if (!c0315q0.mo900f(i2).equals(c0319s0.f855a.mo900f(i2))) {
                i3 |= i2;
            }
            i2 <<= 1;
        }
        if (i3 == 0) {
            return C0285b0.m857i(view, windowInsets);
        }
        C0319s0 c0319s02 = this.f783b;
        C0293f0 c0293f0 = new C0293f0(i3, (i3 & 8) != 0 ? c0315q0.mo900f(8).f110d > c0319s02.f855a.mo900f(8).f110d ? C0285b0.f787e : C0285b0.f788f : C0285b0.f789g, 160L);
        c0293f0.f806a.mo864d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0293f0.f806a.mo861a());
        C0041d mo900f = c0315q0.mo900f(i3);
        C0041d mo900f2 = c0319s02.f855a.mo900f(i3);
        int min = Math.min(mo900f.f107a, mo900f2.f107a);
        int i4 = mo900f.f108b;
        int i5 = mo900f2.f108b;
        int min2 = Math.min(i4, i5);
        int i6 = mo900f.f109c;
        int i7 = mo900f2.f109c;
        int min3 = Math.min(i6, i7);
        int i8 = mo900f.f110d;
        int i9 = mo900f2.f110d;
        C0019i c0019i = new C0019i(C0041d.m145b(min, min2, min3, Math.min(i8, i9)), 5, C0041d.m145b(Math.max(mo900f.f107a, mo900f2.f107a), Math.max(i4, i5), Math.max(i6, i7), Math.max(i8, i9)));
        C0285b0.m854f(view, windowInsets, false);
        duration.addUpdateListener(new C0281Z(c0293f0, m936g, c0319s02, i3, view));
        duration.addListener(new C0196b(c0293f0, view, 1));
        ViewTreeObserverOnPreDrawListenerC0320t.m942a(view, new RunnableC0194n(view, c0293f0, c0019i, duration));
        this.f783b = m936g;
        return C0285b0.m857i(view, windowInsets);
    }
}
