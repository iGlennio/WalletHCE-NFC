package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p047Q1.AbstractC0458e;
import p058W.C0530a;

/* renamed from: androidx.emoji2.text.v */
/* loaded from: classes.dex */
public final class C0608v extends ReplacementSpan {

    /* renamed from: b */
    public final C0600n f2020b;

    /* renamed from: a */
    public final Paint.FontMetricsInt f2019a = new Paint.FontMetricsInt();

    /* renamed from: c */
    public float f2021c = 1.0f;

    public C0608v(C0600n c0600n) {
        AbstractC0458e.m1192j(c0600n, "metadata cannot be null");
        this.f2020b = c0600n;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
        C0596j.m1525a().getClass();
        C0600n c0600n = this.f2020b;
        C0605s c0605s = c0600n.f1992b;
        Typeface typeface = (Typeface) c0605s.f2014d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) c0605s.f2012b, c0600n.f1991a * 2, 2, f, i5, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f2019a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0600n c0600n = this.f2020b;
        this.f2021c = abs / (c0600n.m1532b().m732a(14) != 0 ? ((ByteBuffer) r8.f759d).getShort(r1 + r8.f756a) : (short) 0);
        C0530a m1532b = c0600n.m1532b();
        int m732a = m1532b.m732a(14);
        if (m732a != 0) {
            ((ByteBuffer) m1532b.f759d).getShort(m732a + m1532b.f756a);
        }
        short s2 = (short) ((c0600n.m1532b().m732a(12) != 0 ? ((ByteBuffer) r5.f759d).getShort(r7 + r5.f756a) : (short) 0) * this.f2021c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
