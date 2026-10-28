package aa;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends j0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f431g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x9.y yVar, wa.c cVar, int i7) {
        super(yVar, cVar);
        this.f431g = i7;
        switch (i7) {
            case 1:
                super(yVar, cVar);
                break;
            default:
                i9.l.e(yVar, "module");
                i9.l.e(cVar, "fqName");
                break;
        }
    }

    @Override // x9.d0
    public final /* bridge */ /* synthetic */ gb.o U() {
        switch (this.f431g) {
            case 0:
                break;
        }
        return gb.n.f6198b;
    }
}
