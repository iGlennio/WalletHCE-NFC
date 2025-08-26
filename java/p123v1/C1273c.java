package p123v1;

import java.util.concurrent.TimeUnit;
import p095l1.AbstractC1136c;

/* renamed from: v1.c */
/* loaded from: classes.dex */
public final class C1273c {

    /* renamed from: n */
    public static final /* synthetic */ int f5121n = 0;

    /* renamed from: a */
    public final boolean f5122a;

    /* renamed from: b */
    public final boolean f5123b;

    /* renamed from: c */
    public final int f5124c;

    /* renamed from: d */
    public final int f5125d;

    /* renamed from: e */
    public final boolean f5126e;

    /* renamed from: f */
    public final boolean f5127f;

    /* renamed from: g */
    public final boolean f5128g;

    /* renamed from: h */
    public final int f5129h;

    /* renamed from: i */
    public final int f5130i;

    /* renamed from: j */
    public final boolean f5131j;

    /* renamed from: k */
    public final boolean f5132k;

    /* renamed from: l */
    public final boolean f5133l;

    /* renamed from: m */
    public String f5134m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC1136c.m2637e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public C1273c(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.f5122a = z2;
        this.f5123b = z3;
        this.f5124c = i2;
        this.f5125d = i3;
        this.f5126e = z4;
        this.f5127f = z5;
        this.f5128g = z6;
        this.f5129h = i4;
        this.f5130i = i5;
        this.f5131j = z7;
        this.f5132k = z8;
        this.f5133l = z9;
        this.f5134m = str;
    }

    public final String toString() {
        String str = this.f5134m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5122a) {
            sb.append("no-cache, ");
        }
        if (this.f5123b) {
            sb.append("no-store, ");
        }
        int i2 = this.f5124c;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i3 = this.f5125d;
        if (i3 != -1) {
            sb.append("s-maxage=");
            sb.append(i3);
            sb.append(", ");
        }
        if (this.f5126e) {
            sb.append("private, ");
        }
        if (this.f5127f) {
            sb.append("public, ");
        }
        if (this.f5128g) {
            sb.append("must-revalidate, ");
        }
        int i4 = this.f5129h;
        if (i4 != -1) {
            sb.append("max-stale=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.f5130i;
        if (i5 != -1) {
            sb.append("min-fresh=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f5131j) {
            sb.append("only-if-cached, ");
        }
        if (this.f5132k) {
            sb.append("no-transform, ");
        }
        if (this.f5133l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        AbstractC1136c.m2636d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f5134m = sb2;
        return sb2;
    }
}
