package p013E1;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p007C1.AbstractC0066f;
import p075d1.C0766r;
import p095l1.AbstractC1136c;
import p123v1.C1287q;
import p132y1.C1323c;

/* renamed from: E1.c */
/* loaded from: classes.dex */
public abstract class AbstractC0111c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet f325a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public static final Map f326b;

    static {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = C1287q.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C1287q.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC0066f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C1323c.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        int size = linkedHashMap.size();
        if (size == 0) {
            map = C0766r.f2997a;
        } else if (size != 1) {
            map = new LinkedHashMap(linkedHashMap);
        } else {
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            map = Collections.singletonMap(entry.getKey(), entry.getValue());
            AbstractC1136c.m2636d(map, "with(entries.iterator().…ingletonMap(key, value) }");
        }
        f326b = map;
    }
}
