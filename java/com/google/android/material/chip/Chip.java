package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p008D.AbstractC0088b;
import p008D.InterfaceC0090d;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p014F0.AbstractC0128E;
import p014F0.C0124A;
import p014F0.C0126C;
import p014F0.InterfaceC0139g;
import p021I.AbstractC0215j;
import p021I.C0207b;
import p021I.C0214i;
import p025J0.C0231d;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p028K0.AbstractC0331a;
import p034M0.C0366k;
import p034M0.C0379x;
import p034M0.InterfaceC0377v;
import p047Q1.AbstractC0458e;
import p049R0.AbstractC0463a;
import p088j.C1026r;
import p108q0.AbstractC1183a;
import p111r0.C1189b;
import p134z0.C1330b;
import p134z0.C1332d;
import p134z0.InterfaceC1331c;

/* loaded from: classes.dex */
public class Chip extends C1026r implements InterfaceC1331c, InterfaceC0377v, Checkable {

    /* renamed from: w */
    public static final Rect f2599w = new Rect();

    /* renamed from: x */
    public static final int[] f2600x = {R.attr.state_selected};

    /* renamed from: y */
    public static final int[] f2601y = {R.attr.state_checkable};

    /* renamed from: e */
    public C1332d f2602e;

    /* renamed from: f */
    public InsetDrawable f2603f;

    /* renamed from: g */
    public RippleDrawable f2604g;

    /* renamed from: h */
    public View.OnClickListener f2605h;

    /* renamed from: i */
    public CompoundButton.OnCheckedChangeListener f2606i;

    /* renamed from: j */
    public boolean f2607j;

    /* renamed from: k */
    public boolean f2608k;

    /* renamed from: l */
    public boolean f2609l;

    /* renamed from: m */
    public boolean f2610m;

    /* renamed from: n */
    public boolean f2611n;

    /* renamed from: o */
    public int f2612o;

    /* renamed from: p */
    public int f2613p;

    /* renamed from: q */
    public CharSequence f2614q;

    /* renamed from: r */
    public final C1330b f2615r;

    /* renamed from: s */
    public boolean f2616s;

    /* renamed from: t */
    public final Rect f2617t;

    /* renamed from: u */
    public final RectF f2618u;

    /* renamed from: v */
    public final C0124A f2619v;

    public Chip(Context context, AttributeSet attributeSet) {
        super(AbstractC0463a.m1220a(context, attributeSet, com.nfupay.s145.R.attr.chipStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.nfupay.s145.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f2617t = new Rect();
        this.f2618u = new RectF();
        this.f2619v = new C0124A(1, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C1332d c1332d = new C1332d(context2, attributeSet);
        int[] iArr = AbstractC1183a.f4524c;
        TypedArray m456f = AbstractC0128E.m456f(c1332d.f5476e0, attributeSet, iArr, com.nfupay.s145.R.attr.chipStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c1332d.f5450E0 = m456f.hasValue(37);
        Context context3 = c1332d.f5476e0;
        ColorStateList m413t = AbstractC0104l.m413t(context3, m456f, 24);
        if (c1332d.f5495x != m413t) {
            c1332d.f5495x = m413t;
            c1332d.onStateChange(c1332d.getState());
        }
        ColorStateList m413t2 = AbstractC0104l.m413t(context3, m456f, 11);
        if (c1332d.f5497y != m413t2) {
            c1332d.f5497y = m413t2;
            c1332d.onStateChange(c1332d.getState());
        }
        float dimension = m456f.getDimension(19, 0.0f);
        if (c1332d.f5499z != dimension) {
            c1332d.f5499z = dimension;
            c1332d.invalidateSelf();
            c1332d.m3069u();
        }
        if (m456f.hasValue(12)) {
            c1332d.m3044A(m456f.getDimension(12, 0.0f));
        }
        c1332d.m3049F(AbstractC0104l.m413t(context3, m456f, 22));
        c1332d.m3050G(m456f.getDimension(23, 0.0f));
        c1332d.m3059P(AbstractC0104l.m413t(context3, m456f, 36));
        String text = m456f.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c1332d.f5449E, text)) {
            c1332d.f5449E = text;
            c1332d.f5482k0.f346d = true;
            c1332d.invalidateSelf();
            c1332d.m3069u();
        }
        C0231d c0231d = (!m456f.hasValue(0) || (resourceId3 = m456f.getResourceId(0, 0)) == 0) ? null : new C0231d(context3, resourceId3);
        c0231d.f690k = m456f.getDimension(1, c0231d.f690k);
        c1332d.m3060Q(c0231d);
        int i2 = m456f.getInt(3, 0);
        if (i2 == 1) {
            c1332d.f5444B0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            c1332d.f5444B0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            c1332d.f5444B0 = TextUtils.TruncateAt.END;
        }
        c1332d.m3048E(m456f.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c1332d.m3048E(m456f.getBoolean(15, false));
        }
        c1332d.m3045B(AbstractC0104l.m416x(context3, m456f, 14));
        if (m456f.hasValue(17)) {
            c1332d.m3047D(AbstractC0104l.m413t(context3, m456f, 17));
        }
        c1332d.m3046C(m456f.getDimension(16, -1.0f));
        c1332d.m3056M(m456f.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c1332d.m3056M(m456f.getBoolean(26, false));
        }
        c1332d.m3051H(AbstractC0104l.m416x(context3, m456f, 25));
        c1332d.m3055L(AbstractC0104l.m413t(context3, m456f, 30));
        c1332d.m3053J(m456f.getDimension(28, 0.0f));
        c1332d.m3071w(m456f.getBoolean(6, false));
        c1332d.m3074z(m456f.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c1332d.m3074z(m456f.getBoolean(8, false));
        }
        c1332d.m3072x(AbstractC0104l.m416x(context3, m456f, 7));
        if (m456f.hasValue(9)) {
            c1332d.m3073y(AbstractC0104l.m413t(context3, m456f, 9));
        }
        c1332d.f5466U = (!m456f.hasValue(39) || (resourceId2 = m456f.getResourceId(39, 0)) == 0) ? null : C1189b.m2750a(context3, resourceId2);
        c1332d.f5467V = (!m456f.hasValue(33) || (resourceId = m456f.getResourceId(33, 0)) == 0) ? null : C1189b.m2750a(context3, resourceId);
        float dimension2 = m456f.getDimension(21, 0.0f);
        if (c1332d.f5468W != dimension2) {
            c1332d.f5468W = dimension2;
            c1332d.invalidateSelf();
            c1332d.m3069u();
        }
        c1332d.m3058O(m456f.getDimension(35, 0.0f));
        c1332d.m3057N(m456f.getDimension(34, 0.0f));
        float dimension3 = m456f.getDimension(41, 0.0f);
        if (c1332d.f5471Z != dimension3) {
            c1332d.f5471Z = dimension3;
            c1332d.invalidateSelf();
            c1332d.m3069u();
        }
        float dimension4 = m456f.getDimension(40, 0.0f);
        if (c1332d.f5472a0 != dimension4) {
            c1332d.f5472a0 = dimension4;
            c1332d.invalidateSelf();
            c1332d.m3069u();
        }
        c1332d.m3054K(m456f.getDimension(29, 0.0f));
        c1332d.m3052I(m456f.getDimension(27, 0.0f));
        float dimension5 = m456f.getDimension(13, 0.0f);
        if (c1332d.f5475d0 != dimension5) {
            c1332d.f5475d0 = dimension5;
            c1332d.invalidateSelf();
            c1332d.m3069u();
        }
        c1332d.f5448D0 = m456f.getDimensionPixelSize(4, Integer.MAX_VALUE);
        m456f.recycle();
        AbstractC0128E.m451a(context2, attributeSet, com.nfupay.s145.R.attr.chipStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0128E.m452b(context2, attributeSet, iArr, com.nfupay.s145.R.attr.chipStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.nfupay.s145.R.attr.chipStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Chip_Action);
        this.f2611n = obtainStyledAttributes.getBoolean(32, false);
        this.f2613p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(c1332d);
        c1332d.m1026i(AbstractC0261E.m748i(this));
        AbstractC0128E.m451a(context2, attributeSet, com.nfupay.s145.R.attr.chipStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0128E.m452b(context2, attributeSet, iArr, com.nfupay.s145.R.attr.chipStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.nfupay.s145.R.attr.chipStyle, com.nfupay.s145.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f2615r = new C1330b(this, this);
        m1941d();
        if (!hasValue) {
            setOutlineProvider(new C0379x(2, this));
        }
        setChecked(this.f2607j);
        setText(c1332d.f5449E);
        setEllipsize(c1332d.f5444B0);
        m1944g();
        if (!this.f2602e.f5446C0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m1943f();
        if (this.f2611n) {
            setMinHeight(this.f2613p);
        }
        this.f2612o = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: z0.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f2606i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2618u;
        rectF.setEmpty();
        if (m1940c() && this.f2605h != null) {
            C1332d c1332d = this.f2602e;
            Rect bounds = c1332d.getBounds();
            rectF.setEmpty();
            if (c1332d.m3063T()) {
                float f = c1332d.f5475d0 + c1332d.f5474c0 + c1332d.f5460O + c1332d.f5473b0 + c1332d.f5472a0;
                if (AbstractC0088b.m307a(c1332d) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i2 = (int) closeIconTouchBounds.left;
        int i3 = (int) closeIconTouchBounds.top;
        int i4 = (int) closeIconTouchBounds.right;
        int i5 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f2617t;
        rect.set(i2, i3, i4, i5);
        return rect;
    }

    private C0231d getTextAppearance() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5482k0.f348f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f2609l != z2) {
            this.f2609l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f2608k != z2) {
            this.f2608k = z2;
            refreshDrawableState();
        }
    }

    /* renamed from: b */
    public final void m1939b(int i2) {
        this.f2613p = i2;
        if (!this.f2611n) {
            InsetDrawable insetDrawable = this.f2603f;
            if (insetDrawable == null) {
                int[] iArr = AbstractC0331a.f869a;
                m1942e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f2603f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC0331a.f869a;
                    m1942e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i2 - ((int) this.f2602e.f5499z));
        int max2 = Math.max(0, i2 - this.f2602e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f2603f;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC0331a.f869a;
                m1942e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f2603f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC0331a.f869a;
                    m1942e();
                    return;
                }
                return;
            }
        }
        int i3 = max2 > 0 ? max2 / 2 : 0;
        int i4 = max > 0 ? max / 2 : 0;
        if (this.f2603f != null) {
            Rect rect = new Rect();
            this.f2603f.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                int[] iArr5 = AbstractC0331a.f869a;
                m1942e();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f2603f = new InsetDrawable((Drawable) this.f2602e, i3, i4, i3, i4);
        int[] iArr6 = AbstractC0331a.f869a;
        m1942e();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1940c() {
        /*
            r2 = this;
            z0.d r0 = r2.f2602e
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.f5457L
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof p008D.InterfaceC0090d
            if (r1 == 0) goto Lf
            D.d r0 = (p008D.InterfaceC0090d) r0
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.m1940c():boolean");
    }

    /* renamed from: d */
    public final void m1941d() {
        C1332d c1332d;
        if (!m1940c() || (c1332d = this.f2602e) == null || !c1332d.f5456K || this.f2605h == null) {
            AbstractC0272P.m823m(this, null);
            this.f2616s = false;
        } else {
            AbstractC0272P.m823m(this, this.f2615r);
            this.f2616s = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f2616s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L9:
            z0.b r0 = r9.f2615r
            android.view.accessibility.AccessibilityManager r1 = r0.f1296h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L6c
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6c
        L1c:
            int r1 = r10.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 7
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r5) goto L3d
            r5 = 9
            if (r1 == r5) goto L3d
            r5 = 10
            if (r1 == r5) goto L30
            goto L6c
        L30:
            int r1 = r0.f1301m
            if (r1 == r6) goto L6c
            if (r1 != r6) goto L37
            goto L72
        L37:
            r0.f1301m = r6
            r0.m1239q(r1, r2)
            return r3
        L3d:
            float r1 = r10.getX()
            float r5 = r10.getY()
            com.google.android.material.chip.Chip r7 = r0.f5438q
            boolean r8 = r7.m1940c()
            if (r8 == 0) goto L59
            android.graphics.RectF r7 = r7.getCloseIconTouchBounds()
            boolean r1 = r7.contains(r1, r5)
            if (r1 == 0) goto L59
            r1 = r3
            goto L5a
        L59:
            r1 = r4
        L5a:
            int r5 = r0.f1301m
            if (r5 != r1) goto L5f
            goto L69
        L5f:
            r0.f1301m = r1
            r7 = 128(0x80, float:1.8E-43)
            r0.m1239q(r1, r7)
            r0.m1239q(r5, r2)
        L69:
            if (r1 == r6) goto L6c
            goto L72
        L6c:
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L73
        L72:
            return r3
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2616s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C1330b c1330b = this.f2615r;
        c1330b.getClass();
        boolean z2 = false;
        int i2 = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i2 < repeatCount && c1330b.m1235m(i3, null)) {
                                    i2++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = c1330b.f1300l;
                    if (i4 != Integer.MIN_VALUE) {
                        Chip chip = c1330b.f5438q;
                        if (i4 == 0) {
                            chip.performClick();
                        } else if (i4 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f2605h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f2616s) {
                                chip.f2615r.m1239q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = c1330b.m1235m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = c1330b.m1235m(1, null);
            }
        }
        if (!z2 || c1330b.f1300l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p088j.C1026r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i2;
        super.drawableStateChanged();
        C1332d c1332d = this.f2602e;
        boolean z2 = false;
        if (c1332d != null && C1332d.m3043t(c1332d.f5457L)) {
            C1332d c1332d2 = this.f2602e;
            ?? isEnabled = isEnabled();
            int i3 = isEnabled;
            if (this.f2610m) {
                i3 = isEnabled + 1;
            }
            int i4 = i3;
            if (this.f2609l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (this.f2608k) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f2610m) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f2609l) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f2608k) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(c1332d2.f5498y0, iArr)) {
                c1332d2.f5498y0 = iArr;
                if (c1332d2.m3063T()) {
                    z2 = c1332d2.m3070v(c1332d2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m1942e() {
        this.f2604g = new RippleDrawable(AbstractC0331a.m952a(this.f2602e.f5447D), getBackgroundDrawable(), null);
        this.f2602e.getClass();
        RippleDrawable rippleDrawable = this.f2604g;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setBackground(rippleDrawable);
        m1943f();
    }

    /* renamed from: f */
    public final void m1943f() {
        C1332d c1332d;
        if (TextUtils.isEmpty(getText()) || (c1332d = this.f2602e) == null) {
            return;
        }
        int m3067q = (int) (c1332d.m3067q() + c1332d.f5475d0 + c1332d.f5472a0);
        C1332d c1332d2 = this.f2602e;
        int m3066p = (int) (c1332d2.m3066p() + c1332d2.f5468W + c1332d2.f5471Z);
        if (this.f2603f != null) {
            Rect rect = new Rect();
            this.f2603f.getPadding(rect);
            m3066p += rect.left;
            m3067q += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setPaddingRelative(m3066p, paddingTop, m3067q, paddingBottom);
    }

    /* renamed from: g */
    public final void m1944g() {
        TextPaint paint = getPaint();
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            paint.drawableState = c1332d.getState();
        }
        C0231d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m637e(getContext(), paint, this.f2619v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2614q)) {
            return this.f2614q;
        }
        C1332d c1332d = this.f2602e;
        if (!(c1332d != null && c1332d.f5462Q)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2603f;
        return insetDrawable == null ? this.f2602e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5464S;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5465T;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5497y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return Math.max(0.0f, c1332d.m3068r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2602e;
    }

    public float getChipEndPadding() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5475d0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C1332d c1332d = this.f2602e;
        if (c1332d == null || (drawable = c1332d.f5452G) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0090d)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5454I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5453H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5499z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5468W;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5443B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5445C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C1332d c1332d = this.f2602e;
        if (c1332d == null || (drawable = c1332d.f5457L) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0090d)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5461P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5474c0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5460O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5473b0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5459N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5444B0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f2616s) {
            C1330b c1330b = this.f2615r;
            if (c1330b.f1300l == 1 || c1330b.f1299k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C1189b getHideMotionSpec() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5467V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5470Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5469X;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5447D;
        }
        return null;
    }

    public C0366k getShapeAppearanceModel() {
        return this.f2602e.f931a.f914a;
    }

    public C1189b getShowMotionSpec() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5466U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5472a0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            return c1332d.f5471Z;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0458e.m1183a0(this, this.f2602e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2600x);
        }
        C1332d c1332d = this.f2602e;
        if (c1332d != null && c1332d.f5462Q) {
            View.mergeDrawableStates(onCreateDrawableState, f2601y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.f2616s) {
            C1330b c1330b = this.f2615r;
            int i3 = c1330b.f1300l;
            if (i3 != Integer.MIN_VALUE) {
                c1330b.m1232j(i3);
            }
            if (z2) {
                c1330b.m1235m(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C1332d c1332d = this.f2602e;
        accessibilityNodeInfo.setCheckable(c1332d != null && c1332d.f5462Q);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f2612o != i2) {
            this.f2612o = i2;
            m1943f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f2608k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f2608k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f2605h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f2616s
            if (r0 == 0) goto L43
            z0.b r0 = r5.f2615r
            r0.m1239q(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2614q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2604g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p088j.C1026r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2604g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p088j.C1026r, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3071w(z2);
        }
    }

    public void setCheckableResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3071w(c1332d.f5476e0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C1332d c1332d = this.f2602e;
        if (c1332d == null) {
            this.f2607j = z2;
        } else if (c1332d.f5462Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3072x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3072x(AbstractC0104l.m415w(c1332d.f5476e0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3073y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3073y(AbstractC0096d.m355v(c1332d.f5476e0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3074z(c1332d.f5476e0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1332d c1332d = this.f2602e;
        if (c1332d == null || c1332d.f5497y == colorStateList) {
            return;
        }
        c1332d.f5497y = colorStateList;
        c1332d.onStateChange(c1332d.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList m355v;
        C1332d c1332d = this.f2602e;
        if (c1332d == null || c1332d.f5497y == (m355v = AbstractC0096d.m355v(c1332d.f5476e0, i2))) {
            return;
        }
        c1332d.f5497y = m355v;
        c1332d.onStateChange(c1332d.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3044A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3044A(c1332d.f5476e0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(C1332d c1332d) {
        C1332d c1332d2 = this.f2602e;
        if (c1332d2 != c1332d) {
            if (c1332d2 != null) {
                c1332d2.f5442A0 = new WeakReference(null);
            }
            this.f2602e = c1332d;
            c1332d.f5446C0 = false;
            c1332d.f5442A0 = new WeakReference(this);
            m1939b(this.f2613p);
        }
    }

    public void setChipEndPadding(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d == null || c1332d.f5475d0 == f) {
            return;
        }
        c1332d.f5475d0 = f;
        c1332d.invalidateSelf();
        c1332d.m3069u();
    }

    public void setChipEndPaddingResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            float dimension = c1332d.f5476e0.getResources().getDimension(i2);
            if (c1332d.f5475d0 != dimension) {
                c1332d.f5475d0 = dimension;
                c1332d.invalidateSelf();
                c1332d.m3069u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3045B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3045B(AbstractC0104l.m415w(c1332d.f5476e0, i2));
        }
    }

    public void setChipIconSize(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3046C(f);
        }
    }

    public void setChipIconSizeResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3046C(c1332d.f5476e0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3047D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3047D(AbstractC0096d.m355v(c1332d.f5476e0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3048E(c1332d.f5476e0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d == null || c1332d.f5499z == f) {
            return;
        }
        c1332d.f5499z = f;
        c1332d.invalidateSelf();
        c1332d.m3069u();
    }

    public void setChipMinHeightResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            float dimension = c1332d.f5476e0.getResources().getDimension(i2);
            if (c1332d.f5499z != dimension) {
                c1332d.f5499z = dimension;
                c1332d.invalidateSelf();
                c1332d.m3069u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d == null || c1332d.f5468W == f) {
            return;
        }
        c1332d.f5468W = f;
        c1332d.invalidateSelf();
        c1332d.m3069u();
    }

    public void setChipStartPaddingResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            float dimension = c1332d.f5476e0.getResources().getDimension(i2);
            if (c1332d.f5468W != dimension) {
                c1332d.f5468W = dimension;
                c1332d.invalidateSelf();
                c1332d.m3069u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3049F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3049F(AbstractC0096d.m355v(c1332d.f5476e0, i2));
        }
    }

    public void setChipStrokeWidth(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3050G(f);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3050G(c1332d.f5476e0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3051H(drawable);
        }
        m1941d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1332d c1332d = this.f2602e;
        if (c1332d == null || c1332d.f5461P == charSequence) {
            return;
        }
        String str = C0207b.f584b;
        C0207b c0207b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0207b.f587e : C0207b.f586d;
        c0207b.getClass();
        C0214i c0214i = AbstractC0215j.f596a;
        c1332d.f5461P = c0207b.m583c(charSequence);
        c1332d.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3052I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3052I(c1332d.f5476e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3051H(AbstractC0104l.m415w(c1332d.f5476e0, i2));
        }
        m1941d();
    }

    public void setCloseIconSize(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3053J(f);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3053J(c1332d.f5476e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3054K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3054K(c1332d.f5476e0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3055L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3055L(AbstractC0096d.m355v(c1332d.f5476e0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // p088j.C1026r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p088j.C1026r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m1026i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2602e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.f5444B0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f2611n = z2;
        m1939b(this.f2613p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(C1189b c1189b) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.f5467V = c1189b;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.f5467V = C1189b.m2750a(c1332d.f5476e0, i2);
        }
    }

    public void setIconEndPadding(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3057N(f);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3057N(c1332d.f5476e0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3058O(f);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3058O(c1332d.f5476e0.getResources().getDimension(i2));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f2602e == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.f5448D0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2606i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2605h = onClickListener;
        m1941d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3059P(colorStateList);
        }
        this.f2602e.getClass();
        m1942e();
    }

    public void setRippleColorResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3059P(AbstractC0096d.m355v(c1332d.f5476e0, i2));
            this.f2602e.getClass();
            m1942e();
        }
    }

    @Override // p034M0.InterfaceC0377v
    public void setShapeAppearanceModel(C0366k c0366k) {
        this.f2602e.setShapeAppearanceModel(c0366k);
    }

    public void setShowMotionSpec(C1189b c1189b) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.f5466U = c1189b;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.f5466U = C1189b.m2750a(c1332d.f5476e0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1332d c1332d = this.f2602e;
        if (c1332d == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1332d.f5446C0 ? null : charSequence, bufferType);
        C1332d c1332d2 = this.f2602e;
        if (c1332d2 == null || TextUtils.equals(c1332d2.f5449E, charSequence)) {
            return;
        }
        c1332d2.f5449E = charSequence;
        c1332d2.f5482k0.f346d = true;
        c1332d2.invalidateSelf();
        c1332d2.m3069u();
    }

    public void setTextAppearance(C0231d c0231d) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3060Q(c0231d);
        }
        m1944g();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d == null || c1332d.f5472a0 == f) {
            return;
        }
        c1332d.f5472a0 = f;
        c1332d.invalidateSelf();
        c1332d.m3069u();
    }

    public void setTextEndPaddingResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            float dimension = c1332d.f5476e0.getResources().getDimension(i2);
            if (c1332d.f5472a0 != dimension) {
                c1332d.f5472a0 = dimension;
                c1332d.invalidateSelf();
                c1332d.m3069u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f) {
        super.setTextSize(i2, f);
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            float applyDimension = TypedValue.applyDimension(i2, f, getResources().getDisplayMetrics());
            C0126C c0126c = c1332d.f5482k0;
            C0231d c0231d = c0126c.f348f;
            if (c0231d != null) {
                c0231d.f690k = applyDimension;
                c0126c.f343a.setTextSize(applyDimension);
                c1332d.m3069u();
                c1332d.invalidateSelf();
            }
        }
        m1944g();
    }

    public void setTextStartPadding(float f) {
        C1332d c1332d = this.f2602e;
        if (c1332d == null || c1332d.f5471Z == f) {
            return;
        }
        c1332d.f5471Z = f;
        c1332d.invalidateSelf();
        c1332d.m3069u();
    }

    public void setTextStartPaddingResource(int i2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            float dimension = c1332d.f5476e0.getResources().getDimension(i2);
            if (c1332d.f5471Z != dimension) {
                c1332d.f5471Z = dimension;
                c1332d.invalidateSelf();
                c1332d.m3069u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3056M(z2);
        }
        m1941d();
    }

    public void setCheckedIconVisible(boolean z2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3074z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3048E(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3060Q(new C0231d(c1332d.f5476e0, i2));
        }
        m1944g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        C1332d c1332d = this.f2602e;
        if (c1332d != null) {
            c1332d.m3060Q(new C0231d(c1332d.f5476e0, i2));
        }
        m1944g();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0139g interfaceC0139g) {
    }
}
