package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1042b;

    public /* synthetic */ j0(int i7, Object obj) {
        this.f1041a = i7;
        this.f1042b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.s0, java.lang.Object] */
    @Override // h9.a
    public final Object invoke() {
        switch (this.f1041a) {
            case 0:
                return i0.g(this.f1042b);
            default:
                return this.f1042b;
        }
    }
}
