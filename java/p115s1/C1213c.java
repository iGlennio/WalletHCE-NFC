package p115s1;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: s1.c */
/* loaded from: classes.dex */
public final class C1213c extends InputStream {

    /* renamed from: d */
    public static final Logger f4762d = Logger.getLogger("net.sf.scuba");

    /* renamed from: a */
    public final DataInputStream f4763a;

    /* renamed from: b */
    public C1212b f4764b;

    /* renamed from: c */
    public C1212b f4765c;

    public C1213c(ByteArrayInputStream byteArrayInputStream) {
        try {
            byteArrayInputStream.available();
        } catch (IOException e2) {
            f4762d.log(Level.WARNING, "Exception reading from stream", (Throwable) e2);
        }
        this.f4763a = new DataInputStream(byteArrayInputStream);
        this.f4764b = new C1212b(new ArrayDeque(), true, false, false);
        this.f4765c = null;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4763a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4763a.close();
    }

    /* renamed from: g */
    public final int m2855g() {
        int i2;
        DataInputStream dataInputStream = this.f4763a;
        if (!this.f4764b.f4760c) {
            throw new IllegalStateException("Not at start of length");
        }
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 128) == 0) {
            i2 = 1;
        } else {
            int i3 = readUnsignedByte & 127;
            int i4 = 0;
            i2 = 1;
            for (int i5 = 0; i5 < i3; i5++) {
                i2++;
                i4 = (i4 << 8) | dataInputStream.readUnsignedByte();
            }
            readUnsignedByte = i4;
        }
        C1212b c1212b = this.f4764b;
        ArrayDeque arrayDeque = c1212b.f4758a;
        if (readUnsignedByte < 0) {
            StringBuilder sb = new StringBuilder("Cannot set negative length (length = ");
            sb.append(readUnsignedByte);
            sb.append(", 0x");
            sb.append(Integer.toHexString(readUnsignedByte));
            sb.append(" for tag ");
            if (arrayDeque.isEmpty()) {
                throw new IllegalStateException("Tag not yet read.");
            }
            sb.append(Integer.toHexString(((C1211a) arrayDeque.peek()).f4755a));
            sb.append(").");
            throw new IllegalArgumentException(sb.toString());
        }
        C1211a c1211a = (C1211a) arrayDeque.pop();
        if (!arrayDeque.isEmpty()) {
            ((C1211a) arrayDeque.peek()).f4757c += i2;
        }
        c1211a.f4756b = readUnsignedByte;
        arrayDeque.push(c1211a);
        c1212b.f4759b = false;
        c1212b.f4760c = false;
        c1212b.f4761d = true;
        return readUnsignedByte;
    }

    /* renamed from: h */
    public final int m2856h() {
        DataInputStream dataInputStream = this.f4763a;
        C1212b c1212b = this.f4764b;
        if (!c1212b.f4759b && !c1212b.f4761d) {
            throw new IllegalStateException("Not at start of tag");
        }
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        int i2 = 1;
        while (true) {
            if (readUnsignedByte != 0 && readUnsignedByte != 255) {
                break;
            }
            readUnsignedByte = dataInputStream.readUnsignedByte();
            i2++;
        }
        if ((readUnsignedByte & 31) == 31) {
            int readUnsignedByte2 = dataInputStream.readUnsignedByte();
            while (true) {
                i2++;
                if ((readUnsignedByte2 & 128) != 128) {
                    break;
                }
                readUnsignedByte = (readUnsignedByte << 8) | (readUnsignedByte2 & 127);
                readUnsignedByte2 = dataInputStream.readUnsignedByte();
            }
            readUnsignedByte = (readUnsignedByte2 & 127) | (readUnsignedByte << 8);
        }
        C1212b c1212b2 = this.f4764b;
        c1212b2.getClass();
        C1211a c1211a = new C1211a(readUnsignedByte, Integer.MAX_VALUE, 0);
        ArrayDeque arrayDeque = c1212b2.f4758a;
        if (!arrayDeque.isEmpty()) {
            ((C1211a) arrayDeque.peek()).f4757c += i2;
        }
        arrayDeque.push(c1211a);
        c1212b2.f4759b = false;
        c1212b2.f4760c = true;
        c1212b2.f4761d = false;
        return readUnsignedByte;
    }

    /* renamed from: i */
    public final byte[] m2857i() {
        C1212b c1212b = this.f4764b;
        if (!c1212b.f4761d) {
            throw new IllegalStateException("Not yet processing value!");
        }
        ArrayDeque arrayDeque = c1212b.f4758a;
        if (arrayDeque.isEmpty()) {
            throw new IllegalStateException("Length not yet known.");
        }
        int i2 = ((C1211a) arrayDeque.peek()).f4756b;
        byte[] bArr = new byte[i2];
        this.f4763a.readFully(bArr);
        this.f4764b.m2854a(i2);
        return bArr;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i2) {
        this.f4763a.mark(i2);
        this.f4765c = new C1212b(this.f4764b);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f4763a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f4763a.read();
        if (read < 0) {
            return -1;
        }
        this.f4764b.m2854a(1);
        return read;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        if (!this.f4763a.markSupported()) {
            throw new IOException("mark/reset not supported");
        }
        this.f4763a.reset();
        this.f4764b = this.f4765c;
        this.f4765c = null;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        long skip = this.f4763a.skip(j2);
        this.f4764b.m2854a((int) skip);
        return skip;
    }

    public final String toString() {
        return this.f4764b.f4758a.toString();
    }
}
