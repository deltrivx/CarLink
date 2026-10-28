package tb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f12916d = new m(0, "must be a member function");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f12917e = new m(1, "must be a member or an extension function");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, String str) {
        super(0, str);
        this.f12918c = i7;
    }

    @Override // tb.e
    public final boolean b(ia.e eVar) {
        switch (this.f12918c) {
            case 0:
                return eVar.f481j != null;
            default:
                return (eVar.f481j == null && eVar.f480i == null) ? false : true;
        }
    }
}
