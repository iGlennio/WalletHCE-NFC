package p083h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p010D1.AbstractC0096d;
import p073d.AbstractC0734a;
import p086i.ActionProviderVisibilityListenerC0910o;
import p086i.MenuC0907l;
import p088j.AbstractC1027r0;

/* renamed from: h.i */
/* loaded from: classes.dex */
public final class C0881i extends MenuInflater {

    /* renamed from: e */
    public static final Class[] f3554e;

    /* renamed from: f */
    public static final Class[] f3555f;

    /* renamed from: a */
    public final Object[] f3556a;

    /* renamed from: b */
    public final Object[] f3557b;

    /* renamed from: c */
    public final Context f3558c;

    /* renamed from: d */
    public Object f3559d;

    static {
        Class[] clsArr = {Context.class};
        f3554e = clsArr;
        f3555f = clsArr;
    }

    public C0881i(Context context) {
        super(context);
        this.f3558c = context;
        Object[] objArr = {context};
        this.f3556a = objArr;
        this.f3557b = objArr;
    }

    /* renamed from: a */
    public static Object m2297a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? m2297a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* renamed from: b */
    public final void m2298b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i2;
        XmlResourceParser xmlResourceParser2;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        C0880h c0880h = new C0880h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i2 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        while (!z3) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i2) {
                if (eventType == 3) {
                    String name2 = xmlResourceParser.getName();
                    if (z4 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r4;
                        z4 = false;
                        str = null;
                        eventType = xmlResourceParser2.next();
                        r4 = z2;
                        i2 = 2;
                        z4 = z4;
                    } else if (name2.equals("group")) {
                        c0880h.f3529b = 0;
                        c0880h.f3530c = 0;
                        c0880h.f3531d = 0;
                        c0880h.f3532e = 0;
                        c0880h.f3533f = r4;
                        c0880h.f3534g = r4;
                    } else if (name2.equals("item")) {
                        if (!c0880h.f3535h) {
                            ActionProviderVisibilityListenerC0910o actionProviderVisibilityListenerC0910o = c0880h.f3553z;
                            if (actionProviderVisibilityListenerC0910o == null || !actionProviderVisibilityListenerC0910o.f3719a.hasSubMenu()) {
                                c0880h.f3535h = r4;
                                c0880h.m2296b(c0880h.f3528a.add(c0880h.f3529b, c0880h.f3536i, c0880h.f3537j, c0880h.f3538k));
                            } else {
                                c0880h.f3535h = r4;
                                c0880h.m2296b(c0880h.f3528a.addSubMenu(c0880h.f3529b, c0880h.f3536i, c0880h.f3537j, c0880h.f3538k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r4;
                        z3 = z2;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z2 = r4;
            } else {
                if (!z4) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0881i c0881i = c0880h.f3527E;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0881i.f3558c.obtainStyledAttributes(attributeSet, AbstractC0734a.f2926p);
                        c0880h.f3529b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0880h.f3530c = obtainStyledAttributes.getInt(3, 0);
                        c0880h.f3531d = obtainStyledAttributes.getInt(4, 0);
                        c0880h.f3532e = obtainStyledAttributes.getInt(5, 0);
                        c0880h.f3533f = obtainStyledAttributes.getBoolean(2, r4);
                        c0880h.f3534g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c0881i.f3558c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0734a.f2927q);
                            c0880h.f3536i = obtainStyledAttributes2.getResourceId(2, 0);
                            c0880h.f3537j = (obtainStyledAttributes2.getInt(5, c0880h.f3530c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0880h.f3531d) & 65535);
                            c0880h.f3538k = obtainStyledAttributes2.getText(7);
                            c0880h.f3539l = obtainStyledAttributes2.getText(8);
                            c0880h.f3540m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            c0880h.f3541n = string == null ? (char) 0 : string.charAt(0);
                            c0880h.f3542o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            c0880h.f3543p = string2 == null ? (char) 0 : string2.charAt(0);
                            c0880h.f3544q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                c0880h.f3545r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c0880h.f3545r = c0880h.f3532e;
                            }
                            c0880h.f3546s = obtainStyledAttributes2.getBoolean(3, false);
                            c0880h.f3547t = obtainStyledAttributes2.getBoolean(4, c0880h.f3533f);
                            c0880h.f3548u = obtainStyledAttributes2.getBoolean(1, c0880h.f3534g);
                            c0880h.f3549v = obtainStyledAttributes2.getInt(21, -1);
                            c0880h.f3552y = obtainStyledAttributes2.getString(12);
                            c0880h.f3550w = obtainStyledAttributes2.getResourceId(13, 0);
                            c0880h.f3551x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z5 = string3 != null;
                            if (z5 && c0880h.f3550w == 0 && c0880h.f3551x == null) {
                                c0880h.f3553z = (ActionProviderVisibilityListenerC0910o) c0880h.m2295a(string3, f3555f, c0881i.f3557b);
                            } else {
                                if (z5) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c0880h.f3553z = null;
                            }
                            c0880h.f3523A = obtainStyledAttributes2.getText(17);
                            c0880h.f3524B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                c0880h.f3526D = AbstractC1027r0.m2516b(obtainStyledAttributes2.getInt(19, -1), c0880h.f3526D);
                            } else {
                                c0880h.f3526D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0096d.m355v(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                c0880h.f3525C = colorStateList;
                            } else {
                                c0880h.f3525C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            c0880h.f3535h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c0880h.f3535h = true;
                            SubMenu addSubMenu = c0880h.f3528a.addSubMenu(c0880h.f3529b, c0880h.f3536i, c0880h.f3537j, c0880h.f3538k);
                            c0880h.m2296b(addSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            m2298b(xmlResourceParser2, attributeSet, addSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                            str = name3;
                            z4 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r4 = z2;
                        i2 = 2;
                        z4 = z4;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z2 = r4;
            }
            eventType = xmlResourceParser2.next();
            r4 = z2;
            i2 = 2;
            z4 = z4;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof MenuC0907l)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f3558c.getResources().getLayout(i2);
                    m2298b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
