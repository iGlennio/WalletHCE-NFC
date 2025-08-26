package com.google.android.material.navigation;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.C0562b;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.AbstractC0000a;
import p010D1.AbstractC0096d;
import p014F0.AbstractC0156x;
import p014F0.C0140h;
import p014F0.C0152t;
import p017G0.C0173e;
import p017G0.C0176h;
import p017G0.C0180l;
import p017G0.InterfaceC0170b;
import p019H0.AbstractC0197c;
import p019H0.C0195a;
import p019H0.C0196b;
import p019H0.C0198d;
import p019H0.C0201g;
import p019H0.InterfaceC0200f;
import p019H0.ViewTreeObserverOnGlobalLayoutListenerC0199e;
import p027K.AbstractC0272P;
import p034M0.AbstractC0378w;
import p034M0.C0356a;
import p034M0.C0362g;
import p034M0.C0365j;
import p034M0.C0366k;
import p047Q1.AbstractC0458e;
import p056V.C0510d;
import p083h.C0881i;
import p086i.C0909n;
import p086i.InterfaceC0920y;
import p111r0.AbstractC1188a;

/* loaded from: classes.dex */
public class NavigationView extends AbstractC0156x implements InterfaceC0170b {

    /* renamed from: w */
    public static final int[] f2745w = {R.attr.state_checked};

    /* renamed from: x */
    public static final int[] f2746x = {-16842910};

    /* renamed from: h */
    public final C0140h f2747h;

    /* renamed from: i */
    public final C0152t f2748i;

    /* renamed from: j */
    public final int f2749j;

    /* renamed from: k */
    public final int[] f2750k;

    /* renamed from: l */
    public C0881i f2751l;

    /* renamed from: m */
    public final ViewTreeObserverOnGlobalLayoutListenerC0199e f2752m;

    /* renamed from: n */
    public boolean f2753n;

    /* renamed from: o */
    public boolean f2754o;

    /* renamed from: p */
    public int f2755p;

    /* renamed from: q */
    public final boolean f2756q;

    /* renamed from: r */
    public final int f2757r;

    /* renamed from: s */
    public final AbstractC0378w f2758s;

    /* renamed from: t */
    public final C0180l f2759t;

    /* renamed from: u */
    public final C0176h f2760u;

    /* renamed from: v */
    public final C0198d f2761v;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01db  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f2751l == null) {
            this.f2751l = new C0881i(getContext());
        }
        return this.f2751l;
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: a */
    public final void mo503a() {
        int i2 = 0;
        Pair m1971h = m1971h();
        DrawerLayout drawerLayout = (DrawerLayout) m1971h.first;
        C0180l c0180l = this.f2759t;
        C0562b c0562b = c0180l.f506f;
        c0180l.f506f = null;
        if (c0562b == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.m1493b(this, true);
            return;
        }
        int i3 = ((C0510d) m1971h.second).f1388a;
        int i4 = AbstractC0197c.f571a;
        c0180l.m555b(c0562b, i3, new C0196b(drawerLayout, this, i2), new C0195a(i2, drawerLayout));
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: b */
    public final void mo504b(C0562b c0562b) {
        m1971h();
        this.f2759t.f506f = c0562b;
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: c */
    public final void mo505c(C0562b c0562b) {
        int i2 = ((C0510d) m1971h().second).f1388a;
        C0180l c0180l = this.f2759t;
        if (c0180l.f506f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0562b c0562b2 = c0180l.f506f;
        c0180l.f506f = c0562b;
        float f = c0562b.f1564c;
        if (c0562b2 != null) {
            c0180l.m556c(f, c0562b.f1565d == 0, i2);
        }
        if (this.f2756q) {
            this.f2755p = AbstractC1188a.m2749c(0, this.f2757r, c0180l.f501a.getInterpolation(f));
            m1970g(getWidth(), getHeight());
        }
    }

    @Override // p017G0.InterfaceC0170b
    /* renamed from: d */
    public final void mo506d() {
        m1971h();
        this.f2759t.m554a();
        if (!this.f2756q || this.f2755p == 0) {
            return;
        }
        this.f2755p = 0;
        m1970g(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0378w abstractC0378w = this.f2758s;
        if (abstractC0378w.mo1048b()) {
            Path path = abstractC0378w.f1020e;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final ColorStateList m1968e(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList m355v = AbstractC0096d.m355v(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.nfupay.s145.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = m355v.getDefaultColor();
        int[] iArr = f2746x;
        return new ColorStateList(new int[][]{iArr, f2745w, FrameLayout.EMPTY_STATE_SET}, new int[]{m355v.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    /* renamed from: f */
    public final InsetDrawable m1969f(C0176h c0176h, ColorStateList colorStateList) {
        TypedArray typedArray = (TypedArray) c0176h.f516c;
        C0362g c0362g = new C0362g(C0366k.m1033a(getContext(), typedArray.getResourceId(17, 0), typedArray.getResourceId(18, 0), new C0356a(0)).m1032a());
        c0362g.m1027j(colorStateList);
        return new InsetDrawable((Drawable) c0362g, typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(21, 0), typedArray.getDimensionPixelSize(20, 0));
    }

    /* renamed from: g */
    public final void m1970g(int i2, int i3) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof C0510d)) {
            if ((this.f2755p > 0 || this.f2756q) && (getBackground() instanceof C0362g)) {
                int i4 = ((C0510d) getLayoutParams()).f1388a;
                WeakHashMap weakHashMap = AbstractC0272P.f768a;
                boolean z2 = Gravity.getAbsoluteGravity(i4, getLayoutDirection()) == 3;
                C0362g c0362g = (C0362g) getBackground();
                C0365j m1037e = c0362g.f931a.f914a.m1037e();
                float f = this.f2755p;
                m1037e.f958e = new C0356a(f);
                m1037e.f959f = new C0356a(f);
                m1037e.f960g = new C0356a(f);
                m1037e.f961h = new C0356a(f);
                if (z2) {
                    m1037e.f958e = new C0356a(0.0f);
                    m1037e.f961h = new C0356a(0.0f);
                } else {
                    m1037e.f959f = new C0356a(0.0f);
                    m1037e.f960g = new C0356a(0.0f);
                }
                C0366k m1032a = m1037e.m1032a();
                c0362g.setShapeAppearanceModel(m1032a);
                AbstractC0378w abstractC0378w = this.f2758s;
                abstractC0378w.f1018c = m1032a;
                abstractC0378w.m1049c();
                abstractC0378w.mo1047a(this);
                abstractC0378w.f1019d = new RectF(0.0f, 0.0f, i2, i3);
                abstractC0378w.m1049c();
                abstractC0378w.mo1047a(this);
                abstractC0378w.f1017b = true;
                abstractC0378w.mo1047a(this);
            }
        }
    }

    public C0180l getBackHelper() {
        return this.f2759t;
    }

    public MenuItem getCheckedItem() {
        return this.f2748i.f450e.f435d;
    }

    public int getDividerInsetEnd() {
        return this.f2748i.f465t;
    }

    public int getDividerInsetStart() {
        return this.f2748i.f464s;
    }

    public int getHeaderCount() {
        return this.f2748i.f447b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f2748i.f458m;
    }

    public int getItemHorizontalPadding() {
        return this.f2748i.f460o;
    }

    public int getItemIconPadding() {
        return this.f2748i.f462q;
    }

    public ColorStateList getItemIconTintList() {
        return this.f2748i.f457l;
    }

    public int getItemMaxLines() {
        return this.f2748i.f470y;
    }

    public ColorStateList getItemTextColor() {
        return this.f2748i.f456k;
    }

    public int getItemVerticalPadding() {
        return this.f2748i.f461p;
    }

    public Menu getMenu() {
        return this.f2747h;
    }

    public int getSubheaderInsetEnd() {
        return this.f2748i.f467v;
    }

    public int getSubheaderInsetStart() {
        return this.f2748i.f466u;
    }

    /* renamed from: h */
    public final Pair m1971h() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof C0510d)) {
            return new Pair((DrawerLayout) parent, (C0510d) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // p014F0.AbstractC0156x, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0173e c0173e;
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0362g) {
            AbstractC0458e.m1183a0(this, (C0362g) background);
        }
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            C0176h c0176h = this.f2760u;
            if (((C0173e) c0176h.f515b) != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                C0198d c0198d = this.f2761v;
                if (c0198d == null) {
                    drawerLayout.getClass();
                } else {
                    ArrayList arrayList = drawerLayout.f1955t;
                    if (arrayList != null) {
                        arrayList.remove(c0198d);
                    }
                }
                if (c0198d != null) {
                    if (drawerLayout.f1955t == null) {
                        drawerLayout.f1955t = new ArrayList();
                    }
                    drawerLayout.f1955t.add(c0198d);
                }
                if (!DrawerLayout.m1490k(this) || (c0173e = (C0173e) c0176h.f515b) == null) {
                    return;
                }
                c0173e.m517b((InterfaceC0170b) c0176h.f516c, (NavigationView) c0176h.f517d, true);
            }
        }
    }

    @Override // p014F0.AbstractC0156x, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f2752m);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            C0198d c0198d = this.f2761v;
            if (c0198d == null) {
                drawerLayout.getClass();
                return;
            }
            ArrayList arrayList = drawerLayout.f1955t;
            if (arrayList == null) {
                return;
            }
            arrayList.remove(c0198d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int i4 = this.f2749j;
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), i4), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0201g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0201g c0201g = (C0201g) parcelable;
        super.onRestoreInstanceState(c0201g.f1273a);
        Bundle bundle = c0201g.f575c;
        C0140h c0140h = this.f2747h;
        c0140h.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = c0140h.f3683u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0920y interfaceC0920y = (InterfaceC0920y) weakReference.get();
                if (interfaceC0920y == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int mo484d = interfaceC0920y.mo484d();
                    if (mo484d > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(mo484d)) != null) {
                        interfaceC0920y.mo490m(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable mo488j;
        C0201g c0201g = new C0201g(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c0201g.f575c = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2747h.f3683u;
        if (copyOnWriteArrayList.isEmpty()) {
            return c0201g;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0920y interfaceC0920y = (InterfaceC0920y) weakReference.get();
            if (interfaceC0920y == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int mo484d = interfaceC0920y.mo484d();
                if (mo484d > 0 && (mo488j = interfaceC0920y.mo488j()) != null) {
                    sparseArray.put(mo484d, mo488j);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return c0201g;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        m1970g(i2, i3);
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.f2754o = z2;
    }

    public void setCheckedItem(int i2) {
        MenuItem findItem = this.f2747h.findItem(i2);
        if (findItem != null) {
            this.f2748i.f450e.m481h((C0909n) findItem);
        }
    }

    public void setDividerInsetEnd(int i2) {
        C0152t c0152t = this.f2748i;
        c0152t.f465t = i2;
        c0152t.mo483c();
    }

    public void setDividerInsetStart(int i2) {
        C0152t c0152t = this.f2748i;
        c0152t.f464s = i2;
        c0152t.mo483c();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C0362g) {
            ((C0362g) background).m1026i(f);
        }
    }

    public void setForceCompatClippingEnabled(boolean z2) {
        AbstractC0378w abstractC0378w = this.f2758s;
        if (z2 != abstractC0378w.f1016a) {
            abstractC0378w.f1016a = z2;
            abstractC0378w.mo1047a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        C0152t c0152t = this.f2748i;
        c0152t.f458m = drawable;
        c0152t.mo483c();
    }

    public void setItemBackgroundResource(int i2) {
        setItemBackground(AbstractC0000a.m1b(getContext(), i2));
    }

    public void setItemHorizontalPadding(int i2) {
        C0152t c0152t = this.f2748i;
        c0152t.f460o = i2;
        c0152t.mo483c();
    }

    public void setItemHorizontalPaddingResource(int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        C0152t c0152t = this.f2748i;
        c0152t.f460o = dimensionPixelSize;
        c0152t.mo483c();
    }

    public void setItemIconPadding(int i2) {
        C0152t c0152t = this.f2748i;
        c0152t.f462q = i2;
        c0152t.mo483c();
    }

    public void setItemIconPaddingResource(int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        C0152t c0152t = this.f2748i;
        c0152t.f462q = dimensionPixelSize;
        c0152t.mo483c();
    }

    public void setItemIconSize(int i2) {
        C0152t c0152t = this.f2748i;
        if (c0152t.f463r != i2) {
            c0152t.f463r = i2;
            c0152t.f468w = true;
            c0152t.mo483c();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C0152t c0152t = this.f2748i;
        c0152t.f457l = colorStateList;
        c0152t.mo483c();
    }

    public void setItemMaxLines(int i2) {
        C0152t c0152t = this.f2748i;
        c0152t.f470y = i2;
        c0152t.mo483c();
    }

    public void setItemTextAppearance(int i2) {
        C0152t c0152t = this.f2748i;
        c0152t.f454i = i2;
        c0152t.mo483c();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        C0152t c0152t = this.f2748i;
        c0152t.f455j = z2;
        c0152t.mo483c();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C0152t c0152t = this.f2748i;
        c0152t.f456k = colorStateList;
        c0152t.mo483c();
    }

    public void setItemVerticalPadding(int i2) {
        C0152t c0152t = this.f2748i;
        c0152t.f461p = i2;
        c0152t.mo483c();
    }

    public void setItemVerticalPaddingResource(int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i2);
        C0152t c0152t = this.f2748i;
        c0152t.f461p = dimensionPixelSize;
        c0152t.mo483c();
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
        C0152t c0152t = this.f2748i;
        if (c0152t != null) {
            c0152t.f444B = i2;
            NavigationMenuView navigationMenuView = c0152t.f446a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i2);
            }
        }
    }

    public void setSubheaderInsetEnd(int i2) {
        C0152t c0152t = this.f2748i;
        c0152t.f467v = i2;
        c0152t.mo483c();
    }

    public void setSubheaderInsetStart(int i2) {
        C0152t c0152t = this.f2748i;
        c0152t.f466u = i2;
        c0152t.mo483c();
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.f2753n = z2;
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f2747h.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f2748i.f450e.m481h((C0909n) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setNavigationItemSelectedListener(InterfaceC0200f interfaceC0200f) {
    }
}
