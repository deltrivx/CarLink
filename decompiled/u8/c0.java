package u8;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends n3.n {
    public static int S0(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map T0(t8.j jVar) {
        i9.l.e(jVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(jVar.f12830a, jVar.f12831b);
        i9.l.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map U0(Map map) {
        i9.l.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        i9.l.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
