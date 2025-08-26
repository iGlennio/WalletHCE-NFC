package p123v1;

import java.util.ArrayList;
import java.util.Iterator;
import p075d1.AbstractC0759k;
import p095l1.AbstractC1136c;

/* renamed from: v1.l */
/* loaded from: classes.dex */
public final class C1282l {

    /* renamed from: a */
    public String f5182a;

    /* renamed from: d */
    public String f5185d;

    /* renamed from: f */
    public final ArrayList f5187f;

    /* renamed from: g */
    public ArrayList f5188g;

    /* renamed from: h */
    public String f5189h;

    /* renamed from: b */
    public String f5183b = "";

    /* renamed from: c */
    public String f5184c = "";

    /* renamed from: e */
    public int f5186e = -1;

    public C1282l() {
        ArrayList arrayList = new ArrayList();
        this.f5187f = arrayList;
        arrayList.add("");
    }

    /* renamed from: a */
    public final C1283m m2968a() {
        ArrayList arrayList;
        String str = this.f5182a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String m2957f = C1272b.m2957f(this.f5183b, 0, 0, 7);
        String m2957f2 = C1272b.m2957f(this.f5184c, 0, 0, 7);
        String str2 = this.f5185d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int m2969b = m2969b();
        ArrayList arrayList2 = this.f5187f;
        ArrayList arrayList3 = new ArrayList(AbstractC0759k.m2057X(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C1272b.m2957f((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f5188g;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC0759k.m2057X(arrayList4));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? C1272b.m2957f(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = this.f5189h;
        return new C1283m(str, m2957f, m2957f2, str2, m2969b, arrayList3, arrayList, str4 != null ? C1272b.m2957f(str4, 0, 0, 7) : null, toString());
    }

    /* renamed from: b */
    public final int m2969b() {
        int i2 = this.f5186e;
        if (i2 != -1) {
            return i2;
        }
        String str = this.f5182a;
        AbstractC1136c.m2634b(str);
        int hashCode = str.hashCode();
        return hashCode != 3213448 ? (hashCode == 99617003 && str.equals("https")) ? 443 : -1 : str.equals("http") ? 80 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x01f9, code lost:
    
        if (65535 < r8) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r12 == ':') goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2970c(p123v1.C1283m r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p123v1.C1282l.m2970c(v1.m, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0098, code lost:
    
        if (r1 != r3) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p123v1.C1282l.toString():java.lang.String");
    }
}
