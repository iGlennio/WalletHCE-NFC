package p111r0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import p101o.C1161k;

/* renamed from: r0.b */
/* loaded from: classes.dex */
public final class C1189b {

    /* renamed from: a */
    public final C1161k f4556a = new C1161k();

    /* renamed from: b */
    public final C1161k f4557b = new C1161k();

    /* renamed from: a */
    public static C1189b m2750a(Context context, int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return m2751b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m2751b(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i2), e2);
            return null;
        }
    }

    /* renamed from: b */
    public static C1189b m2751b(ArrayList arrayList) {
        C1189b c1189b = new C1189b();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1189b.f4557b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AbstractC1188a.f4553b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AbstractC1188a.f4554c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AbstractC1188a.f4555d;
            }
            C1190c c1190c = new C1190c();
            c1190c.f4561d = 0;
            c1190c.f4562e = 1;
            c1190c.f4558a = startDelay;
            c1190c.f4559b = duration;
            c1190c.f4560c = interpolator;
            c1190c.f4561d = objectAnimator.getRepeatCount();
            c1190c.f4562e = objectAnimator.getRepeatMode();
            c1189b.f4556a.put(propertyName, c1190c);
        }
        return c1189b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1189b) {
            return this.f4556a.equals(((C1189b) obj).f4556a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4556a.hashCode();
    }

    public final String toString() {
        return "\n" + C1189b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4556a + "}\n";
    }
}
