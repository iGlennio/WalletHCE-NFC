package p045Q;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p027K.C0292f;
import p027K.InterfaceC0290e;
import p027K.InterfaceC0316r;

/* renamed from: Q.r */
/* loaded from: classes.dex */
public final class C0451r implements InterfaceC0316r {
    /* renamed from: a */
    public final C0292f m1161a(View view, C0292f c0292f) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0292f);
        }
        if (c0292f.f805a.mo168d() == 2) {
            return c0292f;
        }
        InterfaceC0290e interfaceC0290e = c0292f.f805a;
        ClipData mo170f = interfaceC0290e.mo170f();
        int mo180p = interfaceC0290e.mo180p();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i2 = 0; i2 < mo170f.getItemCount(); i2++) {
            ClipData.Item itemAt = mo170f.getItemAt(i2);
            if ((mo180p & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
