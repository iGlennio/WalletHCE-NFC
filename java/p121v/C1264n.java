package p121v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p005C.AbstractC0044g;
import p107q.AbstractC1181e;
import p110r.AbstractC1187a;
import p113s.C1200a;
import p119u.AbstractC1245a;

/* renamed from: v.n */
/* loaded from: classes.dex */
public final class C1264n {

    /* renamed from: d */
    public static final int[] f5085d = {0, 4, 8};

    /* renamed from: e */
    public static final SparseIntArray f5086e;

    /* renamed from: f */
    public static final SparseIntArray f5087f;

    /* renamed from: a */
    public final HashMap f5088a = new HashMap();

    /* renamed from: b */
    public final boolean f5089b = true;

    /* renamed from: c */
    public final HashMap f5090c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5086e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5087f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* renamed from: c */
    public static int[] m2944c(C1251a c1251a, String str) {
        int i2;
        String[] split = str.split(",");
        Context context = c1251a.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            Object obj = null;
            try {
                i2 = AbstractC1266p.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && c1251a.isInEditMode() && (c1251a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1251a.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.f1851m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f1851m.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i2 = ((Integer) obj).intValue();
                }
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:129:0x05fc. Please report as an issue. */
    /* renamed from: d */
    public static C1259i m2945d(Context context, AttributeSet attributeSet, boolean z2) {
        int i2;
        String str;
        String str2;
        int i3;
        int i4;
        C1259i c1259i = new C1259i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? AbstractC1267q.f5093c : AbstractC1267q.f5091a);
        int[] iArr = f5085d;
        String[] strArr = AbstractC1187a.f4551a;
        SparseIntArray sparseIntArray = f5086e;
        C1262l c1262l = c1259i.f4984b;
        C1263m c1263m = c1259i.f4987e;
        C1261k c1261k = c1259i.f4985c;
        C1260j c1260j = c1259i.f4986d;
        String str3 = "ConstraintSet";
        if (z2) {
            C1258h c1258h = new C1258h();
            c1258h.f4971a = new int[10];
            c1258h.f4972b = new int[10];
            c1258h.f4973c = 0;
            c1258h.f4974d = new int[10];
            c1258h.f4975e = new float[10];
            c1258h.f4976f = 0;
            c1258h.f4977g = new int[5];
            c1258h.f4978h = new String[5];
            c1258h.f4979i = 0;
            c1258h.f4980j = new int[4];
            c1258h.f4981k = new boolean[4];
            c1258h.f4982l = 0;
            c1261k.getClass();
            c1260j.getClass();
            c1263m.getClass();
            int i5 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i5 < indexCount; indexCount = i4) {
                int index = obtainStyledAttributes.getIndex(i5);
                int i6 = i5;
                switch (f5087f.get(index)) {
                    case 2:
                        i4 = indexCount;
                        c1258h.m2936b(2, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f4998I));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i4 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i4 = indexCount;
                        c1258h.m2938d(obtainStyledAttributes.getString(index), 5);
                        break;
                    case 6:
                        i4 = indexCount;
                        c1258h.m2936b(6, obtainStyledAttributes.getDimensionPixelOffset(index, c1260j.f4992C));
                        break;
                    case 7:
                        i4 = indexCount;
                        c1258h.m2936b(7, obtainStyledAttributes.getDimensionPixelOffset(index, c1260j.f4993D));
                        break;
                    case 8:
                        i4 = indexCount;
                        c1258h.m2936b(8, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f4999J));
                        break;
                    case 11:
                        i4 = indexCount;
                        c1258h.m2936b(11, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5005P));
                        break;
                    case 12:
                        i4 = indexCount;
                        c1258h.m2936b(12, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5006Q));
                        break;
                    case 13:
                        i4 = indexCount;
                        c1258h.m2936b(13, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5002M));
                        break;
                    case 14:
                        i4 = indexCount;
                        c1258h.m2936b(14, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5004O));
                        break;
                    case 15:
                        i4 = indexCount;
                        c1258h.m2936b(15, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5007R));
                        break;
                    case 16:
                        i4 = indexCount;
                        c1258h.m2936b(16, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5003N));
                        break;
                    case 17:
                        i4 = indexCount;
                        c1258h.m2936b(17, obtainStyledAttributes.getDimensionPixelOffset(index, c1260j.f5022d));
                        break;
                    case 18:
                        i4 = indexCount;
                        c1258h.m2936b(18, obtainStyledAttributes.getDimensionPixelOffset(index, c1260j.f5024e));
                        break;
                    case 19:
                        i4 = indexCount;
                        c1258h.m2935a(19, obtainStyledAttributes.getFloat(index, c1260j.f5026f));
                        break;
                    case 20:
                        i4 = indexCount;
                        c1258h.m2935a(20, obtainStyledAttributes.getFloat(index, c1260j.f5053w));
                        break;
                    case 21:
                        i4 = indexCount;
                        c1258h.m2936b(21, obtainStyledAttributes.getLayoutDimension(index, c1260j.f5020c));
                        break;
                    case 22:
                        i4 = indexCount;
                        c1258h.m2936b(22, iArr[obtainStyledAttributes.getInt(index, c1262l.f5067a)]);
                        break;
                    case 23:
                        i4 = indexCount;
                        c1258h.m2936b(23, obtainStyledAttributes.getLayoutDimension(index, c1260j.f5018b));
                        break;
                    case 24:
                        i4 = indexCount;
                        c1258h.m2936b(24, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f4995F));
                        break;
                    case 27:
                        i4 = indexCount;
                        c1258h.m2936b(27, obtainStyledAttributes.getInt(index, c1260j.f4994E));
                        break;
                    case 28:
                        i4 = indexCount;
                        c1258h.m2936b(28, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f4996G));
                        break;
                    case 31:
                        i4 = indexCount;
                        c1258h.m2936b(31, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5000K));
                        break;
                    case 34:
                        i4 = indexCount;
                        c1258h.m2936b(34, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f4997H));
                        break;
                    case 37:
                        i4 = indexCount;
                        c1258h.m2935a(37, obtainStyledAttributes.getFloat(index, c1260j.f5054x));
                        break;
                    case 38:
                        i4 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c1259i.f4983a);
                        c1259i.f4983a = resourceId;
                        c1258h.m2936b(38, resourceId);
                        break;
                    case 39:
                        i4 = indexCount;
                        c1258h.m2935a(39, obtainStyledAttributes.getFloat(index, c1260j.f5010U));
                        break;
                    case 40:
                        i4 = indexCount;
                        c1258h.m2935a(40, obtainStyledAttributes.getFloat(index, c1260j.f5009T));
                        break;
                    case 41:
                        i4 = indexCount;
                        c1258h.m2936b(41, obtainStyledAttributes.getInt(index, c1260j.f5011V));
                        break;
                    case 42:
                        i4 = indexCount;
                        c1258h.m2936b(42, obtainStyledAttributes.getInt(index, c1260j.f5012W));
                        break;
                    case 43:
                        i4 = indexCount;
                        c1258h.m2935a(43, obtainStyledAttributes.getFloat(index, c1262l.f5069c));
                        break;
                    case 44:
                        i4 = indexCount;
                        c1258h.m2937c(44, true);
                        c1258h.m2935a(44, obtainStyledAttributes.getDimension(index, c1263m.f5084m));
                        break;
                    case 45:
                        i4 = indexCount;
                        c1258h.m2935a(45, obtainStyledAttributes.getFloat(index, c1263m.f5073b));
                        break;
                    case 46:
                        i4 = indexCount;
                        c1258h.m2935a(46, obtainStyledAttributes.getFloat(index, c1263m.f5074c));
                        break;
                    case 47:
                        i4 = indexCount;
                        c1258h.m2935a(47, obtainStyledAttributes.getFloat(index, c1263m.f5075d));
                        break;
                    case 48:
                        i4 = indexCount;
                        c1258h.m2935a(48, obtainStyledAttributes.getFloat(index, c1263m.f5076e));
                        break;
                    case 49:
                        i4 = indexCount;
                        c1258h.m2935a(49, obtainStyledAttributes.getDimension(index, c1263m.f5077f));
                        break;
                    case 50:
                        i4 = indexCount;
                        c1258h.m2935a(50, obtainStyledAttributes.getDimension(index, c1263m.f5078g));
                        break;
                    case 51:
                        i4 = indexCount;
                        c1258h.m2935a(51, obtainStyledAttributes.getDimension(index, c1263m.f5080i));
                        break;
                    case 52:
                        i4 = indexCount;
                        c1258h.m2935a(52, obtainStyledAttributes.getDimension(index, c1263m.f5081j));
                        break;
                    case 53:
                        i4 = indexCount;
                        c1258h.m2935a(53, obtainStyledAttributes.getDimension(index, c1263m.f5082k));
                        break;
                    case 54:
                        i4 = indexCount;
                        c1258h.m2936b(54, obtainStyledAttributes.getInt(index, c1260j.f5013X));
                        break;
                    case 55:
                        i4 = indexCount;
                        c1258h.m2936b(55, obtainStyledAttributes.getInt(index, c1260j.f5014Y));
                        break;
                    case 56:
                        i4 = indexCount;
                        c1258h.m2936b(56, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5015Z));
                        break;
                    case 57:
                        i4 = indexCount;
                        c1258h.m2936b(57, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5017a0));
                        break;
                    case 58:
                        i4 = indexCount;
                        c1258h.m2936b(58, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5019b0));
                        break;
                    case 59:
                        i4 = indexCount;
                        c1258h.m2936b(59, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5021c0));
                        break;
                    case 60:
                        i4 = indexCount;
                        c1258h.m2935a(60, obtainStyledAttributes.getFloat(index, c1263m.f5072a));
                        break;
                    case 62:
                        i4 = indexCount;
                        c1258h.m2936b(62, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f4990A));
                        break;
                    case 63:
                        i4 = indexCount;
                        c1258h.m2935a(63, obtainStyledAttributes.getFloat(index, c1260j.f4991B));
                        break;
                    case 64:
                        i4 = indexCount;
                        c1258h.m2936b(64, m2946f(obtainStyledAttributes, index, c1261k.f5058a));
                        break;
                    case 65:
                        i4 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            c1258h.m2938d(obtainStyledAttributes.getString(index), 65);
                        } else {
                            c1258h.m2938d(strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        break;
                    case 66:
                        i4 = indexCount;
                        c1258h.m2936b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i4 = indexCount;
                        c1258h.m2935a(67, obtainStyledAttributes.getFloat(index, c1261k.f5062e));
                        break;
                    case 68:
                        i4 = indexCount;
                        c1258h.m2935a(68, obtainStyledAttributes.getFloat(index, c1262l.f5070d));
                        break;
                    case 69:
                        i4 = indexCount;
                        c1258h.m2935a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i4 = indexCount;
                        c1258h.m2935a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i4 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i4 = indexCount;
                        c1258h.m2936b(72, obtainStyledAttributes.getInt(index, c1260j.f5027f0));
                        break;
                    case 73:
                        i4 = indexCount;
                        c1258h.m2936b(73, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5029g0));
                        break;
                    case 74:
                        i4 = indexCount;
                        c1258h.m2938d(obtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i4 = indexCount;
                        c1258h.m2937c(75, obtainStyledAttributes.getBoolean(index, c1260j.f5043n0));
                        break;
                    case 76:
                        i4 = indexCount;
                        c1258h.m2936b(76, obtainStyledAttributes.getInt(index, c1261k.f5060c));
                        break;
                    case 77:
                        i4 = indexCount;
                        c1258h.m2938d(obtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i4 = indexCount;
                        c1258h.m2936b(78, obtainStyledAttributes.getInt(index, c1262l.f5068b));
                        break;
                    case 79:
                        i4 = indexCount;
                        c1258h.m2935a(79, obtainStyledAttributes.getFloat(index, c1261k.f5061d));
                        break;
                    case 80:
                        i4 = indexCount;
                        c1258h.m2937c(80, obtainStyledAttributes.getBoolean(index, c1260j.f5039l0));
                        break;
                    case 81:
                        i4 = indexCount;
                        c1258h.m2937c(81, obtainStyledAttributes.getBoolean(index, c1260j.f5041m0));
                        break;
                    case 82:
                        i4 = indexCount;
                        c1258h.m2936b(82, obtainStyledAttributes.getInteger(index, c1261k.f5059b));
                        break;
                    case 83:
                        i4 = indexCount;
                        c1258h.m2936b(83, m2946f(obtainStyledAttributes, index, c1263m.f5079h));
                        break;
                    case 84:
                        i4 = indexCount;
                        c1258h.m2936b(84, obtainStyledAttributes.getInteger(index, c1261k.f5064g));
                        break;
                    case 85:
                        i4 = indexCount;
                        c1258h.m2935a(85, obtainStyledAttributes.getFloat(index, c1261k.f5063f));
                        break;
                    case 86:
                        i4 = indexCount;
                        int i7 = obtainStyledAttributes.peekValue(index).type;
                        if (i7 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            c1261k.f5066i = resourceId2;
                            c1258h.m2936b(89, resourceId2);
                            if (c1261k.f5066i != -1) {
                                c1258h.m2936b(88, -2);
                            }
                        } else if (i7 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            c1261k.f5065h = string;
                            c1258h.m2938d(string, 90);
                            if (c1261k.f5065h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                c1261k.f5066i = resourceId3;
                                c1258h.m2936b(89, resourceId3);
                                c1258h.m2936b(88, -2);
                            } else {
                                c1258h.m2936b(88, -1);
                            }
                        } else {
                            c1258h.m2936b(88, obtainStyledAttributes.getInteger(index, c1261k.f5066i));
                        }
                        break;
                    case 87:
                        i4 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i4 = indexCount;
                        c1258h.m2936b(93, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5001L));
                        break;
                    case 94:
                        i4 = indexCount;
                        c1258h.m2936b(94, obtainStyledAttributes.getDimensionPixelSize(index, c1260j.f5008S));
                        break;
                    case 95:
                        i4 = indexCount;
                        m2947g(c1258h, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i4 = indexCount;
                        m2947g(c1258h, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i4 = indexCount;
                        c1258h.m2936b(97, obtainStyledAttributes.getInt(index, c1260j.f5045o0));
                        break;
                    case 98:
                        i4 = indexCount;
                        int i8 = AbstractC1245a.f4855s;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                        } else {
                            c1259i.f4983a = obtainStyledAttributes.getResourceId(index, c1259i.f4983a);
                        }
                        break;
                    case 99:
                        i4 = indexCount;
                        c1258h.m2937c(99, obtainStyledAttributes.getBoolean(index, c1260j.f5028g));
                        break;
                }
                i5 = i6 + 1;
            }
        } else {
            String str4 = "CURRENTLY UNSUPPORTED";
            int i9 = 1;
            int i10 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i10 < indexCount2; indexCount2 = i2) {
                int index2 = obtainStyledAttributes.getIndex(i10);
                if (index2 != i9 && 23 != index2) {
                    if (24 != index2) {
                        c1261k.getClass();
                        c1260j.getClass();
                        c1263m.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5046p = m2946f(obtainStyledAttributes, index2, c1260j.f5046p);
                        i3 = 1;
                        break;
                    case 2:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4998I = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f4998I);
                        i3 = 1;
                        break;
                    case 3:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5044o = m2946f(obtainStyledAttributes, index2, c1260j.f5044o);
                        i3 = 1;
                        break;
                    case 4:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5042n = m2946f(obtainStyledAttributes, index2, c1260j.f5042n);
                        i3 = 1;
                        break;
                    case 5:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5055y = obtainStyledAttributes.getString(index2);
                        i3 = 1;
                        break;
                    case 6:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4992C = obtainStyledAttributes.getDimensionPixelOffset(index2, c1260j.f4992C);
                        i3 = 1;
                        break;
                    case 7:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4993D = obtainStyledAttributes.getDimensionPixelOffset(index2, c1260j.f4993D);
                        i3 = 1;
                        break;
                    case 8:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4999J = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f4999J);
                        i3 = 1;
                        break;
                    case 9:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5052v = m2946f(obtainStyledAttributes, index2, c1260j.f5052v);
                        i3 = 1;
                        break;
                    case 10:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5051u = m2946f(obtainStyledAttributes, index2, c1260j.f5051u);
                        i3 = 1;
                        break;
                    case 11:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5005P = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5005P);
                        i3 = 1;
                        break;
                    case 12:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5006Q = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5006Q);
                        i3 = 1;
                        break;
                    case 13:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5002M = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5002M);
                        i3 = 1;
                        break;
                    case 14:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5004O = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5004O);
                        i3 = 1;
                        break;
                    case 15:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5007R = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5007R);
                        i3 = 1;
                        break;
                    case 16:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5003N = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5003N);
                        i3 = 1;
                        break;
                    case 17:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5022d = obtainStyledAttributes.getDimensionPixelOffset(index2, c1260j.f5022d);
                        i3 = 1;
                        break;
                    case 18:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5024e = obtainStyledAttributes.getDimensionPixelOffset(index2, c1260j.f5024e);
                        i3 = 1;
                        break;
                    case 19:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5026f = obtainStyledAttributes.getFloat(index2, c1260j.f5026f);
                        i3 = 1;
                        break;
                    case 20:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5053w = obtainStyledAttributes.getFloat(index2, c1260j.f5053w);
                        i3 = 1;
                        break;
                    case 21:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5020c = obtainStyledAttributes.getLayoutDimension(index2, c1260j.f5020c);
                        i3 = 1;
                        break;
                    case 22:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        int i11 = obtainStyledAttributes.getInt(index2, c1262l.f5067a);
                        c1262l.f5067a = i11;
                        c1262l.f5067a = iArr[i11];
                        i3 = 1;
                        break;
                    case 23:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5018b = obtainStyledAttributes.getLayoutDimension(index2, c1260j.f5018b);
                        i3 = 1;
                        break;
                    case 24:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4995F = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f4995F);
                        i3 = 1;
                        break;
                    case 25:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5030h = m2946f(obtainStyledAttributes, index2, c1260j.f5030h);
                        i3 = 1;
                        break;
                    case 26:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5032i = m2946f(obtainStyledAttributes, index2, c1260j.f5032i);
                        i3 = 1;
                        break;
                    case 27:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4994E = obtainStyledAttributes.getInt(index2, c1260j.f4994E);
                        i3 = 1;
                        break;
                    case 28:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4996G = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f4996G);
                        i3 = 1;
                        break;
                    case 29:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5034j = m2946f(obtainStyledAttributes, index2, c1260j.f5034j);
                        i3 = 1;
                        break;
                    case 30:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5036k = m2946f(obtainStyledAttributes, index2, c1260j.f5036k);
                        i3 = 1;
                        break;
                    case 31:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5000K = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5000K);
                        i3 = 1;
                        break;
                    case 32:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5049s = m2946f(obtainStyledAttributes, index2, c1260j.f5049s);
                        i3 = 1;
                        break;
                    case 33:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5050t = m2946f(obtainStyledAttributes, index2, c1260j.f5050t);
                        i3 = 1;
                        break;
                    case 34:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4997H = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f4997H);
                        i3 = 1;
                        break;
                    case 35:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5040m = m2946f(obtainStyledAttributes, index2, c1260j.f5040m);
                        i3 = 1;
                        break;
                    case 36:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5038l = m2946f(obtainStyledAttributes, index2, c1260j.f5038l);
                        i3 = 1;
                        break;
                    case 37:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5054x = obtainStyledAttributes.getFloat(index2, c1260j.f5054x);
                        i3 = 1;
                        break;
                    case 38:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1259i.f4983a = obtainStyledAttributes.getResourceId(index2, c1259i.f4983a);
                        i3 = 1;
                        break;
                    case 39:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5010U = obtainStyledAttributes.getFloat(index2, c1260j.f5010U);
                        i3 = 1;
                        break;
                    case 40:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5009T = obtainStyledAttributes.getFloat(index2, c1260j.f5009T);
                        i3 = 1;
                        break;
                    case 41:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5011V = obtainStyledAttributes.getInt(index2, c1260j.f5011V);
                        i3 = 1;
                        break;
                    case 42:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5012W = obtainStyledAttributes.getInt(index2, c1260j.f5012W);
                        i3 = 1;
                        break;
                    case 43:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1262l.f5069c = obtainStyledAttributes.getFloat(index2, c1262l.f5069c);
                        i3 = 1;
                        break;
                    case 44:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5083l = true;
                        c1263m.f5084m = obtainStyledAttributes.getDimension(index2, c1263m.f5084m);
                        i3 = 1;
                        break;
                    case 45:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5073b = obtainStyledAttributes.getFloat(index2, c1263m.f5073b);
                        i3 = 1;
                        break;
                    case 46:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5074c = obtainStyledAttributes.getFloat(index2, c1263m.f5074c);
                        i3 = 1;
                        break;
                    case 47:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5075d = obtainStyledAttributes.getFloat(index2, c1263m.f5075d);
                        i3 = 1;
                        break;
                    case 48:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5076e = obtainStyledAttributes.getFloat(index2, c1263m.f5076e);
                        i3 = 1;
                        break;
                    case 49:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5077f = obtainStyledAttributes.getDimension(index2, c1263m.f5077f);
                        i3 = 1;
                        break;
                    case 50:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5078g = obtainStyledAttributes.getDimension(index2, c1263m.f5078g);
                        i3 = 1;
                        break;
                    case 51:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5080i = obtainStyledAttributes.getDimension(index2, c1263m.f5080i);
                        i3 = 1;
                        break;
                    case 52:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5081j = obtainStyledAttributes.getDimension(index2, c1263m.f5081j);
                        i3 = 1;
                        break;
                    case 53:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5082k = obtainStyledAttributes.getDimension(index2, c1263m.f5082k);
                        i3 = 1;
                        break;
                    case 54:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5013X = obtainStyledAttributes.getInt(index2, c1260j.f5013X);
                        i3 = 1;
                        break;
                    case 55:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5014Y = obtainStyledAttributes.getInt(index2, c1260j.f5014Y);
                        i3 = 1;
                        break;
                    case 56:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5015Z = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5015Z);
                        i3 = 1;
                        break;
                    case 57:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5017a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5017a0);
                        i3 = 1;
                        break;
                    case 58:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5019b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5019b0);
                        i3 = 1;
                        break;
                    case 59:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5021c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5021c0);
                        i3 = 1;
                        break;
                    case 60:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1263m.f5072a = obtainStyledAttributes.getFloat(index2, c1263m.f5072a);
                        i3 = 1;
                        break;
                    case 61:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f5056z = m2946f(obtainStyledAttributes, index2, c1260j.f5056z);
                        i3 = 1;
                        break;
                    case 62:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4990A = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f4990A);
                        i3 = 1;
                        break;
                    case 63:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1260j.f4991B = obtainStyledAttributes.getFloat(index2, c1260j.f4991B);
                        i3 = 1;
                        break;
                    case 64:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        c1261k.f5058a = m2946f(obtainStyledAttributes, index2, c1261k.f5058a);
                        i3 = 1;
                        break;
                    case 65:
                        i2 = indexCount2;
                        str = str4;
                        str2 = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            c1261k.getClass();
                            i3 = 1;
                            break;
                        } else {
                            String str5 = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            c1261k.getClass();
                            i3 = 1;
                        }
                    case 66:
                        i2 = indexCount2;
                        str = str4;
                        obtainStyledAttributes.getInt(index2, 0);
                        c1261k.getClass();
                        str2 = str3;
                        i3 = 1;
                        break;
                    case 67:
                        i2 = indexCount2;
                        str = str4;
                        c1261k.f5062e = obtainStyledAttributes.getFloat(index2, c1261k.f5062e);
                        str2 = str3;
                        i3 = 1;
                        break;
                    case 68:
                        i2 = indexCount2;
                        str = str4;
                        c1262l.f5070d = obtainStyledAttributes.getFloat(index2, c1262l.f5070d);
                        str2 = str3;
                        i3 = 1;
                        break;
                    case 69:
                        i2 = indexCount2;
                        str = str4;
                        c1260j.f5023d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i3 = 1;
                        break;
                    case 70:
                        i2 = indexCount2;
                        str = str4;
                        c1260j.f5025e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        str2 = str3;
                        i3 = 1;
                        break;
                    case 71:
                        i2 = indexCount2;
                        str = str4;
                        Log.e(str3, str);
                        str2 = str3;
                        i3 = 1;
                        break;
                    case 72:
                        i2 = indexCount2;
                        c1260j.f5027f0 = obtainStyledAttributes.getInt(index2, c1260j.f5027f0);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 73:
                        i2 = indexCount2;
                        c1260j.f5029g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5029g0);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 74:
                        i2 = indexCount2;
                        c1260j.f5035j0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 75:
                        i2 = indexCount2;
                        c1260j.f5043n0 = obtainStyledAttributes.getBoolean(index2, c1260j.f5043n0);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 76:
                        i2 = indexCount2;
                        c1261k.f5060c = obtainStyledAttributes.getInt(index2, c1261k.f5060c);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 77:
                        i2 = indexCount2;
                        c1260j.f5037k0 = obtainStyledAttributes.getString(index2);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 78:
                        i2 = indexCount2;
                        c1262l.f5068b = obtainStyledAttributes.getInt(index2, c1262l.f5068b);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 79:
                        i2 = indexCount2;
                        c1261k.f5061d = obtainStyledAttributes.getFloat(index2, c1261k.f5061d);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 80:
                        i2 = indexCount2;
                        c1260j.f5039l0 = obtainStyledAttributes.getBoolean(index2, c1260j.f5039l0);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 81:
                        i2 = indexCount2;
                        c1260j.f5041m0 = obtainStyledAttributes.getBoolean(index2, c1260j.f5041m0);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 82:
                        i2 = indexCount2;
                        c1261k.f5059b = obtainStyledAttributes.getInteger(index2, c1261k.f5059b);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 83:
                        i2 = indexCount2;
                        c1263m.f5079h = m2946f(obtainStyledAttributes, index2, c1263m.f5079h);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 84:
                        i2 = indexCount2;
                        c1261k.f5064g = obtainStyledAttributes.getInteger(index2, c1261k.f5064g);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 85:
                        i2 = indexCount2;
                        c1261k.f5063f = obtainStyledAttributes.getFloat(index2, c1261k.f5063f);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 86:
                        i2 = indexCount2;
                        int i12 = obtainStyledAttributes.peekValue(index2).type;
                        if (i12 == 1) {
                            c1261k.f5066i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i12 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            c1261k.f5065h = string2;
                            if (string2.indexOf("/") > 0) {
                                c1261k.f5066i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, c1261k.f5066i);
                        }
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 87:
                        i2 = indexCount2;
                        Log.w(str3, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str3, sb2.toString());
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 91:
                        i2 = indexCount2;
                        c1260j.f5047q = m2946f(obtainStyledAttributes, index2, c1260j.f5047q);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 92:
                        i2 = indexCount2;
                        c1260j.f5048r = m2946f(obtainStyledAttributes, index2, c1260j.f5048r);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 93:
                        i2 = indexCount2;
                        c1260j.f5001L = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5001L);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 94:
                        i2 = indexCount2;
                        c1260j.f5008S = obtainStyledAttributes.getDimensionPixelSize(index2, c1260j.f5008S);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 95:
                        i2 = indexCount2;
                        m2947g(c1260j, obtainStyledAttributes, index2, 0);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                    case 96:
                        i2 = indexCount2;
                        m2947g(c1260j, obtainStyledAttributes, index2, 1);
                        i3 = 1;
                        str = str4;
                        str2 = str3;
                        break;
                    case 97:
                        i2 = indexCount2;
                        c1260j.f5045o0 = obtainStyledAttributes.getInt(index2, c1260j.f5045o0);
                        str = str4;
                        i3 = 1;
                        str2 = str3;
                        break;
                }
                i10++;
                i9 = i3;
                str3 = str2;
                str4 = str;
            }
            if (c1260j.f5035j0 != null) {
                c1260j.f5033i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c1259i;
    }

    /* renamed from: f */
    public static int m2946f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2947g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p121v.C1264n.m2947g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: h */
    public static void m2948h(C1255e c1255e, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1255e.f4896G = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void m2949a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i2;
        HashSet hashSet2;
        String str;
        int i3;
        String str2;
        C1264n c1264n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c1264n.f5090c;
        HashSet hashSet3 = new HashSet(hashMap.keySet());
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                sb.append(str2);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c1264n.f5089b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet3.remove(Integer.valueOf(id));
                        C1259i c1259i = (C1259i) hashMap.get(Integer.valueOf(id));
                        if (c1259i != null) {
                            if (childAt instanceof C1251a) {
                                C1260j c1260j = c1259i.f4986d;
                                c1260j.f5031h0 = 1;
                                C1251a c1251a = (C1251a) childAt;
                                c1251a.setId(id);
                                c1251a.setType(c1260j.f5027f0);
                                c1251a.setMargin(c1260j.f5029g0);
                                c1251a.setAllowsGoneWidget(c1260j.f5043n0);
                                int[] iArr = c1260j.f5033i0;
                                if (iArr != null) {
                                    c1251a.setReferencedIds(iArr);
                                } else {
                                    String str3 = c1260j.f5035j0;
                                    if (str3 != null) {
                                        int[] m2944c = m2944c(c1251a, str3);
                                        c1260j.f5033i0 = m2944c;
                                        c1251a.setReferencedIds(m2944c);
                                    }
                                }
                            }
                            C1255e c1255e = (C1255e) childAt.getLayoutParams();
                            c1255e.m2932a();
                            c1259i.m2939a(c1255e);
                            HashMap hashMap2 = c1259i.f4988f;
                            Class<?> cls = childAt.getClass();
                            for (String str4 : hashMap2.keySet()) {
                                C1252b c1252b = (C1252b) hashMap2.get(str4);
                                if (c1252b.f4875a) {
                                    hashSet2 = hashSet3;
                                    str = str4;
                                } else {
                                    hashSet2 = hashSet3;
                                    str = "set" + str4;
                                }
                                try {
                                    int m2740a = AbstractC1181e.m2740a(c1252b.f4876b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (m2740a) {
                                        case 0:
                                            i3 = i4;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c1252b.f4877c));
                                            break;
                                        case 1:
                                            i3 = i4;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(c1252b.f4878d));
                                            break;
                                        case 2:
                                            i3 = i4;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c1252b.f4881g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            i3 = i4;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c1252b.f4881g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder m156h = AbstractC0044g.m156h(" Custom Attribute \"", str4, "\" not found on ");
                                                m156h.append(cls.getName());
                                                Log.e("TransitionLayout", m156h.toString());
                                                e.printStackTrace();
                                                hashSet3 = hashSet2;
                                                i4 = i3;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str);
                                                hashSet3 = hashSet2;
                                                i4 = i3;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder m156h2 = AbstractC0044g.m156h(" Custom Attribute \"", str4, "\" not found on ");
                                                m156h2.append(cls.getName());
                                                Log.e("TransitionLayout", m156h2.toString());
                                                e.printStackTrace();
                                                hashSet3 = hashSet2;
                                                i4 = i3;
                                            }
                                        case 4:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, c1252b.f4879e);
                                            i3 = i4;
                                            break;
                                        case 5:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1252b.f4880f));
                                            i3 = i4;
                                            break;
                                        case 6:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(c1252b.f4878d));
                                            i3 = i4;
                                            break;
                                        case 7:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(c1252b.f4877c));
                                            i3 = i4;
                                            break;
                                        default:
                                            i3 = i4;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i3 = i4;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i3 = i4;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i3 = i4;
                                }
                                hashSet3 = hashSet2;
                                i4 = i3;
                            }
                            hashSet = hashSet3;
                            i2 = i4;
                            childAt.setLayoutParams(c1255e);
                            C1262l c1262l = c1259i.f4984b;
                            if (c1262l.f5068b == 0) {
                                childAt.setVisibility(c1262l.f5067a);
                            }
                            childAt.setAlpha(c1262l.f5069c);
                            C1263m c1263m = c1259i.f4987e;
                            childAt.setRotation(c1263m.f5072a);
                            childAt.setRotationX(c1263m.f5073b);
                            childAt.setRotationY(c1263m.f5074c);
                            childAt.setScaleX(c1263m.f5075d);
                            childAt.setScaleY(c1263m.f5076e);
                            if (c1263m.f5079h != -1) {
                                if (((View) childAt.getParent()).findViewById(c1263m.f5079h) != null) {
                                    float bottom = (r1.getBottom() + r1.getTop()) / 2.0f;
                                    float right = (r1.getRight() + r1.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c1263m.f5077f)) {
                                    childAt.setPivotX(c1263m.f5077f);
                                }
                                if (!Float.isNaN(c1263m.f5078g)) {
                                    childAt.setPivotY(c1263m.f5078g);
                                }
                            }
                            childAt.setTranslationX(c1263m.f5080i);
                            childAt.setTranslationY(c1263m.f5081j);
                            childAt.setTranslationZ(c1263m.f5082k);
                            if (c1263m.f5083l) {
                                childAt.setElevation(c1263m.f5084m);
                            }
                        }
                    } else {
                        hashSet = hashSet3;
                        i2 = i4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i4 = i2 + 1;
                    c1264n = this;
                    hashSet3 = hashSet;
                }
            }
            hashSet = hashSet3;
            i2 = i4;
            i4 = i2 + 1;
            c1264n = this;
            hashSet3 = hashSet;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C1259i c1259i2 = (C1259i) hashMap.get(num);
            if (c1259i2 != null) {
                C1260j c1260j2 = c1259i2.f4986d;
                if (c1260j2.f5031h0 == 1) {
                    Context context = constraintLayout.getContext();
                    C1251a c1251a2 = new C1251a(context);
                    c1251a2.f4882a = new int[32];
                    c1251a2.f4888g = new HashMap();
                    c1251a2.f4884c = context;
                    C1200a c1200a = new C1200a();
                    c1200a.f4571s0 = 0;
                    c1200a.f4572t0 = true;
                    c1200a.f4573u0 = 0;
                    c1200a.f4574v0 = false;
                    c1251a2.f4874j = c1200a;
                    c1251a2.f4885d = c1200a;
                    c1251a2.m2931i();
                    c1251a2.setVisibility(8);
                    c1251a2.setId(num.intValue());
                    int[] iArr2 = c1260j2.f5033i0;
                    if (iArr2 != null) {
                        c1251a2.setReferencedIds(iArr2);
                    } else {
                        String str5 = c1260j2.f5035j0;
                        if (str5 != null) {
                            int[] m2944c2 = m2944c(c1251a2, str5);
                            c1260j2.f5033i0 = m2944c2;
                            c1251a2.setReferencedIds(m2944c2);
                        }
                    }
                    c1251a2.setType(c1260j2.f5027f0);
                    c1251a2.setMargin(c1260j2.f5029g0);
                    C1255e m1448g = ConstraintLayout.m1448g();
                    c1251a2.m2931i();
                    c1259i2.m2939a(m1448g);
                    constraintLayout.addView(c1251a2, m1448g);
                }
                if (c1260j2.f5016a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C1255e m1448g2 = ConstraintLayout.m1448g();
                    c1259i2.m2939a(m1448g2);
                    constraintLayout.addView(guideline, m1448g2);
                }
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof AbstractC1253c) {
                ((AbstractC1253c) childAt2).mo2928e(constraintLayout);
            }
        }
    }

    /* renamed from: b */
    public final void m2950b(ConstraintLayout constraintLayout) {
        int i2;
        int i3;
        C1264n c1264n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c1264n.f5090c;
        hashMap.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            C1255e c1255e = (C1255e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1264n.f5089b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C1259i());
            }
            C1259i c1259i = (C1259i) hashMap.get(Integer.valueOf(id));
            if (c1259i == null) {
                i2 = childCount;
            } else {
                HashMap hashMap2 = c1264n.f5088a;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    C1252b c1252b = (C1252b) hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C1252b(c1252b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i3 = childCount;
                        } else {
                            i3 = childCount;
                            try {
                                hashMap3.put(str, new C1252b(c1252b, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                                childCount = i3;
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                                childCount = i3;
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                                childCount = i3;
                            }
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        i3 = childCount;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        i3 = childCount;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        i3 = childCount;
                    }
                    childCount = i3;
                }
                i2 = childCount;
                c1259i.f4988f = hashMap3;
                c1259i.f4983a = id;
                int i5 = c1255e.f4924e;
                C1260j c1260j = c1259i.f4986d;
                c1260j.f5030h = i5;
                c1260j.f5032i = c1255e.f4926f;
                c1260j.f5034j = c1255e.f4928g;
                c1260j.f5036k = c1255e.f4930h;
                c1260j.f5038l = c1255e.f4932i;
                c1260j.f5040m = c1255e.f4934j;
                c1260j.f5042n = c1255e.f4936k;
                c1260j.f5044o = c1255e.f4938l;
                c1260j.f5046p = c1255e.f4940m;
                c1260j.f5047q = c1255e.f4942n;
                c1260j.f5048r = c1255e.f4944o;
                c1260j.f5049s = c1255e.f4950s;
                c1260j.f5050t = c1255e.f4951t;
                c1260j.f5051u = c1255e.f4952u;
                c1260j.f5052v = c1255e.f4953v;
                c1260j.f5053w = c1255e.f4894E;
                c1260j.f5054x = c1255e.f4895F;
                c1260j.f5055y = c1255e.f4896G;
                c1260j.f5056z = c1255e.f4946p;
                c1260j.f4990A = c1255e.f4948q;
                c1260j.f4991B = c1255e.f4949r;
                c1260j.f4992C = c1255e.f4909T;
                c1260j.f4993D = c1255e.f4910U;
                c1260j.f4994E = c1255e.f4911V;
                c1260j.f5026f = c1255e.f4920c;
                c1260j.f5022d = c1255e.f4916a;
                c1260j.f5024e = c1255e.f4918b;
                c1260j.f5018b = ((ViewGroup.MarginLayoutParams) c1255e).width;
                c1260j.f5020c = ((ViewGroup.MarginLayoutParams) c1255e).height;
                c1260j.f4995F = ((ViewGroup.MarginLayoutParams) c1255e).leftMargin;
                c1260j.f4996G = ((ViewGroup.MarginLayoutParams) c1255e).rightMargin;
                c1260j.f4997H = ((ViewGroup.MarginLayoutParams) c1255e).topMargin;
                c1260j.f4998I = ((ViewGroup.MarginLayoutParams) c1255e).bottomMargin;
                c1260j.f5001L = c1255e.f4893D;
                c1260j.f5009T = c1255e.f4898I;
                c1260j.f5010U = c1255e.f4897H;
                c1260j.f5012W = c1255e.f4900K;
                c1260j.f5011V = c1255e.f4899J;
                c1260j.f5039l0 = c1255e.f4912W;
                c1260j.f5041m0 = c1255e.f4913X;
                c1260j.f5013X = c1255e.f4901L;
                c1260j.f5014Y = c1255e.f4902M;
                c1260j.f5015Z = c1255e.f4905P;
                c1260j.f5017a0 = c1255e.f4906Q;
                c1260j.f5019b0 = c1255e.f4903N;
                c1260j.f5021c0 = c1255e.f4904O;
                c1260j.f5023d0 = c1255e.f4907R;
                c1260j.f5025e0 = c1255e.f4908S;
                c1260j.f5037k0 = c1255e.f4914Y;
                c1260j.f5003N = c1255e.f4955x;
                c1260j.f5005P = c1255e.f4957z;
                c1260j.f5002M = c1255e.f4954w;
                c1260j.f5004O = c1255e.f4956y;
                c1260j.f5007R = c1255e.f4890A;
                c1260j.f5006Q = c1255e.f4891B;
                c1260j.f5008S = c1255e.f4892C;
                c1260j.f5045o0 = c1255e.f4915Z;
                c1260j.f4999J = c1255e.getMarginEnd();
                c1260j.f5000K = c1255e.getMarginStart();
                int visibility = childAt.getVisibility();
                C1262l c1262l = c1259i.f4984b;
                c1262l.f5067a = visibility;
                c1262l.f5069c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C1263m c1263m = c1259i.f4987e;
                c1263m.f5072a = rotation;
                c1263m.f5073b = childAt.getRotationX();
                c1263m.f5074c = childAt.getRotationY();
                c1263m.f5075d = childAt.getScaleX();
                c1263m.f5076e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c1263m.f5077f = pivotX;
                    c1263m.f5078g = pivotY;
                }
                c1263m.f5080i = childAt.getTranslationX();
                c1263m.f5081j = childAt.getTranslationY();
                c1263m.f5082k = childAt.getTranslationZ();
                if (c1263m.f5083l) {
                    c1263m.f5084m = childAt.getElevation();
                }
                if (childAt instanceof C1251a) {
                    C1251a c1251a = (C1251a) childAt;
                    c1260j.f5043n0 = c1251a.getAllowsGoneWidget();
                    c1260j.f5033i0 = c1251a.getReferencedIds();
                    c1260j.f5027f0 = c1251a.getType();
                    c1260j.f5029g0 = c1251a.getMargin();
                }
            }
            i4++;
            c1264n = this;
            childCount = i2;
        }
    }

    /* renamed from: e */
    public final void m2951e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1259i m2945d = m2945d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m2945d.f4986d.f5016a = true;
                    }
                    this.f5090c.put(Integer.valueOf(m2945d.f4983a), m2945d);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
