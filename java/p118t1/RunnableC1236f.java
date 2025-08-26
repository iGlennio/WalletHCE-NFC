package p118t1;

import android.widget.Toast;

/* renamed from: t1.f */
/* loaded from: classes.dex */
public final class RunnableC1236f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4831a;

    /* renamed from: b */
    public final /* synthetic */ C1234d f4832b;

    public /* synthetic */ RunnableC1236f(C1234d c1234d, int i2) {
        this.f4831a = i2;
        this.f4832b = c1234d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4831a) {
            case 0:
                Toast.makeText(this.f4832b.f4828b, "未找到服务器配置信息", 0).show();
                break;
            default:
                C1234d c1234d = this.f4832b;
                if (c1234d.f4828b.f4366B.isShowing()) {
                    c1234d.f4828b.f4366B.dismiss();
                    break;
                }
                break;
        }
    }
}
