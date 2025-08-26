package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* renamed from: androidx.fragment.app.M */
/* loaded from: classes.dex */
public final class C0623M extends Writer {

    /* renamed from: b */
    public final StringBuilder f2111b = new StringBuilder(128);

    /* renamed from: a */
    public final String f2110a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1629g();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1629g();
    }

    /* renamed from: g */
    public final void m1629g() {
        StringBuilder sb = this.f2111b;
        if (sb.length() > 0) {
            Log.d(this.f2110a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                m1629g();
            } else {
                this.f2111b.append(c2);
            }
        }
    }
}
