package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p086i.InterfaceC0891A;
import p086i.MenuC0907l;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0891A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p086i.InterfaceC0891A
    /* renamed from: b */
    public final void mo1380b(MenuC0907l menuC0907l) {
    }
}
