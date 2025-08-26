package androidx.emoji2.text;

import java.util.ArrayList;
import p002B.C0019i;
import p018H.RunnableC0182b;
import p034M0.C0360e;
import p047Q1.AbstractC0458e;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes.dex */
public final class C0591e extends AbstractC0458e {

    /* renamed from: h */
    public final /* synthetic */ C0592f f1966h;

    public C0591e(C0592f c0592f) {
        this.f1966h = c0592f;
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: J */
    public final void mo1210J(Throwable th) {
        this.f1966h.f1967a.m1528d(th);
    }

    @Override // p047Q1.AbstractC0458e
    /* renamed from: O */
    public final void mo1213O(C0605s c0605s) {
        C0592f c0592f = this.f1966h;
        c0592f.f1969c = c0605s;
        c0592f.f1968b = new C0019i(c0592f.f1969c, new C0360e(26), c0592f.f1967a.f1982h);
        C0596j c0596j = c0592f.f1967a;
        c0596j.getClass();
        ArrayList arrayList = new ArrayList();
        c0596j.f1975a.writeLock().lock();
        try {
            c0596j.f1977c = 1;
            arrayList.addAll(c0596j.f1976b);
            c0596j.f1976b.clear();
            c0596j.f1975a.writeLock().unlock();
            c0596j.f1978d.post(new RunnableC0182b(arrayList, c0596j.f1977c, (Throwable) null));
        } catch (Throwable th) {
            c0596j.f1975a.writeLock().unlock();
            throw th;
        }
    }
}
