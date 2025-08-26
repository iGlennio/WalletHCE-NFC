package p080f1;

import java.lang.reflect.Method;
import p095l1.AbstractC1136c;
import p097m1.AbstractC1143a;
import p097m1.C1144b;

/* renamed from: f1.b */
/* loaded from: classes.dex */
public class C0864b {
    /* renamed from: a */
    public void mo2285a(Throwable th, Throwable th2) {
        AbstractC1136c.m2637e(th, "cause");
        AbstractC1136c.m2637e(th2, "exception");
        Method method = AbstractC0863a.f3494a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* renamed from: b */
    public AbstractC1143a mo2286b() {
        return new C1144b();
    }
}
