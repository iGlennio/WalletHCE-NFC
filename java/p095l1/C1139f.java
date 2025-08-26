package p095l1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: l1.f */
/* loaded from: classes.dex */
public final class C1139f implements Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f4338a;

    /* renamed from: b */
    public Object f4339b;

    public C1139f(int i2) {
        this.f4338a = i2;
        switch (i2) {
            case 1:
                Pattern compile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                AbstractC1136c.m2636d(compile, "compile(pattern)");
                this.f4339b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f4338a) {
            case 0:
                return String.valueOf(this.f4339b);
            default:
                String pattern = ((Pattern) this.f4339b).toString();
                AbstractC1136c.m2636d(pattern, "nativePattern.toString()");
                return pattern;
        }
    }
}
