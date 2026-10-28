package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2634b;

    public /* synthetic */ k(int i7, Object obj) {
        this.f2633a = i7;
        this.f2634b = obj;
    }

    public /* synthetic */ k(lc.c cVar, lc.b bVar) {
        this.f2633a = 2;
        this.f2634b = cVar;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i7 = this.f2633a;
        t8.z zVar = t8.z.f12851a;
        Object obj4 = this.f2634b;
        switch (i7) {
            case 0:
                ((c8.k) obj4).invoke((Throwable) obj);
                return zVar;
            case 1:
                n3.a aVar = (n3.a) obj3;
                long j5 = ((l0.r1) obj4).f7824f;
                long j10 = aVar.f8730a;
                int iJ = n3.a.j(j10);
                long j11 = aVar.f8730a;
                o2.v0 v0VarU = ((o2.l0) obj2).u(n3.a.a(j10, n3.r.m((int) (j5 >> 32), iJ, n3.a.h(j11)), 0, n3.r.m((int) (j5 & 4294967295L), n3.a.i(j11), n3.a.g(j11)), 0, 10));
                return ((o2.o0) obj).i(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, new d0.i(v0VarU, 6));
            case 2:
                lc.c cVar = (lc.c) obj4;
                lc.c.f8371h.set(cVar, null);
                cVar.f(null);
                return zVar;
            case 3:
                ((lc.h) obj4).b();
                return zVar;
            case 4:
                u0.e eVar = (u0.e) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = eVar.f12979u.a(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = eVar.f12979u.a(iIntValue2);
                }
                boolean z10 = false;
                if (eVar.f12978t) {
                    long j12 = eVar.f12976r.f5890b;
                    int i10 = b3.q0.f1429c;
                    if (iIntValue != ((int) (j12 >> 32)) || iIntValue2 != ((int) (4294967295L & j12))) {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        l0.i0 i0Var = l0.i0.f7678a;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > eVar.f12976r.f5889a.f1353b.length()) {
                            w0.t1 t1Var = eVar.f12980v;
                            t1Var.s(false);
                            t1Var.p(i0Var);
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                w0.t1 t1Var2 = eVar.f12980v;
                                t1Var2.s(false);
                                t1Var2.p(i0Var);
                            } else {
                                eVar.f12980v.h(true);
                            }
                            eVar.f12977s.f7868v.invoke(new g3.w(eVar.f12976r.f5889a, b3.g0.b(iIntValue, iIntValue2), (b3.q0) null));
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            default:
                ((h9.k) obj4).invoke(new x1.b(((k2.v) obj2).f7280c));
                return zVar;
        }
    }
}
