package p034M0;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.navigation.NavigationView;

/* renamed from: M0.w */
/* loaded from: classes.dex */
public abstract class AbstractC0378w {

    /* renamed from: c */
    public C0366k f1018c;

    /* renamed from: a */
    public boolean f1016a = false;

    /* renamed from: b */
    public boolean f1017b = false;

    /* renamed from: d */
    public RectF f1019d = new RectF();

    /* renamed from: e */
    public final Path f1020e = new Path();

    /* renamed from: a */
    public abstract void mo1047a(NavigationView navigationView);

    /* renamed from: b */
    public abstract boolean mo1048b();

    /* renamed from: c */
    public final void m1049c() {
        C0366k c0366k;
        RectF rectF = this.f1019d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (c0366k = this.f1018c) == null) {
            return;
        }
        AbstractC0367l.f978a.m1038a(c0366k, 1.0f, rectF, null, this.f1020e);
    }
}
