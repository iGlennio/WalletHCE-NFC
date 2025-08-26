package p123v1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import p001A1.AbstractC0005d;
import p095l1.AbstractC1136c;

/* renamed from: v1.i */
/* loaded from: classes.dex */
public final class C1279i {

    /* renamed from: j */
    public static final Pattern f5164j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    public static final Pattern f5165k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    public static final Pattern f5166l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    public static final Pattern f5167m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    public final String f5168a;

    /* renamed from: b */
    public final String f5169b;

    /* renamed from: c */
    public final long f5170c;

    /* renamed from: d */
    public final String f5171d;

    /* renamed from: e */
    public final String f5172e;

    /* renamed from: f */
    public final boolean f5173f;

    /* renamed from: g */
    public final boolean f5174g;

    /* renamed from: h */
    public final boolean f5175h;

    /* renamed from: i */
    public final boolean f5176i;

    public C1279i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f5168a = str;
        this.f5169b = str2;
        this.f5170c = j2;
        this.f5171d = str3;
        this.f5172e = str4;
        this.f5173f = z2;
        this.f5174g = z3;
        this.f5175h = z4;
        this.f5176i = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1279i)) {
            return false;
        }
        C1279i c1279i = (C1279i) obj;
        return AbstractC1136c.m2633a(c1279i.f5168a, this.f5168a) && AbstractC1136c.m2633a(c1279i.f5169b, this.f5169b) && c1279i.f5170c == this.f5170c && AbstractC1136c.m2633a(c1279i.f5171d, this.f5171d) && AbstractC1136c.m2633a(c1279i.f5172e, this.f5172e) && c1279i.f5173f == this.f5173f && c1279i.f5174g == this.f5174g && c1279i.f5175h == this.f5175h && c1279i.f5176i == this.f5176i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5176i) + ((Boolean.hashCode(this.f5175h) + ((Boolean.hashCode(this.f5174g) + ((Boolean.hashCode(this.f5173f) + ((this.f5172e.hashCode() + ((this.f5171d.hashCode() + ((Long.hashCode(this.f5170c) + ((this.f5169b.hashCode() + ((this.f5168a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5168a);
        sb.append('=');
        sb.append(this.f5169b);
        if (this.f5175h) {
            long j2 = this.f5170c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) AbstractC0005d.f4a.get()).format(new Date(j2));
                AbstractC1136c.m2636d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f5176i) {
            sb.append("; domain=");
            sb.append(this.f5171d);
        }
        sb.append("; path=");
        sb.append(this.f5172e);
        if (this.f5173f) {
            sb.append("; secure");
        }
        if (this.f5174g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        AbstractC1136c.m2636d(sb2, "toString()");
        return sb2;
    }
}
