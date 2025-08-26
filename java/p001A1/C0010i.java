package p001A1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import p010D1.AbstractC0104l;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p045Q.AbstractC0439f;
import p073d.AbstractC0734a;
import p088j.AbstractC1027r0;
import p088j.C1004j1;
import p088j.C1035u;
import p095l1.AbstractC1136c;
import p112r1.AbstractC1191a;
import p123v1.C1285o;
import p123v1.EnumC1288r;
import p126w1.AbstractC1302b;

/* renamed from: A1.i */
/* loaded from: classes.dex */
public final class C0010i {

    /* renamed from: a */
    public final /* synthetic */ int f17a;

    /* renamed from: b */
    public int f18b;

    /* renamed from: c */
    public final Object f19c;

    /* renamed from: d */
    public Object f20d;

    public /* synthetic */ C0010i(Object obj, Object obj2, int i2, int i3) {
        this.f17a = i3;
        this.f19c = obj;
        this.f20d = obj2;
        this.f18b = i2;
    }

    /* renamed from: b */
    public static final C0010i m25b(String str, C1285o c1285o) {
        AbstractC1136c.m2637e(str, "$this$toRequestBody");
        Charset charset = AbstractC1191a.f4563a;
        if (c1285o != null) {
            Pattern pattern = C1285o.f5200c;
            Charset m2978a = c1285o.m2978a(null);
            if (m2978a == null) {
                String str2 = c1285o + "; charset=utf-8";
                AbstractC1136c.m2637e(str2, "$this$toMediaTypeOrNull");
                try {
                    c1285o = AbstractC0104l.m411r(str2);
                } catch (IllegalArgumentException unused) {
                    c1285o = null;
                }
            } else {
                charset = m2978a;
            }
        }
        byte[] bytes = str.getBytes(charset);
        AbstractC1136c.m2636d(bytes, "(this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        AbstractC1302b.m2993b(bytes.length, 0, length);
        return new C0010i(bytes, c1285o, length, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r4.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p001A1.C0010i m26c(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p001A1.C0010i.m26c(android.content.res.Resources, int, android.content.res.Resources$Theme):A1.i");
    }

    /* renamed from: a */
    public void m27a() {
        C1004j1 c1004j1;
        ImageView imageView = (ImageView) this.f19c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1027r0.m2515a(drawable);
        }
        if (drawable == null || (c1004j1 = (C1004j1) this.f20d) == null) {
            return;
        }
        C1035u.m2530e(drawable, c1004j1, imageView.getDrawableState());
    }

    /* renamed from: d */
    public boolean m28d() {
        ColorStateList colorStateList;
        return ((Shader) this.f19c) == null && (colorStateList = (ColorStateList) this.f20d) != null && colorStateList.isStateful();
    }

    /* renamed from: e */
    public void m29e(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f19c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0734a.f2916f;
        C0176h m519B = C0176h.m519B(context, attributeSet, iArr, i2);
        AbstractC0272P.m822l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) m519B.f516c, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) m519B.f516c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0104l.m415w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1027r0.m2515a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC0439f.m1136c(imageView, m519B.m541p(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0439f.m1137d(imageView, AbstractC1027r0.m2516b(typedArray.getInt(3, -1), null));
            }
            m519B.m523E();
        } catch (Throwable th) {
            m519B.m523E();
            throw th;
        }
    }

    public String toString() {
        switch (this.f17a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (((EnumC1288r) this.f19c) == EnumC1288r.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f18b);
                sb.append(' ');
                sb.append((String) this.f20d);
                String sb2 = sb.toString();
                AbstractC1136c.m2636d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0010i(EnumC1288r enumC1288r, int i2, String str) {
        this.f17a = 0;
        this.f19c = enumC1288r;
        this.f18b = i2;
        this.f20d = str;
    }

    public C0010i(ImageView imageView) {
        this.f17a = 2;
        this.f18b = 0;
        this.f19c = imageView;
    }
}
