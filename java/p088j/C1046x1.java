package p088j;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.nfupay.s145.R;

/* renamed from: j.x1 */
/* loaded from: classes.dex */
public final class C1046x1 {

    /* renamed from: a */
    public final Context f4110a;

    /* renamed from: b */
    public final View f4111b;

    /* renamed from: c */
    public final TextView f4112c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f4113d;

    /* renamed from: e */
    public final Rect f4114e;

    /* renamed from: f */
    public final int[] f4115f;

    /* renamed from: g */
    public final int[] f4116g;

    public C1046x1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f4113d = layoutParams;
        this.f4114e = new Rect();
        this.f4115f = new int[2];
        this.f4116g = new int[2];
        this.f4110a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f4111b = inflate;
        this.f4112c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(C1046x1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
