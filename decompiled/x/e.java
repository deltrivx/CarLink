package x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14346b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, y8.c cVar, int i7) {
        super(2, cVar);
        this.f14345a = i7;
        this.f14346b = fVar;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f14345a) {
            case 0:
                return new e(this.f14346b, cVar, 0);
            default:
                return new e(this.f14346b, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f14345a) {
            case 0:
                e eVar = (e) create(yVar, cVar);
                t8.z zVar = t8.z.f12851a;
                eVar.invokeSuspend(zVar);
                return zVar;
            default:
                e eVar2 = (e) create(yVar, cVar);
                t8.z zVar2 = t8.z.f12851a;
                eVar2.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f14345a) {
            case 0:
                t8.a.e(obj);
                f fVar = this.f14346b;
                if (fVar.C == null) {
                    b0.h hVar = new b0.h();
                    b0.k kVar = fVar.f14349q;
                    if (kVar != null) {
                        cc.b0.s(fVar.m0(), null, new b0.g(kVar, hVar, null, 22), 3);
                    }
                    fVar.C = hVar;
                }
                break;
            default:
                t8.a.e(obj);
                f fVar2 = this.f14346b;
                b0.h hVar2 = fVar2.C;
                if (hVar2 != null) {
                    b0.i iVar = new b0.i(hVar2);
                    b0.k kVar2 = fVar2.f14349q;
                    y8.c cVar = null;
                    if (kVar2 != null) {
                        cc.b0.s(fVar2.m0(), null, new b0.g(kVar2, iVar, cVar, 23), 3);
                    }
                    fVar2.C = null;
                }
                break;
        }
        return t8.z.f12851a;
    }
}
