package p043P0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p088j.C0991f0;

/* renamed from: P0.r */
/* loaded from: classes.dex */
public final class C0424r extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f1140a;

    /* renamed from: b */
    public final /* synthetic */ TextView f1141b;

    /* renamed from: c */
    public final /* synthetic */ int f1142c;

    /* renamed from: d */
    public final /* synthetic */ TextView f1143d;

    /* renamed from: e */
    public final /* synthetic */ C0426t f1144e;

    public C0424r(C0426t c0426t, int i2, TextView textView, int i3, TextView textView2) {
        this.f1144e = c0426t;
        this.f1140a = i2;
        this.f1141b = textView;
        this.f1142c = i3;
        this.f1143d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0991f0 c0991f0;
        int i2 = this.f1140a;
        C0426t c0426t = this.f1144e;
        c0426t.f1161n = i2;
        c0426t.f1159l = null;
        TextView textView = this.f1141b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1142c == 1 && (c0991f0 = c0426t.f1165r) != null) {
                c0991f0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1143d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1143d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
