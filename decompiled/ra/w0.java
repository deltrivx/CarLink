package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum w0 implements xa.o {
    IN(0),
    OUT(1),
    INV(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12248a;

    w0(int i7) {
        this.f12248a = i7;
    }

    @Override // xa.o
    public final int getNumber() {
        return this.f12248a;
    }
}
