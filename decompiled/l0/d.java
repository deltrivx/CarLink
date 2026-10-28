package l0;

import z.g2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7617a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7620d;

    public /* synthetic */ d(float f10, y1.f fVar, y1.k kVar) {
        this.f7618b = f10;
        this.f7619c = fVar;
        this.f7620d = kVar;
    }

    public /* synthetic */ d(g2 g2Var, float f10, h9.k kVar) {
        this.f7619c = g2Var;
        this.f7618b = f10;
        this.f7620d = kVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f7617a) {
            case 0:
                float f10 = this.f7618b;
                y1.f fVar = (y1.f) this.f7619c;
                y1.k kVar = (y1.k) this.f7620d;
                q2.j0 j0Var = (q2.j0) obj;
                j0Var.b();
                a2.c cVar = j0Var.f10720a;
                a2.b bVar = cVar.f16b;
                long J = bVar.J();
                bVar.z().h();
                try {
                    a2.d dVar = (a2.d) bVar.f12b;
                    dVar.B(f10, 0.0f);
                    y1.o oVarZ = ((a2.b) dVar.f20b).z();
                    int i7 = (int) 0;
                    oVarZ.n(Float.intBitsToFloat(i7), Float.intBitsToFloat(i7));
                    oVarZ.o();
                    oVarZ.n(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i7));
                    cVar.d(fVar, kVar);
                } finally {
                    ob.a.y(bVar, J);
                }
                break;
            default:
                g2 g2Var = (g2) this.f7619c;
                h9.k kVar2 = (h9.k) this.f7620d;
                long jLongValue = ((Long) obj).longValue();
                if (g2Var.f15391b == Long.MIN_VALUE) {
                    g2Var.f15391b = jLongValue;
                }
                float f11 = g2Var.f15394e;
                v.l lVar = new v.l(f11);
                float f12 = this.f7618b;
                v.l lVar2 = g2.f15389f;
                long jR = f12 == 0.0f ? g2Var.f15390a.r(new v.l(f11), lVar2, g2Var.f15392c) : k9.a.N((jLongValue - g2Var.f15391b) / f12);
                float f13 = ((v.l) g2Var.f15390a.F(jR, lVar, lVar2, g2Var.f15392c)).f13394a;
                g2Var.f15392c = (v.l) g2Var.f15390a.T(jR, lVar, lVar2, g2Var.f15392c);
                g2Var.f15391b = jLongValue;
                float f14 = g2Var.f15394e - f13;
                g2Var.f15394e = f13;
                kVar2.invoke(Float.valueOf(f14));
                break;
        }
        return t8.z.f12851a;
    }
}
