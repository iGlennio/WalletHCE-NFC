package p027K;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.nfupay.s145.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p030L.C0337d;
import p030L.InterfaceC0352s;
import p045Q.C0451r;
import p088j.C1041w;

/* renamed from: K.P */
/* loaded from: classes.dex */
public abstract class AbstractC0272P {

    /* renamed from: a */
    public static WeakHashMap f768a = null;

    /* renamed from: b */
    public static Field f769b = null;

    /* renamed from: c */
    public static boolean f770c = false;

    /* renamed from: d */
    public static final int[] f771d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e */
    public static final C0329y f772e = new C0329y();

    /* renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0257A f773f = new ViewTreeObserverOnGlobalLayoutListenerC0257A();

    /* renamed from: a */
    public static C0278W m811a(View view) {
        if (f768a == null) {
            f768a = new WeakHashMap();
        }
        C0278W c0278w = (C0278W) f768a.get(view);
        if (c0278w != null) {
            return c0278w;
        }
        C0278W c0278w2 = new C0278W(view);
        f768a.put(view, c0278w2);
        return c0278w2;
    }

    /* renamed from: b */
    public static void m812b(View view, C0319s0 c0319s0) {
        WindowInsets m941f = c0319s0.m941f();
        if (m941f != null) {
            WindowInsets m737a = AbstractC0259C.m737a(view, m941f);
            if (m737a.equals(m941f)) {
                return;
            }
            C0319s0.m936g(view, m737a);
        }
    }

    /* renamed from: c */
    public static boolean m813c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0271O.f764d;
        C0271O c0271o = (C0271O) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0271o == null) {
            c0271o = new C0271O();
            c0271o.f765a = null;
            c0271o.f766b = null;
            c0271o.f767c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0271o);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0271o.f765a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0271O.f764d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c0271o.f765a == null) {
                            c0271o.f765a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C0271O.f764d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c0271o.f765a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c0271o.f765a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View m810a = c0271o.m810a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m810a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0271o.f766b == null) {
                    c0271o.f766b = new SparseArray();
                }
                c0271o.f766b.put(keyCode, new WeakReference(m810a));
            }
        }
        return m810a != null;
    }

    /* renamed from: d */
    public static View.AccessibilityDelegate m814d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0266J.m796a(view);
        }
        if (f770c) {
            return null;
        }
        if (f769b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f769b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f770c = true;
                return null;
            }
        }
        try {
            Object obj = f769b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f770c = true;
            return null;
        }
    }

    /* renamed from: e */
    public static CharSequence m815e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC0265I.m787b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* renamed from: f */
    public static ArrayList m816f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: g */
    public static String[] m817g(C1041w c1041w) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0268L.m807a(c1041w) : (String[]) c1041w.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: h */
    public static void m818h(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = m815e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                if (z2) {
                    obtain.getText().add(m815e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i2);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(m815e(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static C0292f m819i(View view, C0292f c0292f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0292f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0268L.m808b(view, c0292f);
        }
        InterfaceC0316r interfaceC0316r = (InterfaceC0316r) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0318s interfaceC0318s = f772e;
        if (interfaceC0316r == null) {
            if (view instanceof InterfaceC0318s) {
                interfaceC0318s = (InterfaceC0318s) view;
            }
            return interfaceC0318s.mo934a(c0292f);
        }
        C0292f m1161a = ((C0451r) interfaceC0316r).m1161a(view, c0292f);
        if (m1161a == null) {
            return null;
        }
        if (view instanceof InterfaceC0318s) {
            interfaceC0318s = (InterfaceC0318s) view;
        }
        return interfaceC0318s.mo934a(m1161a);
    }

    /* renamed from: j */
    public static void m820j(View view, int i2) {
        ArrayList m816f = m816f(view);
        for (int i3 = 0; i3 < m816f.size(); i3++) {
            if (((C0337d) m816f.get(i3)).m961a() == i2) {
                m816f.remove(i3);
                return;
            }
        }
    }

    /* renamed from: k */
    public static void m821k(View view, C0337d c0337d, InterfaceC0352s interfaceC0352s) {
        if (interfaceC0352s == null) {
            m820j(view, c0337d.m961a());
            m818h(view, 0);
            return;
        }
        C0337d c0337d2 = new C0337d(null, c0337d.f888b, null, interfaceC0352s, c0337d.f889c);
        View.AccessibilityDelegate m814d = m814d(view);
        C0284b c0284b = m814d == null ? null : m814d instanceof C0282a ? ((C0282a) m814d).f781a : new C0284b(m814d);
        if (c0284b == null) {
            c0284b = new C0284b();
        }
        m823m(view, c0284b);
        m820j(view, c0337d2.m961a());
        m816f(view).add(c0337d2);
        m818h(view, 0);
    }

    /* renamed from: l */
    public static void m822l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0266J.m799d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    /* renamed from: m */
    public static void m823m(View view, C0284b c0284b) {
        if (c0284b == null && (m814d(view) instanceof C0282a)) {
            c0284b = new C0284b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0284b == null ? null : c0284b.f786b);
    }

    /* renamed from: n */
    public static void m824n(View view, CharSequence charSequence) {
        new C0330z(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m735d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0257A viewTreeObserverOnGlobalLayoutListenerC0257A = f773f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0257A.f755a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0257A);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0257A);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0257A.f755a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0257A);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0257A);
            }
        }
    }
}
