package u8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends c0 {
    public static Object V0(Object obj, Map map) {
        i9.l.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static Map W0(t8.j... jVarArr) {
        if (jVarArr.length <= 0) {
            return x.f13123a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0.S0(jVarArr.length));
        X0(linkedHashMap, jVarArr);
        return linkedHashMap;
    }

    public static final void X0(HashMap map, t8.j[] jVarArr) {
        for (t8.j jVar : jVarArr) {
            map.put(jVar.f12830a, jVar.f12831b);
        }
    }

    public static List Y0(LinkedHashMap linkedHashMap) {
        if (linkedHashMap.size() != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return n3.l.I(new t8.j(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                arrayList.add(new t8.j(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new t8.j(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return w.f13122a;
    }

    public static Map Z0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return x.f13123a;
        }
        if (size == 1) {
            return c0.T0((t8.j) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0.S0(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t8.j jVar = (t8.j) it.next();
            linkedHashMap.put(jVar.f12830a, jVar.f12831b);
        }
        return linkedHashMap;
    }
}
