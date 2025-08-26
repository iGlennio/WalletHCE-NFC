package p055U0;

import java.util.Map;

/* renamed from: U0.m */
/* loaded from: classes.dex */
public final class C0499m implements Map.Entry {

    /* renamed from: a */
    public C0499m f1361a;

    /* renamed from: b */
    public C0499m f1362b;

    /* renamed from: c */
    public C0499m f1363c;

    /* renamed from: d */
    public C0499m f1364d;

    /* renamed from: e */
    public C0499m f1365e;

    /* renamed from: f */
    public final Object f1366f;

    /* renamed from: g */
    public final boolean f1367g;

    /* renamed from: h */
    public Object f1368h;

    /* renamed from: i */
    public int f1369i;

    public C0499m(boolean z2) {
        this.f1366f = null;
        this.f1367g = z2;
        this.f1365e = this;
        this.f1364d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f1366f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f1368h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1366f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1368h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f1366f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f1368h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f1367g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f1368h;
        this.f1368h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1366f + "=" + this.f1368h;
    }

    public C0499m(boolean z2, C0499m c0499m, Object obj, C0499m c0499m2, C0499m c0499m3) {
        this.f1361a = c0499m;
        this.f1366f = obj;
        this.f1367g = z2;
        this.f1369i = 1;
        this.f1364d = c0499m2;
        this.f1365e = c0499m3;
        c0499m3.f1364d = this;
        c0499m2.f1365e = this;
    }
}
