package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p002B.C0019i;
import p007C1.C0056A;
import p107q.C1179c;
import p113s.C1203d;
import p113s.C1204e;
import p113s.C1207h;
import p121v.AbstractC1253c;
import p121v.AbstractC1254d;
import p121v.AbstractC1265o;
import p121v.AbstractC1267q;
import p121v.C1255e;
import p121v.C1256f;
import p121v.C1257g;
import p121v.C1264n;
import p121v.C1268r;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: r */
    public static C1268r f1838r;

    /* renamed from: a */
    public final SparseArray f1839a;

    /* renamed from: b */
    public final ArrayList f1840b;

    /* renamed from: c */
    public final C1204e f1841c;

    /* renamed from: d */
    public int f1842d;

    /* renamed from: e */
    public int f1843e;

    /* renamed from: f */
    public int f1844f;

    /* renamed from: g */
    public int f1845g;

    /* renamed from: h */
    public boolean f1846h;

    /* renamed from: i */
    public int f1847i;

    /* renamed from: j */
    public C1264n f1848j;

    /* renamed from: k */
    public C0019i f1849k;

    /* renamed from: l */
    public int f1850l;

    /* renamed from: m */
    public HashMap f1851m;

    /* renamed from: n */
    public final SparseArray f1852n;

    /* renamed from: o */
    public final C1256f f1853o;

    /* renamed from: p */
    public int f1854p;

    /* renamed from: q */
    public int f1855q;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1839a = new SparseArray();
        this.f1840b = new ArrayList(4);
        this.f1841c = new C1204e();
        this.f1842d = 0;
        this.f1843e = 0;
        this.f1844f = Integer.MAX_VALUE;
        this.f1845g = Integer.MAX_VALUE;
        this.f1846h = true;
        this.f1847i = 257;
        this.f1848j = null;
        this.f1849k = null;
        this.f1850l = -1;
        this.f1851m = new HashMap();
        this.f1852n = new SparseArray();
        this.f1853o = new C1256f(this, this);
        this.f1854p = 0;
        this.f1855q = 0;
        m1450i(attributeSet, 0);
    }

    /* renamed from: g */
    public static C1255e m1448g() {
        C1255e c1255e = new C1255e(-2, -2);
        c1255e.f4916a = -1;
        c1255e.f4918b = -1;
        c1255e.f4920c = -1.0f;
        c1255e.f4922d = true;
        c1255e.f4924e = -1;
        c1255e.f4926f = -1;
        c1255e.f4928g = -1;
        c1255e.f4930h = -1;
        c1255e.f4932i = -1;
        c1255e.f4934j = -1;
        c1255e.f4936k = -1;
        c1255e.f4938l = -1;
        c1255e.f4940m = -1;
        c1255e.f4942n = -1;
        c1255e.f4944o = -1;
        c1255e.f4946p = -1;
        c1255e.f4948q = 0;
        c1255e.f4949r = 0.0f;
        c1255e.f4950s = -1;
        c1255e.f4951t = -1;
        c1255e.f4952u = -1;
        c1255e.f4953v = -1;
        c1255e.f4954w = Integer.MIN_VALUE;
        c1255e.f4955x = Integer.MIN_VALUE;
        c1255e.f4956y = Integer.MIN_VALUE;
        c1255e.f4957z = Integer.MIN_VALUE;
        c1255e.f4890A = Integer.MIN_VALUE;
        c1255e.f4891B = Integer.MIN_VALUE;
        c1255e.f4892C = Integer.MIN_VALUE;
        c1255e.f4893D = 0;
        c1255e.f4894E = 0.5f;
        c1255e.f4895F = 0.5f;
        c1255e.f4896G = null;
        c1255e.f4897H = -1.0f;
        c1255e.f4898I = -1.0f;
        c1255e.f4899J = 0;
        c1255e.f4900K = 0;
        c1255e.f4901L = 0;
        c1255e.f4902M = 0;
        c1255e.f4903N = 0;
        c1255e.f4904O = 0;
        c1255e.f4905P = 0;
        c1255e.f4906Q = 0;
        c1255e.f4907R = 1.0f;
        c1255e.f4908S = 1.0f;
        c1255e.f4909T = -1;
        c1255e.f4910U = -1;
        c1255e.f4911V = -1;
        c1255e.f4912W = false;
        c1255e.f4913X = false;
        c1255e.f4914Y = null;
        c1255e.f4915Z = 0;
        c1255e.f4917a0 = true;
        c1255e.f4919b0 = true;
        c1255e.f4921c0 = false;
        c1255e.f4923d0 = false;
        c1255e.f4925e0 = false;
        c1255e.f4927f0 = -1;
        c1255e.f4929g0 = -1;
        c1255e.f4931h0 = -1;
        c1255e.f4933i0 = -1;
        c1255e.f4935j0 = Integer.MIN_VALUE;
        c1255e.f4937k0 = Integer.MIN_VALUE;
        c1255e.f4939l0 = 0.5f;
        c1255e.f4947p0 = new C1203d();
        return c1255e;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static C1268r getSharedValues() {
        if (f1838r == null) {
            C1268r c1268r = new C1268r();
            new SparseIntArray();
            new HashMap();
            f1838r = c1268r;
        }
        return f1838r;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1255e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1840b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC1253c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        int i5 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i4;
                        float f2 = i5;
                        float f3 = i4 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i5 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1846h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1448g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1255e c1255e = new C1255e(context, attributeSet);
        c1255e.f4916a = -1;
        c1255e.f4918b = -1;
        c1255e.f4920c = -1.0f;
        c1255e.f4922d = true;
        c1255e.f4924e = -1;
        c1255e.f4926f = -1;
        c1255e.f4928g = -1;
        c1255e.f4930h = -1;
        c1255e.f4932i = -1;
        c1255e.f4934j = -1;
        c1255e.f4936k = -1;
        c1255e.f4938l = -1;
        c1255e.f4940m = -1;
        c1255e.f4942n = -1;
        c1255e.f4944o = -1;
        c1255e.f4946p = -1;
        c1255e.f4948q = 0;
        c1255e.f4949r = 0.0f;
        c1255e.f4950s = -1;
        c1255e.f4951t = -1;
        c1255e.f4952u = -1;
        c1255e.f4953v = -1;
        c1255e.f4954w = Integer.MIN_VALUE;
        c1255e.f4955x = Integer.MIN_VALUE;
        c1255e.f4956y = Integer.MIN_VALUE;
        c1255e.f4957z = Integer.MIN_VALUE;
        c1255e.f4890A = Integer.MIN_VALUE;
        c1255e.f4891B = Integer.MIN_VALUE;
        c1255e.f4892C = Integer.MIN_VALUE;
        c1255e.f4893D = 0;
        c1255e.f4894E = 0.5f;
        c1255e.f4895F = 0.5f;
        c1255e.f4896G = null;
        c1255e.f4897H = -1.0f;
        c1255e.f4898I = -1.0f;
        c1255e.f4899J = 0;
        c1255e.f4900K = 0;
        c1255e.f4901L = 0;
        c1255e.f4902M = 0;
        c1255e.f4903N = 0;
        c1255e.f4904O = 0;
        c1255e.f4905P = 0;
        c1255e.f4906Q = 0;
        c1255e.f4907R = 1.0f;
        c1255e.f4908S = 1.0f;
        c1255e.f4909T = -1;
        c1255e.f4910U = -1;
        c1255e.f4911V = -1;
        c1255e.f4912W = false;
        c1255e.f4913X = false;
        c1255e.f4914Y = null;
        c1255e.f4915Z = 0;
        c1255e.f4917a0 = true;
        c1255e.f4919b0 = true;
        c1255e.f4921c0 = false;
        c1255e.f4923d0 = false;
        c1255e.f4925e0 = false;
        c1255e.f4927f0 = -1;
        c1255e.f4929g0 = -1;
        c1255e.f4931h0 = -1;
        c1255e.f4933i0 = -1;
        c1255e.f4935j0 = Integer.MIN_VALUE;
        c1255e.f4937k0 = Integer.MIN_VALUE;
        c1255e.f4939l0 = 0.5f;
        c1255e.f4947p0 = new C1203d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1267q.f5092b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = AbstractC1254d.f4889a.get(index);
            switch (i3) {
                case 1:
                    c1255e.f4911V = obtainStyledAttributes.getInt(index, c1255e.f4911V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c1255e.f4946p);
                    c1255e.f4946p = resourceId;
                    if (resourceId == -1) {
                        c1255e.f4946p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c1255e.f4948q = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4948q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, c1255e.f4949r) % 360.0f;
                    c1255e.f4949r = f;
                    if (f < 0.0f) {
                        c1255e.f4949r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c1255e.f4916a = obtainStyledAttributes.getDimensionPixelOffset(index, c1255e.f4916a);
                    break;
                case 6:
                    c1255e.f4918b = obtainStyledAttributes.getDimensionPixelOffset(index, c1255e.f4918b);
                    break;
                case 7:
                    c1255e.f4920c = obtainStyledAttributes.getFloat(index, c1255e.f4920c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c1255e.f4924e);
                    c1255e.f4924e = resourceId2;
                    if (resourceId2 == -1) {
                        c1255e.f4924e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c1255e.f4926f);
                    c1255e.f4926f = resourceId3;
                    if (resourceId3 == -1) {
                        c1255e.f4926f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c1255e.f4928g);
                    c1255e.f4928g = resourceId4;
                    if (resourceId4 == -1) {
                        c1255e.f4928g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c1255e.f4930h);
                    c1255e.f4930h = resourceId5;
                    if (resourceId5 == -1) {
                        c1255e.f4930h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c1255e.f4932i);
                    c1255e.f4932i = resourceId6;
                    if (resourceId6 == -1) {
                        c1255e.f4932i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c1255e.f4934j);
                    c1255e.f4934j = resourceId7;
                    if (resourceId7 == -1) {
                        c1255e.f4934j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c1255e.f4936k);
                    c1255e.f4936k = resourceId8;
                    if (resourceId8 == -1) {
                        c1255e.f4936k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c1255e.f4938l);
                    c1255e.f4938l = resourceId9;
                    if (resourceId9 == -1) {
                        c1255e.f4938l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c1255e.f4940m);
                    c1255e.f4940m = resourceId10;
                    if (resourceId10 == -1) {
                        c1255e.f4940m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c1255e.f4950s);
                    c1255e.f4950s = resourceId11;
                    if (resourceId11 == -1) {
                        c1255e.f4950s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c1255e.f4951t);
                    c1255e.f4951t = resourceId12;
                    if (resourceId12 == -1) {
                        c1255e.f4951t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c1255e.f4952u);
                    c1255e.f4952u = resourceId13;
                    if (resourceId13 == -1) {
                        c1255e.f4952u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c1255e.f4953v);
                    c1255e.f4953v = resourceId14;
                    if (resourceId14 == -1) {
                        c1255e.f4953v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c1255e.f4954w = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4954w);
                    break;
                case 22:
                    c1255e.f4955x = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4955x);
                    break;
                case 23:
                    c1255e.f4956y = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4956y);
                    break;
                case 24:
                    c1255e.f4957z = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4957z);
                    break;
                case 25:
                    c1255e.f4890A = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4890A);
                    break;
                case 26:
                    c1255e.f4891B = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4891B);
                    break;
                case 27:
                    c1255e.f4912W = obtainStyledAttributes.getBoolean(index, c1255e.f4912W);
                    break;
                case 28:
                    c1255e.f4913X = obtainStyledAttributes.getBoolean(index, c1255e.f4913X);
                    break;
                case 29:
                    c1255e.f4894E = obtainStyledAttributes.getFloat(index, c1255e.f4894E);
                    break;
                case 30:
                    c1255e.f4895F = obtainStyledAttributes.getFloat(index, c1255e.f4895F);
                    break;
                case 31:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c1255e.f4901L = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    c1255e.f4902M = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c1255e.f4903N = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4903N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c1255e.f4903N) == -2) {
                            c1255e.f4903N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c1255e.f4905P = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4905P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c1255e.f4905P) == -2) {
                            c1255e.f4905P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c1255e.f4907R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c1255e.f4907R));
                    c1255e.f4901L = 2;
                    break;
                case 36:
                    try {
                        c1255e.f4904O = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4904O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c1255e.f4904O) == -2) {
                            c1255e.f4904O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c1255e.f4906Q = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4906Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c1255e.f4906Q) == -2) {
                            c1255e.f4906Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c1255e.f4908S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c1255e.f4908S));
                    c1255e.f4902M = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            C1264n.m2948h(c1255e, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1255e.f4897H = obtainStyledAttributes.getFloat(index, c1255e.f4897H);
                            break;
                        case 46:
                            c1255e.f4898I = obtainStyledAttributes.getFloat(index, c1255e.f4898I);
                            break;
                        case 47:
                            c1255e.f4899J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1255e.f4900K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1255e.f4909T = obtainStyledAttributes.getDimensionPixelOffset(index, c1255e.f4909T);
                            break;
                        case 50:
                            c1255e.f4910U = obtainStyledAttributes.getDimensionPixelOffset(index, c1255e.f4910U);
                            break;
                        case 51:
                            c1255e.f4914Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c1255e.f4942n);
                            c1255e.f4942n = resourceId15;
                            if (resourceId15 == -1) {
                                c1255e.f4942n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c1255e.f4944o);
                            c1255e.f4944o = resourceId16;
                            if (resourceId16 == -1) {
                                c1255e.f4944o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c1255e.f4893D = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4893D);
                            break;
                        case 55:
                            c1255e.f4892C = obtainStyledAttributes.getDimensionPixelSize(index, c1255e.f4892C);
                            break;
                        default:
                            switch (i3) {
                                case 64:
                                    C1264n.m2947g(c1255e, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C1264n.m2947g(c1255e, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1255e.f4915Z = obtainStyledAttributes.getInt(index, c1255e.f4915Z);
                                    break;
                                case 67:
                                    c1255e.f4922d = obtainStyledAttributes.getBoolean(index, c1255e.f4922d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c1255e.m2932a();
        return c1255e;
    }

    public int getMaxHeight() {
        return this.f1845g;
    }

    public int getMaxWidth() {
        return this.f1844f;
    }

    public int getMinHeight() {
        return this.f1843e;
    }

    public int getMinWidth() {
        return this.f1842d;
    }

    public int getOptimizationLevel() {
        return this.f1841c.f4672D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C1204e c1204e = this.f1841c;
        if (c1204e.f4645j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c1204e.f4645j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c1204e.f4645j = "parent";
            }
        }
        if (c1204e.f4642h0 == null) {
            c1204e.f4642h0 = c1204e.f4645j;
            Log.v("ConstraintLayout", " setDebugName " + c1204e.f4642h0);
        }
        Iterator it = c1204e.f4681q0.iterator();
        while (it.hasNext()) {
            C1203d c1203d = (C1203d) it.next();
            View view = c1203d.f4638f0;
            if (view != null) {
                if (c1203d.f4645j == null && (id = view.getId()) != -1) {
                    c1203d.f4645j = getContext().getResources().getResourceEntryName(id);
                }
                if (c1203d.f4642h0 == null) {
                    c1203d.f4642h0 = c1203d.f4645j;
                    Log.v("ConstraintLayout", " setDebugName " + c1203d.f4642h0);
                }
            }
        }
        c1204e.mo2821n(sb);
        return sb.toString();
    }

    /* renamed from: h */
    public final C1203d m1449h(View view) {
        if (view == this) {
            return this.f1841c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1255e) {
            return ((C1255e) view.getLayoutParams()).f4947p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1255e) {
            return ((C1255e) view.getLayoutParams()).f4947p0;
        }
        return null;
    }

    /* renamed from: i */
    public final void m1450i(AttributeSet attributeSet, int i2) {
        C1204e c1204e = this.f1841c;
        c1204e.f4638f0 = this;
        C1256f c1256f = this.f1853o;
        c1204e.f4685u0 = c1256f;
        c1204e.f4683s0.f4784f = c1256f;
        this.f1839a.put(getId(), this);
        this.f1848j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1267q.f5092b, i2, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.f1842d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1842d);
                } else if (index == 17) {
                    this.f1843e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1843e);
                } else if (index == 14) {
                    this.f1844f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1844f);
                } else if (index == 15) {
                    this.f1845g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1845g);
                } else if (index == 113) {
                    this.f1847i = obtainStyledAttributes.getInt(index, this.f1847i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m1451j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1849k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1264n c1264n = new C1264n();
                        this.f1848j = c1264n;
                        c1264n.m2951e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1848j = null;
                    }
                    this.f1850l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c1204e.f4672D0 = this.f1847i;
        C1179c.f4483p = c1204e.m2837W(512);
    }

    /* renamed from: j */
    public final void m1451j(int i2) {
        int eventType;
        C0056A c0056a;
        Context context = getContext();
        C0019i c0019i = new C0019i(22, false);
        c0019i.f47b = new SparseArray();
        c0019i.f48c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            eventType = xml.getEventType();
            c0056a = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1849k = c0019i;
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 2) {
                    c0056a = new C0056A(context, xml);
                    ((SparseArray) c0019i.f47b).put(c0056a.f135a, c0056a);
                } else if (c2 == 3) {
                    C1257g c1257g = new C1257g(context, xml);
                    if (c0056a != null) {
                        ((ArrayList) c0056a.f137c).add(c1257g);
                    }
                } else if (c2 == 4) {
                    c0019i.m55F(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0338  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1452k(p113s.C1204e r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1452k(s.e, int, int, int):void");
    }

    /* renamed from: l */
    public final void m1453l(C1203d c1203d, C1255e c1255e, SparseArray sparseArray, int i2, int i3) {
        View view = (View) this.f1839a.get(i2);
        C1203d c1203d2 = (C1203d) sparseArray.get(i2);
        if (c1203d2 == null || view == null || !(view.getLayoutParams() instanceof C1255e)) {
            return;
        }
        c1255e.f4921c0 = true;
        if (i3 == 6) {
            C1255e c1255e2 = (C1255e) view.getLayoutParams();
            c1255e2.f4921c0 = true;
            c1255e2.f4947p0.f4605E = true;
        }
        c1203d.mo2816i(6).m2782b(c1203d2.mo2816i(i3), c1255e.f4893D, c1255e.f4892C, true);
        c1203d.f4605E = true;
        c1203d.mo2816i(3).m2790j();
        c1203d.mo2816i(5).m2790j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C1255e c1255e = (C1255e) childAt.getLayoutParams();
            C1203d c1203d = c1255e.f4947p0;
            if (childAt.getVisibility() != 8 || c1255e.f4923d0 || c1255e.f4925e0 || isInEditMode) {
                int m2823r = c1203d.m2823r();
                int m2824s = c1203d.m2824s();
                childAt.layout(m2823r, m2824s, c1203d.m2822q() + m2823r, c1203d.m2818k() + m2824s);
            }
        }
        ArrayList arrayList = this.f1840b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC1253c) arrayList.get(i7)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:281:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0349  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1203d m1449h = m1449h(view);
        if ((view instanceof Guideline) && !(m1449h instanceof C1207h)) {
            C1255e c1255e = (C1255e) view.getLayoutParams();
            C1207h c1207h = new C1207h();
            c1255e.f4947p0 = c1207h;
            c1255e.f4923d0 = true;
            c1207h.m2849S(c1255e.f4911V);
        }
        if (view instanceof AbstractC1253c) {
            AbstractC1253c abstractC1253c = (AbstractC1253c) view;
            abstractC1253c.m2931i();
            ((C1255e) view.getLayoutParams()).f4925e0 = true;
            ArrayList arrayList = this.f1840b;
            if (!arrayList.contains(abstractC1253c)) {
                arrayList.add(abstractC1253c);
            }
        }
        this.f1839a.put(view.getId(), view);
        this.f1846h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1839a.remove(view.getId());
        C1203d m1449h = m1449h(view);
        this.f1841c.f4681q0.remove(m1449h);
        m1449h.mo2797C();
        this.f1840b.remove(view);
        this.f1846h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1846h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1264n c1264n) {
        this.f1848j = c1264n;
    }

    @Override // android.view.View
    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.f1839a;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f1845g) {
            return;
        }
        this.f1845g = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f1844f) {
            return;
        }
        this.f1844f = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f1843e) {
            return;
        }
        this.f1843e = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f1842d) {
            return;
        }
        this.f1842d = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1265o abstractC1265o) {
        C0019i c0019i = this.f1849k;
        if (c0019i != null) {
            c0019i.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f1847i = i2;
        C1204e c1204e = this.f1841c;
        c1204e.f4672D0 = i2;
        C1179c.f4483p = c1204e.m2837W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1839a = new SparseArray();
        this.f1840b = new ArrayList(4);
        this.f1841c = new C1204e();
        this.f1842d = 0;
        this.f1843e = 0;
        this.f1844f = Integer.MAX_VALUE;
        this.f1845g = Integer.MAX_VALUE;
        this.f1846h = true;
        this.f1847i = 257;
        this.f1848j = null;
        this.f1849k = null;
        this.f1850l = -1;
        this.f1851m = new HashMap();
        this.f1852n = new SparseArray();
        this.f1853o = new C1256f(this, this);
        this.f1854p = 0;
        this.f1855q = 0;
        m1450i(attributeSet, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1255e c1255e = new C1255e(layoutParams);
        c1255e.f4916a = -1;
        c1255e.f4918b = -1;
        c1255e.f4920c = -1.0f;
        c1255e.f4922d = true;
        c1255e.f4924e = -1;
        c1255e.f4926f = -1;
        c1255e.f4928g = -1;
        c1255e.f4930h = -1;
        c1255e.f4932i = -1;
        c1255e.f4934j = -1;
        c1255e.f4936k = -1;
        c1255e.f4938l = -1;
        c1255e.f4940m = -1;
        c1255e.f4942n = -1;
        c1255e.f4944o = -1;
        c1255e.f4946p = -1;
        c1255e.f4948q = 0;
        c1255e.f4949r = 0.0f;
        c1255e.f4950s = -1;
        c1255e.f4951t = -1;
        c1255e.f4952u = -1;
        c1255e.f4953v = -1;
        c1255e.f4954w = Integer.MIN_VALUE;
        c1255e.f4955x = Integer.MIN_VALUE;
        c1255e.f4956y = Integer.MIN_VALUE;
        c1255e.f4957z = Integer.MIN_VALUE;
        c1255e.f4890A = Integer.MIN_VALUE;
        c1255e.f4891B = Integer.MIN_VALUE;
        c1255e.f4892C = Integer.MIN_VALUE;
        c1255e.f4893D = 0;
        c1255e.f4894E = 0.5f;
        c1255e.f4895F = 0.5f;
        c1255e.f4896G = null;
        c1255e.f4897H = -1.0f;
        c1255e.f4898I = -1.0f;
        c1255e.f4899J = 0;
        c1255e.f4900K = 0;
        c1255e.f4901L = 0;
        c1255e.f4902M = 0;
        c1255e.f4903N = 0;
        c1255e.f4904O = 0;
        c1255e.f4905P = 0;
        c1255e.f4906Q = 0;
        c1255e.f4907R = 1.0f;
        c1255e.f4908S = 1.0f;
        c1255e.f4909T = -1;
        c1255e.f4910U = -1;
        c1255e.f4911V = -1;
        c1255e.f4912W = false;
        c1255e.f4913X = false;
        c1255e.f4914Y = null;
        c1255e.f4915Z = 0;
        c1255e.f4917a0 = true;
        c1255e.f4919b0 = true;
        c1255e.f4921c0 = false;
        c1255e.f4923d0 = false;
        c1255e.f4925e0 = false;
        c1255e.f4927f0 = -1;
        c1255e.f4929g0 = -1;
        c1255e.f4931h0 = -1;
        c1255e.f4933i0 = -1;
        c1255e.f4935j0 = Integer.MIN_VALUE;
        c1255e.f4937k0 = Integer.MIN_VALUE;
        c1255e.f4939l0 = 0.5f;
        c1255e.f4947p0 = new C1203d();
        return c1255e;
    }
}
