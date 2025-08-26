package p014F0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.C0709j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.nfupay.s145.R;
import p027K.C0284b;
import p030L.C0341h;
import p030L.C0342i;

/* renamed from: F0.a */
/* loaded from: classes.dex */
public final class C0133a extends C0284b {

    /* renamed from: d */
    public final /* synthetic */ int f359d;

    /* renamed from: e */
    public final /* synthetic */ Object f360e;

    public /* synthetic */ C0133a(int i2, Object obj) {
        this.f359d = i2;
        this.f360e = obj;
    }

    @Override // p027K.C0284b
    /* renamed from: c */
    public void mo458c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f359d) {
            case 0:
                super.mo458c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f360e).f2729d);
                break;
            default:
                super.mo458c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p027K.C0284b
    /* renamed from: d */
    public final void mo459d(View view, C0342i c0342i) {
        int i2;
        Object obj = this.f360e;
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        switch (this.f359d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c0342i.f893a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f2730e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f2729d);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0342i.f893a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f2741x);
                break;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0342i.f893a);
                C0709j c0709j = (C0709j) obj;
                c0342i.m998k(c0709j.f2656c0.getVisibility() == 0 ? c0709j.m1671w().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : c0709j.m1671w().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c0342i.f893a);
                int i3 = MaterialButtonToggleGroup.f2585k;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    i2 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            c0342i.m997j(C0341h.m987a(0, 1, i2, 1, false, ((MaterialButton) view).f2582o));
                            break;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.m1929c(i4)) {
                                i2++;
                            }
                        }
                    }
                }
                i2 = -1;
                c0342i.m997j(C0341h.m987a(0, 1, i2, 1, false, ((MaterialButton) view).f2582o));
                break;
        }
    }
}
