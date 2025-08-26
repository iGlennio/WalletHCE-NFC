package p056V;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: V.a */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0507a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z2 = false;
        boolean z3 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f1959x = windowInsets;
        drawerLayout.f1960y = z3;
        if (!z3 && drawerLayout.getBackground() == null) {
            z2 = true;
        }
        drawerLayout.setWillNotDraw(z2);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
