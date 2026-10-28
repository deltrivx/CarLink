package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r3.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.d f13847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f13848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13849c = 0;

    public m(r1.d dVar, q qVar) {
        this.f13847a = dVar;
        this.f13848b = qVar;
    }

    @Override // r3.y
    public final long a(n3.k kVar, long j5, n3.o oVar, long j10) {
        long jA = this.f13848b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.f13849c;
        }
        this.f13849c = jA;
        return n3.j.c(n3.j.c((((long) kVar.f8741a) << 32) | (((long) kVar.f8742b) & 4294967295L), o9.e0.O(jA)), this.f13847a.a(j10, 0L, oVar));
    }
}
