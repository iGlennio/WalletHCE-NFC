package p035M1;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: M1.a */
/* loaded from: classes.dex */
public final class C0382a extends Writer implements Serializable {

    /* renamed from: a */
    public final StringBuilder f1025a = new StringBuilder(4);

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c2) {
        this.f1025a.append(c2);
        return this;
    }

    public final String toString() {
        return this.f1025a.toString();
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f1025a.append(str);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c2) {
        this.f1025a.append(c2);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        if (cArr != null) {
            this.f1025a.append(cArr, i2, i3);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f1025a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.f1025a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i2, int i3) {
        this.f1025a.append(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        this.f1025a.append(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
