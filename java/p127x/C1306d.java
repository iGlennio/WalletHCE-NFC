package p127x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p124w.AbstractC1295a;

/* renamed from: x.d */
/* loaded from: classes.dex */
public final class C1306d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC1303a f5345a;

    /* renamed from: b */
    public boolean f5346b;

    /* renamed from: c */
    public final int f5347c;

    /* renamed from: d */
    public final int f5348d;

    /* renamed from: e */
    public final int f5349e;

    /* renamed from: f */
    public final int f5350f;

    /* renamed from: g */
    public final int f5351g;

    /* renamed from: h */
    public int f5352h;

    /* renamed from: i */
    public int f5353i;

    /* renamed from: j */
    public int f5354j;

    /* renamed from: k */
    public View f5355k;

    /* renamed from: l */
    public View f5356l;

    /* renamed from: m */
    public boolean f5357m;

    /* renamed from: n */
    public boolean f5358n;

    /* renamed from: o */
    public final Rect f5359o;

    public C1306d() {
        super(-2, -2);
        this.f5346b = false;
        this.f5347c = 0;
        this.f5348d = 0;
        this.f5349e = -1;
        this.f5350f = -1;
        this.f5351g = 0;
        this.f5352h = 0;
        this.f5359o = new Rect();
    }

    /* renamed from: a */
    public final boolean m3018a(int i2) {
        if (i2 == 0) {
            return this.f5357m;
        }
        if (i2 != 1) {
            return false;
        }
        return this.f5358n;
    }

    public C1306d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC1303a abstractC1303a;
        this.f5346b = false;
        this.f5347c = 0;
        this.f5348d = 0;
        this.f5349e = -1;
        this.f5350f = -1;
        this.f5351g = 0;
        this.f5352h = 0;
        this.f5359o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1295a.f5307b);
        this.f5347c = obtainStyledAttributes.getInteger(0, 0);
        this.f5350f = obtainStyledAttributes.getResourceId(1, -1);
        this.f5348d = obtainStyledAttributes.getInteger(2, 0);
        this.f5349e = obtainStyledAttributes.getInteger(6, -1);
        this.f5351g = obtainStyledAttributes.getInt(5, 0);
        this.f5352h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f5346b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1857t;
            if (TextUtils.isEmpty(string)) {
                abstractC1303a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1857t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1859v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1858u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC1303a = (AbstractC1303a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f5345a = abstractC1303a;
        }
        obtainStyledAttributes.recycle();
        AbstractC1303a abstractC1303a2 = this.f5345a;
        if (abstractC1303a2 != null) {
            abstractC1303a2.mo1916g(this);
        }
    }

    public C1306d(C1306d c1306d) {
        super((ViewGroup.MarginLayoutParams) c1306d);
        this.f5346b = false;
        this.f5347c = 0;
        this.f5348d = 0;
        this.f5349e = -1;
        this.f5350f = -1;
        this.f5351g = 0;
        this.f5352h = 0;
        this.f5359o = new Rect();
    }

    public C1306d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5346b = false;
        this.f5347c = 0;
        this.f5348d = 0;
        this.f5349e = -1;
        this.f5350f = -1;
        this.f5351g = 0;
        this.f5352h = 0;
        this.f5359o = new Rect();
    }

    public C1306d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5346b = false;
        this.f5347c = 0;
        this.f5348d = 0;
        this.f5349e = -1;
        this.f5350f = -1;
        this.f5351g = 0;
        this.f5352h = 0;
        this.f5359o = new Rect();
    }
}
