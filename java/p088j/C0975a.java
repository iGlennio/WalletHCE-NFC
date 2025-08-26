package p088j;

import androidx.appcompat.widget.ActionBarContextView;
import p027K.InterfaceC0279X;

/* renamed from: j.a */
/* loaded from: classes.dex */
public final class C0975a implements InterfaceC0279X {

    /* renamed from: a */
    public boolean f3884a = false;

    /* renamed from: b */
    public int f3885b;

    /* renamed from: c */
    public final /* synthetic */ ActionBarContextView f3886c;

    public C0975a(ActionBarContextView actionBarContextView) {
        this.f3886c = actionBarContextView;
    }

    @Override // p027K.InterfaceC0279X
    /* renamed from: a */
    public final void mo844a() {
        if (this.f3884a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f3886c;
        actionBarContextView.f1669f = null;
        super/*android.view.View*/.setVisibility(this.f3885b);
    }

    @Override // p027K.InterfaceC0279X
    /* renamed from: b */
    public final void mo367b() {
        this.f3884a = true;
    }

    @Override // p027K.InterfaceC0279X
    /* renamed from: c */
    public final void mo368c() {
        super/*android.view.View*/.setVisibility(0);
        this.f3884a = false;
    }
}
