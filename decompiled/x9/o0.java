package x9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements hb.d, n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f14731b = new o0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f14732c = new o0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14733a;

    public /* synthetic */ o0(int i7) {
        this.f14733a = i7;
    }

    @Override // hb.d, x9.t0
    public nb.w getType() {
        switch (this.f14733a) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f14733a) {
            case 7:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
