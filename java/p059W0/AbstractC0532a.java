package p059W0;

import java.util.TimeZone;

/* renamed from: W0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0532a {

    /* renamed from: a */
    public static final TimeZone f1476a = TimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static boolean m1290a(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x0055, B:20:0x0065, B:21:0x0067, B:23:0x0073, B:24:0x0076, B:26:0x007c, B:30:0x0086, B:35:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00a8, B:44:0x00b5, B:48:0x00c0, B:53:0x00f4, B:55:0x00fa, B:59:0x01ac, B:64:0x010c, B:65:0x0127, B:66:0x0128, B:69:0x0145, B:71:0x0152, B:74:0x015b, B:76:0x017a, B:79:0x0189, B:80:0x01ab, B:81:0x0134, B:82:0x01dd, B:83:0x01e4, B:84:0x00d0, B:85:0x00d3, B:88:0x00bc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01dd A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:18:0x0055, B:20:0x0065, B:21:0x0067, B:23:0x0073, B:24:0x0076, B:26:0x007c, B:30:0x0086, B:35:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00a8, B:44:0x00b5, B:48:0x00c0, B:53:0x00f4, B:55:0x00fa, B:59:0x01ac, B:64:0x010c, B:65:0x0127, B:66:0x0128, B:69:0x0145, B:71:0x0152, B:74:0x015b, B:76:0x017a, B:79:0x0189, B:80:0x01ab, B:81:0x0134, B:82:0x01dd, B:83:0x01e4, B:84:0x00d0, B:85:0x00d3, B:88:0x00bc), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0202  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date m1291b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p059W0.AbstractC0532a.m1291b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: c */
    public static int m1292c(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = -digit;
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int digit2 = Character.digit(str.charAt(i5), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = (i4 * 10) - digit2;
            i5 = i6;
        }
        return -i4;
    }
}
