package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum d1 implements xa.o {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11888a;

    d1(int i7) {
        this.f11888a = i7;
    }

    @Override // xa.o
    public final int getNumber() {
        return this.f11888a;
    }
}
