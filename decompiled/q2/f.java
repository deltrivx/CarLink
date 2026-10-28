package q2;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f10637a = new n1(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, q2.d2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [h9.k] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void A(d2 d2Var, h9.k kVar) {
        r1.o oVar = (r1.o) d2Var;
        if (!oVar.f11117a.f11129n) {
            n2.a.b("visitSubtreeIf called on an unattached node");
        }
        h1.e eVar = new h1.e(new r1.o[16]);
        r1.o oVar2 = oVar.f11117a;
        r1.o oVar3 = oVar2.f11122f;
        if (oVar3 == null) {
            b(eVar, oVar2);
        } else {
            eVar.b(oVar3);
        }
        while (true) {
            int i7 = eVar.f6423c;
            if (i7 == 0) {
                return;
            }
            r1.o oVar4 = (r1.o) eVar.l(i7 - 1);
            if ((oVar4.f11120d & 262144) != 0) {
                r1.o oVar5 = oVar4;
                while (true) {
                    if (oVar5 != null) {
                        if ((oVar5.f11119c & 262144) != 0) {
                            ?? F = oVar5;
                            ?? eVar2 = 0;
                            while (F != 0) {
                                if (F instanceof d2) {
                                    d2 d2Var2 = (d2) F;
                                    c2 c2Var = (i9.l.a(d2Var.k(), d2Var2.k()) && d2Var.getClass() == d2Var2.getClass()) ? (c2) kVar.invoke(d2Var2) : c2.f10601a;
                                    if (c2Var != c2.f10603c) {
                                        if (c2Var == c2.f10602b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((F.f11119c & 262144) != 0 && (F instanceof m)) {
                                    r1.o oVar6 = ((m) F).f10746p;
                                    int i10 = 0;
                                    F = F;
                                    eVar2 = eVar2;
                                    while (oVar6 != null) {
                                        if ((oVar6.f11119c & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                eVar2 = eVar2;
                                                F = oVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar2.b(F);
                                                    F = 0;
                                                }
                                                eVar2.b(oVar6);
                                            }
                                        }
                                        oVar6 = oVar6.f11122f;
                                        F = F;
                                        eVar2 = eVar2;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                F = f(eVar2);
                            }
                        }
                        oVar5 = oVar5.f11122f;
                    }
                }
            }
            b(eVar, oVar4);
        }
    }

    public static final long a(float f10, boolean z10, boolean z11) {
        return (((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32);
    }

    public static final void b(h1.e eVar, r1.o oVar) {
        h1.e eVarZ = v(oVar).z();
        int i7 = eVarZ.f6423c - 1;
        Object[] objArr = eVarZ.f6421a;
        if (i7 < objArr.length) {
            while (i7 >= 0) {
                eVar.b(((h0) objArr[i7]).E.f10617f);
                i7--;
            }
        }
    }

    public static final int c(p0 p0Var, o2.m mVar) {
        p0 p0VarK0 = p0Var.k0();
        if (p0VarK0 == null) {
            n2.a.b("Child of " + p0Var + " cannot be null when calculating alignment line");
        }
        if (p0Var.o0().b().containsKey(mVar)) {
            Integer num = (Integer) p0Var.o0().b().get(mVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iJ0 = p0VarK0.j0(mVar);
            if (iJ0 != Integer.MIN_VALUE) {
                p0VarK0.f10772j = true;
                p0Var.k = true;
                p0Var.u0();
                p0VarK0.f10772j = false;
                p0Var.k = false;
                return iJ0 + ((int) (mVar instanceof o2.m ? p0VarK0.q0() & 4294967295L : p0VarK0.q0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(c cVar) {
        a2 a2Var = v(cVar).E.f10616e;
        i9.l.c(a2Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return a2Var.f10587o;
    }

    public static final r1.o e(l lVar, int i7) {
        r1.o oVar = ((r1.o) lVar).f11117a.f11122f;
        if (oVar == null || (oVar.f11120d & i7) == 0) {
            return null;
        }
        while (oVar != null) {
            int i10 = oVar.f11119c;
            if ((i10 & 2) != 0) {
                return null;
            }
            if ((i10 & i7) != 0) {
                return oVar;
            }
            oVar = oVar.f11122f;
        }
        return null;
    }

    public static final r1.o f(h1.e eVar) {
        int i7;
        if (eVar == null || (i7 = eVar.f6423c) == 0) {
            return null;
        }
        return (r1.o) eVar.l(i7 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final x g(r1.o oVar) {
        if ((oVar.f11119c & 2) != 0) {
            if (oVar instanceof x) {
                return (x) oVar;
            }
            if (oVar instanceof m) {
                r1.o oVar2 = ((m) oVar).f10746p;
                while (oVar2 != 0) {
                    if (oVar2 instanceof x) {
                        return (x) oVar2;
                    }
                    oVar2 = (!(oVar2 instanceof m) || (oVar2.f11119c & 2) == 0) ? oVar2.f11122f : ((m) oVar2).f10746p;
                }
            }
        }
        return null;
    }

    public static final int h(long j5, long j10) {
        boolean zP = p(j5);
        if (zP != p(j10)) {
            return zP ? -1 : 1;
        }
        int iSignum = (int) Math.signum(k(j5) - k(j10));
        if (Math.min(k(j5), k(j10)) >= 0.0f && o(j5) != o(j10)) {
            return o(j5) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(k kVar, f1.t1 t1Var) {
        if (!((r1.o) kVar).f11117a.f11129n) {
            n2.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        n1.g gVar = (n1.g) v(kVar).A;
        gVar.getClass();
        return f1.b.t(gVar, t1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, q2.d2, q2.l] */
    /* JADX WARN: Type inference failed for: r3v10, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final d2 j(d2 d2Var) {
        d1 d1Var;
        r1.o oVar = (r1.o) d2Var;
        if (!oVar.f11117a.f11129n) {
            n2.a.b("visitAncestors called on an unattached node");
        }
        r1.o oVar2 = oVar.f11117a.f11121e;
        h0 h0VarV = v(d2Var);
        while (h0VarV != null) {
            if ((h0VarV.E.f10617f.f11120d & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.f11119c & 262144) != 0) {
                        ?? F = oVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof d2) {
                                d2 d2Var2 = (d2) F;
                                if (i9.l.a(d2Var.k(), d2Var2.k()) && d2Var.getClass() == d2Var2.getClass()) {
                                    return d2Var2;
                                }
                            } else if ((F.f11119c & 262144) != 0 && (F instanceof m)) {
                                r1.o oVar3 = ((m) F).f10746p;
                                int i7 = 0;
                                F = F;
                                eVar = eVar;
                                while (oVar3 != null) {
                                    if ((oVar3.f11119c & 262144) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            eVar = eVar;
                                            F = oVar3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new h1.e(new r1.o[16]);
                                            }
                                            if (F != 0) {
                                                eVar.b(F);
                                                F = 0;
                                            }
                                            eVar.b(oVar3);
                                        }
                                    }
                                    oVar3 = oVar3.f11122f;
                                    F = F;
                                    eVar = eVar;
                                }
                                if (i7 == 1) {
                                }
                            }
                            F = f(eVar);
                        }
                    }
                    oVar2 = oVar2.f11121e;
                }
            }
            h0VarV = h0VarV.v();
            oVar2 = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
        }
        return null;
    }

    public static final float k(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(o oVar) {
        if (((r1.o) oVar).f11117a.f11129n) {
            t(oVar, 1).N0();
        }
    }

    public static final void m(x xVar) {
        v(xVar).E();
    }

    public static final void n(y1 y1Var) {
        v(y1Var).G();
    }

    public static final boolean o(long j5) {
        return (j5 & 2) != 0;
    }

    public static final boolean p(long j5) {
        return (j5 & 1) != 0;
    }

    public static final boolean q(h0 h0Var) {
        if (h0Var.f10673g == null) {
            return false;
        }
        h0 h0VarV = h0Var.v();
        return (h0VarV != null ? h0VarV.f10673g : null) == null || h0Var.F.f10730b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(r1.o oVar, h9.a aVar) {
        m1 m1Var = oVar.f11123g;
        if (m1Var == null) {
            m1Var = new m1((l1) oVar);
            oVar.f11123g = m1Var;
        }
        ((r2.u) w(oVar)).getSnapshotObserver().a(m1Var, e.f10626f, aVar);
    }

    public static final void s(l lVar) {
        s1.c cVar;
        h0 h0VarV = v(lVar);
        if (h0VarV.f10684s) {
            return;
        }
        r2.u uVar = (r2.u) k0.a(h0VarV);
        if (!r2.u.l() || (cVar = uVar.F) == null) {
            return;
        }
        cVar.f12543d.f15694a.i(h0VarV.f10668b, new s1.b(cVar, h0VarV));
    }

    public static final h1 t(l lVar, int i7) {
        h1 h1Var = ((r1.o) lVar).f11117a.f11124h;
        i9.l.b(h1Var);
        if (h1Var.G0() != lVar || !i1.g(i7)) {
            return h1Var;
        }
        h1 h1Var2 = h1Var.f10693p;
        i9.l.b(h1Var2);
        return h1Var2;
    }

    public static final h1 u(l lVar) {
        if (!((r1.o) lVar).f11117a.f11129n) {
            n2.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        h1 h1VarT = t(lVar, 2);
        if (!h1VarT.G0().f11129n) {
            n2.a.b("LayoutCoordinates is not attached.");
        }
        return h1VarT;
    }

    public static final h0 v(l lVar) {
        h1 h1Var = ((r1.o) lVar).f11117a.f11124h;
        if (h1Var != null) {
            return h1Var.f10692o;
        }
        throw ob.a.o("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final q1 w(l lVar) {
        q1 q1Var = v(lVar).f10678m;
        if (q1Var != null) {
            return q1Var;
        }
        throw ob.a.o("This node does not have an owner.");
    }

    public static final View x(l lVar) {
        if (!((r1.o) lVar).f11117a.f11129n) {
            n2.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) k0.a(v(lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [h9.k] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void y(l lVar, Object obj, h9.k kVar) {
        d1 d1Var;
        r1.o oVar = (r1.o) lVar;
        if (!oVar.f11117a.f11129n) {
            n2.a.b("visitAncestors called on an unattached node");
        }
        r1.o oVar2 = oVar.f11117a.f11121e;
        h0 h0VarV = v(lVar);
        while (h0VarV != null) {
            if ((h0VarV.E.f10617f.f11120d & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.f11119c & 262144) != 0) {
                        ?? F = oVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof d2) {
                                d2 d2Var = (d2) F;
                                if (!(obj.equals(d2Var.k()) ? ((Boolean) kVar.invoke(d2Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((F.f11119c & 262144) != 0) && (F instanceof m)) {
                                    r1.o oVar3 = ((m) F).f10746p;
                                    int i7 = 0;
                                    while (oVar3 != null) {
                                        if ((oVar3.f11119c & 262144) != 0) {
                                            F = F;
                                            eVar = eVar;
                                            i7++;
                                            if (i7 == 1) {
                                                F = F;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F = oVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(oVar3);
                                            }
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                            F = F;
                                            eVar = eVar;
                                        }
                                        oVar3 = oVar3.f11122f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                            }
                            F = f(eVar);
                        }
                    }
                    oVar2 = oVar2.f11121e;
                }
            }
            h0VarV = h0VarV.v();
            oVar2 = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, q2.d2, q2.l] */
    /* JADX WARN: Type inference failed for: r12v0, types: [h9.k] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void z(d2 d2Var, h9.k kVar) {
        d1 d1Var;
        r1.o oVar = (r1.o) d2Var;
        if (!oVar.f11117a.f11129n) {
            n2.a.b("visitAncestors called on an unattached node");
        }
        r1.o oVar2 = oVar.f11117a.f11121e;
        h0 h0VarV = v(d2Var);
        while (h0VarV != null) {
            if ((h0VarV.E.f10617f.f11120d & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.f11119c & 262144) != 0) {
                        ?? F = oVar2;
                        ?? eVar = 0;
                        while (F != 0) {
                            boolean zBooleanValue = true;
                            if (F instanceof d2) {
                                d2 d2Var2 = (d2) F;
                                if (i9.l.a(d2Var.k(), d2Var2.k()) && d2Var.getClass() == d2Var2.getClass()) {
                                    zBooleanValue = ((Boolean) kVar.invoke(d2Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((F.f11119c & 262144) != 0) && (F instanceof m)) {
                                    r1.o oVar3 = ((m) F).f10746p;
                                    int i7 = 0;
                                    while (oVar3 != null) {
                                        if ((oVar3.f11119c & 262144) != 0) {
                                            F = F;
                                            eVar = eVar;
                                            i7++;
                                            if (i7 == 1) {
                                                F = F;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F = oVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (F != 0) {
                                                    eVar.b(F);
                                                    F = 0;
                                                }
                                                eVar.b(oVar3);
                                            }
                                        } else {
                                            F = F;
                                            eVar = eVar;
                                            F = F;
                                            eVar = eVar;
                                        }
                                        oVar3 = oVar3.f11122f;
                                        F = F;
                                        eVar = eVar;
                                    }
                                    if (i7 == 1) {
                                        F = F;
                                        eVar = eVar;
                                    } else {
                                        F = F;
                                        eVar = eVar;
                                    }
                                }
                            }
                            F = f(eVar);
                        }
                    }
                    oVar2 = oVar2.f11121e;
                }
            }
            h0VarV = h0VarV.v();
            oVar2 = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
        }
    }
}
