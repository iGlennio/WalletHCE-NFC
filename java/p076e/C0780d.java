package p076e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.nfupay.s145.R;
import java.lang.ref.WeakReference;
import p014F0.ViewOnClickListenerC0141i;
import p071c0.HandlerC0694a;
import p073d.AbstractC0734a;

/* renamed from: e.d */
/* loaded from: classes.dex */
public final class C0780d {

    /* renamed from: a */
    public final Context f3054a;

    /* renamed from: b */
    public final DialogC0781e f3055b;

    /* renamed from: c */
    public final Window f3056c;

    /* renamed from: d */
    public CharSequence f3057d;

    /* renamed from: e */
    public AlertController$RecycleListView f3058e;

    /* renamed from: f */
    public Button f3059f;

    /* renamed from: g */
    public Button f3060g;

    /* renamed from: h */
    public Button f3061h;

    /* renamed from: i */
    public NestedScrollView f3062i;

    /* renamed from: j */
    public Drawable f3063j;

    /* renamed from: k */
    public ImageView f3064k;

    /* renamed from: l */
    public TextView f3065l;

    /* renamed from: m */
    public TextView f3066m;

    /* renamed from: n */
    public View f3067n;

    /* renamed from: o */
    public ListAdapter f3068o;

    /* renamed from: q */
    public final int f3070q;

    /* renamed from: r */
    public final int f3071r;

    /* renamed from: s */
    public final int f3072s;

    /* renamed from: t */
    public final int f3073t;

    /* renamed from: u */
    public final boolean f3074u;

    /* renamed from: v */
    public final HandlerC0694a f3075v;

    /* renamed from: p */
    public int f3069p = -1;

    /* renamed from: w */
    public final ViewOnClickListenerC0141i f3076w = new ViewOnClickListenerC0141i(2, this);

    public C0780d(Context context, DialogC0781e dialogC0781e, Window window) {
        this.f3054a = context;
        this.f3055b = dialogC0781e;
        this.f3056c = window;
        HandlerC0694a handlerC0694a = new HandlerC0694a();
        handlerC0694a.f2466b = new WeakReference(dialogC0781e);
        this.f3075v = handlerC0694a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0734a.f2915e, R.attr.alertDialogStyle, 0);
        this.f3070q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f3071r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f3072s = obtainStyledAttributes.getResourceId(7, 0);
        this.f3073t = obtainStyledAttributes.getResourceId(3, 0);
        this.f3074u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogC0781e.m2087c().mo2112h(1);
    }

    /* renamed from: a */
    public static ViewGroup m2084a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
