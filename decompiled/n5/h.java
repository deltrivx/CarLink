package n5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k[] f8830c = new k[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f8831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k[] f8832b;

    @Override // n5.k
    public final m a(b bVar, Map map) {
        c(map);
        return b(bVar);
    }

    public final m b(b bVar) throws i {
        k[] kVarArr = this.f8832b;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                try {
                    return kVar.a(bVar, this.f8831a);
                } catch (l unused) {
                }
            }
        }
        throw i.f8833c;
    }

    public final void c(Map map) {
        this.f8831a = map;
        boolean z10 = map != null && map.containsKey(d.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z11 = collection.contains(a.f8803o) || collection.contains(a.f8804p) || collection.contains(a.f8797h) || collection.contains(a.f8796g) || collection.contains(a.f8791b) || collection.contains(a.f8792c) || collection.contains(a.f8793d) || collection.contains(a.f8794e) || collection.contains(a.f8798i) || collection.contains(a.f8801m) || collection.contains(a.f8802n);
            if (z11 && !z10) {
                arrayList.add(new b6.g(map, 0));
            }
            if (collection.contains(a.f8800l)) {
                arrayList.add(new j6.a());
            }
            if (collection.contains(a.f8795f)) {
                arrayList.add(new w5.a());
            }
            if (collection.contains(a.f8790a)) {
                arrayList.add(new o5.b());
            }
            if (collection.contains(a.k)) {
                arrayList.add(new f6.b());
            }
            if (collection.contains(a.f8799j)) {
                arrayList.add(new z5.a());
            }
            if (z11 && z10) {
                arrayList.add(new b6.g(map, 0));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z10) {
                arrayList.add(new b6.g(map, 0));
            }
            arrayList.add(new j6.a());
            arrayList.add(new w5.a());
            arrayList.add(new o5.b());
            arrayList.add(new f6.b());
            arrayList.add(new z5.a());
            if (z10) {
                arrayList.add(new b6.g(map, 0));
            }
        }
        this.f8832b = (k[]) arrayList.toArray(f8830c);
    }

    @Override // n5.k
    public final void reset() {
        k[] kVarArr = this.f8832b;
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                kVar.reset();
            }
        }
    }
}
