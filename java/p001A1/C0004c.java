package p001A1;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import p126w1.AbstractC1302b;

/* renamed from: A1.c */
/* loaded from: classes.dex */
public final class C0004c extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ int f3a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f3a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC1302b.f5341e);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
