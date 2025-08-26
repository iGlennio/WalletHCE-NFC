package p010D1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import p002B.C0016f;
import p007C1.C0084x;
import p008D.AbstractC0087a;
import p018H.C0191k;
import p026J1.AbstractC0246n;
import p026J1.C0235c;
import p026J1.C0236d;
import p026J1.C0242j;
import p027K.AbstractC0272P;
import p027K.InterfaceC0279X;
import p034M0.C0360e;
import p058W.C0531b;
import p075d1.C0749a;
import p076e.AbstractActivityC0782f;
import p088j.AbstractC1037u1;
import p088j.ViewOnLongClickListenerC1043w1;
import p089j0.AbstractC1082x;
import p095l1.AbstractC1136c;
import p103o1.C1164a;
import p103o1.C1166c;
import p112r1.AbstractC1199i;
import p123v1.C1281k;
import p123v1.EnumC1294x;
import p126w1.AbstractC1302b;

/* renamed from: D1.d */
/* loaded from: classes.dex */
public abstract class AbstractC0096d implements InterfaceC0279X {

    /* renamed from: a */
    public static Field f290a = null;

    /* renamed from: b */
    public static boolean f291b = false;

    /* renamed from: c */
    public static Class f292c = null;

    /* renamed from: d */
    public static boolean f293d = false;

    /* renamed from: e */
    public static Field f294e = null;

    /* renamed from: f */
    public static boolean f295f = false;

    /* renamed from: g */
    public static Field f296g = null;

    /* renamed from: h */
    public static boolean f297h = false;

    /* renamed from: i */
    public static long f298i = 0;

    /* renamed from: j */
    public static Method f299j = null;

    /* renamed from: k */
    public static boolean f300k = true;

    /* renamed from: l */
    public static Field f301l;

    /* renamed from: m */
    public static boolean f302m;

    public AbstractC0096d() {
        new ConcurrentHashMap();
    }

    /* renamed from: C */
    public static Intent m323C(AbstractActivityC0782f abstractActivityC0782f) {
        Intent parentActivityIntent = abstractActivityC0782f.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String m325E = m325E(abstractActivityC0782f, abstractActivityC0782f.getComponentName());
            if (m325E == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC0782f, m325E);
            try {
                return m325E(abstractActivityC0782f, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m325E + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: D */
    public static Intent m324D(AbstractActivityC0782f abstractActivityC0782f, ComponentName componentName) {
        String m325E = m325E(abstractActivityC0782f, componentName);
        if (m325E == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m325E);
        return m325E(abstractActivityC0782f, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: E */
    public static String m325E(Activity activity, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }

    /* renamed from: J */
    public static final boolean m326J(AssertionError assertionError) {
        Logger logger = AbstractC0246n.f730a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC1199i.m2765q0(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m327K(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    /* renamed from: L */
    public static boolean m328L() {
        boolean isEnabled;
        try {
            if (f299j == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f299j == null) {
                f298i = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f299j = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f299j.invoke(null, Long.valueOf(f298i))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: Q */
    public static int m329Q(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    /* renamed from: R */
    public static Typeface m330R(Configuration configuration, Typeface typeface) {
        int i2;
        int i3;
        int weight;
        int i4;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == Integer.MAX_VALUE) {
            return null;
        }
        i3 = configuration.fontWeightAdjustment;
        if (i3 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i4 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, AbstractC0104l.m403h(i4 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    /* renamed from: S */
    public static int m331S(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* renamed from: T */
    public static C1281k m332T(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        Object clone = strArr.clone();
        if (clone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        String[] strArr2 = (String[]) clone;
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            strArr2[i2] = AbstractC1199i.m2763I0(str).toString();
        }
        C1164a m351k0 = m351k0(new C1166c(0, strArr2.length - 1, 1), 2);
        int i3 = m351k0.f4432a;
        int i4 = m351k0.f4433b;
        int i5 = m351k0.f4434c;
        if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
            while (true) {
                String str2 = strArr2[i3];
                String str3 = strArr2[i3 + 1];
                m348j(str2);
                m350k(str3, str2);
                if (i3 == i4) {
                    break;
                }
                i3 += i5;
            }
        }
        return new C1281k(strArr2);
    }

    /* renamed from: V */
    public static final boolean m333V(String str) {
        AbstractC1136c.m2637e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* renamed from: W */
    public static String m334W(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        C0242j c0242j = C0242j.f716d;
        PublicKey publicKey = x509Certificate.getPublicKey();
        AbstractC1136c.m2636d(publicKey, "publicKey");
        byte[] encoded = publicKey.getEncoded();
        AbstractC1136c.m2636d(encoded, "publicKey.encoded");
        sb.append(C0360e.m1013m(encoded).mo687b("SHA-256").mo686a());
        return sb.toString();
    }

    /* renamed from: X */
    public static C0531b m335X(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (j4 + j2));
                    C0531b c0531b = new C0531b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0531b.f759d = duplicate;
                    c0531b.f756a = position;
                    int i7 = position - duplicate.getInt(position);
                    c0531b.f757b = i7;
                    c0531b.f758c = ((ByteBuffer) c0531b.f759d).getShort(i7);
                    return c0531b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: Y */
    public static void m336Y(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        AbstractC0087a.m305h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: Z */
    public static TypedValue m337Z(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: a0 */
    public static boolean m338a0(Context context, int i2, boolean z2) {
        TypedValue m337Z = m337Z(context, i2);
        return (m337Z == null || m337Z.type != 18) ? z2 : m337Z.data != 0;
    }

    /* renamed from: b0 */
    public static TypedValue m339b0(Context context, int i2, String str) {
        TypedValue m337Z = m337Z(context, i2);
        if (m337Z != null) {
            return m337Z;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    /* renamed from: c0 */
    public static void m340c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    /* renamed from: d */
    public static void m341d(StringBuilder sb, Object obj, C0749a c0749a) {
        if (c0749a != null) {
            sb.append((CharSequence) c0749a.mo1365b(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* renamed from: d0 */
    public static void m342d0(Drawable drawable, int i2) {
        AbstractC0087a.m304g(drawable, i2);
    }

    /* renamed from: e */
    public static void m343e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC0087a.m305h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                AbstractC0087a.m305h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC0087a.m306i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: e0 */
    public static void m344e0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1037u1.m2534a(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1043w1 viewOnLongClickListenerC1043w1 = ViewOnLongClickListenerC1043w1.f4084k;
        if (viewOnLongClickListenerC1043w1 != null && viewOnLongClickListenerC1043w1.f4086a == view) {
            ViewOnLongClickListenerC1043w1.m2539b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC1043w1(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1043w1 viewOnLongClickListenerC1043w12 = ViewOnLongClickListenerC1043w1.f4085l;
        if (viewOnLongClickListenerC1043w12 != null && viewOnLongClickListenerC1043w12.f4086a == view) {
            viewOnLongClickListenerC1043w12.m2540a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = m329Q(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m345f(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = m346g(r8, r9, r10)
            boolean r1 = m346g(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = m329Q(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p010D1.AbstractC0096d.m345f(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: g */
    public static boolean m346g(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: i0 */
    public static final C0235c m347i0(Socket socket) {
        Logger logger = AbstractC0246n.f730a;
        C0084x c0084x = new C0084x(1, socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC1136c.m2636d(outputStream, "getOutputStream()");
        return new C0235c(c0084x, new C0235c(outputStream, c0084x));
    }

    /* renamed from: j */
    public static void m348j(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('!' > charAt || '~' < charAt) {
                throw new IllegalArgumentException(AbstractC1302b.m3000i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
            }
        }
    }

    /* renamed from: j0 */
    public static final C0236d m349j0(Socket socket) {
        int i2 = 1;
        Logger logger = AbstractC0246n.f730a;
        C0084x c0084x = new C0084x(i2, socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC1136c.m2636d(inputStream, "getInputStream()");
        return new C0236d(c0084x, 0, new C0236d(inputStream, i2, c0084x));
    }

    /* renamed from: k */
    public static void m350k(String str, String str2) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || '~' < charAt)) {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC1302b.m3000i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i2), str2));
                sb.append(AbstractC1302b.m3008q(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* renamed from: k0 */
    public static C1164a m351k0(C1164a c1164a, int i2) {
        AbstractC1136c.m2637e(c1164a, "<this>");
        boolean z2 = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (z2) {
            if (c1164a.f4434c <= 0) {
                i2 = -i2;
            }
            return new C1164a(c1164a.f4432a, c1164a.f4433b, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* renamed from: l0 */
    public static C1166c m352l0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new C1166c(i2, i3 - 1, 1);
        }
        C1166c c1166c = C1166c.f4439d;
        return C1166c.f4439d;
    }

    /* renamed from: m */
    public static ImageView.ScaleType m353m(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: s */
    public static EnumC1294x m354s(String str) {
        AbstractC1136c.m2637e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC1294x.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC1294x.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC1294x.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC1294x.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC1294x.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f51c == r8.hashCode()) goto L21;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList m355v(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            B.m r1 = new B.m
            r1.<init>(r0, r8)
            java.lang.Object r2 = p002B.AbstractC0027q.f62c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p002B.AbstractC0027q.f61b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            B.l r5 = (p002B.C0022l) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f50b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f51c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f51c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f49a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = p002B.AbstractC0027q.f60a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = p002B.AbstractC0013c.m45a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = p002B.AbstractC0027q.f62c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = p002B.AbstractC0027q.f61b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            B.l r0 = new B.l     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f52a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = p002B.AbstractC0021k.m87b(r0, r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p010D1.AbstractC0096d.m355v(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: A */
    public abstract int mo356A();

    /* renamed from: B */
    public abstract int mo357B(View view);

    /* renamed from: F */
    public abstract int mo358F(CoordinatorLayout coordinatorLayout);

    /* renamed from: G */
    public abstract String[] mo359G(Class cls);

    /* renamed from: H */
    public abstract int mo360H();

    /* renamed from: I */
    public float mo361I(View view) {
        if (f300k) {
            try {
                return AbstractC1082x.m2607a(view);
            } catch (NoSuchMethodError unused) {
                f300k = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: M */
    public abstract boolean mo362M(float f);

    /* renamed from: N */
    public abstract boolean mo363N(Class cls);

    /* renamed from: O */
    public abstract boolean mo364O(View view);

    /* renamed from: P */
    public abstract boolean mo365P(float f, float f2);

    /* renamed from: U */
    public abstract Object mo366U(int i2, Intent intent);

    /* renamed from: f0 */
    public void mo369f0(View view, float f) {
        if (f300k) {
            try {
                AbstractC1082x.m2608b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f300k = false;
            }
        }
        view.setAlpha(f);
    }

    /* renamed from: g0 */
    public void mo370g0(View view, int i2) {
        if (!f302m) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f301l = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f302m = true;
        }
        Field field = f301l;
        if (field != null) {
            try {
                f301l.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public abstract int mo371h(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: h0 */
    public abstract boolean mo372h0(View view, float f);

    /* renamed from: i */
    public abstract float mo373i(int i2);

    /* renamed from: l */
    public abstract List mo374l(List list, String str);

    /* renamed from: m0 */
    public abstract void mo375m0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2);

    /* renamed from: n */
    public abstract Typeface mo193n(Context context, C0016f c0016f, Resources resources, int i2);

    /* renamed from: n0 */
    public abstract void mo376n0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    /* renamed from: o */
    public abstract Typeface mo194o(Context context, C0191k[] c0191kArr, int i2);

    /* renamed from: p */
    public Typeface mo207p(Context context, InputStream inputStream) {
        File m418z = AbstractC0104l.m418z(context);
        if (m418z == null) {
            return null;
        }
        try {
            if (AbstractC0104l.m407n(m418z, inputStream)) {
                return Typeface.createFromFile(m418z.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m418z.delete();
        }
    }

    /* renamed from: q */
    public Typeface mo198q(Context context, Resources resources, int i2, String str, int i3) {
        File m418z = AbstractC0104l.m418z(context);
        if (m418z == null) {
            return null;
        }
        try {
            if (AbstractC0104l.m406m(m418z, resources, i2)) {
                return Typeface.createFromFile(m418z.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m418z.delete();
        }
    }

    /* renamed from: r */
    public C0191k mo208r(int i2, C0191k[] c0191kArr) {
        new C0360e(1);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        C0191k c0191k = null;
        int i4 = Integer.MAX_VALUE;
        for (C0191k c0191k2 : c0191kArr) {
            int abs = (Math.abs(c0191k2.f558c - i3) * 2) + (c0191k2.f559d == z2 ? 0 : 1);
            if (c0191k == null || i4 > abs) {
                c0191k = c0191k2;
                i4 = abs;
            }
        }
        return c0191k;
    }

    /* renamed from: t */
    public abstract Method mo377t(Class cls, Field field);

    /* renamed from: u */
    public abstract Constructor mo378u(Class cls);

    /* renamed from: w */
    public abstract int mo379w(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: x */
    public abstract int mo380x();

    /* renamed from: y */
    public abstract int mo381y();

    /* renamed from: z */
    public abstract int mo382z();

    @Override // p027K.InterfaceC0279X
    /* renamed from: b */
    public void mo367b() {
    }

    @Override // p027K.InterfaceC0279X
    /* renamed from: c */
    public void mo368c() {
    }
}
