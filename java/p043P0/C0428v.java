package p043P0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import p005C.AbstractC0038a;
import p008D.AbstractC0087a;
import p027K.AbstractC0272P;

/* renamed from: P0.v */
/* loaded from: classes.dex */
public final class C0428v extends ArrayAdapter {

    /* renamed from: a */
    public ColorStateList f1176a;

    /* renamed from: b */
    public ColorStateList f1177b;

    /* renamed from: c */
    public final /* synthetic */ C0429w f1178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0428v(C0429w c0429w, Context context, int i2, String[] strArr) {
        super(context, i2, strArr);
        this.f1178c = c0429w;
        m1115a();
    }

    /* renamed from: a */
    public final void m1115a() {
        ColorStateList colorStateList;
        C0429w c0429w = this.f1178c;
        ColorStateList colorStateList2 = c0429w.f1186l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f1177b = colorStateList;
        if (c0429w.f1185k != 0 && c0429w.f1186l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0038a.m110b(c0429w.f1186l.getColorForState(iArr3, 0), c0429w.f1185k), AbstractC0038a.m110b(c0429w.f1186l.getColorForState(iArr2, 0), c0429w.f1185k), c0429w.f1185k});
        }
        this.f1176a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0429w c0429w = this.f1178c;
            Drawable drawable = null;
            if (c0429w.getText().toString().contentEquals(textView.getText()) && c0429w.f1185k != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c0429w.f1185k);
                if (this.f1177b != null) {
                    AbstractC0087a.m305h(colorDrawable, this.f1176a);
                    drawable = new RippleDrawable(this.f1177b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
