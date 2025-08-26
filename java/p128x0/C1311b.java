package p128x0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.nfupay.s145.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005C.AbstractC0038a;
import p079f0.AbstractC0809E;

/* renamed from: x0.b */
/* loaded from: classes.dex */
public final class C1311b extends AbstractC0809E {

    /* renamed from: a */
    public final Paint f5365a;

    /* renamed from: b */
    public final List f5366b;

    public C1311b() {
        Paint paint = new Paint();
        this.f5365a = paint;
        this.f5366b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p079f0.AbstractC0809E
    /* renamed from: b */
    public final void mo2160b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int m2176E;
        int m2177F;
        int i2;
        int i3;
        Paint paint = this.f5365a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f5366b.iterator();
        while (it.hasNext()) {
            ((AbstractC1313d) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC0038a.f105a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m1932A0()) {
                C1312c c1312c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2597q;
                switch (c1312c.f5368b) {
                    case 0:
                        i2 = 0;
                        break;
                    default:
                        i2 = c1312c.f5369c.m2178G();
                        break;
                }
                float f2 = i2;
                C1312c c1312c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2597q;
                switch (c1312c2.f5368b) {
                    case 0:
                        i3 = c1312c2.f5369c.f3230o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c1312c2.f5369c;
                        i3 = carouselLayoutManager.f3230o - carouselLayoutManager.m2175D();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, i3, paint);
            } else {
                canvas2 = canvas;
                C1312c c1312c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2597q;
                switch (c1312c3.f5368b) {
                    case 0:
                        m2176E = c1312c3.f5369c.m2176E();
                        break;
                    default:
                        m2176E = 0;
                        break;
                }
                float f3 = m2176E;
                C1312c c1312c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2597q;
                switch (c1312c4.f5368b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c1312c4.f5369c;
                        m2177F = carouselLayoutManager2.f3229n - carouselLayoutManager2.m2177F();
                        break;
                    default:
                        m2177F = c1312c4.f5369c.f3229n;
                        break;
                }
                canvas2.drawLine(f3, 0.0f, m2177F, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
