package p027K;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p005C.C0041d;
import p006C0.AbstractC0054b;

/* renamed from: K.c0 */
/* loaded from: classes.dex */
public final class C0287c0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a */
    public final C0288d f790a;

    /* renamed from: b */
    public List f791b;

    /* renamed from: c */
    public ArrayList f792c;

    /* renamed from: d */
    public final HashMap f793d;

    public C0287c0(C0288d c0288d) {
        super(0);
        this.f793d = new HashMap();
        this.f790a = c0288d;
    }

    /* renamed from: a */
    public final C0293f0 m859a(WindowInsetsAnimation windowInsetsAnimation) {
        C0293f0 c0293f0 = (C0293f0) this.f793d.get(windowInsetsAnimation);
        if (c0293f0 == null) {
            c0293f0 = new C0293f0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0293f0.f806a = new C0289d0(windowInsetsAnimation);
            }
            this.f793d.put(windowInsetsAnimation, c0293f0);
        }
        return c0293f0;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0288d c0288d = this.f790a;
        m859a(windowInsetsAnimation);
        ((View) c0288d.f798e).setTranslationY(0.0f);
        this.f793d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0288d c0288d = this.f790a;
        m859a(windowInsetsAnimation);
        View view = (View) c0288d.f798e;
        int[] iArr = (int[]) c0288d.f799f;
        view.getLocationOnScreen(iArr);
        c0288d.f796c = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f792c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f792c = arrayList2;
            this.f791b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation m224k = AbstractC0054b.m224k(list.get(size));
            C0293f0 m859a = m859a(m224k);
            fraction = m224k.getFraction();
            m859a.f806a.mo864d(fraction);
            this.f792c.add(m859a);
        }
        C0288d c0288d = this.f790a;
        C0319s0 m936g = C0319s0.m936g(null, windowInsets);
        c0288d.m860a(m936g, this.f791b);
        return m936g.m941f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0288d c0288d = this.f790a;
        m859a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C0041d m146c = C0041d.m146c(lowerBound);
        upperBound = bounds.getUpperBound();
        C0041d m146c2 = C0041d.m146c(upperBound);
        View view = (View) c0288d.f798e;
        int[] iArr = (int[]) c0288d.f799f;
        view.getLocationOnScreen(iArr);
        int i2 = c0288d.f796c - iArr[1];
        c0288d.f797d = i2;
        view.setTranslationY(i2);
        AbstractC0054b.m227n();
        return AbstractC0054b.m222i(m146c.m147d(), m146c2.m147d());
    }
}
