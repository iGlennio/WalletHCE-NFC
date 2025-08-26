package p068a1;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: a1.b */
/* loaded from: classes.dex */
public class C0559b implements Closeable, Flushable {

    /* renamed from: i */
    public static final Pattern f1541i = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: j */
    public static final String[] f1542j = new String[128];

    /* renamed from: k */
    public static final String[] f1543k;

    /* renamed from: a */
    public final Writer f1544a;

    /* renamed from: b */
    public int[] f1545b;

    /* renamed from: c */
    public int f1546c;

    /* renamed from: d */
    public final String f1547d;

    /* renamed from: e */
    public boolean f1548e;

    /* renamed from: f */
    public boolean f1549f;

    /* renamed from: g */
    public String f1550g;

    /* renamed from: h */
    public boolean f1551h;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f1542j[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f1542j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f1543k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C0559b(Writer writer) {
        int[] iArr = new int[32];
        this.f1545b = iArr;
        this.f1546c = 0;
        if (iArr.length == 0) {
            this.f1545b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f1545b;
        int i2 = this.f1546c;
        this.f1546c = i2 + 1;
        iArr2[i2] = 6;
        this.f1547d = ":";
        this.f1551h = true;
        Objects.requireNonNull(writer, "out == null");
        this.f1544a = writer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1544a.close();
        int i2 = this.f1546c;
        if (i2 > 1 || (i2 == 1 && this.f1545b[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1546c = 0;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f1546c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1544a.flush();
    }

    /* renamed from: g */
    public final void m1331g() {
        int m1340p = m1340p();
        if (m1340p == 1) {
            this.f1545b[this.f1546c - 1] = 2;
            m1338n();
            return;
        }
        Writer writer = this.f1544a;
        if (m1340p == 2) {
            writer.append(',');
            m1338n();
        } else {
            if (m1340p == 4) {
                writer.append((CharSequence) this.f1547d);
                this.f1545b[this.f1546c - 1] = 5;
                return;
            }
            if (m1340p != 6) {
                if (m1340p != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f1548e) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f1545b[this.f1546c - 1] = 7;
        }
    }

    /* renamed from: h */
    public void m1332h() {
        m1347w();
        m1331g();
        int i2 = this.f1546c;
        int[] iArr = this.f1545b;
        if (i2 == iArr.length) {
            this.f1545b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f1545b;
        int i3 = this.f1546c;
        this.f1546c = i3 + 1;
        iArr2[i3] = 1;
        this.f1544a.write(91);
    }

    /* renamed from: i */
    public void m1333i() {
        m1347w();
        m1331g();
        int i2 = this.f1546c;
        int[] iArr = this.f1545b;
        if (i2 == iArr.length) {
            this.f1545b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f1545b;
        int i3 = this.f1546c;
        this.f1546c = i3 + 1;
        iArr2[i3] = 3;
        this.f1544a.write(123);
    }

    /* renamed from: j */
    public final void m1334j(int i2, int i3, char c2) {
        int m1340p = m1340p();
        if (m1340p != i3 && m1340p != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f1550g != null) {
            throw new IllegalStateException("Dangling name: " + this.f1550g);
        }
        this.f1546c--;
        if (m1340p == i3) {
            m1338n();
        }
        this.f1544a.write(c2);
    }

    /* renamed from: k */
    public void m1335k() {
        m1334j(1, 2, ']');
    }

    /* renamed from: l */
    public void m1336l() {
        m1334j(3, 5, '}');
    }

    /* renamed from: m */
    public void m1337m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f1550g != null) {
            throw new IllegalStateException();
        }
        if (this.f1546c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1550g = str;
    }

    /* renamed from: o */
    public C0559b m1339o() {
        if (this.f1550g != null) {
            if (!this.f1551h) {
                this.f1550g = null;
                return this;
            }
            m1347w();
        }
        m1331g();
        this.f1544a.write("null");
        return this;
    }

    /* renamed from: p */
    public final int m1340p() {
        int i2 = this.f1546c;
        if (i2 != 0) {
            return this.f1545b[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1341q(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f1549f
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p068a1.C0559b.f1543k
            goto L9
        L7:
            java.lang.String[] r0 = p068a1.C0559b.f1542j
        L9:
            java.io.Writer r1 = r8.f1544a
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p068a1.C0559b.m1341q(java.lang.String):void");
    }

    /* renamed from: r */
    public void m1342r(double d2) {
        m1347w();
        if (this.f1548e || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            m1331g();
            this.f1544a.append((CharSequence) Double.toString(d2));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
    }

    /* renamed from: s */
    public void m1343s(long j2) {
        m1347w();
        m1331g();
        this.f1544a.write(Long.toString(j2));
    }

    /* renamed from: t */
    public void m1344t(Number number) {
        if (number == null) {
            m1339o();
            return;
        }
        m1347w();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f1541i.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f1548e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        m1331g();
        this.f1544a.append((CharSequence) obj);
    }

    /* renamed from: u */
    public void m1345u(String str) {
        if (str == null) {
            m1339o();
            return;
        }
        m1347w();
        m1331g();
        m1341q(str);
    }

    /* renamed from: v */
    public void m1346v(boolean z2) {
        m1347w();
        m1331g();
        this.f1544a.write(z2 ? "true" : "false");
    }

    /* renamed from: w */
    public final void m1347w() {
        if (this.f1550g != null) {
            int m1340p = m1340p();
            if (m1340p == 5) {
                this.f1544a.write(44);
            } else if (m1340p != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m1338n();
            this.f1545b[this.f1546c - 1] = 4;
            m1341q(this.f1550g);
            this.f1550g = null;
        }
    }

    /* renamed from: n */
    public final void m1338n() {
    }
}
