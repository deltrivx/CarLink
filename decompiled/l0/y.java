package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f7902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3.r0 f7903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1 f7906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g3.w f7907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b3.l0 f7908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r1.p f7909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r1.p f7910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r1.p f7911j;
    public final /* synthetic */ r1.p k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.b f7912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w0.t1 f7913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f7914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h9.k f7915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g3.q f7916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n3.c f7917q;

    public y(u0 u0Var, b3.r0 r0Var, int i7, int i10, q1 q1Var, g3.w wVar, b3.l0 l0Var, r1.p pVar, r1.p pVar2, r1.p pVar3, r1.p pVar4, i0.b bVar, w0.t1 t1Var, boolean z10, h9.k kVar, g3.q qVar, n3.c cVar) {
        this.f7902a = u0Var;
        this.f7903b = r0Var;
        this.f7904c = i7;
        this.f7905d = i10;
        this.f7906e = q1Var;
        this.f7907f = wVar;
        this.f7908g = l0Var;
        this.f7909h = pVar;
        this.f7910i = pVar2;
        this.f7911j = pVar3;
        this.k = pVar4;
        this.f7912l = bVar;
        this.f7913m = t1Var;
        this.f7914n = z10;
        this.f7915o = kVar;
        this.f7916p = qVar;
        this.f7917q = cVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        r1.p u1Var;
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            u0 u0Var = this.f7902a;
            r1.p pVarD = androidx.compose.foundation.layout.c.d(r1.m.f11116a, ((n3.f) u0Var.f7854g.getValue()).f8736a, 0.0f, 2);
            int i7 = this.f7904c;
            int i10 = this.f7905d;
            b3.r0 r0Var = this.f7903b;
            r1.p pVarA = r1.a.a(pVarD, new j0(i7, i10, r0Var));
            g3.w wVar = this.f7907f;
            long j5 = wVar.f5890b;
            boolean zH = sVar.h(u0Var);
            Object objK = sVar.K();
            if (zH || objK == f1.n.f5051a) {
                objK = new a5.e(11, u0Var);
                sVar.h0(objK);
            }
            h9.a aVar = (h9.a) objK;
            q1 q1Var = this.f7906e;
            z.x0 x0Var = (z.x0) q1Var.f7808f.getValue();
            int i11 = b3.q0.f1429c;
            int iF = (int) (j5 >> 32);
            long j10 = q1Var.f7807e;
            if (iF == ((int) (j10 >> 32)) && (iF = (int) (j5 & 4294967295L)) == ((int) (j10 & 4294967295L))) {
                iF = b3.q0.f(j5);
            }
            q1Var.f7807e = j5;
            g3.d0 d0VarN = q0.n(this.f7908g, wVar.f5889a);
            int iOrdinal = x0Var.ordinal();
            if (iOrdinal == 0) {
                u1Var = new u1(q1Var, iF, d0VarN, aVar);
            } else {
                if (iOrdinal != 1) {
                    throw new cc.s();
                }
                u1Var = new k0(q1Var, iF, d0VarN, aVar);
            }
            w0.y0.f(androidx.compose.foundation.relocation.a.a(r1.a.a(n4.h.p(pVarA).a(u1Var).a(this.f7909h).a(this.f7910i), new e8.r0(1, r0Var)).a(this.f7911j).a(this.k), this.f7912l), n1.h.e(1412697320, new x(this.f7913m, u0Var, this.f7914n, this.f7915o, wVar, this.f7916p, this.f7917q, this.f7905d), sVar), sVar, 48);
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }
}
