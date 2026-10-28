package gc;

import cc.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a9.i f6243e;

    /* JADX WARN: Multi-variable type inference failed */
    public k(h9.o oVar, fc.d dVar, y8.h hVar, int i7, ec.a aVar) {
        super(dVar, hVar, i7, aVar);
        this.f6243e = (a9.i) oVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [a9.i, h9.o] */
    @Override // gc.f
    public final f a(y8.h hVar, int i7, ec.a aVar) {
        return new k(this.f6243e, this.f6227d, hVar, i7, aVar);
    }

    @Override // gc.f
    public final Object c(fc.e eVar, y8.c cVar) {
        Object objG = b0.g(new h(this, eVar, null), cVar);
        return objG == z8.a.f15774a ? objG : t8.z.f12851a;
    }
}
