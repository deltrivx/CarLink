package b6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import n5.l;
import n5.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h[] f1541c = new h[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k[] f1542d = new k[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h[] f1544b;

    public g(Map map, int i7) {
        this.f1543a = i7;
        switch (i7) {
            case 1:
                Collection collection = map == null ? null : (Collection) map.get(n5.d.POSSIBLE_FORMATS);
                ArrayList arrayList = new ArrayList();
                if (collection != null) {
                    if (collection.contains(n5.a.f8797h)) {
                        arrayList.add(new e(0));
                    } else if (collection.contains(n5.a.f8803o)) {
                        arrayList.add(new e(3));
                    }
                    if (collection.contains(n5.a.f8796g)) {
                        arrayList.add(new e(2));
                    }
                    if (collection.contains(n5.a.f8804p)) {
                        arrayList.add(new e(1));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(new e(0));
                    arrayList.add(new e(2));
                    arrayList.add(new e(1));
                }
                this.f1544b = (k[]) arrayList.toArray(f1542d);
                break;
            default:
                Collection collection2 = map == null ? null : (Collection) map.get(n5.d.POSSIBLE_FORMATS);
                boolean z10 = (map == null || map.get(n5.d.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
                ArrayList arrayList2 = new ArrayList();
                if (collection2 != null) {
                    if (collection2.contains(n5.a.f8797h) || collection2.contains(n5.a.f8803o) || collection2.contains(n5.a.f8796g) || collection2.contains(n5.a.f8804p)) {
                        arrayList2.add(new g(map, 1));
                    }
                    if (collection2.contains(n5.a.f8792c)) {
                        arrayList2.add(new c(z10));
                    }
                    if (collection2.contains(n5.a.f8793d)) {
                        arrayList2.add(new d());
                    }
                    if (collection2.contains(n5.a.f8794e)) {
                        arrayList2.add(new b());
                    }
                    if (collection2.contains(n5.a.f8798i)) {
                        arrayList2.add(new f());
                    }
                    if (collection2.contains(n5.a.f8791b)) {
                        arrayList2.add(new a());
                    }
                    if (collection2.contains(n5.a.f8801m)) {
                        arrayList2.add(new c6.e());
                    }
                    if (collection2.contains(n5.a.f8802n)) {
                        arrayList2.add(new d6.c());
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(new g(map, 1));
                    arrayList2.add(new c(false));
                    arrayList2.add(new a());
                    arrayList2.add(new d());
                    arrayList2.add(new b());
                    arrayList2.add(new f());
                    arrayList2.add(new c6.e());
                    arrayList2.add(new d6.c());
                }
                this.f1544b = (h[]) arrayList2.toArray(f1541c);
                break;
        }
    }

    @Override // b6.h
    public final m b(int i7, t5.a aVar, Map map) throws n5.i {
        switch (this.f1543a) {
            case 0:
                for (h hVar : this.f1544b) {
                    try {
                        return hVar.b(i7, aVar, map);
                    } catch (l unused) {
                    }
                }
                throw n5.i.f8833c;
            default:
                int[] iArrM = k.m(aVar);
                for (k kVar : (k[]) this.f1544b) {
                    try {
                        m mVarK = kVar.k(i7, aVar, iArrM, map);
                        boolean z10 = mVarK.f8842d == n5.a.f8797h && mVarK.f8839a.charAt(0) == '0';
                        Collection collection = map == null ? null : (Collection) map.get(n5.d.POSSIBLE_FORMATS);
                        n5.a aVar2 = n5.a.f8803o;
                        boolean z11 = collection == null || collection.contains(aVar2);
                        if (!z10 || !z11) {
                            return mVarK;
                        }
                        m mVar = new m(mVarK.f8839a.substring(1), mVarK.f8840b, mVarK.f8841c, aVar2);
                        mVar.a(mVarK.f8843e);
                        return mVar;
                    } catch (l unused2) {
                    }
                }
                throw n5.i.f8833c;
        }
    }

    @Override // b6.h, n5.k
    public final void reset() {
        switch (this.f1543a) {
            case 0:
                for (h hVar : this.f1544b) {
                    hVar.reset();
                }
                break;
            default:
                for (k kVar : (k[]) this.f1544b) {
                    kVar.getClass();
                }
                break;
        }
    }
}
