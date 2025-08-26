package p005C;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p002B.C0016f;
import p002B.C0017g;
import p010D1.AbstractC0096d;
import p018H.C0191k;

/* renamed from: C.o */
/* loaded from: classes.dex */
public final class C0052o extends AbstractC0096d {
    /* renamed from: o0 */
    public static Font m205o0(FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m206p0 = m206p0(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int m206p02 = m206p0(fontStyle, font2.getStyle());
            if (m206p02 < m206p0) {
                font = font2;
                m206p0 = m206p02;
            }
        }
        return font;
    }

    /* renamed from: p0 */
    public static int m206p0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: n */
    public final Typeface mo193n(Context context, C0016f c0016f, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (C0017g c0017g : c0016f.f35a) {
                try {
                    Font build = new Font.Builder(resources, c0017g.f41f).setWeight(c0017g.f37b).setSlant(c0017g.f38c ? 1 : 0).setTtcIndex(c0017g.f40e).setFontVariationSettings(c0017g.f39d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m205o0(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: o */
    public final Typeface mo194o(Context context, C0191k[] c0191kArr, int i2) {
        int i3;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0191kArr.length;
            FontFamily.Builder builder = null;
            while (i3 < length) {
                C0191k c0191k = c0191kArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0191k.f556a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i3 = openFileDescriptor == null ? i3 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c0191k.f558c).setSlant(c0191k.f559d ? 1 : 0).setTtcIndex(c0191k.f557b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder != null) {
                FontFamily build2 = builder.build();
                return new Typeface.CustomFallbackBuilder(build2).setStyle(m205o0(build2, i2).getStyle()).build();
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: p */
    public final Typeface mo207p(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: q */
    public final Typeface mo198q(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p010D1.AbstractC0096d
    /* renamed from: r */
    public final C0191k mo208r(int i2, C0191k[] c0191kArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
