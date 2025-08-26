package p018H;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: H.f */
/* loaded from: classes.dex */
public final class CallableC0186f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f541a;

    /* renamed from: b */
    public final /* synthetic */ String f542b;

    /* renamed from: c */
    public final /* synthetic */ Context f543c;

    /* renamed from: d */
    public final /* synthetic */ C0185e f544d;

    /* renamed from: e */
    public final /* synthetic */ int f545e;

    public /* synthetic */ CallableC0186f(String str, Context context, C0185e c0185e, int i2, int i3) {
        this.f541a = i3;
        this.f542b = str;
        this.f543c = context;
        this.f544d = c0185e;
        this.f545e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f541a) {
            case 0:
                return AbstractC0189i.m574a(this.f542b, this.f543c, this.f544d, this.f545e);
            default:
                try {
                    return AbstractC0189i.m574a(this.f542b, this.f543c, this.f544d, this.f545e);
                } catch (Throwable unused) {
                    return new C0188h(-3);
                }
        }
    }
}
