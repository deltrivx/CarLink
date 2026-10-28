package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13723a;

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    public final z a(p0 p0Var) {
        y yVarL;
        y yVarL2;
        boolean z10;
        z zVarA;
        switch (this.f13723a) {
            case 0:
                return new z(p0Var.j().a(p0Var.j().f13975c), p0Var.g().a(p0Var.g().f13976d), p0Var.h() == k.f13824a);
            case 1:
                return y0.h(p0Var, b0.f13736c);
            case 2:
                return y0.h(p0Var, b0.f13735b);
            default:
                z zVarC = p0Var.c();
                if (zVarC == null) {
                    return y0.h(p0Var, b0.f13736c);
                }
                y yVar = zVarC.f14019b;
                y yVar2 = zVarC.f14018a;
                if (p0Var.a()) {
                    yVarL2 = y0.l(p0Var, p0Var.j(), yVar2);
                    yVarL = yVar;
                    yVar = yVar2;
                    yVar2 = yVarL2;
                } else {
                    yVarL = y0.l(p0Var, p0Var.g(), yVar);
                    yVarL2 = yVarL;
                }
                if (i9.l.a(yVarL2, yVar)) {
                    return zVarC;
                }
                z zVar = new z(yVar2, yVarL, p0Var.h() == k.f13824a || (p0Var.h() == k.f13826c && yVar2.f14010b > yVarL.f14010b));
                boolean z11 = false;
                y yVar3 = zVar.f14018a;
                long j5 = yVar3.f14011c;
                y yVar4 = zVar.f14019b;
                if (j5 != yVar4.f14011c) {
                    boolean z12 = zVar.f14020c;
                    if ((z12 ? yVar3 : yVar4).f14010b == 0) {
                        if (z12) {
                            yVar3 = yVar4;
                        }
                        if (p0Var.d().f13978f.f1408a.f1393a.f1353b.length() != yVar3.f14010b) {
                            z10 = false;
                        } else {
                            i9.t tVar = new i9.t();
                            tVar.f6684a = true;
                            p0Var.i(new r0(tVar, 0));
                            z10 = tVar.f6684a;
                        }
                    } else {
                        z10 = false;
                    }
                } else if (yVar3.f14010b == yVar4.f14010b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    String str = p0Var.b().f13978f.f1408a.f1393a.f1353b;
                    if (p0Var.l() <= 1 && p0Var.c() != null) {
                        if (!(str.length() == 0)) {
                            w wVarB = p0Var.b();
                            String str2 = wVarB.f13978f.f1408a.f1393a.f1353b;
                            int i7 = wVarB.f13975c;
                            int length = str2.length();
                            if (i7 == 0) {
                                int iO = l0.q0.o(0, str2);
                                zVarA = p0Var.a() ? z.a(zVar, y0.o(zVar.f14018a, wVarB, iO), null, true, 2) : z.a(zVar, null, y0.o(zVar.f14019b, wVarB, iO), false, 1);
                            } else if (i7 == length) {
                                int iR = l0.q0.r(length, str2);
                                zVarA = p0Var.a() ? z.a(zVar, y0.o(zVar.f14018a, wVarB, iR), null, false, 2) : z.a(zVar, null, y0.o(zVar.f14019b, wVarB, iR), true, 1);
                            } else {
                                z zVarC2 = p0Var.c();
                                if (zVarC2 != null && zVarC2.f14020c) {
                                    z11 = true;
                                }
                                int iR2 = p0Var.a() ^ z11 ? l0.q0.r(i7, str2) : l0.q0.o(i7, str2);
                                zVarA = p0Var.a() ? z.a(zVar, y0.o(zVar.f14018a, wVarB, iR2), null, z11, 2) : z.a(zVar, null, y0.o(zVar.f14019b, wVarB, iR2), z11, 1);
                            }
                            return zVarA;
                        }
                    }
                }
                return zVar;
        }
    }
}
