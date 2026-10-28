package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.a f13806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13807b;

    public i(h9.a aVar, boolean z10) {
        this.f13806a = aVar;
        this.f13807b = z10;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r1.p pVar = (r1.p) obj;
        f1.s sVar = (f1.s) obj2;
        ((Number) obj3).intValue();
        sVar.W(-196777734);
        final long j5 = ((y1) sVar.j(z1.f14024a)).f14016a;
        boolean zE = sVar.e(j5);
        final h9.a aVar = this.f13806a;
        boolean zF = zE | sVar.f(aVar);
        final boolean z10 = this.f13807b;
        boolean zG = zF | sVar.g(z10);
        Object objK = sVar.K();
        if (zG || objK == f1.n.f5051a) {
            objK = new h9.k() { // from class: w0.g
                @Override // h9.k
                public final Object invoke(Object obj4) {
                    v1.c cVar = (v1.c) obj4;
                    final y1.f fVarQ = y0.q(cVar, Float.intBitsToFloat((int) (cVar.f13592a.g() >> 32)) / 2.0f);
                    final y1.k kVar = new y1.k(5, j5);
                    final h9.a aVar2 = aVar;
                    final boolean z11 = z10;
                    return cVar.b(new h9.k() { // from class: w0.h
                        @Override // h9.k
                        public final Object invoke(Object obj5) {
                            q2.j0 j0Var = (q2.j0) obj5;
                            j0Var.b();
                            a2.c cVar2 = j0Var.f10720a;
                            if (((Boolean) aVar2.invoke()).booleanValue()) {
                                boolean z12 = z11;
                                y1.f fVar = fVarQ;
                                y1.k kVar2 = kVar;
                                if (z12) {
                                    long jC0 = cVar2.c0();
                                    a2.b bVar = cVar2.f16b;
                                    long J = bVar.J();
                                    bVar.z().h();
                                    try {
                                        ((a2.d) bVar.f12b).y(-1.0f, 1.0f, jC0);
                                        cVar2.d(fVar, kVar2);
                                    } finally {
                                        ob.a.y(bVar, J);
                                    }
                                } else {
                                    cVar2.d(fVar, kVar2);
                                }
                            }
                            return t8.z.f12851a;
                        }
                    });
                }
            };
            sVar.h0(objK);
        }
        r1.p pVarB = androidx.compose.ui.draw.a.b(pVar, (h9.k) objK);
        sVar.p(false);
        return pVarB;
    }
}
