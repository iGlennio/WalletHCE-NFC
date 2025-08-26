package p128x0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: x0.c */
/* loaded from: classes.dex */
public final class C1312c {

    /* renamed from: a */
    public final int f5367a;

    /* renamed from: b */
    public final /* synthetic */ int f5368b;

    /* renamed from: c */
    public final /* synthetic */ CarouselLayoutManager f5369c;

    public C1312c(int i2) {
        this.f5367a = i2;
    }

    /* renamed from: a */
    public final int m3020a() {
        switch (this.f5368b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f5369c;
                if (carouselLayoutManager.m1933B0()) {
                    return carouselLayoutManager.f3229n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1312c(CarouselLayoutManager carouselLayoutManager, int i2) {
        this(1);
        this.f5368b = i2;
        switch (i2) {
            case 1:
                this.f5369c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f5369c = carouselLayoutManager;
                break;
        }
    }
}
