package p113s;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p017G0.C0176h;
import p107q.C1179c;
import p116t.AbstractC1229o;
import p116t.C1216b;
import p116t.C1217c;
import p116t.C1219e;
import p121v.C1256f;

/* renamed from: s.e */
/* loaded from: classes.dex */
public final class C1204e extends C1203d {

    /* renamed from: A0 */
    public int f4669A0;

    /* renamed from: B0 */
    public C1201b[] f4670B0;

    /* renamed from: C0 */
    public C1201b[] f4671C0;

    /* renamed from: D0 */
    public int f4672D0;

    /* renamed from: E0 */
    public boolean f4673E0;

    /* renamed from: F0 */
    public boolean f4674F0;

    /* renamed from: G0 */
    public WeakReference f4675G0;

    /* renamed from: H0 */
    public WeakReference f4676H0;

    /* renamed from: I0 */
    public WeakReference f4677I0;

    /* renamed from: J0 */
    public WeakReference f4678J0;

    /* renamed from: K0 */
    public final HashSet f4679K0;

    /* renamed from: L0 */
    public final C1216b f4680L0;

    /* renamed from: q0 */
    public ArrayList f4681q0 = new ArrayList();

    /* renamed from: r0 */
    public final C0176h f4682r0 = new C0176h(this);

    /* renamed from: s0 */
    public final C1219e f4683s0;

    /* renamed from: t0 */
    public int f4684t0;

    /* renamed from: u0 */
    public C1256f f4685u0;

    /* renamed from: v0 */
    public boolean f4686v0;

    /* renamed from: w0 */
    public final C1179c f4687w0;

    /* renamed from: x0 */
    public int f4688x0;

    /* renamed from: y0 */
    public int f4689y0;

    /* renamed from: z0 */
    public int f4690z0;

    public C1204e() {
        C1219e c1219e = new C1219e();
        c1219e.f4780b = true;
        c1219e.f4781c = true;
        c1219e.f4783e = new ArrayList();
        new ArrayList();
        c1219e.f4784f = null;
        c1219e.f4785g = new C1216b();
        c1219e.f4786h = new ArrayList();
        c1219e.f4779a = this;
        c1219e.f4782d = this;
        this.f4683s0 = c1219e;
        this.f4685u0 = null;
        this.f4686v0 = false;
        this.f4687w0 = new C1179c();
        this.f4690z0 = 0;
        this.f4669A0 = 0;
        this.f4670B0 = new C1201b[4];
        this.f4671C0 = new C1201b[4];
        this.f4672D0 = 257;
        this.f4673E0 = false;
        this.f4674F0 = false;
        this.f4675G0 = null;
        this.f4676H0 = null;
        this.f4677I0 = null;
        this.f4678J0 = null;
        this.f4679K0 = new HashSet();
        this.f4680L0 = new C1216b();
    }

    /* renamed from: V */
    public static void m2832V(C1203d c1203d, C1256f c1256f, C1216b c1216b) {
        int i2;
        int i3;
        if (c1256f == null) {
            return;
        }
        if (c1203d.f4640g0 == 8 || (c1203d instanceof C1207h) || (c1203d instanceof C1200a)) {
            c1216b.f4771e = 0;
            c1216b.f4772f = 0;
            return;
        }
        int[] iArr = c1203d.f4658p0;
        c1216b.f4767a = iArr[0];
        c1216b.f4768b = iArr[1];
        c1216b.f4769c = c1203d.m2822q();
        c1216b.f4770d = c1203d.m2818k();
        c1216b.f4775i = false;
        c1216b.f4776j = 0;
        boolean z2 = c1216b.f4767a == 3;
        boolean z3 = c1216b.f4768b == 3;
        boolean z4 = z2 && c1203d.f4623W > 0.0f;
        boolean z5 = z3 && c1203d.f4623W > 0.0f;
        if (z2 && c1203d.m2825t(0) && c1203d.f4660r == 0 && !z4) {
            c1216b.f4767a = 2;
            if (z3 && c1203d.f4661s == 0) {
                c1216b.f4767a = 1;
            }
            z2 = false;
        }
        if (z3 && c1203d.m2825t(1) && c1203d.f4661s == 0 && !z5) {
            c1216b.f4768b = 2;
            if (z2 && c1203d.f4660r == 0) {
                c1216b.f4768b = 1;
            }
            z3 = false;
        }
        if (c1203d.mo2775A()) {
            c1216b.f4767a = 1;
            z2 = false;
        }
        if (c1203d.mo2776B()) {
            c1216b.f4768b = 1;
            z3 = false;
        }
        int[] iArr2 = c1203d.f4662t;
        if (z4) {
            if (iArr2[0] == 4) {
                c1216b.f4767a = 1;
            } else if (!z3) {
                if (c1216b.f4768b == 1) {
                    i3 = c1216b.f4770d;
                } else {
                    c1216b.f4767a = 2;
                    c1256f.m2934b(c1203d, c1216b);
                    i3 = c1216b.f4772f;
                }
                c1216b.f4767a = 1;
                c1216b.f4769c = (int) (c1203d.f4623W * i3);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c1216b.f4768b = 1;
            } else if (!z2) {
                if (c1216b.f4767a == 1) {
                    i2 = c1216b.f4769c;
                } else {
                    c1216b.f4768b = 2;
                    c1256f.m2934b(c1203d, c1216b);
                    i2 = c1216b.f4771e;
                }
                c1216b.f4768b = 1;
                if (c1203d.f4624X == -1) {
                    c1216b.f4770d = (int) (i2 / c1203d.f4623W);
                } else {
                    c1216b.f4770d = (int) (c1203d.f4623W * i2);
                }
            }
        }
        c1256f.m2934b(c1203d, c1216b);
        c1203d.m2807O(c1216b.f4771e);
        c1203d.m2804L(c1216b.f4772f);
        c1203d.f4605E = c1216b.f4774h;
        c1203d.m2801I(c1216b.f4773g);
        c1216b.f4776j = 0;
    }

    @Override // p113s.C1203d
    /* renamed from: C */
    public final void mo2797C() {
        this.f4687w0.m2737t();
        this.f4688x0 = 0;
        this.f4689y0 = 0;
        this.f4681q0.clear();
        super.mo2797C();
    }

    @Override // p113s.C1203d
    /* renamed from: F */
    public final void mo2800F(C0176h c0176h) {
        super.mo2800F(c0176h);
        int size = this.f4681q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C1203d) this.f4681q0.get(i2)).mo2800F(c0176h);
        }
    }

    @Override // p113s.C1203d
    /* renamed from: P */
    public final void mo2808P(boolean z2, boolean z3) {
        super.mo2808P(z2, z3);
        int size = this.f4681q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C1203d) this.f4681q0.get(i2)).mo2808P(z2, z3);
        }
    }

    /* renamed from: R */
    public final void m2833R(C1203d c1203d, int i2) {
        if (i2 == 0) {
            int i3 = this.f4690z0 + 1;
            C1201b[] c1201bArr = this.f4671C0;
            if (i3 >= c1201bArr.length) {
                this.f4671C0 = (C1201b[]) Arrays.copyOf(c1201bArr, c1201bArr.length * 2);
            }
            C1201b[] c1201bArr2 = this.f4671C0;
            int i4 = this.f4690z0;
            c1201bArr2[i4] = new C1201b(c1203d, 0, this.f4686v0);
            this.f4690z0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f4669A0 + 1;
            C1201b[] c1201bArr3 = this.f4670B0;
            if (i5 >= c1201bArr3.length) {
                this.f4670B0 = (C1201b[]) Arrays.copyOf(c1201bArr3, c1201bArr3.length * 2);
            }
            C1201b[] c1201bArr4 = this.f4670B0;
            int i6 = this.f4669A0;
            c1201bArr4[i6] = new C1201b(c1203d, 1, this.f4686v0);
            this.f4669A0 = i6 + 1;
        }
    }

    /* renamed from: S */
    public final void m2834S(C1179c c1179c) {
        C1204e c1204e;
        C1179c c1179c2;
        boolean m2837W = m2837W(64);
        mo2779b(c1179c, m2837W);
        int size = this.f4681q0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1203d c1203d = (C1203d) this.f4681q0.get(i2);
            boolean[] zArr = c1203d.f4619S;
            zArr[0] = false;
            zArr[1] = false;
            if (c1203d instanceof C1200a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                C1203d c1203d2 = (C1203d) this.f4681q0.get(i3);
                if (c1203d2 instanceof C1200a) {
                    C1200a c1200a = (C1200a) c1203d2;
                    for (int i4 = 0; i4 < c1200a.f4752r0; i4++) {
                        C1203d c1203d3 = c1200a.f4751q0[i4];
                        if (c1200a.f4572t0 || c1203d3.mo2780c()) {
                            int i5 = c1200a.f4571s0;
                            if (i5 == 0 || i5 == 1) {
                                c1203d3.f4619S[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                c1203d3.f4619S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f4679K0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            C1203d c1203d4 = (C1203d) this.f4681q0.get(i6);
            c1203d4.getClass();
            boolean z3 = c1203d4 instanceof C1206g;
            if (z3 || (c1203d4 instanceof C1207h)) {
                if (z3) {
                    hashSet.add(c1203d4);
                } else {
                    c1203d4.mo2779b(c1179c, m2837W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1206g c1206g = (C1206g) ((C1203d) it.next());
                for (int i7 = 0; i7 < c1206g.f4752r0; i7++) {
                    if (hashSet.contains(c1206g.f4751q0[i7])) {
                        c1206g.mo2779b(c1179c, m2837W);
                        hashSet.remove(c1206g);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1203d) it2.next()).mo2779b(c1179c, m2837W);
                }
                hashSet.clear();
            }
        }
        if (C1179c.f4483p) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                C1203d c1203d5 = (C1203d) this.f4681q0.get(i8);
                c1203d5.getClass();
                if (!(c1203d5 instanceof C1206g) && !(c1203d5 instanceof C1207h)) {
                    hashSet2.add(c1203d5);
                }
            }
            c1204e = this;
            c1179c2 = c1179c;
            c1204e.m2810a(this, c1179c2, hashSet2, this.f4658p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C1203d c1203d6 = (C1203d) it3.next();
                AbstractC1209j.m2852b(this, c1179c2, c1203d6);
                c1203d6.mo2779b(c1179c2, m2837W);
            }
        } else {
            c1204e = this;
            c1179c2 = c1179c;
            for (int i9 = 0; i9 < size; i9++) {
                C1203d c1203d7 = (C1203d) c1204e.f4681q0.get(i9);
                if (c1203d7 instanceof C1204e) {
                    int[] iArr = c1203d7.f4658p0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        c1203d7.m2805M(1);
                    }
                    if (i11 == 2) {
                        c1203d7.m2806N(1);
                    }
                    c1203d7.mo2779b(c1179c2, m2837W);
                    if (i10 == 2) {
                        c1203d7.m2805M(i10);
                    }
                    if (i11 == 2) {
                        c1203d7.m2806N(i11);
                    }
                } else {
                    AbstractC1209j.m2852b(this, c1179c2, c1203d7);
                    if (!(c1203d7 instanceof C1206g) && !(c1203d7 instanceof C1207h)) {
                        c1203d7.mo2779b(c1179c2, m2837W);
                    }
                }
            }
        }
        if (c1204e.f4690z0 > 0) {
            AbstractC1209j.m2851a(this, c1179c2, null, 0);
        }
        if (c1204e.f4669A0 > 0) {
            AbstractC1209j.m2851a(this, c1179c2, null, 1);
        }
    }

    /* renamed from: T */
    public final boolean m2835T(int i2, boolean z2) {
        boolean z3;
        C1219e c1219e = this.f4683s0;
        C1204e c1204e = c1219e.f4779a;
        boolean z4 = false;
        int m2817j = c1204e.m2817j(0);
        int m2817j2 = c1204e.m2817j(1);
        int m2823r = c1204e.m2823r();
        int m2824s = c1204e.m2824s();
        ArrayList arrayList = c1219e.f4783e;
        if (z2 && (m2817j == 2 || m2817j2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1229o abstractC1229o = (AbstractC1229o) it.next();
                if (abstractC1229o.f4817f == i2 && !abstractC1229o.mo2864k()) {
                    z2 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z2 && m2817j == 2) {
                    c1204e.m2805M(1);
                    c1204e.m2807O(c1219e.m2870d(c1204e, 0));
                    c1204e.f4633d.f4816e.mo2876d(c1204e.m2822q());
                }
            } else if (z2 && m2817j2 == 2) {
                c1204e.m2806N(1);
                c1204e.m2804L(c1219e.m2870d(c1204e, 1));
                c1204e.f4635e.f4816e.mo2876d(c1204e.m2818k());
            }
        }
        int[] iArr = c1204e.f4658p0;
        if (i2 == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int m2822q = c1204e.m2822q() + m2823r;
                c1204e.f4633d.f4820i.mo2876d(m2822q);
                c1204e.f4633d.f4816e.mo2876d(m2822q - m2823r);
                z3 = true;
            }
            z3 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int m2818k = c1204e.m2818k() + m2824s;
                c1204e.f4635e.f4820i.mo2876d(m2818k);
                c1204e.f4635e.f4816e.mo2876d(m2818k - m2824s);
                z3 = true;
            }
            z3 = false;
        }
        c1219e.m2873g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC1229o abstractC1229o2 = (AbstractC1229o) it2.next();
            if (abstractC1229o2.f4817f == i2 && (abstractC1229o2.f4813b != c1204e || abstractC1229o2.f4818g)) {
                abstractC1229o2.mo2861e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC1229o abstractC1229o3 = (AbstractC1229o) it3.next();
            if (abstractC1229o3.f4817f == i2 && (z3 || abstractC1229o3.f4813b != c1204e)) {
                if (!abstractC1229o3.f4819h.f4796j) {
                    break;
                }
                if (!abstractC1229o3.f4820i.f4796j) {
                    break;
                }
                if (!(abstractC1229o3 instanceof C1217c) && !abstractC1229o3.f4816e.f4796j) {
                    break;
                }
            }
        }
        c1204e.m2805M(m2817j);
        c1204e.m2806N(m2817j2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0842 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x084f A[LOOP:14: B:281:0x084d->B:282:0x084f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x064d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0668  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2836U() {
        /*
            Method dump skipped, instructions count: 2364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p113s.C1204e.m2836U():void");
    }

    /* renamed from: W */
    public final boolean m2837W(int i2) {
        return (this.f4672D0 & i2) == i2;
    }

    @Override // p113s.C1203d
    /* renamed from: n */
    public final void mo2821n(StringBuilder sb) {
        sb.append(this.f4645j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f4621U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f4622V);
        sb.append("\n");
        Iterator it = this.f4681q0.iterator();
        while (it.hasNext()) {
            ((C1203d) it.next()).mo2821n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
