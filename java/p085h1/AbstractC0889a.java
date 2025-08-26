package p085h1;

/* renamed from: h1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0889a {

    /* renamed from: a */
    public static final Integer f3575a;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f3575a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f3575a = num2;
    }
}
