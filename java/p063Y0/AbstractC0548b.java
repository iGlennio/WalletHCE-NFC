package p063Y0;

import p057V0.C0513a;

/* renamed from: Y0.b */
/* loaded from: classes.dex */
public abstract class AbstractC0548b {

    /* renamed from: a */
    public static final boolean f1509a;

    /* renamed from: b */
    public static final C0513a f1510b;

    /* renamed from: c */
    public static final C0513a f1511c;

    /* renamed from: d */
    public static final C0513a f1512d;

    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        f1509a = z2;
        if (z2) {
            f1510b = C0547a.f1504c;
            f1511c = C0547a.f1505d;
            f1512d = C0547a.f1506e;
        } else {
            f1510b = null;
            f1511c = null;
            f1512d = null;
        }
    }
}
