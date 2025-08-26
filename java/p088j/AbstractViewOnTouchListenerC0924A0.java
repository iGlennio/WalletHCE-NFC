package p088j;

import android.view.View;
import android.view.ViewConfiguration;
import p086i.InterfaceC0893C;

/* renamed from: j.A0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0924A0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f3746a;

    /* renamed from: b */
    public final int f3747b;

    /* renamed from: c */
    public final int f3748c;

    /* renamed from: d */
    public final View f3749d;

    /* renamed from: e */
    public RunnableC1051z0 f3750e;

    /* renamed from: f */
    public RunnableC1051z0 f3751f;

    /* renamed from: g */
    public boolean f3752g;

    /* renamed from: h */
    public int f3753h;

    /* renamed from: i */
    public final int[] f3754i = new int[2];

    public AbstractViewOnTouchListenerC0924A0(View view) {
        this.f3749d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3746a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3747b = tapTimeout;
        this.f3748c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m2375a() {
        RunnableC1051z0 runnableC1051z0 = this.f3751f;
        View view = this.f3749d;
        if (runnableC1051z0 != null) {
            view.removeCallbacks(runnableC1051z0);
        }
        RunnableC1051z0 runnableC1051z02 = this.f3750e;
        if (runnableC1051z02 != null) {
            view.removeCallbacks(runnableC1051z02);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC0893C mo2329b();

    /* renamed from: c */
    public abstract boolean mo2330c();

    /* renamed from: d */
    public boolean mo2331d() {
        InterfaceC0893C mo2329b = mo2329b();
        if (mo2329b == null || !mo2329b.mo2308b()) {
            return true;
        }
        mo2329b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j.AbstractViewOnTouchListenerC0924A0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3752g = false;
        this.f3753h = -1;
        RunnableC1051z0 runnableC1051z0 = this.f3750e;
        if (runnableC1051z0 != null) {
            this.f3749d.removeCallbacks(runnableC1051z0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
