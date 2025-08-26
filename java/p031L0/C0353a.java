package p031L0;

import android.graphics.Paint;
import android.graphics.Path;
import p005C.AbstractC0038a;

/* renamed from: L0.a */
/* loaded from: classes.dex */
public final class C0353a {

    /* renamed from: i */
    public static final int[] f896i = new int[3];

    /* renamed from: j */
    public static final float[] f897j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f898k = new int[4];

    /* renamed from: l */
    public static final float[] f899l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f900a;

    /* renamed from: b */
    public final Paint f901b;

    /* renamed from: c */
    public final Paint f902c;

    /* renamed from: d */
    public final int f903d;

    /* renamed from: e */
    public final int f904e;

    /* renamed from: f */
    public final int f905f;

    /* renamed from: g */
    public final Path f906g = new Path();

    /* renamed from: h */
    public final Paint f907h;

    public C0353a() {
        Paint paint = new Paint();
        this.f907h = paint;
        Paint paint2 = new Paint();
        this.f900a = paint2;
        this.f903d = AbstractC0038a.m112d(-16777216, 68);
        this.f904e = AbstractC0038a.m112d(-16777216, 20);
        this.f905f = AbstractC0038a.m112d(-16777216, 0);
        paint2.setColor(this.f903d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f901b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f902c = new Paint(paint3);
    }
}
