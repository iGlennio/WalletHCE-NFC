package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p027K.C0278W;
import p076e.C0788l;
import p076e.LayoutInflaterFactory2C0797u;
import p086i.MenuC0907l;
import p088j.C0990f;
import p088j.C1005k;
import p088j.C1034t1;
import p088j.InterfaceC1018o0;
import p088j.InterfaceC1021p0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    public TypedValue f1727a;

    /* renamed from: b */
    public TypedValue f1728b;

    /* renamed from: c */
    public TypedValue f1729c;

    /* renamed from: d */
    public TypedValue f1730d;

    /* renamed from: e */
    public TypedValue f1731e;

    /* renamed from: f */
    public TypedValue f1732f;

    /* renamed from: g */
    public final Rect f1733g;

    /* renamed from: h */
    public InterfaceC1018o0 f1734h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1733g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1731e == null) {
            this.f1731e = new TypedValue();
        }
        return this.f1731e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1732f == null) {
            this.f1732f = new TypedValue();
        }
        return this.f1732f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1729c == null) {
            this.f1729c = new TypedValue();
        }
        return this.f1729c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1730d == null) {
            this.f1730d = new TypedValue();
        }
        return this.f1730d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1727a == null) {
            this.f1727a = new TypedValue();
        }
        return this.f1727a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1728b == null) {
            this.f1728b = new TypedValue();
        }
        return this.f1728b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1018o0 interfaceC1018o0 = this.f1734h;
        if (interfaceC1018o0 != null) {
            interfaceC1018o0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1005k c1005k;
        super.onDetachedFromWindow();
        InterfaceC1018o0 interfaceC1018o0 = this.f1734h;
        if (interfaceC1018o0 != null) {
            LayoutInflaterFactory2C0797u layoutInflaterFactory2C0797u = ((C0788l) interfaceC1018o0).f3101b;
            InterfaceC1021p0 interfaceC1021p0 = layoutInflaterFactory2C0797u.f3176r;
            if (interfaceC1021p0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1021p0;
                actionBarOverlayLayout.m1395k();
                ActionMenuView actionMenuView = ((C1034t1) actionBarOverlayLayout.f1690e).f4054a.f1797a;
                if (actionMenuView != null && (c1005k = actionMenuView.f1716t) != null) {
                    c1005k.m2487f();
                    C0990f c0990f = c1005k.f3981u;
                    if (c0990f != null && c0990f.m2361b()) {
                        c0990f.f3739i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0797u.f3181w != null) {
                layoutInflaterFactory2C0797u.f3170l.getDecorView().removeCallbacks(layoutInflaterFactory2C0797u.f3182x);
                if (layoutInflaterFactory2C0797u.f3181w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0797u.f3181w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0797u.f3181w = null;
            }
            C0278W c0278w = layoutInflaterFactory2C0797u.f3183y;
            if (c0278w != null) {
                c0278w.m840b();
            }
            MenuC0907l menuC0907l = layoutInflaterFactory2C0797u.m2149z(0).f3122h;
            if (menuC0907l != null) {
                menuC0907l.m2339c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC1018o0 interfaceC1018o0) {
        this.f1734h = interfaceC1018o0;
    }
}
