package l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f7605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1.p f7606b;

    public c(long j5, r1.p pVar) {
        this.f7605a = j5;
        this.f7606b = pVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j5 = this.f7605a;
            if (j5 != 9205357640488583168L) {
                sVar.W(-1244013944);
                r1.p pVarG = androidx.compose.foundation.layout.c.g(this.f7606b, n3.h.b(j5), n3.h.a(j5), 0.0f, 0.0f, 12);
                o2.m0 m0VarD = d0.m.d(r1.c.f11093b, false);
                long j10 = sVar.T;
                int i7 = (int) (j10 ^ (j10 >>> 32));
                f1.q1 q1VarL = sVar.l();
                r1.p pVarC = r1.a.c(sVar, pVarG);
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
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i7))) {
                    ob.a.w(i7, sVar, i7, hVar);
                }
                f1.b.w(sVar, q2.i.f10706c, pVarC);
                f.b(null, sVar, 0, 1);
                sVar.p(true);
                sVar.p(false);
            } else {
                sVar.W(-1243644858);
                f.b(this.f7606b, sVar, 0, 0);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }
}
