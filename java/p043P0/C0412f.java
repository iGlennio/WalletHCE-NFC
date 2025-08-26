package p043P0;

import com.google.android.material.internal.CheckableImageButton;
import p010D1.AbstractC0096d;

/* renamed from: P0.f */
/* loaded from: classes.dex */
public final class C0412f extends AbstractC0423q {

    /* renamed from: e */
    public final /* synthetic */ int f1086e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0412f(C0422p c0422p, int i2) {
        super(c0422p);
        this.f1086e = i2;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: r */
    public void mo1072r() {
        switch (this.f1086e) {
            case 0:
                C0422p c0422p = this.f1137b;
                c0422p.f1128o = null;
                CheckableImageButton checkableImageButton = c0422p.f1120g;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0096d.m340c0(checkableImageButton, null);
                break;
        }
    }
}
