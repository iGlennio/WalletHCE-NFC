package p027K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p111r0.AbstractC1188a;

/* renamed from: K.d */
/* loaded from: classes.dex */
public final class C0288d implements InterfaceC0286c, InterfaceC0290e {

    /* renamed from: a */
    public final /* synthetic */ int f794a;

    /* renamed from: b */
    public Object f795b;

    /* renamed from: c */
    public int f796c;

    /* renamed from: d */
    public int f797d;

    /* renamed from: e */
    public Object f798e;

    /* renamed from: f */
    public Cloneable f799f;

    public /* synthetic */ C0288d() {
        this.f794a = 0;
    }

    /* renamed from: a */
    public void m860a(C0319s0 c0319s0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((C0293f0) it.next()).f806a.mo863c() & 8) != 0) {
                ((View) this.f798e).setTranslationY(AbstractC1188a.m2749c(this.f797d, 0, r3.f806a.mo862b()));
                return;
            }
        }
    }

    @Override // p027K.InterfaceC0286c
    /* renamed from: b */
    public void mo166b(Bundle bundle) {
        this.f799f = bundle;
    }

    @Override // p027K.InterfaceC0286c
    /* renamed from: c */
    public void mo167c(Uri uri) {
        this.f798e = uri;
    }

    @Override // p027K.InterfaceC0290e
    /* renamed from: d */
    public int mo168d() {
        return this.f796c;
    }

    @Override // p027K.InterfaceC0290e
    /* renamed from: f */
    public ClipData mo170f() {
        return (ClipData) this.f795b;
    }

    @Override // p027K.InterfaceC0286c
    /* renamed from: j */
    public C0292f mo174j() {
        return new C0292f(new C0288d(this));
    }

    @Override // p027K.InterfaceC0290e
    /* renamed from: p */
    public int mo180p() {
        return this.f797d;
    }

    @Override // p027K.InterfaceC0290e
    /* renamed from: r */
    public ContentInfo mo182r() {
        return null;
    }

    @Override // p027K.InterfaceC0286c
    /* renamed from: t */
    public void mo184t(int i2) {
        this.f797d = i2;
    }

    public String toString() {
        String str;
        switch (this.f794a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f795b).getDescription());
                sb.append(", source=");
                int i2 = this.f796c;
                sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i3 = this.f797d;
                sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
                Uri uri = (Uri) this.f798e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f799f) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0288d(View view) {
        this.f794a = 2;
        this.f799f = new int[2];
        this.f798e = view;
    }

    public C0288d(C0288d c0288d) {
        this.f794a = 1;
        ClipData clipData = (ClipData) c0288d.f795b;
        clipData.getClass();
        this.f795b = clipData;
        int i2 = c0288d.f796c;
        if (i2 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i2 <= 5) {
            this.f796c = i2;
            int i3 = c0288d.f797d;
            if ((i3 & 1) == i3) {
                this.f797d = i3;
                this.f798e = (Uri) c0288d.f798e;
                this.f799f = (Bundle) c0288d.f799f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
