package p024J;

import p095l1.AbstractC1136c;
import p107q.C1178b;

/* renamed from: J.a */
/* loaded from: classes.dex */
public class C0226a {

    /* renamed from: a */
    public final Object[] f668a;

    /* renamed from: b */
    public int f669b;

    public C0226a(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f668a = new Object[i2];
    }

    /* renamed from: a */
    public Object mo630a() {
        int i2 = this.f669b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f668a;
        Object obj = objArr[i3];
        AbstractC1136c.m2635c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i3] = null;
        this.f669b--;
        return obj;
    }

    /* renamed from: b */
    public void m631b(C1178b c1178b) {
        int i2 = this.f669b;
        Object[] objArr = this.f668a;
        if (i2 < objArr.length) {
            objArr[i2] = c1178b;
            this.f669b = i2 + 1;
        }
    }

    /* renamed from: c */
    public boolean mo632c(Object obj) {
        Object[] objArr;
        boolean z2;
        AbstractC1136c.m2637e(obj, "instance");
        int i2 = this.f669b;
        int i3 = 0;
        while (true) {
            objArr = this.f668a;
            if (i3 >= i2) {
                z2 = false;
                break;
            }
            if (objArr[i3] == obj) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i4 = this.f669b;
        if (i4 >= objArr.length) {
            return false;
        }
        objArr[i4] = obj;
        this.f669b = i4 + 1;
        return true;
    }

    public C0226a() {
        this.f668a = new Object[256];
    }
}
