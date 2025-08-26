package androidx.savedstate;

import android.os.Bundle;
import androidx.fragment.app.C0642p;
import androidx.lifecycle.AbstractC0662J;
import androidx.lifecycle.C0664L;
import androidx.lifecycle.C0674i;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0677l;
import androidx.lifecycle.InterfaceC0665M;
import androidx.lifecycle.InterfaceC0681p;
import androidx.lifecycle.InterfaceC0683r;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p005C.AbstractC0044g;
import p081g0.C0869d;
import p081g0.InterfaceC0867b;
import p081g0.InterfaceC0870e;
import p095l1.AbstractC1136c;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0681p {

    /* renamed from: a */
    public final InterfaceC0870e f2462a;

    public Recreator(InterfaceC0870e interfaceC0870e) {
        this.f2462a = interfaceC0870e;
    }

    @Override // androidx.lifecycle.InterfaceC0681p
    /* renamed from: b */
    public final void mo1348b(InterfaceC0683r interfaceC0683r, EnumC0677l enumC0677l) {
        Object obj;
        boolean z2;
        if (enumC0677l != EnumC0677l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0683r.mo1362d().m1704f(this);
        Bundle m2289c = this.f2462a.mo1360b().m2289c("androidx.savedstate.Restarter");
        if (m2289c == null) {
            return;
        }
        ArrayList<String> stringArrayList = m2289c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC0867b.class);
                AbstractC1136c.m2636d(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        AbstractC1136c.m2636d(newInstance, "{\n                constr…wInstance()\n            }");
                        InterfaceC0870e interfaceC0870e = this.f2462a;
                        if (!(interfaceC0870e instanceof InterfaceC0665M)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        C0664L mo1361c = ((InterfaceC0665M) interfaceC0870e).mo1361c();
                        C0869d mo1360b = interfaceC0870e.mo1360b();
                        mo1361c.getClass();
                        Iterator it = new HashSet(mo1361c.f2300a.keySet()).iterator();
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            AbstractC1136c.m2637e(str2, "key");
                            AbstractC0662J abstractC0662J = (AbstractC0662J) mo1361c.f2300a.get(str2);
                            AbstractC1136c.m2634b(abstractC0662J);
                            C0685t mo1362d = interfaceC0870e.mo1362d();
                            AbstractC1136c.m2637e(mo1360b, "registry");
                            AbstractC1136c.m2637e(mo1362d, "lifecycle");
                            HashMap hashMap = abstractC0662J.f2296a;
                            if (hashMap == null) {
                                obj = null;
                            } else {
                                synchronized (hashMap) {
                                    obj = abstractC0662J.f2296a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z2 = savedStateHandleController.f2304a)) {
                                if (z2) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f2304a = true;
                                mo1362d.m1699a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(mo1361c.f2300a.keySet()).isEmpty()) {
                            if (!mo1360b.f3499c) {
                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                            }
                            C0642p c0642p = (C0642p) mo1360b.f3502f;
                            if (c0642p == null) {
                                c0642p = new C0642p(mo1360b);
                            }
                            mo1360b.f3502f = c0642p;
                            try {
                                C0674i.class.getDeclaredConstructor(new Class[0]);
                                C0642p c0642p2 = (C0642p) mo1360b.f3502f;
                                if (c0642p2 != null) {
                                    ((LinkedHashSet) c0642p2.f2246b).add(C0674i.class.getName());
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalArgumentException("Class " + C0674i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException("Failed to instantiate " + str, e3);
                    }
                } catch (NoSuchMethodException e4) {
                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(AbstractC0044g.m155g("Class ", str, " wasn't found"), e5);
            }
        }
    }
}
