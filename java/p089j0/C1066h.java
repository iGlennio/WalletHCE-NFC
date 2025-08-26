package p089j0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.nfupay.s145.R;
import java.util.HashMap;

/* renamed from: j0.h */
/* loaded from: classes.dex */
public final class C1066h extends AbstractC1071m {

    /* renamed from: B */
    public static final String[] f4170B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A */
    public final int f4171A;

    public C1066h(int i2) {
        this();
        this.f4171A = i2;
    }

    /* renamed from: I */
    public static void m2580I(C1079u c1079u) {
        int visibility = c1079u.f4220b.getVisibility();
        HashMap hashMap = c1079u.f4219a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c1079u.f4220b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: K */
    public static float m2581K(C1079u c1079u, float f) {
        Float f2;
        return (c1079u == null || (f2 = (Float) c1079u.f4219a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p089j0.C1058F m2582L(p089j0.C1079u r8, p089j0.C1079u r9) {
        /*
            j0.F r0 = new j0.F
            r0.<init>()
            r1 = 0
            r0.f4141a = r1
            r0.f4142b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f4219a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f4143c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f4145e = r6
            goto L33
        L2f:
            r0.f4143c = r3
            r0.f4145e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f4219a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f4144d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f4146f = r2
            goto L56
        L52:
            r0.f4144d = r3
            r0.f4146f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f4143c
            int r9 = r0.f4144d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f4145e
            android.view.ViewGroup r4 = r0.f4146f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f4142b = r1
            r0.f4141a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f4142b = r2
            r0.f4141a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f4146f
            if (r8 != 0) goto L81
            r0.f4142b = r1
            r0.f4141a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f4145e
            if (r8 != 0) goto L9f
            r0.f4142b = r2
            r0.f4141a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f4144d
            if (r8 != 0) goto L95
            r0.f4142b = r2
            r0.f4141a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f4143c
            if (r8 != 0) goto L9f
            r0.f4142b = r1
            r0.f4141a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p089j0.C1066h.m2582L(j0.u, j0.u):j0.F");
    }

    /* renamed from: J */
    public final ObjectAnimator m2583J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC1081w.f4222a.mo369f0(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AbstractC1081w.f4223b, f2);
        C1065g c1065g = new C1065g(view);
        ofFloat.addListener(c1065g);
        m2596o().m2590a(c1065g);
        return ofFloat;
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: d */
    public final void mo2567d(C1079u c1079u) {
        m2580I(c1079u);
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: g */
    public final void mo2569g(C1079u c1079u) {
        m2580I(c1079u);
        View view = c1079u.f4220b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(AbstractC1081w.f4222a.mo361I(view)) : Float.valueOf(0.0f);
        }
        c1079u.f4219a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (m2582L(m2595n(r3, false), m2597r(r3, false)).f4141a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    @Override // p089j0.AbstractC1071m
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo2577k(android.view.ViewGroup r24, p089j0.C1079u r25, p089j0.C1079u r26) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p089j0.C1066h.mo2577k(android.view.ViewGroup, j0.u, j0.u):android.animation.Animator");
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: q */
    public final String[] mo2578q() {
        return f4170B;
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: s */
    public final boolean mo2584s(C1079u c1079u, C1079u c1079u2) {
        if (c1079u == null && c1079u2 == null) {
            return false;
        }
        if (c1079u != null && c1079u2 != null && c1079u2.f4219a.containsKey("android:visibility:visibility") != c1079u.f4219a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1058F m2582L = m2582L(c1079u, c1079u2);
        if (m2582L.f4141a) {
            return m2582L.f4143c == 0 || m2582L.f4144d == 0;
        }
        return false;
    }

    public C1066h() {
        this.f4171A = 3;
    }
}
