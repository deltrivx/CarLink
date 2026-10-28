package k1;

import e2.g0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f7181d;

    public p(g0 g0Var) {
        this.f7181d = g0Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f7179c;
        this.f7179c = i7 + 2;
        Object[] objArr = this.f7177a;
        return new b(this.f7181d, objArr[i7], objArr[i7 + 1]);
    }
}
