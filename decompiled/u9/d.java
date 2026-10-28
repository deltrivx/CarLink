package u9;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f13133a;

    static {
        Set<k> set = k.f13148e;
        ArrayList arrayList = new ArrayList(u8.q.a0(set, 10));
        for (k kVar : set) {
            i9.l.e(kVar, "primitiveType");
            arrayList.add(o.k.a(kVar.f13157a));
        }
        ArrayList<wa.c> arrayListY0 = u8.p.y0(u8.p.y0(u8.p.y0(arrayList, n.f13175f.g()), n.f13179h.g()), n.f13181j.g());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (wa.c cVar : arrayListY0) {
            i9.l.e(cVar, "topLevelFqName");
            linkedHashSet.add(new wa.b(cVar.b(), cVar.f14240a.f()));
        }
        f13133a = linkedHashSet;
    }
}
