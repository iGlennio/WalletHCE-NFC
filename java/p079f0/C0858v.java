package p079f0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.AbstractC0593g;

/* renamed from: f0.v */
/* loaded from: classes.dex */
public final class C0858v extends AbstractC0593g {

    /* renamed from: d */
    public final /* synthetic */ int f3484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0858v(AbstractC0812H abstractC0812H, int i2) {
        super(abstractC0812H);
        this.f3484d = i2;
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: b */
    public final int mo1511b(View view) {
        switch (this.f3484d) {
            case 0:
                C0813I c0813i = (C0813I) view.getLayoutParams();
                ((AbstractC0812H) this.f1971b).getClass();
                return view.getRight() + ((C0813I) view.getLayoutParams()).f3232b.right + ((ViewGroup.MarginLayoutParams) c0813i).rightMargin;
            default:
                C0813I c0813i2 = (C0813I) view.getLayoutParams();
                ((AbstractC0812H) this.f1971b).getClass();
                return view.getBottom() + ((C0813I) view.getLayoutParams()).f3232b.bottom + ((ViewGroup.MarginLayoutParams) c0813i2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: c */
    public final int mo1512c(View view) {
        switch (this.f3484d) {
            case 0:
                C0813I c0813i = (C0813I) view.getLayoutParams();
                ((AbstractC0812H) this.f1971b).getClass();
                return AbstractC0812H.m2165A(view) + ((ViewGroup.MarginLayoutParams) c0813i).leftMargin + ((ViewGroup.MarginLayoutParams) c0813i).rightMargin;
            default:
                C0813I c0813i2 = (C0813I) view.getLayoutParams();
                ((AbstractC0812H) this.f1971b).getClass();
                return AbstractC0812H.m2172z(view) + ((ViewGroup.MarginLayoutParams) c0813i2).topMargin + ((ViewGroup.MarginLayoutParams) c0813i2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: d */
    public final int mo1513d(View view) {
        switch (this.f3484d) {
            case 0:
                C0813I c0813i = (C0813I) view.getLayoutParams();
                ((AbstractC0812H) this.f1971b).getClass();
                return AbstractC0812H.m2172z(view) + ((ViewGroup.MarginLayoutParams) c0813i).topMargin + ((ViewGroup.MarginLayoutParams) c0813i).bottomMargin;
            default:
                C0813I c0813i2 = (C0813I) view.getLayoutParams();
                ((AbstractC0812H) this.f1971b).getClass();
                return AbstractC0812H.m2165A(view) + ((ViewGroup.MarginLayoutParams) c0813i2).leftMargin + ((ViewGroup.MarginLayoutParams) c0813i2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: e */
    public final int mo1514e(View view) {
        switch (this.f3484d) {
            case 0:
                C0813I c0813i = (C0813I) view.getLayoutParams();
                ((AbstractC0812H) this.f1971b).getClass();
                return (view.getLeft() - ((C0813I) view.getLayoutParams()).f3232b.left) - ((ViewGroup.MarginLayoutParams) c0813i).leftMargin;
            default:
                C0813I c0813i2 = (C0813I) view.getLayoutParams();
                ((AbstractC0812H) this.f1971b).getClass();
                return (view.getTop() - ((C0813I) view.getLayoutParams()).f3232b.top) - ((ViewGroup.MarginLayoutParams) c0813i2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: f */
    public final int mo1515f() {
        switch (this.f3484d) {
            case 0:
                return ((AbstractC0812H) this.f1971b).f3229n;
            default:
                return ((AbstractC0812H) this.f1971b).f3230o;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: g */
    public final int mo1516g() {
        switch (this.f3484d) {
            case 0:
                AbstractC0812H abstractC0812H = (AbstractC0812H) this.f1971b;
                return abstractC0812H.f3229n - abstractC0812H.m2177F();
            default:
                AbstractC0812H abstractC0812H2 = (AbstractC0812H) this.f1971b;
                return abstractC0812H2.f3230o - abstractC0812H2.m2175D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: h */
    public final int mo1517h() {
        switch (this.f3484d) {
            case 0:
                return ((AbstractC0812H) this.f1971b).m2177F();
            default:
                return ((AbstractC0812H) this.f1971b).m2175D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: i */
    public final int mo1518i() {
        switch (this.f3484d) {
            case 0:
                return ((AbstractC0812H) this.f1971b).f3227l;
            default:
                return ((AbstractC0812H) this.f1971b).f3228m;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: j */
    public final int mo1519j() {
        switch (this.f3484d) {
            case 0:
                return ((AbstractC0812H) this.f1971b).f3228m;
            default:
                return ((AbstractC0812H) this.f1971b).f3227l;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: k */
    public final int mo1520k() {
        switch (this.f3484d) {
            case 0:
                return ((AbstractC0812H) this.f1971b).m2176E();
            default:
                return ((AbstractC0812H) this.f1971b).m2178G();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: l */
    public final int mo1521l() {
        switch (this.f3484d) {
            case 0:
                AbstractC0812H abstractC0812H = (AbstractC0812H) this.f1971b;
                return (abstractC0812H.f3229n - abstractC0812H.m2176E()) - abstractC0812H.m2177F();
            default:
                AbstractC0812H abstractC0812H2 = (AbstractC0812H) this.f1971b;
                return (abstractC0812H2.f3230o - abstractC0812H2.m2178G()) - abstractC0812H2.m2175D();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: m */
    public final int mo1522m(View view) {
        switch (this.f3484d) {
            case 0:
                AbstractC0812H abstractC0812H = (AbstractC0812H) this.f1971b;
                Rect rect = (Rect) this.f1972c;
                abstractC0812H.m2179K(view, rect);
                return rect.right;
            default:
                AbstractC0812H abstractC0812H2 = (AbstractC0812H) this.f1971b;
                Rect rect2 = (Rect) this.f1972c;
                abstractC0812H2.m2179K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: n */
    public final int mo1523n(View view) {
        switch (this.f3484d) {
            case 0:
                AbstractC0812H abstractC0812H = (AbstractC0812H) this.f1971b;
                Rect rect = (Rect) this.f1972c;
                abstractC0812H.m2179K(view, rect);
                return rect.left;
            default:
                AbstractC0812H abstractC0812H2 = (AbstractC0812H) this.f1971b;
                Rect rect2 = (Rect) this.f1972c;
                abstractC0812H2.m2179K(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0593g
    /* renamed from: o */
    public final void mo1524o(int i2) {
        switch (this.f3484d) {
            case 0:
                ((AbstractC0812H) this.f1971b).mo1865O(i2);
                break;
            default:
                ((AbstractC0812H) this.f1971b).mo1867P(i2);
                break;
        }
    }
}
