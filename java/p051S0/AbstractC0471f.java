package p051S0;

import java.io.IOException;
import java.io.StringWriter;
import p057V0.AbstractC0529q;
import p057V0.C0519g;
import p057V0.C0526n;
import p068a1.C0559b;

/* renamed from: S0.f */
/* loaded from: classes.dex */
public abstract class AbstractC0471f {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C0559b c0559b = new C0559b(stringWriter);
            c0559b.f1548e = true;
            C0526n c0526n = AbstractC0529q.f1450a;
            C0519g.m1282d(c0559b, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
