package q2;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f10612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f10613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f10614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f10615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f10616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r1.o f10617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h1.e f10618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h1.e f10619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1.e f10620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b1 f10621j;

    public d1(h0 h0Var) {
        this.f10612a = h0Var;
        c1 c1Var = new c1();
        c1Var.f11120d = -1;
        this.f10613b = c1Var;
        t tVar = new t(h0Var);
        this.f10614c = tVar;
        this.f10615d = tVar;
        a2 a2Var = tVar.O;
        this.f10616e = a2Var;
        this.f10617f = a2Var;
        this.f10620i = new h1.e(new r1.p[16]);
    }

    public static final void a(d1 d1Var, r1.o oVar, h1 h1Var) {
        for (r1.o oVar2 = oVar.f11121e; oVar2 != null; oVar2 = oVar2.f11121e) {
            if (oVar2 == d1Var.f10613b) {
                h0 h0VarV = d1Var.f10612a.v();
                h1Var.f10694q = h0VarV != null ? h0VarV.E.f10614c : null;
                d1Var.f10615d = h1Var;
                return;
            } else {
                if ((oVar2.f11119c & 2) != 0) {
                    return;
                }
                oVar2.z0(h1Var);
            }
        }
    }

    public static r1.o b(r1.n nVar, r1.o oVar) {
        r1.o oVarI;
        if (nVar instanceof z0) {
            oVarI = ((z0) nVar).i();
            oVarI.f11119c = i1.f(oVarI);
        } else {
            c cVar = new c();
            cVar.f11119c = i1.d(nVar);
            cVar.f10598o = nVar;
            cVar.f10600q = new HashSet();
            oVarI = cVar;
        }
        if (oVarI.f11129n) {
            n2.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        oVarI.f11125i = true;
        r1.o oVar2 = oVar.f11122f;
        if (oVar2 != null) {
            oVar2.f11121e = oVarI;
            oVarI.f11122f = oVar2;
        }
        oVar.f11122f = oVarI;
        oVarI.f11121e = oVar;
        return oVarI;
    }

    public static r1.o c(r1.o oVar) {
        boolean z10 = oVar.f11129n;
        if (z10) {
            s.c0 c0Var = i1.f10718a;
            if (!z10) {
                n2.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            i1.a(oVar, -1, 2);
            oVar.x0();
            oVar.p0();
        }
        r1.o oVar2 = oVar.f11122f;
        r1.o oVar3 = oVar.f11121e;
        if (oVar2 != null) {
            oVar2.f11121e = oVar3;
            oVar.f11122f = null;
        }
        if (oVar3 != null) {
            oVar3.f11122f = oVar2;
            oVar.f11121e = null;
        }
        i9.l.b(oVar3);
        return oVar3;
    }

    public static void h(r1.n nVar, r1.n nVar2, r1.o oVar) {
        if ((nVar instanceof z0) && (nVar2 instanceof z0)) {
            i9.l.c(oVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((z0) nVar2).j(oVar);
            if (oVar.f11129n) {
                i1.c(oVar);
                return;
            } else {
                oVar.f11126j = true;
                return;
            }
        }
        if (!(oVar instanceof c)) {
            n2.a.b("Unknown Modifier.Node type");
            return;
        }
        c cVar = (c) oVar;
        if (cVar.f11129n) {
            cVar.B0();
        }
        cVar.f10598o = nVar2;
        cVar.f11119c = i1.d(nVar2);
        if (cVar.f11129n) {
            cVar.A0(false);
        }
        if (oVar.f11129n) {
            i1.c(oVar);
        } else {
            oVar.f11126j = true;
        }
    }

    public final boolean d(int i7) {
        return (i7 & this.f10617f.f11120d) != 0;
    }

    public final void e() {
        for (r1.o oVar = this.f10617f; oVar != null; oVar = oVar.f11122f) {
            oVar.w0();
            if (oVar.f11125i) {
                s.c0 c0Var = i1.f10718a;
                if (!oVar.f11129n) {
                    n2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                i1.a(oVar, -1, 1);
            }
            if (oVar.f11126j) {
                i1.c(oVar);
            }
            oVar.f11125i = false;
            oVar.f11126j = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x013e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:76:0x018f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x019b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void f(int r32, h1.e r33, h1.e r34, r1.o r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.d1.f(int, h1.e, h1.e, r1.o, boolean):void");
    }

    public final void g() {
        h0 h0Var;
        z zVar;
        p1 p1Var;
        r1.o oVar = this.f10616e.f11121e;
        h1 h1Var = this.f10614c;
        while (true) {
            h0Var = this.f10612a;
            if (oVar == null) {
                break;
            }
            x xVarG = f.g(oVar);
            if (xVarG != null) {
                h1 h1Var2 = oVar.f11124h;
                if (h1Var2 != null) {
                    zVar = (z) h1Var2;
                    x xVar = zVar.O;
                    zVar.g1(xVarG);
                    if (xVar != oVar && (p1Var = zVar.I) != null) {
                        p1Var.invalidate();
                    }
                } else {
                    zVar = new z(h0Var, xVarG);
                    oVar.z0(zVar);
                }
                h1Var.f10694q = zVar;
                zVar.f10693p = h1Var;
                h1Var = zVar;
            } else {
                oVar.z0(h1Var);
            }
            oVar = oVar.f11121e;
        }
        h0 h0VarV = h0Var.v();
        h1Var.f10694q = h0VarV != null ? h0VarV.E.f10614c : null;
        this.f10615d = h1Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        r1.o oVar = this.f10617f;
        a2 a2Var = this.f10616e;
        if (oVar == a2Var) {
            sb2.append("]");
        } else {
            while (oVar != null && oVar != a2Var) {
                sb2.append(String.valueOf(oVar));
                if (oVar.f11122f == a2Var) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                oVar = oVar.f11122f;
            }
        }
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }
}
