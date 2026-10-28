package o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends r1.o implements q2.w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h9.k f9422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9423p;

    @Override // q2.w
    public final /* synthetic */ void T(w wVar) {
    }

    @Override // q2.w
    public final void n(long j5) {
        if (n3.m.a(this.f9423p, j5)) {
            return;
        }
        this.f9422o.invoke(new n3.m(j5));
        this.f9423p = j5;
    }

    @Override // r1.o
    public final boolean n0() {
        return true;
    }
}
