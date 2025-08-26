package p088j;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.nfupay.s145.R;
import p005C.C0046i;
import p027K.AbstractC0272P;
import p027K.C0288d;
import p027K.C0292f;
import p027K.InterfaceC0286c;
import p027K.InterfaceC0318s;
import p042P.C0400b;
import p042P.C0401c;
import p045Q.C0451r;
import p047Q1.AbstractC0458e;

/* renamed from: j.w */
/* loaded from: classes.dex */
public class C1041w extends EditText implements InterfaceC0318s {

    /* renamed from: a */
    public final C1020p f4077a;

    /* renamed from: b */
    public final C0979b0 f4078b;

    /* renamed from: c */
    public final C0928C f4079c;

    /* renamed from: d */
    public final C0451r f4080d;

    /* renamed from: e */
    public final C0928C f4081e;

    /* renamed from: f */
    public C1038v f4082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1001i1.m2479a(context);
        AbstractC0998h1.m2474a(this, getContext());
        C1020p c1020p = new C1020p(this);
        this.f4077a = c1020p;
        c1020p.m2509d(attributeSet, R.attr.editTextStyle);
        C0979b0 c0979b0 = new C0979b0(this);
        this.f4078b = c0979b0;
        c0979b0.m2451f(attributeSet, R.attr.editTextStyle);
        c0979b0.m2448b();
        C0928C c0928c = new C0928C();
        c0928c.f3759b = this;
        this.f4079c = c0928c;
        this.f4080d = new C0451r();
        C0928C c0928c2 = new C0928C(this);
        this.f4081e = c0928c2;
        c0928c2.mo2378b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener m2377a = c0928c2.m2377a(keyListener);
        if (m2377a == keyListener) {
            return;
        }
        super.setKeyListener(m2377a);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C1038v getSuperCaller() {
        if (this.f4082f == null) {
            this.f4082f = new C1038v(this);
        }
        return this.f4082f;
    }

    @Override // p027K.InterfaceC0318s
    /* renamed from: a */
    public final C0292f mo934a(C0292f c0292f) {
        return this.f4080d.m1161a(this, c0292f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1020p c1020p = this.f4077a;
        if (c1020p != null) {
            c1020p.m2506a();
        }
        C0979b0 c0979b0 = this.f4078b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0458e.m1185c0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1020p c1020p = this.f4077a;
        if (c1020p != null) {
            return c1020p.m2507b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1020p c1020p = this.f4077a;
        if (c1020p != null) {
            return c1020p.m2508c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4078b.m2449d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4078b.m2450e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0928C c0928c;
        if (Build.VERSION.SDK_INT >= 28 || (c0928c = this.f4079c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0928c.f3760c;
        return textClassifier == null ? AbstractC0963U.m2434a((TextView) c0928c.f3759b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] m817g;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4078b.getClass();
        C0979b0.m2446h(editorInfo, onCreateInputConnection, this);
        AbstractC0458e.m1175I(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (m817g = AbstractC0272P.m817g(this)) != null) {
            editorInfo.contentMimeTypes = m817g;
            onCreateInputConnection = new C0401c(onCreateInputConnection, new C0400b(this));
        }
        return this.f4081e.m2379c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC0272P.m817g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = AbstractC0934F.m2388a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        InterfaceC0286c interfaceC0286c;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || AbstractC0272P.m817g(this) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                interfaceC0286c = new C0046i(primaryClip, 1);
            } else {
                C0288d c0288d = new C0288d();
                c0288d.f795b = primaryClip;
                c0288d.f796c = 1;
                interfaceC0286c = c0288d;
            }
            interfaceC0286c.mo184t(i2 == 16908322 ? 0 : 1);
            AbstractC0272P.m819i(this, interfaceC0286c.mo174j());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1020p c1020p = this.f4077a;
        if (c1020p != null) {
            c1020p.m2510e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C1020p c1020p = this.f4077a;
        if (c1020p != null) {
            c1020p.m2511f(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f4078b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0979b0 c0979b0 = this.f4078b;
        if (c0979b0 != null) {
            c0979b0.m2448b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0458e.m1186d0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f4081e.m2380d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4081e.m2377a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1020p c1020p = this.f4077a;
        if (c1020p != null) {
            c1020p.m2513h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1020p c1020p = this.f4077a;
        if (c1020p != null) {
            c1020p.m2514i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0979b0 c0979b0 = this.f4078b;
        c0979b0.m2456l(colorStateList);
        c0979b0.m2448b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0979b0 c0979b0 = this.f4078b;
        c0979b0.m2457m(mode);
        c0979b0.m2448b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0979b0 c0979b0 = this.f4078b;
        if (c0979b0 != null) {
            c0979b0.m2452g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0928C c0928c;
        if (Build.VERSION.SDK_INT >= 28 || (c0928c = this.f4079c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0928c.f3760c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
