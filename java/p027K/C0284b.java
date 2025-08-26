package p027K;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.nfupay.s145.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p005C.C0046i;
import p030L.C0337d;
import p030L.C0342i;
import p030L.InterfaceC0352s;

/* renamed from: K.b */
/* loaded from: classes.dex */
public class C0284b {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f784c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f785a;

    /* renamed from: b */
    public final C0282a f786b;

    public C0284b() {
        this(f784c);
    }

    /* renamed from: a */
    public boolean mo846a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f785a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0046i mo847b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f785a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0046i(4, accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo458c(View view, AccessibilityEvent accessibilityEvent) {
        this.f785a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo459d(View view, C0342i c0342i) {
        this.f785a.onInitializeAccessibilityNodeInfo(view, c0342i.f893a);
    }

    /* renamed from: e */
    public void mo848e(View view, AccessibilityEvent accessibilityEvent) {
        this.f785a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo849f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f785a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo850g(View view, int i2, Bundle bundle) {
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= list.size()) {
                break;
            }
            C0337d c0337d = (C0337d) list.get(i3);
            if (c0337d.m961a() == i2) {
                InterfaceC0352s interfaceC0352s = c0337d.f890d;
                if (interfaceC0352s != null) {
                    Class cls = c0337d.f889c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e2) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                        }
                    }
                    z2 = interfaceC0352s.mo172h(view);
                }
            } else {
                i3++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.f785a.performAccessibilityAction(view, i2, bundle);
        }
        if (z2 || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z2;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                }
                i5++;
            }
        }
        return z3;
    }

    /* renamed from: h */
    public void mo851h(View view, int i2) {
        this.f785a.sendAccessibilityEvent(view, i2);
    }

    /* renamed from: i */
    public void mo852i(View view, AccessibilityEvent accessibilityEvent) {
        this.f785a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0284b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f785a = accessibilityDelegate;
        this.f786b = new C0282a(this);
    }
}
