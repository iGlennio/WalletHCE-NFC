package p021I;

/* renamed from: I.a */
/* loaded from: classes.dex */
public final class C0206a {

    /* renamed from: e */
    public static final byte[] f579e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f580a;

    /* renamed from: b */
    public final int f581b;

    /* renamed from: c */
    public int f582c;

    /* renamed from: d */
    public char f583d;

    static {
        for (int i2 = 0; i2 < 1792; i2++) {
            f579e[i2] = Character.getDirectionality(i2);
        }
    }

    public C0206a(CharSequence charSequence) {
        this.f580a = charSequence;
        this.f581b = charSequence.length();
    }

    /* renamed from: a */
    public final byte m580a() {
        int i2 = this.f582c - 1;
        CharSequence charSequence = this.f580a;
        char charAt = charSequence.charAt(i2);
        this.f583d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f582c);
            this.f582c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f582c--;
        char c2 = this.f583d;
        return c2 < 1792 ? f579e[c2] : Character.getDirectionality(c2);
    }
}
