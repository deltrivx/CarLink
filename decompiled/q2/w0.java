package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f10837a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10840d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n3.a f10845i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2.b f10838b = new a2.b(20);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0.k f10841e = new u0.k(22);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1.e f10842f = new h1.e(new h0[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10843g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1.e f10844h = new h1.e(new v0[16]);

    public w0(h0 h0Var) {
        this.f10837a = h0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean b(h0 h0Var, n3.a aVar) {
        boolean zL0;
        h0 h0Var2 = h0Var.f10673g;
        l0 l0Var = h0Var.F;
        if (h0Var2 == null) {
            return false;
        }
        if (aVar == null) {
            u0 u0Var = l0Var.f10744q;
            n3.a aVar2 = u0Var != null ? u0Var.f10816m : null;
            if (aVar2 == null || h0Var2 == null) {
                zL0 = false;
            } else {
                i9.l.b(u0Var);
                zL0 = u0Var.l0(aVar2.f8730a);
            }
        } else if (h0Var2 != null) {
            u0 u0Var2 = l0Var.f10744q;
            i9.l.b(u0Var2);
            zL0 = u0Var2.l0(aVar.f8730a);
        } else {
            zL0 = false;
        }
        h0 h0VarV = h0Var.v();
        if (zL0 && h0VarV != null) {
            if (h0VarV.f10673g == null) {
                h0.V(h0VarV, false, 3);
                return zL0;
            }
            if (h0Var.t() == f0.f10638a) {
                h0.T(h0VarV, false, 3);
                return zL0;
            }
            if (h0Var.t() == f0.f10639b) {
                h0VarV.S(false);
            }
        }
        return zL0;
    }

    public static boolean c(h0 h0Var, n3.a aVar) throws Throwable {
        boolean zN0;
        f0 f0Var = f0.f10640c;
        if (aVar != null) {
            if (h0Var.B == f0Var) {
                h0Var.e();
            }
            zN0 = h0Var.F.f10743p.n0(aVar.f8730a);
        } else {
            y0 y0Var = h0Var.F.f10743p;
            n3.a aVar2 = y0Var.f10853j ? new n3.a(y0Var.f9438d) : null;
            if (aVar2 != null) {
                if (h0Var.B == f0Var) {
                    h0Var.e();
                }
                zN0 = h0Var.F.f10743p.n0(aVar2.f8730a);
            } else {
                zN0 = false;
            }
        }
        h0 h0VarV = h0Var.v();
        if (zN0 && h0VarV != null) {
            if (h0Var.s() == f0.f10638a) {
                h0.V(h0VarV, false, 3);
                return zN0;
            }
            if (h0Var.s() == f0.f10639b) {
                h0VarV.U(false);
            }
        }
        return zN0;
    }

    public static boolean h(h0 h0Var) {
        u0 u0Var;
        i0 i0Var;
        if (h0Var.F.f10733e) {
            return (h0Var.t() == f0.f10640c && ((u0Var = h0Var.F.f10744q) == null || (i0Var = u0Var.f10820q) == null || !i0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(h0 h0Var) {
        if (!h0Var.r()) {
            return false;
        }
        do {
            if (h0Var.s() == f0.f10640c && !h0Var.F.f10743p.f10865w.e()) {
                h0 h0VarV = h0Var.v();
                if ((h0VarV != null ? h0VarV.F.f10732d : null) != d0.f10606a) {
                    return false;
                }
            }
            h0Var = h0Var.v();
            if (h0Var == null) {
                return false;
            }
        } while (!h0Var.J());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z10) {
        Object[] objArr;
        u0.k kVar = this.f10841e;
        if (z10) {
            h1.e eVar = (h1.e) kVar.f12990b;
            h0 h0Var = this.f10837a;
            if (h0Var.O > 0) {
                eVar.h();
                eVar.b(h0Var);
                h0Var.N = true;
            }
        }
        h1.e eVar2 = (h1.e) kVar.f12990b;
        int i7 = eVar2.f6423c;
        if (i7 != 0) {
            u8.l.J0(eVar2.f6421a, n1.f10760b, 0, i7);
            int i10 = eVar2.f6423c;
            h0[] h0VarArr = (h0[]) kVar.f12991c;
            if (h0VarArr == null || h0VarArr.length < i10) {
                objArr = h0VarArr;
                objArr = new h0[Math.max(16, i10)];
            }
            objArr = h0VarArr;
            kVar.f12991c = null;
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = eVar2.f6421a[i11];
            }
            eVar2.h();
            for (int i12 = i10 - 1; -1 < i12; i12--) {
                h0 h0Var2 = objArr[i12];
                i9.l.b(h0Var2);
                if (h0Var2.N) {
                    u0.k.D0(h0Var2);
                }
                objArr[i12] = 0;
            }
            kVar.f12991c = objArr;
        }
    }

    public final void d() {
        h1.e eVar = this.f10844h;
        int i7 = eVar.f6423c;
        if (i7 != 0) {
            Object[] objArr = eVar.f6421a;
            for (int i10 = 0; i10 < i7; i10++) {
                v0 v0Var = (v0) objArr[i10];
                h0 h0Var = v0Var.f10834a;
                boolean z10 = v0Var.f10836c;
                h0 h0Var2 = v0Var.f10834a;
                if (h0Var.I()) {
                    if (v0Var.f10835b) {
                        h0.T(h0Var2, z10, 2);
                    } else {
                        h0.V(h0Var2, z10, 2);
                    }
                }
            }
            eVar.h();
        }
    }

    public final void e(h0 h0Var) {
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            if (i9.l.a(h0Var2.K(), Boolean.TRUE) && !h0Var2.P) {
                if (this.f10838b.t(h0Var2)) {
                    h0Var2.L();
                }
                e(h0Var2);
            }
        }
    }

    public final void f(h0 h0Var, boolean z10) {
        if (!this.f10839c) {
            n2.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10 ? h0Var.F.f10733e : h0Var.r()) {
            n2.a.a("node not yet measured");
        }
        g(h0Var, z10);
    }

    public final void g(h0 h0Var, boolean z10) {
        u0 u0Var;
        i0 i0Var;
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            f0 f0Var = f0.f10638a;
            if ((!z10 && (h0Var2.s() == f0Var || h0Var2.F.f10743p.f10865w.e())) || (z10 && (h0Var2.t() == f0Var || ((u0Var = h0Var2.F.f10744q) != null && (i0Var = u0Var.f10820q) != null && i0Var.e())))) {
                boolean zQ = f.q(h0Var2);
                l0 l0Var = h0Var2.F;
                if (zQ && !z10) {
                    if (l0Var.f10733e && this.f10838b.t(h0Var2)) {
                        m(h0Var2, true, false);
                    } else {
                        f(h0Var2, true);
                    }
                }
                if (z10 ? l0Var.f10733e : h0Var2.r()) {
                    m(h0Var2, z10, false);
                }
                if (!(z10 ? l0Var.f10733e : h0Var2.r())) {
                    g(h0Var2, z10);
                }
            }
        }
        if (z10 ? h0Var.F.f10733e : h0Var.r()) {
            m(h0Var, z10, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(r2.s sVar) {
        boolean z10;
        r1.o oVar;
        ?? F;
        h0 h0Var;
        boolean z11;
        boolean z12;
        a2.b bVar = this.f10838b;
        h0 h0Var2 = this.f10837a;
        if (!h0Var2.I()) {
            n2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!h0Var2.J()) {
            n2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f10839c) {
            n2.a.a("performMeasureAndLayout called during measure layout");
        }
        int i7 = 0;
        if (this.f10845i != null) {
            this.f10839c = true;
            this.f10840d = true;
            try {
                boolean zM = bVar.M();
                l0.o0 o0Var = (l0.o0) bVar.f12b;
                if (zM) {
                    z10 = false;
                    while (true) {
                        l0.o0 o0Var2 = (l0.o0) bVar.f14d;
                        l0.o0 o0Var3 = (l0.o0) bVar.f13c;
                        if (((z1) o0Var.f7772b).isEmpty()) {
                            if (!((z1) o0Var3.f7772b).isEmpty()) {
                                h0Var = (h0) ((z1) o0Var3.f7772b).first();
                                o0Var3.a0(h0Var);
                                z11 = h0Var.f10673g != null;
                                z12 = true;
                            } else {
                                if (((z1) o0Var2.f7772b).isEmpty()) {
                                    break;
                                }
                                h0 h0Var3 = (h0) ((z1) o0Var2.f7772b).first();
                                o0Var2.a0(h0Var3);
                                h0Var = h0Var3;
                            }
                            z12 = true;
                        } else {
                            h0Var = (h0) ((z1) o0Var.f7772b).first();
                            o0Var.a0(h0Var);
                            z11 = h0Var.f10673g != null;
                            z12 = false;
                        }
                        boolean zM2 = m(h0Var, z11, z12);
                        if (!z12) {
                            if (h0Var.F.f10734f) {
                                bVar.q(h0Var, u.f10806b);
                            }
                            if (h0Var.q()) {
                                bVar.q(h0Var, u.f10808d);
                            }
                        }
                        if (h0Var == h0Var2 && zM2) {
                            z10 = true;
                        }
                    }
                    if (sVar != null) {
                        sVar.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f10839c = false;
                this.f10840d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.f10839c = false;
                    this.f10840d = false;
                    throw th2;
                }
            }
        } else {
            z10 = false;
        }
        h1.e eVar = this.f10842f;
        Object[] objArr = eVar.f6421a;
        int i10 = eVar.f6423c;
        int i11 = 0;
        while (i11 < i10) {
            d1 d1Var = ((h0) objArr[i11]).E;
            t tVar = d1Var.f10614c;
            boolean zG = i1.g(128);
            if (zG) {
                oVar = tVar.O;
            } else {
                oVar = tVar.O.f11121e;
                if (oVar == null) {
                }
                i11++;
                i7 = 0;
            }
            y1.i0 i0Var = h1.J;
            r1.o oVarI0 = tVar.I0(zG);
            while (oVarI0 != null && (oVarI0.f11120d & 128) != 0) {
                if ((oVarI0.f11119c & 128) != 0) {
                    ?? r13 = oVarI0;
                    ?? eVar2 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof w) {
                            ((w) r13).T(d1Var.f10614c);
                        } else {
                            if ((r13.f11119c & 128) != 0 && (r13 instanceof m)) {
                                r1.o oVar2 = ((m) r13).f10746p;
                                while (oVar2 != null) {
                                    if ((oVar2.f11119c & 128) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            F = r13;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            F = oVar2;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new h1.e(new r1.o[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.b(F);
                                                F = 0;
                                            }
                                            eVar2.b(oVar2);
                                        }
                                    } else {
                                        F = r13;
                                        eVar2 = eVar2;
                                    }
                                    oVar2 = oVar2.f11122f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i7 == 1) {
                                    F = r13;
                                    eVar2 = eVar2;
                                }
                            }
                            i7 = 0;
                            r13 = F;
                            eVar2 = eVar2;
                        }
                        F = r13;
                        eVar2 = eVar2;
                        F = f.f(eVar2);
                        i7 = 0;
                        r13 = F;
                        eVar2 = eVar2;
                    }
                }
                if (oVarI0 == oVar) {
                    break;
                }
                oVarI0 = oVarI0.f11122f;
                i7 = 0;
            }
            i11++;
            i7 = 0;
        }
        eVar.h();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, q2.h0] */
    public final void k(h0 h0Var, long j5) {
        r1.o oVar;
        ?? F;
        if (h0Var.P) {
            return;
        }
        h0 h0Var2 = this.f10837a;
        if (h0Var.equals(h0Var2)) {
            n2.a.a("measureAndLayout called on root");
        }
        if (!h0Var2.I()) {
            n2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!h0Var2.J()) {
            n2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f10839c) {
            n2.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f10845i != null) {
            this.f10839c = true;
            this.f10840d = false;
            try {
                a2.b bVar = this.f10838b;
                ((l0.o0) bVar.f12b).a0(h0Var);
                ((l0.o0) bVar.f13c).a0(h0Var);
                ((l0.o0) bVar.f14d).a0(h0Var);
                if ((b(h0Var, new n3.a(j5)) || h0Var.F.f10734f) && i9.l.a(h0Var.K(), Boolean.TRUE)) {
                    h0Var.L();
                }
                e(h0Var);
                c(h0Var, new n3.a(j5));
                if (h0Var.q() && h0Var.J()) {
                    h0Var.R();
                    u0.k kVar = this.f10841e;
                    kVar.getClass();
                    if (h0Var.O > 0) {
                        ((h1.e) kVar.f12990b).b(h0Var);
                        h0Var.N = true;
                    }
                }
                d();
                this.f10839c = false;
                this.f10840d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.f10839c = false;
                    this.f10840d = false;
                    throw th2;
                }
            }
        }
        h1.e eVar = this.f10842f;
        Object[] objArr = eVar.f6421a;
        int i7 = eVar.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            d1 d1Var = ((h0) objArr[i10]).E;
            t tVar = d1Var.f10614c;
            boolean zG = i1.g(128);
            if (zG) {
                oVar = tVar.O;
            } else {
                oVar = tVar.O.f11121e;
                if (oVar == null) {
                }
            }
            y1.i0 i0Var = h1.J;
            for (r1.o oVarI0 = tVar.I0(zG); oVarI0 != null && (oVarI0.f11120d & 128) != 0; oVarI0 = oVarI0.f11122f) {
                if ((oVarI0.f11119c & 128) != 0) {
                    ?? r12 = oVarI0;
                    ?? eVar2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof w) {
                            ((w) r12).T(d1Var.f10614c);
                        } else {
                            if ((r12.f11119c & 128) != 0 && (r12 instanceof m)) {
                                r1.o oVar2 = ((m) r12).f10746p;
                                int i11 = 0;
                                while (oVar2 != null) {
                                    if ((oVar2.f11119c & 128) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            F = r12;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            F = oVar2;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new h1.e(new r1.o[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.b(F);
                                                F = 0;
                                            }
                                            eVar2.b(oVar2);
                                        }
                                    } else {
                                        F = r12;
                                        eVar2 = eVar2;
                                    }
                                    oVar2 = oVar2.f11122f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i11 == 1) {
                                    F = r12;
                                    eVar2 = eVar2;
                                }
                            }
                            r12 = F;
                            eVar2 = eVar2;
                        }
                        F = r12;
                        eVar2 = eVar2;
                        F = f.f(eVar2);
                        r12 = F;
                        eVar2 = eVar2;
                    }
                }
                if (oVarI0 == oVar) {
                    break;
                }
            }
        }
        eVar.h();
    }

    public final void l() {
        a2.b bVar = this.f10838b;
        if (bVar.M()) {
            h0 h0Var = this.f10837a;
            if (!h0Var.I()) {
                n2.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!h0Var.J()) {
                n2.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f10839c) {
                n2.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f10845i != null) {
                this.f10839c = true;
                this.f10840d = false;
                try {
                    if (!((z1) ((l0.o0) bVar.f14d).f7772b).isEmpty() && !((z1) ((l0.o0) bVar.f12b).f7772b).isEmpty()) {
                        if (h0Var.f10673g != null) {
                            o(h0Var, true);
                        } else {
                            n(h0Var);
                        }
                    }
                    o(h0Var, false);
                    this.f10839c = false;
                    this.f10840d = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.f10839c = false;
                        this.f10840d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean m(h0 h0Var, boolean z10, boolean z11) {
        n3.a aVar;
        boolean zB;
        o2.u0 placementScope;
        t tVar;
        h0 h0VarV;
        u0 u0Var;
        i0 i0Var;
        boolean z12 = h0Var.P;
        l0 l0Var = h0Var.F;
        if (z12 || (!h0Var.J() && !l0Var.f10743p.f10861s && !i(h0Var) && !i9.l.a(h0Var.K(), Boolean.TRUE) && !h(h0Var) && !l0Var.f10743p.f10865w.e() && ((u0Var = l0Var.f10744q) == null || (i0Var = u0Var.f10820q) == null || !i0Var.e()))) {
            return false;
        }
        h0 h0Var2 = this.f10837a;
        if (h0Var == h0Var2) {
            aVar = this.f10845i;
            i9.l.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            zB = l0Var.f10733e ? b(h0Var, aVar) : false;
            if (z11 && ((zB || l0Var.f10734f) && i9.l.a(h0Var.K(), Boolean.TRUE))) {
                h0Var.L();
            }
        } else {
            boolean zC = h0Var.r() ? c(h0Var, aVar) : false;
            if (z11 && h0Var.q() && (h0Var == h0Var2 || ((h0VarV = h0Var.v()) != null && h0VarV.J() && l0Var.f10743p.f10861s))) {
                if (h0Var == h0Var2) {
                    if (h0Var.B == f0.f10640c) {
                        h0Var.f();
                    }
                    h0 h0VarV2 = h0Var.v();
                    if (h0VarV2 == null || (tVar = h0VarV2.E.f10614c) == null || (placementScope = tVar.f10773l) == null) {
                        placementScope = ((r2.u) k0.a(h0Var)).getPlacementScope();
                    }
                    o2.u0.j(placementScope, l0Var.f10743p, 0, 0);
                } else {
                    h0Var.R();
                }
                u0.k kVar = this.f10841e;
                kVar.getClass();
                if (h0Var.O > 0) {
                    ((h1.e) kVar.f12990b).b(h0Var);
                    h0Var.N = true;
                }
                ((r2.u) k0.a(h0Var)).getRectManager().d(h0Var);
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(h0 h0Var) throws Throwable {
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            if (h0Var2.s() == f0.f10638a || h0Var2.F.f10743p.f10865w.e()) {
                if (f.q(h0Var2)) {
                    o(h0Var2, true);
                } else {
                    n(h0Var2);
                }
            }
        }
    }

    public final void o(h0 h0Var, boolean z10) throws Throwable {
        n3.a aVar;
        if (h0Var.P) {
            return;
        }
        if (h0Var == this.f10837a) {
            aVar = this.f10845i;
            i9.l.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            b(h0Var, aVar);
        } else {
            c(h0Var, aVar);
        }
    }

    public final boolean p(h0 h0Var, boolean z10) {
        int iOrdinal = h0Var.F.f10732d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f10844h.b(new v0(h0Var, false, z10));
            } else {
                if (iOrdinal != 4) {
                    throw new cc.s();
                }
                if (!h0Var.r() || z10) {
                    h0Var.F.f10743p.f10862t = true;
                    if (!h0Var.P && (h0Var.J() || i(h0Var))) {
                        h0 h0VarV = h0Var.v();
                        if (h0VarV == null || !h0VarV.r()) {
                            this.f10838b.q(h0Var, u.f10807c);
                        }
                        if (!this.f10840d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j5) {
        n3.a aVar = this.f10845i;
        if (aVar == null ? false : n3.a.b(aVar.f8730a, j5)) {
            return;
        }
        if (this.f10839c) {
            n2.a.a("updateRootConstraints called while measuring");
        }
        this.f10845i = new n3.a(j5);
        h0 h0Var = this.f10837a;
        h0 h0Var2 = h0Var.f10673g;
        l0 l0Var = h0Var.F;
        if (h0Var2 != null) {
            l0Var.f10733e = true;
        }
        l0Var.f10743p.f10862t = true;
        this.f10838b.q(h0Var, h0Var2 != null ? u.f10805a : u.f10807c);
    }
}
