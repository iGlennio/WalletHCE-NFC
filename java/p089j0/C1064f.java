package p089j0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0651y;
import java.util.HashMap;
import p047Q1.AbstractC0458e;

/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class C1064f extends AbstractC1071m {

    /* renamed from: A */
    public static final String[] f4162A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B */
    public static final C1060b f4163B = new C1060b(PointF.class, "topLeft", 0);

    /* renamed from: C */
    public static final C1060b f4164C = new C1060b(PointF.class, "bottomRight", 1);

    /* renamed from: D */
    public static final C1060b f4165D = new C1060b(PointF.class, "bottomRight", 2);

    /* renamed from: E */
    public static final C1060b f4166E = new C1060b(PointF.class, "topLeft", 3);

    /* renamed from: F */
    public static final C1060b f4167F = new C1060b(PointF.class, "position", 4);

    /* renamed from: I */
    public static void m2576I(C1079u c1079u) {
        View view = c1079u.f4220b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = c1079u.f4219a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", c1079u.f4220b.getParent());
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: d */
    public final void mo2567d(C1079u c1079u) {
        m2576I(c1079u);
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: g */
    public final void mo2569g(C1079u c1079u) {
        m2576I(c1079u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p089j0.AbstractC1071m
    /* renamed from: k */
    public final Animator mo2577k(ViewGroup viewGroup, C1079u c1079u, C1079u c1079u2) {
        int i2;
        C1064f c1064f;
        ObjectAnimator m2585a;
        if (c1079u != null && c1079u2 != null) {
            HashMap hashMap = c1079u.f4219a;
            HashMap hashMap2 = c1079u2.f4219a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i3 = rect.left;
                int i4 = rect2.left;
                int i5 = rect.top;
                int i6 = rect2.top;
                int i7 = rect.right;
                int i8 = rect2.right;
                int i9 = rect.bottom;
                int i10 = rect2.bottom;
                int i11 = i7 - i3;
                int i12 = i9 - i5;
                int i13 = i8 - i4;
                int i14 = i10 - i6;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                    i2 = 0;
                } else {
                    i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
                    if (i7 != i8 || i9 != i10) {
                        i2++;
                    }
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i2++;
                }
                if (i2 > 0) {
                    View view = c1079u2.f4220b;
                    AbstractC1081w.m2605a(view, i3, i5, i7, i9);
                    if (i2 != 2) {
                        c1064f = this;
                        if (i3 == i4 && i5 == i6) {
                            c1064f.f4208v.getClass();
                            m2585a = AbstractC1067i.m2585a(view, f4165D, C0651y.m1680e(i7, i9, i8, i10));
                        } else {
                            c1064f.f4208v.getClass();
                            m2585a = AbstractC1067i.m2585a(view, f4166E, C0651y.m1680e(i3, i5, i4, i6));
                        }
                    } else if (i11 == i13 && i12 == i14) {
                        c1064f = this;
                        c1064f.f4208v.getClass();
                        m2585a = AbstractC1067i.m2585a(view, f4167F, C0651y.m1680e(i3, i5, i4, i6));
                    } else {
                        c1064f = this;
                        C1063e c1063e = new C1063e(view);
                        c1064f.f4208v.getClass();
                        ObjectAnimator m2585a2 = AbstractC1067i.m2585a(c1063e, f4163B, C0651y.m1680e(i3, i5, i4, i6));
                        c1064f.f4208v.getClass();
                        ObjectAnimator m2585a3 = AbstractC1067i.m2585a(c1063e, f4164C, C0651y.m1680e(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(m2585a2, m2585a3);
                        animatorSet.addListener(new C1061c(c1063e));
                        m2585a = animatorSet;
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        AbstractC0458e.m1184b0(viewGroup4, true);
                        c1064f.m2596o().m2590a(new C1062d(viewGroup4));
                    }
                    return m2585a;
                }
            }
        }
        return null;
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: q */
    public final String[] mo2578q() {
        return f4162A;
    }
}
