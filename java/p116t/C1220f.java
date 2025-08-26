package p116t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f */
/* loaded from: classes.dex */
public class C1220f implements InterfaceC1218d {

    /* renamed from: d */
    public final AbstractC1229o f4790d;

    /* renamed from: f */
    public int f4792f;

    /* renamed from: g */
    public int f4793g;

    /* renamed from: a */
    public AbstractC1229o f4787a = null;

    /* renamed from: b */
    public boolean f4788b = false;

    /* renamed from: c */
    public boolean f4789c = false;

    /* renamed from: e */
    public int f4791e = 1;

    /* renamed from: h */
    public int f4794h = 1;

    /* renamed from: i */
    public C1221g f4795i = null;

    /* renamed from: j */
    public boolean f4796j = false;

    /* renamed from: k */
    public final ArrayList f4797k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f4798l = new ArrayList();

    public C1220f(AbstractC1229o abstractC1229o) {
        this.f4790d = abstractC1229o;
    }

    @Override // p116t.InterfaceC1218d
    /* renamed from: a */
    public final void mo2859a(InterfaceC1218d interfaceC1218d) {
        ArrayList arrayList = this.f4798l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1220f) it.next()).f4796j) {
                return;
            }
        }
        this.f4789c = true;
        AbstractC1229o abstractC1229o = this.f4787a;
        if (abstractC1229o != null) {
            abstractC1229o.mo2859a(this);
        }
        if (this.f4788b) {
            this.f4790d.mo2859a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C1220f c1220f = null;
        int i2 = 0;
        while (it2.hasNext()) {
            C1220f c1220f2 = (C1220f) it2.next();
            if (!(c1220f2 instanceof C1221g)) {
                i2++;
                c1220f = c1220f2;
            }
        }
        if (c1220f != null && i2 == 1 && c1220f.f4796j) {
            C1221g c1221g = this.f4795i;
            if (c1221g != null) {
                if (!c1221g.f4796j) {
                    return;
                } else {
                    this.f4792f = this.f4794h * c1221g.f4793g;
                }
            }
            mo2876d(c1220f.f4793g + this.f4792f);
        }
        AbstractC1229o abstractC1229o2 = this.f4787a;
        if (abstractC1229o2 != null) {
            abstractC1229o2.mo2859a(this);
        }
    }

    /* renamed from: b */
    public final void m2874b(AbstractC1229o abstractC1229o) {
        this.f4797k.add(abstractC1229o);
        if (this.f4796j) {
            abstractC1229o.mo2859a(abstractC1229o);
        }
    }

    /* renamed from: c */
    public final void m2875c() {
        this.f4798l.clear();
        this.f4797k.clear();
        this.f4796j = false;
        this.f4793g = 0;
        this.f4789c = false;
        this.f4788b = false;
    }

    /* renamed from: d */
    public void mo2876d(int i2) {
        if (this.f4796j) {
            return;
        }
        this.f4796j = true;
        this.f4793g = i2;
        Iterator it = this.f4797k.iterator();
        while (it.hasNext()) {
            InterfaceC1218d interfaceC1218d = (InterfaceC1218d) it.next();
            interfaceC1218d.mo2859a(interfaceC1218d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4790d.f4813b.f4642h0);
        sb.append(":");
        switch (this.f4791e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f4796j ? Integer.valueOf(this.f4793g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4798l.size());
        sb.append(":d=");
        sb.append(this.f4797k.size());
        sb.append(">");
        return sb.toString();
    }
}
