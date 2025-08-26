package p121v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: v.g */
/* loaded from: classes.dex */
public final class C1257g {

    /* renamed from: a */
    public final float f4966a;

    /* renamed from: b */
    public final float f4967b;

    /* renamed from: c */
    public final float f4968c;

    /* renamed from: d */
    public final float f4969d;

    /* renamed from: e */
    public final int f4970e;

    public C1257g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4966a = Float.NaN;
        this.f4967b = Float.NaN;
        this.f4968c = Float.NaN;
        this.f4969d = Float.NaN;
        this.f4970e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1267q.f5100j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f4970e);
                this.f4970e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1264n().m2950b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4969d = obtainStyledAttributes.getDimension(index, this.f4969d);
            } else if (index == 2) {
                this.f4967b = obtainStyledAttributes.getDimension(index, this.f4967b);
            } else if (index == 3) {
                this.f4968c = obtainStyledAttributes.getDimension(index, this.f4968c);
            } else if (index == 4) {
                this.f4966a = obtainStyledAttributes.getDimension(index, this.f4966a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
