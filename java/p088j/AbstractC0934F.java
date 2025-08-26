package p088j;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p005C.C0046i;
import p027K.AbstractC0272P;
import p027K.C0288d;
import p027K.InterfaceC0286c;

/* renamed from: j.F */
/* loaded from: classes.dex */
public abstract class AbstractC0934F {
    /* renamed from: a */
    public static boolean m2388a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0286c interfaceC0286c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0286c = new C0046i(clipData, 3);
            } else {
                C0288d c0288d = new C0288d();
                c0288d.f795b = clipData;
                c0288d.f796c = 3;
                interfaceC0286c = c0288d;
            }
            AbstractC0272P.m819i(textView, interfaceC0286c.mo174j());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m2389b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0286c interfaceC0286c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0286c = new C0046i(clipData, 3);
        } else {
            C0288d c0288d = new C0288d();
            c0288d.f795b = clipData;
            c0288d.f796c = 3;
            interfaceC0286c = c0288d;
        }
        AbstractC0272P.m819i(view, interfaceC0286c.mo174j());
        return true;
    }
}
