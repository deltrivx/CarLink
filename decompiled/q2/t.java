package q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t extends h1 {
    public static final f7.q Q;
    public final a2 O;
    public s P;

    static {
        f7.q qVarH = y1.h0.h();
        qVarH.k(y1.q.f14952f);
        qVarH.q(1.0f);
        qVarH.r(1);
        Q = qVarH;
    }

    public t(h0 h0Var) {
        super(h0Var);
        a2 a2Var = new a2();
        a2Var.f11120d = 0;
        this.O = a2Var;
        a2Var.f11124h = this;
        this.P = h0Var.f10673g != null ? new s(this) : null;
    }

    @Override // q2.h1
    public final void B0() {
        if (this.P == null) {
            this.P = new s(this);
        }
    }

    @Override // q2.h1
    public final q0 E0() {
        return this.P;
    }

    @Override // q2.h1
    public final r1.o G0() {
        return this.O;
    }

    @Override // o2.l0
    public final int H(int i7) {
        u0.k kVarU = this.f10692o.u();
        o2.m0 m0VarV0 = kVarU.V0();
        h0 h0Var = (h0) kVarU.f12990b;
        return m0VarV0.j(h0Var.E.f10615d, h0Var.m(), i7);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:87:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // q2.h1
    public final void M0(d dVar, long j5, r rVar, int i7, boolean z10) {
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        Object[] objArr;
        int i11;
        h0 h0Var;
        h0 h0Var2;
        long jC;
        long j10 = j5;
        r rVar2 = rVar;
        int i12 = dVar.f10605a;
        h0 h0Var3 = this.f10692o;
        switch (i12) {
            case 1:
                z11 = true;
                break;
            default:
                y2.j jVarX = h0Var3.x();
                z11 = !(jVarX != null && jVarX.f15014d);
                break;
        }
        if (z11) {
            if (f1(j10)) {
                i10 = i7;
                z12 = z10;
                z13 = true;
            } else {
                i10 = i7;
                if (i10 == 1 && (Float.floatToRawIntBits(y0(j10, F0())) & Integer.MAX_VALUE) < 2139095040) {
                    z13 = true;
                    z12 = false;
                }
            }
            if (z13) {
                int i13 = rVar2.f10787c;
                h1.e eVarY = h0Var3.y();
                objArr = eVarY.f6421a;
                i11 = eVarY.f6423c - 1;
                while (i11 >= 0) {
                    h0Var = (h0) objArr[i11];
                    if (h0Var.J()) {
                        switch (dVar.f10605a) {
                            case 1:
                                h0Var.A(j10, rVar2, i10, z12);
                                h0Var2 = h0Var;
                                break;
                            default:
                                d1 d1Var = h0Var.E;
                                d1Var.f10615d.L0(h1.N, d1Var.f10615d.D0(j10), rVar2, 1, z12);
                                rVar2 = rVar;
                                h0Var2 = h0Var;
                                break;
                        }
                        jC = rVar2.c();
                        if (f.k(jC) < 0.0f && f.p(jC) && !f.o(jC)) {
                            h1 h1Var = h0Var2.E.f10615d;
                            h1Var.getClass();
                            r1.o oVarI0 = h1Var.I0(i1.g(16));
                            if (oVarI0 != null && oVarI0.f11129n) {
                                if (!oVarI0.f11117a.f11129n) {
                                    n2.a.b("visitLocalDescendants called on an unattached node");
                                }
                                r1.o oVar = oVarI0.f11117a;
                                if ((oVar.f11120d & 16) != 0) {
                                    while (true) {
                                        if (oVar != null) {
                                            if ((oVar.f11119c & 16) != 0) {
                                                ?? F = oVar;
                                                ?? eVar = 0;
                                                while (F != 0) {
                                                    if (F instanceof v1) {
                                                        if (((v1) F).d0()) {
                                                            rVar2.f10787c = rVar2.f10785a.f12408b - 1;
                                                            break;
                                                        }
                                                    } else if ((F.f11119c & 16) != 0 && (F instanceof m)) {
                                                        r1.o oVar2 = ((m) F).f10746p;
                                                        int i14 = 0;
                                                        while (oVar2 != null) {
                                                            if ((oVar2.f11119c & 16) != 0) {
                                                                i14++;
                                                                if (i14 == 1) {
                                                                    F = F;
                                                                    eVar = eVar;
                                                                    eVar = eVar;
                                                                    F = oVar2;
                                                                } else {
                                                                    if (eVar == 0) {
                                                                        eVar = new h1.e(new r1.o[16]);
                                                                    }
                                                                    if (F != 0) {
                                                                        eVar.b(F);
                                                                        F = 0;
                                                                    }
                                                                    eVar.b(oVar2);
                                                                }
                                                            } else {
                                                                F = F;
                                                                eVar = eVar;
                                                            }
                                                            oVar2 = oVar2.f11122f;
                                                            F = F;
                                                            eVar = eVar;
                                                        }
                                                        if (i14 == 1) {
                                                            F = F;
                                                            eVar = eVar;
                                                        } else {
                                                            F = F;
                                                            eVar = eVar;
                                                        }
                                                    }
                                                    F = f.f(eVar);
                                                }
                                            }
                                            oVar = oVar.f11122f;
                                        }
                                    }
                                }
                            }
                            rVar2.f10787c = i13;
                        }
                    }
                    i11--;
                    j10 = j5;
                    i10 = i7;
                }
                rVar2.f10787c = i13;
            }
        }
        i10 = i7;
        z12 = z10;
        z13 = false;
        if (z13) {
            int i15 = rVar2.f10787c;
            h1.e eVarY2 = h0Var3.y();
            objArr = eVarY2.f6421a;
            i11 = eVarY2.f6423c - 1;
            while (i11 >= 0) {
                h0Var = (h0) objArr[i11];
                if (h0Var.J()) {
                    switch (dVar.f10605a) {
                        case 1:
                            h0Var.A(j10, rVar2, i10, z12);
                            h0Var2 = h0Var;
                            break;
                        default:
                            d1 d1Var2 = h0Var.E;
                            d1Var2.f10615d.L0(h1.N, d1Var2.f10615d.D0(j10), rVar2, 1, z12);
                            rVar2 = rVar;
                            h0Var2 = h0Var;
                            break;
                    }
                    jC = rVar2.c();
                    if (f.k(jC) < 0.0f) {
                        continue;
                    }
                }
                i11--;
                j10 = j5;
                i10 = i7;
            }
            rVar2.f10787c = i15;
        }
    }

    @Override // o2.v0
    public final void T(long j5, float f10, h9.k kVar) throws Throwable {
        V0(j5, f10, kVar);
        if (this.f10772j) {
            return;
        }
        this.f10692o.F.f10743p.k0();
    }

    @Override // q2.h1
    public final void U0(y1.o oVar, b2.c cVar) throws Throwable {
        h0 h0Var = this.f10692o;
        q1 q1VarA = k0.a(h0Var);
        h1.e eVarY = h0Var.y();
        Object[] objArr = eVarY.f6421a;
        int i7 = eVarY.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            h0 h0Var2 = (h0) objArr[i10];
            if (h0Var2.J()) {
                h0Var2.i(oVar, cVar);
            }
        }
        if (((r2.u) q1VarA).getShowLayoutBounds()) {
            long j5 = this.f9437c;
            oVar.d(0.5f, 0.5f, ((int) (j5 >> 32)) - 0.5f, ((int) (j5 & 4294967295L)) - 0.5f, Q);
        }
    }

    @Override // o2.l0
    public final int c(int i7) {
        u0.k kVarU = this.f10692o.u();
        o2.m0 m0VarV0 = kVarU.V0();
        h0 h0Var = (h0) kVarU.f12990b;
        return m0VarV0.h(h0Var.E.f10615d, h0Var.m(), i7);
    }

    @Override // q2.p0
    public final int d0(o2.m mVar) throws Throwable {
        s sVar = this.P;
        if (sVar != null) {
            return sVar.d0(mVar);
        }
        y0 y0Var = this.f10692o.F.f10743p;
        i0 i0Var = y0Var.f10865w;
        if (y0Var.f10849f.f10732d == d0.f10606a) {
            i0Var.f10713d = true;
            if (i0Var.f10711b) {
                y0Var.f10863u = true;
                y0Var.f10864v = true;
            }
        } else {
            i0Var.f10714e = true;
        }
        y0Var.f().k = true;
        y0Var.A();
        y0Var.f().k = false;
        Integer num = (Integer) i0Var.f10716g.get(mVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // o2.l0
    public final int m(int i7) {
        u0.k kVarU = this.f10692o.u();
        o2.m0 m0VarV0 = kVarU.V0();
        h0 h0Var = (h0) kVarU.f12990b;
        return m0VarV0.a(h0Var.E.f10615d, h0Var.m(), i7);
    }

    @Override // o2.l0
    public final int r(int i7) {
        u0.k kVarU = this.f10692o.u();
        o2.m0 m0VarV0 = kVarU.V0();
        h0 h0Var = (h0) kVarU.f12990b;
        return m0VarV0.f(h0Var.E.f10615d, h0Var.m(), i7);
    }

    @Override // o2.l0
    public final o2.v0 u(long j5) {
        X(j5);
        h0 h0Var = this.f10692o;
        h1.e eVarZ = h0Var.z();
        Object[] objArr = eVarZ.f6421a;
        int i7 = eVarZ.f6423c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((h0) objArr[i10]).F.f10743p.f10854l = f0.f10640c;
        }
        Y0(h0Var.f10687v.c(this, h0Var.m(), j5));
        R0();
        return this;
    }
}
