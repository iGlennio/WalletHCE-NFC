package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import p058W.C0530a;

/* renamed from: androidx.emoji2.text.o */
/* loaded from: classes.dex */
public final class C0601o {

    /* renamed from: a */
    public int f1994a = 1;

    /* renamed from: b */
    public final C0604r f1995b;

    /* renamed from: c */
    public C0604r f1996c;

    /* renamed from: d */
    public C0604r f1997d;

    /* renamed from: e */
    public int f1998e;

    /* renamed from: f */
    public int f1999f;

    public C0601o(C0604r c0604r) {
        this.f1995b = c0604r;
        this.f1996c = c0604r;
    }

    /* renamed from: a */
    public final int m1533a(int i2) {
        SparseArray sparseArray = this.f1996c.f2009a;
        C0604r c0604r = sparseArray == null ? null : (C0604r) sparseArray.get(i2);
        int i3 = 1;
        int i4 = 2;
        if (this.f1994a == 2) {
            if (c0604r != null) {
                this.f1996c = c0604r;
                this.f1999f++;
            } else if (i2 == 65038) {
                m1534b();
            } else if (i2 != 65039) {
                C0604r c0604r2 = this.f1996c;
                if (c0604r2.f2010b != null) {
                    i4 = 3;
                    if (this.f1999f != 1) {
                        this.f1997d = c0604r2;
                        m1534b();
                    } else if (m1535c()) {
                        this.f1997d = this.f1996c;
                        m1534b();
                    } else {
                        m1534b();
                    }
                } else {
                    m1534b();
                }
            }
            i3 = i4;
        } else if (c0604r == null) {
            m1534b();
        } else {
            this.f1994a = 2;
            this.f1996c = c0604r;
            this.f1999f = 1;
            i3 = i4;
        }
        this.f1998e = i2;
        return i3;
    }

    /* renamed from: b */
    public final void m1534b() {
        this.f1994a = 1;
        this.f1996c = this.f1995b;
        this.f1999f = 0;
    }

    /* renamed from: c */
    public final boolean m1535c() {
        C0530a m1532b = this.f1996c.f2010b.m1532b();
        int m732a = m1532b.m732a(6);
        return !(m732a == 0 || ((ByteBuffer) m1532b.f759d).get(m732a + m1532b.f756a) == 0) || this.f1998e == 65039;
    }
}
