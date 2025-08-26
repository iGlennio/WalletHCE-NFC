package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import p047Q1.AbstractC0458e;

/* renamed from: androidx.emoji2.text.l */
/* loaded from: classes.dex */
public final class C0598l extends AbstractC0458e {

    /* renamed from: h */
    public final /* synthetic */ AbstractC0458e f1987h;

    /* renamed from: i */
    public final /* synthetic */ ThreadPoolExecutor f1988i;

    public C0598l(AbstractC0458e abstractC0458e, ThreadPoolExecutor threadPoolExecutor) {
        this.f1987h = abstractC0458e;
        this.f1988i = threadPoolExecutor;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: J */
    public final void mo1210J(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1988i;
        try {
            this.f1987h.mo1210J(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: O */
    public final void mo1213O(C0605s c0605s) {
        ThreadPoolExecutor threadPoolExecutor = this.f1988i;
        try {
            this.f1987h.mo1213O(c0605s);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
