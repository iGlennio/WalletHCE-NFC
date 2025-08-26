package p088j;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p010D1.AbstractC0104l;
import p027K.AbstractC0272P;
import p045Q.AbstractC0446m;
import p048R.C0460b;
import p073d.AbstractC0734a;
import p086i.InterfaceC0893C;

/* renamed from: j.J0 */
/* loaded from: classes.dex */
public class C0943J0 implements InterfaceC0893C {

    /* renamed from: A */
    public static final Method f3796A;

    /* renamed from: B */
    public static final Method f3797B;

    /* renamed from: a */
    public final Context f3798a;

    /* renamed from: b */
    public ListAdapter f3799b;

    /* renamed from: c */
    public C1045x0 f3800c;

    /* renamed from: f */
    public int f3803f;

    /* renamed from: g */
    public int f3804g;

    /* renamed from: i */
    public boolean f3806i;

    /* renamed from: j */
    public boolean f3807j;

    /* renamed from: k */
    public boolean f3808k;

    /* renamed from: n */
    public C0460b f3811n;

    /* renamed from: o */
    public View f3812o;

    /* renamed from: p */
    public AdapterView.OnItemClickListener f3813p;

    /* renamed from: q */
    public AdapterView.OnItemSelectedListener f3814q;

    /* renamed from: v */
    public final Handler f3819v;

    /* renamed from: x */
    public Rect f3821x;

    /* renamed from: y */
    public boolean f3822y;

    /* renamed from: z */
    public final C0926B f3823z;

    /* renamed from: d */
    public final int f3801d = -2;

    /* renamed from: e */
    public int f3802e = -2;

    /* renamed from: h */
    public final int f3805h = 1002;

    /* renamed from: l */
    public int f3809l = 0;

    /* renamed from: m */
    public final int f3810m = Integer.MAX_VALUE;

    /* renamed from: r */
    public final RunnableC0937G0 f3815r = new RunnableC0937G0(this, 1);

    /* renamed from: s */
    public final ViewOnTouchListenerC0941I0 f3816s = new ViewOnTouchListenerC0941I0(this);

    /* renamed from: t */
    public final C0939H0 f3817t = new C0939H0(this);

    /* renamed from: u */
    public final RunnableC0937G0 f3818u = new RunnableC0937G0(this, 0);

    /* renamed from: w */
    public final Rect f3820w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3796A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3797B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0943J0(Context context, AttributeSet attributeSet, int i2) {
        int resourceId;
        this.f3798a = context;
        this.f3819v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0734a.f2925o, i2, 0);
        this.f3803f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3804g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3806i = true;
        }
        obtainStyledAttributes.recycle();
        C0926B c0926b = new C0926B(context, attributeSet, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0734a.f2929s, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            AbstractC0446m.m1146c(c0926b, obtainStyledAttributes2.getBoolean(2, false));
        }
        c0926b.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC0104l.m415w(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f3823z = c0926b;
        c0926b.setInputMethodMode(1);
    }

    @Override // p086i.InterfaceC0893C
    /* renamed from: b */
    public final boolean mo2308b() {
        return this.f3823z.isShowing();
    }

    /* renamed from: c */
    public final void m2395c(int i2) {
        this.f3803f = i2;
    }

    /* renamed from: d */
    public final int m2396d() {
        return this.f3803f;
    }

    @Override // p086i.InterfaceC0893C
    public final void dismiss() {
        C0926B c0926b = this.f3823z;
        c0926b.dismiss();
        c0926b.setContentView(null);
        this.f3800c = null;
        this.f3819v.removeCallbacks(this.f3815r);
    }

    @Override // p086i.InterfaceC0893C
    /* renamed from: f */
    public final C1045x0 mo2309f() {
        return this.f3800c;
    }

    @Override // p086i.InterfaceC0893C
    /* renamed from: i */
    public final void mo2310i() {
        int i2;
        int paddingBottom;
        C1045x0 c1045x0;
        C1045x0 c1045x02 = this.f3800c;
        C0926B c0926b = this.f3823z;
        Context context = this.f3798a;
        if (c1045x02 == null) {
            C1045x0 mo2402q = mo2402q(context, !this.f3822y);
            this.f3800c = mo2402q;
            mo2402q.setAdapter(this.f3799b);
            this.f3800c.setOnItemClickListener(this.f3813p);
            this.f3800c.setFocusable(true);
            this.f3800c.setFocusableInTouchMode(true);
            this.f3800c.setOnItemSelectedListener(new C0931D0(0, this));
            this.f3800c.setOnScrollListener(this.f3817t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f3814q;
            if (onItemSelectedListener != null) {
                this.f3800c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0926b.setContentView(this.f3800c);
        }
        Drawable background = c0926b.getBackground();
        Rect rect = this.f3820w;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f3806i) {
                this.f3804g = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        int m2387a = AbstractC0933E0.m2387a(c0926b, this.f3812o, this.f3804g, c0926b.getInputMethodMode() == 2);
        int i4 = this.f3801d;
        if (i4 == -1) {
            paddingBottom = m2387a + i2;
        } else {
            int i5 = this.f3802e;
            int m2545a = this.f3800c.m2545a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), m2387a);
            paddingBottom = m2545a + (m2545a > 0 ? this.f3800c.getPaddingBottom() + this.f3800c.getPaddingTop() + i2 : 0);
        }
        boolean z2 = this.f3823z.getInputMethodMode() == 2;
        AbstractC0446m.m1147d(c0926b, this.f3805h);
        if (c0926b.isShowing()) {
            View view = this.f3812o;
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            if (view.isAttachedToWindow()) {
                int i6 = this.f3802e;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.f3812o.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        c0926b.setWidth(this.f3802e == -1 ? -1 : 0);
                        c0926b.setHeight(0);
                    } else {
                        c0926b.setWidth(this.f3802e == -1 ? -1 : 0);
                        c0926b.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                c0926b.setOutsideTouchable(true);
                int i7 = i6;
                c0926b.update(this.f3812o, this.f3803f, this.f3804g, i7 < 0 ? -1 : i7, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int i8 = this.f3802e;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.f3812o.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        c0926b.setWidth(i8);
        c0926b.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3796A;
            if (method != null) {
                try {
                    method.invoke(c0926b, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0935F0.m2391b(c0926b, true);
        }
        c0926b.setOutsideTouchable(true);
        c0926b.setTouchInterceptor(this.f3816s);
        if (this.f3808k) {
            AbstractC0446m.m1146c(c0926b, this.f3807j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3797B;
            if (method2 != null) {
                try {
                    method2.invoke(c0926b, this.f3821x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            AbstractC0935F0.m2390a(c0926b, this.f3821x);
        }
        c0926b.showAsDropDown(this.f3812o, this.f3803f, this.f3804g, this.f3809l);
        this.f3800c.setSelection(-1);
        if ((!this.f3822y || this.f3800c.isInTouchMode()) && (c1045x0 = this.f3800c) != null) {
            c1045x0.setListSelectionHidden(true);
            c1045x0.requestLayout();
        }
        if (this.f3822y) {
            return;
        }
        this.f3819v.post(this.f3818u);
    }

    /* renamed from: j */
    public final int m2397j() {
        if (this.f3806i) {
            return this.f3804g;
        }
        return 0;
    }

    /* renamed from: k */
    public final void m2398k(Drawable drawable) {
        this.f3823z.setBackgroundDrawable(drawable);
    }

    /* renamed from: l */
    public final void m2399l(int i2) {
        this.f3804g = i2;
        this.f3806i = true;
    }

    /* renamed from: n */
    public final Drawable m2400n() {
        return this.f3823z.getBackground();
    }

    /* renamed from: o */
    public void mo2401o(ListAdapter listAdapter) {
        C0460b c0460b = this.f3811n;
        if (c0460b == null) {
            this.f3811n = new C0460b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f3799b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0460b);
            }
        }
        this.f3799b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3811n);
        }
        C1045x0 c1045x0 = this.f3800c;
        if (c1045x0 != null) {
            c1045x0.setAdapter(this.f3799b);
        }
    }

    /* renamed from: q */
    public C1045x0 mo2402q(Context context, boolean z2) {
        return new C1045x0(context, z2);
    }

    /* renamed from: r */
    public final void m2403r(int i2) {
        Drawable background = this.f3823z.getBackground();
        if (background == null) {
            this.f3802e = i2;
            return;
        }
        Rect rect = this.f3820w;
        background.getPadding(rect);
        this.f3802e = rect.left + rect.right + i2;
    }
}
