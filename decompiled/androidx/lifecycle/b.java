package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1011a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1012b;

    public b(HashMap map) {
        this.f1012b = map;
        for (Map.Entry entry : map.entrySet()) {
            n nVar = (n) entry.getValue();
            List arrayList = (List) this.f1011a.get(nVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1011a.put(nVar, arrayList);
            }
            arrayList.add((c) entry.getKey());
        }
    }

    public static void a(List list, t tVar, n nVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f1014b;
                try {
                    int i7 = cVar.f1013a;
                    if (i7 == 0) {
                        method.invoke(obj, null);
                    } else if (i7 == 1) {
                        method.invoke(obj, tVar);
                    } else if (i7 == 2) {
                        method.invoke(obj, tVar, nVar);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
