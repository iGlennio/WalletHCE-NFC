package p117t0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import p010D1.AbstractC0104l;
import p027K.AbstractC0272P;

/* renamed from: t0.a */
/* loaded from: classes.dex */
public final class C1230a extends AbstractC0104l {

    /* renamed from: a */
    public int f4822a;

    /* renamed from: b */
    public int f4823b = -1;

    /* renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f4824c;

    public C1230a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4824c = swipeDismissBehavior;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: A */
    public final int mo419A(View view) {
        return view.getWidth();
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: K */
    public final void mo423K(View view, int i2) {
        this.f4823b = i2;
        this.f4822a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4824c;
            swipeDismissBehavior.f2507c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2507c = false;
        }
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: M */
    public final void mo425M(View view, int i2, int i3) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4824c;
        float f = width * swipeDismissBehavior.f2509e;
        float width2 = view.getWidth() * swipeDismissBehavior.f2510f;
        float abs = Math.abs(i2 - this.f4822a);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f4822a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // p010D1.AbstractC0104l
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo426N(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f4823b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f4824c
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = p027K.AbstractC0272P.f768a
            int r5 = r9.getLayoutDirection()
            if (r5 != r3) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r2.f2508d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r3) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f4822a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f4822a
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r10 = r8.f4822a
            int r0 = r10 - r11
            goto L69
        L66:
            int r0 = r8.f4822a
            r3 = r4
        L69:
            T.e r10 = r2.f2505a
            int r11 = r9.getTop()
            boolean r10 = r10.m1256q(r0, r11)
            if (r10 == 0) goto L7f
            H.a r10 = new H.a
            r10.<init>(r2, r9, r3)
            java.util.WeakHashMap r11 = p027K.AbstractC0272P.f768a
            r9.postOnAnimation(r10)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p117t0.C1230a.mo426N(android.view.View, float, float):void");
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: V */
    public final boolean mo429V(View view, int i2) {
        int i3 = this.f4823b;
        return (i3 == -1 || i3 == i2) && this.f4824c.mo1901v(view);
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: i */
    public final int mo433i(View view, int i2) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i3 = this.f4824c.f2508d;
        if (i3 == 0) {
            if (z2) {
                width = this.f4822a - view.getWidth();
                width2 = this.f4822a;
            } else {
                width = this.f4822a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i3 != 1) {
            width = this.f4822a - view.getWidth();
            width2 = view.getWidth() + this.f4822a;
        } else if (z2) {
            width = this.f4822a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4822a - view.getWidth();
            width2 = this.f4822a;
        }
        return Math.min(Math.max(width, i2), width2);
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: j */
    public final int mo434j(View view, int i2) {
        return view.getTop();
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: L */
    public final void mo424L(int i2) {
    }
}
