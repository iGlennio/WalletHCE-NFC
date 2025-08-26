package p047Q1;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import p017G0.C0176h;
import p041O1.InterfaceC0397a;
import p044P1.C0433a;

/* renamed from: Q1.b */
/* loaded from: classes.dex */
public final class C0455b implements InterfaceC0397a {

    /* renamed from: a */
    public final String f1242a;

    /* renamed from: b */
    public volatile InterfaceC0397a f1243b;

    /* renamed from: c */
    public Boolean f1244c;

    /* renamed from: d */
    public Method f1245d;

    /* renamed from: e */
    public C0176h f1246e;

    /* renamed from: f */
    public final LinkedBlockingQueue f1247f;

    /* renamed from: g */
    public final boolean f1248g;

    public C0455b(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z2) {
        this.f1242a = str;
        this.f1247f = linkedBlockingQueue;
        this.f1248g = z2;
    }

    @Override // p041O1.InterfaceC0397a
    /* renamed from: a */
    public final void mo527a(String str, EOFException eOFException) {
        m1163d().mo527a(str, eOFException);
    }

    @Override // p041O1.InterfaceC0397a
    /* renamed from: b */
    public final void mo528b(String str, Exception exc) {
        m1163d().mo528b(str, exc);
    }

    @Override // p041O1.InterfaceC0397a
    /* renamed from: c */
    public final String mo529c() {
        return this.f1242a;
    }

    /* renamed from: d */
    public final InterfaceC0397a m1163d() {
        if (this.f1243b != null) {
            return this.f1243b;
        }
        if (this.f1248g) {
            return C0454a.f1241a;
        }
        if (this.f1246e == null) {
            C0176h c0176h = new C0176h(1);
            c0176h.f516c = this;
            c0176h.f515b = this.f1242a;
            c0176h.f517d = this.f1247f;
            this.f1246e = c0176h;
        }
        return this.f1246e;
    }

    /* renamed from: e */
    public final boolean m1164e() {
        Boolean bool = this.f1244c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f1245d = this.f1243b.getClass().getMethod("log", C0433a.class);
            this.f1244c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f1244c = Boolean.FALSE;
        }
        return this.f1244c.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0455b.class == obj.getClass() && this.f1242a.equals(((C0455b) obj).f1242a);
    }

    public final int hashCode() {
        return this.f1242a.hashCode();
    }
}
