package ra;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public enum c0 implements xa.o {
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(2),
    /* JADX INFO: Fake field, exist only in values array */
    SEALED(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11858a;

    c0(int i7) {
        this.f11858a = i7;
    }

    @Override // xa.o
    public final int getNumber() {
        return this.f11858a;
    }
}
