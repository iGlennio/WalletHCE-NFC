package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.AbstractActivityC0571k;
import java.util.Iterator;
import java.util.Map;
import p072c1.C0698b;
import p081g0.C0869d;
import p081g0.InterfaceC0868c;
import p095l1.AbstractC1136c;

/* renamed from: androidx.lifecycle.H */
/* loaded from: classes.dex */
public final class C0660H implements InterfaceC0868c {

    /* renamed from: a */
    public final C0869d f2291a;

    /* renamed from: b */
    public boolean f2292b;

    /* renamed from: c */
    public Bundle f2293c;

    /* renamed from: d */
    public final C0698b f2294d;

    public C0660H(C0869d c0869d, AbstractActivityC0571k abstractActivityC0571k) {
        AbstractC1136c.m2637e(c0869d, "savedStateRegistry");
        this.f2291a = c0869d;
        this.f2294d = new C0698b(new C0659G(0, abstractActivityC0571k));
    }

    @Override // p081g0.InterfaceC0868c
    /* renamed from: a */
    public final Bundle mo1354a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2293c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C0661I) this.f2294d.m1884a()).f2295c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f2292b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
