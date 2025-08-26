package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p014F0.RunnableC0130G;
import p018H.AbstractC0184d;
import p018H.C0185e;
import p018H.C0190j;
import p018H.C0191k;
import p034M0.C0360e;
import p047Q1.AbstractC0458e;

/* renamed from: androidx.emoji2.text.p */
/* loaded from: classes.dex */
public final class C0602p implements InterfaceC0595i {

    /* renamed from: a */
    public final Context f2000a;

    /* renamed from: b */
    public final C0185e f2001b;

    /* renamed from: c */
    public final C0360e f2002c;

    /* renamed from: d */
    public final Object f2003d;

    /* renamed from: e */
    public Handler f2004e;

    /* renamed from: f */
    public ThreadPoolExecutor f2005f;

    /* renamed from: g */
    public ThreadPoolExecutor f2006g;

    /* renamed from: h */
    public AbstractC0458e f2007h;

    public C0602p(Context context, C0185e c0185e) {
        C0360e c0360e = C0603q.f2008d;
        this.f2003d = new Object();
        AbstractC0458e.m1192j(context, "Context cannot be null");
        this.f2000a = context.getApplicationContext();
        this.f2001b = c0185e;
        this.f2002c = c0360e;
    }

    /* renamed from: a */
    public final void m1536a() {
        synchronized (this.f2003d) {
            try {
                this.f2007h = null;
                Handler handler = this.f2004e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f2004e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2006g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2005f = null;
                this.f2006g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final C0191k m1537b() {
        try {
            C0360e c0360e = this.f2002c;
            Context context = this.f2000a;
            C0185e c0185e = this.f2001b;
            c0360e.getClass();
            C0190j m557a = AbstractC0184d.m557a(context, c0185e);
            int i2 = m557a.f554a;
            if (i2 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i2 + ")");
            }
            C0191k[] c0191kArr = (C0191k[]) m557a.f555b;
            if (c0191kArr == null || c0191kArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c0191kArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0595i
    /* renamed from: s */
    public final void mo183s(AbstractC0458e abstractC0458e) {
        synchronized (this.f2003d) {
            this.f2007h = abstractC0458e;
        }
        synchronized (this.f2003d) {
            try {
                if (this.f2007h == null) {
                    return;
                }
                if (this.f2005f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0587a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f2006g = threadPoolExecutor;
                    this.f2005f = threadPoolExecutor;
                }
                this.f2005f.execute(new RunnableC0130G(9, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
