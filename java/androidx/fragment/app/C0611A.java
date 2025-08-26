package androidx.fragment.app;

import android.content.Intent;
import androidx.activity.result.C0579a;
import java.util.ArrayList;
import java.util.Iterator;
import p010D1.AbstractC0096d;
import p072c1.C0697a;
import p075d1.AbstractC0756h;
import p075d1.AbstractC0759k;
import p075d1.AbstractC0768t;
import p075d1.C0766r;

/* renamed from: androidx.fragment.app.A */
/* loaded from: classes.dex */
public final class C0611A extends AbstractC0096d {

    /* renamed from: n */
    public final /* synthetic */ int f2024n;

    public /* synthetic */ C0611A(int i2) {
        this.f2024n = i2;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: U */
    public final Object mo366U(int i2, Intent intent) {
        switch (this.f2024n) {
            case 0:
                return new C0579a(i2, intent);
            case 1:
                C0766r c0766r = C0766r.f2997a;
                if (i2 != -1 || intent == null) {
                    return c0766r;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c0766r;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i3 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i3 == 0));
                }
                ArrayList m2053s0 = AbstractC0756h.m2053s0(stringArrayExtra);
                Iterator it = m2053s0.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC0759k.m2057X(m2053s0), AbstractC0759k.m2057X(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C0697a(it.next(), it2.next()));
                }
                return AbstractC0768t.m2060f0(arrayList2);
            default:
                return new C0579a(i2, intent);
        }
    }
}
