package p121v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p107q.AbstractC1181e;

/* renamed from: v.b */
/* loaded from: classes.dex */
public final class C1252b {

    /* renamed from: a */
    public boolean f4875a = false;

    /* renamed from: b */
    public int f4876b;

    /* renamed from: c */
    public int f4877c;

    /* renamed from: d */
    public float f4878d;

    /* renamed from: e */
    public String f4879e;

    /* renamed from: f */
    public boolean f4880f;

    /* renamed from: g */
    public int f4881g;

    public C1252b(C1252b c1252b, Object obj) {
        c1252b.getClass();
        this.f4876b = c1252b.f4876b;
        m2923b(obj);
    }

    /* renamed from: a */
    public static void m2922a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1267q.f5094d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i2 = 0;
        boolean z2 = false;
        Object obj = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            int i4 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                int i5 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i5 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i5 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i2 = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i4 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i2 = i4;
                            }
                        }
                        i2 = 7;
                    }
                }
                i2 = i5;
            }
        }
        if (str != null && obj != null) {
            C1252b c1252b = new C1252b();
            c1252b.f4876b = i2;
            c1252b.f4875a = z2;
            c1252b.m2923b(obj);
            hashMap.put(str, c1252b);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m2923b(Object obj) {
        switch (AbstractC1181e.m2740a(this.f4876b)) {
            case 0:
            case 7:
                this.f4877c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f4878d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f4881g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f4879e = (String) obj;
                break;
            case 5:
                this.f4880f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f4878d = ((Float) obj).floatValue();
                break;
        }
    }
}
