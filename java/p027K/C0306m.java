package p027K;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: K.m */
/* loaded from: classes.dex */
public final class C0306m {

    /* renamed from: a */
    public ViewParent f840a;

    /* renamed from: b */
    public ViewParent f841b;

    /* renamed from: c */
    public final ViewGroup f842c;

    /* renamed from: d */
    public boolean f843d;

    /* renamed from: e */
    public int[] f844e;

    public C0306m(ViewGroup viewGroup) {
        this.f842c = viewGroup;
    }

    /* renamed from: a */
    public final boolean m908a(float f, float f2, boolean z2) {
        ViewParent m912e;
        if (this.f843d && (m912e = m912e(0)) != null) {
            try {
                return AbstractC0277V.m832a(m912e, this.f842c, f, f2, z2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + m912e + " does not implement interface method onNestedFling", e2);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m909b(float f, float f2) {
        ViewParent m912e;
        if (this.f843d && (m912e = m912e(0)) != null) {
            try {
                return AbstractC0277V.m833b(m912e, this.f842c, f, f2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + m912e + " does not implement interface method onNestedPreFling", e2);
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m910c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent m912e;
        int i5;
        int i6;
        if (!this.f843d || (m912e = m912e(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f842c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f844e == null) {
                this.f844e = new int[2];
            }
            iArr = this.f844e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (m912e instanceof InterfaceC0308n) {
            ((InterfaceC0308n) m912e).mo924e(viewGroup, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                AbstractC0277V.m834c(m912e, viewGroup, i2, i3, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + m912e + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: d */
    public final boolean m911d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent m912e;
        int i7;
        int i8;
        int[] iArr3;
        if (this.f843d && (m912e = m912e(i6)) != null) {
            if (i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
                ViewGroup viewGroup = this.f842c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i7 = iArr[0];
                    i8 = iArr[1];
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (iArr2 == null) {
                    if (this.f844e == null) {
                        this.f844e = new int[2];
                    }
                    int[] iArr4 = this.f844e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (m912e instanceof InterfaceC0310o) {
                    ((InterfaceC0310o) m912e).mo928b(viewGroup, i2, i3, i4, i5, i6, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i4;
                    iArr3[1] = iArr3[1] + i5;
                    if (m912e instanceof InterfaceC0308n) {
                        ((InterfaceC0308n) m912e).mo922c(viewGroup, i2, i3, i4, i5, i6);
                    } else if (i6 == 0) {
                        try {
                            AbstractC0277V.m835d(m912e, viewGroup, i2, i3, i4, i5);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + m912e + " does not implement interface method onNestedScroll", e2);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i8;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final ViewParent m912e(int i2) {
        if (i2 == 0) {
            return this.f840a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f841b;
    }

    /* renamed from: f */
    public final boolean m913f(int i2) {
        return m912e(i2) != null;
    }

    /* renamed from: g */
    public final boolean m914g(int i2, int i3) {
        boolean m837f;
        if (!m913f(i3)) {
            if (this.f843d) {
                ViewGroup viewGroup = this.f842c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof InterfaceC0308n;
                    if (z2) {
                        m837f = ((InterfaceC0308n) parent).mo925f(view, viewGroup, i2, i3);
                    } else {
                        if (i3 == 0) {
                            try {
                                m837f = AbstractC0277V.m837f(parent, view, viewGroup, i2);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                            }
                        }
                        m837f = false;
                    }
                    if (m837f) {
                        if (i3 == 0) {
                            this.f840a = parent;
                        } else if (i3 == 1) {
                            this.f841b = parent;
                        }
                        if (z2) {
                            ((InterfaceC0308n) parent).mo921a(view, viewGroup, i2, i3);
                        } else if (i3 == 0) {
                            try {
                                AbstractC0277V.m836e(parent, view, viewGroup, i2);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void m915h(int i2) {
        ViewParent m912e = m912e(i2);
        if (m912e != null) {
            boolean z2 = m912e instanceof InterfaceC0308n;
            ViewGroup viewGroup = this.f842c;
            if (z2) {
                ((InterfaceC0308n) m912e).mo923d(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    AbstractC0277V.m838g(m912e, viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + m912e + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.f840a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f841b = null;
            }
        }
    }
}
