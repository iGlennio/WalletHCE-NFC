package p056V;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import p010D1.AbstractC0104l;
import p043P0.RunnableC0402A;
import p052T.C0483e;

/* renamed from: V.f */
/* loaded from: classes.dex */
public final class C0512f extends AbstractC0104l {

    /* renamed from: a */
    public final int f1397a;

    /* renamed from: b */
    public C0483e f1398b;

    /* renamed from: c */
    public final RunnableC0402A f1399c = new RunnableC0402A(3, this);

    /* renamed from: d */
    public final /* synthetic */ DrawerLayout f1400d;

    public C0512f(DrawerLayout drawerLayout, int i2) {
        this.f1400d = drawerLayout;
        this.f1397a = i2;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: A */
    public final int mo419A(View view) {
        if (DrawerLayout.m1491l(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: H */
    public final void mo421H(int i2, int i3) {
        int i4 = i2 & 1;
        DrawerLayout drawerLayout = this.f1400d;
        View m1495d = i4 == 1 ? drawerLayout.m1495d(3) : drawerLayout.m1495d(5);
        if (m1495d == null || drawerLayout.m1498g(m1495d) != 0) {
            return;
        }
        this.f1398b.m1241b(m1495d, i3);
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: I */
    public final void mo422I() {
        this.f1400d.postDelayed(this.f1399c, 160L);
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: K */
    public final void mo423K(View view, int i2) {
        ((C0510d) view.getLayoutParams()).f1390c = false;
        int i3 = this.f1397a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f1400d;
        View m1495d = drawerLayout.m1495d(i3);
        if (m1495d != null) {
            drawerLayout.m1493b(m1495d, true);
        }
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: L */
    public final void mo424L(int i2) {
        this.f1400d.m1505r(this.f1398b.f1327t, i2);
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: M */
    public final void mo425M(View view, int i2, int i3) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f1400d;
        float width2 = (drawerLayout.m1492a(view, 3) ? i2 + width : drawerLayout.getWidth() - i2) / width;
        drawerLayout.m1502o(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: N */
    public final void mo426N(View view, float f, float f2) {
        int i2;
        DrawerLayout drawerLayout = this.f1400d;
        int[] iArr = DrawerLayout.f1928D;
        float f3 = ((C0510d) view.getLayoutParams()).f1389b;
        int width = view.getWidth();
        if (drawerLayout.m1492a(view, 3)) {
            i2 = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i2 = width2;
        }
        this.f1398b.m1256q(i2, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: V */
    public final boolean mo429V(View view, int i2) {
        DrawerLayout drawerLayout = this.f1400d;
        return DrawerLayout.m1491l(view) && drawerLayout.m1492a(view, this.f1397a) && drawerLayout.m1498g(view) == 0;
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: i */
    public final int mo433i(View view, int i2) {
        DrawerLayout drawerLayout = this.f1400d;
        if (drawerLayout.m1492a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i2, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i2, width));
    }

    @Override // p010D1.AbstractC0104l
    /* renamed from: j */
    public final int mo434j(View view, int i2) {
        return view.getTop();
    }
}
