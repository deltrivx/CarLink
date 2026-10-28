package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum p0 implements xa.o {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12127a;

    p0(int i7) {
        this.f12127a = i7;
    }

    @Override // xa.o
    public final int getNumber() {
        return this.f12127a;
    }
}
