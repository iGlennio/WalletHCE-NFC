package p068a1;

import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;
import p005C.AbstractC0044g;
import p034M0.C0360e;

/* renamed from: a1.a */
/* loaded from: classes.dex */
public class C0558a implements Closeable {

    /* renamed from: a */
    public final StringReader f1526a;

    /* renamed from: i */
    public long f1534i;

    /* renamed from: j */
    public int f1535j;

    /* renamed from: k */
    public String f1536k;

    /* renamed from: l */
    public int[] f1537l;

    /* renamed from: n */
    public String[] f1539n;

    /* renamed from: o */
    public int[] f1540o;

    /* renamed from: b */
    public boolean f1527b = false;

    /* renamed from: c */
    public final char[] f1528c = new char[1024];

    /* renamed from: d */
    public int f1529d = 0;

    /* renamed from: e */
    public int f1530e = 0;

    /* renamed from: f */
    public int f1531f = 0;

    /* renamed from: g */
    public int f1532g = 0;

    /* renamed from: h */
    public int f1533h = 0;

    /* renamed from: m */
    public int f1538m = 1;

    static {
        C0360e.f912c = new C0360e(24);
    }

    public C0558a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f1537l = iArr;
        iArr[0] = 6;
        this.f1539n = new String[32];
        this.f1540o = new int[32];
        this.f1526a = stringReader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        m1313i();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m1302A() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f1529d
            int r4 = r3 + r2
            int r5 = r7.f1530e
            char[] r6 = r7.f1528c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.m1313i()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m1317m(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f1529d
            r0.append(r6, r3, r2)
            int r3 = r7.f1529d
            int r3 = r3 + r2
            r7.f1529d = r3
            r2 = 1
            boolean r2 = r7.m1317m(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f1529d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f1529d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f1529d
            int r2 = r2 + r1
            r7.f1529d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p068a1.C0558a.m1302A():java.lang.String");
    }

    /* renamed from: B */
    public final int m1303B() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        switch (i2) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: C */
    public final void m1304C(int i2) {
        int i3 = this.f1538m;
        int[] iArr = this.f1537l;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f1537l = Arrays.copyOf(iArr, i4);
            this.f1540o = Arrays.copyOf(this.f1540o, i4);
            this.f1539n = (String[]) Arrays.copyOf(this.f1539n, i4);
        }
        int[] iArr2 = this.f1537l;
        int i5 = this.f1538m;
        this.f1538m = i5 + 1;
        iArr2[i5] = i2;
    }

    /* renamed from: D */
    public final char m1305D() {
        int i2;
        if (this.f1529d == this.f1530e && !m1317m(1)) {
            m1310I("Unterminated escape sequence");
            throw null;
        }
        int i3 = this.f1529d;
        int i4 = i3 + 1;
        this.f1529d = i4;
        char[] cArr = this.f1528c;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.f1531f++;
            this.f1532g = i4;
            return c2;
        }
        if (c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\') {
            return c2;
        }
        if (c2 == 'b') {
            return '\b';
        }
        if (c2 == 'f') {
            return '\f';
        }
        if (c2 == 'n') {
            return '\n';
        }
        if (c2 == 'r') {
            return '\r';
        }
        if (c2 == 't') {
            return '\t';
        }
        if (c2 != 'u') {
            m1310I("Invalid escape sequence");
            throw null;
        }
        if (i3 + 5 > this.f1530e && !m1317m(4)) {
            m1310I("Unterminated escape sequence");
            throw null;
        }
        int i5 = this.f1529d;
        int i6 = i5 + 4;
        char c3 = 0;
        while (i5 < i6) {
            char c4 = cArr[i5];
            char c5 = (char) (c3 << 4);
            if (c4 >= '0' && c4 <= '9') {
                i2 = c4 - '0';
            } else if (c4 >= 'a' && c4 <= 'f') {
                i2 = c4 - 'W';
            } else {
                if (c4 < 'A' || c4 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.f1529d, 4)));
                }
                i2 = c4 - '7';
            }
            c3 = (char) (i2 + c5);
            i5++;
        }
        this.f1529d += 4;
        return c3;
    }

    /* renamed from: E */
    public final void m1306E(char c2) {
        do {
            int i2 = this.f1529d;
            int i3 = this.f1530e;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = this.f1528c[i2];
                if (c3 == c2) {
                    this.f1529d = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f1529d = i4;
                    m1305D();
                    i2 = this.f1529d;
                    i3 = this.f1530e;
                } else {
                    if (c3 == '\n') {
                        this.f1531f++;
                        this.f1532g = i4;
                    }
                    i2 = i4;
                }
            }
            this.f1529d = i2;
        } while (m1317m(1));
        m1310I("Unterminated string");
        throw null;
    }

    /* renamed from: F */
    public final void m1307F() {
        char c2;
        do {
            if (this.f1529d >= this.f1530e && !m1317m(1)) {
                return;
            }
            int i2 = this.f1529d;
            int i3 = i2 + 1;
            this.f1529d = i3;
            c2 = this.f1528c[i2];
            if (c2 == '\n') {
                this.f1531f++;
                this.f1532g = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m1313i();
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1308G() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f1529d
            int r2 = r1 + r0
            int r3 = r4.f1530e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f1528c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m1313i()
        L4b:
            int r1 = r4.f1529d
            int r1 = r1 + r0
            r4.f1529d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f1529d = r1
            r0 = 1
            boolean r0 = r4.m1317m(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p068a1.C0558a.m1308G():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: H */
    public final void m1309H() {
        int i2 = 0;
        do {
            int i3 = this.f1533h;
            if (i3 == 0) {
                i3 = m1314j();
            }
            switch (i3) {
                case 1:
                    m1304C(3);
                    i2++;
                    this.f1533h = 0;
                    break;
                case 2:
                    if (i2 == 0) {
                        this.f1539n[this.f1538m - 1] = null;
                    }
                    this.f1538m--;
                    i2--;
                    this.f1533h = 0;
                    break;
                case 3:
                    m1304C(1);
                    i2++;
                    this.f1533h = 0;
                    break;
                case 4:
                    this.f1538m--;
                    i2--;
                    this.f1533h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f1533h = 0;
                    break;
                case 8:
                    m1306E('\'');
                    this.f1533h = 0;
                    break;
                case 9:
                    m1306E('\"');
                    this.f1533h = 0;
                    break;
                case 10:
                    m1308G();
                    this.f1533h = 0;
                    break;
                case 12:
                    m1306E('\'');
                    if (i2 == 0) {
                        this.f1539n[this.f1538m - 1] = "<skipped>";
                    }
                    this.f1533h = 0;
                    break;
                case 13:
                    m1306E('\"');
                    if (i2 == 0) {
                        this.f1539n[this.f1538m - 1] = "<skipped>";
                    }
                    this.f1533h = 0;
                    break;
                case 14:
                    m1308G();
                    if (i2 == 0) {
                        this.f1539n[this.f1538m - 1] = "<skipped>";
                    }
                    this.f1533h = 0;
                    break;
                case 16:
                    this.f1529d += this.f1535j;
                    this.f1533h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i2 > 0);
        int[] iArr = this.f1540o;
        int i4 = this.f1538m - 1;
        iArr[i4] = iArr[i4] + 1;
    }

    /* renamed from: I */
    public final void m1310I(String str) {
        throw new C0560c(str + m1321q());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1533h = 0;
        this.f1537l[0] = 8;
        this.f1538m = 1;
        this.f1526a.close();
    }

    /* renamed from: g */
    public final void m1311g() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 == 3) {
            m1304C(1);
            this.f1540o[this.f1538m - 1] = 0;
            this.f1533h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
        }
    }

    /* renamed from: h */
    public final void m1312h() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 == 1) {
            m1304C(3);
            this.f1533h = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
        }
    }

    /* renamed from: i */
    public final void m1313i() {
        if (this.f1527b) {
            return;
        }
        m1310I("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x020f, code lost:
    
        if (m1320p(r7) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0212, code lost:
    
        if (r11 != 2) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0214, code lost:
    
        if (r14 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x021a, code lost:
    
        if (r1 != Long.MIN_VALUE) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x021c, code lost:
    
        if (r17 == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0223, code lost:
    
        if (r1 != 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0225, code lost:
    
        if (r17 != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0227, code lost:
    
        if (r17 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022a, code lost:
    
        r1 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022b, code lost:
    
        r24.f1534i = r1;
        r24.f1529d += r13;
        r10 = 15;
        r24.f1533h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021f, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0237, code lost:
    
        if (r11 == r8) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023a, code lost:
    
        if (r11 == 4) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x023d, code lost:
    
        if (r11 != 7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023f, code lost:
    
        r24.f1535j = r13;
        r10 = 16;
        r24.f1533h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0267 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ea  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m1314j() {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p068a1.C0558a.m1314j():int");
    }

    /* renamed from: k */
    public final void m1315k() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
        }
        int i3 = this.f1538m;
        this.f1538m = i3 - 1;
        int[] iArr = this.f1540o;
        int i4 = i3 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.f1533h = 0;
    }

    /* renamed from: l */
    public final void m1316l() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
        }
        int i3 = this.f1538m;
        int i4 = i3 - 1;
        this.f1538m = i4;
        this.f1539n[i4] = null;
        int[] iArr = this.f1540o;
        int i5 = i3 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.f1533h = 0;
    }

    /* renamed from: m */
    public final boolean m1317m(int i2) {
        int i3;
        int i4;
        int i5 = this.f1532g;
        int i6 = this.f1529d;
        this.f1532g = i5 - i6;
        int i7 = this.f1530e;
        char[] cArr = this.f1528c;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f1530e = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f1530e = 0;
        }
        this.f1529d = 0;
        do {
            int i9 = this.f1530e;
            int read = this.f1526a.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f1530e + read;
            this.f1530e = i3;
            if (this.f1531f == 0 && (i4 = this.f1532g) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f1529d++;
                this.f1532g = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    /* renamed from: n */
    public final String m1318n(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.f1538m;
            if (i2 >= i3) {
                return sb.toString();
            }
            int i4 = this.f1537l[i2];
            if (i4 == 1 || i4 == 2) {
                int i5 = this.f1540o[i2];
                if (z2 && i5 > 0 && i2 == i3 - 1) {
                    i5--;
                }
                sb.append('[');
                sb.append(i5);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.f1539n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    /* renamed from: o */
    public final boolean m1319o() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        return (i2 == 2 || i2 == 4 || i2 == 17) ? false : true;
    }

    /* renamed from: p */
    public final boolean m1320p(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m1313i();
        return false;
    }

    /* renamed from: q */
    public final String m1321q() {
        return " at line " + (this.f1531f + 1) + " column " + ((this.f1529d - this.f1532g) + 1) + " path " + m1318n(false);
    }

    /* renamed from: r */
    public final boolean m1322r() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 == 5) {
            this.f1533h = 0;
            int[] iArr = this.f1540o;
            int i3 = this.f1538m - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
        }
        this.f1533h = 0;
        int[] iArr2 = this.f1540o;
        int i4 = this.f1538m - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return false;
    }

    /* renamed from: s */
    public final double m1323s() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 == 15) {
            this.f1533h = 0;
            int[] iArr = this.f1540o;
            int i3 = this.f1538m - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f1534i;
        }
        if (i2 == 16) {
            this.f1536k = new String(this.f1528c, this.f1529d, this.f1535j);
            this.f1529d += this.f1535j;
        } else if (i2 == 8 || i2 == 9) {
            this.f1536k = m1329y(i2 == 8 ? '\'' : '\"');
        } else if (i2 == 10) {
            this.f1536k = m1302A();
        } else if (i2 != 11) {
            throw new IllegalStateException("Expected a double but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
        }
        this.f1533h = 11;
        double parseDouble = Double.parseDouble(this.f1536k);
        if (!this.f1527b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new C0560c("JSON forbids NaN and infinities: " + parseDouble + m1321q());
        }
        this.f1536k = null;
        this.f1533h = 0;
        int[] iArr2 = this.f1540o;
        int i4 = this.f1538m - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return parseDouble;
    }

    /* renamed from: t */
    public final int m1324t() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 == 15) {
            long j2 = this.f1534i;
            int i3 = (int) j2;
            if (j2 != i3) {
                throw new NumberFormatException("Expected an int but was " + this.f1534i + m1321q());
            }
            this.f1533h = 0;
            int[] iArr = this.f1540o;
            int i4 = this.f1538m - 1;
            iArr[i4] = iArr[i4] + 1;
            return i3;
        }
        if (i2 == 16) {
            this.f1536k = new String(this.f1528c, this.f1529d, this.f1535j);
            this.f1529d += this.f1535j;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                throw new IllegalStateException("Expected an int but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
            }
            if (i2 == 10) {
                this.f1536k = m1302A();
            } else {
                this.f1536k = m1329y(i2 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f1536k);
                this.f1533h = 0;
                int[] iArr2 = this.f1540o;
                int i5 = this.f1538m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1533h = 11;
        double parseDouble = Double.parseDouble(this.f1536k);
        int i6 = (int) parseDouble;
        if (i6 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f1536k + m1321q());
        }
        this.f1536k = null;
        this.f1533h = 0;
        int[] iArr3 = this.f1540o;
        int i7 = this.f1538m - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    public final String toString() {
        return C0558a.class.getSimpleName() + m1321q();
    }

    /* renamed from: u */
    public final long m1325u() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 == 15) {
            this.f1533h = 0;
            int[] iArr = this.f1540o;
            int i3 = this.f1538m - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f1534i;
        }
        if (i2 == 16) {
            this.f1536k = new String(this.f1528c, this.f1529d, this.f1535j);
            this.f1529d += this.f1535j;
        } else {
            if (i2 != 8 && i2 != 9 && i2 != 10) {
                throw new IllegalStateException("Expected a long but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
            }
            if (i2 == 10) {
                this.f1536k = m1302A();
            } else {
                this.f1536k = m1329y(i2 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f1536k);
                this.f1533h = 0;
                int[] iArr2 = this.f1540o;
                int i4 = this.f1538m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1533h = 11;
        double parseDouble = Double.parseDouble(this.f1536k);
        long j2 = (long) parseDouble;
        if (j2 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f1536k + m1321q());
        }
        this.f1536k = null;
        this.f1533h = 0;
        int[] iArr3 = this.f1540o;
        int i5 = this.f1538m - 1;
        iArr3[i5] = iArr3[i5] + 1;
        return j2;
    }

    /* renamed from: v */
    public final String m1326v() {
        String m1329y;
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 == 14) {
            m1329y = m1302A();
        } else if (i2 == 12) {
            m1329y = m1329y('\'');
        } else {
            if (i2 != 13) {
                throw new IllegalStateException("Expected a name but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
            }
            m1329y = m1329y('\"');
        }
        this.f1533h = 0;
        this.f1539n[this.f1538m - 1] = m1329y;
        return m1329y;
    }

    /* renamed from: w */
    public final int m1327w(boolean z2) {
        char c2;
        int i2 = this.f1529d;
        int i3 = this.f1530e;
        while (true) {
            if (i2 == i3) {
                this.f1529d = i2;
                if (!m1317m(1)) {
                    if (!z2) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m1321q());
                }
                i2 = this.f1529d;
                i3 = this.f1530e;
            }
            int i4 = i2 + 1;
            char[] cArr = this.f1528c;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f1531f++;
                this.f1532g = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f1529d = i4;
                    if (i4 == i3) {
                        this.f1529d = i2;
                        boolean m1317m = m1317m(2);
                        this.f1529d++;
                        if (!m1317m) {
                            break;
                        }
                    }
                    m1313i();
                    int i5 = this.f1529d;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.f1529d = i5 + 1;
                        while (true) {
                            if (this.f1529d + 2 > this.f1530e && !m1317m(2)) {
                                m1310I("Unterminated comment");
                                throw null;
                            }
                            int i6 = this.f1529d;
                            if (cArr[i6] != '\n') {
                                for (int i7 = 0; i7 < 2; i7++) {
                                    if (cArr[this.f1529d + i7] != "*/".charAt(i7)) {
                                        break;
                                    }
                                }
                                i2 = this.f1529d + 2;
                                i3 = this.f1530e;
                                break;
                            }
                            this.f1531f++;
                            this.f1532g = i6 + 1;
                            this.f1529d++;
                        }
                    } else {
                        if (c3 != '/') {
                            break;
                        }
                        this.f1529d = i5 + 1;
                        m1307F();
                        i2 = this.f1529d;
                        i3 = this.f1530e;
                    }
                } else {
                    if (c2 != '#') {
                        this.f1529d = i4;
                        return c2;
                    }
                    this.f1529d = i4;
                    m1313i();
                    m1307F();
                    i2 = this.f1529d;
                    i3 = this.f1530e;
                }
            }
            i2 = i4;
        }
        return c2;
    }

    /* renamed from: x */
    public final void m1328x() {
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 != 7) {
            throw new IllegalStateException("Expected null but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
        }
        this.f1533h = 0;
        int[] iArr = this.f1540o;
        int i3 = this.f1538m - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r10.f1529d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r10.f1529d = r2;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m1329y(char r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f1529d
            int r3 = r10.f1530e
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r10.f1528c
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L29
            r10.f1529d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r3, r8)
            return r11
        L21:
            r1.append(r5, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f1529d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L3f:
            r1.append(r5, r3, r2)
            char r2 = r10.m1305D()
            r1.append(r2)
            int r2 = r10.f1529d
            int r3 = r10.f1530e
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f1531f
            int r2 = r2 + r6
            r10.f1531f = r2
            r10.f1532g = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.f1529d = r2
            boolean r2 = r10.m1317m(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.m1310I(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p068a1.C0558a.m1329y(char):java.lang.String");
    }

    /* renamed from: z */
    public final String m1330z() {
        String str;
        int i2 = this.f1533h;
        if (i2 == 0) {
            i2 = m1314j();
        }
        if (i2 == 10) {
            str = m1302A();
        } else if (i2 == 8) {
            str = m1329y('\'');
        } else if (i2 == 9) {
            str = m1329y('\"');
        } else if (i2 == 11) {
            str = this.f1536k;
            this.f1536k = null;
        } else if (i2 == 15) {
            str = Long.toString(this.f1534i);
        } else {
            if (i2 != 16) {
                throw new IllegalStateException("Expected a string but was " + AbstractC0044g.m160l(m1303B()) + m1321q());
            }
            str = new String(this.f1528c, this.f1529d, this.f1535j);
            this.f1529d += this.f1535j;
        }
        this.f1533h = 0;
        int[] iArr = this.f1540o;
        int i3 = this.f1538m - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }
}
