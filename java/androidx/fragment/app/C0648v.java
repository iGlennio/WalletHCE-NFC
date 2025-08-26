package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.C0579a;
import java.util.ArrayList;
import java.util.Map;
import p017G0.C0176h;

/* renamed from: androidx.fragment.app.v */
/* loaded from: classes.dex */
public final class C0648v {

    /* renamed from: a */
    public final /* synthetic */ int f2262a;

    /* renamed from: b */
    public final /* synthetic */ C0615E f2263b;

    public /* synthetic */ C0648v(C0615E c0615e, int i2) {
        this.f2262a = i2;
        this.f2263b = c0615e;
    }

    /* renamed from: a */
    public final void m1675a(Object obj) {
        switch (this.f2262a) {
            case 0:
                C0579a c0579a = (C0579a) obj;
                C0615E c0615e = this.f2263b;
                C0612B c0612b = (C0612B) c0615e.f2058w.pollFirst();
                if (c0612b == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    C0176h c0176h = c0615e.f2038c;
                    String str = c0612b.f2025a;
                    AbstractComponentCallbacksC0641o m537k = c0176h.m537k(str);
                    if (m537k == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        m537k.m1669k(c0612b.f2026b, c0579a.f1612a, c0579a.f1613b);
                        break;
                    }
                }
            case 1:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                }
                C0615E c0615e2 = this.f2263b;
                C0612B c0612b2 = (C0612B) c0615e2.f2058w.pollFirst();
                if (c0612b2 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    C0176h c0176h2 = c0615e2.f2038c;
                    String str2 = c0612b2.f2025a;
                    if (c0176h2.m537k(str2) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str2);
                        break;
                    }
                }
                break;
            default:
                C0579a c0579a2 = (C0579a) obj;
                C0615E c0615e3 = this.f2263b;
                C0612B c0612b3 = (C0612B) c0615e3.f2058w.pollFirst();
                if (c0612b3 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    C0176h c0176h3 = c0615e3.f2038c;
                    String str3 = c0612b3.f2025a;
                    AbstractComponentCallbacksC0641o m537k2 = c0176h3.m537k(str3);
                    if (m537k2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        m537k2.m1669k(c0612b3.f2026b, c0579a2.f1612a, c0579a2.f1613b);
                        break;
                    }
                }
        }
    }
}
