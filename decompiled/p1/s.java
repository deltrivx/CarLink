package p1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements z, Map, j9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f10073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f10074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f10075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f10076d;

    public s() {
        k1.c cVar = k1.c.f7149c;
        f fVarK = l.k();
        r rVar = new r(fVarK.g(), cVar);
        if (!(fVarK instanceof a)) {
            rVar.f10010b = new r(1, cVar);
        }
        this.f10073a = rVar;
        this.f10074b = new m(this, 0);
        this.f10075c = new m(this, 1);
        this.f10076d = new m(this, 2);
    }

    public static final boolean a(s sVar, r rVar, int i7, i1.d dVar) {
        boolean z10;
        synchronized (q.f10070b) {
            int i10 = rVar.f10072d;
            if (i10 == i7) {
                rVar.f10071c = dVar;
                z10 = true;
                rVar.f10072d = i10 + 1;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public static void b(r rVar) {
        k1.c cVar = k1.c.f7149c;
        synchronized (q.f10070b) {
            rVar.f10071c = cVar;
            rVar.f10072d++;
        }
    }

    @Override // p1.z
    public final b0 c() {
        return this.f10073a;
    }

    @Override // java.util.Map
    public final void clear() {
        f fVarK;
        r rVar = this.f10073a;
        i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        if (k1.c.f7149c != ((r) l.i(rVar)).f10071c) {
            r rVar2 = this.f10073a;
            i9.l.c(rVar2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f10057c) {
                fVarK = l.k();
                b((r) l.x(rVar2, this, fVarK));
            }
            l.o(fVarK, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().f10071c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().f10071c.containsValue(obj);
    }

    @Override // p1.z
    public final /* synthetic */ b0 d(b0 b0Var, b0 b0Var2, b0 b0Var3) {
        return null;
    }

    public final r e() {
        r rVar = this.f10073a;
        i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (r) l.u(rVar, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f10074b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().f10071c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((u8.f) e().f10071c).isEmpty();
    }

    @Override // p1.z
    public final void k(b0 b0Var) {
        i9.l.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f10073a = (r) b0Var;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f10075c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        i1.d dVar;
        int i7;
        Object objPut;
        f fVarK;
        boolean zA;
        do {
            synchronized (q.f10070b) {
                r rVar = this.f10073a;
                i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                dVar = rVar2.f10071c;
                i7 = rVar2.f10072d;
            }
            i9.l.b(dVar);
            k1.e eVar = (k1.e) dVar.builder();
            objPut = eVar.put(obj, obj2);
            i1.d dVarBuild = eVar.build();
            if (i9.l.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = this.f10073a;
            i9.l.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f10057c) {
                fVarK = l.k();
                zA = a(this, (r) l.x(rVar3, this, fVarK), i7, dVarBuild);
            }
            l.o(fVarK, this);
        } while (!zA);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        i1.d dVar;
        int i7;
        f fVarK;
        boolean zA;
        do {
            synchronized (q.f10070b) {
                r rVar = this.f10073a;
                i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                dVar = rVar2.f10071c;
                i7 = rVar2.f10072d;
            }
            i9.l.b(dVar);
            k1.e eVar = (k1.e) dVar.builder();
            eVar.putAll(map);
            i1.d dVarBuild = eVar.build();
            if (i9.l.a(dVarBuild, dVar)) {
                return;
            }
            r rVar3 = this.f10073a;
            i9.l.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f10057c) {
                fVarK = l.k();
                zA = a(this, (r) l.x(rVar3, this, fVarK), i7, dVarBuild);
            }
            l.o(fVarK, this);
        } while (!zA);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        i1.d dVar;
        int i7;
        Object objRemove;
        f fVarK;
        boolean zA;
        do {
            synchronized (q.f10070b) {
                r rVar = this.f10073a;
                i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                dVar = rVar2.f10071c;
                i7 = rVar2.f10072d;
            }
            i9.l.b(dVar);
            i1.c cVarBuilder = dVar.builder();
            objRemove = cVarBuilder.remove(obj);
            i1.d dVarBuild = cVarBuilder.build();
            if (i9.l.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = this.f10073a;
            i9.l.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f10057c) {
                fVarK = l.k();
                zA = a(this, (r) l.x(rVar3, this, fVarK), i7, dVarBuild);
            }
            l.o(fVarK, this);
        } while (!zA);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        u8.f fVar = (u8.f) e().f10071c;
        fVar.getClass();
        return ((k1.c) fVar).f7151b;
    }

    public final String toString() {
        r rVar = this.f10073a;
        i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((r) l.i(rVar)).f10071c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f10076d;
    }
}
