package p043P0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.nfupay.s145.R;
import p014F0.RunnableC0130G;
import p047Q1.AbstractC0458e;
import p111r0.AbstractC1188a;

/* renamed from: P0.e */
/* loaded from: classes.dex */
public final class C0411e extends AbstractC0423q {

    /* renamed from: e */
    public final int f1077e;

    /* renamed from: f */
    public final int f1078f;

    /* renamed from: g */
    public final TimeInterpolator f1079g;

    /* renamed from: h */
    public final TimeInterpolator f1080h;

    /* renamed from: i */
    public EditText f1081i;

    /* renamed from: j */
    public final ViewOnClickListenerC0407a f1082j;

    /* renamed from: k */
    public final ViewOnFocusChangeListenerC0408b f1083k;

    /* renamed from: l */
    public AnimatorSet f1084l;

    /* renamed from: m */
    public ValueAnimator f1085m;

    public C0411e(C0422p c0422p) {
        super(c0422p);
        this.f1082j = new ViewOnClickListenerC0407a(0, this);
        this.f1083k = new ViewOnFocusChangeListenerC0408b(this, 0);
        this.f1077e = AbstractC0458e.m1179S(c0422p.getContext(), R.attr.motionDurationShort3, 100);
        this.f1078f = AbstractC0458e.m1179S(c0422p.getContext(), R.attr.motionDurationShort3, 150);
        this.f1079g = AbstractC0458e.m1180T(c0422p.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1188a.f4552a);
        this.f1080h = AbstractC0458e.m1180T(c0422p.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1188a.f4555d);
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: a */
    public final void mo1064a() {
        if (this.f1137b.f1129p != null) {
            return;
        }
        m1074t(m1075u());
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: c */
    public final int mo1065c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: d */
    public final int mo1066d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1067e() {
        return this.f1083k;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: f */
    public final View.OnClickListener mo1068f() {
        return this.f1082j;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: g */
    public final View.OnFocusChangeListener mo1069g() {
        return this.f1083k;
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: m */
    public final void mo1070m(EditText editText) {
        this.f1081i = editText;
        this.f1136a.setEndIconVisible(m1075u());
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: p */
    public final void mo1071p(boolean z2) {
        if (this.f1137b.f1129p == null) {
            return;
        }
        m1074t(z2);
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: r */
    public final void mo1072r() {
        final int i2 = 1;
        final int i3 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f1080h);
        ofFloat.setDuration(this.f1078f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: P0.c

            /* renamed from: b */
            public final /* synthetic */ C0411e f1074b;

            {
                this.f1074b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0411e c0411e = this.f1074b;
                        c0411e.getClass();
                        c0411e.f1139d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0411e c0411e2 = this.f1074b;
                        c0411e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0411e2.f1139d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1079g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i4 = this.f1077e;
        ofFloat2.setDuration(i4);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: P0.c

            /* renamed from: b */
            public final /* synthetic */ C0411e f1074b;

            {
                this.f1074b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0411e c0411e = this.f1074b;
                        c0411e.getClass();
                        c0411e.f1139d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0411e c0411e2 = this.f1074b;
                        c0411e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0411e2.f1139d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1084l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1084l.addListener(new C0410d(this, i3));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i4);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: P0.c

            /* renamed from: b */
            public final /* synthetic */ C0411e f1074b;

            {
                this.f1074b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        C0411e c0411e = this.f1074b;
                        c0411e.getClass();
                        c0411e.f1139d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0411e c0411e2 = this.f1074b;
                        c0411e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0411e2.f1139d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f1085m = ofFloat3;
        ofFloat3.addListener(new C0410d(this, i2));
    }

    @Override // p043P0.AbstractC0423q
    /* renamed from: s */
    public final void mo1073s() {
        EditText editText = this.f1081i;
        if (editText != null) {
            editText.post(new RunnableC0130G(3, this));
        }
    }

    /* renamed from: t */
    public final void m1074t(boolean z2) {
        boolean z3 = this.f1137b.m1092d() == z2;
        if (z2 && !this.f1084l.isRunning()) {
            this.f1085m.cancel();
            this.f1084l.start();
            if (z3) {
                this.f1084l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f1084l.cancel();
        this.f1085m.start();
        if (z3) {
            this.f1085m.end();
        }
    }

    /* renamed from: u */
    public final boolean m1075u() {
        EditText editText = this.f1081i;
        if (editText != null) {
            return (editText.hasFocus() || this.f1139d.hasFocus()) && this.f1081i.getText().length() > 0;
        }
        return false;
    }
}
