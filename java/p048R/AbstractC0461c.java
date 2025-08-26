package p048R;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p005C.AbstractC0044g;
import p088j.ViewOnClickListenerC0995g1;

/* renamed from: R.c */
/* loaded from: classes.dex */
public abstract class AbstractC0461c extends BaseAdapter implements Filterable {

    /* renamed from: a */
    public boolean f1262a;

    /* renamed from: b */
    public boolean f1263b;

    /* renamed from: c */
    public Cursor f1264c;

    /* renamed from: d */
    public int f1265d;

    /* renamed from: e */
    public C0459a f1266e;

    /* renamed from: f */
    public C0460b f1267f;

    /* renamed from: g */
    public C0462d f1268g;

    /* renamed from: a */
    public abstract void mo1216a(View view, Cursor cursor);

    /* renamed from: b */
    public void mo1217b(Cursor cursor) {
        Cursor cursor2 = this.f1264c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0459a c0459a = this.f1266e;
                if (c0459a != null) {
                    cursor2.unregisterContentObserver(c0459a);
                }
                C0460b c0460b = this.f1267f;
                if (c0460b != null) {
                    cursor2.unregisterDataSetObserver(c0460b);
                }
            }
            this.f1264c = cursor;
            if (cursor != null) {
                C0459a c0459a2 = this.f1266e;
                if (c0459a2 != null) {
                    cursor.registerContentObserver(c0459a2);
                }
                C0460b c0460b2 = this.f1267f;
                if (c0460b2 != null) {
                    cursor.registerDataSetObserver(c0460b2);
                }
                this.f1265d = cursor.getColumnIndexOrThrow("_id");
                this.f1262a = true;
                notifyDataSetChanged();
            } else {
                this.f1265d = -1;
                this.f1262a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract String mo1218c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo1219d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f1262a || (cursor = this.f1264c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1262a) {
            return null;
        }
        this.f1264c.moveToPosition(i2);
        if (view == null) {
            ViewOnClickListenerC0995g1 viewOnClickListenerC0995g1 = (ViewOnClickListenerC0995g1) this;
            view = viewOnClickListenerC0995g1.f3931j.inflate(viewOnClickListenerC0995g1.f3930i, viewGroup, false);
        }
        mo1216a(view, this.f1264c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f1268g == null) {
            C0462d c0462d = new C0462d();
            c0462d.f1269a = this;
            this.f1268g = c0462d;
        }
        return this.f1268g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f1262a || (cursor = this.f1264c) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f1264c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f1262a && (cursor = this.f1264c) != null && cursor.moveToPosition(i2)) {
            return this.f1264c.getLong(this.f1265d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f1262a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1264c.moveToPosition(i2)) {
            throw new IllegalStateException(AbstractC0044g.m153e("couldn't move cursor to position ", i2));
        }
        if (view == null) {
            view = mo1219d(viewGroup);
        }
        mo1216a(view, this.f1264c);
        return view;
    }
}
