package p060X;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.C0592f;
import androidx.emoji2.text.C0596j;
import java.nio.ByteBuffer;
import p034M0.C0360e;
import p058W.C0531b;

/* renamed from: X.b */
/* loaded from: classes.dex */
public final class C0534b extends InputConnectionWrapper {

    /* renamed from: a */
    public final EditText f1480a;

    /* renamed from: b */
    public final C0360e f1481b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0534b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        C0360e c0360e = new C0360e(22);
        this.f1480a = editText;
        this.f1481b = c0360e;
        if (C0596j.f1974j != null) {
            C0596j m1525a = C0596j.m1525a();
            if (m1525a.m1526b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0592f c0592f = m1525a.f1979e;
            c0592f.getClass();
            Bundle bundle = editorInfo.extras;
            C0531b c0531b = (C0531b) c0592f.f1969c.f2011a;
            int m732a = c0531b.m732a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", m732a != 0 ? ((ByteBuffer) c0531b.f759d).getInt(m732a + c0531b.f756a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0592f.f1967a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f1480a.getEditableText();
        this.f1481b.getClass();
        return C0360e.m1011j(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f1480a.getEditableText();
        this.f1481b.getClass();
        return C0360e.m1011j(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
