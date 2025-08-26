package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import p008D.AbstractC0089c;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f1887k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public Object f1889b;

    /* renamed from: j */
    public String f1897j;

    /* renamed from: a */
    public int f1888a = -1;

    /* renamed from: c */
    public byte[] f1890c = null;

    /* renamed from: d */
    public Parcelable f1891d = null;

    /* renamed from: e */
    public int f1892e = 0;

    /* renamed from: f */
    public int f1893f = 0;

    /* renamed from: g */
    public ColorStateList f1894g = null;

    /* renamed from: h */
    public PorterDuff.Mode f1895h = f1887k;

    /* renamed from: i */
    public String f1896i = null;

    public final String toString() {
        String str;
        int i2;
        if (this.f1888a == -1) {
            return String.valueOf(this.f1889b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1888a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1888a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1889b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1889b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1897j);
                sb.append(" id=");
                int i3 = this.f1888a;
                if (i3 == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Object obj = this.f1889b;
                    if (i4 >= 28) {
                        i2 = AbstractC0089c.m309a(obj);
                    } else {
                        i2 = 0;
                        try {
                            i2 = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                        } catch (NoSuchMethodException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                        } catch (InvocationTargetException e4) {
                            Log.e("IconCompat", "Unable to get icon resource", e4);
                        }
                    }
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i2 = this.f1892e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i2)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1892e);
                if (this.f1893f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1893f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1889b);
                break;
        }
        if (this.f1894g != null) {
            sb.append(" tint=");
            sb.append(this.f1894g);
        }
        if (this.f1895h != f1887k) {
            sb.append(" mode=");
            sb.append(this.f1895h);
        }
        sb.append(")");
        return sb.toString();
    }
}
