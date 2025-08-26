package p132y1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p047Q1.AbstractC0458e;
import p088j.C0985d0;
import p095l1.AbstractC1136c;
import p126w1.AbstractC1302b;

/* renamed from: y1.b */
/* loaded from: classes.dex */
public final class C1322b {

    /* renamed from: a */
    public boolean f5408a;

    /* renamed from: b */
    public AbstractC1321a f5409b;

    /* renamed from: c */
    public final ArrayList f5410c;

    /* renamed from: d */
    public boolean f5411d;

    /* renamed from: e */
    public final C1323c f5412e;

    /* renamed from: f */
    public final String f5413f;

    public C1322b(C1323c c1323c, String str) {
        AbstractC1136c.m2637e(c1323c, "taskRunner");
        AbstractC1136c.m2637e(str, "name");
        this.f5412e = c1323c;
        this.f5413f = str;
        this.f5410c = new ArrayList();
    }

    /* renamed from: a */
    public final void m3024a() {
        byte[] bArr = AbstractC1302b.f5337a;
        synchronized (this.f5412e) {
            if (m3025b()) {
                this.f5412e.m3032d(this);
            }
        }
    }

    /* renamed from: b */
    public final boolean m3025b() {
        AbstractC1321a abstractC1321a = this.f5409b;
        if (abstractC1321a != null && abstractC1321a.f5407d) {
            this.f5411d = true;
        }
        ArrayList arrayList = this.f5410c;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((AbstractC1321a) arrayList.get(size)).f5407d) {
                AbstractC1321a abstractC1321a2 = (AbstractC1321a) arrayList.get(size);
                if (C1323c.f5415i.isLoggable(Level.FINE)) {
                    AbstractC0458e.m1187e(abstractC1321a2, this, "canceled");
                }
                arrayList.remove(size);
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: c */
    public final void m3026c(AbstractC1321a abstractC1321a, long j2) {
        AbstractC1136c.m2637e(abstractC1321a, "task");
        synchronized (this.f5412e) {
            if (!this.f5408a) {
                if (m3027d(abstractC1321a, j2, false)) {
                    this.f5412e.m3032d(this);
                }
            } else if (abstractC1321a.f5407d) {
                if (C1323c.f5415i.isLoggable(Level.FINE)) {
                    AbstractC0458e.m1187e(abstractC1321a, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C1323c.f5415i.isLoggable(Level.FINE)) {
                    AbstractC0458e.m1187e(abstractC1321a, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: d */
    public final boolean m3027d(AbstractC1321a abstractC1321a, long j2, boolean z2) {
        AbstractC1136c.m2637e(abstractC1321a, "task");
        C1322b c1322b = abstractC1321a.f5404a;
        if (c1322b != this) {
            if (c1322b != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            abstractC1321a.f5404a = this;
        }
        C0985d0 c0985d0 = this.f5412e.f5422g;
        long nanoTime = System.nanoTime();
        long j3 = nanoTime + j2;
        ArrayList arrayList = this.f5410c;
        int indexOf = arrayList.indexOf(abstractC1321a);
        if (indexOf != -1) {
            if (abstractC1321a.f5405b <= j3) {
                if (C1323c.f5415i.isLoggable(Level.FINE)) {
                    AbstractC0458e.m1187e(abstractC1321a, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        abstractC1321a.f5405b = j3;
        if (C1323c.f5415i.isLoggable(Level.FINE)) {
            AbstractC0458e.m1187e(abstractC1321a, this, z2 ? "run again after ".concat(AbstractC0458e.m1204v(j3 - nanoTime)) : "scheduled after ".concat(AbstractC0458e.m1204v(j3 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((AbstractC1321a) it.next()).f5405b - nanoTime > j2) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            i2 = arrayList.size();
        }
        arrayList.add(i2, abstractC1321a);
        return i2 == 0;
    }

    /* renamed from: e */
    public final void m3028e() {
        byte[] bArr = AbstractC1302b.f5337a;
        synchronized (this.f5412e) {
            this.f5408a = true;
            if (m3025b()) {
                this.f5412e.m3032d(this);
            }
        }
    }

    public final String toString() {
        return this.f5413f;
    }
}
