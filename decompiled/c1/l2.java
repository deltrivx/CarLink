package c1;

import androidx.compose.material3.MinimumInteractiveModifier;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends i9.n implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1.p f1980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1.l0 f1981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f1982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.k f1984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h9.a f1986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f1987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n1.c f1988i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(r1.p pVar, y1.l0 l0Var, long j5, float f10, b0.k kVar, boolean z10, h9.a aVar, float f11, n1.c cVar) {
        super(2);
        this.f1980a = pVar;
        this.f1981b = l0Var;
        this.f1982c = j5;
        this.f1983d = f10;
        this.f1984e = kVar;
        this.f1985f = z10;
        this.f1986g = aVar;
        this.f1987h = f11;
        this.f1988i = cVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            f1.x2 x2Var = l0.f1978a;
            r1.p pVarC = androidx.compose.foundation.a.c(m2.a(this.f1980a.a(MinimumInteractiveModifier.f914a), this.f1981b, m2.b(this.f1982c, this.f1983d, sVar), ((n3.c) sVar.j(r2.j1.f11276h)).R(this.f1987h)), this.f1984e, h1.a(0.0f, sVar, 0, 7), this.f1985f, this.f1986g, 24);
            o2.m0 m0VarD = d0.m.d(r1.c.f11092a, true);
            int iP = f1.b.p(sVar);
            f1.q1 q1VarL = sVar.l();
            r1.p pVarC2 = r1.a.c(sVar, pVarC);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0VarD);
            f1.b.w(sVar, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP))) {
                ob.a.w(iP, sVar, iP, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC2);
            this.f1988i.invoke(sVar, 0);
            sVar.p(true);
        }
        return t8.z.f12851a;
    }
}
