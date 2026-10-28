package rc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends e6.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12320d;

    public e(j.g gVar, boolean z10) {
        super(gVar);
        this.f12320d = z10;
    }

    @Override // e6.h
    public final void i(String str) {
        i9.l.e(str, "value");
        if (this.f12320d) {
            super.i(str);
        } else {
            g(str);
        }
    }
}
