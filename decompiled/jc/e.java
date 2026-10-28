package jc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f7119d;

    static {
        int i7 = k.f7127c;
        int i10 = k.f7128d;
        long j5 = k.f7129e;
        String str = k.f7125a;
        e eVar = new e();
        eVar.f7121c = new c(i7, i10, j5, str);
        f7119d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // cc.u
    public final String toString() {
        return "Dispatchers.Default";
    }
}
