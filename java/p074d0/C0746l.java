package p074d0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: d0.l */
/* loaded from: classes.dex */
public final class C0746l {

    /* renamed from: a */
    public final int f2970a;

    /* renamed from: b */
    public final int f2971b;

    /* renamed from: c */
    public final long f2972c;

    /* renamed from: d */
    public final long f2973d;

    public C0746l(int i2, int i3, long j2, long j3) {
        this.f2970a = i2;
        this.f2971b = i3;
        this.f2972c = j2;
        this.f2973d = j3;
    }

    /* renamed from: a */
    public static C0746l m2039a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0746l c0746l = new C0746l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0746l;
        } finally {
        }
    }

    /* renamed from: b */
    public final void m2040b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f2970a);
            dataOutputStream.writeInt(this.f2971b);
            dataOutputStream.writeLong(this.f2972c);
            dataOutputStream.writeLong(this.f2973d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0746l)) {
            C0746l c0746l = (C0746l) obj;
            if (this.f2971b == c0746l.f2971b && this.f2972c == c0746l.f2972c && this.f2970a == c0746l.f2970a && this.f2973d == c0746l.f2973d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2971b), Long.valueOf(this.f2972c), Integer.valueOf(this.f2970a), Long.valueOf(this.f2973d));
    }
}
