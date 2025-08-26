package p079f0;

/* renamed from: f0.U */
/* loaded from: classes.dex */
public final class C0824U {

    /* renamed from: a */
    public int f3258a;

    /* renamed from: b */
    public int f3259b;

    /* renamed from: c */
    public int f3260c;

    /* renamed from: d */
    public int f3261d;

    /* renamed from: e */
    public int f3262e;

    /* renamed from: f */
    public boolean f3263f;

    /* renamed from: g */
    public boolean f3264g;

    /* renamed from: h */
    public boolean f3265h;

    /* renamed from: i */
    public boolean f3266i;

    /* renamed from: j */
    public boolean f3267j;

    /* renamed from: k */
    public boolean f3268k;

    /* renamed from: l */
    public int f3269l;

    /* renamed from: m */
    public long f3270m;

    /* renamed from: n */
    public int f3271n;

    /* renamed from: a */
    public final void m2210a(int i2) {
        if ((this.f3261d & i2) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f3261d));
    }

    /* renamed from: b */
    public final int m2211b() {
        return this.f3264g ? this.f3259b - this.f3260c : this.f3262e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3258a + ", mData=null, mItemCount=" + this.f3262e + ", mIsMeasuring=" + this.f3266i + ", mPreviousLayoutItemCount=" + this.f3259b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3260c + ", mStructureChanged=" + this.f3263f + ", mInPreLayout=" + this.f3264g + ", mRunSimpleAnimations=" + this.f3267j + ", mRunPredictiveAnimations=" + this.f3268k + '}';
    }
}
