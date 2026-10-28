package tb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12950c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12951d;

    public x() {
        super(1, "must have exactly 2 value parameters");
        this.f12951d = 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(int i7) {
        StringBuilder sbT = ob.a.t("must have at least ", " value parameter", i7);
        sbT.append(i7 > 1 ? "s" : "");
        super(1, sbT.toString());
        this.f12951d = i7;
    }

    @Override // tb.e
    public final boolean b(ia.e eVar) {
        switch (this.f12950c) {
            case 0:
                return eVar.X().size() >= this.f12951d;
            default:
                return eVar.X().size() == this.f12951d;
        }
    }
}
