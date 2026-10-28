package f7;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5450c;

    @Override // f7.k
    public final n5.b b(n5.j jVar) {
        if (this.f5450c) {
            this.f5450c = false;
            return new n5.b(new t5.e(new n5.g(jVar)));
        }
        this.f5450c = true;
        return new n5.b(new t5.e(jVar));
    }
}
