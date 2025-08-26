package p088j;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.nfupay.s145.R;

/* renamed from: j.Y0 */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0972Y0 implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f3881a;

    /* renamed from: b */
    public final /* synthetic */ Object f3882b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0972Y0(int i2, Object obj) {
        this.f3881a = i2;
        this.f3882b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        switch (this.f3881a) {
            case 0:
                SearchView searchView = (SearchView) this.f3882b;
                View view2 = searchView.f1773x;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f1767r.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean m2376a = AbstractC0925A1.m2376a(searchView);
                    int dimensionPixelSize = searchView.f1748M ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f1765p;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    searchAutoComplete.setDropDownHorizontalOffset(m2376a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                throw null;
        }
    }
}
