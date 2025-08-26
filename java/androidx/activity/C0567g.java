package androidx.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.C0579a;
import androidx.activity.result.C0580b;
import androidx.fragment.app.C0648v;
import java.util.ArrayList;
import java.util.HashMap;
import p002B.C0019i;
import p010D1.AbstractC0096d;
import p097m1.AbstractC1143a;

/* renamed from: androidx.activity.g */
/* loaded from: classes.dex */
public final class C0567g {

    /* renamed from: a */
    public final HashMap f1569a = new HashMap();

    /* renamed from: b */
    public final HashMap f1570b = new HashMap();

    /* renamed from: c */
    public final HashMap f1571c = new HashMap();

    /* renamed from: d */
    public ArrayList f1572d = new ArrayList();

    /* renamed from: e */
    public final transient HashMap f1573e = new HashMap();

    /* renamed from: f */
    public final HashMap f1574f = new HashMap();

    /* renamed from: g */
    public final Bundle f1575g = new Bundle();

    /* renamed from: a */
    public final boolean m1355a(int i2, int i3, Intent intent) {
        String str = (String) this.f1569a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0580b c0580b = (C0580b) this.f1573e.get(str);
        if (c0580b != null) {
            C0648v c0648v = c0580b.f1614a;
            if (this.f1572d.contains(str)) {
                c0648v.m1675a(c0580b.f1615b.mo366U(i3, intent));
                this.f1572d.remove(str);
                return true;
            }
        }
        this.f1574f.remove(str);
        this.f1575g.putParcelable(str, new C0579a(i3, intent));
        return true;
    }

    /* renamed from: b */
    public final C0019i m1356b(String str, AbstractC0096d abstractC0096d, C0648v c0648v) {
        int i2;
        HashMap hashMap;
        HashMap hashMap2 = this.f1570b;
        if (((Integer) hashMap2.get(str)) == null) {
            int m2644b = AbstractC1143a.f4342a.m2644b();
            while (true) {
                i2 = m2644b + 65536;
                hashMap = this.f1569a;
                if (!hashMap.containsKey(Integer.valueOf(i2))) {
                    break;
                }
                m2644b = AbstractC1143a.f4342a.m2644b();
            }
            hashMap.put(Integer.valueOf(i2), str);
            hashMap2.put(str, Integer.valueOf(i2));
        }
        this.f1573e.put(str, new C0580b(c0648v, abstractC0096d));
        HashMap hashMap3 = this.f1574f;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            c0648v.m1675a(obj);
        }
        Bundle bundle = this.f1575g;
        C0579a c0579a = (C0579a) bundle.getParcelable(str);
        if (c0579a != null) {
            bundle.remove(str);
            c0648v.m1675a(abstractC0096d.mo366U(c0579a.f1612a, c0579a.f1613b));
        }
        return new C0019i(this, str, 7, false);
    }
}
