package p032L1;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import p035M1.C0382a;

/* renamed from: L1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0354a {
    static {
        char c2 = File.separatorChar;
        C0382a c0382a = new C0382a();
        PrintWriter printWriter = new PrintWriter(c0382a);
        try {
            printWriter.println();
            c0382a.toString();
            printWriter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    printWriter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public static void m1000a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
