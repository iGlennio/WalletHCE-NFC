package p074d0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: d0.b */
/* loaded from: classes.dex */
public final class C0736b {

    /* renamed from: a */
    public final Executor f2940a;

    /* renamed from: b */
    public final InterfaceC0739e f2941b;

    /* renamed from: c */
    public final byte[] f2942c;

    /* renamed from: d */
    public final File f2943d;

    /* renamed from: e */
    public final String f2944e;

    /* renamed from: f */
    public boolean f2945f = false;

    /* renamed from: g */
    public C0737c[] f2946g;

    /* renamed from: h */
    public byte[] f2947h;

    public C0736b(AssetManager assetManager, Executor executor, InterfaceC0739e interfaceC0739e, String str, File file) {
        this.f2940a = executor;
        this.f2941b = interfaceC0739e;
        this.f2944e = str;
        this.f2943d = file;
        int i2 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i2 <= 33) {
            switch (i2) {
                case 25:
                    bArr = AbstractC0740f.f2964h;
                    break;
                case 26:
                    bArr = AbstractC0740f.f2963g;
                    break;
                case 27:
                    bArr = AbstractC0740f.f2962f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0740f.f2961e;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = AbstractC0740f.f2960d;
                    break;
            }
        }
        this.f2942c = bArr;
    }

    /* renamed from: a */
    public final FileInputStream m2013a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f2941b.mo181q();
            return null;
        }
    }

    /* renamed from: b */
    public final void m2014b(final int i2, final Serializable serializable) {
        this.f2940a.execute(new Runnable() { // from class: d0.a
            @Override // java.lang.Runnable
            public final void run() {
                C0736b.this.f2941b.mo175k(i2, serializable);
            }
        });
    }
}
