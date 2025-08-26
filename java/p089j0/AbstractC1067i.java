package p089j0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: j0.i */
/* loaded from: classes.dex */
public abstract class AbstractC1067i {
    /* renamed from: a */
    public static <T, V> ObjectAnimator m2585a(T t2, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
    }
}
