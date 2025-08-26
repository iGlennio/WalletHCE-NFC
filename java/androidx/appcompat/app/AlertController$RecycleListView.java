package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p073d.AbstractC0734a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a */
    public final int f1623a;

    /* renamed from: b */
    public final int f1624b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0734a.f2930t);
        this.f1624b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1623a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
