package p055U0;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005C.AbstractC0044g;
import p051S0.AbstractC0477l;
import p051S0.C0469d;
import p051S0.InterfaceC0478m;
import p065Z0.C0551a;

/* renamed from: U0.h */
/* loaded from: classes.dex */
public final class C0494h implements InterfaceC0478m, Cloneable {

    /* renamed from: c */
    public static final C0494h f1349c;

    /* renamed from: a */
    public List f1350a;

    /* renamed from: b */
    public List f1351b;

    static {
        C0494h c0494h = new C0494h();
        List list = Collections.EMPTY_LIST;
        c0494h.f1350a = list;
        c0494h.f1351b = list;
        f1349c = c0494h;
    }

    /* renamed from: c */
    public static boolean m1269c(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // p051S0.InterfaceC0478m
    /* renamed from: a */
    public final AbstractC0477l mo1231a(C0469d c0469d, C0551a c0551a) {
        boolean z2;
        boolean z3;
        boolean m1269c = m1269c(c0551a.f1518a);
        if (m1269c) {
            z2 = true;
        } else {
            m1270b(true);
            z2 = false;
        }
        if (m1269c) {
            z3 = true;
        } else {
            m1270b(false);
            z3 = false;
        }
        if (z2 || z3) {
            return new C0493g(this, z3, z2, c0469d, c0551a);
        }
        return null;
    }

    /* renamed from: b */
    public final void m1270b(boolean z2) {
        Iterator it = (z2 ? this.f1350a : this.f1351b).iterator();
        if (it.hasNext()) {
            throw AbstractC0044g.m152d(it);
        }
    }

    public final Object clone() {
        try {
            return (C0494h) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
