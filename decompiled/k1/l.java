package k1;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l extends u8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f7171a;

    public l(c cVar) {
        this.f7171a = cVar;
    }

    @Override // u8.a
    public final int c() {
        c cVar = this.f7171a;
        cVar.getClass();
        return cVar.f7151b;
    }

    @Override // u8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f7171a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m mVar = this.f7171a.f7150a;
        n[] nVarArr = new n[8];
        for (int i7 = 0; i7 < 8; i7++) {
            nVarArr[i7] = new o(2);
        }
        return new k(mVar, nVarArr);
    }
}
