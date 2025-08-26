package p095l1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p010D1.AbstractC0104l;
import p072c1.C0697a;
import p075d1.AbstractC0759k;
import p075d1.AbstractC0768t;
import p075d1.C0749a;
import p092k1.InterfaceC1103a;
import p092k1.InterfaceC1104b;
import p092k1.InterfaceC1105c;
import p092k1.InterfaceC1106d;
import p092k1.InterfaceC1107e;
import p092k1.InterfaceC1108f;
import p092k1.InterfaceC1109g;
import p092k1.InterfaceC1110h;
import p092k1.InterfaceC1111i;
import p092k1.InterfaceC1112j;
import p092k1.InterfaceC1113k;
import p092k1.InterfaceC1114l;
import p092k1.InterfaceC1115m;
import p092k1.InterfaceC1116n;
import p092k1.InterfaceC1117o;
import p092k1.InterfaceC1118p;
import p092k1.InterfaceC1119q;
import p092k1.InterfaceC1120r;
import p092k1.InterfaceC1121s;
import p092k1.InterfaceC1122t;
import p092k1.InterfaceC1123u;
import p092k1.InterfaceC1124v;
import p106p1.InterfaceC1176a;
import p112r1.AbstractC1199i;

/* renamed from: l1.b */
/* loaded from: classes.dex */
public final class C1135b implements InterfaceC1176a, InterfaceC1134a {

    /* renamed from: b */
    public static final Map f4335b;

    /* renamed from: a */
    public final Class f4336a;

    static {
        List asList = Arrays.asList(InterfaceC1103a.class, InterfaceC1114l.class, C0749a.class, InterfaceC1118p.class, InterfaceC1119q.class, InterfaceC1120r.class, InterfaceC1121s.class, InterfaceC1122t.class, InterfaceC1123u.class, InterfaceC1124v.class, InterfaceC1104b.class, InterfaceC1105c.class, InterfaceC1106d.class, InterfaceC1107e.class, InterfaceC1108f.class, InterfaceC1109g.class, InterfaceC1110h.class, InterfaceC1111i.class, InterfaceC1112j.class, InterfaceC1113k.class, InterfaceC1115m.class, InterfaceC1116n.class, InterfaceC1117o.class);
        AbstractC1136c.m2636d(asList, "asList(this)");
        ArrayList arrayList = new ArrayList(AbstractC0759k.m2057X(asList));
        int i2 = 0;
        for (Object obj : asList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0697a((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f4335b = AbstractC0768t.m2060f0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC1136c.m2636d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC1136c.m2636d(str, "kotlinName");
            sb.append(AbstractC1199i.m2761G0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f4335b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0768t.m2059e0(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC1199i.m2761G0((String) entry2.getValue()));
        }
    }

    public C1135b(Class cls) {
        this.f4336a = cls;
    }

    @Override // p095l1.InterfaceC1134a
    /* renamed from: a */
    public final Class mo2632a() {
        return this.f4336a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1135b) && AbstractC0104l.m417y(this).equals(AbstractC0104l.m417y((InterfaceC1176a) obj));
    }

    public final int hashCode() {
        return AbstractC0104l.m417y(this).hashCode();
    }

    public final String toString() {
        return this.f4336a.toString() + " (Kotlin reflection is not available)";
    }
}
