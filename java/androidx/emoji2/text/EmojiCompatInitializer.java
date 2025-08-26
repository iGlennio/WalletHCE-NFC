package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.InterfaceC0669d;
import androidx.lifecycle.InterfaceC0683r;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p005C.C0046i;
import p084h0.C0887a;
import p084h0.InterfaceC0888b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0888b {
    @Override // p084h0.InterfaceC0888b
    /* renamed from: a */
    public final List mo1506a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p084h0.InterfaceC0888b
    /* renamed from: b */
    public final Object mo1507b(Context context) {
        Object obj;
        C0603q c0603q = new C0603q(new C0046i(context));
        c0603q.f1970a = 1;
        if (C0596j.f1974j == null) {
            synchronized (C0596j.f1973i) {
                try {
                    if (C0596j.f1974j == null) {
                        C0596j.f1974j = new C0596j(c0603q);
                    }
                } finally {
                }
            }
        }
        C0887a m2305c = C0887a.m2305c(context);
        m2305c.getClass();
        synchronized (C0887a.f3571e) {
            try {
                obj = m2305c.f3572a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = m2305c.m2307b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final C0685t mo1362d = ((InterfaceC0683r) obj).mo1362d();
        mo1362d.m1699a(new InterfaceC0669d(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0669d
            /* renamed from: a */
            public final void mo1508a() {
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0588b.m1509a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0599m(0), 500L);
                mo1362d.m1704f(this);
            }
        });
        return Boolean.TRUE;
    }
}
