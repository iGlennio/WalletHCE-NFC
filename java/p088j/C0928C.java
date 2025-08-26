package p088j;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.text.C0596j;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p002B.C0019i;
import p005C.C0046i;
import p008D.AbstractC0091e;
import p008D.InterfaceC0090d;
import p017G0.C0176h;
import p047Q1.AbstractC0458e;
import p060X.C0534b;
import p060X.C0537e;
import p060X.C0540h;
import p060X.C0541i;
import p073d.AbstractC0734a;

/* renamed from: j.C */
/* loaded from: classes.dex */
public class C0928C {

    /* renamed from: d */
    public static final int[] f3757d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final /* synthetic */ int f3758a = 2;

    /* renamed from: b */
    public View f3759b;

    /* renamed from: c */
    public Object f3760c;

    public /* synthetic */ C0928C() {
    }

    /* renamed from: a */
    public KeyListener m2377a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0019i) ((C0046i) this.f3760c).f116b).getClass();
        if (keyListener instanceof C0537e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0537e(keyListener);
    }

    /* renamed from: b */
    public void mo2378b(AttributeSet attributeSet, int i2) {
        switch (this.f3758a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f3759b;
                C0176h m519B = C0176h.m519B(absSeekBar.getContext(), attributeSet, f3757d, i2);
                Drawable m543r = m519B.m543r(0);
                if (m543r != null) {
                    if (m543r instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) m543r;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable m2381e = m2381e(animationDrawable.getFrame(i3), true);
                            m2381e.setLevel(10000);
                            animationDrawable2.addFrame(m2381e, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        m543r = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(m543r);
                }
                Drawable m543r2 = m519B.m543r(1);
                if (m543r2 != null) {
                    absSeekBar.setProgressDrawable(m2381e(m543r2, false));
                }
                m519B.m523E();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f3759b).getContext().obtainStyledAttributes(attributeSet, AbstractC0734a.f2919i, i2, 0);
                try {
                    boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    m2380d(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* renamed from: c */
    public C0534b m2379c(InputConnection inputConnection, EditorInfo editorInfo) {
        C0046i c0046i = (C0046i) this.f3760c;
        if (inputConnection == null) {
            c0046i.getClass();
            inputConnection = null;
        } else {
            C0019i c0019i = (C0019i) c0046i.f116b;
            c0019i.getClass();
            if (!(inputConnection instanceof C0534b)) {
                inputConnection = new C0534b((EditText) c0019i.f47b, inputConnection, editorInfo);
            }
        }
        return (C0534b) inputConnection;
    }

    /* renamed from: d */
    public void m2380d(boolean z2) {
        C0541i c0541i = (C0541i) ((C0019i) ((C0046i) this.f3760c).f116b).f48c;
        if (c0541i.f1495c != z2) {
            if (c0541i.f1494b != null) {
                C0596j m1525a = C0596j.m1525a();
                C0540h c0540h = c0541i.f1494b;
                m1525a.getClass();
                AbstractC0458e.m1192j(c0540h, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = m1525a.f1975a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    m1525a.f1976b.remove(c0540h);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0541i.f1495c = z2;
            if (z2) {
                C0541i.m1295a(c0541i.f1493a, C0596j.m1525a().m1526b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public Drawable m2381e(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC0090d) {
            ((AbstractC0091e) ((InterfaceC0090d) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    int id = layerDrawable.getId(i2);
                    drawableArr[i2] = m2381e(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
                    layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
                    layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
                    layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
                    layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
                    layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
                    layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
                    layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
                    layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f3760c) == null) {
                    this.f3760c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0928C(AbsSeekBar absSeekBar) {
        this.f3759b = absSeekBar;
    }

    public C0928C(EditText editText) {
        this.f3759b = editText;
        this.f3760c = new C0046i(editText);
    }
}
