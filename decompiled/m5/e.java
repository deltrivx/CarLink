package m5;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f8454b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f8455c = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8456a;

    public /* synthetic */ e(int i7) {
        this.f8456a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f8456a) {
            case 0:
                return Float.valueOf(y1.q.d(((y1.q) obj).f14960a));
            default:
                long j5 = ((y1.q) obj).f14960a;
                return Float.valueOf(Math.max(y1.q.h(j5), Math.max(y1.q.g(j5), y1.q.e(j5))));
        }
    }
}
