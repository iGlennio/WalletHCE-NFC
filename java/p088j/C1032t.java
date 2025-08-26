package p088j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.nfupay.s145.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p001A1.C0010i;
import p005C.AbstractC0038a;
import p010D1.AbstractC0096d;
import p018H.C0185e;
import p072c1.C0697a;
import p075d1.C0750b;
import p095l1.AbstractC1136c;
import p123v1.C1281k;
import p123v1.C1283m;

/* renamed from: j.t */
/* loaded from: classes.dex */
public final class C1032t {

    /* renamed from: a */
    public final /* synthetic */ int f4043a;

    /* renamed from: b */
    public Object f4044b;

    /* renamed from: c */
    public final Object f4045c;

    /* renamed from: d */
    public final Serializable f4046d;

    /* renamed from: e */
    public final Object f4047e;

    /* renamed from: f */
    public final Object f4048f;

    /* renamed from: g */
    public final Object f4049g;

    public C1032t(C1283m c1283m, String str, C1281k c1281k, C0010i c0010i, Map map) {
        this.f4043a = 1;
        AbstractC1136c.m2637e(c1283m, "url");
        AbstractC1136c.m2637e(str, "method");
        this.f4045c = c1283m;
        this.f4046d = str;
        this.f4047e = c1281k;
        this.f4048f = c0010i;
        this.f4049g = map;
    }

    /* renamed from: a */
    public static boolean m2518a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static ColorStateList m2519b(Context context, int i2) {
        int m2476c = AbstractC0998h1.m2476c(context, R.attr.colorControlHighlight);
        int m2475b = AbstractC0998h1.m2475b(context, R.attr.colorButtonNormal);
        int[] iArr = AbstractC0998h1.f3948b;
        int[] iArr2 = AbstractC0998h1.f3950d;
        int m110b = AbstractC0038a.m110b(m2476c, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, AbstractC0998h1.f3949c, AbstractC0998h1.f3952f}, new int[]{m2475b, m110b, AbstractC0038a.m110b(m2476c, i2), i2});
    }

    /* renamed from: c */
    public static LayerDrawable m2520c(C0958R0 c0958r0, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable m2428c = c0958r0.m2428c(context, R.drawable.abc_star_black_48dp);
        Drawable m2428c2 = c0958r0.m2428c(context, R.drawable.abc_star_half_black_48dp);
        if ((m2428c instanceof BitmapDrawable) && m2428c.getIntrinsicWidth() == dimensionPixelSize && m2428c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) m2428c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            m2428c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m2428c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((m2428c2 instanceof BitmapDrawable) && m2428c2.getIntrinsicWidth() == dimensionPixelSize && m2428c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) m2428c2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            m2428c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m2428c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: f */
    public static void m2521f(Drawable drawable, int i2, PorterDuff.Mode mode) {
        int[] iArr = AbstractC1027r0.f4033a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1035u.f4069b;
        }
        mutate.setColorFilter(C1035u.m2528c(i2, mode));
    }

    /* renamed from: d */
    public ColorStateList m2522d(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return AbstractC0096d.m355v(context, R.color.abc_tint_edittext);
        }
        if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0096d.m355v(context, R.color.abc_tint_switch_track);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return m2519b(context, AbstractC0998h1.m2476c(context, R.attr.colorButtonNormal));
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return m2519b(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return m2519b(context, AbstractC0998h1.m2476c(context, R.attr.colorAccent));
            }
            if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0096d.m355v(context, R.color.abc_tint_spinner);
            }
            if (m2518a((int[]) this.f4045c, i2)) {
                return AbstractC0998h1.m2477d(context, R.attr.colorControlNormal);
            }
            if (m2518a((int[]) this.f4048f, i2)) {
                return AbstractC0096d.m355v(context, R.color.abc_tint_default);
            }
            if (m2518a((int[]) this.f4049g, i2)) {
                return AbstractC0096d.m355v(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0096d.m355v(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList m2477d = AbstractC0998h1.m2477d(context, R.attr.colorSwitchThumbNormal);
        if (m2477d == null || !m2477d.isStateful()) {
            iArr[0] = AbstractC0998h1.f3948b;
            iArr2[0] = AbstractC0998h1.m2475b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = AbstractC0998h1.f3951e;
            iArr2[1] = AbstractC0998h1.m2476c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC0998h1.f3952f;
            iArr2[2] = AbstractC0998h1.m2476c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = AbstractC0998h1.f3948b;
            iArr[0] = iArr3;
            iArr2[0] = m2477d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC0998h1.f3951e;
            iArr2[1] = AbstractC0998h1.m2476c(context, R.attr.colorControlActivated);
            iArr[2] = AbstractC0998h1.f3952f;
            iArr2[2] = m2477d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: e */
    public C0185e m2523e() {
        C0185e c0185e = new C0185e(false);
        c0185e.f540f = new LinkedHashMap();
        c0185e.f537c = (C1283m) this.f4045c;
        c0185e.f536b = (String) this.f4046d;
        c0185e.f539e = (C0010i) this.f4048f;
        Map map = (Map) this.f4049g;
        c0185e.f540f = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        c0185e.f538d = ((C1281k) this.f4047e).m2966c();
        return c0185e;
    }

    public String toString() {
        switch (this.f4043a) {
            case 1:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f4046d);
                sb.append(", url=");
                sb.append((C1283m) this.f4045c);
                C1281k c1281k = (C1281k) this.f4047e;
                if (c1281k.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = c1281k.iterator();
                    int i2 = 0;
                    while (true) {
                        C0750b c0750b = (C0750b) it;
                        if (c0750b.hasNext()) {
                            Object next = c0750b.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            C0697a c0697a = (C0697a) next;
                            String str = (String) c0697a.f2477a;
                            String str2 = (String) c0697a.f2478b;
                            if (i2 > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i2 = i3;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.f4049g;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                AbstractC1136c.m2636d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.io.Serializable] */
    public C1032t() {
        this.f4043a = 0;
        this.f4044b = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f4045c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f4046d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f4047e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f4048f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f4049g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }
}
