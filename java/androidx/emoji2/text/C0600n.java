package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p058W.C0530a;
import p058W.C0531b;

/* renamed from: androidx.emoji2.text.n */
/* loaded from: classes.dex */
public final class C0600n {

    /* renamed from: d */
    public static final ThreadLocal f1990d = new ThreadLocal();

    /* renamed from: a */
    public final int f1991a;

    /* renamed from: b */
    public final C0605s f1992b;

    /* renamed from: c */
    public volatile int f1993c = 0;

    public C0600n(C0605s c0605s, int i2) {
        this.f1992b = c0605s;
        this.f1991a = i2;
    }

    /* renamed from: a */
    public final int m1531a(int i2) {
        C0530a m1532b = m1532b();
        int m732a = m1532b.m732a(16);
        if (m732a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) m1532b.f759d;
        int i3 = m732a + m1532b.f756a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    /* renamed from: b */
    public final C0530a m1532b() {
        ThreadLocal threadLocal = f1990d;
        C0530a c0530a = (C0530a) threadLocal.get();
        if (c0530a == null) {
            c0530a = new C0530a();
            threadLocal.set(c0530a);
        }
        C0531b c0531b = (C0531b) this.f1992b.f2011a;
        int m732a = c0531b.m732a(6);
        if (m732a != 0) {
            int i2 = m732a + c0531b.f756a;
            int i3 = (this.f1991a * 4) + ((ByteBuffer) c0531b.f759d).getInt(i2) + i2 + 4;
            int i4 = ((ByteBuffer) c0531b.f759d).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) c0531b.f759d;
            c0530a.f759d = byteBuffer;
            if (byteBuffer != null) {
                c0530a.f756a = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                c0530a.f757b = i5;
                c0530a.f758c = ((ByteBuffer) c0530a.f759d).getShort(i5);
                return c0530a;
            }
            c0530a.f756a = 0;
            c0530a.f757b = 0;
            c0530a.f758c = 0;
        }
        return c0530a;
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0530a m1532b = m1532b();
        int m732a = m1532b.m732a(4);
        sb.append(Integer.toHexString(m732a != 0 ? ((ByteBuffer) m1532b.f759d).getInt(m732a + m1532b.f756a) : 0));
        sb.append(", codepoints:");
        C0530a m1532b2 = m1532b();
        int m732a2 = m1532b2.m732a(16);
        if (m732a2 != 0) {
            int i3 = m732a2 + m1532b2.f756a;
            i2 = ((ByteBuffer) m1532b2.f759d).getInt(((ByteBuffer) m1532b2.f759d).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(m1531a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
