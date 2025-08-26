package p055U0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: U0.k */
/* loaded from: classes.dex */
public final class C0497k implements Iterator {

    /* renamed from: a */
    public C0499m f1354a;

    /* renamed from: b */
    public C0499m f1355b = null;

    /* renamed from: c */
    public int f1356c;

    /* renamed from: d */
    public final /* synthetic */ C0500n f1357d;

    /* renamed from: e */
    public final /* synthetic */ int f1358e;

    public C0497k(C0500n c0500n, int i2) {
        this.f1358e = i2;
        this.f1357d = c0500n;
        this.f1354a = c0500n.f1376f.f1364d;
        this.f1356c = c0500n.f1375e;
    }

    /* renamed from: a */
    public final Object m1271a() {
        return m1272b();
    }

    /* renamed from: b */
    public final C0499m m1272b() {
        C0499m c0499m = this.f1354a;
        C0500n c0500n = this.f1357d;
        if (c0499m == c0500n.f1376f) {
            throw new NoSuchElementException();
        }
        if (c0500n.f1375e != this.f1356c) {
            throw new ConcurrentModificationException();
        }
        this.f1354a = c0499m.f1364d;
        this.f1355b = c0499m;
        return c0499m;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1354a != this.f1357d.f1376f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f1358e) {
            case 1:
                return m1272b().f1366f;
            default:
                return m1271a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0499m c0499m = this.f1355b;
        if (c0499m == null) {
            throw new IllegalStateException();
        }
        C0500n c0500n = this.f1357d;
        c0500n.m1275c(c0499m, true);
        this.f1355b = null;
        this.f1356c = c0500n.f1375e;
    }
}
