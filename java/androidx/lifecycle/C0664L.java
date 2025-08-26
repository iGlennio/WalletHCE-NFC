package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: androidx.lifecycle.L */
/* loaded from: classes.dex */
public final class C0664L {

    /* renamed from: a */
    public final LinkedHashMap f2300a = new LinkedHashMap();

    /* renamed from: a */
    public final void m1691a() {
        for (AbstractC0662J abstractC0662J : this.f2300a.values()) {
            HashMap hashMap = abstractC0662J.f2296a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object obj : abstractC0662J.f2296a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0662J.f2297b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : abstractC0662J.f2297b) {
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            abstractC0662J.mo1607a();
        }
        this.f2300a.clear();
    }
}
