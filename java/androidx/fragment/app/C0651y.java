package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.cardview.widget.CardView;
import java.io.Serializable;
import org.json.JSONObject;
import p002B.C0019i;
import p010D1.AbstractC0104l;
import p034M0.C0356a;
import p034M0.C0366k;
import p047Q1.AbstractC0458e;
import p074d0.InterfaceC0739e;
import p086i.InterfaceC0919x;
import p086i.MenuC0907l;
import p098n.AbstractC1146b;
import p098n.C1145a;
import p108q0.AbstractC1183a;
import p118t1.InterfaceC1231a;
import p118t1.InterfaceC1239i;

/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
public final class C0651y implements InterfaceC0739e, InterfaceC0919x, InterfaceC1231a, InterfaceC1239i {

    /* renamed from: a */
    public final /* synthetic */ int f2270a;

    public /* synthetic */ C0651y(int i2) {
        this.f2270a = i2;
    }

    /* renamed from: d */
    public static C0651y m1679d(Context context, int i2) {
        AbstractC0458e.m1190h("Cannot create a CalendarItemStyle with a styleResId of 0", i2 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC1183a.f4534m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0104l.m413t(context, obtainStyledAttributes, 4);
        AbstractC0104l.m413t(context, obtainStyledAttributes, 9);
        AbstractC0104l.m413t(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C0366k.m1033a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C0356a(0)).m1032a();
        obtainStyledAttributes.recycle();
        C0651y c0651y = new C0651y(3);
        AbstractC0458e.m1191i(rect.left);
        AbstractC0458e.m1191i(rect.top);
        AbstractC0458e.m1191i(rect.right);
        AbstractC0458e.m1191i(rect.bottom);
        return c0651y;
    }

    /* renamed from: e */
    public static Path m1680e(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // p118t1.InterfaceC1231a
    /* renamed from: c */
    public void mo1684c(JSONObject jSONObject) {
        Log.i("MainActivity", "onSuccess111: " + jSONObject);
    }

    @Override // p118t1.InterfaceC1239i
    /* renamed from: f */
    public void mo1685f(String str) {
        try {
            Double.parseDouble(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // p086i.InterfaceC0919x
    /* renamed from: i */
    public boolean mo173i(MenuC0907l menuC0907l) {
        return false;
    }

    /* renamed from: j */
    public void m1686j(C0019i c0019i, float f) {
        C1145a c1145a = (C1145a) ((Drawable) c0019i.f47b);
        CardView cardView = (CardView) c0019i.f48c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != c1145a.f4348e || c1145a.f4349f != useCompatPadding || c1145a.f4350g != preventCornerOverlap) {
            c1145a.f4348e = f;
            c1145a.f4349f = useCompatPadding;
            c1145a.f4350g = preventCornerOverlap;
            c1145a.m2646b(null);
            c1145a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c0019i.m59J(0, 0, 0, 0);
            return;
        }
        C1145a c1145a2 = (C1145a) ((Drawable) c0019i.f47b);
        float f2 = c1145a2.f4348e;
        float f3 = c1145a2.f4344a;
        int ceil = (int) Math.ceil(AbstractC1146b.m2647a(f2, f3, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(AbstractC1146b.m2648b(f2, f3, cardView.getPreventCornerOverlap()));
        c0019i.m59J(ceil, ceil2, ceil, ceil2);
    }

    @Override // p074d0.InterfaceC0739e
    /* renamed from: k */
    public void mo175k(int i2, Serializable serializable) {
        String str;
        switch (this.f2270a) {
            case 4:
                break;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i2 != 6 && i2 != 7 && i2 != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // p074d0.InterfaceC0739e
    /* renamed from: q */
    public void mo181q() {
        switch (this.f2270a) {
            case 4:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p118t1.InterfaceC1231a
    /* renamed from: b */
    public void mo1683b(String str) {
    }

    /* renamed from: g */
    private final void m1681g() {
    }

    /* renamed from: h */
    private final void m1682h(int i2, Serializable serializable) {
    }

    @Override // p086i.InterfaceC0919x
    /* renamed from: a */
    public void mo165a(MenuC0907l menuC0907l, boolean z2) {
    }
}
