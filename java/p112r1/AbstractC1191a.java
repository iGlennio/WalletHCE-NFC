package p112r1;

import java.nio.charset.Charset;
import p095l1.AbstractC1136c;

/* renamed from: r1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1191a {

    /* renamed from: a */
    public static final Charset f4563a;

    /* renamed from: b */
    public static volatile Charset f4564b;

    /* renamed from: c */
    public static volatile Charset f4565c;

    static {
        Charset forName = Charset.forName("UTF-8");
        AbstractC1136c.m2636d(forName, "forName(\"UTF-8\")");
        f4563a = forName;
        AbstractC1136c.m2636d(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        AbstractC1136c.m2636d(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        AbstractC1136c.m2636d(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        AbstractC1136c.m2636d(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        AbstractC1136c.m2636d(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
