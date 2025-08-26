package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.nfupay.s145.R;
import java.util.WeakHashMap;
import p017G0.C0176h;
import p027K.AbstractC0272P;
import p073d.AbstractC0734a;
import p086i.C0909n;
import p086i.InterfaceC0921z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0921z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    public C0909n f1638a;

    /* renamed from: b */
    public ImageView f1639b;

    /* renamed from: c */
    public RadioButton f1640c;

    /* renamed from: d */
    public TextView f1641d;

    /* renamed from: e */
    public CheckBox f1642e;

    /* renamed from: f */
    public TextView f1643f;

    /* renamed from: g */
    public ImageView f1644g;

    /* renamed from: h */
    public ImageView f1645h;

    /* renamed from: i */
    public LinearLayout f1646i;

    /* renamed from: j */
    public final Drawable f1647j;

    /* renamed from: k */
    public final int f1648k;

    /* renamed from: l */
    public final Context f1649l;

    /* renamed from: m */
    public boolean f1650m;

    /* renamed from: n */
    public final Drawable f1651n;

    /* renamed from: o */
    public final boolean f1652o;

    /* renamed from: p */
    public LayoutInflater f1653p;

    /* renamed from: q */
    public boolean f1654q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0176h m519B = C0176h.m519B(getContext(), attributeSet, AbstractC0734a.f2928r, R.attr.listMenuViewStyle);
        this.f1647j = m519B.m542q(5);
        TypedArray typedArray = (TypedArray) m519B.f516c;
        this.f1648k = typedArray.getResourceId(1, -1);
        this.f1650m = typedArray.getBoolean(7, false);
        this.f1649l = context;
        this.f1651n = m519B.m542q(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1652o = obtainStyledAttributes.hasValue(0);
        m519B.m523E();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1653p == null) {
            this.f1653p = LayoutInflater.from(getContext());
        }
        return this.f1653p;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1644g;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1645h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1645h.getLayoutParams();
        rect.top = this.f1645h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // p086i.InterfaceC0921z
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1377e(p086i.C0909n r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.mo1377e(i.n):void");
    }

    @Override // p086i.InterfaceC0921z
    public C0909n getItemData() {
        return this.f1638a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = AbstractC0272P.f768a;
        setBackground(this.f1647j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1641d = textView;
        int i2 = this.f1648k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f1649l, i2);
        }
        this.f1643f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1644g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1651n);
        }
        this.f1645h = (ImageView) findViewById(R.id.group_divider);
        this.f1646i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f1639b != null && this.f1650m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1639b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1640c == null && this.f1642e == null) {
            return;
        }
        if ((this.f1638a.f3716x & 4) != 0) {
            if (this.f1640c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1640c = radioButton;
                LinearLayout linearLayout = this.f1646i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1640c;
            view = this.f1642e;
        } else {
            if (this.f1642e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1642e = checkBox;
                LinearLayout linearLayout2 = this.f1646i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1642e;
            view = this.f1640c;
        }
        if (z2) {
            compoundButton.setChecked(this.f1638a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1642e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1640c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1638a.f3716x & 4) != 0) {
            if (this.f1640c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1640c = radioButton;
                LinearLayout linearLayout = this.f1646i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1640c;
        } else {
            if (this.f1642e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1642e = checkBox;
                LinearLayout linearLayout2 = this.f1646i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1642e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1654q = z2;
        this.f1650m = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1645h;
        if (imageView != null) {
            imageView.setVisibility((this.f1652o || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1638a.f3706n.getClass();
        boolean z2 = this.f1654q;
        if (z2 || this.f1650m) {
            ImageView imageView = this.f1639b;
            if (imageView == null && drawable == null && !this.f1650m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1639b = imageView2;
                LinearLayout linearLayout = this.f1646i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1650m) {
                this.f1639b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1639b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1639b.getVisibility() != 0) {
                this.f1639b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1641d.getVisibility() != 8) {
                this.f1641d.setVisibility(8);
            }
        } else {
            this.f1641d.setText(charSequence);
            if (this.f1641d.getVisibility() != 0) {
                this.f1641d.setVisibility(0);
            }
        }
    }
}
