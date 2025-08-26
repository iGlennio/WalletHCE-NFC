package p018H;

import java.util.ArrayList;
import p002B.C0019i;
import p101o.C1161k;

/* renamed from: H.g */
/* loaded from: classes.dex */
public final class C0187g {

    /* renamed from: a */
    public final /* synthetic */ int f546a;

    /* renamed from: b */
    public final /* synthetic */ Object f547b;

    public /* synthetic */ C0187g(int i2, Object obj) {
        this.f546a = i2;
        this.f547b = obj;
    }

    /* renamed from: a */
    public final void m573a(Object obj) {
        switch (this.f546a) {
            case 0:
                C0188h c0188h = (C0188h) obj;
                if (c0188h == null) {
                    c0188h = new C0188h(-3);
                }
                ((C0019i) this.f547b).m54E(c0188h);
                return;
            default:
                C0188h c0188h2 = (C0188h) obj;
                synchronized (AbstractC0189i.f552c) {
                    try {
                        C1161k c1161k = AbstractC0189i.f553d;
                        ArrayList arrayList = (ArrayList) c1161k.getOrDefault((String) this.f547b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c1161k.remove((String) this.f547b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((C0187g) arrayList.get(i2)).m573a(c0188h2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
