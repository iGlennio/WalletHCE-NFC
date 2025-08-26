package p026J1;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: J1.u */
/* loaded from: classes.dex */
public interface InterfaceC0253u extends Closeable, Flushable {
    /* renamed from: a */
    C0256x mo103a();

    /* renamed from: b */
    void mo104b(C0239g c0239g, long j2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
