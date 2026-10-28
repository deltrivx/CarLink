package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0.t1 f7889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f7890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.k f7892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g3.w f7893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g3.q f7894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n3.c f7895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7896h;

    public x(w0.t1 t1Var, u0 u0Var, boolean z10, h9.k kVar, g3.w wVar, g3.q qVar, n3.c cVar, int i7) {
        this.f7889a = t1Var;
        this.f7890b = u0Var;
        this.f7891c = z10;
        this.f7892d = kVar;
        this.f7893e = wVar;
        this.f7894f = qVar;
        this.f7895g = cVar;
        this.f7896h = i7;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            n3.c cVar = this.f7895g;
            int i7 = this.f7896h;
            u0 u0Var = this.f7890b;
            w wVar = new w(u0Var, this.f7892d, this.f7893e, this.f7894f, cVar, i7);
            long j5 = sVar.T;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            f1.q1 q1VarL = sVar.l();
            r1.p pVarC = r1.a.c(sVar, r1.m.f11116a);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, wVar);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
                ob.a.w(i10, sVar, i10, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC);
            sVar.p(true);
            i0 i0VarA = u0Var.a();
            i0 i0Var = i0.f7678a;
            boolean z11 = this.f7891c;
            if (i0VarA != i0Var && u0Var.c() != null) {
                o2.w wVarC = u0Var.c();
                i9.l.b(wVarC);
                z10 = wVarC.isAttached() && z11;
            }
            w0.t1 t1Var = this.f7889a;
            q0.g(t1Var, z10, sVar, 0);
            if (u0Var.a() == i0.f7680c && z11) {
                sVar.W(-714666198);
                q0.h(t1Var, sVar, 0);
                sVar.p(false);
            } else {
                sVar.W(-714589318);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }
}
