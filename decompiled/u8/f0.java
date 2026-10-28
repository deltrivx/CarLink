package u8;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends n3.r {
    public static LinkedHashSet g0(Set set, Iterable iterable) {
        int size;
        i9.l.e(set, "<this>");
        i9.l.e(iterable, "elements");
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0.S0(size));
        linkedHashSet.addAll(set);
        u.c0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet h0(Set set, Object obj) {
        i9.l.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0.S0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
