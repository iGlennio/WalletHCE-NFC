package p102o0;

import java.util.Arrays;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class C1163a {

    /* renamed from: a */
    public final byte[] f4427a;

    /* renamed from: b */
    public final String f4428b;

    /* renamed from: c */
    public final int f4429c;

    /* renamed from: d */
    public final int f4430d;

    /* renamed from: e */
    public final int f4431e;

    public C1163a(byte[] bArr, int i2, String str) {
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Param id cannot be empty");
        }
        if (i2 == 0) {
            throw new IllegalArgumentException("Param tagValueType cannot be null");
        }
        this.f4427a = bArr;
        this.f4428b = str;
        this.f4429c = i2;
        byte b = bArr[0];
        if ((b & 32) != 0) {
            this.f4431e = 2;
        } else {
            this.f4431e = 1;
        }
        byte b2 = (byte) ((b >>> 6) & 3);
        if (b2 == 1) {
            this.f4430d = 2;
            return;
        }
        if (b2 == 2) {
            this.f4430d = 3;
        } else if (b2 != 3) {
            this.f4430d = 1;
        } else {
            this.f4430d = 4;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1163a)) {
            return false;
        }
        byte[] bArr = this.f4427a;
        int length = bArr.length;
        byte[] bArr2 = ((C1163a) obj).f4427a;
        if (length != bArr2.length) {
            return false;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4427a) + 177;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Tag[");
        byte[] bArr = this.f4427a;
        if (bArr != null && bArr.length > 0) {
            int length = bArr.length * 3;
            char[] cArr = new char[length];
            int i2 = 0;
            int i3 = 0;
            while (i2 < bArr.length) {
                byte b = bArr[i2];
                byte b2 = (byte) ((b & 240) >> 4);
                cArr[i3] = (char) (b2 > 9 ? b2 + 55 : b2 + 48);
                byte b3 = (byte) (b & 15);
                cArr[i3 + 1] = (char) (b3 > 9 ? b3 + 55 : b3 + 48);
                int i4 = i3 + 2;
                cArr[i4] = ' ';
                i2++;
                i3 = i4 + 1;
            }
            str = new String(cArr, 0, length - 1);
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("] Name=");
        sb.append(this.f4428b);
        sb.append(", TagType=");
        int i5 = this.f4431e;
        sb.append(i5 != 1 ? i5 != 2 ? "null" : "CONSTRUCTED" : "PRIMITIVE");
        sb.append(", ValueType=");
        switch (this.f4429c) {
            case 1:
                str2 = "BINARY";
                break;
            case 2:
                str2 = "NUMERIC";
                break;
            case 3:
                str2 = "TEXT";
                break;
            case 4:
                str2 = "MIXED";
                break;
            case 5:
                str2 = "DOL";
                break;
            case 6:
                str2 = "TEMPLATE";
                break;
            default:
                str2 = "null";
                break;
        }
        sb.append(str2);
        sb.append(", Class=");
        int i6 = this.f4430d;
        sb.append(i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "PRIVATE" : "CONTEXT_SPECIFIC" : "APPLICATION" : "UNIVERSAL");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1163a(java.lang.String r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            if (r8 == 0) goto L75
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            r1 = 0
            r2 = r1
            r3 = r2
        La:
            int r4 = r0.length()
            if (r2 >= r4) goto L27
            char r4 = r0.charAt(r2)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 != 0) goto L24
            int r4 = r3 + 1
            char r5 = r0.charAt(r2)
            r0.setCharAt(r3, r5)
            r3 = r4
        L24:
            int r2 = r2 + 1
            goto La
        L27:
            int r2 = r0.length()
            r0.delete(r3, r2)
            int r2 = r0.length()
            int r2 = r2 % 2
            if (r2 != 0) goto L69
            int r8 = r0.length()
            int r8 = r8 / 2
            byte[] r8 = new byte[r8]
            r2 = r1
        L3f:
            int r3 = r0.length()
            if (r1 >= r3) goto L65
            int r3 = r2 + 1
            char r4 = r0.charAt(r1)
            r5 = 16
            int r4 = java.lang.Character.digit(r4, r5)
            int r4 = r4 << 4
            int r6 = r1 + 1
            char r6 = r0.charAt(r6)
            int r5 = java.lang.Character.digit(r6, r5)
            int r5 = r5 + r4
            byte r4 = (byte) r5
            r8[r2] = r4
            int r1 = r1 + 2
            r2 = r3
            goto L3f
        L65:
            r7.<init>(r8, r9, r10)
            return
        L69:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Hex binary needs to be even-length :"
            java.lang.String r8 = r10.concat(r8)
            r9.<init>(r8)
            throw r9
        L75:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Argument can't be null"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p102o0.C1163a.<init>(java.lang.String, int, java.lang.String):void");
    }
}
