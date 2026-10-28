package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements l0.b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13882c;

    public p1(t1 t1Var) {
        this.f13880a = 1;
        this.f13882c = t1Var;
        this.f13881b = true;
    }

    public p1(t1 t1Var, boolean z10) {
        this.f13880a = 0;
        this.f13882c = t1Var;
        this.f13881b = z10;
    }

    public p1(boolean z10, w0 w0Var) {
        this.f13880a = 2;
        this.f13881b = z10;
        this.f13882c = w0Var;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void i(long j5) {
    }

    private final void j() {
    }

    @Override // l0.b1
    public final void a(long j5) {
        t1 t1Var;
        long j10;
        l0.s1 s1VarD;
        l0.s1 s1VarD2;
        switch (this.f13880a) {
            case 0:
                return;
            case 1:
                t1 t1Var2 = (t1) this.f13882c;
                f1.k1 k1Var = t1Var2.f13954q;
                if (t1Var2.j() && ((l0.h0) k1Var.getValue()) == null) {
                    k1Var.setValue(l0.h0.f7653c);
                    t1Var2.f13956s = -1;
                    this.f13881b = true;
                    t1Var2.n();
                    l0.u0 u0Var = t1Var2.f13942d;
                    if (u0Var == null || (s1VarD2 = u0Var.d()) == null || !s1VarD2.c(j5)) {
                        t1Var = t1Var2;
                        j10 = j5;
                        l0.u0 u0Var2 = t1Var.f13942d;
                        if (u0Var2 != null && (s1VarD = u0Var2.d()) != null) {
                            int iA = t1Var.f13940b.a(s1VarD.b(j10, true));
                            g3.w wVarE = t1.e(t1Var.m().f5889a, b3.g0.b(iA, iA));
                            t1Var.h(false);
                            g2.a aVar = t1Var.f13948j;
                            if (aVar != null) {
                                aVar.a(9);
                            }
                            t1Var.f13941c.invoke(wVarE);
                            t1Var.f13959v = new b3.q0(wVarE.f5890b);
                        }
                        this.f13881b = false;
                    } else {
                        if (t1Var2.m().f5889a.f1353b.length() == 0) {
                            return;
                        }
                        t1Var2.h(false);
                        long jC = t1.c(t1Var2, g3.w.a(t1Var2.m(), null, b3.q0.f1428b, 5), j5, true, false, b0.f13738e, true);
                        t1Var = t1Var2;
                        j10 = j5;
                        t1Var.f13952o = new b3.q0(jC);
                    }
                    t1Var.p(l0.i0.f7678a);
                    t1Var.f13951n = j10;
                    t1Var.f13955r.setValue(new x1.b(j10));
                    t1Var.f13953p = 0L;
                    return;
                }
                return;
            default:
                boolean z10 = this.f13881b;
                w0 w0Var = (w0) this.f13882c;
                if (w0Var.f() == null) {
                    return;
                }
                z zVarG = w0Var.g();
                i9.l.b(zVarG);
                Object objE = w0Var.f13979a.f13764c.e((z10 ? zVarG.f14018a : zVarG.f14019b).f14011c);
                if (objE == null) {
                    c0.b.d("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new cc.s();
                }
                p pVar = (p) objE;
                o2.w wVarC = pVar.c();
                if (wVarC == null) {
                    c0.b.d("Current selectable should have layout coordinates.");
                    throw new cc.s();
                }
                long jA = pVar.a(zVarG, z10);
                if ((9223372034707292159L & jA) == 9205357640488583168L) {
                    return;
                }
                w0Var.f13991n.setValue(new x1.b(w0Var.k().n(wVarC, o0.a(jA))));
                w0Var.f13992o.setValue(new x1.b(0L));
                return;
        }
    }

    @Override // l0.b1
    public final void b() {
        switch (this.f13880a) {
            case 0:
                t1 t1Var = (t1) this.f13882c;
                t1Var.f13954q.setValue(null);
                t1Var.f13955r.setValue(null);
                t1Var.s(true);
                break;
            case 1:
                h();
                break;
            default:
                w0 w0Var = (w0) this.f13882c;
                w0Var.f14001x = true;
                w0Var.p();
                w0Var.f13995r.setValue(null);
                w0Var.f13996s.setValue(null);
                break;
        }
    }

    @Override // l0.b1
    public final void c() {
        switch (this.f13880a) {
            case 0:
                t1 t1Var = (t1) this.f13882c;
                t1Var.f13954q.setValue(null);
                t1Var.f13955r.setValue(null);
                t1Var.s(true);
                break;
            case 1:
                break;
            default:
                w0 w0Var = (w0) this.f13882c;
                w0Var.f14001x = true;
                w0Var.p();
                w0Var.f13995r.setValue(null);
                w0Var.f13996s.setValue(null);
                break;
        }
    }

    @Override // l0.b1
    public final void d() {
        l0.s1 s1VarD;
        z zVarG;
        o2.w wVarC;
        switch (this.f13880a) {
            case 0:
                t1 t1Var = (t1) this.f13882c;
                boolean z10 = this.f13881b;
                t1Var.f13954q.setValue(z10 ? l0.h0.f7652b : l0.h0.f7653c);
                long jA = o0.a(t1Var.k(z10));
                l0.u0 u0Var = t1Var.f13942d;
                if (u0Var != null && (s1VarD = u0Var.d()) != null) {
                    long jE = s1VarD.e(jA);
                    t1Var.f13951n = jE;
                    t1Var.f13955r.setValue(new x1.b(jE));
                    t1Var.f13953p = 0L;
                    t1Var.f13956s = -1;
                    l0.u0 u0Var2 = t1Var.f13942d;
                    if (u0Var2 != null) {
                        u0Var2.f7863q.setValue(Boolean.TRUE);
                    }
                    t1Var.s(false);
                    break;
                }
                break;
            case 1:
                break;
            default:
                w0 w0Var = (w0) this.f13882c;
                boolean z11 = this.f13881b;
                if ((z11 ? (x1.b) w0Var.f13993p.getValue() : (x1.b) w0Var.f13994q.getValue()) != null && (zVarG = w0Var.g()) != null) {
                    p pVarD = w0Var.d(z11 ? zVarG.f14018a : zVarG.f14019b);
                    if (pVarD != null && (wVarC = pVarD.c()) != null) {
                        long jA2 = pVarD.a(zVarG, z11);
                        if ((9223372034707292159L & jA2) != 9205357640488583168L) {
                            w0Var.f13996s.setValue(new x1.b(w0Var.k().n(wVarC, o0.a(jA2))));
                            w0Var.f13995r.setValue(z11 ? l0.h0.f7652b : l0.h0.f7653c);
                            w0Var.f14001x = false;
                            w0Var.p();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:31:0x0101  */
    @Override // l0.b1
    public final void e(long j5) {
        l0.s1 s1VarD;
        b3.q0 q0Var;
        int iB;
        long jC;
        switch (this.f13880a) {
            case 0:
                t1 t1Var = (t1) this.f13882c;
                long jH = x1.b.h(t1Var.f13953p, j5);
                t1Var.f13953p = jH;
                t1Var.f13955r.setValue(new x1.b(x1.b.h(t1Var.f13951n, jH)));
                g3.w wVarM = t1Var.m();
                x1.b bVarI = t1Var.i();
                i9.l.b(bVarI);
                t1.c(t1Var, wVarM, bVarI.f14521a, false, this.f13881b, b0.f13740g, true);
                t1Var.s(false);
                break;
            case 1:
                a0 a0Var = b0.f13738e;
                t1 t1Var2 = (t1) this.f13882c;
                if (t1Var2.j() && t1Var2.m().f5889a.f1353b.length() != 0) {
                    t1Var2.f13953p = x1.b.h(t1Var2.f13953p, j5);
                    l0.u0 u0Var = t1Var2.f13942d;
                    if (u0Var != null && (s1VarD = u0Var.d()) != null) {
                        t1Var2.f13955r.setValue(new x1.b(x1.b.h(t1Var2.f13951n, t1Var2.f13953p)));
                        if (t1Var2.f13952o == null) {
                            x1.b bVarI2 = t1Var2.i();
                            i9.l.b(bVarI2);
                            if (s1VarD.c(bVarI2.f14521a)) {
                                q0Var = t1Var2.f13952o;
                                if (q0Var != null) {
                                    iB = (int) (q0Var.f1430a >> 32);
                                } else {
                                    iB = s1VarD.b(t1Var2.f13951n, false);
                                }
                                x1.b bVarI3 = t1Var2.i();
                                i9.l.b(bVarI3);
                                int iB2 = s1VarD.b(bVarI3.f14521a, false);
                                if (t1Var2.f13952o == null || iB != iB2) {
                                    g3.w wVarM2 = t1Var2.m();
                                    x1.b bVarI4 = t1Var2.i();
                                    i9.l.b(bVarI4);
                                    jC = t1.c(t1Var2, wVarM2, bVarI4.f14521a, false, false, a0Var, true);
                                }
                            } else {
                                int iA = t1Var2.f13940b.a(s1VarD.b(t1Var2.f13951n, true));
                                g3.q qVar = t1Var2.f13940b;
                                x1.b bVarI5 = t1Var2.i();
                                i9.l.b(bVarI5);
                                if (iA == qVar.a(s1VarD.b(bVarI5.f14521a, true))) {
                                    a0Var = b0.f13737d;
                                }
                                g3.w wVarM3 = t1Var2.m();
                                x1.b bVarI6 = t1Var2.i();
                                i9.l.b(bVarI6);
                                jC = t1.c(t1Var2, wVarM3, bVarI6.f14521a, false, false, a0Var, true);
                            }
                        } else {
                            q0Var = t1Var2.f13952o;
                            if (q0Var != null) {
                                iB = (int) (q0Var.f1430a >> 32);
                            } else {
                                iB = s1VarD.b(t1Var2.f13951n, false);
                            }
                            x1.b bVarI7 = t1Var2.i();
                            i9.l.b(bVarI7);
                            int iB3 = s1VarD.b(bVarI7.f14521a, false);
                            if (t1Var2.f13952o == null) {
                            }
                            g3.w wVarM4 = t1Var2.m();
                            x1.b bVarI8 = t1Var2.i();
                            i9.l.b(bVarI8);
                            jC = t1.c(t1Var2, wVarM4, bVarI8.f14521a, false, false, a0Var, true);
                        }
                        if (!b3.q0.a(jC, t1Var2.f13952o)) {
                            this.f13881b = false;
                        }
                    }
                    t1Var2.s(false);
                    break;
                }
                break;
            default:
                w0 w0Var = (w0) this.f13882c;
                f1.k1 k1Var = w0Var.f13991n;
                f1.k1 k1Var2 = w0Var.f13992o;
                if (w0Var.f() != null) {
                    k1Var2.setValue(new x1.b(x1.b.h(((x1.b) k1Var2.getValue()).f14521a, j5)));
                    long jH2 = x1.b.h(((x1.b) k1Var.getValue()).f14521a, ((x1.b) k1Var2.getValue()).f14521a);
                    if (w0Var.o(jH2, ((x1.b) k1Var.getValue()).f14521a, this.f13881b, b0.f13740g)) {
                        k1Var.setValue(new x1.b(jH2));
                        k1Var2.setValue(new x1.b(0L));
                    }
                    break;
                }
                break;
        }
    }

    public void h() {
        t1 t1Var = (t1) this.f13882c;
        t1Var.f13954q.setValue(null);
        t1Var.f13955r.setValue(null);
        t1Var.s(true);
        boolean zC = b3.q0.c(t1Var.m().f5890b);
        t1Var.p(zC ? l0.i0.f7680c : l0.i0.f7679b);
        l0.u0 u0Var = t1Var.f13942d;
        if (u0Var != null) {
            u0Var.f7859m.setValue(Boolean.valueOf(!zC && y0.w(t1Var, true)));
        }
        l0.u0 u0Var2 = t1Var.f13942d;
        if (u0Var2 != null) {
            u0Var2.f7860n.setValue(Boolean.valueOf(!zC && y0.w(t1Var, false)));
        }
        l0.u0 u0Var3 = t1Var.f13942d;
        if (u0Var3 != null) {
            u0Var3.f7861o.setValue(Boolean.valueOf(zC && y0.w(t1Var, true)));
        }
        if (this.f13881b) {
            t1.a(t1Var, t1Var.f13952o);
        }
        t1Var.f13952o = null;
    }

    @Override // l0.b1
    public final void onCancel() {
        switch (this.f13880a) {
            case 0:
                break;
            case 1:
                h();
                break;
            default:
                w0 w0Var = (w0) this.f13882c;
                w0Var.f14001x = true;
                w0Var.p();
                w0Var.f13995r.setValue(null);
                w0Var.f13996s.setValue(null);
                break;
        }
    }
}
