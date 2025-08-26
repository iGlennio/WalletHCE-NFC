package p005C;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0615E;
import java.util.Iterator;
import p095l1.AbstractC1136c;
import p107q.AbstractC1181e;

/* renamed from: C.g */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0044g {
    /* renamed from: a */
    public static final void m149a(View view, int i2) {
        int m2740a = AbstractC1181e.m2740a(i2);
        if (m2740a == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (C0615E.m1556E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (m2740a == 1) {
            if (C0615E.m1556E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (m2740a == 2) {
            if (C0615E.m1556E(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (m2740a != 3) {
            return;
        }
        if (C0615E.m1556E(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* renamed from: b */
    public static int m150b(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 4) {
            return 4;
        }
        if (i2 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(m153e("Unknown visibility ", i2));
    }

    /* renamed from: c */
    public static int m151c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return m150b(view.getVisibility());
    }

    /* renamed from: d */
    public static ClassCastException m152d(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* renamed from: e */
    public static String m153e(String str, int i2) {
        return str + i2;
    }

    /* renamed from: f */
    public static String m154f(String str, String str2) {
        return str + str2;
    }

    /* renamed from: g */
    public static String m155g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: h */
    public static StringBuilder m156h(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* renamed from: i */
    public static /* synthetic */ void m157i(int i2) {
        if (i2 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        AbstractC1136c.m2639g(nullPointerException, AbstractC1136c.class.getName());
        throw nullPointerException;
    }

    /* renamed from: j */
    public static /* synthetic */ void m158j(String str, int i2) {
        if (i2 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1136c.class.getName();
            int i3 = 0;
            while (!stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            while (stackTrace[i3].getClassName().equals(name)) {
                i3++;
            }
            StackTraceElement stackTraceElement = stackTrace[i3];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            AbstractC1136c.m2639g(nullPointerException, AbstractC1136c.class.getName());
            throw nullPointerException;
        }
    }

    /* renamed from: k */
    public static /* synthetic */ String m159k(int i2) {
        switch (i2) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* renamed from: l */
    public static /* synthetic */ String m160l(int i2) {
        switch (i2) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* renamed from: m */
    public static /* synthetic */ String m161m(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    /* renamed from: n */
    public static /* synthetic */ String m162n(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
