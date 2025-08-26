package p014F0;

import android.view.View;
import java.util.WeakHashMap;
import p027K.AbstractC0259C;
import p027K.AbstractC0272P;

/* renamed from: F0.H */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0131H implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        AbstractC0259C.m739c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
