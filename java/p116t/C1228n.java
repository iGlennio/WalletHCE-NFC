package p116t;

import androidx.fragment.app.C0651y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p005C.AbstractC0044g;
import p107q.C1179c;
import p113s.AbstractC1209j;
import p113s.C1203d;
import p113s.C1204e;

/* renamed from: t.n */
/* loaded from: classes.dex */
public final class C1228n {

    /* renamed from: f */
    public static int f4806f;

    /* renamed from: a */
    public ArrayList f4807a;

    /* renamed from: b */
    public int f4808b;

    /* renamed from: c */
    public int f4809c;

    /* renamed from: d */
    public ArrayList f4810d;

    /* renamed from: e */
    public int f4811e;

    /* renamed from: a */
    public final void m2893a(ArrayList arrayList) {
        int size = this.f4807a.size();
        if (this.f4811e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C1228n c1228n = (C1228n) arrayList.get(i2);
                if (this.f4811e == c1228n.f4808b) {
                    m2895c(this.f4809c, c1228n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: b */
    public final int m2894b(C1179c c1179c, int i2) {
        int m2718n;
        int m2718n2;
        ArrayList arrayList = this.f4807a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1204e c1204e = (C1204e) ((C1203d) arrayList.get(0)).f4620T;
        c1179c.m2737t();
        c1204e.mo2779b(c1179c, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((C1203d) arrayList.get(i3)).mo2779b(c1179c, false);
        }
        if (i2 == 0 && c1204e.f4690z0 > 0) {
            AbstractC1209j.m2851a(c1204e, c1179c, arrayList, 0);
        }
        if (i2 == 1 && c1204e.f4669A0 > 0) {
            AbstractC1209j.m2851a(c1204e, c1179c, arrayList, 1);
        }
        try {
            c1179c.m2733p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f4810d = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C1203d c1203d = (C1203d) arrayList.get(i4);
            C0651y c0651y = new C0651y(11);
            new WeakReference(c1203d);
            C1179c.m2718n(c1203d.f4609I);
            C1179c.m2718n(c1203d.f4610J);
            C1179c.m2718n(c1203d.f4611K);
            C1179c.m2718n(c1203d.f4612L);
            C1179c.m2718n(c1203d.f4613M);
            this.f4810d.add(c0651y);
        }
        if (i2 == 0) {
            m2718n = C1179c.m2718n(c1204e.f4609I);
            m2718n2 = C1179c.m2718n(c1204e.f4611K);
            c1179c.m2737t();
        } else {
            m2718n = C1179c.m2718n(c1204e.f4610J);
            m2718n2 = C1179c.m2718n(c1204e.f4612L);
            c1179c.m2737t();
        }
        return m2718n2 - m2718n;
    }

    /* renamed from: c */
    public final void m2895c(int i2, C1228n c1228n) {
        Iterator it = this.f4807a.iterator();
        while (it.hasNext()) {
            C1203d c1203d = (C1203d) it.next();
            ArrayList arrayList = c1228n.f4807a;
            if (!arrayList.contains(c1203d)) {
                arrayList.add(c1203d);
            }
            int i3 = c1228n.f4808b;
            if (i2 == 0) {
                c1203d.f4654n0 = i3;
            } else {
                c1203d.f4656o0 = i3;
            }
        }
        this.f4811e = c1228n.f4808b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f4809c;
        sb.append(i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f4808b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f4807a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C1203d) it.next()).f4642h0;
        }
        return AbstractC0044g.m154f(sb2, " >");
    }
}
