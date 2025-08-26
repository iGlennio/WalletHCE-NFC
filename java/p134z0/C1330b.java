package p134z0;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.nfupay.s145.R;
import java.util.ArrayList;
import p030L.C0337d;
import p030L.C0342i;
import p052T.AbstractC0480b;

/* renamed from: z0.b */
/* loaded from: classes.dex */
public final class C1330b extends AbstractC0480b {

    /* renamed from: q */
    public final /* synthetic */ Chip f5438q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1330b(Chip chip, Chip chip2) {
        super(chip2);
        this.f5438q = chip;
    }

    @Override // p052T.AbstractC0480b
    /* renamed from: l */
    public final void mo1234l(ArrayList arrayList) {
        C1332d c1332d;
        arrayList.add(0);
        Rect rect = Chip.f2599w;
        Chip chip = this.f5438q;
        if (!chip.m1940c() || (c1332d = chip.f2602e) == null || !c1332d.f5456K || chip.f2605h == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p052T.AbstractC0480b
    /* renamed from: o */
    public final void mo1237o(int i2, C0342i c0342i) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = c0342i.f893a;
        if (i2 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f2599w);
            return;
        }
        Chip chip = this.f5438q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
        accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
        c0342i.m990b(C0337d.f879g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
