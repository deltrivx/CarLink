package v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f13377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13378b;

    public i0(x0 x0Var, long j5) {
        this.f13377a = x0Var;
        this.f13378b = j5;
    }

    @Override // v.x0
    public final p F(long j5, p pVar, p pVar2, p pVar3) {
        long j10 = this.f13378b;
        return j5 < j10 ? pVar : this.f13377a.F(j5 - j10, pVar, pVar2, pVar3);
    }

    @Override // v.x0
    public final p T(long j5, p pVar, p pVar2, p pVar3) {
        long j10 = this.f13378b;
        return j5 < j10 ? pVar3 : this.f13377a.T(j5 - j10, pVar, pVar2, pVar3);
    }

    @Override // v.x0
    public final boolean a() {
        return this.f13377a.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return i0Var.f13378b == this.f13378b && i9.l.a(i0Var.f13377a, this.f13377a);
    }

    public final int hashCode() {
        int iHashCode = this.f13377a.hashCode() * 31;
        long j5 = this.f13378b;
        return iHashCode + ((int) (j5 ^ (j5 >>> 32)));
    }

    @Override // v.x0
    public final long r(p pVar, p pVar2, p pVar3) {
        return this.f13377a.r(pVar, pVar2, pVar3) + this.f13378b;
    }

    @Override // v.x0
    public final p s(p pVar, p pVar2, p pVar3) {
        return T(r(pVar, pVar2, pVar3), pVar, pVar2, pVar3);
    }
}
