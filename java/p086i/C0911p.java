package p086i;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p083h.InterfaceC0874b;

/* renamed from: i.p */
/* loaded from: classes.dex */
public final class C0911p extends FrameLayout implements InterfaceC0874b {

    /* renamed from: a */
    public final CollapsibleActionView f3722a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0911p(View view) {
        super(view.getContext());
        this.f3722a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p083h.InterfaceC0874b
    /* renamed from: a */
    public final void mo1404a() {
        this.f3722a.onActionViewExpanded();
    }

    @Override // p083h.InterfaceC0874b
    /* renamed from: d */
    public final void mo1405d() {
        this.f3722a.onActionViewCollapsed();
    }
}
