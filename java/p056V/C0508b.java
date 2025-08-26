package p056V;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p005C.C0046i;
import p027K.AbstractC0272P;
import p027K.C0284b;
import p030L.C0337d;
import p030L.C0342i;
import p079f0.C0818N;
import p079f0.C0828Y;

/* renamed from: V.b */
/* loaded from: classes.dex */
public final class C0508b extends C0284b {

    /* renamed from: d */
    public final /* synthetic */ int f1385d;

    /* renamed from: e */
    public final Object f1386e;

    /* renamed from: f */
    public final Object f1387f;

    public C0508b(C0828Y c0828y) {
        this.f1385d = 1;
        this.f1387f = new WeakHashMap();
        this.f1386e = c0828y;
    }

    @Override // p027K.C0284b
    /* renamed from: a */
    public final boolean mo846a(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        Object obj = this.f1387f;
        switch (this.f1385d) {
            case 0:
                if (accessibilityEvent.getEventType() != 32) {
                    break;
                } else {
                    accessibilityEvent.getText();
                    DrawerLayout drawerLayout = (DrawerLayout) obj;
                    View m1497f = drawerLayout.m1497f();
                    if (m1497f != null) {
                        int m1499h = drawerLayout.m1499h(m1497f);
                        drawerLayout.getClass();
                        WeakHashMap weakHashMap = AbstractC0272P.f768a;
                        Gravity.getAbsoluteGravity(m1499h, drawerLayout.getLayoutDirection());
                        break;
                    }
                }
                break;
            default:
                C0284b c0284b = (C0284b) ((WeakHashMap) obj).get(view);
                if (c0284b == null) {
                    break;
                } else {
                    break;
                }
        }
        return accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p027K.C0284b
    /* renamed from: b */
    public C0046i mo847b(View view) {
        switch (this.f1385d) {
            case 1:
                C0284b c0284b = (C0284b) ((WeakHashMap) this.f1387f).get(view);
                if (c0284b == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.mo847b(view);
    }

    @Override // p027K.C0284b
    /* renamed from: c */
    public final void mo458c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1385d) {
            case 0:
                super.mo458c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                C0284b c0284b = (C0284b) ((WeakHashMap) this.f1387f).get(view);
                if (c0284b == null) {
                    super.mo458c(view, accessibilityEvent);
                    break;
                } else {
                    c0284b.mo458c(view, accessibilityEvent);
                    break;
                }
        }
    }

    @Override // p027K.C0284b
    /* renamed from: d */
    public final void mo459d(View view, C0342i c0342i) {
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        Object obj = this.f1386e;
        switch (this.f1385d) {
            case 0:
                boolean z2 = DrawerLayout.f1930F;
                AccessibilityNodeInfo accessibilityNodeInfo = c0342i.f893a;
                if (z2) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                } else {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                    c0342i.f894b = -1;
                    accessibilityNodeInfo.setSource(view);
                    WeakHashMap weakHashMap = AbstractC0272P.f768a;
                    Object parentForAccessibility = view.getParentForAccessibility();
                    if (parentForAccessibility instanceof View) {
                        accessibilityNodeInfo.setParent((View) parentForAccessibility);
                    }
                    Rect rect = (Rect) obj;
                    obtain.getBoundsInScreen(rect);
                    accessibilityNodeInfo.setBoundsInScreen(rect);
                    accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                    accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                    c0342i.m996i(obtain.getClassName());
                    accessibilityNodeInfo.setContentDescription(obtain.getContentDescription());
                    accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                    accessibilityNodeInfo.setFocused(obtain.isFocused());
                    accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
                    accessibilityNodeInfo.setSelected(obtain.isSelected());
                    c0342i.m989a(obtain.getActions());
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (DrawerLayout.m1488i(childAt)) {
                            accessibilityNodeInfo.addChild(childAt);
                        }
                    }
                }
                c0342i.m996i("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo.setFocusable(false);
                accessibilityNodeInfo.setFocused(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0337d.f877e.f887a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0337d.f878f.f887a);
                break;
            default:
                C0828Y c0828y = (C0828Y) obj;
                boolean m1810K = c0828y.f3298d.m1810K();
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0342i.f893a;
                if (!m1810K) {
                    RecyclerView recyclerView = c0828y.f3298d;
                    if (recyclerView.getLayoutManager() != null) {
                        recyclerView.getLayoutManager().m2180U(view, c0342i);
                        C0284b c0284b = (C0284b) ((WeakHashMap) this.f1387f).get(view);
                        if (c0284b != null) {
                            c0284b.mo459d(view, c0342i);
                            break;
                        } else {
                            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                            break;
                        }
                    }
                }
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                break;
        }
    }

    @Override // p027K.C0284b
    /* renamed from: e */
    public void mo848e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1385d) {
            case 1:
                C0284b c0284b = (C0284b) ((WeakHashMap) this.f1387f).get(view);
                if (c0284b == null) {
                    super.mo848e(view, accessibilityEvent);
                    break;
                } else {
                    c0284b.mo848e(view, accessibilityEvent);
                    break;
                }
            default:
                super.mo848e(view, accessibilityEvent);
                break;
        }
    }

    @Override // p027K.C0284b
    /* renamed from: f */
    public final boolean mo849f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1385d) {
            case 0:
                if (DrawerLayout.f1930F || DrawerLayout.m1488i(view)) {
                    break;
                }
                break;
            default:
                C0284b c0284b = (C0284b) ((WeakHashMap) this.f1387f).get(viewGroup);
                if (c0284b == null) {
                    break;
                } else {
                    break;
                }
        }
        return this.f785a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p027K.C0284b
    /* renamed from: g */
    public boolean mo850g(View view, int i2, Bundle bundle) {
        switch (this.f1385d) {
            case 1:
                C0828Y c0828y = (C0828Y) this.f1386e;
                if (!c0828y.f3298d.m1810K()) {
                    RecyclerView recyclerView = c0828y.f3298d;
                    if (recyclerView.getLayoutManager() != null) {
                        C0284b c0284b = (C0284b) ((WeakHashMap) this.f1387f).get(view);
                        if (c0284b == null ? !super.mo850g(view, i2, bundle) : !c0284b.mo850g(view, i2, bundle)) {
                            C0818N c0818n = recyclerView.getLayoutManager().f3217b.f2398b;
                            break;
                        }
                    }
                }
                break;
        }
        return super.mo850g(view, i2, bundle);
    }

    @Override // p027K.C0284b
    /* renamed from: h */
    public void mo851h(View view, int i2) {
        switch (this.f1385d) {
            case 1:
                C0284b c0284b = (C0284b) ((WeakHashMap) this.f1387f).get(view);
                if (c0284b == null) {
                    super.mo851h(view, i2);
                    break;
                } else {
                    c0284b.mo851h(view, i2);
                    break;
                }
            default:
                super.mo851h(view, i2);
                break;
        }
    }

    @Override // p027K.C0284b
    /* renamed from: i */
    public void mo852i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f1385d) {
            case 1:
                C0284b c0284b = (C0284b) ((WeakHashMap) this.f1387f).get(view);
                if (c0284b == null) {
                    super.mo852i(view, accessibilityEvent);
                    break;
                } else {
                    c0284b.mo852i(view, accessibilityEvent);
                    break;
                }
            default:
                super.mo852i(view, accessibilityEvent);
                break;
        }
    }

    public C0508b(DrawerLayout drawerLayout) {
        this.f1385d = 0;
        this.f1387f = drawerLayout;
        this.f1386e = new Rect();
    }
}
