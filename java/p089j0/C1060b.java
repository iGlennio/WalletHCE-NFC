package p089j0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public final class C1060b extends Property {

    /* renamed from: a */
    public final /* synthetic */ int f4152a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1060b(Class cls, String str, int i2) {
        super(cls, str);
        this.f4152a = i2;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f4152a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC1081w.f4222a.mo361I((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f4152a) {
            case 0:
                C1063e c1063e = (C1063e) obj;
                PointF pointF = (PointF) obj2;
                c1063e.getClass();
                c1063e.f4155a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c1063e.f4156b = round;
                int i2 = c1063e.f4160f + 1;
                c1063e.f4160f = i2;
                if (i2 == c1063e.f4161g) {
                    AbstractC1081w.m2605a(c1063e.f4159e, c1063e.f4155a, round, c1063e.f4157c, c1063e.f4158d);
                    c1063e.f4160f = 0;
                    c1063e.f4161g = 0;
                    break;
                }
                break;
            case 1:
                C1063e c1063e2 = (C1063e) obj;
                PointF pointF2 = (PointF) obj2;
                c1063e2.getClass();
                c1063e2.f4157c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c1063e2.f4158d = round2;
                int i3 = c1063e2.f4161g + 1;
                c1063e2.f4161g = i3;
                if (c1063e2.f4160f == i3) {
                    AbstractC1081w.m2605a(c1063e2.f4159e, c1063e2.f4155a, c1063e2.f4156b, c1063e2.f4157c, round2);
                    c1063e2.f4160f = 0;
                    c1063e2.f4161g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC1081w.m2605a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC1081w.m2605a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                AbstractC1081w.m2605a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                AbstractC1081w.f4222a.mo369f0((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
