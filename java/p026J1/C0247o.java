package p026J1;

import java.util.RandomAccess;
import p075d1.AbstractC0753e;

/* renamed from: J1.o */
/* loaded from: classes.dex */
public final class C0247o extends AbstractC0753e implements RandomAccess {

    /* renamed from: a */
    public final C0242j[] f731a;

    /* renamed from: b */
    public final int[] f732b;

    public C0247o(C0242j[] c0242jArr, int[] iArr) {
        this.f731a = c0242jArr;
        this.f732b = iArr;
    }

    @Override // p075d1.AbstractC0753e
    /* renamed from: a */
    public final int mo708a() {
        return this.f731a.length;
    }

    @Override // p075d1.AbstractC0753e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0242j) {
            return super.contains((C0242j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.f731a[i2];
    }

    @Override // p075d1.AbstractC0753e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0242j) {
            return super.indexOf((C0242j) obj);
        }
        return -1;
    }

    @Override // p075d1.AbstractC0753e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0242j) {
            return super.lastIndexOf((C0242j) obj);
        }
        return -1;
    }
}
