package androidx.fragment.app;

import androidx.lifecycle.C0664L;
import androidx.lifecycle.C0685t;
import androidx.lifecycle.EnumC0677l;
import androidx.lifecycle.InterfaceC0665M;
import androidx.lifecycle.InterfaceC0673h;
import p047Q1.C0456c;
import p081g0.C0869d;
import p081g0.InterfaceC0870e;

/* renamed from: androidx.fragment.app.L */
/* loaded from: classes.dex */
public final class C0622L implements InterfaceC0673h, InterfaceC0870e, InterfaceC0665M {

    /* renamed from: a */
    public final C0664L f2107a;

    /* renamed from: b */
    public C0685t f2108b = null;

    /* renamed from: c */
    public C0456c f2109c = null;

    public C0622L(C0664L c0664l) {
        this.f2107a = c0664l;
    }

    @Override // p081g0.InterfaceC0870e
    /* renamed from: b */
    public final C0869d mo1360b() {
        m1628f();
        return (C0869d) this.f2109c.f1251c;
    }

    @Override // androidx.lifecycle.InterfaceC0665M
    /* renamed from: c */
    public final C0664L mo1361c() {
        m1628f();
        return this.f2107a;
    }

    @Override // androidx.lifecycle.InterfaceC0683r
    /* renamed from: d */
    public final C0685t mo1362d() {
        m1628f();
        return this.f2108b;
    }

    /* renamed from: e */
    public final void m1627e(EnumC0677l enumC0677l) {
        this.f2108b.m1702d(enumC0677l);
    }

    /* renamed from: f */
    public final void m1628f() {
        if (this.f2108b == null) {
            this.f2108b = new C0685t(this);
            this.f2109c = new C0456c(this);
        }
    }
}
