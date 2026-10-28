package tb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f12952d = new y(0, "must have no value parameters");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f12953e = new y(1, "must have a single value parameter");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i7, String str) {
        super(1, str);
        this.f12954c = i7;
    }

    @Override // tb.e
    public final boolean b(ia.e eVar) {
        switch (this.f12954c) {
            case 0:
                return eVar.X().isEmpty();
            default:
                return eVar.X().size() == 1;
        }
    }
}
