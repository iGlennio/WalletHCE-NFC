package p079f0;

import android.view.View;
import java.util.List;

/* renamed from: f0.s */
/* loaded from: classes.dex */
public final class C0855s {

    /* renamed from: a */
    public boolean f3453a;

    /* renamed from: b */
    public int f3454b;

    /* renamed from: c */
    public int f3455c;

    /* renamed from: d */
    public int f3456d;

    /* renamed from: e */
    public int f3457e;

    /* renamed from: f */
    public int f3458f;

    /* renamed from: g */
    public int f3459g;

    /* renamed from: h */
    public int f3460h;

    /* renamed from: i */
    public int f3461i;

    /* renamed from: j */
    public int f3462j;

    /* renamed from: k */
    public List f3463k;

    /* renamed from: l */
    public boolean f3464l;

    /* renamed from: a */
    public final void m2261a(View view) {
        int m2215b;
        int size = this.f3463k.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = ((AbstractC0827X) this.f3463k.get(i3)).f3280a;
            C0813I c0813i = (C0813I) view3.getLayoutParams();
            if (view3 != view && !c0813i.f3231a.m2221h() && (m2215b = (c0813i.f3231a.m2215b() - this.f3456d) * this.f3457e) >= 0 && m2215b < i2) {
                view2 = view3;
                if (m2215b == 0) {
                    break;
                } else {
                    i2 = m2215b;
                }
            }
        }
        if (view2 == null) {
            this.f3456d = -1;
        } else {
            this.f3456d = ((C0813I) view2.getLayoutParams()).f3231a.m2215b();
        }
    }

    /* renamed from: b */
    public final View m2262b(C0818N c0818n) {
        List list = this.f3463k;
        if (list == null) {
            View view = c0818n.m2206i(this.f3456d, Long.MAX_VALUE).f3280a;
            this.f3456d += this.f3457e;
            return view;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = ((AbstractC0827X) this.f3463k.get(i2)).f3280a;
            C0813I c0813i = (C0813I) view2.getLayoutParams();
            if (!c0813i.f3231a.m2221h() && this.f3456d == c0813i.f3231a.m2215b()) {
                m2261a(view2);
                return view2;
            }
        }
        return null;
    }
}
