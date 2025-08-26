package p018H;

import android.util.Log;
import androidx.emoji2.text.AbstractC0594h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C0709j;
import java.util.ArrayList;
import java.util.List;
import p002B.AbstractC0012b;
import p005C.C0046i;
import p047Q1.AbstractC0458e;
import p079f0.AbstractC0812H;

/* renamed from: H.b */
/* loaded from: classes.dex */
public final class RunnableC0182b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f531a;

    /* renamed from: b */
    public final int f532b;

    /* renamed from: c */
    public final Object f533c;

    public /* synthetic */ RunnableC0182b(Object obj, int i2, int i3) {
        this.f531a = i3;
        this.f533c = obj;
        this.f532b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f531a) {
            case 0:
                AbstractC0012b abstractC0012b = (AbstractC0012b) ((C0046i) this.f533c).f116b;
                if (abstractC0012b != null) {
                    abstractC0012b.mo43g(this.f532b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f533c;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f532b == 1) {
                    while (i2 < size) {
                        ((AbstractC0594h) arrayList.get(i2)).mo1293a();
                        i2++;
                    }
                    break;
                } else {
                    while (i2 < size) {
                        ((AbstractC0594h) arrayList.get(i2)).getClass();
                        i2++;
                    }
                    break;
                }
            default:
                RecyclerView recyclerView = ((C0709j) this.f533c).f2652Y;
                if (!recyclerView.f2434u) {
                    AbstractC0812H abstractC0812H = recyclerView.f2418l;
                    if (abstractC0812H != null) {
                        abstractC0812H.mo1794x0(recyclerView, this.f532b);
                        break;
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    }
                }
                break;
        }
    }

    public RunnableC0182b(List list, int i2, Throwable th) {
        this.f531a = 1;
        AbstractC0458e.m1192j(list, "initCallbacks cannot be null");
        this.f533c = new ArrayList(list);
        this.f532b = i2;
    }
}
