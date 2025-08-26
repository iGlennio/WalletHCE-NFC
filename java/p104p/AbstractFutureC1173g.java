package p104p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005C.AbstractC0044g;
import p010D1.AbstractC0104l;

/* renamed from: p.g */
/* loaded from: classes.dex */
public abstract class AbstractFutureC1173g implements Future {

    /* renamed from: d */
    public static final boolean f4460d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f4461e = Logger.getLogger(AbstractFutureC1173g.class.getName());

    /* renamed from: f */
    public static final AbstractC0104l f4462f;

    /* renamed from: g */
    public static final Object f4463g;

    /* renamed from: a */
    public volatile Object f4464a;

    /* renamed from: b */
    public volatile C1169c f4465b;

    /* renamed from: c */
    public volatile C1172f f4466c;

    static {
        AbstractC0104l c1171e;
        try {
            c1171e = new C1170d(AtomicReferenceFieldUpdater.newUpdater(C1172f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1172f.class, C1172f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1173g.class, C1172f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1173g.class, C1169c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1173g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1171e = new C1171e();
        }
        f4462f = c1171e;
        if (th != null) {
            f4461e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4463g = new Object();
    }

    /* renamed from: b */
    public static void m2693b(AbstractFutureC1173g abstractFutureC1173g) {
        C1172f c1172f;
        C1169c c1169c;
        do {
            c1172f = abstractFutureC1173g.f4466c;
        } while (!f4462f.mo432e(abstractFutureC1173g, c1172f, C1172f.f4457c));
        while (c1172f != null) {
            Thread thread = c1172f.f4458a;
            if (thread != null) {
                c1172f.f4458a = null;
                LockSupport.unpark(thread);
            }
            c1172f = c1172f.f4459b;
        }
        do {
            c1169c = abstractFutureC1173g.f4465b;
        } while (!f4462f.mo430c(abstractFutureC1173g, c1169c));
        C1169c c1169c2 = null;
        while (c1169c != null) {
            C1169c c1169c3 = c1169c.f4451a;
            c1169c.f4451a = c1169c2;
            c1169c2 = c1169c;
            c1169c = c1169c3;
        }
        while (c1169c2 != null) {
            c1169c2 = c1169c2.f4451a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f4461e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    /* renamed from: c */
    public static Object m2694c(Object obj) {
        if (obj instanceof C1167a) {
            CancellationException cancellationException = ((C1167a) obj).f4449a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC1168b) {
            ((AbstractC1168b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f4463g) {
            return null;
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m2695d(AbstractFutureC1173g abstractFutureC1173g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC1173g.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: a */
    public final void m2696a(StringBuilder sb) {
        try {
            Object m2695d = m2695d(this);
            sb.append("SUCCESS, result=[");
            sb.append(m2695d == this ? "this future" : String.valueOf(m2695d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f4464a;
        if (obj != null) {
            return false;
        }
        if (!f4462f.mo431d(this, obj, f4460d ? new C1167a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C1167a.f4447b : C1167a.f4448c)) {
            return false;
        }
        m2693b(this);
        return true;
    }

    /* renamed from: e */
    public final void m2697e(C1172f c1172f) {
        c1172f.f4458a = null;
        while (true) {
            C1172f c1172f2 = this.f4466c;
            if (c1172f2 == C1172f.f4457c) {
                return;
            }
            C1172f c1172f3 = null;
            while (c1172f2 != null) {
                C1172f c1172f4 = c1172f2.f4459b;
                if (c1172f2.f4458a != null) {
                    c1172f3 = c1172f2;
                } else if (c1172f3 != null) {
                    c1172f3.f4459b = c1172f4;
                    if (c1172f3.f4458a == null) {
                        break;
                    }
                } else if (!f4462f.mo432e(this, c1172f2, c1172f4)) {
                    break;
                }
                c1172f2 = c1172f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4464a;
        if (obj != null) {
            return m2694c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1172f c1172f = this.f4466c;
            C1172f c1172f2 = C1172f.f4457c;
            if (c1172f != c1172f2) {
                C1172f c1172f3 = new C1172f();
                do {
                    AbstractC0104l abstractC0104l = f4462f;
                    abstractC0104l.mo427Q(c1172f3, c1172f);
                    if (abstractC0104l.mo432e(this, c1172f, c1172f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m2697e(c1172f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4464a;
                            if (obj2 != null) {
                                return m2694c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2697e(c1172f3);
                    } else {
                        c1172f = this.f4466c;
                    }
                } while (c1172f != c1172f2);
            }
            return m2694c(this.f4464a);
        }
        while (nanos > 0) {
            Object obj3 = this.f4464a;
            if (obj3 != null) {
                return m2694c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC1173g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String m154f = AbstractC0044g.m154f(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = m154f + convert + " " + lowerCase;
                if (z2) {
                    str2 = AbstractC0044g.m154f(str2, ",");
                }
                m154f = AbstractC0044g.m154f(str2, " ");
            }
            if (z2) {
                m154f = m154f + nanos2 + " nanoseconds ";
            }
            str = AbstractC0044g.m154f(m154f, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0044g.m154f(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + abstractFutureC1173g);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4464a instanceof C1167a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4464a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4464a instanceof C1167a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2696a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m2696a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4464a;
            if (obj2 != null) {
                return m2694c(obj2);
            }
            C1172f c1172f = this.f4466c;
            C1172f c1172f2 = C1172f.f4457c;
            if (c1172f != c1172f2) {
                C1172f c1172f3 = new C1172f();
                do {
                    AbstractC0104l abstractC0104l = f4462f;
                    abstractC0104l.mo427Q(c1172f3, c1172f);
                    if (abstractC0104l.mo432e(this, c1172f, c1172f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4464a;
                            } else {
                                m2697e(c1172f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m2694c(obj);
                    }
                    c1172f = this.f4466c;
                } while (c1172f != c1172f2);
            }
            return m2694c(this.f4464a);
        }
        throw new InterruptedException();
    }
}
