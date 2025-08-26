package p079f0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: f0.F */
/* loaded from: classes.dex */
public final class C0810F {

    /* renamed from: a */
    public final /* synthetic */ int f3210a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0812H f3211b;

    public /* synthetic */ C0810F(AbstractC0812H abstractC0812H, int i2) {
        this.f3210a = i2;
        this.f3211b = abstractC0812H;
    }

    /* renamed from: a */
    public final int m2161a(View view) {
        switch (this.f3210a) {
            case 0:
                C0813I c0813i = (C0813I) view.getLayoutParams();
                this.f3211b.getClass();
                return view.getRight() + ((C0813I) view.getLayoutParams()).f3232b.right + ((ViewGroup.MarginLayoutParams) c0813i).rightMargin;
            default:
                C0813I c0813i2 = (C0813I) view.getLayoutParams();
                this.f3211b.getClass();
                return view.getBottom() + ((C0813I) view.getLayoutParams()).f3232b.bottom + ((ViewGroup.MarginLayoutParams) c0813i2).bottomMargin;
        }
    }

    /* renamed from: b */
    public final int m2162b(View view) {
        switch (this.f3210a) {
            case 0:
                C0813I c0813i = (C0813I) view.getLayoutParams();
                this.f3211b.getClass();
                return (view.getLeft() - ((C0813I) view.getLayoutParams()).f3232b.left) - ((ViewGroup.MarginLayoutParams) c0813i).leftMargin;
            default:
                C0813I c0813i2 = (C0813I) view.getLayoutParams();
                this.f3211b.getClass();
                return (view.getTop() - ((C0813I) view.getLayoutParams()).f3232b.top) - ((ViewGroup.MarginLayoutParams) c0813i2).topMargin;
        }
    }

    /* renamed from: c */
    public final int m2163c() {
        switch (this.f3210a) {
            case 0:
                AbstractC0812H abstractC0812H = this.f3211b;
                return abstractC0812H.f3229n - abstractC0812H.m2177F();
            default:
                AbstractC0812H abstractC0812H2 = this.f3211b;
                return abstractC0812H2.f3230o - abstractC0812H2.m2175D();
        }
    }

    /* renamed from: d */
    public final int m2164d() {
        switch (this.f3210a) {
            case 0:
                return this.f3211b.m2176E();
            default:
                return this.f3211b.m2178G();
        }
    }
}
