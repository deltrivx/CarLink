package ga;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f6092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f6093b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f6092a = linkedHashMap;
        b(wa.h.f14276t, a("java.util.ArrayList", "java.util.LinkedList"));
        b(wa.h.f14277u, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(wa.h.f14278v, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        wa.c cVar = new wa.c("java.util.function.Function");
        b(new wa.b(cVar.b(), cVar.f14240a.f()), a("java.util.function.UnaryOperator"));
        wa.c cVar2 = new wa.c("java.util.function.BiFunction");
        b(new wa.b(cVar2.b(), cVar2.f14240a.f()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new t8.j(((wa.b) entry.getKey()).a(), ((wa.b) entry.getValue()).a()));
        }
        f6093b = u8.b0.Z0(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            wa.c cVar = new wa.c(str);
            arrayList.add(new wa.b(cVar.b(), cVar.f14240a.f()));
        }
        return arrayList;
    }

    public static void b(wa.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f6092a.put(obj, bVar);
        }
    }
}
