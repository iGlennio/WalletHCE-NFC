package p047Q1;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0593g;
import androidx.emoji2.text.C0605s;
import com.nfupay.s145.R;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlSerializer;
import p000A.AbstractC0001b;
import p005C.AbstractC0038a;
import p005C.AbstractC0039b;
import p005C.C0045h;
import p009D0.C0092a;
import p010D1.AbstractC0096d;
import p010D1.AbstractC0104l;
import p021I.C0211f;
import p026J1.C0237e;
import p027K.AbstractC0261E;
import p027K.AbstractC0272P;
import p027K.C0271O;
import p033M.AbstractC0355a;
import p034M0.C0359d;
import p034M0.C0361f;
import p034M0.C0362g;
import p034M0.C0364i;
import p045Q.AbstractC0447n;
import p045Q.AbstractC0448o;
import p045Q.AbstractC0449p;
import p045Q.ActionModeCallbackC0450q;
import p079f0.AbstractC0812H;
import p079f0.C0824U;
import p080f1.AbstractC0865c;
import p088j.C0991f0;
import p089j0.AbstractC1080v;
import p095l1.AbstractC1136c;
import p103o1.C1166c;
import p123v1.EnumC1288r;
import p132y1.AbstractC1321a;
import p132y1.C1322b;
import p132y1.C1323c;

/* renamed from: Q1.e */
/* loaded from: classes.dex */
public abstract class AbstractC0458e {

    /* renamed from: a */
    public static C0457d f1252a = null;

    /* renamed from: b */
    public static boolean f1253b = false;

    /* renamed from: c */
    public static boolean f1254c = false;

    /* renamed from: d */
    public static Method f1255d = null;

    /* renamed from: e */
    public static boolean f1256e = false;

    /* renamed from: f */
    public static Field f1257f = null;

    /* renamed from: g */
    public static boolean f1258g = true;

    /* renamed from: A */
    public static ColorStateList m1168A(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0039b.m133q(drawable)) {
            return null;
        }
        colorStateList = AbstractC0039b.m120d(drawable).getColorStateList();
        return colorStateList;
    }

    /* renamed from: C */
    public static float m1169C(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: D */
    public static C0211f m1170D(C0991f0 c0991f0) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new C0211f(AbstractC0449p.m1159c(c0991f0));
        }
        TextPaint textPaint = new TextPaint(c0991f0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int m1148a = AbstractC0447n.m1148a(c0991f0);
        int m1151d = AbstractC0447n.m1151d(c0991f0);
        if (c0991f0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c0991f0.getInputType() & 15) != 3) {
                boolean z2 = c0991f0.getLayoutDirection() == 1;
                switch (c0991f0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC0449p.m1158b(AbstractC0448o.m1156a(c0991f0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C0211f(textPaint, textDirectionHeuristic, m1148a, m1151d);
    }

    /* renamed from: E */
    public static boolean m1171E(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC0038a.f105a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = red / 255.0d;
        double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = green / 255.0d;
        double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = blue / 255.0d;
        double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    /* renamed from: F */
    public static boolean m1172F(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* renamed from: G */
    public static boolean m1173G(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: H */
    public static int m1174H(int i2, int i3, float f) {
        return AbstractC0038a.m110b(AbstractC0038a.m112d(i3, Math.round(Color.alpha(i3) * f)), i2);
    }

    /* renamed from: I */
    public static void m1175I(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* renamed from: P */
    public static void m1176P(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", Boolean.TRUE);
                        newSerializer.startTag(null, "locales");
                        newSerializer.attribute(null, "application_locales", str);
                        newSerializer.endTag(null, "locales");
                        newSerializer.endDocument();
                        Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                        if (openFileOutput != null) {
                            openFileOutput.close();
                        }
                    } catch (Exception e2) {
                        Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e2);
                        if (openFileOutput != null) {
                            openFileOutput.close();
                        }
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        if (r6 != 4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4.getName().equals("locales") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r3 == null) goto L27;
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m1177Q(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p047Q1.AbstractC0458e.m1177Q(android.content.Context):java.lang.String");
    }

    /* renamed from: R */
    public static final void m1178R(String str) {
        System.err.println("SLF4J: " + str);
    }

    /* renamed from: S */
    public static int m1179S(Context context, int i2, int i3) {
        TypedValue m337Z = AbstractC0096d.m337Z(context, i2);
        return (m337Z == null || m337Z.type != 16) ? i3 : m337Z.data;
    }

    /* renamed from: T */
    public static TimeInterpolator m1180T(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!m1173G(valueOf, "cubic-bezier") && !m1173G(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m1173G(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return AbstractC0355a.m1002b(m1169C(split, 0), m1169C(split, 1), m1169C(split, 2), m1169C(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!m1173G(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            C0045h.m164b(m1199q(substring), path);
            return AbstractC0355a.m1003c(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    /* renamed from: Y */
    public static void m1181Y(TextView textView, int i2) {
        m1191i(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0449p.m1160d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: Z */
    public static void m1182Z(TextView textView, int i2) {
        m1191i(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    /* renamed from: a0 */
    public static void m1183a0(View view, C0362g c0362g) {
        C0092a c0092a = c0362g.f931a.f915b;
        if (c0092a == null || !c0092a.f278a) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC0272P.f768a;
            f += AbstractC0261E.m748i((View) parent);
        }
        C0361f c0361f = c0362g.f931a;
        if (c0361f.f925l != f) {
            c0361f.f925l = f;
            c0362g.m1030m();
        }
    }

    /* renamed from: b0 */
    public static void m1184b0(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1080v.m2604b(viewGroup, z2);
        } else if (f1258g) {
            try {
                AbstractC1080v.m2604b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f1258g = false;
            }
        }
    }

    /* renamed from: c0 */
    public static ActionMode.Callback m1185c0(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC0450q) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC0450q) callback).f1235a;
    }

    /* renamed from: d0 */
    public static ActionMode.Callback m1186d0(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof ActionModeCallbackC0450q) || callback == null) ? callback : new ActionModeCallbackC0450q(callback, textView);
    }

    /* renamed from: e */
    public static final void m1187e(AbstractC1321a abstractC1321a, C1322b c1322b, String str) {
        C1323c.f5415i.fine(c1322b.f5413f + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC1321a.f5406c);
    }

    /* renamed from: f */
    public static void m1188f(Throwable th, Throwable th2) {
        AbstractC1136c.m2637e(th, "<this>");
        AbstractC1136c.m2637e(th2, "exception");
        if (th != th2) {
            AbstractC0865c.f3495a.mo2285a(th, th2);
        }
    }

    /* renamed from: g */
    public static C0237e m1189g() {
        C0237e c0237e = C0237e.f703j;
        AbstractC1136c.m2634b(c0237e);
        C0237e c0237e2 = c0237e.f705f;
        if (c0237e2 == null) {
            long nanoTime = System.nanoTime();
            C0237e.class.wait(C0237e.f701h);
            C0237e c0237e3 = C0237e.f703j;
            AbstractC1136c.m2634b(c0237e3);
            if (c0237e3.f705f != null || System.nanoTime() - nanoTime < C0237e.f702i) {
                return null;
            }
            return C0237e.f703j;
        }
        long nanoTime2 = c0237e2.f706g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j2 = nanoTime2 / 1000000;
            C0237e.class.wait(j2, (int) (nanoTime2 - (1000000 * j2)));
            return null;
        }
        C0237e c0237e4 = C0237e.f703j;
        AbstractC1136c.m2634b(c0237e4);
        c0237e4.f705f = c0237e2.f705f;
        c0237e2.f705f = null;
        return c0237e2;
    }

    /* renamed from: h */
    public static void m1190h(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: i */
    public static void m1191i(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: j */
    public static void m1192j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: k */
    public static void m1193k(int i2) {
        C1166c c1166c = new C1166c(2, 36, 1);
        if (2 > i2 || i2 > c1166c.f4433b) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new C1166c(2, 36, 1));
        }
    }

    /* renamed from: l */
    public static int m1194l(C0824U c0824u, AbstractC0593g abstractC0593g, View view, View view2, AbstractC0812H abstractC0812H, boolean z2) {
        if (abstractC0812H.m2194v() == 0 || c0824u.m2211b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(AbstractC0812H.m2166H(view) - AbstractC0812H.m2166H(view2)) + 1;
        }
        return Math.min(abstractC0593g.mo1521l(), abstractC0593g.mo1511b(view2) - abstractC0593g.mo1514e(view));
    }

    /* renamed from: m */
    public static int m1195m(C0824U c0824u, AbstractC0593g abstractC0593g, View view, View view2, AbstractC0812H abstractC0812H, boolean z2, boolean z3) {
        if (abstractC0812H.m2194v() == 0 || c0824u.m2211b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (c0824u.m2211b() - Math.max(AbstractC0812H.m2166H(view), AbstractC0812H.m2166H(view2))) - 1) : Math.max(0, Math.min(AbstractC0812H.m2166H(view), AbstractC0812H.m2166H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(abstractC0593g.mo1511b(view2) - abstractC0593g.mo1514e(view)) / (Math.abs(AbstractC0812H.m2166H(view) - AbstractC0812H.m2166H(view2)) + 1))) + (abstractC0593g.mo1520k() - abstractC0593g.mo1514e(view)));
        }
        return max;
    }

    /* renamed from: n */
    public static int m1196n(C0824U c0824u, AbstractC0593g abstractC0593g, View view, View view2, AbstractC0812H abstractC0812H, boolean z2) {
        if (abstractC0812H.m2194v() == 0 || c0824u.m2211b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return c0824u.m2211b();
        }
        return (int) (((abstractC0593g.mo1511b(view2) - abstractC0593g.mo1514e(view)) / (Math.abs(AbstractC0812H.m2166H(view) - AbstractC0812H.m2166H(view2)) + 1)) * c0824u.m2211b());
    }

    /* renamed from: o */
    public static float[] m1197o(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: p */
    public static AbstractC0104l m1198p(int i2) {
        return i2 != 0 ? i2 != 1 ? new C0364i() : new C0359d() : new C0364i();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p005C.C0045h[] m1199q(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p047Q1.AbstractC0458e.m1199q(java.lang.String):C.h[]");
    }

    /* renamed from: r */
    public static C0045h[] m1200r(C0045h[] c0045hArr) {
        C0045h[] c0045hArr2 = new C0045h[c0045hArr.length];
        for (int i2 = 0; i2 < c0045hArr.length; i2++) {
            c0045hArr2[i2] = new C0045h(c0045hArr[i2]);
        }
        return c0045hArr2;
    }

    /* renamed from: s */
    public static boolean m1201s(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0271O.f764d;
        C0271O c0271o = (C0271O) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0271o == null) {
            c0271o = new C0271O();
            c0271o.f765a = null;
            c0271o.f766b = null;
            c0271o.f767c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0271o);
        }
        WeakReference weakReference2 = c0271o.f767c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0271o.f767c = new WeakReference(keyEvent);
        if (c0271o.f766b == null) {
            c0271o.f766b = new SparseArray();
        }
        SparseArray sparseArray = c0271o.f766b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m1202t(p027K.InterfaceC0302k r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
        /*
            r0 = 0
            if (r6 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r6 = r6.mo880e(r9)
            return r6
        L10:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L65
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r7 == 0) goto L65
            boolean r1 = p047Q1.AbstractC0458e.f1254c
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            p047Q1.AbstractC0458e.f1255d = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            p047Q1.AbstractC0458e.f1254c = r3
        L4d:
            java.lang.reflect.Method r1 = p047Q1.AbstractC0458e.f1255d
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L62
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = p027K.AbstractC0272P.m813c(r6, r9)
            if (r7 == 0) goto L77
            goto L81
        L77:
            if (r6 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L7d:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L81:
            return r3
        L82:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = p047Q1.AbstractC0458e.f1256e
            if (r6 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L99
            p047Q1.AbstractC0458e.f1257f = r6     // Catch: java.lang.NoSuchFieldException -> L99
            r6.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            p047Q1.AbstractC0458e.f1256e = r3
        L9b:
            java.lang.reflect.Field r6 = p047Q1.AbstractC0458e.f1257f
            if (r6 == 0) goto La6
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r6 = r2
        La7:
            if (r6 == 0) goto Lb4
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = p027K.AbstractC0272P.m813c(r6, r9)
            if (r7 == 0) goto Lca
            goto Ld4
        Lca:
            if (r6 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        Ld0:
            boolean r3 = r9.dispatch(r8, r2, r8)
        Ld4:
            return r3
        Ld5:
            if (r7 == 0) goto Ldd
            boolean r7 = p027K.AbstractC0272P.m813c(r7, r9)
            if (r7 != 0) goto Le3
        Ldd:
            boolean r6 = r6.mo880e(r9)
            if (r6 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p047Q1.AbstractC0458e.m1202t(K.k, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    /* renamed from: u */
    public static final boolean m1203u(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* renamed from: v */
    public static final String m1204v(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p123v1.C1280j m1205w(javax.net.ssl.SSLSession r6) {
        /*
            d1.q r0 = p075d1.C0765q.f2996a
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L8c
            int r2 = r1.hashCode()
            r3 = 1019404634(0x3cc2e15a, float:0.023789097)
            if (r2 == r3) goto L20
            r3 = 1208658923(0x480aabeb, float:141999.67)
            if (r2 == r3) goto L17
            goto L28
        L17:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L80
            goto L28
        L20:
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L80
        L28:
            v1.b r2 = p123v1.C1277g.f5156t
            v1.g r1 = r2.m2959d(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L78
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L70
            v1.x r2 = p010D1.AbstractC0096d.m354s(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L52
            if (r3 == 0) goto L52
            int r4 = r3.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L52
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L52
            java.security.cert.Certificate[] r3 = (java.security.cert.Certificate[]) r3     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L52
            java.util.List r3 = p126w1.AbstractC1302b.m3003l(r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L52
            goto L53
        L52:
            r3 = r0
        L53:
            v1.j r4 = new v1.j
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L66
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.security.cert.Certificate[] r6 = (java.security.cert.Certificate[]) r6
            java.util.List r0 = p126w1.AbstractC1302b.m3003l(r6)
        L66:
            androidx.lifecycle.G r6 = new androidx.lifecycle.G
            r5 = 1
            r6.<init>(r5, r3)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L70:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L78:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            r6.<init>(r0)
            throw r6
        L80:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L8c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p047Q1.AbstractC0458e.m1205w(javax.net.ssl.SSLSession):v1.j");
    }

    /* renamed from: x */
    public static EnumC1288r m1206x(String str) {
        if (str.equals("http/1.0")) {
            return EnumC1288r.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return EnumC1288r.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC1288r.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return EnumC1288r.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC1288r.SPDY_3;
        }
        if (str.equals("quic")) {
            return EnumC1288r.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* renamed from: y */
    public static int m1207y(Context context, int i2, int i3) {
        Integer num;
        TypedValue m337Z = AbstractC0096d.m337Z(context, i2);
        if (m337Z != null) {
            int i4 = m337Z.resourceId;
            num = Integer.valueOf(i4 != 0 ? AbstractC0001b.m3a(context, i4) : m337Z.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i3;
    }

    /* renamed from: z */
    public static int m1208z(View view, int i2) {
        Context context = view.getContext();
        TypedValue m339b0 = AbstractC0096d.m339b0(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = m339b0.resourceId;
        return i3 != 0 ? AbstractC0001b.m3a(context, i3) : m339b0.data;
    }

    /* renamed from: B */
    public abstract InputFilter[] mo1209B(InputFilter[] inputFilterArr);

    /* renamed from: J */
    public abstract void mo1210J(Throwable th);

    /* renamed from: K */
    public abstract View mo1211K(int i2);

    /* renamed from: L */
    public abstract void mo448L(int i2);

    /* renamed from: M */
    public abstract void mo449M(Typeface typeface, boolean z2);

    /* renamed from: N */
    public abstract boolean mo1212N();

    /* renamed from: O */
    public abstract void mo1213O(C0605s c0605s);

    /* renamed from: U */
    public abstract void mo1214U(boolean z2);

    /* renamed from: W */
    public abstract void mo943W(boolean z2);

    /* renamed from: X */
    public abstract void mo1215X(boolean z2);

    /* renamed from: V */
    public void mo945V(boolean z2) {
    }
}
