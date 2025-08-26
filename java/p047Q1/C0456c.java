package p047Q1;

import android.os.Bundle;
import androidx.activity.C0564d;
import androidx.activity.ExecutorC0570j;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0677l;
import androidx.lifecycle.EnumC0678m;
import androidx.lifecycle.InterfaceC0681p;
import androidx.lifecycle.InterfaceC0683r;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import p041O1.InterfaceC0397a;
import p081g0.C0869d;
import p081g0.InterfaceC0868c;
import p081g0.InterfaceC0870e;
import p093l.C1128d;
import p093l.C1130f;
import p095l1.AbstractC1136c;

/* renamed from: Q1.c */
/* loaded from: classes.dex */
public final class C0456c implements ILoggerFactory {

    /* renamed from: a */
    public boolean f1249a;

    /* renamed from: b */
    public final Object f1250b;

    /* renamed from: c */
    public final Object f1251c;

    public C0456c(InterfaceC0870e interfaceC0870e) {
        this.f1250b = interfaceC0870e;
        this.f1251c = new C0869d();
    }

    @Override // org.slf4j.ILoggerFactory
    /* renamed from: a */
    public synchronized InterfaceC0397a mo1014a(String str) {
        C0455b c0455b;
        c0455b = (C0455b) ((HashMap) this.f1250b).get(str);
        if (c0455b == null) {
            c0455b = new C0455b(str, (LinkedBlockingQueue) this.f1251c, this.f1249a);
            ((HashMap) this.f1250b).put(str, c0455b);
        }
        return c0455b;
    }

    /* renamed from: b */
    public void m1165b() {
        InterfaceC0870e interfaceC0870e = (InterfaceC0870e) this.f1250b;
        C0685t mo1362d = interfaceC0870e.mo1362d();
        if (mo1362d.f2325c != EnumC0678m.f2315b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        mo1362d.m1699a(new Recreator(interfaceC0870e));
        final C0869d c0869d = (C0869d) this.f1251c;
        c0869d.getClass();
        if (c0869d.f3497a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        mo1362d.m1699a(new InterfaceC0681p() { // from class: g0.a
            @Override // androidx.lifecycle.InterfaceC0681p
            /* renamed from: b */
            public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
                C0869d c0869d2 = C0869d.this;
                AbstractC1136c.m2637e(c0869d2, "this$0");
                if (enumC0677l == EnumC0677l.ON_START) {
                    c0869d2.f3499c = true;
                } else if (enumC0677l == EnumC0677l.ON_STOP) {
                    c0869d2.f3499c = false;
                }
            }
        });
        c0869d.f3497a = true;
        this.f1249a = true;
    }

    /* renamed from: c */
    public void m1166c(Bundle bundle) {
        if (!this.f1249a) {
            m1165b();
        }
        C0685t mo1362d = ((InterfaceC0870e) this.f1250b).mo1362d();
        if (mo1362d.f2325c.compareTo(EnumC0678m.f2317d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + mo1362d.f2325c).toString());
        }
        C0869d c0869d = (C0869d) this.f1251c;
        if (!c0869d.f3497a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0869d.f3498b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0869d.f3501e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0869d.f3498b = true;
    }

    /* renamed from: d */
    public void m1167d(Bundle bundle) {
        C0869d c0869d = (C0869d) this.f1251c;
        c0869d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0869d.f3501e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1130f c1130f = (C1130f) c0869d.f3500d;
        c1130f.getClass();
        C1128d c1128d = new C1128d(c1130f);
        c1130f.f4322c.put(c1128d, Boolean.FALSE);
        while (c1128d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1128d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0868c) entry.getValue()).mo1354a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public C0456c() {
        this.f1249a = false;
        this.f1250b = new HashMap();
        this.f1251c = new LinkedBlockingQueue();
    }

    public C0456c(ExecutorC0570j executorC0570j, C0564d c0564d) {
        this.f1250b = new Object();
        this.f1251c = new ArrayList();
    }
}
