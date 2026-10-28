package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1.p f13774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f13775d;

    public e(long j5, boolean z10, r1.p pVar, q qVar) {
        this.f13772a = j5;
        this.f13773b = z10;
        this.f13774c = pVar;
        this.f13775d = qVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (sVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            f1.w0 w0Var = f1.n.f5051a;
            final q qVar = this.f13775d;
            boolean z10 = this.f13773b;
            long j5 = this.f13772a;
            if (j5 != 9205357640488583168L) {
                sVar.W(3458246);
                d0.b bVar = z10 ? d0.c.f3544b : d0.c.f3543a;
                r1.p pVarG = androidx.compose.foundation.layout.c.g(this.f13774c, n3.h.b(j5), n3.h.a(j5), 0.0f, 0.0f, 12);
                d0.n0 n0VarA = d0.l0.a(bVar, r1.c.f11101j, sVar, 0);
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
                f1.b.w(sVar, q2.i.f10708e, n0VarA);
                f1.b.w(sVar, q2.i.f10707d, q1VarL);
                q2.h hVar = q2.i.f10709f;
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i7))) {
                    ob.a.w(i7, sVar, i7, hVar);
                }
                f1.b.w(sVar, q2.i.f10706c, pVarC);
                boolean zH = sVar.h(qVar);
                Object objK = sVar.K();
                if (zH || objK == w0Var) {
                    final int i10 = 0;
                    objK = new h9.a() { // from class: w0.d
                        @Override // h9.a
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    return Boolean.valueOf((qVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                default:
                                    return Boolean.valueOf((qVar.a() & 9223372034707292159L) != 9205357640488583168L);
                            }
                        }
                    };
                    sVar.h0(objK);
                }
                y0.e(r1.m.f11116a, (h9.a) objK, z10, sVar, 6);
                sVar.p(true);
                sVar.p(false);
            } else {
                sVar.W(4389176);
                boolean zH2 = sVar.h(qVar);
                Object objK2 = sVar.K();
                if (zH2 || objK2 == w0Var) {
                    final int i11 = 1;
                    objK2 = new h9.a() { // from class: w0.d
                        @Override // h9.a
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    return Boolean.valueOf((qVar.a() & 9223372034707292159L) != 9205357640488583168L);
                                default:
                                    return Boolean.valueOf((qVar.a() & 9223372034707292159L) != 9205357640488583168L);
                            }
                        }
                    };
                    sVar.h0(objK2);
                }
                y0.e(this.f13774c, (h9.a) objK2, z10, sVar, 0);
                sVar.p(false);
            }
        } else {
            sVar.Q();
        }
        return t8.z.f12851a;
    }
}
