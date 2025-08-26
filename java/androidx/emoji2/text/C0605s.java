package androidx.emoji2.text;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import p001A1.InterfaceC0006e;
import p007C1.C0060E;
import p007C1.C0061a;
import p011E.InterfaceMenuItemC0107a;
import p024J.C0226a;
import p026J1.C0248p;
import p026J1.C0249q;
import p047Q1.AbstractC0458e;
import p058W.C0530a;
import p058W.C0531b;
import p083h.AbstractC0873a;
import p083h.C0878f;
import p086i.MenuC0892B;
import p086i.MenuC0907l;
import p086i.MenuItemC0914s;
import p095l1.AbstractC1136c;
import p101o.C1152b;
import p101o.C1155e;
import p101o.C1161k;
import p123v1.C1289s;
import p135z1.C1337e;
import p135z1.C1340h;
import p135z1.C1343k;
import p135z1.C1344l;
import p135z1.RunnableC1338f;

/* renamed from: androidx.emoji2.text.s */
/* loaded from: classes.dex */
public final class C0605s {

    /* renamed from: a */
    public Object f2011a;

    /* renamed from: b */
    public final Object f2012b;

    /* renamed from: c */
    public final Object f2013c;

    /* renamed from: d */
    public final Object f2014d;

    public C0605s(int i2) {
        switch (i2) {
            case 3:
                this.f2012b = new ArrayDeque();
                this.f2013c = new ArrayDeque();
                this.f2014d = new ArrayDeque();
                break;
            case 4:
                this.f2011a = new C0226a(10);
                this.f2012b = new C1161k();
                this.f2013c = new ArrayList();
                this.f2014d = new HashSet();
                break;
            default:
                this.f2011a = new C1152b();
                this.f2012b = new SparseArray();
                this.f2013c = new C1155e();
                this.f2014d = new C1152b();
                break;
        }
    }

    /* renamed from: a */
    public IOException m1539a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            m1548j(iOException);
        }
        C1340h c1340h = (C1340h) this.f2012b;
        if (z3) {
            if (iOException != null) {
                AbstractC1136c.m2637e(c1340h, "call");
            } else {
                AbstractC1136c.m2637e(c1340h, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                AbstractC1136c.m2637e(c1340h, "call");
            } else {
                AbstractC1136c.m2637e(c1340h, "call");
            }
        }
        return c1340h.m3091h(this, z3, z2, iOException);
    }

    /* renamed from: b */
    public void m1540b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C1161k) this.f2012b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                m1540b(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* renamed from: c */
    public void m1541c(RunnableC1338f runnableC1338f) {
        runnableC1338f.f5528a.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f2013c;
        synchronized (this) {
            if (!arrayDeque.remove(runnableC1338f)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m1546h();
    }

    /* renamed from: d */
    public C0878f m1542d(AbstractC0873a abstractC0873a) {
        ArrayList arrayList = (ArrayList) this.f2013c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0878f c0878f = (C0878f) arrayList.get(i2);
            if (c0878f != null && c0878f.f3519b == abstractC0873a) {
                return c0878f;
            }
        }
        C0878f c0878f2 = new C0878f((Context) this.f2012b, abstractC0873a);
        arrayList.add(c0878f2);
        return c0878f2;
    }

    /* renamed from: e */
    public C1343k m1543e() {
        C1340h c1340h = (C1340h) this.f2012b;
        if (c1340h.f5538g) {
            throw new IllegalStateException("Check failed.");
        }
        c1340h.f5538g = true;
        c1340h.f5533b.m654j();
        C1344l mo17h = ((InterfaceC0006e) this.f2014d).mo17h();
        mo17h.getClass();
        Socket socket = mo17h.f5557c;
        AbstractC1136c.m2634b(socket);
        C0249q c0249q = mo17h.f5561g;
        AbstractC1136c.m2634b(c0249q);
        C0248p c0248p = mo17h.f5562h;
        AbstractC1136c.m2634b(c0248p);
        socket.setSoTimeout(0);
        mo17h.m3102k();
        return new C1343k(this, c0249q, c0248p);
    }

    /* renamed from: f */
    public boolean m1544f(AbstractC0873a abstractC0873a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2011a).onActionItemClicked(m1542d(abstractC0873a), new MenuItemC0914s((Context) this.f2012b, (InterfaceMenuItemC0107a) menuItem));
    }

    /* renamed from: g */
    public boolean m1545g(AbstractC0873a abstractC0873a, MenuC0907l menuC0907l) {
        C0878f m1542d = m1542d(abstractC0873a);
        C1161k c1161k = (C1161k) this.f2014d;
        Menu menu = (Menu) c1161k.getOrDefault(menuC0907l, null);
        if (menu == null) {
            menu = new MenuC0892B((Context) this.f2012b, menuC0907l);
            c1161k.put(menuC0907l, menu);
        }
        return ((ActionMode.Callback) this.f2011a).onCreateActionMode(m1542d, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1546h() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0605s.m1546h():void");
    }

    /* renamed from: i */
    public C1289s m1547i(boolean z2) {
        try {
            C1289s mo14e = ((InterfaceC0006e) this.f2014d).mo14e(z2);
            if (mo14e != null) {
                mo14e.f5280m = this;
            }
            return mo14e;
        } catch (IOException e2) {
            AbstractC1136c.m2637e((C1340h) this.f2012b, "call");
            m1548j(e2);
            throw e2;
        }
    }

    /* renamed from: j */
    public void m1548j(IOException iOException) {
        ((C1337e) this.f2013c).m3083c(iOException);
        C1344l mo17h = ((InterfaceC0006e) this.f2014d).mo17h();
        C1340h c1340h = (C1340h) this.f2012b;
        synchronized (mo17h) {
            try {
                AbstractC1136c.m2637e(c1340h, "call");
                if (!(iOException instanceof C0060E)) {
                    if (!(mo17h.f5560f != null) || (iOException instanceof C0061a)) {
                        mo17h.f5563i = true;
                        if (mo17h.f5566l == 0) {
                            C1344l.m3094d(c1340h.f5546o, mo17h.f5571q, iOException);
                            mo17h.f5565k++;
                        }
                    }
                } else if (((C0060E) iOException).f144a == 8) {
                    int i2 = mo17h.f5567m + 1;
                    mo17h.f5567m = i2;
                    if (i2 > 1) {
                        mo17h.f5563i = true;
                        mo17h.f5565k++;
                    }
                } else if (((C0060E) iOException).f144a != 9 || !c1340h.f5543l) {
                    mo17h.f5563i = true;
                    mo17h.f5565k++;
                }
            } finally {
            }
        }
    }

    public C0605s(C1340h c1340h, C1337e c1337e, InterfaceC0006e interfaceC0006e) {
        AbstractC1136c.m2637e(c1340h, "call");
        AbstractC1136c.m2637e(c1337e, "finder");
        this.f2012b = c1340h;
        this.f2013c = c1337e;
        this.f2014d = interfaceC0006e;
        this.f2011a = interfaceC0006e.mo17h();
    }

    public C0605s(Typeface typeface, C0531b c0531b) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f2014d = typeface;
        this.f2011a = c0531b;
        this.f2013c = new C0604r(1024);
        int m732a = c0531b.m732a(6);
        if (m732a != 0) {
            int i6 = m732a + c0531b.f756a;
            i2 = ((ByteBuffer) c0531b.f759d).getInt(((ByteBuffer) c0531b.f759d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.f2012b = new char[i2 * 2];
        int m732a2 = c0531b.m732a(6);
        if (m732a2 != 0) {
            int i7 = m732a2 + c0531b.f756a;
            i3 = ((ByteBuffer) c0531b.f759d).getInt(((ByteBuffer) c0531b.f759d).getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            C0600n c0600n = new C0600n(this, i8);
            C0530a m1532b = c0600n.m1532b();
            int m732a3 = m1532b.m732a(4);
            Character.toChars(m732a3 != 0 ? ((ByteBuffer) m1532b.f759d).getInt(m732a3 + m1532b.f756a) : 0, (char[]) this.f2012b, i8 * 2);
            C0530a m1532b2 = c0600n.m1532b();
            int m732a4 = m1532b2.m732a(16);
            if (m732a4 != 0) {
                int i9 = m732a4 + m1532b2.f756a;
                i4 = ((ByteBuffer) m1532b2.f759d).getInt(((ByteBuffer) m1532b2.f759d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            AbstractC0458e.m1190h("invalid metadata codepoint length", i4 > 0);
            C0530a m1532b3 = c0600n.m1532b();
            int m732a5 = m1532b3.m732a(16);
            if (m732a5 != 0) {
                int i10 = m732a5 + m1532b3.f756a;
                i5 = ((ByteBuffer) m1532b3.f759d).getInt(((ByteBuffer) m1532b3.f759d).getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            ((C0604r) this.f2013c).m1538a(c0600n, 0, i5 - 1);
        }
    }

    public C0605s(Context context, ActionMode.Callback callback) {
        this.f2012b = context;
        this.f2011a = callback;
        this.f2013c = new ArrayList();
        this.f2014d = new C1161k();
    }
}
