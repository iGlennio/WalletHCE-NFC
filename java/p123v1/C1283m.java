package p123v1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1199i;
import p126w1.AbstractC1302b;

/* renamed from: v1.m */
/* loaded from: classes.dex */
public final class C1283m {

    /* renamed from: j */
    public static final char[] f5190j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final boolean f5191a;

    /* renamed from: b */
    public final String f5192b;

    /* renamed from: c */
    public final String f5193c;

    /* renamed from: d */
    public final String f5194d;

    /* renamed from: e */
    public final String f5195e;

    /* renamed from: f */
    public final int f5196f;

    /* renamed from: g */
    public final ArrayList f5197g;

    /* renamed from: h */
    public final String f5198h;

    /* renamed from: i */
    public final String f5199i;

    public C1283m(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        AbstractC1136c.m2637e(str, "scheme");
        AbstractC1136c.m2637e(str4, "host");
        this.f5192b = str;
        this.f5193c = str2;
        this.f5194d = str3;
        this.f5195e = str4;
        this.f5196f = i2;
        this.f5197g = arrayList2;
        this.f5198h = str5;
        this.f5199i = str6;
        this.f5191a = str.equals("https");
    }

    /* renamed from: a */
    public final String m2971a() {
        if (this.f5194d.length() == 0) {
            return "";
        }
        int length = this.f5192b.length() + 3;
        String str = this.f5199i;
        String substring = str.substring(AbstractC1199i.m2769u0(str, ':', length, 4) + 1, AbstractC1199i.m2769u0(str, '@', 0, 6));
        AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public final String m2972b() {
        int length = this.f5192b.length() + 3;
        String str = this.f5199i;
        int m2769u0 = AbstractC1199i.m2769u0(str, '/', length, 4);
        String substring = str.substring(m2769u0, AbstractC1302b.m2997f(str, "?#", m2769u0, str.length()));
        AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public final ArrayList m2973c() {
        int length = this.f5192b.length() + 3;
        String str = this.f5199i;
        int m2769u0 = AbstractC1199i.m2769u0(str, '/', length, 4);
        int m2997f = AbstractC1302b.m2997f(str, "?#", m2769u0, str.length());
        ArrayList arrayList = new ArrayList();
        while (m2769u0 < m2997f) {
            int i2 = m2769u0 + 1;
            int m2996e = AbstractC1302b.m2996e(str, '/', i2, m2997f);
            String substring = str.substring(i2, m2996e);
            AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            m2769u0 = m2996e;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String m2974d() {
        if (this.f5197g == null) {
            return null;
        }
        String str = this.f5199i;
        int m2769u0 = AbstractC1199i.m2769u0(str, '?', 0, 6) + 1;
        String substring = str.substring(m2769u0, AbstractC1302b.m2996e(str, '#', m2769u0, str.length()));
        AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public final String m2975e() {
        if (this.f5193c.length() == 0) {
            return "";
        }
        int length = this.f5192b.length() + 3;
        String str = this.f5199i;
        int m2997f = AbstractC1302b.m2997f(str, ":@", length, str.length());
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = str.substring(length, m2997f);
        AbstractC1136c.m2636d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1283m) && AbstractC1136c.m2633a(((C1283m) obj).f5199i, this.f5199i);
    }

    /* renamed from: f */
    public final String m2976f() {
        C1282l c1282l;
        try {
            c1282l = new C1282l();
            c1282l.m2970c(this, "/...");
        } catch (IllegalArgumentException unused) {
            c1282l = null;
        }
        AbstractC1136c.m2634b(c1282l);
        c1282l.f5183b = C1272b.m2954b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        c1282l.f5184c = C1272b.m2954b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return c1282l.m2968a().f5199i;
    }

    /* renamed from: g */
    public final URI m2977g() {
        String substring;
        String str;
        C1282l c1282l = new C1282l();
        String str2 = this.f5192b;
        c1282l.f5182a = str2;
        c1282l.f5183b = m2975e();
        c1282l.f5184c = m2971a();
        c1282l.f5185d = this.f5195e;
        int m2955c = C1272b.m2955c(str2);
        int i2 = this.f5196f;
        if (i2 == m2955c) {
            i2 = -1;
        }
        c1282l.f5186e = i2;
        ArrayList arrayList = c1282l.f5187f;
        arrayList.clear();
        arrayList.addAll(m2973c());
        String m2974d = m2974d();
        c1282l.f5188g = m2974d != null ? C1272b.m2958g(C1272b.m2954b(m2974d, 0, 0, " \"'<>#", 211)) : null;
        if (this.f5198h == null) {
            substring = null;
        } else {
            String str3 = this.f5199i;
            substring = str3.substring(AbstractC1199i.m2769u0(str3, '#', 0, 6) + 1);
            AbstractC1136c.m2636d(substring, "(this as java.lang.String).substring(startIndex)");
        }
        c1282l.f5189h = substring;
        String str4 = c1282l.f5185d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            AbstractC1136c.m2636d(compile, "compile(pattern)");
            str = compile.matcher(str4).replaceAll("");
            AbstractC1136c.m2636d(str, "nativePattern.matcher(in…).replaceAll(replacement)");
        } else {
            str = null;
        }
        c1282l.f5185d = str;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, C1272b.m2954b((String) arrayList.get(i3), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = c1282l.f5188g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str5 != null ? C1272b.m2954b(str5, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str6 = c1282l.f5189h;
        c1282l.f5189h = str6 != null ? C1272b.m2954b(str6, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String c1282l2 = c1282l.toString();
        try {
            return new URI(c1282l2);
        } catch (URISyntaxException e2) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC1136c.m2636d(compile2, "compile(pattern)");
                String replaceAll = compile2.matcher(c1282l2).replaceAll("");
                AbstractC1136c.m2636d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                URI create = URI.create(replaceAll);
                AbstractC1136c.m2636d(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.f5199i.hashCode();
    }

    public final String toString() {
        return this.f5199i;
    }
}
