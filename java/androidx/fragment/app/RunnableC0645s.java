package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p027K.ViewTreeObserverOnPreDrawListenerC0320t;

/* renamed from: androidx.fragment.app.s */
/* loaded from: classes.dex */
public final class RunnableC0645s extends AnimationSet implements Runnable {

    /* renamed from: a */
    public final ViewGroup f2254a;

    /* renamed from: b */
    public final View f2255b;

    /* renamed from: c */
    public boolean f2256c;

    /* renamed from: d */
    public boolean f2257d;

    /* renamed from: e */
    public boolean f2258e;

    public RunnableC0645s(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2258e = true;
        this.f2254a = viewGroup;
        this.f2255b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation) {
        this.f2258e = true;
        if (this.f2256c) {
            return !this.f2257d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f2256c = true;
            ViewTreeObserverOnPreDrawListenerC0320t.m942a(this.f2254a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.f2256c;
        ViewGroup viewGroup = this.f2254a;
        if (z2 || !this.f2258e) {
            viewGroup.endViewTransition(this.f2255b);
            this.f2257d = true;
        } else {
            this.f2258e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j2, Transformation transformation, float f) {
        this.f2258e = true;
        if (this.f2256c) {
            return !this.f2257d;
        }
        if (!super.getTransformation(j2, transformation, f)) {
            this.f2256c = true;
            ViewTreeObserverOnPreDrawListenerC0320t.m942a(this.f2254a, this);
        }
        return true;
    }
}
