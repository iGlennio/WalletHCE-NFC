package p007C1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p121v.AbstractC1267q;
import p121v.C1264n;

/* renamed from: C1.A */
/* loaded from: classes.dex */
public final class C0056A {

    /* renamed from: a */
    public final int f135a;

    /* renamed from: b */
    public final int f136b;

    /* renamed from: c */
    public final Object f137c;

    public C0056A(Context context, XmlResourceParser xmlResourceParser) {
        this.f137c = new ArrayList();
        this.f136b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1267q.f5098h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f135a = obtainStyledAttributes.getResourceId(index, this.f135a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f136b);
                this.f136b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1264n().m2950b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public C0056A() {
        this.f137c = new C0056A[256];
        this.f135a = 0;
        this.f136b = 0;
    }

    public C0056A(int i2, int i3) {
        this.f137c = null;
        this.f135a = i2;
        int i4 = i3 & 7;
        this.f136b = i4 == 0 ? 8 : i4;
    }
}
