package p083h;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p010D1.AbstractC0096d;
import p027K.C0278W;

/* renamed from: h.k */
/* loaded from: classes.dex */
public final class C0883k {

    /* renamed from: c */
    public BaseInterpolator f3566c;

    /* renamed from: d */
    public AbstractC0096d f3567d;

    /* renamed from: e */
    public boolean f3568e;

    /* renamed from: b */
    public long f3565b = -1;

    /* renamed from: f */
    public final C0882j f3569f = new C0882j(this);

    /* renamed from: a */
    public final ArrayList f3564a = new ArrayList();

    /* renamed from: a */
    public final void m2299a() {
        if (this.f3568e) {
            Iterator it = this.f3564a.iterator();
            while (it.hasNext()) {
                ((C0278W) it.next()).m840b();
            }
            this.f3568e = false;
        }
    }

    /* renamed from: b */
    public final void m2300b() {
        View view;
        if (this.f3568e) {
            return;
        }
        Iterator it = this.f3564a.iterator();
        while (it.hasNext()) {
            C0278W c0278w = (C0278W) it.next();
            long j2 = this.f3565b;
            if (j2 >= 0) {
                c0278w.m841c(j2);
            }
            BaseInterpolator baseInterpolator = this.f3566c;
            if (baseInterpolator != null && (view = (View) c0278w.f775a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f3567d != null) {
                c0278w.m842d(this.f3569f);
            }
            View view2 = (View) c0278w.f775a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f3568e = true;
    }
}
