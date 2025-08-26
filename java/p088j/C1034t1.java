package p088j;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* renamed from: j.t1 */
/* loaded from: classes.dex */
public final class C1034t1 implements InterfaceC1024q0 {

    /* renamed from: a */
    public Toolbar f4054a;

    /* renamed from: b */
    public int f4055b;

    /* renamed from: c */
    public View f4056c;

    /* renamed from: d */
    public Drawable f4057d;

    /* renamed from: e */
    public Drawable f4058e;

    /* renamed from: f */
    public Drawable f4059f;

    /* renamed from: g */
    public boolean f4060g;

    /* renamed from: h */
    public CharSequence f4061h;

    /* renamed from: i */
    public CharSequence f4062i;

    /* renamed from: j */
    public CharSequence f4063j;

    /* renamed from: k */
    public Window.Callback f4064k;

    /* renamed from: l */
    public boolean f4065l;

    /* renamed from: m */
    public C1005k f4066m;

    /* renamed from: n */
    public int f4067n;

    /* renamed from: o */
    public Drawable f4068o;

    /* renamed from: a */
    public final void m2524a(int i2) {
        View view;
        int i3 = this.f4055b ^ i2;
        this.f4055b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    m2525b();
                }
                int i4 = this.f4055b & 4;
                Toolbar toolbar = this.f4054a;
                if (i4 != 0) {
                    Drawable drawable = this.f4059f;
                    if (drawable == null) {
                        drawable = this.f4068o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                m2526c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f4054a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f4061h);
                    toolbar2.setSubtitle(this.f4062i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f4056c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public final void m2525b() {
        if ((this.f4055b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f4063j);
            Toolbar toolbar = this.f4054a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f4067n);
            } else {
                toolbar.setNavigationContentDescription(this.f4063j);
            }
        }
    }

    /* renamed from: c */
    public final void m2526c() {
        Drawable drawable;
        int i2 = this.f4055b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f4058e;
            if (drawable == null) {
                drawable = this.f4057d;
            }
        } else {
            drawable = this.f4057d;
        }
        this.f4054a.setLogo(drawable);
    }
}
