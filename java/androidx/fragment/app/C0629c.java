package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p005C.AbstractC0044g;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public final class C0629c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2155a;

    /* renamed from: b */
    public final /* synthetic */ View f2156b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2157c;

    /* renamed from: d */
    public final /* synthetic */ C0625O f2158d;

    /* renamed from: e */
    public final /* synthetic */ C0631e f2159e;

    public C0629c(ViewGroup viewGroup, View view, boolean z2, C0625O c0625o, C0631e c0631e) {
        this.f2155a = viewGroup;
        this.f2156b = view;
        this.f2157c = z2;
        this.f2158d = c0625o;
        this.f2159e = c0631e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f2155a;
        View view = this.f2156b;
        viewGroup.endViewTransition(view);
        if (this.f2157c) {
            AbstractC0044g.m149a(view, this.f2158d.f2115a);
        }
        this.f2159e.m1639d();
    }
}
