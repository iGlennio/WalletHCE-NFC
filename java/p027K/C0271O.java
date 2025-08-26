package p027K;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.nfupay.s145.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: K.O */
/* loaded from: classes.dex */
public final class C0271O {

    /* renamed from: d */
    public static final ArrayList f764d = new ArrayList();

    /* renamed from: a */
    public WeakHashMap f765a;

    /* renamed from: b */
    public SparseArray f766b;

    /* renamed from: c */
    public WeakReference f767c;

    /* renamed from: a */
    public final View m810a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f765a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View m810a = m810a(viewGroup.getChildAt(childCount));
                if (m810a != null) {
                    return m810a;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
