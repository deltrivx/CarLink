package tb;

import v.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12922a;

    @Override // v.x0
    public v.p F(long j5, v.p pVar, v.p pVar2, v.p pVar3) {
        return j5 < ((long) this.f12922a) * 1000000 ? pVar : pVar2;
    }

    @Override // v.x0
    public v.p T(long j5, v.p pVar, v.p pVar2, v.p pVar3) {
        return pVar3;
    }

    @Override // v.x0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // v.x0
    public long r(v.p pVar, v.p pVar2, v.p pVar3) {
        return ((long) this.f12922a) * 1000000;
    }

    @Override // v.x0
    public v.p s(v.p pVar, v.p pVar2, v.p pVar3) {
        return pVar3;
    }
}
