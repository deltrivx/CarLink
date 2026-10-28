package p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Set, j9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f10065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10066b;

    public m(s sVar, int i7) {
        this.f10066b = i7;
        this.f10065a = sVar;
    }

    private final boolean c(Collection collection) {
        i1.d dVar;
        int i7;
        f fVarK;
        boolean zA;
        Collection<Map.Entry> collection2 = collection;
        int iS0 = u8.c0.S0(u8.q.a0(collection2, 10));
        if (iS0 < 16) {
            iS0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        s sVar = this.f10065a;
        boolean z10 = false;
        do {
            synchronized (q.f10070b) {
                r rVar = sVar.f10073a;
                i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                dVar = rVar2.f10071c;
                i7 = rVar2.f10072d;
            }
            i9.l.b(dVar);
            i1.c cVarBuilder = dVar.builder();
            Iterator it = sVar.f10074b.iterator();
            while (((y) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((y) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !i9.l.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    cVarBuilder.remove(entry2.getKey());
                    z10 = true;
                }
            }
            i1.d dVarBuild = cVarBuilder.build();
            if (i9.l.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = sVar.f10073a;
            i9.l.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f10057c) {
                fVarK = l.k();
                zA = s.a(sVar, (r) l.x(rVar3, sVar, fVarK), i7, dVarBuild);
            }
            l.o(fVarK, sVar);
        } while (!zA);
        return z10;
    }

    private final boolean d(Collection collection) {
        i1.d dVar;
        int i7;
        f fVarK;
        boolean zA;
        Set setM0 = u8.p.M0(collection);
        s sVar = this.f10065a;
        boolean z10 = false;
        do {
            synchronized (q.f10070b) {
                r rVar = sVar.f10073a;
                i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                r rVar2 = (r) l.i(rVar);
                dVar = rVar2.f10071c;
                i7 = rVar2.f10072d;
            }
            i9.l.b(dVar);
            i1.c cVarBuilder = dVar.builder();
            Iterator it = sVar.f10074b.iterator();
            while (((y) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((y) it).next();
                if (!setM0.contains(entry.getKey())) {
                    cVarBuilder.remove(entry.getKey());
                    z10 = true;
                }
            }
            i1.d dVarBuild = cVarBuilder.build();
            if (i9.l.a(dVarBuild, dVar)) {
                break;
            }
            r rVar3 = sVar.f10073a;
            i9.l.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (l.f10057c) {
                fVarK = l.k();
                zA = s.a(sVar, (r) l.x(rVar3, sVar, fVarK), i7, dVarBuild);
            }
            l.o(fVarK, sVar);
        } while (!zA);
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f10066b) {
            case 0:
                q.h();
                throw null;
            case 1:
                q.h();
                throw null;
            default:
                q.h();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f10066b) {
            case 0:
                q.h();
                throw null;
            case 1:
                q.h();
                throw null;
            default:
                q.h();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f10065a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f10066b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof j9.a) && !(obj instanceof j9.c))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return i9.l.a(this.f10065a.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f10065a.containsKey(obj);
            default:
                return this.f10065a.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f10066b) {
            case 0:
                Collection collection2 = collection;
                if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!contains((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (!this.f10065a.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if ((collection4 instanceof Collection) && collection4.isEmpty()) {
                    return true;
                }
                Iterator it3 = collection4.iterator();
                while (it3.hasNext()) {
                    if (!this.f10065a.containsValue(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f10065a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f10066b) {
            case 0:
                s sVar = this.f10065a;
                return new y(sVar, ((i1.b) ((u8.f) sVar.e().f10071c).entrySet()).iterator(), 0);
            case 1:
                s sVar2 = this.f10065a;
                return new y(sVar2, ((i1.b) ((u8.f) sVar2.e().f10071c).entrySet()).iterator(), 1);
            default:
                s sVar3 = this.f10065a;
                return new y(sVar3, ((i1.b) ((u8.f) sVar3.e().f10071c).entrySet()).iterator(), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[ORIG_RETURN, RETURN] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v8 java.lang.Object, still in use, count: 2, list:
          (r2v8 java.lang.Object) from 0x002c: PHI (r2 I:??) = (r2v3 java.lang.Object), (r2v8 java.lang.Object) binds: [B:10:0x002b, B:32:0x002c] A[DONT_GENERATE, DONT_INLINE]
          (r2v8 java.lang.Object) from 0x001e: CHECK_CAST (java.util.Map$Entry) (r2v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f10066b
            switch(r0) {
                case 0: goto L47;
                case 1: goto L3b;
                default: goto L5;
            }
        L5:
            p1.s r0 = r4.f10065a
            p1.m r1 = r0.f10074b
            java.util.Iterator r1 = r1.iterator()
        Ld:
            r2 = r1
            p1.y r2 = (p1.y) r2
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L2b
            r2 = r1
            p1.y r2 = (p1.y) r2
            java.lang.Object r2 = r2.next()
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            boolean r3 = i9.l.a(r3, r5)
            if (r3 == 0) goto Ld
            goto L2c
        L2b:
            r2 = 0
        L2c:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L39
            java.lang.Object r5 = r2.getKey()
            r0.remove(r5)
            r5 = 1
            goto L3a
        L39:
            r5 = 0
        L3a:
            return r5
        L3b:
            p1.s r0 = r4.f10065a
            java.lang.Object r5 = r0.remove(r5)
            if (r5 == 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = 0
        L46:
            return r5
        L47:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L63
            boolean r0 = r5 instanceof j9.a
            if (r0 == 0) goto L54
            boolean r0 = r5 instanceof j9.c
            if (r0 == 0) goto L63
        L54:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            p1.s r0 = r4.f10065a
            java.lang.Object r5 = r5.getKey()
            java.lang.Object r5 = r0.remove(r5)
            if (r5 == 0) goto L63
            r1 = 1
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.m.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        i1.d dVar;
        int i7;
        f fVarK;
        boolean zA;
        switch (this.f10066b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z10 = false;
                    while (it.hasNext()) {
                        if (this.f10065a.remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                            z10 = true;
                        }
                    }
                    return z10;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z11 = false;
                    while (it2.hasNext()) {
                        if (this.f10065a.remove(it2.next()) != null || z11) {
                            z11 = true;
                        }
                    }
                    return z11;
                }
            default:
                Set setM0 = u8.p.M0(collection);
                s sVar = this.f10065a;
                boolean z12 = false;
                do {
                    synchronized (q.f10070b) {
                        r rVar = sVar.f10073a;
                        i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) l.i(rVar);
                        dVar = rVar2.f10071c;
                        i7 = rVar2.f10072d;
                    }
                    i9.l.b(dVar);
                    i1.c cVarBuilder = dVar.builder();
                    Iterator it3 = sVar.f10074b.iterator();
                    while (((y) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((y) it3).next();
                        if (setM0.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z12 = true;
                        }
                    }
                    i1.d dVarBuild = cVarBuilder.build();
                    if (!i9.l.a(dVarBuild, dVar)) {
                        r rVar3 = sVar.f10073a;
                        i9.l.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f10057c) {
                            fVarK = l.k();
                            zA = s.a(sVar, (r) l.x(rVar3, sVar, fVarK), i7, dVarBuild);
                        }
                        l.o(fVarK, sVar);
                    }
                    return z12;
                } while (!zA);
                return z12;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        i1.d dVar;
        int i7;
        f fVarK;
        boolean zA;
        switch (this.f10066b) {
            case 0:
                return c(collection);
            case 1:
                return d(collection);
            default:
                Set setM0 = u8.p.M0(collection);
                s sVar = this.f10065a;
                boolean z10 = false;
                do {
                    synchronized (q.f10070b) {
                        r rVar = sVar.f10073a;
                        i9.l.c(rVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        r rVar2 = (r) l.i(rVar);
                        dVar = rVar2.f10071c;
                        i7 = rVar2.f10072d;
                    }
                    i9.l.b(dVar);
                    i1.c cVarBuilder = dVar.builder();
                    Iterator it = sVar.f10074b.iterator();
                    while (((y) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((y) it).next();
                        if (!setM0.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z10 = true;
                        }
                    }
                    i1.d dVarBuild = cVarBuilder.build();
                    if (!i9.l.a(dVarBuild, dVar)) {
                        r rVar3 = sVar.f10073a;
                        i9.l.c(rVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (l.f10057c) {
                            fVarK = l.k();
                            zA = s.a(sVar, (r) l.x(rVar3, sVar, fVarK), i7, dVarBuild);
                        }
                        l.o(fVarK, sVar);
                    }
                    return z10;
                } while (!zA);
                return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f10065a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return i9.k.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i9.k.b(this, objArr);
    }
}
