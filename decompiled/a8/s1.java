package a8;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements fc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fc.d f234b;

    public /* synthetic */ s1(fc.h0 h0Var, int i7) {
        this.f233a = i7;
        this.f234b = h0Var;
    }

    @Override // fc.d
    public final Object l(fc.e eVar, y8.c cVar) {
        switch (this.f233a) {
            case 0:
                Object objL = this.f234b.l(new r1(eVar, 0), cVar);
                return objL == z8.a.f15774a ? objL : t8.z.f12851a;
            case 1:
                Object objL2 = this.f234b.l(new r1(eVar, 2), cVar);
                return objL2 == z8.a.f15774a ? objL2 : t8.z.f12851a;
            case 2:
                Object objL3 = this.f234b.l(new r1(eVar, 4), cVar);
                return objL3 == z8.a.f15774a ? objL3 : t8.z.f12851a;
            default:
                Object objL4 = this.f234b.l(new r1(eVar, 6), cVar);
                return objL4 == z8.a.f15774a ? objL4 : t8.z.f12851a;
        }
    }
}
