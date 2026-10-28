package c1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements x.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1921c;

    public i1(boolean z10, float f10, long j5) {
        this.f1919a = z10;
        this.f1920b = f10;
        this.f1921c = j5;
    }

    @Override // x.r0
    public final q2.l a(b0.k kVar) {
        return new d0(kVar, this.f1919a, this.f1920b, new b0(1, this));
    }

    @Override // x.n0
    public final x.o0 b(b0.k kVar, f1.s sVar) {
        sVar.W(1257603829);
        sVar.p(false);
        return x.a1.f14306a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f1919a == i1Var.f1919a && n3.f.a(this.f1920b, i1Var.f1920b)) {
            return y1.q.c(this.f1921c, i1Var.f1921c);
        }
        return false;
    }

    @Override // x.r0
    public final int hashCode() {
        int iJ = ob.a.j(this.f1920b, (this.f1919a ? 1231 : 1237) * 31, 961);
        int i7 = y1.q.f14959n;
        return t8.u.a(this.f1921c) + iJ;
    }
}
