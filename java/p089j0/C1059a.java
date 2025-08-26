package p089j0;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.C0605s;
import androidx.fragment.app.C0651y;
import java.util.ArrayList;
import java.util.Iterator;
import p010D1.AbstractC0104l;

/* renamed from: j0.a */
/* loaded from: classes.dex */
public final class C1059a extends AbstractC1071m {

    /* renamed from: A */
    public ArrayList f4147A;

    /* renamed from: B */
    public boolean f4148B;

    /* renamed from: C */
    public int f4149C;

    /* renamed from: D */
    public boolean f4150D;

    /* renamed from: E */
    public int f4151E;

    @Override // p089j0.AbstractC1071m
    /* renamed from: A */
    public final void mo2558A(long j2) {
        ArrayList arrayList;
        this.f4189c = j2;
        if (j2 < 0 || (arrayList = this.f4147A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1071m) this.f4147A.get(i2)).mo2558A(j2);
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: B */
    public final void mo2559B(AbstractC0104l abstractC0104l) {
        this.f4151E |= 8;
        int size = this.f4147A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1071m) this.f4147A.get(i2)).mo2559B(abstractC0104l);
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: C */
    public final void mo2560C(TimeInterpolator timeInterpolator) {
        this.f4151E |= 1;
        ArrayList arrayList = this.f4147A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC1071m) this.f4147A.get(i2)).mo2560C(timeInterpolator);
            }
        }
        this.f4190d = timeInterpolator;
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: D */
    public final void mo2561D(C0651y c0651y) {
        super.mo2561D(c0651y);
        this.f4151E |= 4;
        if (this.f4147A != null) {
            for (int i2 = 0; i2 < this.f4147A.size(); i2++) {
                ((AbstractC1071m) this.f4147A.get(i2)).mo2561D(c0651y);
            }
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: E */
    public final void mo2562E() {
        this.f4151E |= 2;
        int size = this.f4147A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1071m) this.f4147A.get(i2)).mo2562E();
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: F */
    public final void mo2563F(long j2) {
        this.f4188b = j2;
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: H */
    public final String mo2564H(String str) {
        String mo2564H = super.mo2564H(str);
        for (int i2 = 0; i2 < this.f4147A.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo2564H);
            sb.append("\n");
            sb.append(((AbstractC1071m) this.f4147A.get(i2)).mo2564H(str + "  "));
            mo2564H = sb.toString();
        }
        return mo2564H;
    }

    /* renamed from: I */
    public final void m2565I(AbstractC1071m abstractC1071m) {
        this.f4147A.add(abstractC1071m);
        abstractC1071m.f4195i = this;
        long j2 = this.f4189c;
        if (j2 >= 0) {
            abstractC1071m.mo2558A(j2);
        }
        if ((this.f4151E & 1) != 0) {
            abstractC1071m.mo2560C(this.f4190d);
        }
        if ((this.f4151E & 2) != 0) {
            abstractC1071m.mo2562E();
        }
        if ((this.f4151E & 4) != 0) {
            abstractC1071m.mo2561D(this.f4208v);
        }
        if ((this.f4151E & 8) != 0) {
            abstractC1071m.mo2559B(null);
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: c */
    public final void mo2566c() {
        super.mo2566c();
        int size = this.f4147A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1071m) this.f4147A.get(i2)).mo2566c();
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: d */
    public final void mo2567d(C1079u c1079u) {
        if (m2598t(c1079u.f4220b)) {
            Iterator it = this.f4147A.iterator();
            while (it.hasNext()) {
                AbstractC1071m abstractC1071m = (AbstractC1071m) it.next();
                if (abstractC1071m.m2598t(c1079u.f4220b)) {
                    abstractC1071m.mo2567d(c1079u);
                    c1079u.f4221c.add(abstractC1071m);
                }
            }
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: f */
    public final void mo2568f(C1079u c1079u) {
        int size = this.f4147A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1071m) this.f4147A.get(i2)).mo2568f(c1079u);
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: g */
    public final void mo2569g(C1079u c1079u) {
        if (m2598t(c1079u.f4220b)) {
            Iterator it = this.f4147A.iterator();
            while (it.hasNext()) {
                AbstractC1071m abstractC1071m = (AbstractC1071m) it.next();
                if (abstractC1071m.m2598t(c1079u.f4220b)) {
                    abstractC1071m.mo2569g(c1079u);
                    c1079u.f4221c.add(abstractC1071m);
                }
            }
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC1071m clone() {
        C1059a c1059a = (C1059a) super.clone();
        c1059a.f4147A = new ArrayList();
        int size = this.f4147A.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1071m clone = ((AbstractC1071m) this.f4147A.get(i2)).clone();
            c1059a.f4147A.add(clone);
            clone.f4195i = c1059a;
        }
        return c1059a;
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: l */
    public final void mo2571l(ViewGroup viewGroup, C0605s c0605s, C0605s c0605s2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f4188b;
        int size = this.f4147A.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1071m abstractC1071m = (AbstractC1071m) this.f4147A.get(i2);
            if (j2 > 0 && (this.f4148B || i2 == 0)) {
                long j3 = abstractC1071m.f4188b;
                if (j3 > 0) {
                    abstractC1071m.mo2563F(j3 + j2);
                } else {
                    abstractC1071m.mo2563F(j2);
                }
            }
            abstractC1071m.mo2571l(viewGroup, c0605s, c0605s2, arrayList, arrayList2);
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: w */
    public final void mo2572w(ViewGroup viewGroup) {
        super.mo2572w(viewGroup);
        int size = this.f4147A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1071m) this.f4147A.get(i2)).mo2572w(viewGroup);
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: x */
    public final AbstractC1071m mo2573x(InterfaceC1069k interfaceC1069k) {
        super.mo2573x(interfaceC1069k);
        return this;
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: y */
    public final void mo2574y(View view) {
        super.mo2574y(view);
        int size = this.f4147A.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1071m) this.f4147A.get(i2)).mo2574y(view);
        }
    }

    @Override // p089j0.AbstractC1071m
    /* renamed from: z */
    public final void mo2575z() {
        if (this.f4147A.isEmpty()) {
            m2589G();
            m2594m();
            return;
        }
        C1076r c1076r = new C1076r();
        c1076r.f4217b = this;
        Iterator it = this.f4147A.iterator();
        while (it.hasNext()) {
            ((AbstractC1071m) it.next()).m2590a(c1076r);
        }
        this.f4149C = this.f4147A.size();
        if (this.f4148B) {
            Iterator it2 = this.f4147A.iterator();
            while (it2.hasNext()) {
                ((AbstractC1071m) it2.next()).mo2575z();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f4147A.size(); i2++) {
            ((AbstractC1071m) this.f4147A.get(i2 - 1)).m2590a(new C1076r((AbstractC1071m) this.f4147A.get(i2)));
        }
        AbstractC1071m abstractC1071m = (AbstractC1071m) this.f4147A.get(0);
        if (abstractC1071m != null) {
            abstractC1071m.mo2575z();
        }
    }
}
